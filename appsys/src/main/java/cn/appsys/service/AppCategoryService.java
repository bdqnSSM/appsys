package cn.appsys.service;

import cn.appsys.pojo.AppCategory;
import cn.appsys.pojo.Pager;
import cn.appsys.standard.Resp;

public interface AppCategoryService {
    /**
     * 新增
     */
    public Resp<Object> insert(AppCategory appCategory);

    /**
     * 删除
     */
    public Resp<Object> delete(int id);

    /**
     * 更新
     */
    public Resp<Object> update(AppCategory appCategory);

    /**
     * Load查询
     */
    public AppCategory load(int id);

    /**
     * 分页查询
     */
    public Pager<AppCategory> pageList(AppCategory appCategory, int pageNo, int pageSize);

}
