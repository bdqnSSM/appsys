package cn.appsys.service;

import cn.appsys.pojo.AdPromotion;
import cn.appsys.pojo.Pager;
import cn.appsys.standard.Resp;

public interface AdPromotionService {
    /**
     * 新增
     */
    public Resp<Object> insert(AdPromotion adPromotion);

    /**
     * 删除
     */
    public Resp<Object> delete(int id);

    /**
     * 更新
     */
    public Resp<Object> update(AdPromotion adPromotion);

    /**
     * Load查询
     */
    public AdPromotion load(int id);

    /**
     * 分页查询
     */
    public Pager<AdPromotion> pageList(AdPromotion adPromotion, int pageNo, int pageSize);
}
