
public class Main {
    /**
     * Задача ServiceImpl'дын ичиндеги методтоду ишке ашыруу керек
     * <p>
     * 1 - метод бул студенти id полясы менен табып и ошол студентин атын и фамилиясын озгортуу
     * 2 - метод бул студенти id полясы менен табып консолго чыгаруу
     * 3 - метод boolean кайтарат эгер биз издеген ат болсо
     * 4 - метод биз берген жаштын санын чыгарат
     * 5 - бул баардык студенттерди чыгаруу
     * <p>
     * Баардык методторду Майн класстан чыкырып иштетуу керек
     *
     * Cтуденттердин обьектилерин Майн класстан тузуп SerivceImpl классынын ичиндеги поляга конструктор аркылуу салсаныз болот
     * <p>
     * 1 - жана 2 методтто Id полясы менен таппай калса анда анда - мындай студент жок деп чыгуусу керек
     * <p>
     * Методтордун атын кайтаруу тибин параметрин озгортууго болбойт
     * <p>
     * *
     */
    public static void main(String[] args) {
        Student student0 = new Student(1L,"Zhumadil","Abdykadyrov",1999);
        Student student1 = new Student(2L,"Русланбек","Тайполотов",1996);
        Student student2 = new Student(3L,"Нарынбек","Нурбек уулу",1998);
        Student student3 = new Student(4L,"Аксана","Чырмашева",1999);
        Student student4 = new Student(5L,"Мунараl","Аралбек кызы",1994);
        Student student5 = new Student(6L,"Айгерим","Базарбекова",1998);
        Student student6 = new Student(7L,"Нурмухаммед","Акбаралиев",2000);
        Student student7 = new Student(8L,"Зулкумар","Тешебаева",2003);
        Student student8 = new Student(9L,"Айдана","Мамирасулова",2003);
        Student student9 = new Student(10L,"Касиет","Тагаева",1999);
        Student[] students = new Student[]{student0,student1,student2,student3,student4,student5,student6,student7,student8,student9};
        ServiceImpl service = new ServiceImpl(students);
        service.updateStudent(1L,"updateStudent","updateStudent");

        System.out.println(service.getStudentById(5L));
        System.out.println(service.getName("Нарынбек"));
        System.out.println(service.getCountAge(23));
        for (int i = 0; i < service.getAllStudents().length; i++) {
            System.out.println(service.getAllStudents()[i]);

        }

    }
}