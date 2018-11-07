package cn.appsys.service;

import cn.appsys.pojo.DataDictionary;
import cn.appsys.pojo.Pager;
import cn.appsys.standard.Resp;

public interface DataDictionaryService {
    /**
     * 新增
     */
    public Resp<Object> insert(DataDictionary dataDictionary);

    /**
     * 删除
     */
    public Resp<Object> delete(int id);

    /**
     * 更新
     */
    public Resp<Object> update(DataDictionary dataDictionary);

    /**
     * Load查询
     */
    public DataDictionary load(int id);

    /**
     * 分页查询
     */
    public Resp<Object> pageList(DataDictionary dataDictionary, int pageNo, int pageSize);

}
