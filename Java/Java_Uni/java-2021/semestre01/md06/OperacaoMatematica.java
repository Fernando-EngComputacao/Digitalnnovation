package semestre01.md06;

import javax.swing.*;

public class OperacaoMatematica implements CalcInterface {

    //Methods
    @Override
    public void fatorial() {
        Double valor = Math.abs(entrada("valor para FATORIAL!"));
        Double arm = valor;
        Double aux = 1.0;
        while (valor > 0.0) {
            aux *= valor;
            valor--;
        }
        JOptionPane.showMessageDialog(null, "--> O valor do Fatorial " + arm  + "! é: " + aux + "\n");;
    }

    @Override
    public void somar() {
        Double aux = Math.abs(entrada("1° valor da SOMA!"));
        Double aux2 = Math.abs(entrada("2° valor da SOMA!"));

        JOptionPane.showMessageDialog(null, "--> O valor da Soma de (" + aux + ") e (" + aux2 + ") é de: " + (aux + aux2) + "\n");
    }

    @Override
    public void subtrair() {
        Double aux = Math.abs(entrada("1° valor da SUBTRAÇÃO!"));
        Double aux2 = Math.abs(entrada("2° valor da SUBTRAÇÃO!"));

        JOptionPane.showMessageDialog(null, "--> O valor da Subtração de (" + aux + ") por (" + aux2 + ") é de: " +(aux - aux2) + "\n");
    }

    @Override
    public void multiplicar() {
        Double aux = Math.abs(entrada("1° valor da MULTIPLICAÇÃO!"));
        Double aux2 = Math.abs(entrada("2° valor da MULTIPLICAÇÃO!"));

        JOptionPane.showMessageDialog(null, "--> O valor da Multiplicação de (" + aux + ") produto (" + aux2 + ") é de: " + (aux * aux2) + "\n");
    }

    @Override
    public void dividir() {
        Double aux = Math.abs(entrada("1° valor da DIVISÃO!"));
        Double aux2 = Math.abs(entrada("2° valor da DIVISÃO!"));

        JOptionPane.showMessageDialog(null, "--> O valor da Divisão de (" + aux + ") por (" + aux2 + ") é de: " + (aux / aux2) + "\n");
    }

    @Override
    public Double entrada(String texto) {
        return Double.parseDouble(JOptionPane.showInputDialog("Insira o seu " + texto));
    }

    @Override
    public void iniciar() {
        int a = 1;
        String text = "Digite uma OPÇÃO: \n1 - Fatorial;\n2 - Soma;\n3 - Multiplicação";
        text += "\n4 - Subtração;\n5 - Divisão\n0 - Para sair.";
        while (a != 0) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog(text));
            }
            catch (Exception e){
                a = 6;
            }

            switch (a) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Você saiu do software de Operação Matemática!!!");
                    break;
                case 1:
                    fatorial();
                    break;
                case 2:
                    somar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    subtrair();
                    break;
                case 5:
                    dividir();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "DIGITE UMA ENTRADA VÁLIDA!");
                    break;
            }

        }
    }
}
