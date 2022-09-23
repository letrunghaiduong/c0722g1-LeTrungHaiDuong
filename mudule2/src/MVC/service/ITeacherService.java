package MVC.service;

public interface ITeacherService {
    void addTeacher();

    void removeTeacher();

    void teachersList();

    void seachByName(String nameTeacher);

    void seachById(String idTeacher);

    void sortTeachers();
}
