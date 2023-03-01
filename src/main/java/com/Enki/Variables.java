package com.Enki;

public class Variables {
    public static void main(String[] args) {

        System.out.println("Ejemplos de Variables");
        //Inicializando las variables
        int numero;
        //Declarando Variable
        numero  = 3;
        //Imprimir por pantalla
        System.out.println(numero);

    //Tipos de variables
        //Boleanas
            boolean activo = true;
            //cambiar valor de la variable
            activo=false;
            //imprimir por pantalla
            System.out.println(activo);
        //Variables numericas
            //Variables enteras
            int natural = 12;
            System.out.println(natural);
            long largo = 121212121;
            System.out.println(largo);
            //byte solo va desde -128 hasta + 127
            byte bytes = 23;
            System.out.println(bytes);
            // Son dos bytes
            short corto = 1234;
            System.out.println(corto);

            // numeros de coma flotante
            float flotante = 12.3f;
            System.out.println(flotante);
            double doble = 12.34245;
            System.out.println(doble);

            // Caracteres (unicode)
            char caracter = 'a';
            System.out.println(caracter);




    }


}
