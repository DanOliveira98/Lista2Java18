package questao2;

/**
 *
 * @author Danie
 */
public class Pessoas {
    private String nome, sexo;
    private float altura;
    private int idade;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public Pessoas(String nome, String sexo, int idade, float altura){
    setIdade(idade);
    setSexo(sexo);
    setNome(nome);
    setAltura(altura);
    }
    @Override
    public String toString(){
        return ("Nome: " + getNome() + " \n Sexo:" + getSexo() + "\n Idade:" + getIdade() + "\n Altura: " 
                + getAltura());
    }
    public Pessoas(){
        
    }
}














