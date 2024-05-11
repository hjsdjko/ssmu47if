package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichepincheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichepincheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichepincheView;


/**
 * 汽车拼车
 *
 * @author 
 * @email 
 * @date 2021-05-14 20:03:50
 */
public interface QichepincheService extends IService<QichepincheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichepincheVO> selectListVO(Wrapper<QichepincheEntity> wrapper);
   	
   	QichepincheVO selectVO(@Param("ew") Wrapper<QichepincheEntity> wrapper);
   	
   	List<QichepincheView> selectListView(Wrapper<QichepincheEntity> wrapper);
   	
   	QichepincheView selectView(@Param("ew") Wrapper<QichepincheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichepincheEntity> wrapper);
   	
}

