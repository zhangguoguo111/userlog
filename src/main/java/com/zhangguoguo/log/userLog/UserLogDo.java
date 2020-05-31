package com.zhangguoguo.log.userLog;

public class UserLogDo {
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户姓名
     */
    private String username;
    /**
     * 用户登录ip
     */
    private String ip;
//    /**
//     * 用户操作时间
//     */
//    private String updateTime;
    /**
     * 用户操作模块
     */
    private String userModule;
    /**
     * 用户操作行为
     */
    private String userModuleType;
    /**
     * 用户操作模块参数
     */
    private String userModuleParam;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public String getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(String updateTime) {
//        this.updateTime = updateTime;
//    }

    public String getUserModule() {
        return userModule;
    }

    public void setUserModule(String userModule) {
        this.userModule = userModule;
    }

    public String getUserModuleType() {
        return userModuleType;
    }

    public void setUserModuleType(String userModuleType) {
        this.userModuleType = userModuleType;
    }

    public String getUserModuleParam() {
        return userModuleParam;
    }

    public void setUserModuleParam(String userModuleParam) {
        this.userModuleParam = userModuleParam;
    }

    public String getIp() { return ip; }

    public void setIp(String ip) { this.ip = ip; }
}
