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


import com.dao.QichechukuDao;
import com.entity.QichechukuEntity;
import com.service.QichechukuService;
import com.entity.vo.QichechukuVO;
import com.entity.view.QichechukuView;

@Service("qichechukuService")
public class QichechukuServiceImpl extends ServiceImpl<QichechukuDao, QichechukuEntity> implements QichechukuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QichechukuEntity> page = this.selectPage(
                new Query<QichechukuEntity>(params).getPage(),
                new EntityWrapper<QichechukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QichechukuEntity> wrapper) {
		  Page<QichechukuView> page =new Query<QichechukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QichechukuVO> selectListVO(Wrapper<QichechukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QichechukuVO selectVO(Wrapper<QichechukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QichechukuView> selectListView(Wrapper<QichechukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QichechukuView selectView(Wrapper<QichechukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
