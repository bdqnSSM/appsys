package cn.appsys.dao;

import cn.appsys.pojo.DataDictionary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataDictionaryDao {
    /**
     * 新增
     */
    public int insert(@Param("dataDictionary") DataDictionary dataDictionary);

    /**
     * 删除
     */
    public int delete(@Param("id") int id);

    /**
     * 更新
     */
    public int update(@Param("dataDictionary") DataDictionary dataDictionary);

    /**
     * Load查询
     */
    public DataDictionary load(@Param("id") int id);

    /**
     * 分页查询Data
     */
    public List<DataDictionary> pageList(@Param("dataDictionary") DataDictionary dataDictionary,
                                         @Param("pageNo") int pageNo,
                                         @Param("pageSize") int pageSize);

    /**
     * 分页查询Count
     */
    public int pageListCount(@Param("dataDictionary") DataDictionary dataDictionary);

}
