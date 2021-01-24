package rdodo.demo.serviceb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import rdodo.demo.serviceb.persistance.ExamService;
import rdodo.demo.serviceb.persistance.Examination;

@RestController
public class ExamController {
	@Autowired
	private ExamService examService;
	
	@GetMapping(value = "/exam/all")
	public ResponseEntity<List<Examination>> getAllExam() {
		return new ResponseEntity<List<Examination>>(examService.getAllExams(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/exam/single/{id}")
	public ResponseEntity<Examination> getExam(@PathVariable("id") int id) {
		return new ResponseEntity<>(examService.getExamById(id), HttpStatus.OK);
	}
}
