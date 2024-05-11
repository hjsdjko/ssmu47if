package com.entity.view;

import com.entity.QichechukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 汽车出库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-14 20:03:50
 */
@TableName("qichechuku")
public class QichechukuView  extends QichechukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QichechukuView(){
	}
 
 	public QichechukuView(QichechukuEntity qichechukuEntity){
 	try {
			BeanUtils.copyProperties(this, qichechukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
