/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simplesinformatica.RFBApi.model;

import br.com.simplesinformatica.RFBApi.dto.EmpresaDTO;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity(name = "empresa")
public class Empresa extends ModelAbstract<Empresa>{
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Long id;
    
    @Column(name = "tipo_atualizacao")
    private String tipoAtualizacao;//Enum
    
    @Id
    @Column(name = "cnpj")
    private String cnpj;
    
    @Column(name = "tipo_empresa")
    private String tipoEmpresa;
    
    @Column(name = "razao_social")
    private String razaoSocial;
    
    @Column(name = "nome_fantasia")
    private String nomeFantasia;
    
    @Column(name = "situacao_cadastral")
    private String situacaoCadastral;//Enum
    
    @Column(name = "data_situacao_cadastral")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataSituacaoCadastral;
    
    @Column(name = "motivo_situacao_cadastral")
    private String motivoSituacaoCadastral;
    
    @Column(name = "codigo_natureza_juridica")
    private String codigoNaturezaJuridica;
    
    @Column(name = "data_inicio_atividade")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataInicioAtividade;
    
    @Column(name = "cnae_fiscal")
    private String cnaeFiscal;
    
    @Column(name = "telefone1")
    private String telefone1;
    
    @Column(name = "telefone2")
    private String telefone2;
    
    @Column(name = "fax")
    private String fax;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "qualificador_do_responsavel")
    private String qualificadorResponsavel;
    
    @Column(name = "capital_social")
    private String capitalSocial;
    
    @Column(name = "porte_da_empresa")
    private String porteDaEmpresa;//Enum
    
    @Column(name = "opcao_do_simples")
    private String opcaoDoSimples;//Enum
    
    @Column(name = "data_opcao_do_simples")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataOpcaoDoSimples;
    
    @Column(name = "data_exclusao_do_simples")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataExclusaoDoSimples;
    
    @Column(name = "opcao_pelo_mei")
    private String opcaoPeloMei;//Enum
    
    @Column(name = "situacao_especial")
    private String situacaoEspecial;
    
    @Column(name = "data_situacao_especial")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataSituacaoEspecial;
    
    @OneToMany(mappedBy = "empresa")
    private List<Socio> socios;
    
    public Empresa() {
        super();
    }
    public Empresa(EmpresaDTO empresaDTO){
        super(empresaDTO);
        this.cnpj = empresaDTO.getCnpj();
        this.nomeFantasia = empresaDTO.getNomeFantasia();
        this.situacaoCadastral = empresaDTO.getSituacaoCadastral();
        this.tipoEmpresa = empresaDTO.getTipoEmpresa();
    }

    public String getTipoAtualizacao() {
        return tipoAtualizacao;
    }

    public void setTipoAtualizacao(String tipoAtualizacao) {
        this.tipoAtualizacao = tipoAtualizacao;
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

    public Calendar getDataSituacaoCadastral() {
        return dataSituacaoCadastral;
    }

    public void setDataSituacaoCadastral(Calendar dataSituacaoCadastral) {
        this.dataSituacaoCadastral = dataSituacaoCadastral;
    }

    public String getMotivoSituacaoCadastral() {
        return motivoSituacaoCadastral;
    }

    public void setMotivoSituacaoCadastral(String motivoSituacaoCadastral) {
        this.motivoSituacaoCadastral = motivoSituacaoCadastral;
    }

    public String getCodigoNaturezaJuridica() {
        return codigoNaturezaJuridica;
    }

    public void setCodigoNaturezaJuridica(String codigoNaturezaJuridica) {
        this.codigoNaturezaJuridica = codigoNaturezaJuridica;
    }

    public Calendar getDataInicioAtividade() {
        return dataInicioAtividade;
    }

    public void setDataInicioAtividade(Calendar dataInicioAtividade) {
        this.dataInicioAtividade = dataInicioAtividade;
    }

    public String getCnaeFiscal() {
        return cnaeFiscal;
    }

    public void setCnaeFiscal(String cnaeFiscal) {
        this.cnaeFiscal = cnaeFiscal;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualificadorResponsavel() {
        return qualificadorResponsavel;
    }

    public void setQualificadorResponsavel(String qualificadorResponsavel) {
        this.qualificadorResponsavel = qualificadorResponsavel;
    }

    public String getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(String capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public String getPorteDaEmpresa() {
        return porteDaEmpresa;
    }

    public void setPorteDaEmpresa(String porteDaEmpresa) {
        this.porteDaEmpresa = porteDaEmpresa;
    }

    public String getOpcaoDoSimples() {
        return opcaoDoSimples;
    }

    public void setOpcaoDoSimples(String opcaoDoSimples) {
        this.opcaoDoSimples = opcaoDoSimples;
    }

    public Calendar getDataOpcaoDoSimples() {
        return dataOpcaoDoSimples;
    }

    public void setDataOpcaoDoSimples(Calendar dataOpcaoDoSimples) {
        this.dataOpcaoDoSimples = dataOpcaoDoSimples;
    }

    public Calendar getDataExclusaoDoSimples() {
        return dataExclusaoDoSimples;
    }

    public void setDataExclusaoDoSimples(Calendar dataExclusaoDoSimples) {
        this.dataExclusaoDoSimples = dataExclusaoDoSimples;
    }

    public String getOpcaoPeloMei() {
        return opcaoPeloMei;
    }

    public void setOpcaoPeloMei(String opcaoPeloMei) {
        this.opcaoPeloMei = opcaoPeloMei;
    }

    public String getSituacaoEspecial() {
        return situacaoEspecial;
    }

    public void setSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    public Calendar getDataSituacaoEspecial() {
        return dataSituacaoEspecial;
    }

    public void setDataSituacaoEspecial(Calendar dataSituacaoEspecial) {
        this.dataSituacaoEspecial = dataSituacaoEspecial;
    }
    
    
}
