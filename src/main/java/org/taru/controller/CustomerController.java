package org.taru.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.taru.domel.Customer;
import org.taru.domel.Menu;
import org.taru.service.CustomerService;
import org.taru.vo.JsonResult;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService CustomerServiceImpl;
    @RequestMapping("/api/customer")
    public JsonResult queryMenu(){
        JsonResult jsonResult=null;
        try {
            PageHelper.startPage(1 , 5);
            List<Customer> list = CustomerServiceImpl.querycustomer();
            PageInfo<Customer> personPageInfo = new PageInfo<>(list);
            if (list != null) {
                jsonResult = new JsonResult("200", "查询成功", personPageInfo);
            } else {
                jsonResult = new JsonResult("404", "查询失败", "");
            }
        } catch (Exception e) {
            e.getStackTrace();
            jsonResult = new JsonResult("500", "数据错误", "");
        }
        return jsonResult;
    }

}
