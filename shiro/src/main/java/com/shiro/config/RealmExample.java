package com.shiro.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashMap;
import java.util.Map;

public class RealmExample extends AuthorizingRealm {
    private static Map<String, String> userMap = new HashMap();

    private static Map<String, String> roleMap = new HashMap();

    private static Map<String, String> permissionMap = new HashMap();

    static {
        userMap.put("wulududu", "123456");
        userMap.put("cake", "111111");

        roleMap.put("wulududu", "admin");
        roleMap.put("cake", "guest");

        permissionMap.put("admin", "*");
        permissionMap.put("guest", "query");
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        String username = (String) principalCollection.getPrimaryPrincipal();
        String role = roleMap.get(username);
        info.addRole(role);
        String permission = permissionMap.get(role);
        info.addStringPermission(permission);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        String password = userMap.get(username);
        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
