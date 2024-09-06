public class Pessoa {
    private String nome;
    private char sexo;
    private int anoNascimento;

    public Pessoa(String nome, char sexo, int anoNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.anoNascimento = anoNascimento;
    }

    public void cumprimentar() {
        if (sexo == 'M') {
            System.out.println("Olá, " + nome + " e um prazer conhecelo");
        } else if (sexo == 'F') {
            System.out.println("Olá, Sra. " + nome + "e um prazer conhecela");
        } else {
            System.out.println("Olá, " + nome + "!");
        }
    }

    public int calcularIdade() {
        int anoAtual = 2023; // assume current year is 2023
        return anoAtual - anoNascimento;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("BRUNO", 'M', 2005);
        pessoa.cumprimentar();
        System.out.println("Idade: " + pessoa.calcularIdade());
    }
}