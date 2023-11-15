package com.ltim.joritz.marketplace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.joritz.marketplace.model.ArtifactModel;
import com.ltim.joritz.marketplace.repository.ArtifactRepository;

@Service
public class ArtifactServiceImplementation implements ArtifactService {
	@Autowired
	private ArtifactRepository artifactRepository;

	@Override
	public ArtifactModel createArtifact(ArtifactModel artifact) {
		// TODO Auto-generated method stub
		return artifactRepository.save(artifact);
	}

	@Override
	public List<ArtifactModel> getAllArtifacts() { 
		// TODO Auto-generated method stub
		return artifactRepository.findAll();
	}

	@Override
	public Optional<ArtifactModel> getArtifact(int artifactId) {
		// TODO Auto-generated method stub
		return artifactRepository.findById(artifactId);
	}
	
	@Override
	public String deleteArtifact(int artifactId) {
		artifactRepository.deleteById(artifactId);
		return "Artifact Deleted!!";
	}
	
	
	
	
	
//	@Override
//	public  boolean toBoolean(String value) {
//		if (value == null) {
//            return false;
//        }
//        if ("1".equals(value) || "true".equalsIgnoreCase(value)) {
//            return true;
//        }
//        return false;
//    }
	
	
}
