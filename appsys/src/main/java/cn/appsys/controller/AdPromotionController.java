/*
package cn.appsys.controller;

import cn.appsys.pojo.AdPromotion;
import cn.appsys.service.AdPromotionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class AdPromotionController {

    @Resource
    private AdPromotionService adPromotionService;

    */
/**
     * 新增
     *//*

    @RequestMapping("/insert")
    @ResponseBody
    public ReturnT<String> insert(AdPromotion adPromotion){
        return adPromotionService.insert(adPromotion);
    }

    */
/**
     * 删除
     *//*

    @RequestMapping("/delete")
    @ResponseBody
    public ReturnT<String> delete(int id){
        return adPromotionService.delete(id);
    }

    */
/**
     * 更新
     *//*

    @RequestMapping("/update")
    @ResponseBody
    public ReturnT<String> update(AdPromotion adPromotion){
        return adPromotionService.update(adPromotion);
    }

    */
/**
     * Load查询
     *//*

    @RequestMapping("/load")
    @ResponseBody
    public ReturnT<String> load(int id){
        return adPromotionService.load(id);
    }

    */
/**
     * 分页查询
     *//*

    @RequestMapping("/pageList")
    @ResponseBody
    public Map<String, Object> pageList(@RequestParam(required = false, defaultValue = "0") int offset,
                                        @RequestParam(required = false, defaultValue = "10") int pagesize) {
        return adPromotionService.pageList(offset, pagesize);
    }

}

*/
