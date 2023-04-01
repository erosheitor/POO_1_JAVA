package br.com.atacado.dominio;

import java.time.LocalDate;

public class Veiculo extends BaseTransporte {

    protected int codigoFrota;

    protected String placa;

    public int getCodigoFrota() {
        return codigoFrota;
    }

    public void setCodigoFrota(int codigoFrota) {
        this.codigoFrota = codigoFrota;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Veiculo(int codigo, String _descricao, LocalDate dataInsert, int codigoFrota, String placa) {
        super(codigo, _descricao, dataInsert);
        this.codigoFrota = codigoFrota;
        this.placa = placa;
    }

    public Veiculo() {
    }

}
