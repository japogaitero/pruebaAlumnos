/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner (System.in);
    String alumno,alumno_alta, alumno_baja;
    int num_alumnos,media,nota_alumno,baja, alta,suspensos=0,aprobados=0;
    
    System.out.println ("¿Cuantos alumnos hay en clase?");
    num_alumnos= teclado.nextInt();
    

    System.out.println ("Dime el nombre de un alumno");
    alumno=teclado.next();
    alumno_alta=alumno;
    alumno_baja=alumno;
    System.out.println ("¿Que nota sacó?");
    alta=teclado.nextInt();
    baja=alta;
    media=alta;
    if (alta>=5){
        aprobados++;
        }else{
         suspensos++;
    }
    for (int i=2; i<=num_alumnos; i++){
        System.out.println ("Dime el nombre de un alumno");
        alumno=teclado.next();
        System.out.println ("¿Que nota sacó?");
        nota_alumno=teclado.nextInt();
        if (nota_alumno>alta){
            alta=nota_alumno;
            alumno_alta=alumno;
            media=alta+media;
            if (alta>=5){
                aprobados++;
                }else{
                suspensos++;
            }
            
        }if (nota_alumno<baja){ 
            baja=nota_alumno;
            alumno_baja=alumno;
            media=baja+media;
            if (baja<5){
                aprobados++;
                }else{
                suspensos++;
            }
        }    
    }
    media=media/num_alumnos;
     System.out.println(" El número de alumnos en el curso es "+ num_alumnos+". La nota media del curso es "+media+".\n "
             + "La nota más alta es la de "+alumno_alta+" con un "+alta+". La nota más baja es la de "+alumno_baja+" con un "+baja+".\n"
             +"Hay "+aprobados+" aprobados y " +suspensos+" suspensos.");
        
    }
    }
    

