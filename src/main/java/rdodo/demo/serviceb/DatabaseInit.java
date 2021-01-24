package rdodo.demo.serviceb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import rdodo.demo.serviceb.persistance.ExamRepo;
import rdodo.demo.serviceb.persistance.Examination;

public class DatabaseInit implements CommandLineRunner{
	
	@Autowired
	private ExamRepo examRepo;

	@Override
	public void run(String... args) throws Exception {
		List<Examination> examList = new ArrayList<Examination>();
		
		examList.add(new Examination("Mid Term", "English", 100, "BSN"));
		examList.add(new Examination("First Term", "Hindi", 50, "BSN"));
		examList.add(new Examination("Final Term", "Math", 100, "BSN"));
		examList.add(new Examination("Mid Term", "Physic", 75, "BSN"));
		examList.add(new Examination("First Term", "Chemistry", 75, "BSN"));
		examList.add(new Examination("Mid Term", "Hindi", 50, "BSN"));
		examList.add(new Examination("Final Term", "English", 100, "BSN"));
		
		examRepo.saveAll(examList);
		
	}

}
