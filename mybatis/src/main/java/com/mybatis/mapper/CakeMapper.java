package com.mybatis.mapper;

import com.mybatis.entity.Cake;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CakeMapper {
    @Select("select * from cake")
    List<Cake> queryCakes();

    @Insert("insert into cake(name, price, taste) " +
            "values(#{name}, #{price}, #{taste})")
    void insertCake(Cake cake);

    @Delete("delete from cake where name = #{name}")
    void deleteCake(String name);
}
