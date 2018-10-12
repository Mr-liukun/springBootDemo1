package com.liukun.controller;

import com.liukun.entity.User;
import com.liukun.service.UserService;
import com.mangofactory.swagger.models.dto.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/one")
public class ControllerOne {

    @Autowired
    private UserService userService;

    @RequestMapping("/fun")
    public  String fun(){
        return "demo";
    }


    /*
        根据id查询用户
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody User list(@PathVariable("id") String id){
        Integer sid  = Integer.valueOf(id);
        System.out.println(sid);
        User list = userService.findUserById(sid);
        return list;
    }
    /*
        根据id删除用户
    */
   @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public @ResponseBody String deleteUserById(@PathVariable("id") Integer id,@RequestParam(value = "name",required = true) String name){
       userService.deleteUserById(id);
       return "删除了";
    }

    /*
        根据id更新用户姓名
     */

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public @ResponseBody String update(@PathVariable("id") Integer id,@RequestParam(value = "name") String name){

        userService.updateUserNameById(id,name);
        return id+" "+name;
    }

}
