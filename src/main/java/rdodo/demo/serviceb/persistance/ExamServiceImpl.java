package rdodo.demo.serviceb.persistance;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExamServiceImpl implements ExamService {
	@Autowired
	private ExamRepo examRepo;
	
	@Override
	public List<Examination> getAllExams() {
		// TODO Auto-generated method stub
		return examRepo.findAll();
	}

	@Override
	public Examination getExamById(int id) {
		// TODO Auto-generated method stub
		return examRepo.getOne(id);
	}

}
