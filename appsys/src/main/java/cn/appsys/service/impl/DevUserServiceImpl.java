package cn.appsys.service.impl;

import cn.appsys.dao.DevUserDao;
import cn.appsys.pojo.DevUser;
import cn.appsys.pojo.Pager;
import cn.appsys.service.DevUserService;
import cn.appsys.standard.Resp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("devUserService")
public class DevUserServiceImpl implements DevUserService {

    @Resource
    private DevUserDao devUserDao;


    /**
     * 新增
     */
    public Resp<Object> insert(DevUser devUser) {
        Resp<Object> resp = new Resp<Object>();
        if(devUser==null){
            resp.setMessage("不能为空值");
            resp.setStatus(-1);
        }else {
            devUserDao.insert(devUser);
            resp.getStatus();
        }
        return resp;
    }

    /**
     * 删除
     */
    public Resp<Object> delete(int id) {
        Resp<Object> resp = new Resp<Object>();
        if(devUserDao.delete(id)>0){
            resp.getStatus();
        }
        return resp;
    }

    /**
     * 更新
     */
    public Resp<Object> update(DevUser devUser) {
        Resp<Object> resp = new Resp<Object>();
        if(devUserDao.update(devUser)>0){
            resp.getStatus();
        }
        return resp;
    }

    /**
     * Load查询
     */
    public DevUser load(int id) {
        return devUserDao.load(id);
    }

    /**
     * 分页查询
     */
    public Resp<Object> pageList(DevUser devUser, int pageNo, int pageSize) {
        Resp<Object> resp = new Resp<Object>();
        Pager<DevUser> pager = new Pager<DevUser>();
        pager.setPageNo(pageNo);
        pager.setPageSize(pageSize);
        pager.setTotalCount(devUserDao.pageListCount(devUser));
        pager.setTotalPager((pager.getTotalCount()+pageSize-1)/pageSize);
        List<DevUser> list = devUserDao.pageList(devUser,(pageNo-1)*pageSize,pageSize);
        pager.setData(list);
        resp.setData(pager.getData());
        return resp;
    }
}
