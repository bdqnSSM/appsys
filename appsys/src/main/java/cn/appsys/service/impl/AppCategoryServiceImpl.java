/*
package cn.appsys.service.impl;

import cn.appsys.dao.AppCategoryDao;
import cn.appsys.pojo.AppCategory;
import cn.appsys.service.AppCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("appCategoryService")
public class AppCategoryServiceImpl implements AppCategoryService {

    @Resource
    private AppCategoryDao appCategoryDao;

    */
/**
     * 新增
     *//*

    public ReturnT<String> insert(AppCategory appCategory) {

        // valid
        if (appCategory == null) {
            return new ReturnT<String>(ReturnT.FAIL_CODE, "必要参数缺失");
        }

        appCategoryDao.insert(appCategory);
        return ReturnT.SUCCESS;
    }

    */
/**
     * 删除
     *//*

    public ReturnT<String> delete(int id) {
        int ret = appCategoryDao.delete(id);
        return ret > 0 ? ReturnT.SUCCESS : ReturnT.FAIL;
    }

    */
/**
     * 更新
     *//*

    public ReturnT<String> update(AppCategory appCategory) {
        int ret = appCategoryDao.update(appCategory);
        return ret > 0 ? ReturnT.SUCCESS : ReturnT.FAIL;
    }

    */
/**
     * Load查询
     *//*

    public AppCategory load(int id) {
        return appCategoryDao.load(id);
    }

    */
/**
     * 分页查询
     *//*

    public Map<String, Object> pageList(int offset, int pagesize) {

        List<AppCategory> pageList = appCategoryDao.pageList(offset, pagesize);
        int totalCount = appCategoryDao.pageListCount(offset, pagesize);

        // result
        Map<String, Object> result = new HashMap<String, Object>();
        maps.put("pageList", pageList);
        maps.put("totalCount", totalCount);

        return result;
    }
}
*/
