package com.ltim.joritz.marketplace.service;

import java.util.List;

import com.ltim.joritz.marketplace.model.ATMetaDataSchemaModel;
import com.ltim.joritz.marketplace.model.ArtifactModel;

public interface ATMetaDataSchemaService {
	List<ArtifactModel> getAllATMedataDataSchemas();
	public List<Integer> getCol(int Catagory);
	List<ATMetaDataSchemaModel> getATMetaData(int str);
} 