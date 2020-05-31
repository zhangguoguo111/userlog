package com.zhangguoguo.log.service;



import com.zhangguoguo.log.Dto.UserLogDto;
import com.zhangguoguo.log.VO.UserLogVo;
import com.zhangguoguo.log.userLog.UserLogDo;

import java.util.List;

/**
 * 平台用户日志管理模块Service层接口
 *
 * @author lixingao 2020.5.27
 */

public interface UserLogService {

    /**
     * 用户日志切面插入
     * @param dto
     * */
    int insert(UserLogDo dto);

    /**
     * 用户日志分页查询
     * @param dto
     * @return 分页列表
     * */
    List<UserLogVo> queryUserLogList(UserLogDto dto);




 }
