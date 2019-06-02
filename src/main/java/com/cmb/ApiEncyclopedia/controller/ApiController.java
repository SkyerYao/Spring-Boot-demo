package com.cmb.ApiEncyclopedia.controller;

import com.cmb.ApiEncyclopedia.bean.ApiDTO;
import com.cmb.ApiEncyclopedia.rest.RestResponse;
import com.cmb.ApiEncyclopedia.service.ApiService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by SENSETIME\yuanzhen on 19-5-31 上午10:54
 */

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private ApiService apiService;


    //带分页查询
    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    public RestResponse queryAll( @RequestParam(value = "pageNum", required = false, defaultValue="1") Integer pageNum,
                                    @RequestParam(value = "pageSize", required = false, defaultValue="5") Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        // 返回查询到的所有用户，类别为ApiDTO
        List<ApiDTO> apiDTOS = apiService.selectAllUser();

        RestResponse<ApiDTO> response = new RestResponse(apiDTOS);
        response.setTotal(apiDTOS.size());
        return response;
    }

    @RequestMapping("/query")
    public ApiDTO testQuery() {
        return apiService.selectApiByName("get");
    }

    @RequestMapping("/insert")
    public List<ApiDTO> testInsert() {
        apiService.insertService();
        return apiService.selectAllUser();
    }

    @RequestMapping("/delete")
    public String testDelete() {
        apiService.deleteService(1);
        return "OK";
    }

}
