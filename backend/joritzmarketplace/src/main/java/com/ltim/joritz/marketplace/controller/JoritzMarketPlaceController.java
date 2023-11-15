package com.ltim.joritz.marketplace.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.joritz.marketplace.model.ArtifactModel;
import com.ltim.joritz.marketplace.service.ArtifactService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;




@RestController
@RequestMapping("/marketplace")
public class JoritzMarketPlaceController {
	
	private ArtifactService artifactService;
	
	
	@PostMapping("artifact/create")
	public ArtifactModel createArtifact(@RequestBody ArtifactModel artifact) {
		return artifactService.createArtifact(artifact);
	}
	
	
	@GetMapping("artifact/getall")
	public List<ArtifactModel> getAllArtifacts(){
		return artifactService.getAllArtifacts();	
	}
	
	
	
	@GetMapping("artifact/get/{artifactId}")
	public Optional<ArtifactModel> getArtifact(@RequestParam int artifactId) {
		return artifactService.getArtifact(artifactId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//     NISHID R&D on Data Fetching for Artifact Meta Data
//		
//		@Autowired
//		ArtifactService artifactService;
//		
//		@Autowired
//		ATMetaDataSchemaService atMetaDataSchemaService;
//		
//		@Autowired
//		ATMetaDataService atMetaDataService;
//		
//		@Autowired
//		ArtifactRepository artifactRepository;
//		
//		@Autowired
//		ATMetaDataRepository atMetaDataRepository;
//		
//		JdbcTemplate jdbcTemplate;
//		
//		 @PostMapping("/artifact/create")
//		    public HashMap<String, String> createArtifact(@RequestBody HashMap<String, String> nishid) {
//		        try {
//		            ArtifactModel obj = new ArtifactModel(nishid.get("artifactDescription"), nishid.get("artifactName"),
//		            		nishid.get("documentation"),artifactService.toBoolean(nishid.get("isPublic")),artifactService.toBoolean("status"),Integer.parseInt(nishid.get("downloaded"))
//		            		);
//		            
//
//		            int id = artifactService.crateArtifact(obj).getArtifactid();
//		            System.out.println(id);
//
//		            List<Integer> col_id = atMetaDataSchemaService.getCol(Integer.parseInt(nishid.get("artifactTypeId")));
//
//		            for (int i = 0; i < col_id.size(); i++) {
//		                try {
//		                    ATMetaDataModel values = new ATMetaDataModel(nishid.get(Integer.toString(col_id.get(i))),id, col_id.get(i)  );
//		                    atMetaDataService.createAtMetaDataModel(values);
//		                    System.out.println(values);
//		                } catch (Exception e) {
//		                    
//		                    System.err.println("Error creating ATMetaDataModel: " + e.getMessage());
//		                    
//		                }
//		            }
//
//		            return nishid;
//		        } catch (Exception e) {
//		       
//		            System.err.println("Error creating artifact: " + e.getMessage());
//		            return nishid; 
//		        }
//		 }
//		 
//		 
//		@GetMapping("/getMetadataCol")
//		public List<ATMetaDataSchemaModel> getMetaData(@RequestParam("ArtifactTypeId") int str)
//		{
//			return atMetaDataSchemaService.getATMetaData(str);
//		}
//		
//		
//	    @GetMapping("/getArtifact")
//	    public Map<String, Object> getArtifact(@RequestParam("ArtifactId") int id) {
//	        Map<String, Object> result = new HashMap<>();
//
//	        Optional<ArtifactModel> artifactModelOptional = artifactRepository.findById(id);
//	        if (artifactModelOptional.isPresent()) {
//	            ArtifactModel artifactModel = artifactModelOptional.get();
//	            result.put("artifact", artifactModel);
//
//	            Optional<ATMetaDataModel> metaDataList = atMetaDataRepository.findById(id);
//	            result.put("metaData", metaDataList);
//
//	            return result;
//	        } else {
//	            return Collections.singletonMap("error", "Artifact not found for id: " + id);
//	        }
//	    }

}
