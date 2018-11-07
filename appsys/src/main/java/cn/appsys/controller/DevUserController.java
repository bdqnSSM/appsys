package cn.appsys.controller;

import cn.appsys.pojo.DevUser;
import cn.appsys.service.DevUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class DevUserController {

    @Resource(name = "devUserService")
    private DevUserService devUserService;

    /**
     * 新增
     */
    @RequestMapping("/insert")
    @ResponseBody
    public Object insert(DevUser devUser) {
        return devUserService.insert(devUser);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(int id) {
        return devUserService.delete(id);
    }

    /**
     * 更新
     */
    @RequestMapping("/update")
    @ResponseBody
    public Object update(DevUser devUser) {
        return devUserService.update(devUser);
    }
@RequestMapping("sss")
public String sdf(){
        return "developer/common/left";
}
    /**
     * Load查询
     */
    @RequestMapping("/load")
    @ResponseBody
    public Object load(int id) {
        return devUserService.load(id);
    }

    /**
     * 分页查询
     */
    @RequestMapping("/pageList")
    @ResponseBody
    public Object pageList(DevUser devUser,
                            @RequestParam(required = false, defaultValue = "0") int pageNo,
                            @RequestParam(required = false, defaultValue = "10") int pageSize) {
        return devUserService.pageList(devUser,pageNo, pageSize);
    }
}
