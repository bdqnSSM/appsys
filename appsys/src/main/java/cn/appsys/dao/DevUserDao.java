package cn.appsys.dao;

import cn.appsys.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DevUserDao {
    /**
     * 新增
     */
    public int insert(@Param("devUser") DevUser devUser);

    /**
     * 删除
     */
    public int delete(@Param("id") int id);

    /**
     * 更新
     */
    public int update(@Param("devUser") DevUser devUser);

    /**
     * Load查询
     */
    public DevUser load(@Param("id") int id);

    /**
     * 分页查询Data
     */
    public List<DevUser> pageList(@Param("devUser") DevUser devUser,
                                  @Param("pageNo") int pageNo,
                                  @Param("pageSize") int pageSize);

    /**
     * 分页查询Count
     */
    public int pageListCount(@Param("devUser") DevUser devUser);

}
