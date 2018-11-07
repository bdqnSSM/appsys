/*
package cn.appsys.controller;

import cn.appsys.pojo.AppVersion;
import cn.appsys.service.AppVersionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class AppVersionController {

    @Resource(name = "appVersionService")
    private AppVersionService appVersionService;

    */
/**
     * 新增
     *//*

    @RequestMapping("/insert")
    @ResponseBody
    public Object insert(AppVersion appVersion){
        return appVersionService.insert(appVersion);
    }

    */
/**
     * 删除
     *//*

    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(int id){
        return appVersionService.delete(id);
    }

    */
/**
     * 更新
     *//*

    @RequestMapping("/update")
    @ResponseBody
    public Object update(AppVersion appVersion){
        return appVersionService.update(appVersion);
    }

    */
/**
     * Load查询
     *//*

    @RequestMapping("/load")
    @ResponseBody
    public Object load(int id){
        return appVersionService.load(id);
    }

    */
/**
     * 分页查询
     *//*

    @RequestMapping("/pageList")
    @ResponseBody
    public Object pageList(AppVersion appVersion,
                           @RequestParam(required = false, defaultValue = "0") int offset,
                                        @RequestParam(required = false, defaultValue = "10") int pagesize) {
        return appVersionService.pageList(appVersion,offset, pagesize);
    }

}

*/
