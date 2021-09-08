import Classes.ControleBonificacao;
import Classes.EditorVideo;
import Classes.Funcionario;
import Classes.Gerente;

public class Main {

    public static void main(String[] args) {


        Funcionario funcionario1 = new Funcionario("Thiago","531.022.343-30",2600.90);
        Funcionario funcionario2 = new Funcionario("Nico","678.728.983-49",5500.00);
        Funcionario funcionario3 = new EditorVideo("Carlos","516.506.345.48",2500);
        Funcionario funcionario4 = new Gerente("Luis","521.254.623-20",7000,251025);

        ControleBonificacao controle = new ControleBonificacao();

//        controle.registra(funcionario1);
        controle.registra(funcionario3);
//        controle.registra(funcionario4);


        System.out.println(controle.getSoma());


//        System.out.println(g1.getSalario());
//        System.out.println(g1.getBonificacao());

//        System.out.println(((Gerente) g1).autentica(0));

//        System.out.println(funcionario1.getTipoFuncionario());
//        System.out.println(funcionario1.getBonificacao());

//        System.out.println(funcionario2.getTipoFuncionario());
//        System.out.println(funcionario2.getBonificacao());

    }
}
