package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.Entity.Student;
import in.sp.main.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController
{
    @Autowired
    private StudentService studentService;

    @PostMapping("/{studentId}/exams/{examId}")
    public ResponseEntity<Student> registerForExam(
            @PathVariable Long studentId, @PathVariable Long examId) 
    {
        return ResponseEntity.ok(studentService.registerForExam(studentId, examId));
    }
}