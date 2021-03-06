package cn.baas.rest.controller;

import org.springframework.web.bind.annotation.*;

import cn.baas.common.utils.R;
import cn.baas.rest.annotation.AuthIgnore;
import cn.baas.rest.annotation.LoginUser;
import cn.baas.rest.entity.TbToken;
import cn.baas.rest.entity.TbUser;

/**
 * API测试接口
 *
 * @author theodo
 * @email 36780272@qq.com
 * @date 2017-10-23 15:47
 */
@RestController
@RequestMapping("/api")
public class ApiTestController {

    /**
     * 获取用户信息
     */
    @GetMapping("userInfo")
    public R userInfo(@LoginUser TbUser user){
        return R.ok().put("user", user);
    }

    /**
     * 获取用户ID
     */
    @GetMapping("userId")
    public R userInfo(@RequestAttribute("userId") Integer userId){
        return R.ok().put("userId", userId);
    }

    /**
     * 忽略Token验证测试
     */
    @AuthIgnore
    @GetMapping("notToken")
    public R notToken(){
        return R.ok().put("msg", "无需token也能访问。。。");
    }

    /**
     * 接收JSON数据
     */
    @PostMapping("jsonData")
    public R jsonData(@LoginUser TbUser user, @RequestBody TbToken token){
        return R.ok().put("user", user).put("token", token);
    }
}
