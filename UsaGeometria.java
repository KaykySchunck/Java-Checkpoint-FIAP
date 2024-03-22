package br.com.fiap;

import java.util.Scanner;

public class UsaGeometria extends Geometria{
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Bem vindo a Calculadora de Áreas Geometricas");
		System.out.println("Para Acessar o catálogo digite (1)");
		
		Scanner scan = new Scanner(System.in);
		
		Geometria geo = new Geometria();
		
		
		int user = scan.nextInt();
		
		while(user == 1) {
			
			
			String msg = """
					Selecione a forma Geométrica que deseja realizar o cálculo
					(1)Quadrado
					(2)Retângulo
					(3)Triângulo
					(4)Círculo
				--------------------------
					(0)Para encerrar
					""".formatted();
			System.out.println(msg);
			
			int User = scan.nextInt();
			
			if(User == 1){
				System.out.println("Digite o valor do Lado do quadrado: ");
				float lado = scan.nextFloat();
				System.out.println("Digite o valor da Altura do quadrado: ");
				float altura = scan.nextFloat();
				
				geo.calcAreaQuadrado(lado,altura );
				System.out.println("Deseja calcular outra forma Geométrica (1)Sim (0)Não");
				int novamente = scan.nextInt();
				
				if(novamente == 0) {break;}
				
			}// Fechamento Area quadrado
			
			if(User == 2){
				System.out.println("Digite o valor do Lado do Retângulo: ");
				float lado = scan.nextFloat();
				System.out.println("Digite o valor da Altura do Retângulo: ");
				float altura = scan.nextFloat();
				
				geo.calcAreaRetangulo(lado,altura );
				System.out.println("Deseja calcular outra forma Geométrica (1)Sim (0)Não");
				int novamente = scan.nextInt();
				
				if(novamente == 0) {break;}
				
			}// Fechamento Area Retângulo
			
			if(User == 3){
				System.out.println("Digite o valor do Lado do Triângulo: ");
				float lado = scan.nextFloat();
				System.out.println("Digite o valor da Altura do Triângulo: ");
				float altura = scan.nextFloat();
				
				geo.calcAreaTriangulo(lado,altura );
				System.out.println("Deseja calcular outra forma Geométrica (1)Sim (0)Não");
				int novamente = scan.nextInt();
				
				if(novamente == 0) {break;}
				
			}// Fechamento Area Triângulo
			
			
			
			if(User == 4){
				System.out.println("Digite o valor do Lado do Círculo: ");
				double  raio = scan.nextDouble();
				
				geo.calcAreaCirculo(raio);
				
				System.out.println("Deseja calcular outra forma Geométrica (1)Sim (0)Não");
				int novamente = scan.nextInt();
				
				if(novamente == 0) {break;}
				
			}// Fechamento Area Círculo
			
			
			
			
			
			
			
			
			
			
			
			
			
		}//Fechamento WHILE
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// fechamento main 
	
}//fechamento Class UsaGeometria 
		
			
			
			
			
	