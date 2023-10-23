package ru.menshikov.MyRestSpringBootAppH2DB.dao;

import org.springframework.stereotype.Repository;
import ru.menshikov.MyRestSpringBootAppH2DB.entity.Discipline;


import java.util.List;

@Repository
public interface DisciplineDAO {

    List<Discipline> getAllDiscipline();

    Discipline saveDiscipline(Discipline discipline);

    Discipline getDiscipline(int id);

    void deleteDiscipline(int id);
}
