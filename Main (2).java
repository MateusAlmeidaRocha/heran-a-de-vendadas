import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome do fornecedor: ");
    String nome = scanner.next();
    System.out.println("Digite o endereço do fornecedor: ");
    String endereco = scanner.next();
    System.out.println("Digite o telefone do fornecedor: ");
    String telefone = scanner.next();
    System.out.println("Digite o valor do crédito do fornecedor: ");
    double valorCredito = scanner.nextDouble();
    System.out.println("Digite o valor da dívida do fornecedor: ");
    double valorDivida = scanner.nextDouble();
    Fonecedor fornecedor = new Fonecedor(nome, endereco, telefone, valorCredito, valorDivida);
    System.out.println("Saldo do fornecedor: " + fornecedor.obterSaldo());

    System.out.println("Digite o nome do operário: ");
    String nomeOperario = scanner.next();
    System.out.println("Digite o endereço do operário: ");
    String enderecoOperario = scanner.next();
    System.out.println("Digite o telefone do operário: ");
    String telefoneOperario = scanner.next();
    System.out.println("Digite o código do setor do operário: ");
    int codigoSetor = scanner.nextInt();
    System.out.println("Digite o salário base do operário: ");
    double salarioBase = scanner.nextDouble();
    System.out.println("Digite o imposto do operário: ");
    double imposto = scanner.nextDouble();
    System.out.println("Digite o valor da produção do operário: ");
    double valorProducao = scanner.nextDouble();
    System.out.println("Digite a comissão do operário: ");
    double comissao = scanner.nextDouble();
    operario operario = new operario(nomeOperario, enderecoOperario, telefoneOperario, codigoSetor, salarioBase, imposto, valorProducao, comissao);
    System.out.println("Salário do operário: " + operario.calcularSalario());

    System.out.println("Digite o nome do vendedor: ");
    String nomeVendedor = scanner.next();
    System.out.println("Digite o endereço do vendedor: ");
    String enderecoVendedor = scanner.next();
    System.out.println("Digite o telefone do vendedor: ");
    String telefoneVendedor = scanner.next();
    System.out.println("Digite o código do setor do vendedor: ");
    int codigoSetorVendedor = scanner.nextInt();
    System.out.println("Digite o salário base do vendedor: ");
    double salarioBaseVendedor = scanner.nextDouble();
    System.out.println("Digite o imposto do vendedor: ");
    double impostoVendedor = scanner.nextDouble();
    System.out.println("Digite o valor da venda do vendedor: ");
    double valorVenda = scanner.nextDouble();
    System.out.println("Digite a comissão do vendedor: ");
    double comissaoVendedor = scanner.nextDouble();
    vendedor vendedor = new vendedor(nomeVendedor, enderecoVendedor, telefoneVendedor, codigoSetorVendedor, salarioBaseVendedor, impostoVendedor, valorVenda, comissaoVendedor);
    System.out.println("Salário do vendedor: " + vendedor.calcularSalario());

    System.out.println("Digite o nome do administrador: ");
    String nomeAdministrador = scanner.next();
    System.out.println("Digite o endereço do administrador: ");
    String enderecoAdministrador = scanner.next();
    System.out.println("Digite o telefone do administrador: ");
    String telefoneAdministrador = scanner.next();
    System.out.println("Digite o código do setor do administrador: ");
    int codigoSetorAdministrador = scanner.nextInt();
    System.out.println("Digite o salário base do administrador: ");
    double salarioBaseAdministrador = scanner.nextDouble();
    System.out.println("Digite o imposto do administrador: ");
    double impostoAdministrador = scanner.nextDouble();
    System.out.println("Digite a ajuda de custo do administrador: ");
    double ajudaDeCusto = scanner.nextDouble();
    administrador administrador = new administrador(nomeAdministrador, enderecoAdministrador, telefoneAdministrador, codigoSetorAdministrador, salarioBaseAdministrador, impostoAdministrador, ajudaDeCusto);
    System.out.println("Salário do administrador: " + administrador.calcularSalario());

    System.out.println("Digite o nome do empregado: ");
    String nomeEmpregado = scanner.next();
    System.out.println("Digite o endereço do empregado: ");
    String enderecoEmpregado = scanner.next();
    System.out.println("Digite o telefone do empregado: ");
    String telefoneEmpregado = scanner.next();
    System.out.println("Digite o código do setor do empregado: ");
    int codigoSetorEmpregado = scanner.nextInt();
    System.out.println("Digite o salário base do empregado: ");
    double salarioBaseEmpregado = scanner.nextDouble();
    System.out.println("Digite o imposto do empregado: ");
    double impostoEmpregado = scanner.nextDouble();
    empregado empregado = new empregado(nomeEmpregado, enderecoEmpregado, telefoneEmpregado, codigoSetorEmpregado, salarioBaseEmpregado, impostoEmpregado);
    System.out.println("Salário do empregado: " + empregado.calcularSalario());
   
  
    
  }
  
}

