package com.entity.model;

import com.entity.QicheguihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 汽车归还
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-14 20:03:50
 */
public class QicheguihaiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 汽车名称
	 */
	
	private String qichemingcheng;
		
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
	 * 归还内容
	 */
	
	private String guihaineirong;
		
	/**
	 * 归还时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guihaishijian;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：汽车名称
	 */
	 
	public void setQichemingcheng(String qichemingcheng) {
		this.qichemingcheng = qichemingcheng;
	}
	
	/**
	 * 获取：汽车名称
	 */
	public String getQichemingcheng() {
		return qichemingcheng;
	}
				
	
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
	 * 设置：归还内容
	 */
	 
	public void setGuihaineirong(String guihaineirong) {
		this.guihaineirong = guihaineirong;
	}
	
	/**
	 * 获取：归还内容
	 */
	public String getGuihaineirong() {
		return guihaineirong;
	}
				
	
	/**
	 * 设置：归还时间
	 */
	 
	public void setGuihaishijian(Date guihaishijian) {
		this.guihaishijian = guihaishijian;
	}
	
	/**
	 * 获取：归还时间
	 */
	public Date getGuihaishijian() {
		return guihaishijian;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
