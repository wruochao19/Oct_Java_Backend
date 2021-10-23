package hw2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Carter Du
 * Controller: 调用service来完成业务逻辑
 * generate users' commands for the behaviors
 */
@RestController
@RequestMapping("/students")
public class Controller {
    private final StudentService service;

    public Controller(StudentService service){
        this.service = service;
    }

    @PostMapping("/add/{id}")
    public String addStudent(@PathVariable int id, @RequestParam(value="name", defaultValue="NPC") String name,
                           @RequestParam(value="grade", defaultValue="0")int grade){
        Student newStudent = new Student();
        newStudent.setName(name);
        newStudent.setGrade(grade);
        service.createStudent(id, newStudent);
        return "add success!";
    }

    @GetMapping("/get")
    public List<Student> getStudent(){
       return service.getAllStudent();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Object> getStudentWithID(@PathVariable int id){
        return new ResponseEntity<>(service.getStudentByID(id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public void updateStudentWithID(@PathVariable int id, @RequestBody Student student){
        service.updateStudentByID(id, student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentByID(@PathVariable int id){
        service.deleteStudentByID(id);
        return "Success Delete!";
    }
}
