public class Atividade1 {
    // Atributos
    private String nome;
    private String raca;
    private String pata;

    public Atividade1(String nome, String raca, String pata) {
        this.nome = nome;
        this.raca = raca;
        this.pata = pata;
    }

    // Métodos
    public void latir() {
        System.out.println("O" + nome + " está latindo!");
    }

    public void dar_patinha() {
        System.out.println(nome + " esta te comprimentando ");
    }

    public void mostrarDetalhes() {
        System.out.println("Cachorro: " + nome + ", Raça: " + raca + ", Idade: " + pata + " anos.");
    }

}
