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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public ResponseEntity<EmpresaDTO> buscarTodasAsEmpresa(){
        //return ResponseEntity.noContent();
        return ResponseEntity.ok(new EmpresaDTO());
    }
}
