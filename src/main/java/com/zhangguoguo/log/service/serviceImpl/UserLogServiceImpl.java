package com.zhangguoguo.log.service.serviceImpl;

import com.zhangguoguo.log.Dto.UserLogDto;
import com.zhangguoguo.log.VO.UserLogVo;
import com.zhangguoguo.log.controller.UserLogDao;
import com.zhangguoguo.log.service.UserLogService;
import com.zhangguoguo.log.userLog.UserLogDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLogServiceImpl implements UserLogService {

    @Autowired
    UserLogDao userLogDao;

    @Override
    public int insert(UserLogDo dto) {
        return userLogDao.insert(dto);
    }

    @Override
  public List<UserLogVo> queryUserLogList(UserLogDto dto) {
//        if(!checkDto(dto, true)){
//            throw new ProgramException("system.params.error", "参数错误");
//        }
//        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<UserLogVo> vos = userLogDao.getUserLogList(dto);
//        PageInfo<UserLogVo> pageInfo = new PageInfo<>(vos);
//        pageInfo.setPageNum(dto.getPageNum());
//        pageInfo.setPageSize(dto.getPageSize());
        return vos;
    }
    /**
     * 校验必填项
     *
     * @param dto 前端dto参数
     * @return true/false
     */
    private boolean checkDto(UserLogDto dto){
        if(dto == null || dto.getId() == null){
            return false;
        }

        return true;
    }

    /**
     * 校验必填项
     *
     * @param dto 前端dto参数
     * @return true/false
     */
//    private boolean checkDto(UserLogDto dto, boolean isPage){
//        if(dto == null){
//            return false;
//        }
//
//        if(isPage){
//            if(dto.getPageNum() == 0 || dto.getPageSize() == 0){
//                return false;
//            }
//        }
//
//
//        return true;
//    }


}