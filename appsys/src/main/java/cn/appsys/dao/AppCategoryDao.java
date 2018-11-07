package cn.appsys.dao;

import cn.appsys.pojo.AppCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppCategoryDao {
    /**
     * 新增
     */
    public int insert(@Param("appCategory") AppCategory appCategory);

    /**
     * 删除
     */
    public int delete(@Param("id") int id);

    /**
     * 更新
     */
    public int update(@Param("appCategory") AppCategory appCategory);

    /**
     * Load查询
     */
    public AppCategory load(@Param("id") int id);

    /**
     * 分页查询Data
     */
    public List<AppCategory> pageList(@Param("appCategory") AppCategory appCategory,
                                      @Param("pageNO") int pageNO,
                                      @Param("pageSize") int pageSize);

    /**
     * 分页查询Count
     */
    public int pageListCount(@Param("appCategory") AppCategory appCategory);

}
