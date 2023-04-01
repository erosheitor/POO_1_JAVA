package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class Frota extends BaseTransporte {

    protected List<Veiculo> veiculos;

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Frota(int codigo, String _descricao, LocalDate dataInsert) {
        super(codigo, _descricao, dataInsert);
    }

    public Frota() {
    }

}
