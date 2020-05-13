/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simplesinformatica.RFBApi.controller;

import br.com.simplesinformatica.RFBApi.dto.EmpresaDTO;
import br.com.simplesinformatica.RFBApi.dto.SocioDTO;
import br.com.simplesinformatica.RFBApi.model.Empresa;
import br.com.simplesinformatica.RFBApi.model.Socio;
import br.com.simplesinformatica.RFBApi.repository.EmpresaRepository;
import br.com.simplesinformatica.RFBApi.repository.SocioRepository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    
    @Autowired
    EmpresaRepository empresaRepository;

    @Autowired
    SocioRepository SocioRepository;
    
    @GetMapping(path = "/")
    public ResponseEntity buscarTodasAsEmpresa(@RequestParam(defaultValue = "0") Integer paginaNumero, 
                                                            @RequestParam(defaultValue = "10") Integer tamanhoPagina,
                                                            @RequestParam(defaultValue = "cnpj") String ordenarPor){
        Pageable paging = PageRequest.of(paginaNumero, tamanhoPagina, Sort.by(ordenarPor));
        Page<Empresa> empresas = empresaRepository.findAll(paging);
        List<Empresa> empresasModels = empresas.toList();
        if(empresasModels.size()==0) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível recuperar os dados!");
        return ResponseEntity.ok(EmpresaDTO.toList(empresasModels));
    }
    @GetMapping(path = "/{cnpj}")
    public ResponseEntity buscarEmpresa(@PathVariable(name = "cnpj",required = true) String cnpj){
        EmpresaDTO empresaDTO = new EmpresaDTO(empresaRepository.findByCnpj(cnpj));
        if(empresaDTO == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível recuperar os dados!");
        return ResponseEntity.ok(empresaDTO);
    }
    @GetMapping(path = "/{cnpj}/socios/")
    public ResponseEntity buscarSociosDaEmpresa(@PathVariable(name = "cnpj",required = true) String cnpj){
        
        Empresa empresa = empresaRepository.findByCnpj(cnpj);
        if(empresa==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível recuperar os dados da empresa fornecida!");            
        }
        List<Socio> socios = SocioRepository.findByEmpresa(empresa);
        return ResponseEntity.ok(SocioDTO.toList(socios));
    }
}
