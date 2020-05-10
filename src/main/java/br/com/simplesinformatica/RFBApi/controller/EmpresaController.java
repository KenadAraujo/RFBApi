/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simplesinformatica.RFBApi.controller;

import br.com.simplesinformatica.RFBApi.dto.EmpresaDTO;
import br.com.simplesinformatica.RFBApi.model.Empresa;
import br.com.simplesinformatica.RFBApi.repository.EmpresaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    
    @GetMapping(path = "/{cnpj}")
    public ResponseEntity<EmpresaDTO> buscarEmpresa(@PathVariable(name = "cnpj",required = true) String cnpj){
        EmpresaDTO empresaDTO = new EmpresaDTO(empresaRepository.findByCnpj(cnpj));
        return ResponseEntity.ok(empresaDTO);
    }
    @GetMapping(path = "/")
    public ResponseEntity<List<EmpresaDTO>> buscarTodasAsEmpresa(@RequestParam(defaultValue = "0") Integer paginaNumero, 
                                                            @RequestParam(defaultValue = "10") Integer tamanhoPagina,
                                                            @RequestParam(defaultValue = "cnpj") String ordenarPor){
        Pageable paging = PageRequest.of(paginaNumero, tamanhoPagina, Sort.by(ordenarPor));
        Page<Empresa> empresas = empresaRepository.findAll(paging);
        List<Empresa> empresasModels = empresas.toList();
        return ResponseEntity.ok(EmpresaDTO.toList(empresasModels));
    }
}
