public interface Service {
    void updateStudent(Long id, String name, String lastName);

    Student getStudentById(Long id);

    Boolean getName(String name);

    int getCountAge(int age);

    Student[] getAllStudents();
}
