package ap.edu;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import ap.edu.dao.org.CampusRepo;
//import ap.edu.dao.org.ComposedOrgRepo;
//import ap.edu.dao.org.InstituteRepo;
//import ap.edu.dao.org.OrganizationRepo;
//import ap.edu.entity.org.Campus;
//import ap.edu.entity.org.ComposedOrg;
//import ap.edu.entity.org.Institution;
//import ap.edu.entity.org.Organization;
//import ap.edu.entity.util.CSVLoader;
//import ap.edu.service.util.LoadDataCsv;


@SpringBootApplication

@Transactional
public class AcademiaApplication implements CommandLineRunner{
//	@Autowired
//	OrganizationRepo orgRepo;
//	@Autowired
//	InstituteRepo insRepo;
//	@Autowired
//	CampusRepo campusRepo;
//	@Autowired
//	ComposedOrgRepo oicRepo;
//	
//	@Autowired
//	LoadDataCsv loadDataCsv;


	public static void main(String[] args) {
		SpringApplication.run(AcademiaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		loadData();
		showData();
		
	}
	
	 private void loadData() {
//			String filepath="F:\\DbCopy\\1orgn.csv";
//			String table="organization";
//			loadDataCsv.uploadToDb(filepath,table);
//			
//			filepath="F:\\DbCopy\\2institutionn.csv";
//			table="institution";
//			loadDataCsv.uploadToDb(filepath,table);
//			
//			filepath="F:\\DbCopy\\3campus.csv";
//			table="campus";
//			loadDataCsv.uploadToDb(filepath,table);
//		
	}

	@Transactional
	    private void saveData(){
		 
		 
		 
	 }
	 
	 @Transactional
	    private void showData(){
		 System.out.println("===================Orgainzation List:==================");
//		 List<Organization> orgs=orgRepo.findAll();
//		
//			 for(Organization org:orgs) {
//				 System.out.println(org.getOrg_id()+" ###############"+org.getInstitutions().size());
//			 }
		 
		 System.out.println("===================Institution List:==================");
		 System.out.println("===================Campusses List:==================");
		 
//		 List<Campus> camps=campusRepo.findAll();
//		 
//		 for(Campus camp:camps) {
//			 System.out.println(camp.getCamp_id()+" ###############"+camp.getInstitute().getIns_id()+"###"+camp.getInstitute().getOrg().getOrg_id());
//		 }
		 
//		 List<ComposedOrg> oics=oicRepo.findAll();
//		 System.out.println(oics.get(0).getCamp().getId());
		 
		 System.out.println("===================Academia Subjects List:==================");
		
	 }
	 


}
