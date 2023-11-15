package com.ltim.joritz.marketplace.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class ArtifactTypeModel {

	@Id
	@Column(name="artifactTypeId")
	private int artifactTypeId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="status")
	private boolean status;
	
	@OneToOne(mappedBy = "artifactType")
	private ArtifactModel artifact;
	
	
	@OneToMany(mappedBy = "artifactType")
	private List<ATMetaDataSchemaModel> atMetaDataSchemaList = new ArrayList<ATMetaDataSchemaModel>();


	public int getArtifactTypeId() {
		return artifactTypeId;
	}


	public void setArtifactTypeId(int artifactTypeId) {
		this.artifactTypeId = artifactTypeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public ArtifactModel getArtifact() {
		return artifact;
	}


	public void setArtifact(ArtifactModel artifact) {
		this.artifact = artifact;
	}


	public List<ATMetaDataSchemaModel> getAtMetaDataSchemaList() {
		return atMetaDataSchemaList;
	}


	public void setAtMetaDataSchemaList(List<ATMetaDataSchemaModel> atMetaDataSchemaList) {
		this.atMetaDataSchemaList = atMetaDataSchemaList;
	}


	public ArtifactTypeModel(int artifactTypeId, String name, String description, boolean status,
			ArtifactModel artifact, List<ATMetaDataSchemaModel> atMetaDataSchemaList) {
		super();
		this.artifactTypeId = artifactTypeId;
		this.name = name;
		this.description = description;
		this.status = status;
		this.artifact = artifact;
		this.atMetaDataSchemaList = atMetaDataSchemaList;
	}


	public ArtifactTypeModel() {
		super();
	}


	
	
	
	
	
}



	
