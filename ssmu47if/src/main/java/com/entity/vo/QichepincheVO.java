package com.entity.vo;

import com.entity.QichepincheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 汽车拼车
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-14 20:03:50
 */
public class QichepincheVO  implements Serializable {
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
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 颜色
	 */
	
	private String yanse;
		
	/**
	 * 车牌
	 */
	
	private String chepai;
		
	/**
	 * 拼车价格
	 */
	
	private Integer pinchejiage;
		
	/**
	 * 拼车人数
	 */
	
	private Integer pincherenshu;
		
	/**
	 * 拼车内容
	 */
	
	private String pincheneirong;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
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
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：颜色
	 */
	 
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	
	/**
	 * 获取：颜色
	 */
	public String getYanse() {
		return yanse;
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
	 * 设置：拼车价格
	 */
	 
	public void setPinchejiage(Integer pinchejiage) {
		this.pinchejiage = pinchejiage;
	}
	
	/**
	 * 获取：拼车价格
	 */
	public Integer getPinchejiage() {
		return pinchejiage;
	}
				
	
	/**
	 * 设置：拼车人数
	 */
	 
	public void setPincherenshu(Integer pincherenshu) {
		this.pincherenshu = pincherenshu;
	}
	
	/**
	 * 获取：拼车人数
	 */
	public Integer getPincherenshu() {
		return pincherenshu;
	}
				
	
	/**
	 * 设置：拼车内容
	 */
	 
	public void setPincheneirong(String pincheneirong) {
		this.pincheneirong = pincheneirong;
	}
	
	/**
	 * 获取：拼车内容
	 */
	public String getPincheneirong() {
		return pincheneirong;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
