package com.ltim.joritz.marketplace.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.joritz.marketplace.model.ATMetaDataSchemaModel;
import com.ltim.joritz.marketplace.model.ArtifactModel;
import com.ltim.joritz.marketplace.repository.ATMetaDataSchemaRepository;

@Service
public class ATMetaDataSchemaServiceImplementation implements ATMetaDataSchemaService {
	
	@Autowired
	ATMetaDataSchemaRepository atMetaDataSchemaRepository;
	
	@Override
	public List<Integer> getCol(int Catagory) {
		
		// TODO Auto-generated method stub
//		List<ATMetaDataSchemaModel>data = atMetaDataSchemaRepository.findAll();
		List<ATMetaDataSchemaModel>data = atMetaDataSchemaRepository.findByArtifactTypeId(Catagory);
				
		List<Integer>result = new ArrayList<>() ;
 
		
		for(int i = 0 ;i<data.size() ;i++) {
			
			result.add(data.get(i).getAtMDSchemaId());
		}
		
			
		System.out.println(result);
		return result;
	}
	
	
	@Override
	public List<ATMetaDataSchemaModel> getATMetaData(int str) {
		// TODO Auto-generated method stub
		return atMetaDataSchemaRepository.findByArtifactTypeId(str);
	}


	@Override
	public List<ArtifactModel> getAllATMedataDataSchemas() {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
