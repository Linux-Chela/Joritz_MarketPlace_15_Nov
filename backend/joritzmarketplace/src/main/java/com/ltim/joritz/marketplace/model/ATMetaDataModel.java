package com.ltim.joritz.marketplace.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ATMetaDataModel extends AuditableBase{
	
	 
	 @Id
	 @Column(name="atMetaDataId")
	 private int atMetaDataId;

	 @Column(name="value")
	 private String value;
	 
	 
	
	 
	 @ManyToOne
	 @JoinColumn(name="artifactId")
	 private ArtifactModel artifact;
	 
	
	 @ManyToOne
	 @JoinColumn(name="atMDSchemaId")
	 private ATMetaDataSchemaModel atMetaDataSchema;


	public int getAtMetaDataId() {
		return atMetaDataId;
	}


	public void setAtMetaDataId(int atMetaDataId) {
		this.atMetaDataId = atMetaDataId;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public ArtifactModel getArtifact() {
		return artifact;
	}


	public void setArtifact(ArtifactModel artifact) {
		this.artifact = artifact;
	}


	public ATMetaDataSchemaModel getAtMetaDataSchema() {
		return atMetaDataSchema;
	}


	public void setAtMetaDataSchema(ATMetaDataSchemaModel atMetaDataSchema) {
		this.atMetaDataSchema = atMetaDataSchema;
	}


	public ATMetaDataModel(int atMetaDataId, String value, ArtifactModel artifact,
			ATMetaDataSchemaModel atMetaDataSchema) {
		super();
		this.atMetaDataId = atMetaDataId;
		this.value = value;
		this.artifact = artifact;
		this.atMetaDataSchema = atMetaDataSchema;
	}


	public ATMetaDataModel() {
		super();
	}


	
	
}


