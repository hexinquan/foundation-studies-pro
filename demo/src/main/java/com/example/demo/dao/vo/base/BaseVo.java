package com.example.demo.dao.vo.base;

import java.io.Serializable;

public class BaseVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 开始时间
	 */
	private String startDate;
	/**
	 * 结束时间
	 */
	private String endDate;

	/**
	 * 创建人
	 */
	private Long creatorId;

	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	/**
	 * 版本
	 */
	private Integer version;

	/**
	 * 组织代码
	 */
	private String orgCode;

	/**
	 * 数据排序
	 */
	private Long dataSort;

	/**
	 * 删除状态
	 */
	private Integer deleteStatus;

	/**
	 * 使用状态
	 */
	private Integer useStatus;

	/**
	 * 修改时间
	 */
	private String updateTime;

	/**
	 * 创建时间
	 */
	private String createTime;



	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}



	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public Long getDataSort() {
		return dataSort;
	}

	public void setDataSort(Long dataSort) {
		this.dataSort = dataSort;
	}

	public Integer getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Integer deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public Integer getUseStatus() {
		return useStatus;
	}

	public void setUseStatus(Integer useStatus) {
		this.useStatus = useStatus;
	}
	
	
	
}
