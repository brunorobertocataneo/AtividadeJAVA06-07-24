public class CarroDeFormula1 {
    private String nomeDaEquipe;
    private int velocidadeAtual;
    private int velocidadeMaxima;
  
    public CarroDeFormula1(String nomeDaEquipe, int velocidadeMaxima) {
      this.nomeDaEquipe = nomeDaEquipe;
      this.velocidadeMaxima = velocidadeMaxima;
      this.velocidadeAtual = 0;
    }
  
    public void acelerar() {
      if (velocidadeAtual + 5 <= velocidadeMaxima) {
        velocidadeAtual += 5;
      } else {
        velocidadeAtual = velocidadeMaxima;
      }
    }
  
    public void frear() {
      if (velocidadeAtual - 10 >= 0) {
        velocidadeAtual -= 10;
      } else {
        velocidadeAtual = 0;
      }
    }
  
    public int getVelocidadeAtual() {
      return velocidadeAtual;
    }
  
    public String getNomeDaEquipe() {
      return nomeDaEquipe;
    }
  
    public int getVelocidadeMaxima() {
      return velocidadeMaxima;
    }
    public static void main(String[] args) {
      CarroDeFormula1 carro = new CarroDeFormula1("RedBull", 340);
      carro.acelerar(); 
      carro.acelerar(); 
      carro.frear(); 
      carro.acelerar(); 
      System.out.println(carro.getVelocidadeAtual()); 
      System.out.println(carro.getNomeDaEquipe()); 
      System.out.println(carro.getVelocidadeMaxima()); 
  }
}