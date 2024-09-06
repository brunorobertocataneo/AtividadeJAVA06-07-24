public class Cachorro {
    // Atributos
    private String nome;
    private String raca;
    private int pata; // assume pata is the number of paws

    public Cachorro(String nome, String raca, int pata) {
        this.nome = nome;
        this.raca = raca;
        this.pata = pata;
    }

    // Métodos
    public void latir() {
        System.out.println("O " + nome + " está latindo!");
    }

    public void dar_patinha() {
        if (pata > 0) {
            System.out.println(nome + " está te dando uma patinha!");
        } else {
            System.out.println(nome + " não tem patas para dar.");
        }
    }

    public void mostrarDetalhes() {
        System.out.println("Cachorro: " + nome + ", Raça: " + raca + ", Patas: " + pata);
    }

    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("TOBI", "Vira-lata", 4);
        meuCachorro.mostrarDetalhes();
        meuCachorro.latir();
        meuCachorro.dar_patinha();
    }
}