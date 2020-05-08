/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simplesinformatica.RFBApi.dto;

import br.com.simplesinformatica.RFBApi.model.Empresa;

public class EmpresaDTO extends DTOAbstract<Empresa>{
    
    private String cnpj;
    private String tipoEmpresa;
    private String razaoSocial;
    private String nomeFantasia;
    private String situacaoCadastral;

    public EmpresaDTO(){
        super();
    }
    
    public EmpresaDTO(Empresa modelo) {
        super(modelo);
        this.cnpj = modelo.getCnpj();
        this.tipoEmpresa = modelo.getTipoEmpresa();
        this.razaoSocial = modelo.getRazaoSocial();
        this.nomeFantasia = modelo.getNomeFantasia();
        this.situacaoCadastral = modelo.getSituacaoCadastral();
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setSituacaoCadastral(String situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }
    
}
