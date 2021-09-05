public class Main {

    public static void main(String[] args) {


        Funcionario funcionario1 = new Funcionario("Thiago","531.022.343-30",2600.90, 0);
        Funcionario funcionario2 = new Funcionario("Nico","678.728.983-49",5500.00,1);

        Gerente g1 = new Gerente("Luis","521.254.623-20",7000,1,251025);

        System.out.println(g1.autentica(0));

        System.out.println(funcionario1.getTipoFuncionario());
        System.out.println(funcionario1.getBonificacao());

        System.out.println(funcionario2.getTipoFuncionario());
        System.out.println(funcionario2.getBonificacao());
    }
}
