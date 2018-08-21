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

import javax.swing.JOptionPane;
public class CockerTeste {
        public static void main(String Args[]){
            Animal a = new Animal();
          Cachorro c = new Cachorro();
            Cocker ce = new Cocker();
            String tipo = JOptionPane.showInputDialog("Qual o tipo do Animal?");
           a.setTipo(tipo);
           String cor = JOptionPane.showInputDialog("Qual a cor do Animal?");
           a.setCor(cor);
           String nome = JOptionPane.showInputDialog("Qual o nome do cachorro? ");
           c.setNome(nome);
           String raca = JOptionPane.showInputDialog("Qual a raça do cachorro?");
           c.setRaca(raca);
            String tosa = JOptionPane.showInputDialog("Precisa de Tosa?");
           if(tosa == "sim"){
            ce.setTosa(true); 
           } else {
               ce.setTosa(false);
           }    
           JOptionPane.showMessageDialog(null, (a.toString( ) + c.toString( ) + ce.precisaTosa( )));
            
}
}