package com.vega.web.turnkey.dao.pconfig;

import java.util.List;

import com.vega.web.turnkey.model.PConfig;


public interface PConfigMapper {

	/**
	 * 查询所有配置
	 * @return
	 */
	List<PConfig> selectPConfig();
	
	/**
	 * 单个添加pconfig
	 * @param pconfig
	 * @return
	 */
	int insertPConfig(PConfig pconfig);
	
	/**
	 * 
	 * 批量添加pconfig
	 * @param pconfigs
	 * @return
	 */
	int batchInsertPConfig(List<PConfig> pconfigs);
}
