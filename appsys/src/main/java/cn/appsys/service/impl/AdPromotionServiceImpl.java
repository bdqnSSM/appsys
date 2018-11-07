/*
package cn.appsys.service.impl;

import cn.appsys.dao.AdPromotionDao;
import cn.appsys.pojo.AdPromotion;
import cn.appsys.service.AdPromotionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("adPromotionService")
public class AdPromotionServiceImpl implements AdPromotionService {

    @Resource
    private AdPromotionDao adPromotionDao;

    */
/**
     * 新增
     *//*

    public ReturnT<String> insert(AdPromotion adPromotion) {

        // valid
        if (adPromotion == null) {
            return new ReturnT<String>(ReturnT.FAIL_CODE, "必要参数缺失");
        }

        adPromotionDao.insert(adPromotion);
        return ReturnT.SUCCESS;
    }

    */
/**
     * 删除
     *//*

    public ReturnT<String> delete(int id) {
        int ret = adPromotionDao.delete(id);
        return ret > 0 ? ReturnT.SUCCESS : ReturnT.FAIL;
    }

    */
/**
     * 更新
     *//*

    public ReturnT<String> update(AdPromotion adPromotion) {
        int ret = adPromotionDao.update(adPromotion);
        return ret > 0 ? ReturnT.SUCCESS : ReturnT.FAIL;
    }

    */
/**
     * Load查询
     *//*

    public AdPromotion load(int id) {
        return adPromotionDao.load(id);
    }

    */
/**
     * 分页查询
     *//*

    public Map<String, Object> pageList(int offset, int pagesize) {

        List<AdPromotion> pageList = adPromotionDao.pageList(offset, pagesize);
        int totalCount = adPromotionDao.pageListCount(offset, pagesize);

        // result
        Map<String, Object> result = new HashMap<String, Object>();
        maps.put("pageList", pageList);
        maps.put("totalCount", totalCount);

        return result;
    }
}
*/
