package br.techcorp.main;

import br.techcorp.departamento.Departamento;
import br.techcorp.funcionario.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("trr", "Rodrigo", "gerente", 5000, 30,
                1);

        Departamento departamento = new Departamento("T101", "TI", 300);
        departamento.addFuncionario(f1);
    }
}
