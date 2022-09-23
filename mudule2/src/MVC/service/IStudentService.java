package MVC.service;

public interface IStudentService {

    void addStudent();

    void removeStudent();

    void studentsList();

    void seachByName(String nameStudent);

    void seachById(String idStudent);

    void sortStudents();

}
