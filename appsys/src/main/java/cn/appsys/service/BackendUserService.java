package cn.appsys.service;

import cn.appsys.pojo.BackendUser;
import cn.appsys.standard.Resp;

public interface BackendUserService {
    /**
     * 新增
     */
    public Resp<Object> insert(BackendUser backendUser);

    /**
     * 删除
     */
    public Resp<Object> delete(int id);

    /**
     * 更新
     */
    public Resp<Object> update(BackendUser backendUser);

    /**
     * Load查询
     */
    public BackendUser load(int id);

    /**
     * 分页查询
     */
    public Resp<Object> pageList(BackendUser backendUser, int pageNo, int pageSize);

}
