package com.example.demo.dao.entity.base;

import java.io.Serializable;
import java.util.Date;


public abstract class BaseEntity implements Serializable,Entity{

	private static final long serialVersionUID = 1L;

	protected Long id;

	protected Integer deleteStatus;

	protected Date createTime;

	protected Date updateTime;
	
	protected Long creatorId;
	
	protected String orgCode;

	protected Integer version;
	
	protected Long dataSort;
	
	protected BaseEntity() {
	}

	protected BaseEntity(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Long getDataSort() {
		return dataSort;
	}

	public void setDataSort(Long dataSort) {
		this.dataSort = dataSort;
	}

	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	
	public Integer getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Integer deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
}
