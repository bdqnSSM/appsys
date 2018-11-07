package cn.appsys.dao;

import cn.appsys.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackendUserDao {
    /**
     * 新增
     */
    public int insert(@Param("backendUser") BackendUser backendUser);

    /**
     * 删除
     */
    public int delete(@Param("id") int id);

    /**
     * 更新
     */
    public int update(@Param("backendUser") BackendUser backendUser);

    /**
     * Load查询
     */
    public BackendUser load(@Param("id") int id);

    /**
     * 分页查询Data
     */
    public List<BackendUser> pageList(@Param("backendUser") BackendUser backendUser,
                                      @Param("pageNo") int pageNo,
                                      @Param("pageSize") int pageSize);

    /**
     * 分页查询Count
     */
    public int pageListCount(@Param("backendUser") BackendUser backendUser);

}
