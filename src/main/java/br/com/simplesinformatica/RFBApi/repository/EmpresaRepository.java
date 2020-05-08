/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simplesinformatica.RFBApi.repository;

import br.com.simplesinformatica.RFBApi.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RicardoJr
 */
@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
    
    Empresa findByCnpj(String cnpj);
    
}