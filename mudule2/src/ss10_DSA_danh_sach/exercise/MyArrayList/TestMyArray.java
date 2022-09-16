package ss10_DSA_danh_sach.exercise.MyArrayList;

public class TestMyArray {
    public static class Student{
        private int id;
        private String name;

        public Student(){
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"Duong");
        Student student2 = new Student(2,"Hoang");
        Student student3 = new Student(3,"Huy");
        Student student4 = new Student(4,"Hung");
        Student student5 = new Student(5,"ABC");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);

        studentMyList.add(3,student5);

        System.out.println("Size: " + studentMyList.size());

        studentMyList.remove(3);

        System.out.println("Student List: ");
        for (int i = 0; i < studentMyList.size(); i++){
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }

    }
}

