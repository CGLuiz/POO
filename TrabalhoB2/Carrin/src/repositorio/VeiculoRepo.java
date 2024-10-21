package repositorio;

import java.util.ArrayList;

import dominio.Veiculo;
import fakedb.VeiculoFakeDB;

public class VeiculoRepo {
    private VeiculoFakeDB db;

    public VeiculoRepo(){
        this.db = new VeiculoFakeDB();
        this.dados = this.db.getTabela();
    }

    private ArrayList<Veiculo> dados;

    public ArrayList<Veiculo> Browse(){
        return this.dados;
    };

    public Veiculo Read(int chave){
        for (Veiculo cp : this.dados){
            if(cp.getCodigo() == chave){
                return cp;
            }
        }
        return null;
    };

    public Veiculo Edit(Veiculo instancia){
        Veiculo cp = this.Read(instancia.getCodigo());
        if (cp != null){
            cp.setAnoFabricacao(instancia.getAnoFabricacao());
            cp.setMarca(instancia.getMarca());
            cp.setModelo(instancia.getModelo());
            cp.setPreco(instancia.getPreco());
            return cp;
        }
        else{
            return null;
        }
    };

    public Veiculo Add(Veiculo instancia){
        int pos = this.dados.size() - 1;
        Veiculo cp = this.dados.get(pos);
        int proxChave = cp.getCodigo() + 1;
        instancia.setCodigo(proxChave);
        this.dados.add(instancia);
        return instancia;
    };

    public Veiculo Delete(int chave){
        Veiculo cp = this.Read(chave);
        if(cp != null){
            this.dados.remove(cp);
            return cp;
        }
        else{
            return null;
        }
    };
}
