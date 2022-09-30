package MVC.service;

import java.io.IOException;

public interface IStudentService {

    void addStudent() throws IOException;

    void removeStudent() throws IOException;

    void studentsList() throws IOException;

    void seachByName(String nameStudent) throws IOException;

    void seachById(int idStudent) throws IOException;

    void sortStudents() throws IOException;

}
