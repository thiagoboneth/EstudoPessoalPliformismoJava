public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private int tipoFuncionario = 0;


    public Funcionario(String nome, String cpf, double salario, int tipoFuncionario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.tipoFuncionario = tipoFuncionario;
    }

    public int getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(int tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public double getBonificacao() {
        if (this.tipoFuncionario == 0) {
            return this.salario * 0.1;
        } else if (this.tipoFuncionario == 1) {
            return this.salario;
        }else {
            return this.salario + 1000.00;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
