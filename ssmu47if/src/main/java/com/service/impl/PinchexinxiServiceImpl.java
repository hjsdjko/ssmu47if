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


import com.dao.PinchexinxiDao;
import com.entity.PinchexinxiEntity;
import com.service.PinchexinxiService;
import com.entity.vo.PinchexinxiVO;
import com.entity.view.PinchexinxiView;

@Service("pinchexinxiService")
public class PinchexinxiServiceImpl extends ServiceImpl<PinchexinxiDao, PinchexinxiEntity> implements PinchexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PinchexinxiEntity> page = this.selectPage(
                new Query<PinchexinxiEntity>(params).getPage(),
                new EntityWrapper<PinchexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PinchexinxiEntity> wrapper) {
		  Page<PinchexinxiView> page =new Query<PinchexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PinchexinxiVO> selectListVO(Wrapper<PinchexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PinchexinxiVO selectVO(Wrapper<PinchexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PinchexinxiView> selectListView(Wrapper<PinchexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PinchexinxiView selectView(Wrapper<PinchexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
