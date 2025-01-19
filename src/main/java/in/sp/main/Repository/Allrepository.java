package in.sp.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sp.main.Entity.Exam;
import in.sp.main.Entity.Student;
import in.sp.main.Entity.Subject;

public class Allrepository 
{
	@Repository
	public interface StudentRepository extends JpaRepository<Student, Long> {}

	@Repository
	public interface SubjectRepository extends JpaRepository<Subject, Long> {}

	@Repository
	public interface ExamRepository extends JpaRepository<Exam, Long> {}


}
