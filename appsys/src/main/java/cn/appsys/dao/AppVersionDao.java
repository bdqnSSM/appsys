package cn.appsys.dao;

import cn.appsys.pojo.AppVersion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppVersionDao {
    /**
     * 新增
     */
    public int insert(@Param("appVersion") AppVersion appVersion);

    /**
     * 删除
     */
    public int delete(@Param("id") int id);

    /**
     * 更新
     */
    public int update(@Param("appVersion") AppVersion appVersion);

    /**
     * Load查询
     */
    public AppVersion load(@Param("id") int id);

    /**
     * 分页查询Data
     */
    public List<AppVersion> pageList(@Param("appVersion") AppVersion appVersion,
                                     @Param("pageNo") int pageNo,
                                     @Param("pageSize") int pageSize);

    /**
     * 分页查询Count
     */
    public int pageListCount(@Param("appVersion") AppVersion appVersion);

}
