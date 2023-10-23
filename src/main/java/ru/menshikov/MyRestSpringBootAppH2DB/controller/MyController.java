package ru.menshikov.MyRestSpringBootAppH2DB.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.menshikov.MyRestSpringBootAppH2DB.entity.Discipline;
import ru.menshikov.MyRestSpringBootAppH2DB.entity.Student;
import ru.menshikov.MyRestSpringBootAppH2DB.service.DisciplineService;
import ru.menshikov.MyRestSpringBootAppH2DB.service.StudentService;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> showAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        return allStudents;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
}

    @DeleteMapping("/students/{id}")
    public void updateStudent(@PathVariable ("id") int id) {studentService.deleteStudent(id);}


    //discipline
    @Autowired
    private DisciplineService disciplineService;

    @GetMapping("/discipline")
    public List<Discipline> showAllDiscipline() {
        List<Discipline> allDiscipline = disciplineService.getAllDiscipline();
        return allDiscipline;
    }

    @GetMapping("/discipline/{id}")
    public Discipline getDiscipline(@PathVariable("id") int id) {
        return disciplineService.getDiscipline(id);
    }

    @PostMapping("/discipline")
    public Discipline saveDiscipline(@RequestBody Discipline discipline) {
        return disciplineService.saveDiscipline(discipline);
    }

    @PutMapping("/discipline")
    public Discipline updateDiscipline(@RequestBody Discipline discipline){
        disciplineService.saveDiscipline(discipline);
        return discipline;
    }

    @DeleteMapping("/discipline{id}")
    public void updateDiscipline(@PathVariable ("id") int id) {disciplineService.deleteDiscipline(id);}
}


