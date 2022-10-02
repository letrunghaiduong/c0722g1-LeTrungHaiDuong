package MVC.service;

import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;

    void removeTeacher() throws IOException;

    void teachersList() throws IOException;

    void seachByName(String nameTeacher) throws IOException;

    void seachById(int idTeacher) throws IOException;

    void sortTeachers() throws IOException;
}
