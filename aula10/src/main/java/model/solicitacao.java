/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Unicesumar
 */
public class solicitacao {
    
    private String data;
    private String curso;
    private String qtdVaga;
    private String periodo;
    private String campoEstagio;
    private String instituicao;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getQtdVaga() {
        return qtdVaga;
    }

    public void setQtdVaga(String qtdVaga) {
        this.qtdVaga = qtdVaga;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getCampoEstagio() {
        return campoEstagio;
    }

    public void setCampoEstagio(String campoEstagio) {
        this.campoEstagio = campoEstagio;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    
    
    
}
