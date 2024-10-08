package com.dao;

import com.entity.PinchexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PinchexinxiVO;
import com.entity.view.PinchexinxiView;


/**
 * 拼车信息
 * 
 * @author 
 * @email 
 * @date 2021-05-14 20:03:50
 */
public interface PinchexinxiDao extends BaseMapper<PinchexinxiEntity> {
	
	List<PinchexinxiVO> selectListVO(@Param("ew") Wrapper<PinchexinxiEntity> wrapper);
	
	PinchexinxiVO selectVO(@Param("ew") Wrapper<PinchexinxiEntity> wrapper);
	
	List<PinchexinxiView> selectListView(@Param("ew") Wrapper<PinchexinxiEntity> wrapper);

	List<PinchexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<PinchexinxiEntity> wrapper);
	
	PinchexinxiView selectView(@Param("ew") Wrapper<PinchexinxiEntity> wrapper);
	
}
