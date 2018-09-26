/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaautomovel;

/**
 *
 * @author Alunos
 */
public class ManterAutomovelNegocio {

    private static Automovel[] AUTOMOVELS = new Automovel[100];
    private static Integer QUANTIDADE = 0;

    public static Automovel[] pesquisarAutomovel(String termo) {
        Automovel[] retornoPesquisa = new Automovel[100];
        Integer quantidadeAutomovelEncontrados = 0;
        for (int i = 0; i < QUANTIDADE; i++) {
            Automovel automovel = AUTOMOVELS[i];
            if (automovel.getMarca().toUpperCase().contains(termo.toUpperCase())
                    || automovel.getModelo().toUpperCase().contains(termo.toUpperCase())
                    || automovel.getPlaca().toUpperCase().contains(termo.toUpperCase())) {
                retornoPesquisa[quantidadeAutomovelEncontrados] = automovel;
                quantidadeAutomovelEncontrados++;
            }
        }
        return retornoPesquisa;
    }

    public static void excluirAutomovel(String placa) {
        for (int i = 0; i < QUANTIDADE; i++) {
            Automovel automovel = AUTOMOVELS[i];
            if (automovel.getPlaca().equalsIgnoreCase(placa)) {
                AUTOMOVELS[i] = null;
                QUANTIDADE--;
            }
        }
    }

    public static void alterarAutomovel(String placa, String modeloAlt, String marcaAlt) {
        for (int i = 0; i < QUANTIDADE; i++) {
            Automovel automovel = AUTOMOVELS[i];
            if (automovel.getPlaca().equalsIgnoreCase(placa)) {
                automovel.setModelo(modeloAlt);
                automovel.setMarca(marcaAlt);

            }
        }

    }

    public static Automovel pesquisarUmAutomovel(String placa) {
        for (int i = 0; i < QUANTIDADE; i++) {
            Automovel automovel = AUTOMOVELS[i];
            if (automovel.getPlaca().equalsIgnoreCase(placa)) {
                return automovel;
            }
        }
        return null;
    }

    public static void inserirAutomovel(String modelo,
            String marca, String placa, Integer ano) {
        if (pesquisarUmAutomovel(placa) != null) {
            return;
        }
        Automovel automovel = new Automovel();
        automovel.setAno(ano);
        automovel.setMarca(marca);
        automovel.setPlaca(placa);
        automovel.setModelo(modelo);
        AUTOMOVELS[QUANTIDADE] = automovel;
        QUANTIDADE++;
    }
    
    public static void buscarTermoEImprimir(String termo) {
        System.out.println("Pesquisando por: " + termo);
        Automovel[] resultados
                = ManterAutomovelNegocio.pesquisarAutomovel(termo);
        for (int i = 0; i < resultados.length; i++) {
            Automovel umAutomovel = resultados[i];
            if (null != umAutomovel) {
                System.out.println(umAutomovel.getModelo() + " - " + umAutomovel.getMarca() + " - " + umAutomovel.getPlaca() + " - " + umAutomovel.getAno());
            }
        }
        System.out.println("---- fim da pesquisa\n");
    }
}
