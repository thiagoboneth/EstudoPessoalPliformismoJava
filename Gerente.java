public class Gerente extends  Funcionario{

    private  int senha;


    public Gerente(String nome, String cpf, double salario, int tipoFuncionario, int senha) {
        super(nome, cpf, salario, tipoFuncionario);
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

    //public double getBonificacao(){
    //    return this.
    //}
}
