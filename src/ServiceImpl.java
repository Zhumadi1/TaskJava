public class ServiceImpl implements Service {
    private Student[] students = new Student[10];

    public ServiceImpl(Student[] students) {
        this.students = students;
    }

    @Override
    public void updateStudent(Long id, String name, String lastName) {
        boolean bool = true;
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setLastName(lastName);
                System.out.println(student);
                bool = false;
            }
        }
        if (bool) {
            System.out.println("мындай студент жок");
        }
    }

    @Override
    public Student getStudentById(Long id) {
        boolean bool = true;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                bool = false;
                return students[i];
            }
        }
        if (bool) {
            System.out.println("мындай студент жок");
        }
        return null;
    }

    @Override
    public Boolean getName(String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getCountAge(int age) {
        int year = 2023;
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            int age1 = year - students[i].getAge();
            if (age1 == age) {
                count++;
            }
        }
        return count;
    }

    @Override
    public Student[] getAllStudents() {

        return students;
    }
}
