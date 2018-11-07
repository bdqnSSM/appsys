/*
package cn.appsys.service.impl;

import cn.appsys.dao.BackendUserDao;
import cn.appsys.pojo.BackendUser;
import cn.appsys.service.BackendUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("backendUserService")
public class BackendUserServiceImpl implements BackendUserService {

    @Resource
    private BackendUserDao backendUserDao;

    */
/**
     * 新增
     *//*

    public ReturnT<String> insert(BackendUser backendUser) {

        // valid
        if (backendUser == null) {
            return new ReturnT<String>(ReturnT.FAIL_CODE, "必要参数缺失");
        }

        backendUserDao.insert(backendUser);
        return ReturnT.SUCCESS;
    }

    */
/**
     * 删除
     *//*

    public ReturnT<String> delete(int id) {
        int ret = backendUserDao.delete(id);
        return ret>0?ReturnT.SUCCESS:ReturnT.FAIL;
    }

    */
/**
     * 更新
     *//*

    public ReturnT<String> update(BackendUser backendUser) {
        int ret = backendUserDao.update(backendUser);
        return ret>0?ReturnT.SUCCESS:ReturnT.FAIL;
    }

    */
/**
     * Load查询
     *//*

    public BackendUser load(int id) {
        return backendUserDao.load(id);
    }

    */
/**
     * 分页查询
     *//*

    public Map<String,Object> pageList(BackendUser backendUser,int offset, int pagesize) {

        List<BackendUser> pageList = backendUserDao.pageList(offset, pagesize);
        int totalCount = backendUserDao.pageListCount(offset, pagesize);

        // result
        Map<String, Object> result = new HashMap<String, Object>();
        maps.put("pageList", pageList);
        maps.put("totalCount", totalCount);

        return result;
    }

}
*/
