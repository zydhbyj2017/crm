package com.tt.service;

import java.util.List;

import com.tt.dao.BaseDictDao;
import com.tt.domain.BaseDict;
import com.tt.service.BaseDictService;

public class BaseDictServiceImpl implements BaseDictService {
	
	private BaseDictDao bdd;
	
	@Override
	public List<BaseDict> getListByTypeCode(String dict_type_code) {
		return bdd.getListByTypeCode(dict_type_code);
	}

	public void setBdd(BaseDictDao bdd) {
		this.bdd = bdd;
	}

	
}
