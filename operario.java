public class operario extends empregado{
    private double valorProducao;
    private double comissao;
    public operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao){
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    public operario(){
        super();
        this.valorProducao = 0;
        this.comissao = 0;
    }
    public double getValorProducao(){
        return this.valorProducao;
    }
    public void setValorProducao(double valorProducao){
        this.valorProducao = valorProducao;
    }
    public double getComissao(){
        return this.comissao;
    }
    public void setComissao(double comissao){
        this.comissao = comissao;
    }
   public double calcularSalario() {
       return getSalarioBase() + (getValorProducao() * (getComissao() / 100)) - getImposto();
   }
    
}