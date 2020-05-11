/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simplesinformatica.RFBApi.dto;

import br.com.simplesinformatica.RFBApi.model.Socio;
import java.util.Calendar;


public class SocioDTO extends DTOAbstract<Socio>{

    
    private String identificadorDoSocio;
    private String nome;
    private String cnpjCpf;
    private Calendar dataEntradaNaSociedade;
    private EmpresaDTO empresaDTO;
    
    public SocioDTO() {
    }

    public SocioDTO(Socio modelo) {
        super(modelo);
        setIdentificadorDoSocio(modelo.getIdentificadorDoSocio());
        setNome(modelo.getNome());
        setCnpjCpf(modelo.getCnpjCpf());
        setDataEntradaNaSociedade(modelo.getDataEntradaNaSociedade());
        setEmpresaDTO(new EmpresaDTO(modelo.getEmpresa()));
    }

    public String getIdentificadorDoSocio() {
        return identificadorDoSocio;
    }

    public void setIdentificadorDoSocio(String identificadorDoSocio) {
        this.identificadorDoSocio = identificadorDoSocio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public Calendar getDataEntradaNaSociedade() {
        return dataEntradaNaSociedade;
    }

    public void setDataEntradaNaSociedade(Calendar dataEntradaNaSociedade) {
        this.dataEntradaNaSociedade = dataEntradaNaSociedade;
    }

    public EmpresaDTO getEmpresaDTO() {
        return empresaDTO;
    }

    public void setEmpresaDTO(EmpresaDTO empresaDTO) {
        this.empresaDTO = empresaDTO;
    }
    
}
