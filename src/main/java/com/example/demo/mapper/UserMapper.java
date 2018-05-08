package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.User;
import com.example.demo.util.MyMapper;


/**
 * @author zhangyd
 * @version V1.0
 * @Description
 * @date 2017年3月10日 下午2:42:45
 * @modify
 * @Review
 * @since JDK ： 1.7
 */
//@Repository
@Mapper
public interface UserMapper extends MyMapper<User> {
    @Select("SELECT user_id as userId,user_name as userName,add_time as addTime,pwd,user_cust_id as userCustId,real_name as realName FROM rd_user")
    List<User> list();
    @Select("SELECT COUNT(user_id) FROM rd_user")
    int count();

}
