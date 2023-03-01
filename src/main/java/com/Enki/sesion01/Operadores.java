package com.Enki.sesion01;

public class Operadores {
    public static void main(String[] args) {

        //Declarar varias variables en una sola linea
        int i=4,j=6;
        System.out.println(i);
        System.out.println(j);
        //suma
        int resultado = i+j;
        System.out.println(resultado);
        // resta
        resultado =  j-i;
        System.out.println(resultado);
        //multiplicacion
        resultado = j*i;
        System.out.println(resultado);
        // division
        resultado = j/i;
        System.out.println(resultado);
        //division float
        i=3;
        j=4;
        // division no entera
        //casting 'cambias una variable de un tipo a otro tipo'
        float resultadoFlotante = (float) i / (float) j;
        System.out.println(resultadoFlotante);

        //divison entera normal
        i= 14;
        j=5;
        resultado = i/j;
        System.out.println(resultado);
        //resto de una division
        resultado = i % j;
        System.out.println(resultado);

        //Operadores de comparacion
        //incrementos y decrementos
        i=3;
        //pre incremento
        ++i;
        System.out.println(i);
        //post incremento
        i++;
        System.out.println(i);
        //pre decremento
        --i;
        System.out.println(i);
        //post decremento
        i--;
        System.out.println(i);

        //Operadores de asignacion con operacion incluida
        //Apocopes
        int i = 1;
        System.out.println(i);
        i=i+1;
        System.out.println(i);
        //suma
        i+=2;
        System.out.println(i);
        //resta
        i-=2;
        System.out.println(i);
        //multiplicacion
        i*=3;
        System.out.println(i);




    }
}
