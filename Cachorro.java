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
public class Cachorro extends Animal {
    protected String nome, raca;
    public Cachorro(){
        
    }
    public Cachorro(String cor, String tipo) {
        super(cor, tipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    @Override
    public String toString(){
        return (getRaca()+ getNome());
    }
}
