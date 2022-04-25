package code;

import java.util.Comparator;

import code.modelo.Funcionario;

public class OrdenaPorIdade implements Comparator<Funcionario>{

    @Override
    public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        return funcionario.getIdade() - outroFuncionario.getIdade();
    }

}