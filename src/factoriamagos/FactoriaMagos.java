package factoriamagos;

import Fabricas.FabricaAbs;
import Fabricas.FabricaMago1;
import Fabricas.FabricaMago2;
import Fabricas.FabricaMago3;
import Fabricas.FabricaMago4;
import Hechizos.Agua;
import Hechizos.Aire;
import Hechizos.Fuego;
import Hechizos.Hechizo;
import Hechizos.HechizoPoder;
import Hechizos.HechizoVida;
import Hechizos.Tierra;
import Magos.MagoAbs;
import java.util.Scanner;

public class FactoriaMagos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int tipo = 0, poder = 0; 
        
        FabricaAbs a = new FabricaMago1();
  
        //Hechizos que pueden usar los magos
        Hechizo hezP1 = new HechizoPoder(new Agua());
        Hechizo hezP2 = new HechizoPoder(new Fuego());
        Hechizo hezP3 = new HechizoPoder(new Aire());
        Hechizo hezP4 = new HechizoPoder(new Tierra());
        
        Hechizo hezV1 = new HechizoVida(new Agua());
        Hechizo hezV2 = new HechizoVida(new Fuego());
        Hechizo hezV3 = new HechizoVida(new Aire());
        Hechizo hezV4 = new HechizoVida(new Tierra());
        
        //Mago del jugador
        MagoAbs jugador = a.crearMago();
        
        //Creación de enemigos
        MagoAbs enemigo1 = a.crearMago(); 
        enemigo1.setHez(hezP1);
        
        a = new FabricaMago2(); 
        MagoAbs enemigo2 = a.crearMago(); 
        enemigo2.setHez(hezP2);
        
        a = new FabricaMago3();
        MagoAbs enemigo3 = a.crearMago(); 
        enemigo3.setHez(hezP3);
        
        a = new FabricaMago4();
        MagoAbs enemigo4 = a.crearMago(); 
        enemigo4.setHez(hezP4);
        
        
        
        jugador.setHez(hezP1);
        
        
        
          
        System.out.println("\nDatos del jugador:\nVida: "+jugador.getHp()+"\tTipo: "+jugador.getTipo()+"\tHechizo: "+jugador.getHez().getAtaque().getClass().getSimpleName());
        
        System.out.println("\nDatos del enemigo 1:\nVida: "+enemigo1.getHp()+"\tTipo: "+enemigo1.getTipo()+"\tHechizo: "+enemigo1.getHez().getAtaque().getClass().getSimpleName());
        System.out.println("\nDatos del enemigo 2:\nVida: "+enemigo2.getHp()+"\tTipo: "+enemigo2.getTipo()+"\tHechizo: "+enemigo2.getHez().getAtaque().getClass().getSimpleName());      
        System.out.println("\nDatos del enemigo 3:\nVida: "+enemigo3.getHp()+"\tTipo: "+enemigo3.getTipo()+"\tHechizo: "+enemigo3.getHez().getAtaque().getClass().getSimpleName());
        System.out.println("\nDatos del enemigo 4:\nVida: "+enemigo4.getHp()+"\tTipo: "+enemigo4.getTipo()+"\tHechizo: "+enemigo4.getHez().getAtaque().getClass().getSimpleName());
        
        while(jugador.getHp() > 0 && enemigo1.getHp() > 0){
            System.out.println("\nQue tipo de hechizo desea usar? (1.Ataque 2.Vida)");
            tipo = teclado.nextInt();
            System.out.println("\nQue poder desea que tenga el hechizo? (1.Agua 2.Fuego 3.Aire 4.Tierra)\n");
            poder = teclado.nextInt();
            
            switch(tipo){
                case 1: 
                    switch(poder){
                        case 1: 
                            jugador.setHez(hezP1);                    
                            break;
                        case 2: 
                            jugador.setHez(hezP2);                    
                            break; 
                        case 3: 
                            jugador.setHez(hezP3);                    
                            break;
                        case 4: 
                            jugador.setHez(hezP4);                    
                            break;
                        default:
                            System.out.println("No valido");
                            break; 
                    }
                    jugador.getHez().utilizar(jugador, enemigo1);
                break;
                case 2: 
                    switch(poder){
                        case 1: 
                            jugador.setHez(hezV1);                    
                            break;
                        case 2: 
                            jugador.setHez(hezV2);                    
                            break; 
                        case 3: 
                            jugador.setHez(hezV3);                    
                            break;
                        case 4: 
                            jugador.setHez(hezV4);                    
                            break;
                        default:
                            System.out.println("No valido");
                            break; 
                    } 
                    jugador.getHez().utilizar(jugador, null);
                break;
            }
            
            System.out.println("\nDatos del jugador:\nVida: "+jugador.getHp()+"\tTipo: "+jugador.getTipo()+"\tHechizo: "+jugador.getHez().getAtaque().getClass().getSimpleName());         
            System.out.println("\nDatos del enemigo 1:\nVida: "+enemigo1.getHp()+"\tTipo: "+enemigo1.getTipo()+"\tHechizo: "+enemigo1.getHez().getAtaque().getClass().getSimpleName());
            
        }
             
    }
}