package com.cmb.ApiEncyclopedia.dao;

import com.cmb.ApiEncyclopedia.bean.ApiDTO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by SENSETIME\yuanzhen on 19-5-31 下午1:41
 */
@Component
@Mapper
public interface ApiDao {

    /**
     * 通过名字查询用户信息
     */
    @Select("SELECT * FROM api WHERE name = #{name}")
    ApiDTO findApiByName(@Param("name") String name);

    /**
     * 查询所有用户信息
     */
    @Select("SELECT * FROM api")
    List<ApiDTO> findAllApi();

    /**
     * 插入用户信息
     */
    @Insert("INSERT INTO api(name, detail, type, department, owner) VALUES(#{name}, #{detail} , #{type}, #{department}, #{owner})")
    void insertApi(@Param("name") String name, @Param("detail") String detail, @Param("type") String type,@Param("department") String department,@Param("owner") String owner);

    /**
     * 根据 id 更新用户信息
     */
    @Update("UPDATE  api SET name = #{name},detail = #{detail},type= #{type},department= #{department},owner= #{owner} WHERE id = #{id}")
    void updateApi(@Param("name") String name, @Param("detail") String detail, @Param("type") String type,@Param("department") String department,@Param("owner") String owner,
                    @Param("id") int id);

    /**
     * 根据 id 删除用户信息
     */
    @Delete("DELETE from api WHERE id = #{id}")
    void deleteApi(@Param("id") int id);
}
