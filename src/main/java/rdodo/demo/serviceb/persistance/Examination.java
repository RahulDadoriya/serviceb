package rdodo.demo.serviceb.persistance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Examination implements Serializable {

	private static final long serialVersionUID = 1647163700870787823L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String examType;
	private String examSubject;
	private int totalMarks;
	private String schoolName;
	
	public Examination() {
		super();
	}
	public Examination(String examType, String examSubject, int totalMarks, String schoolName) {
		super();
		this.examType = examType;
		this.examSubject = examSubject;
		this.totalMarks = totalMarks;
		this.schoolName = schoolName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExamType() {
		return examType;
	}
	public void setExamType(String examType) {
		this.examType = examType;
	}
	public String getExamSubject() {
		return examSubject;
	}
	public void setExamSubject(String examSubject) {
		this.examSubject = examSubject;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	@Override
	public String toString() {
		return "Examination [id=" + id + ", examType=" + examType + ", examSubject=" + examSubject + ", totalMarks="
				+ totalMarks + ", schoolName=" + schoolName + "]";
	}
	
}
