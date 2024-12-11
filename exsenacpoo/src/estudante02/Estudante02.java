package estudante02;
public class Estudante02 {
    public String estudante;
    public int idade;
    public double[] notas;

    public Estudante02(String estudante, int idade, double[] notas) {
        this.estudante = estudante;
        this.idade = idade;
        this.notas = notas;
    }

    public void calcularMedia() {
        double soma = 0;

        for (double nota : this.notas) {
            soma += nota;
        }

        double media = soma / this.notas.length;
        System.out.println(String.format("A média escolar do aluno %s foi de %f", this.estudante, media));
    }

    public String getEstudante() {
        return estudante;
    }

    public void setEstudante(String estudante) {
        this.estudante = estudante;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
