/*
package cn.appsys.controller;

import cn.appsys.pojo.AppCategory;
import cn.appsys.service.AppCategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class AppCategoryController {

    @Resource
    private AppCategoryService appCategoryService;

    */
/**
     * 新增
     *//*

    @RequestMapping("/insert")
    @ResponseBody
    public ReturnT<String> insert(AppCategory appCategory){
        return appCategoryService.insert(appCategory);
    }

    */
/**
     * 删除
     *//*

    @RequestMapping("/delete")
    @ResponseBody
    public ReturnT<String> delete(int id){
        return appCategoryService.delete(id);
    }

    */
/**
     * 更新
     *//*

    @RequestMapping("/update")
    @ResponseBody
    public ReturnT<String> update(AppCategory appCategory){
        return appCategoryService.update(appCategory);
    }

    */
/**
     * Load查询
     *//*

    @RequestMapping("/load")
    @ResponseBody
    public ReturnT<String> load(int id){
        return appCategoryService.load(id);
    }

    */
/**
     * 分页查询
     *//*

    @RequestMapping("/pageList")
    @ResponseBody
    public Map<String, Object> pageList(@RequestParam(required = false, defaultValue = "0") int offset,
                                        @RequestParam(required = false, defaultValue = "10") int pagesize) {
        return appCategoryService.pageList(offset, pagesize);
    }

}

*/
