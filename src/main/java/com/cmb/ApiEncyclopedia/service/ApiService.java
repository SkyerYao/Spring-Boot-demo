package com.cmb.ApiEncyclopedia.service;

import com.cmb.ApiEncyclopedia.bean.ApiDTO;
import com.cmb.ApiEncyclopedia.dao.ApiDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SENSETIME\yuanzhen on 19-5-31 下午1:50
 */
@Service
public class ApiService {

    @Autowired
    private ApiDao apiDao;

    /**
     * 根据名字查找用户
     */
    public ApiDTO selectApiByName(String name) {
        return apiDao.findApiByName(name);
    }

    /**
     * 查找所有用户
     */
    public List<ApiDTO> selectAllUser() {
        return apiDao.findAllApi();
    }

    /**
     * 插入接口
     */
    public void insertService() {

        // TODO: 19-5-31 构造数据
        for (int i=0;i<100;i++){
            apiDao.insertApi("get","获取数据","JDN","网上银行２室","老妖");
        }

    }

    /**
     * 根据id 删除用户
     */

    public void deleteService(int id) {
        apiDao.deleteApi(id);
    }
}
