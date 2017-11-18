package com.br.Aula1;
public class Singleton {

    int contador;
    //TODO: Definir um objeto do tipo Singleton
    static Singleton objeto;

    public Singleton() {
        contador = 0;
    }
    public void RetornaNumero() {
        System.out.println("Número atualizado: " + Integer.toString(contador++));
    }
    public static Singleton ObtemObjeto() {

        //TODO: Implemente o método que retorna um objeto segundo o padrão Singleton
    	
    	if(objeto == null){
    		objeto = new Singleton();
    		}
    	
    	return objeto;
    			
    }
    
       
    
}

