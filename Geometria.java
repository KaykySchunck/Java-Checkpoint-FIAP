package br.com.fiap;

public class Geometria {
	
	float lado;
	float altura;
	double raio;
	
	
	
	
	//Lado
	public float getLado() {
		
		return lado;
	}
	
	public void setLado(float lado){
		this.lado = lado;
		try {
			if (lado >= 0.0 && lado <= 100.00){
				
				}else{
					   throw new Exception("Os valores inserídos não estão de acordo com os padrões!");}
			
			}catch(Exception e)
							   {System.out.println(e.getMessage());}
		}
	
	
	
	//fechamento lado
	
	//Altura
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
		
		try {
			if(altura >= 0.0 && altura <= 100){
				
			}else {
				throw new Exception("Os valores inserídos não estão de acordo com os padrões!");
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}//Fechamento Altura
	
	// raio
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
		
		try {
			if(raio >= 0.0 && raio <= 100.00){
				
			}else{
				throw new Exception("Os valores inserídos não estão de acordo com os padrões!");
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//fehchamento raio
	
	
	public void calcAreaQuadrado(float lado , float altura) {
		
		float areaQuadrado = (lado * altura);
		System.out.println("A área do Quadrado é: "+areaQuadrado);
	}


    public void calcAreaRetangulo(float lado , float altura) {
		
		float areaRetangulo = (lado * altura);
		System.out.println("A área do retângulo é: "+areaRetangulo);
		
	}
    
    public void calcAreaTriangulo(float lado , float altura) {
		
		float areaTriangulo = (lado * altura)/2;
		System.out.println("A área do Quadrado é: "+areaTriangulo);
		
	}
		
    public void calcAreaCirculo(double raio) {
		final double PI = 3.14;
		double areaCirculo = (raio * raio)*PI;
		System.out.println("A área do Quadrado é: "+areaCirculo);
		
	}
	
	

	
}

	
