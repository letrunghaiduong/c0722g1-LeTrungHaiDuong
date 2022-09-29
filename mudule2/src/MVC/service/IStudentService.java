package MVC.service;

import java.io.IOException;

public interface IStudentService {

    void addStudent() throws IOException;

    void removeStudent();

    void studentsList() throws IOException;

    void seachByName(String nameStudent);

    void seachById(int idStudent);

    void sortStudents();

}
