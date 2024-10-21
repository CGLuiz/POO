package visao;

import java.util.ArrayList;

import dominio.Veiculo;
import fakedb.VeiculoFakeDB;

public class VeiculoVisao {
    public VeiculoVisao(){
    }

    public void Exibir(){
        VeiculoFakeDB db = new VeiculoFakeDB();
        ArrayList<Veiculo> lista = db.getTabela();
        for (Veiculo cp : lista){
            System.out.println("Classe de veiculo:");
            System.out.println("Código: " + cp.getCodigo());
            System.out.println("Marca: " + cp.getMarca());
            System.out.println("Modelo: " + cp.getModelo());
            System.out.println("Ano: " + cp.getAnoFabricacao());
            System.out.println("Preço: " + cp.getPreco());
        }
    }
}
