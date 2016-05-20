package com.vega.web.turnkey.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vega.web.turnkey.dao.pconfig.PConfigMapper;
import com.vega.web.turnkey.model.PConfig;
import com.vega.web.turnkey.service.PConfigService;

@Service
public class PConfigServiceImpl implements PConfigService {

	@Autowired
	private PConfigMapper pconfigMapper;

	@Override
	public List<PConfig> getAllPConfig() {
		return pconfigMapper.selectPConfig();
	}

}
