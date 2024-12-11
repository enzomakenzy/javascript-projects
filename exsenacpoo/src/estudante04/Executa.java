package estudante04;

public class Executa {
    public static void main(String[] args) {
        Student estudante1 = new Student("Enzo", 21, "enzo@email.com", true);
        Student estudante2 = new Student("Layza", 25, "ramiro@email.com", false);
        Student estudante3 = new Student("Vanessa", 22, "vanessa@email.com", true);
        Student estudante4 = new Student("Erik", 20, "erik@email.com", false);

        estudante2.enrollStudent();
        estudante3.enrollStudent();
        estudante4.disenrollStudent();

        estudante2.showDetails();

        System.out.println(estudante3.getName());
        System.out.println(estudante1.getEmail());

        System.out.println("");

        Course curso = new Course("Técnico em Análise e Desenvolvimento de Sistemas", "Forma profissionais capacitados para desenvolver, implementar e manter sistemas computacionais, com foco na análise de requisitos, modelagem de soluções e desenvolvimento de softwares.", 1200);

        curso.addNewStudentToTheCourse(estudante1); 
        curso.addNewStudentToTheCourse(estudante2);
        curso.addNewStudentToTheCourse(estudante3);
        curso.addNewStudentToTheCourse(estudante4);  
        
        curso.addNewStudentToTheCourse(estudante3);
        
        curso.showStudentsList();
        
    }
}
