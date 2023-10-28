package com.atguigu.service;

import com.atguigu.pojo.Headline;
import com.atguigu.pojo.vo.PortalVo;
import com.atguigu.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author haerker
* @description 针对表【news_headline】的数据库操作Service
* @createDate 2023-10-25 17:10:40
*/
public interface HeadlineService extends IService<Headline> {

    Result findNewsPage(PortalVo portalVo);

    Result showHeadlineDetail(Integer hid);


    Result publish(Headline headline, String token);

    Result updateData(Headline headline);
}
