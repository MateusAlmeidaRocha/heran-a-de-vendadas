public class vendedor extends empregado{
  private double valorVendas;
  private double comissao;
  public vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao){
    super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
    this.valorVendas = valorVendas;
    this.comissao = comissao;
  }
  public vendedor(){
    super();
    this.valorVendas = 0;
    this.comissao = 0;
  }
  public double getValorVendas(){
    return this.valorVendas;
  }
  public void setValorVendas(double valorVendas){
    this.valorVendas = valorVendas;
  }
  public double getComissao(){
    return this.comissao;
  }
  public void setComissao(double comissao){
    this.comissao = comissao;
  }
  @Override
  public double calcularSalario(){
    return getSalarioBase() + (getValorVendas() * (getComissao() / 100)) - getImposto();
  }
}