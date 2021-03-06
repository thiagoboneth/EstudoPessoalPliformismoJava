package Classes;

public class Gerente extends  Funcionario{

    private  int senha;


    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        System.out.println("Bonificacao gerente");
        return super.getBonificacao() + super.getSalario();
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;
        }else {
            System.out.println("Senha errada");
            return false;
        }
    }
}
