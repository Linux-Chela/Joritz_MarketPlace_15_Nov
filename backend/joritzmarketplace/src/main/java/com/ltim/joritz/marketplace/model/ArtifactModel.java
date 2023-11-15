package com.ltim.joritz.marketplace.model;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;

//import java.sql.String;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class ArtifactModel extends AuditableBase{
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name="artifactId")
	private int artifactid;
	
	
	@Column(name="artifactDescription")
	private String artifactDescription;
	
	@Column(name="artifactName")
	private String artifactName;
	

	@Column(name="documentation")
	private String documentation;
	
	@Column(name="isPublic")
	private boolean isPublic;
	
	
	@Column(name="status")
	private boolean status;
	
	@Column(name="downloaded")
	private int downloaded;
	
	
	@OneToMany(mappedBy = "artifact")
	private List<ATMetaDataModel> atMetaDataList = new ArrayList<ATMetaDataModel>();
	
	
	@OneToMany(mappedBy = "artifact")
	private List<VersionModel> versionList = new ArrayList<VersionModel>();


	@OneToOne
	@JoinColumn(name="artifactTypeId")
	private ArtifactTypeModel artifactType;


	public int getArtifactid() {
		return artifactid;
	}


	public void setArtifactid(int artifactid) {
		this.artifactid = artifactid;
	}


	public String getArtifactDescription() {
		return artifactDescription;
	}


	public void setArtifactDescription(String artifactDescription) {
		this.artifactDescription = artifactDescription;
	}


	public String getArtifactName() {
		return artifactName;
	}


	public void setArtifactName(String artifactName) {
		this.artifactName = artifactName;
	}


	public String getDocumentation() {
		return documentation;
	}


	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}


	public boolean isPublic() {
		return isPublic;
	}


	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	
	public int getDownloaded() {
		return downloaded;
	}


	public void setDownloaded(int downloaded) {
		this.downloaded = downloaded;
	}


	public List<ATMetaDataModel> getAtMetaDataList() {
		return atMetaDataList;
	}


	public void setAtMetaDataList(List<ATMetaDataModel> atMetaDataList) {
		this.atMetaDataList = atMetaDataList;
	}


	public List<VersionModel> getVersionList() {
		return versionList;
	}


	public void setVersionList(List<VersionModel> versionList) {
		this.versionList = versionList;
	}


	public ArtifactTypeModel getArtifactType() {
		return artifactType;
	}


	public void setArtifactType(ArtifactTypeModel artifactType) {
		this.artifactType = artifactType;
	}


	public ArtifactModel(String artifactDescription, String artifactName, String documentation,
			boolean isPublic, boolean status, int downloaded, List<ATMetaDataModel> atMetaDataList
			, List<VersionModel> versionList, ArtifactTypeModel artifactType) {
		super();
		this.artifactDescription = artifactDescription;
		this.artifactName = artifactName;
		this.documentation = documentation;
		this.isPublic = isPublic;
		this.status = status;
		this.downloaded = downloaded;
		this.atMetaDataList = atMetaDataList;
		this.versionList = versionList;
		this.artifactType = artifactType;
	}


	public ArtifactModel() {
		super();
	}
	
	
	
	

	
}
