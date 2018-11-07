package cn.appsys.dao;

import cn.appsys.pojo.AppInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppInfoDao {
    /**
     * 新增
     */
    public int insert(@Param("appInfo") AppInfo appInfo);

    /**
     * 删除
     */
    public int delete(@Param("id") int id);

    /**
     * 更新
     */
    public int update(@Param("appInfo") AppInfo appInfo);

    /**
     * Load查询
     */
    public AppInfo load(@Param("id") int id);

    /**
     * 分页查询Data
     */
    public List<AppInfo> pageList(@Param("appInfo") AppInfo appInfo,
                                  @Param("pageNo") int pageNo,
                                  @Param("pageSize") int pageSize);

    /**
     * 分页查询Count
     */
    public int pageListCount(@Param("appInfo") AppInfo appInfo);
}
