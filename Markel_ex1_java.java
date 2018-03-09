/*
Autor: Markel Macedo
Disciplina: CC-3642
Descricao: Criar um programa em Java que possua uma classe "Empregrado" contendo as informacoes: nome, sobrenome e salario do empregado. 
Apos implementar uma funcao que obtenha e imprima no terminal tais informacoes
*/
package markel_ex1_java;

class Funcionario {//Cria Classe Empregado

    //Declara os atributos
    String nome;
    String sobrenome;
    double salario;

    public void setSobrenome(String novoSobrenome) {//Define o valor do atributo sobrenome e define o metodo setSobrenome() como publico
        sobrenome = novoSobrenome;
    }

    public void setSalario(double novoSalario) {//Define o valor do atributo salario e define o metodo setSalario como publico
        if (salario < 0) {
            salario = 0;
        } else {
            salario = novoSalario;
        }
    }

    public void setNome(String novoNome) {//Define o valor do atributo nome e define o metodo setNome() como publico
        nome = novoNome;
    }

    public String getNome() {//Retorna o valor do atributo nome e define o metodo getNome() como publico
        return nome;
    }

    public String getSobrenome() {// Retorna o valor do atributo sobrenome e define o metodo getSobrenome como publico
        return sobrenome;
    }

    public double getSalario() {//Retorna o valor do atributo salario e define o metodo getSalario como publico
        return salario;

    }
    
    public void imprime(){//Imprime os valoes dos atributos declarados e define o metodo imprime() como publico
        System.out.println("Nome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("Salario Anual: " + getSalario() * 12);
    }
}

/**
 *
 * @author uniemamacedo
 */
public class Markel_ex1_java {

    /*public static void imprimeFunc(Funcionario z) {
        System.out.println("Nome: " + z.getNome());
        System.out.println("Sobrenome: " + z.getSobrenome());
        System.out.println("Salario Anual: " + z.getSalario() * 12);
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f = new Funcionario();//Cria o objeto f de classe funcionario

        f.setNome("Tyler");//Define o valor do atributo nome do objeto f como sendo Tyler
        f.setSobrenome("Durden");//Define o valor o atributo sobrenome do objeto f como sendo Durden
        f.setSalario(30000.25);//Define o valor do atributo salario do objeto f como sendo 30000.25
        f.setSalario(f.getSalario() * 1.1);//Incrementa o valor do atributo salario do objeto f em 10%
        
        Funcionario g = new Funcionario();
        g.setNome("Bill");//Define o valor do atributo nome do objeto g como sendo Bill
        g.setSobrenome("Murray");//Define o valor o atributo sobrenome do objeto g como sendo Murray
        g.setSalario(70000.00);//Define o valor do atributo salario do objeto f como sendo 70000.00
        g.setSalario(g.getSalario() * 1.1);//Incrementa o valor do atributo salario do objeto g em 10%
        
        
        f.imprime();//Imprime os valores dos atributos do objeto f
        g.imprime();//Imprime os valores dos atributos do objeto g
        

    }

}
