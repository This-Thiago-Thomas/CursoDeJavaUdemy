package java10.java_lang;
//Math - Realizar cálculos com Math

import java.util.Random;

/*
A biblioteca Math possui vários métodos e constantes estáticas
para que possamos utilizar nos nossos programas.
*/
public class ProgramaJavaLangMath {

    public static void main(String[] args) {
        System.out.println(Math.E);//Constante

        System.out.println(Math.PI);//PI

        System.out.println(Math.sin(45));

        System.out.println(Math.cos(45));

        System.out.println(Math.round(Math.PI));//Arredondar pra baixo e retorna int

        System.out.println(Math.ceil(Math.PI));//Arredondar pra cima e retorna float

        System.out.println(Math.floor(Math.PI));//Arredondar pra baixo e retorna float

        System.out.println(((int)Math.pow(3,3)));//Potencia

        System.out.println(((int)Math.sqrt(81)));//Raiz Quadrada

    }

}
