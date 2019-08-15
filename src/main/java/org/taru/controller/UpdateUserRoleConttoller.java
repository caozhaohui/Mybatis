package org.taru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.taru.service.UpdateUserRoleSerivce;
        import org.taru.vo.JsonResult;

@RestController
public class UpdateUserRoleConttoller {
    @Autowired
    UpdateUserRoleSerivce UpdateUserRoleSerivceImpl;
    @RequestMapping("/api/update")
    public JsonResult UpdateUserRole(String roleid,String userid){
        JsonResult jsonResult=null;
        try{
            int i=UpdateUserRoleSerivceImpl.updateUserRole(roleid, userid);
            if (i>0){
                jsonResult =new JsonResult("200", "更新成功", "");
            }else {
                jsonResult=new JsonResult("400","更新失敗" , "");
            }
        }catch (Exception e){
            e.printStackTrace();
            jsonResult=new JsonResult("500", "更新异常", e.getMessage());
        }
        return jsonResult;
    }

}
