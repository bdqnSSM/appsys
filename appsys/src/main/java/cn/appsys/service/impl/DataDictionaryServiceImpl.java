/*
package cn.appsys.service.impl;

import cn.appsys.dao.DataDictionaryDao;
import cn.appsys.pojo.DataDictionary;
import cn.appsys.service.DataDictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service("dataDictionaryService")
public class DataDictionaryServiceImpl implements DataDictionaryService {
    @Resource
    private DataDictionaryDao dataDictionaryDao;

    */
/**
     * 新增
     *//*

    public String insert(DataDictionary dataDictionary) {

        // valid
        if (dataDictionary == null) {
            return new ReturnT<String>(ReturnT.FAIL_CODE, "必要参数缺失");
        }

        dataDictionaryDao.insert(dataDictionary);
        return ReturnT.SUCCESS;
    }

    */
/**
     * 删除
     *//*


    public String delete(int id) {
        int ret = dataDictionaryDao.delete(id);
        return ret>0?ReturnT.SUCCESS:ReturnT.FAIL;
    }

    */
/**
     * 更新
     *//*


    public ReturnT<String> update(DataDictionary dataDictionary) {
        int ret = dataDictionaryDao.update(dataDictionary);
        return ret>0?ReturnT.SUCCESS:ReturnT.FAIL;
    }

    */
/**
     * Load查询
     *//*


    public DataDictionary load(int id) {
        return dataDictionaryDao.load(id);
    }

    */
/**
     * 分页查询
     *//*


    public Map<String,Object> pageList(int offset, int pageSize) {

        List<DataDictionary> pageList = dataDictionaryDao.pageList(offset, pageSize);
        int totalCount = dataDictionaryDao.pageListCount(offset, pageSize);

        // result
        Map<String, Object> result = new HashMap<String, Object>();
        maps.put("pageList", pageList);
        maps.put("totalCount", totalCount);
        return result;
    }

}
*/
