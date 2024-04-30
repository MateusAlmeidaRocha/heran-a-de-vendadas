public class administrador extends empregado {
    private double ajudaDeCusto;

    public administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public administrador() {
        super();
        this.ajudaDeCusto = 0;
    }

    public double getAjudaDeCusto() {
        return this.ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase() - getImposto() + ajudaDeCusto;
    }
}