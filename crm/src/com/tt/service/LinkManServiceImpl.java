package com.tt.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.tt.dao.LinkManDao;
import com.tt.domain.Customer;
import com.tt.domain.LinkMan;
import com.tt.service.LinkManService;
import com.tt.utils.PageBean;

public class LinkManServiceImpl implements LinkManService {
	
	private LinkManDao lmd ;
	
	@Override
	public PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize) {
		//1 调用Dao查询总记录数
		Integer totalCount = lmd.getTotalCount(dc);
		//2 创建PageBean对象
		PageBean pb = new PageBean(currentPage, totalCount, pageSize);
		//3 调用Dao查询分页列表数据
		
		List<LinkMan> list = lmd.getPageList(dc,pb.getStart(),pb.getPageSize());
		//4 列表数据放入pageBean中.并返回
		pb.setList(list);
		return pb;
	}

	@Override
	public LinkMan getById(Long lkm_id) {
		return lmd.getById(lkm_id);
	}
	@Override
	public void save(LinkMan linkMan) {
		lmd.saveOrUpdate(linkMan);
	}

	public void setLmd(LinkManDao lmd) {
		this.lmd = lmd;
	}

	
	

}
