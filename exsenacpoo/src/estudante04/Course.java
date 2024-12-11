package estudante04;

import java.util.ArrayList;

public class Course {
   private String course;
    private String description;
    private int workload;
    private ArrayList<Student> students;
    
    public Course(String course, String description, int workload) {
        this.course = course;
        this.description = description;
        this.workload = workload;
        this.students = new ArrayList<>();
    }

    public void showDetailsOfCourse() {
        System.out.println(String.format("""
            ------ DETALHES DO CURSO ------
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            Curso: %s
            Descrição: %s
            Carga horária(horas): %i
            Quantidade de alunos cadastrados: %i
                """, this.course, this.description, this.workload, this.students.size()));
    }

    public void showStudentsList() {
        int i = 1;

        for (Student student : this.students) {
            System.out.println(String.format("%i - %s", i, student.getName()));
            i++;
        }
    }
    
    public void addNewStudentToTheCourse(Student student) {
        if (!students.contains(student)) {
            if (student.verifyEnrollmentStats()) {
                this.students.add(student);
                System.out.println(String.format("Estudante %s adicionado ao curso com sucesso", student.getName()));
            } else {
                System.out.println(String.format("O estudante ainda não está matriculado, não pode ser adicionado ao curso", student.getName()));
            }
        } else {
            System.out.println(String.format("O estudante já está na no curso", student.getName()));
        }
    }
    
    public void removeStudentToTheCourse(Student student) {
        if (students.contains(student)) {
            this.students.remove(student);
            System.out.println(String.format("Estudante %s foi removido do curso", student.getName()));
        } else {
            System.out.println(String.format("O estudante %s não está na lista de estudantes do curso", student.getName()));
        }
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
}
