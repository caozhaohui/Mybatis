package org.taru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.taru.domel.Menu;
import org.taru.service.queryMenuService;
import org.taru.vo.JsonResult;
import java.util.List;
@RestController
public class queryMenuController  {
    @Autowired
    queryMenuService QueryMenuServiceImpl1;

    @RequestMapping("/api/querymenu")
   public JsonResult queryMenu(@RequestParam("id") String id){
       JsonResult jsonResult=null;
   try {
        List<Menu> list = QueryMenuServiceImpl1.queryMenu(id);
        if (list != null) {
            jsonResult = new JsonResult("200", "查询成功", list);
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
