package estudante02;

public class Main {
    public static void main(String[] args) {
        double[] notas1 = {7, 4, 3};
        double[] notas2 = {7, 8.5, 10};
        Estudante02 conta1 = new Estudante02("Enzo", 20, notas1);
        Estudante02 conta2 = new Estudante02("Ramiro", 18, notas2);

        System.out.println(conta1.getEstudante());
    }
}
