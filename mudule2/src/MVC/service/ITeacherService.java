package MVC.service;

import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;

    void removeTeacher();

    void teachersList() throws IOException;

    void seachByName(String nameTeacher);

    void seachById(int idTeacher);

    void sortTeachers();
}
