package com.dao;

import com.entity.QichepincheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichepincheVO;
import com.entity.view.QichepincheView;


/**
 * 汽车拼车
 * 
 * @author 
 * @email 
 * @date 2021-05-14 20:03:50
 */
public interface QichepincheDao extends BaseMapper<QichepincheEntity> {
	
	List<QichepincheVO> selectListVO(@Param("ew") Wrapper<QichepincheEntity> wrapper);
	
	QichepincheVO selectVO(@Param("ew") Wrapper<QichepincheEntity> wrapper);
	
	List<QichepincheView> selectListView(@Param("ew") Wrapper<QichepincheEntity> wrapper);

	List<QichepincheView> selectListView(Pagination page,@Param("ew") Wrapper<QichepincheEntity> wrapper);
	
	QichepincheView selectView(@Param("ew") Wrapper<QichepincheEntity> wrapper);
	
}
