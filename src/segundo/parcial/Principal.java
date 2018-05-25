/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo.parcial;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        int entrada;
        
        Scanner miEscaner;
        miEscaner = new Scanner(System.in);
        
           //crear un objeto de la Clase Calculador
           
        Calculador miCalculador; //Definir el objeto
        miCalculador = new Calculador(); //Construir el objeto
        
        System.out.println("Ingrese el valor X del punto 1");
        entrada = miEscaner.nextInt();
        miCalculador.setX(entrada);
        System.out.println("Ingrese el valor Y del punto 1");
        entrada = miEscaner.nextInt();
        miCalculador.setY(entrada);
        
        System.out.println("Ingrese el valor X del punto 2");
        entrada = miEscaner.nextInt();
        miCalculador.setX(entrada);
        System.out.println("Ingrese el valor Y del punto 2");
        entrada = miEscaner.nextInt();
        miCalculador.setY(entrada);
        
        
        System.out.println("la distancia entre los puntos es:" + miCalculador.getR());
        System.out.println("El area bajo el segmento de recta es:" + miCalculador.getR());
        System.out.println("La pendiente del segmenton de recta es:" + miCalculador.getR());
        
    }
    
}
