/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo.de.operadores;

/**
 *
 * @author PC08-LAB02
 */
public class ManejoDeOperadores {

   
    public static void main(String[] args) {
        System.out.println("Operadores Aritmeticos:");
int a = 1 + 2;
int b = a * 4;
int c = b / 2;
int d = c - a;
int e = -d;
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
System.out.println("d = " + d);
System.out.println("e = " + e);
System.out.println("\nOperador Módulo (residuo):");
System.out.println("x mod 10 = " + a % 2);
System.out.println("\nOperador Compuesto:");
//a = a + 4
a += 2;
b -= 4;
c *= a;
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
System.out.println("\nOperador Incremento:");
//int a = a + 1;
a++;
System.out.println("a = " + a);
c = ++a;
d = b++;
System.out.println("b = " + b);
System.out.println("c = " + c);
System.out.println("d = " + d);
System.out.println("\nOperador relacional:");
boolean res = a < b;
System.out.println("res = " + res);
System.out.println("\nOperador Ternario:");
int min = (a < b) ? a : b;
System.out.println("min = " + min);
System.out.println("\nOperador de Asignación:");
int i, j, k;
i = j = k = 100; // valor de x, y, and z igual a 100
System.out.println("i = " + i);
System.out.println("j = " + j);
System.out.println("k = " + k);

    }
    
}
