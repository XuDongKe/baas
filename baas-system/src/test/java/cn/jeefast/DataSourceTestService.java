package cn.baas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.baas.datasources.DataSourceNames;
import cn.baas.datasources.annotation.DataSource;
import cn.baas.system.entity.SysUser;
import cn.baas.system.service.SysUserService;

/**
 * 测试
 * @author theodo
 * @email 36780272@qq.com
 * @date 2017/10/16 21:10
 */
@Service
public class DataSourceTestService {
    @Autowired
    private SysUserService userService;

    public SysUser queryObject(Long userId){
        return userService.selectById(userId);
    }

    @DataSource(name = DataSourceNames.SECOND)
    public SysUser queryObject2(Long userId){
        return userService.selectById(userId);
    }
}
