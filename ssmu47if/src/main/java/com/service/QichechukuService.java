package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichechukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichechukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichechukuView;


/**
 * 汽车出库
 *
 * @author 
 * @email 
 * @date 2021-05-14 20:03:50
 */
public interface QichechukuService extends IService<QichechukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichechukuVO> selectListVO(Wrapper<QichechukuEntity> wrapper);
   	
   	QichechukuVO selectVO(@Param("ew") Wrapper<QichechukuEntity> wrapper);
   	
   	List<QichechukuView> selectListView(Wrapper<QichechukuEntity> wrapper);
   	
   	QichechukuView selectView(@Param("ew") Wrapper<QichechukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichechukuEntity> wrapper);
   	
}

