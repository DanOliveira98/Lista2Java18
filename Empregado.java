/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;
public class Empregado extends Pessoas {
    Pessoas p = new Pessoas();
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float obterLucro(){
        return getSalario();
    }
    public Empregado(){
        
    }
}
