package com.tt.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.tt.domain.Customer;

public interface CustomerDao extends BaseDao<Customer> {

	//按照行业统计客户数量
	List<Object[]> getIndustryCount();
	
}
