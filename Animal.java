/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

/**
 *
 * @author Danie
 */
public class Animal{
    protected String tipo, cor;
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
        public void setCor(String t){
        this.cor = t;
    }
    public String getCor(){
        return cor;
    
    }
    public Animal(){
        
    }
    @Override
    public String toString(){
        return (getTipo()+ getCor());
    }
    public Animal(String cor, String tipo){
        getCor();
        getTipo();
    }
}
