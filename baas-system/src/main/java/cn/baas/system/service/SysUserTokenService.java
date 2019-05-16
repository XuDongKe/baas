package cn.baas.system.service;

import com.baomidou.mybatisplus.service.IService;

import cn.baas.common.utils.R;
import cn.baas.system.entity.SysUserToken;

/**
 * <p>
 * 系统用户Token 服务类
 * </p>
 *
 * @author theodo
 * @since 2017-10-28
 */
public interface SysUserTokenService extends IService<SysUserToken> {
	SysUserToken queryByToken(String token);
	
	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);
}
