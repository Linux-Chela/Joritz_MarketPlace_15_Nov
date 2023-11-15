package com.ltim.joritz.marketplace.model;

import java.sql.Timestamp;


import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;


@MappedSuperclass
@EntityListeners(value = { AuditingEntityListener.class })
public abstract class AuditableBase {

	@CreatedBy
	@Column(name="createBy", updatable=false)
	private String createdBy;
	
	@CreatedDate
	@Column(name="createdOn", updatable =false)
	private Timestamp createdOn;
	
	@LastModifiedBy
	@Column(name="modifiedBy")
	private String modifiedBy;
	
	@LastModifiedDate
	@Column(name="modifiedOn")
	private Timestamp modifiedOn;
}