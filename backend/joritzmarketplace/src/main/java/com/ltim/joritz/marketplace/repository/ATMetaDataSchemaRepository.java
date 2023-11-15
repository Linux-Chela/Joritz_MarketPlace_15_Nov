package com.ltim.joritz.marketplace.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltim.joritz.marketplace.model.ATMetaDataSchemaModel;

@Repository
public interface ATMetaDataSchemaRepository extends JpaRepository<ATMetaDataSchemaModel, Integer> {

//	List<ATMetaDataSchemaModel> findByartifactTypeid(int catagory);

	List<ATMetaDataSchemaModel> findByArtifactTypeId1(int catagory);

	List<ATMetaDataSchemaModel> findByArtifactTypeId(int str);

	
}
