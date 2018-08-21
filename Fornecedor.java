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
public class Fornecedor extends Pessoas {
    private double creditoMaximo, valorEmDivida;
    
    public void setCreditoMaximo(double creditoMaximo){
        this.creditoMaximo = creditoMaximo;
    }
    public double getCreditoMaximo(){
        return this.creditoMaximo;
    }
    public void setValorEmDivida(double valorEmDivida){
        this.valorEmDivida = valorEmDivida;
    }    
    public double getValorEmDivida(){
        return this.valorEmDivida;
    }
    public Fornecedor(double valorEmDivida, double creditoMaximo){
        setCreditoMaximo(creditoMaximo);
        setValorEmDivida(valorEmDivida);
    }
    public double obterSaldo(){
        return (getCreditoMaximo() - getValorEmDivida());
    }
    public Fornecedor(){
        
    }
}
