/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simplesinformatica.RFBApi.repository;

import br.com.simplesinformatica.RFBApi.model.Empresa;
import br.com.simplesinformatica.RFBApi.model.Socio;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


public interface SocioRepository extends PagingAndSortingRepository<Socio, Long>{
    
    List<Socio> findByEmpresa(Empresa empresa);
}
