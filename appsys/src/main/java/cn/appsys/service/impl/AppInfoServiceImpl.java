/*
package cn.appsys.service.impl;

import cn.appsys.dao.AppInfoDao;
import cn.appsys.service.AppInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service("appInfoService")
public class AppInfoServiceImpl implements AppInfoService {

    @Resource
    private AppInfoDao appInfoDao;

    */
/**
     * 新增
     *//*

    public ReturnT<String> insert(AppInfo appInfo) {

        // valid
        if (appInfo == null) {
            return new ReturnT<String>(ReturnT.FAIL_CODE, "必要参数缺失");
        }

        appInfoDao.insert(appInfo);
        return ReturnT.SUCCESS;
    }

    */
/**
     * 删除
     *//*

    public ReturnT<String> delete(int id) {
        int ret = appInfoDao.delete(id);
        return ret>0?ReturnT.SUCCESS:ReturnT.FAIL;
    }

    */
/**
     * 更新
     *//*

    public ReturnT<String> update(AppInfo appInfo) {
        int ret = appInfoDao.update(appInfo);
        return ret>0?ReturnT.SUCCESS:ReturnT.FAIL;
    }

    */
/**
     * Load查询
     *//*

    public AppInfo load(int id) {
        return appInfoDao.load(id);
    }

    */
/**
     * 分页查询
     *//*

    public Map<String,Object> pageList(int offset, int pagesize) {

        List<AppInfo> pageList = appInfoDao.pageList(offset, pagesize);
        int totalCount = appInfoDao.pageListCount(offset, pagesize);

        // result
        Map<String, Object> result = new HashMap<String, Object>();
        maps.put("pageList", pageList);
        maps.put("totalCount", totalCount);

        return result;
    }
}
*/
