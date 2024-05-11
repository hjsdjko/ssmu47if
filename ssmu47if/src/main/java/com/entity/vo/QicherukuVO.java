package com.entity.vo;

import com.entity.QicherukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 汽车入库
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-14 20:03:50
 */
public class QicherukuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 汽车类型
	 */
	
	private String qicheleixing;
		
	/**
	 * 汽车品牌
	 */
	
	private String qichepinpai;
		
	/**
	 * 车牌
	 */
	
	private String chepai;
		
	/**
	 * 入库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rukushijian;
		
	/**
	 * 入库内容
	 */
	
	private String rukuneirong;
				
	
	/**
	 * 设置：汽车类型
	 */
	 
	public void setQicheleixing(String qicheleixing) {
		this.qicheleixing = qicheleixing;
	}
	
	/**
	 * 获取：汽车类型
	 */
	public String getQicheleixing() {
		return qicheleixing;
	}
				
	
	/**
	 * 设置：汽车品牌
	 */
	 
	public void setQichepinpai(String qichepinpai) {
		this.qichepinpai = qichepinpai;
	}
	
	/**
	 * 获取：汽车品牌
	 */
	public String getQichepinpai() {
		return qichepinpai;
	}
				
	
	/**
	 * 设置：车牌
	 */
	 
	public void setChepai(String chepai) {
		this.chepai = chepai;
	}
	
	/**
	 * 获取：车牌
	 */
	public String getChepai() {
		return chepai;
	}
				
	
	/**
	 * 设置：入库时间
	 */
	 
	public void setRukushijian(Date rukushijian) {
		this.rukushijian = rukushijian;
	}
	
	/**
	 * 获取：入库时间
	 */
	public Date getRukushijian() {
		return rukushijian;
	}
				
	
	/**
	 * 设置：入库内容
	 */
	 
	public void setRukuneirong(String rukuneirong) {
		this.rukuneirong = rukuneirong;
	}
	
	/**
	 * 获取：入库内容
	 */
	public String getRukuneirong() {
		return rukuneirong;
	}
			
}
