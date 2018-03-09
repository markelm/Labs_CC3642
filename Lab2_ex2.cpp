/*
Autor: Markel Macedo
Disciplina: CC-3642
Descricao: Criar um programa em C++ que possua uma classe "Date" contendo as informacoes: dia, mes e ano. 
Apos implementar uma funcao que obtenha e imprima no terminal tais informacoes no seguinte formato: dia/mes/ano.
*/

#include <iostream>
#include <string>
#include <cstdlib>

using namespace std;

class Date {// Cria a classe Date
	public://Os metodos a seguir sao publicos
	int getDia(){
		return dia;
	}//Returna o atributo dia
	int getMes(){
		return mes;
	}//Retorna o atributo mes
	int getAno(){
		return ano;
	}//Retorna o atributo ano
	void setDia(int dia){
		if(dia < 1){
			this->dia = 1;
		}
		if(dia > 31){
			this->dia = 31;
		}
		else{
			this->dia = dia;
		}
	}//Define o valor do atributo dia
	void setMes(int mes){
		if(mes < 1){
			this->mes = 1;
		}
		if(mes > 12){
			this->mes = 12;
		}
		this->mes = mes;
	}//Define o valor do atributo mes
	void setAno(int ano){
		this->ano = ano;
	}//Define o valor do atributo ano

	void imprime(){
		cout << dia << '/' << mes << '/' << ano << endl;
	}// Imprime as informacoes definidas nos atributos

	private://Os atributos a seguir sao privados
	int dia, mes, ano;

};

int main(){
	Date d1;//Declara o objeto d1 da classe Date
	d1.setDia(1);//Define o valor do atributo dia como sendo 1
	d1.setMes(10);//Define o valor do atributo mes como sendo 10
	d1.setAno(2000);//Define o valor do atributo ano como sendo 2000
	d1.imprime();///Imprime os valores definidos nos atributos

	return 0;
	
}

