package com.dao;

import com.entity.QichechukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichechukuVO;
import com.entity.view.QichechukuView;


/**
 * 汽车出库
 * 
 * @author 
 * @email 
 * @date 2021-05-14 20:03:50
 */
public interface QichechukuDao extends BaseMapper<QichechukuEntity> {
	
	List<QichechukuVO> selectListVO(@Param("ew") Wrapper<QichechukuEntity> wrapper);
	
	QichechukuVO selectVO(@Param("ew") Wrapper<QichechukuEntity> wrapper);
	
	List<QichechukuView> selectListView(@Param("ew") Wrapper<QichechukuEntity> wrapper);

	List<QichechukuView> selectListView(Pagination page,@Param("ew") Wrapper<QichechukuEntity> wrapper);
	
	QichechukuView selectView(@Param("ew") Wrapper<QichechukuEntity> wrapper);
	
}
