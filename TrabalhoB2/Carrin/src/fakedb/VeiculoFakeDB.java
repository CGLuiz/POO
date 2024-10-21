package fakedb;

import java.util.ArrayList;

import dominio.Veiculo;

public class VeiculoFakeDB {
    private ArrayList<Veiculo> tabela;

    public ArrayList<Veiculo> getTabela() {
        return tabela;
    }

    private void preencherdados(){
        this. tabela = new ArrayList<Veiculo>();
        this.tabela.add(new Veiculo(1, "Volkswagen", "Gol", 1999, 9891));
        this.tabela.add(new Veiculo(2, "Nissan", "Sandero", 2013, 30706));
        this.tabela.add(new Veiculo(3, "Mitsubishi", "Lancer", 2007, 79546));
    }

    public VeiculoFakeDB(){
        this.preencherdados();
    }
}
