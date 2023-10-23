package ru.menshikov.MyRestSpringBootAppH2DB.service;

import org.springframework.stereotype.Service;
import ru.menshikov.MyRestSpringBootAppH2DB.entity.Discipline;
import ru.menshikov.MyRestSpringBootAppH2DB.entity.Student;

import java.util.List;

@Service
public interface DisciplineService {

    List<Discipline> getAllDiscipline();

    Discipline getDiscipline(int id);

    Discipline saveDiscipline(Discipline discipline);

    void deleteDiscipline(int id);
}
