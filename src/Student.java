
    public class Student {
        private Long id;
        private String name;
        private String lastName;
        private int yearOfBirth;

        public Student(Long id, String name, String lastName, int yearOfBirth) {
            this.id = id;
            this.name = name;
            this.lastName = lastName;
            this.yearOfBirth = yearOfBirth;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return yearOfBirth;
        }

        public void setAge(int age) {
            this.yearOfBirth = age;
        }

        @Override
        public String toString() {
            return "Student" +
                    " id " + id +
                    " name " + name +
                    " lastName " + lastName;
        }
    }

