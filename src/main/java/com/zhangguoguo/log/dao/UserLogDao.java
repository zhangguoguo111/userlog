package com.zhangguoguo.log.dao;


import com.zhangguoguo.log.Dto.UserLogDto;
import com.zhangguoguo.log.VO.UserLogVo;
import com.zhangguoguo.log.userLog.UserLogDo;


import java.util.List;

/**
 * 用户日志模块dao层接口
 *
 * @author lixingao 2020-05-27 14:24
 */

public interface UserLogDao {



   Integer insert(UserLogDo dto);


   List<UserLogVo> getUserLogList(UserLogDto dto);

}
