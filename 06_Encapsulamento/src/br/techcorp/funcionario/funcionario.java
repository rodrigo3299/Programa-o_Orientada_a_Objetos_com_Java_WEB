package br.techcorp.funcionario;

public class funcionario {
    private String matricula;
    private String nome;
    private String cargo;
    private double salarioBase;
    private double percentualBonus;
    private boolean ativo;

    public funcionario(String matricula, String nome, String cargo, double salarioBase, double percentualBonus, boolean ativo) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.percentualBonus = percentualBonus;
        this.ativo = true;
    }

    public double calcularSalarioLiquido(){

    }

    public boolean aplicarAumento(double percentual){

    }

    public void aplicarBonus(double percentual){

    }

    public void desligar(){
      this.ativo = false;
      this.percentualBonus = 0;
    }

    public boolean isAtivo(){
        return ativo;

    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}


