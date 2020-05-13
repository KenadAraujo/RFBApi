/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simplesinformatica.RFBApi.model;

import br.com.simplesinformatica.RFBApi.dto.SocioDTO;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "socio")
public class Socio extends ModelAbstract<Socio>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "tipo_atualizacao")
    private String tipoAtualizacao;//Enum
    
    //@ManyToOne(fetch = FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name = "cnpj_da_empresa")
    private Empresa empresa;
    
    @Column(name = "identificador_do_socio")
    private String identificadorDoSocio;//Enum
    
    @Column(name = "nome_do_socio")
    private String nome;
    
    @Column(name = "cnpj_cpf_socio")
    private String cnpjCpf;
    
    @Column(name = "codigo_qualificacao_socio")
    private String codigoQualificacao;
    
    @Column(name = "percentual_capital_social")
    private String percentualCapitalSocial;
    
    @Column(name = "data_entrada_na_sociedade")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataEntradaNaSociedade;
    
    @Column(name = "codigo_do_pais")
    private String codigoDoPais;
    
    @Column(name = "nome_pais_socio")
    private String nomePaisSocio;
    
    @Column(name = "cpf_representante_legal")
    private String cpfRepresentanteLegal;
    
    @Column(name = "nome_representante_legal")
    private String nomeRepresentanteLegal;
    
    @Column(name = "codigo_qualificacao_representante_legal")
    private String codigoQualificacaoRepresentanteLegal;
    
    public Socio() {
    }

    public Socio(SocioDTO dto) {
        super(dto);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoAtualizacao() {
        return tipoAtualizacao;
    }

    public void setTipoAtualizacao(String tipoAtualizacao) {
        this.tipoAtualizacao = tipoAtualizacao;
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

    public String getCodigoQualificacao() {
        return codigoQualificacao;
    }

    public void setCodigoQualificacao(String codigoQualificacao) {
        this.codigoQualificacao = codigoQualificacao;
    }

    public String getPercentualCapitalSocial() {
        return percentualCapitalSocial;
    }

    public void setPercentualCapitalSocial(String percentualCapitalSocial) {
        this.percentualCapitalSocial = percentualCapitalSocial;
    }

    public Calendar getDataEntradaNaSociedade() {
        return dataEntradaNaSociedade;
    }

    public void setDataEntradaNaSociedade(Calendar dataEntradaNaSociedade) {
        this.dataEntradaNaSociedade = dataEntradaNaSociedade;
    }

    public String getCodigoDoPais() {
        return codigoDoPais;
    }

    public void setCodigoDoPais(String codigoDoPais) {
        this.codigoDoPais = codigoDoPais;
    }

    public String getNomePaisSocio() {
        return nomePaisSocio;
    }

    public void setNomePaisSocio(String nomePaisSocio) {
        this.nomePaisSocio = nomePaisSocio;
    }

    public String getCpfRepresentanteLegal() {
        return cpfRepresentanteLegal;
    }

    public void setCpfRepresentanteLegal(String cpfRepresentanteLegal) {
        this.cpfRepresentanteLegal = cpfRepresentanteLegal;
    }

    public String getNomeRepresentanteLegal() {
        return nomeRepresentanteLegal;
    }

    public void setNomeRepresentanteLegal(String nomeRepresentanteLegal) {
        this.nomeRepresentanteLegal = nomeRepresentanteLegal;
    }

    public String getCodigoQualificacaoRepresentanteLegal() {
        return codigoQualificacaoRepresentanteLegal;
    }

    public void setCodigoQualificacaoRepresentanteLegal(String codigoQualificacaoRepresentanteLegal) {
        this.codigoQualificacaoRepresentanteLegal = codigoQualificacaoRepresentanteLegal;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
}
