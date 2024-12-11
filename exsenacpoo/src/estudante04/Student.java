package estudante04;

public class Student {
    private String name;
    private int age;
    private String email;
    private boolean enroll;
    
    public Student(String name, int age, String email, boolean enroll) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.enroll = enroll;
    }

    public void showDetails() {
        String status = "";

        if (this.enroll) {
            status = "Matriculado";
        } else {
            status = "Não matriculado";
        }

        System.out.printf("""
            ------DETALHES DO ESTUDANTE------
            =================================
            Nome: %s
            Idade: %d    
            Email: %s
            Matricula: %s
            """, this.name, this.age, this.email, status);
    }

    public void disenrollStudent() {
        if (this.enroll) {
            this.enroll = false;
            System.out.println(String.format("Estudante %s desmatriculado.", this.name));
        } else {
            System.out.println(String.format("O estudante %s já se encontra desmatrículado", this.name));
        }
    }

    public void enrollStudent() {
        if (!this.enroll) {
            this.enroll = true;
            System.out.println(String.format("Estudante %s matriculado.", this.name));
        } else {
            System.out.println(String.format("O estudante %s já se encontra matrículado.", this.name));
        }
    }

    // Método para verificar la na classe curso
    public boolean verifyEnrollmentStats() {
        return this.enroll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
