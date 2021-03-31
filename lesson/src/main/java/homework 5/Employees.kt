package `homework 5`

    public class Employees {
        private String name;
        private String surname;
        private String patronymic;
        private String post;
        private String email;
        private String phone;
        private String salary;
        private String age;

        public Employees() {

        }
    public String getName() {
         return name;
}
    public void setName(String name) {
        this.name = name;
    }
        public String getSurname() {
            return surname;
        }
        public void setSurname(String surname) {
            this.surname = surname;
        }
        public String getPatronymic() {
            return patronymic;
        }
        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }
        public String getPost() {
            return post;
        }
        public void setPost(String post) {
            this.post = post;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public int getPhone() {
            return phone;
        }
        public void setPhone(int phone) {
            this.phone = phone;
        }
        public int getSalary() {
            return salary:
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public static void main(String[] args) {
            Employees[] emArray = new Employees[5];
            emArray[0] = new Employees("Ivanov Ivan", "Teacher", "ivan53@gmail", "333333", "30333", "33");
            emArray[1] = new Employees("Petrov Petr", "Doctor", "petr93@gmail", "333339", "50000", "41");
            emArray[2] = new Employees("Dulaeva Zarina", "Manager", "izaika@gmail", "120033", "35000", "34");
            emArray[3] = new Employees("Novikova Eva", "Tester", "eva86@gmail", "639067", "90000", "45");
            emArray[4] = new Employees("Vasuta Viktor", "Student", "vasuta@gmail", "830475", "25000", "40");
            for (int i = 0; i < emArray.length; i++);
            if ( age >= 40) {
            } System. out. println (emArray[]);
        }

}