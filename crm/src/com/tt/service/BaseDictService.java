package com.tt.service;

import java.util.List;

import com.tt.domain.BaseDict;

public interface BaseDictService {
	//根据根据数据字典类型字段获得数据字典对象
	List<BaseDict> getListByTypeCode(String dict_type_code);

}
