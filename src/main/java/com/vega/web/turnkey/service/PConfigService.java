package com.vega.web.turnkey.service;

import java.util.List;

import com.vega.web.turnkey.model.PConfig;

/**
 * pconfig 服务
 * @author wangyongbing
 *
 */
public interface PConfigService {

	/**
	 * 获取所有的PConfig配置
	 * @return
	 */
	List<PConfig> getAllPConfig();
	
}
