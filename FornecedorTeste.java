

package questao2;

import javax.swing.JOptionPane;
public class FornecedorTeste {
    
    public static void main(String Args[]){
        Pessoas p = new Pessoas();
        Fornecedor e = new Fornecedor();
        String nome = JOptionPane.showInputDialog("Qual o nome da Pessoa ? ");
        p.setNome(nome);
        String sexo = JOptionPane.showInputDialog("Qual o sexo da Pessoa ? ");
        p.setSexo(sexo);
        String idade = JOptionPane.showInputDialog("Qual a idade da Pessoa ? ");
        p.setIdade(Integer.parseInt(idade));
        String altura = JOptionPane.showInputDialog("Qual a altura Pessoa ? ");
        p.setAltura(Float.parseFloat(altura));
        String salario = JOptionPane.showInputDialog("Qual o Credito maximo da Pessoa ? ");
        e.setCreditoMaximo(Double.parseDouble(salario));
        String valorEmDivida = JOptionPane.showInputDialog("Qual o valor em divida da Pessoa ? ");
        e.setValorEmDivida(Double.parseDouble(valorEmDivida));
        JOptionPane.showMessageDialog(null, (p.toString()));
        JOptionPane.showMessageDialog(null, "O saldo do fornecedor é: " + (e.obterSaldo()));
    }
}
