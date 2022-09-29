package br.com.Carnaval;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // show input permite que escreva o texto na tela
        // Integer converte string em inteiro
        int opcao;
        String camarote;
        double valor;
        double valorVIP;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Ingresso Normal\n2 - Ingresso VIP\n3 - Ingresso Camarote\n4 - Sair"));
            switch (opcao) {
                case 1:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso: "));
                    Normal ingressoNormal = new Normal(valor);
                    JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngresso(), "Mensagem",JOptionPane.CANCEL_OPTION);
                    break;
                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso"));
                    valorVIP = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso VIP"));
                    VIP ingressoVip = new VIP(valor, valorVIP);
                    JOptionPane.showConfirmDialog(null, ingressoVip.imprimeIngresso(), "Mensagem",JOptionPane.CANCEL_OPTION);
                    break;
                case 3:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso"));
                    valorVIP = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso VIP"));
                    camarote = JOptionPane.showInputDialog("Numero do Camarote");
                    Camarote ingressoCamarote = new Camarote(valor, camarote, valorVIP);
                    JOptionPane.showInputDialog(null, ingressoCamarote.imprimeIngresso(), "Mensagem",JOptionPane.CANCEL_OPTION);
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha corretamente a opção", "", JOptionPane.CANCEL_OPTION);
                    break;

            }

        } while (opcao != 4);
    }
}