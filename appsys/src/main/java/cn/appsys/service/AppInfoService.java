package cn.appsys.service;

import cn.appsys.pojo.AppInfo;
import cn.appsys.standard.Resp;

public interface AppInfoService {
    /**
     * 新增
     */
    public Resp<Object> insert(AppInfo appInfo);

    /**
     * 删除
     */
    public Resp<Object> delete(int id);

    /**
     * 更新
     */
    public Resp<Object> update(AppInfo appInfo);

    /**
     * Load查询
     */
    public AppInfo load(int id);

    /**
     * 分页查询
     */
    public Resp<Object> pageList(AppInfo appInfo,int pageNo, int pageSize);

}
