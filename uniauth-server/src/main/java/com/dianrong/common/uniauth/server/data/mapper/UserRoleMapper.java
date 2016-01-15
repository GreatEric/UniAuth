package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.UserRoleExample;
import com.dianrong.common.uniauth.server.data.entity.UserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int countByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int deleteByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int deleteByPrimaryKey(UserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int insert(UserRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int insertSelective(UserRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    List<UserRoleKey> selectByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int updateByExampleSelective(@Param("record") UserRoleKey record, @Param("example") UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int updateByExample(@Param("record") UserRoleKey record, @Param("example") UserRoleExample example);
}