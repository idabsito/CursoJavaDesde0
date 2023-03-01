package com.Enki.sesion01;

public class ObjetosSencillos {
    public static void main(String[] args) {
        //Objetos Sencillos en Java

            //Objeto booleanos
                //Declaramos el objeto
                Boolean activo;
                //Inicializando
                activo = true;
                System.out.println(activo);
                //cambiamos el valor
                activo= false;
                System.out.println(activo);

            //Caracteres
                //Declarando e Inicializacion de una cadena tipo String
                String cadena = "Hola Chat";
                System.out.println(cadena);
                //Declarando e Inicializacion de un objeto en base a una funcion constructora
                String cadena1 = new String("Nuevo Valor");
                System.out.println(cadena1);
                // Asignamos otro valor a la referencia del objeto
                cadena1 = "otro valor";
                //El objeto que contenia "nuevo valor" se ha "PERDIDO"
                // EL recolector de basura liberara en algun momento esa memoria ocupada
                System.out.println(cadena1);
                // Acceder a propiedades del objeto
                System.out.println(cadena1.length());

                //Objetos de numeros
                //Numeros enteros
                Integer numeroEntero = 12;
                System.out.println(numeroEntero);
                //Numero flotante
                Float flotante = 12.3F;
                System.out.println(flotante);
                //Numeros double
                Double doble = 12.3434343;
                System.out.println(doble);







    }
}
