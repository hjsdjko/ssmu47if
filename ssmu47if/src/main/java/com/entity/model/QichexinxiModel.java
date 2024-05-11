package com.entity.model;

import com.entity.QichexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 汽车信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-14 20:03:50
 */
public class QichexinxiModel  implements Serializable {
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
	 * 能源类型
	 */
	
	private String nengyuanleixing;
		
	/**
	 * 颜色
	 */
	
	private String yanse;
		
	/**
	 * 排量
	 */
	
	private String pailiang;
		
	/**
	 * 车牌
	 */
	
	private String chepai;
		
	/**
	 * 租赁价格
	 */
	
	private Integer zulinjiage;
		
	/**
	 * 咨询电话
	 */
	
	private String zixundianhua;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
				
	
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
	 * 设置：能源类型
	 */
	 
	public void setNengyuanleixing(String nengyuanleixing) {
		this.nengyuanleixing = nengyuanleixing;
	}
	
	/**
	 * 获取：能源类型
	 */
	public String getNengyuanleixing() {
		return nengyuanleixing;
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
	 * 设置：排量
	 */
	 
	public void setPailiang(String pailiang) {
		this.pailiang = pailiang;
	}
	
	/**
	 * 获取：排量
	 */
	public String getPailiang() {
		return pailiang;
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
	 * 设置：租赁价格
	 */
	 
	public void setZulinjiage(Integer zulinjiage) {
		this.zulinjiage = zulinjiage;
	}
	
	/**
	 * 获取：租赁价格
	 */
	public Integer getZulinjiage() {
		return zulinjiage;
	}
				
	
	/**
	 * 设置：咨询电话
	 */
	 
	public void setZixundianhua(String zixundianhua) {
		this.zixundianhua = zixundianhua;
	}
	
	/**
	 * 获取：咨询电话
	 */
	public String getZixundianhua() {
		return zixundianhua;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
			
}
