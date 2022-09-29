
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adrianm
 */
public class ejercicioExpresiones {
     public static void main(String[] args) {
         
        /* 
        Leer por teclado nombre y apellido1 de una persona, 
        edad, peso (kg) y estatura (cm)
        */
        String nombre, apellido;
        int edad, estatura;
        double peso;
        
        Scanner teclado = new Scanner (System.in);
        
        //SI HAY QUE LEER TEXTOS Y NÚMEROS CON SCANNER
        //PRIMERO SE LEEN LOS TEXTOS Y AL FINAL LOS NUMEROS
        
        //SI LO ANTERIOR NO ES POSIBLE, HAY QUE TENER EN CUENTA QUE
        //DESPUES DE LEER UN Nº SI VAMOS A LEER UNA LINEA DE TEXTO (STRING)
        //HAY QUE LIMIPAR EL BUFFER (teclado.nextLine())
        System.out.println("Introduce tu nombre");
        nombre = teclado.nextLine();
        System.out.println("Tu nombre es " + nombre);
        
        System.out.println("Introduce tu apellido");
        apellido = teclado.nextLine();
        System.out.println("Tu apellido es " + apellido); 
       
        System.out.println("Introduce la edad");
        edad = teclado.nextInt();
        System.out.println("Tu edad es " + edad);
       
        
        System.out.println("Introduce tu estatura");
        estatura = teclado.nextInt();
        System.out.println("Tu estatura es " + estatura);
        
        System.out.println("Introduce tu peso");
        peso = teclado.nextDouble();
        System.out.println("Tu peso es "+ peso);
        //Guardar en variables booleanas el resultado de evaluar
        //las siguientes expresiones
        
        boolean a = edad>=25&&edad<=35;
        boolean b = peso>50||peso<=100;
        boolean c = estatura!=175;
        boolean d = estatura>=100&&180<=estatura;
        boolean e = !((edad + 10) <= 60);
        boolean f = nombre.equalsIgnoreCase("Pablo");
        boolean g = apellido.toLowerCase().contains("j".toLowerCase());
        boolean h = apellido.endsWith("dez");
        boolean i = !(edad>40&&50<edad);
        
        System.out.println("¿Edad está entre 25 y 35? " + a);
        System.out.println("¿Peso es mayor de 50 o menor o igual a 100?" + b);
        System.out.println("¿Es la estatura diferente de 175?" + c);
        System.out.println("¿Esta la estatura entre 100 y 180?" + d);
        System.out.println("¿La edad +10 supera los 60?" + e);
        System.out.println("¿El nombre es Pablo?" + f);
        System.out.println("¿El apellido contiene la letra j?" + g);
        System.out.println("¿El apellido termina en dez?" + h);
        System.out.println("¿Está la edad entre 40 y 50?" + i);
        
        //A.Si la edad esta comprendida entre 25 y 35 años
        //incluidos
        
        //B. El peso es mayor de 50kg o menor o igual a 100kg
     
        //C. No mide 175cm 
        
        //D. La estatura está entre 100cm y 180cm, excluidos
        
        //E. La edad mas 10 años no supera los 60
        
        //F. El nombre es igual a "Pablo", ignorando mayúsculas y
        //minusculas. Usa equalsIgnoreCase de los String
        
        //G. El apellido contiene la letra "j". Usa contains de los String
        
        //H. El apellido termina en "dez". Usa endWish de los String
        
        //I. La edad no está entre 40 y 50 años
         }
}
