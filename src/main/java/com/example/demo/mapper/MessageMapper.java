package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Message;
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
public interface MessageMapper extends MyMapper<Message> {
    List<Message> list();

    int count();
}
