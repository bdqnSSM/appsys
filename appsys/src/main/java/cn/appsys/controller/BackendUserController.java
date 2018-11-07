/*
package cn.appsys.controller;

import cn.appsys.pojo.BackendUser;
import cn.appsys.service.BackendUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BackendUserController {

    @Resource
    private BackendUserService backendUserService;

    */
/**
     * 新增
     *//*

    @RequestMapping("/insert")
    @ResponseBody
    public Object insert(BackendUser backendUser){
        return backendUserService.insert(backendUser);
    }

    */
/**
     * 删除
     *//*

    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(int id){
        return backendUserService.delete(id);
    }

    */
/**
     * 更新
     *//*

    @RequestMapping("/update")
    @ResponseBody
    public Object update(BackendUser backendUser){
        return backendUserService.update(backendUser);
    }

    */
/**
     * Load查询
     *//*

    @RequestMapping("/load")
    @ResponseBody
    public Object load(int id){
        return backendUserService.load(id);
    }

    */
/**
     * 分页查询
     *//*

    @RequestMapping("/pageList")
    @ResponseBody
    public Object pageList(BackendUser backendUser,
                           @RequestParam(required = false, defaultValue = "0") int pageNo,
                           @RequestParam(required = false, defaultValue = "10") int pageSize) {
        return backendUserService.pageList(backendUser,pageNo, pageSize);
    }

}

*/
