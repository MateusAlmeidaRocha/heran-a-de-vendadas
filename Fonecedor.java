public class Fonecedor extends Pessoa{
  private double valorCredito;
  private double valorDivida;
  public Fonecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida){
    super(nome, endereco, telefone);
    this.valorCredito = valorCredito;
    this.valorDivida = valorDivida;
  }
  public Fonecedor(){
    super();
    this.valorCredito = 0;
    this.valorDivida = 0;
  }
  public double getValorCredito(){
    return this.valorCredito;
  }
  public void setValorCredito(double valorCredito){
    this.valorCredito = valorCredito;
  }
  public double getValorDivida(){
    return this.valorDivida;
  }
  public void setValorDivida(double valorDivida){
    this.valorDivida = valorDivida;
  }
  public double obterSaldo(){
    return this.valorCredito - this.valorDivida;
  }
}
