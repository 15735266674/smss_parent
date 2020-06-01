package cn.gov.bjtzh.smss.middle.controller;

import cn.gov.bjtzh.smss.middle.common.Result;
import cn.gov.bjtzh.smss.middle.entity.po.User;
import cn.gov.bjtzh.smss.middle.service.UserTestService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api("接口测试")
@RestController
@ResponseBody
@RequestMapping("/api")
public class UserTestController {
    @Autowired
    private UserTestService userTestService;
    @ApiOperation("获取用户")
    @GetMapping("/getUser")
    @ResponseBody
    public Result getUserList(){

        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();

        List<User> users = userTestService.getUserList();
        //return Result.ok().data("iterm","user");
        return Result.ok().data("user",users);
        //return users;
    }

    @ApiOperation("添加用户")
    @PostMapping("/addUser")
    public Result addUser(@RequestBody User user) {

        boolean a = userTestService.addUser(user);
        System.out.println(a);
        if (a){
            return Result.ok().data("user",user);
        }else {
            return Result.error();

        }
    }


    @ApiOperation(value = "根据ID删除")
    @DeleteMapping("{id}")
    public Result removeById(
            @ApiParam(name = "id", value = "用户ID", required = true)

            @PathVariable String id){
        ;
        boolean flag = userTestService.removeById(id);
        System.out.println(flag);
        if (true){
            return Result.ok();

        }else {
            return Result.error();
        }
    }
}
