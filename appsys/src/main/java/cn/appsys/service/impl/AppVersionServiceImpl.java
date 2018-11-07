/*
package cn.appsys.service.impl;

import cn.appsys.dao.AppVersionDao;
import cn.appsys.pojo.AppVersion;
import cn.appsys.service.AppVersionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("appVersionService")
public class AppVersionServiceImpl implements AppVersionService {

    @Resource
    private AppVersionDao appVersionDao;

    */
/**
     * 新增
     *//*

    public ReturnT<String> insert(AppVersion appVersion) {

        // valid
        if (appVersion == null) {
            return new ReturnT<String>(ReturnT.FAIL_CODE, "必要参数缺失");
        }

        appVersionDao.insert(appVersion);
        return ReturnT.SUCCESS;
    }

    */
/**
     * 删除
     *//*

    public ReturnT<String> delete(int id) {
        int ret = appVersionDao.delete(id);
        return ret>0?ReturnT.SUCCESS:ReturnT.FAIL;
    }

    */
/**
     * 更新
     *//*

    public ReturnT<String> update(AppVersion appVersion) {
        int ret = appVersionDao.update(appVersion);
        return ret>0?ReturnT.SUCCESS:ReturnT.FAIL;
    }

    */
/**
     * Load查询
     *//*

    public AppVersion load(int id) {
        return appVersionDao.load(id);
    }

    */
/**
     * 分页查询
     *//*

    public Map<String,Object> pageList(int offset, int pagesize) {

        List<AppVersion> pageList = appVersionDao.pageList(offset, pagesize);
        int totalCount = appVersionDao.pageListCount(offset, pagesize);

        // result
        Map<String, Object> result = new HashMap<String, Object>();
        maps.put("pageList", pageList);
        maps.put("totalCount", totalCount);

        return result;
    }

}

*/
