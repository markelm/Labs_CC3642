/*
Autor: Markel Macedo
Disciplina: CC-3642
Descricao: Criar um programa em C++ que possua uma classe "Empregrado" contendo as informacoes: nome, sobrenome e salario do empregado. 
Apos implementar uma funcao que obtenha e imprima no terminal tais informacoes
*/

#include <iostrem>
#include <string>
#include <cstdlib>

using namespace std;

class Empregado{//Cria Classe Empregado
	public://Os metodos a seguir sao publicos
		String getNome(){
			return nome;
		}//Retorna o atributo nome

		String getSobrenome(){
			return sobrenome;
		}//Retorna o atributo sobrenome

		double getSalario(){
			return salario;
		}//Retorna o atributo salario

		String setNome(String nome){
			this->nome = nome;
		}//Define o valor do atributo nome

		String setSobrenome(String sobrenome){
			this->sobrenome =  nome;
		}//Define o valor do atributo sobrenome

		double setSalario(double salario){
			if(salario < 0){
				this->salario = 0;
			}
			else{
				this->salario = salario;
			}//Define o valor do atributo salario
		}

		void imprime(){
			cout << "Nome: " << nome << "Sobrenome: " << sobrenome << "Salario: " << salario << endl;
		}// Imprime as informacoes definidas nos atributos

	private://Os atributos a seguir sao privados
		String nome;
		String sobrenome;
		double salario;
};

int main(){
	Empregado p1;// Declara o objeto p1 da classe Empregado
	p1.nome("Tyler");// Define o atributo nome do objeto p1 como sendo Tyler
	p1.sobrenome("Durden");// Define o atributo sobrenome do objeto p1 como sendo Durden
	p1.salario(100000.00);// Define o atributo salario do objeto p1 como sendo 100000.00
	p1.imprime();// Imprime as informacoes que foram definidas nos atributos do objeto p1
	p1.setSalario(getSalario()*1.1);// Redefine o atributo salario do objeto p1 adicionando 10% ao valor anterior
	p1.imprime();// Imprime as informacoes que foram definidas nos atributos do objeto p1 e atualizadas ate este ponto

	return 0;
	
}