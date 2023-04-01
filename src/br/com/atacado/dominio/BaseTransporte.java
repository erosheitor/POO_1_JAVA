package br.com.atacado.dominio;

import java.time.LocalDate;

public abstract class BaseTransporte {

    protected int codigo;

    protected String descricao;

    protected LocalDate dataInsert;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String _descricao) {
        descricao = _descricao;
    }

    public LocalDate getDataInsert() {
        return dataInsert;
    }

    public void setDataInsert(LocalDate dataInsert) {
        this.dataInsert = dataInsert;
    }

    public BaseTransporte(int codigo, String _descricao, LocalDate dataInsert) {
        this.codigo = codigo;
        descricao = _descricao;
        this.dataInsert = dataInsert;
    }

    public BaseTransporte() {
    }

}
