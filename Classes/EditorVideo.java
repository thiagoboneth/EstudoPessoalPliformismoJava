package Classes;

public class EditorVideo extends Funcionario{


    public EditorVideo(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        System.out.println("bonificacao editor");
        return super.getBonificacao() + 100;
    }
}
