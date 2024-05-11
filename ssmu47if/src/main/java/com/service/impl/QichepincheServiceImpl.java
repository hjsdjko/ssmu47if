package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QichepincheDao;
import com.entity.QichepincheEntity;
import com.service.QichepincheService;
import com.entity.vo.QichepincheVO;
import com.entity.view.QichepincheView;

@Service("qichepincheService")
public class QichepincheServiceImpl extends ServiceImpl<QichepincheDao, QichepincheEntity> implements QichepincheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QichepincheEntity> page = this.selectPage(
                new Query<QichepincheEntity>(params).getPage(),
                new EntityWrapper<QichepincheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QichepincheEntity> wrapper) {
		  Page<QichepincheView> page =new Query<QichepincheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QichepincheVO> selectListVO(Wrapper<QichepincheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QichepincheVO selectVO(Wrapper<QichepincheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QichepincheView> selectListView(Wrapper<QichepincheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QichepincheView selectView(Wrapper<QichepincheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
