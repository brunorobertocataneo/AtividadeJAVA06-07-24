public class Cachorro {
    // Atributos
    private String nome;
    private String raca;
    private int idade;

    // Construtor
    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Métodos
    public void latir() {
        System.out.println(nome + " está latindo!");
    }

    public void envelhecer() {
        idade++;
        System.out.println(nome + " agora tem " + idade + " anos.");
    }

    public void mostrarDetalhes() {
        System.out.println("Cachorro: " + nome + ", Raça: " + raca + ", Idade: " + idade + " anos.");
    }

    // Getters e Setters (opcional)
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
