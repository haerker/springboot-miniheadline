package com.atguigu.service;

import com.atguigu.pojo.Type;
import com.atguigu.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author haerker
* @description 针对表【news_type】的数据库操作Service
* @createDate 2023-10-25 17:10:40
*/
public interface TypeService extends IService<Type> {

    Result findAllTypes();
}
