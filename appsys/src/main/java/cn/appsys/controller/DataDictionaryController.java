/*
package cn.appsys.controller;

import cn.appsys.pojo.DataDictionary;
import cn.appsys.service.DataDictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
@Controller
public class DataDictionaryController {

    @Resource
    private DataDictionaryService dataDictionaryService;

    */
/**
     * 新增
     *//*

    @RequestMapping("/insert")
    @ResponseBody
    public Object insert(DataDictionary dataDictionary){
        return dataDictionaryService.insert(dataDictionary);
    }

    */
/**
     * 删除
     *//*

    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(int id){
        return dataDictionaryService.delete(id);
    }

    */
/**
     * 更新
     *//*

    @RequestMapping("/update")
    @ResponseBody
    public Object update(DataDictionary dataDictionary){
        return dataDictionaryService.update(dataDictionary);
    }

    */
/**
     * Load查询
     *//*

    @RequestMapping("/load")
    @ResponseBody
    public Object load(int id){
        return dataDictionaryService.load(id);
    }

    */
/**
     * 分页查询
     *//*

    @RequestMapping("/pageList")
    @ResponseBody
    public Object pageList(@RequestParam(required = false, defaultValue = "0") int offset,
                                        @RequestParam(required = false, defaultValue = "10") int pagesize) {
        return dataDictionaryService.pageList(offset, pagesize);
    }

}
*/
