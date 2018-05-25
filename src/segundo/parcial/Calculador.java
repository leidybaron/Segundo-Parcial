/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo.parcial;

/**
 *
 * @author Estudiantes
 */
public class Calculador {

public Punto punto1;
public Punto punto2;
public float r;
    private int x;
    private int y;

   void calcularDistancia(int x, int y){
    
       
       if(x>0 && y>0)
       {
           r = (float) Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
       }
       else
       {
             System.out.println("Los valores ingresados no son correctos");
       }
       
   }
   
   void calcularArea(int x, int y){
       
       if(x>0 && y>0)
       {
           
       }
       else
       {
             System.out.println("Los valores ingresados no son correctos");
       }
       
   }
   
   void calcularPendiente(int x, int y)
   {
       if(x>0 && y>0)
       {
           r = (y-y)/(x-x);
       }
       else
       {
             System.out.println("Los valores ingresados no son correctos");
       }
   }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public float getR() {
    
        return r;
    }
   

    
}
