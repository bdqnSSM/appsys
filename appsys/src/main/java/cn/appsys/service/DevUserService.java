package cn.appsys.service;

import cn.appsys.pojo.DevUser;
import cn.appsys.standard.Resp;

public interface DevUserService {
    /**
     * 新增
     */
    public Resp<Object> insert(DevUser devUser);

    /**
     * 删除
     */
    public Resp<Object> delete(int id);

    /**
     * 更新
     */
    public Resp<Object> update(DevUser devUser);

    /**
     * Load查询
     */
    public DevUser load(int id);

    /**
     * 分页查询
     */
    public Resp<Object> pageList(DevUser devUser, int pageNo, int pageSize);

}
