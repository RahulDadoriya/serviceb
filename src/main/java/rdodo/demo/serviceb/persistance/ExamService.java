package rdodo.demo.serviceb.persistance;

import java.util.List;

public interface ExamService {
	List<Examination> getAllExams();
	Examination getExamById(int id);
}
