package cn.appsys.dao;

import cn.appsys.pojo.AdPromotion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdPromotionDao {
    /**
     * 新增
     */
    public int insert(@Param("adPromotion") AdPromotion adPromotion);

    /**
     * 删除
     */
    public int delete(@Param("id") int id);

    /**
     * 更新
     */
    public int update(@Param("adPromotion") AdPromotion adPromotion);

    /**
     * Load查询
     */
    public AdPromotion load(@Param("id") int id);

    /**
     * 分页查询Data
     */
    public List<AdPromotion> pageList(@Param("adPromotion") AdPromotion adPromotion,
                                      @Param("pageNo") int pageNo,
                                      @Param("pageSize") int pageSize);

    /**
     * 分页查询Count
     */
    public int pageListCount(@Param("adPromotion") AdPromotion adPromotion);
}
