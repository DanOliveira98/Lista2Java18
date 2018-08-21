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
import javax.swing.JOptionPane;
public class AdministradorTeste {
    public static void main(String Args[]){
        Pessoas p = new Pessoas();
        Empregado e = new Empregado();
        Administrador a = new Administrador();
        String nome = JOptionPane.showInputDialog("Qual o nome da Pessoa ? ");
        p.setNome(nome);
        String sexo = JOptionPane.showInputDialog("Qual o sexo da Pessoa ? ");
        p.setSexo(sexo);
        String idade = JOptionPane.showInputDialog("Qual a idade da Pessoa ? ");
        p.setIdade(Integer.parseInt(idade));
        String altura = JOptionPane.showInputDialog("Qual a altura Pessoa ? ");
        p.setAltura(Float.parseFloat(altura));
        String salario = JOptionPane.showInputDialog("Qual o salario da Pessoa ? ");
        a.setSalario(Float.parseFloat(salario));
        String adc = JOptionPane.showInputDialog("Qual a ajuda de custo da Pessoa ? ");
        a.setAjudaDeCustos(Float.parseFloat(adc));
        JOptionPane.showMessageDialog(null, (p.toString()));
        JOptionPane.showMessageDialog(null, "Lucro: " + a.obterLucros());
        
    }
}
