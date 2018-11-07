package cn.appsys.service;

import cn.appsys.pojo.AppVersion;
import cn.appsys.standard.Resp;

public interface AppVersionService {
    /**
     * 新增
     */
    public Resp<Object> insert(AppVersion appVersion);

    /**
     * 删除
     */
    public Resp<Object> delete(int id);

    /**
     * 更新
     */
    public Resp<Object> update(AppVersion appVersion);

    /**
     * Load查询
     */
    public AppVersion load(int id);

    /**
     * 分页查询
     */
    public Resp<Object> pageList(AppVersion appVersion,int pageNo, int pageSize);
}
