/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author Danie
 */
public class Administrador extends Empregado {
    private float ajudaDeCustos;
      public void setAjudaDeCustos(float c){
        this.ajudaDeCustos = c;
    }
    public double getAjudaDeCustos(){
        return this.ajudaDeCustos;
    }
    
    public double obterLucros(){
       return (getSalario() + getAjudaDeCustos()); 
    }
    public Administrador(){
        
    }
}