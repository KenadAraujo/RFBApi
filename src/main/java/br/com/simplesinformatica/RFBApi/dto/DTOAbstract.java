/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simplesinformatica.RFBApi.dto;

import java.util.List;

import br.com.simplesinformatica.RFBApi.model.ModelAbstract;
import br.com.simplesinformatica.RFBApi.model.Socio;


public abstract class DTOAbstract<T> {
    
    public DTOAbstract(){}
    public DTOAbstract(T modelo) {}

    public static List toList(List modelos){
        return null;
    }
}
