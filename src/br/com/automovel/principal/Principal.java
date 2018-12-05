package br.com.automovel.principal;

import br.com.automovel.util.UtilFormat;
import br.com.automovel.negocio.ManterAutomovelNegocio;
import br.com.automovel.entidade.Automovel;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Automovel umAutomovel = new Automovel();

        String opcao = "";

        do {
            opcao = JOptionPane.showInputDialog("###GERENCIAMENTO DE AUTOMOVEIS###\r\n"
                    + "\r\n1) Inserir"
                    + "\r\n2) Alterar"
                    + "\r\n3) Pesquisar"
                    + "\r\n4) Excluir "
                    + "\r\n0) Sair\r\n");
            switch (opcao) {
                case "1": // Inserir Automovel //
                    
                    String modeloAutomovel = JOptionPane.showInputDialog("Modelo: ");
                    String marcaAutomovel = JOptionPane.showInputDialog("Marca: ");
                    String placaAutomovel = JOptionPane.showInputDialog("Placa: ");
                    String anoAutomovel = JOptionPane.showInputDialog("Ano: ");
                   
                    Integer anoAut = UtilFormat.StringParaInteiro(anoAutomovel);
                    JOptionPane.showMessageDialog(null, "###DADOS DO AUTOMOVEL INSERIDO###\r\n\r\n" + "Modelo: " + modeloAutomovel + "\r\n" 
                            + "Marca: " + marcaAutomovel + "\r\n" + "Placa: " + placaAutomovel + "\r\n" + "Ano: " + anoAutomovel + "\r\n");
                    ManterAutomovelNegocio.inserirAutomovel(modeloAutomovel, marcaAutomovel, placaAutomovel, anoAut);
                    break;

                case "2": // Alterar Automovel //

                    String modeloAlt = JOptionPane.showInputDialog("Insira o Modelo para Alterar: ");
                    String marcaAlt = JOptionPane.showInputDialog("Insira o Marca para Alterar: ");
                    String placa = JOptionPane.showInputDialog("Insira o Placa do Carro que Deseja Alterar: ");

                    JOptionPane.showMessageDialog(null, " ----Menu----\r\n\r\n" + placa + marcaAlt + modeloAlt);
                    ManterAutomovelNegocio.alterarAutomovel(placa, modeloAlt, marcaAlt);
                    break;

                case "3": // Pesquisar Automovel //

                    String pesquisaUm = JOptionPane.showInputDialog("Pesquisar por Placa: ");
                    String pesquisaTermo = JOptionPane.showInputDialog("Pesquisar por Termo: ");
                    JOptionPane.showMessageDialog(null, " ----Menu----\r\n" + pesquisaUm + pesquisaTermo);
                    ManterAutomovelNegocio.pesquisarUmAutomovel(pesquisaUm);
                    ManterAutomovelNegocio.pesquisarAutomovel(pesquisaTermo);
                    break;

                case "4": // Excluir Automovel //

                    String placaExcluir = JOptionPane.showInputDialog("Insira a placa do Carro para Excluir: ");
                    JOptionPane.showMessageDialog(null, " ----Menu----\r\n" + placaExcluir);
                    ManterAutomovelNegocio.excluirAutomovel(placaExcluir);

                    break;
            }
        } while (!opcao.equals("0"));

        ManterAutomovelNegocio.buscarTermoEImprimir("A");
        ManterAutomovelNegocio.buscarTermoEImprimir("B");
        ManterAutomovelNegocio.buscarTermoEImprimir("C");
    }

}
