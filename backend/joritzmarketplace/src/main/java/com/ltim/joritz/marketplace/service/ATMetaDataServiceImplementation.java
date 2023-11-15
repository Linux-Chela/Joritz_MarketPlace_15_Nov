package com.ltim.joritz.marketplace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.joritz.marketplace.model.ATMetaDataModel;
import com.ltim.joritz.marketplace.repository.ATMetaDataRepository;

@Service
public class ATMetaDataServiceImplementation implements ATMetaDataService {
	
	@Autowired
	ATMetaDataRepository atMetaDataReposiroty;
	
	@Override
	public ATMetaDataModel createAtMetaDataModel(ATMetaDataModel atMetaDataModel) {
		// TODO Auto-generated method stub
		
		return atMetaDataReposiroty.save(atMetaDataModel);
	}
	
	
	

}
