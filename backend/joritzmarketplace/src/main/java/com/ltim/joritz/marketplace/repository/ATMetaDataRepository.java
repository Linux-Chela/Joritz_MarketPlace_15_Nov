package com.ltim.joritz.marketplace.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltim.joritz.marketplace.model.ATMetaDataModel;

@Repository
public interface ATMetaDataRepository extends JpaRepository<ATMetaDataModel, Integer>{


	Optional<ATMetaDataModel> findByArtifactId(int id);

	Optional<ATMetaDataModel> findByArtifactTypeId(int id);

	

}
