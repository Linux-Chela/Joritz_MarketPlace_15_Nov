package com.ltim.joritz.marketplace.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class ATMetaDataSchemaModel {
	
	@Id
	@Column(name="atMDSchemaId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int atMDSchemaId;
	
	@Column(name="metaDataName")
	private String metaDataName;
	
	@Column(name="dataType")
	private String dataType;
	
	@Column(name="isMandatory")
	private boolean isMandatory;
	
	
	@Column(name="status")
	private boolean status;
	
	
	@ManyToOne
	@JoinColumn(name="artifactTypeId")
	private ArtifactTypeModel artifactType;
	
	@OneToMany(mappedBy = "atMetaDataSchema")
	private List<ATMetaDataModel> atMetaDataList = new ArrayList<ATMetaDataModel>();

	public int getAtMDSchemaId() {
		return atMDSchemaId;
	}

	public void setAtMDSchemaId(int atMDSchemaId) {
		this.atMDSchemaId = atMDSchemaId;
	}

	public String getMetaDataName() {
		return metaDataName;
	}

	public void setMetaDataName(String metaDataName) {
		this.metaDataName = metaDataName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public boolean isMandatory() {
		return isMandatory;
	}

	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public ArtifactTypeModel getArtifactType() {
		return artifactType;
	}

	public void setArtifactType(ArtifactTypeModel artifactType) {
		this.artifactType = artifactType;
	}

	public List<ATMetaDataModel> getAtMetaDataList() {
		return atMetaDataList;
	}

	public void setAtMetaDataList(List<ATMetaDataModel> atMetaDataList) {
		this.atMetaDataList = atMetaDataList;
	}

	public ATMetaDataSchemaModel(int atMDSchemaId, String metaDataName, String dataType, boolean isMandatory,
			boolean status, ArtifactTypeModel artifactType, List<ATMetaDataModel> atMetaDataList) {
		super();
		this.atMDSchemaId = atMDSchemaId;
		this.metaDataName = metaDataName;
		this.dataType = dataType;
		this.isMandatory = isMandatory;
		this.status = status;
		this.artifactType = artifactType;
		this.atMetaDataList = atMetaDataList;
	}

	public ATMetaDataSchemaModel() {
		super();
	}

	
	
	
	
}
