/*
Autor: Markel Macedo
Disciplina: CC-3642
Descricao: Criar um programa em Java que possua uma classe "Date" contendo as informacoes: dia, mes e ano. 
Apos implementar uma funcao que obtenha e imprima no terminal tais informacoes no seguinte formato: dia/mes/ano.
 */
package markel_ex2_java;

class Date {//Cria a classe Date

    public int getDia() {//Retora o valor do atributo dia e define o metodo getDia() como publico
        return dia;
    }

    public int getMes() {//Retorna o valor do atributo mes e define o metodo getMes() como publico
        return mes;
    }

    public int getAno() {//Retorna do valor do atributo ano define o metodo getAno() como publico
        return ano;
    }

    public void setDia(int dia) {//Define o valor do atribudo dia e define o metoo setDia() como publico
        if (dia < 1) {
            this.dia = 1;
        }
        if (dia > 31) {
            this.dia = 31;
        } else {
            this.dia = dia;
        }
    }

    public void setMes(int mes) {//Define o valor do atributo mes e define o metodo setMes() como publico
        if (mes < 1) {
            this.mes = 1;
        }
        if (mes > 12) {
            this.mes = 12;
        } else {
            this.mes = mes;
        }
    }

    public void setAno(int ano) {//Define o valor do atributo ano e define o metodo setAno() como publico
        this.ano = ano;
    }

    public void displayDate() {//Imprime os valores dos atributos desta classe
        System.out.println(getDia() + "/" + getMes() + "/" + getAno());
    }

    //Declara os atributos desta classe
    int dia;
    int mes;
    int ano;
}

/**
 *
 * @author uniemamacedo
 */
public class Markel_ex2_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Date testDate = new Date();//Declara o objeto testDate de classe Date
        testDate.setDia(1);//Define o valor do atributo dia do objeto testDate como sendo 1
        testDate.setMes(10);//Define o valor do atributo mes do objeto testDate como sendo 10
        testDate.setAno(1990);//Define o valor do atributo ano do objeto testDate como sendo 2000
        testDate.displayDate();//Imprime os valores definidos dos atributos do objeto testDate
        
    }

}
