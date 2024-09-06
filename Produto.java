public class Produto {
    private String nome;
    private double valor;
    private int quantidadeEmEstoque;

    public Produto(String nome, double valor, int quantidadeEmEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void escreverDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    public double calcularValorTotal() {
        return valor * quantidadeEmEstoque;
    }

    public void alterarQuantidade(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
        } else if (quantidade < 0) {
            if (quantidadeEmEstoque + quantidade >= 0) {
                quantidadeEmEstoque += quantidade;
            } else {
                System.out.println("Não é possível ter uma quantidade negativa em estoque.");
            }
        }
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Folha para fichario", 15, 10);
        produto.escreverDados();
        System.out.println("Valor total: R$ " + produto.calcularValorTotal());
        produto.alterarQuantidade(7);
        produto.escreverDados();
        produto.alterarQuantidade(-5);
        produto.escreverDados();
    }
}