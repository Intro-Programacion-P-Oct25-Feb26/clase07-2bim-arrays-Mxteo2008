/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Operacion {

    public static double[] obtenerPromedioSemanal(int[][] pedidos) { 
        /*
        En esta función recibe como parametro elm arreglo de todos los pedidos y
        se crea un arreglo el cual almacenará todos los promedios
        de ventas de todas las cafeterías, mediante un ciclo for que irá sumando
        los pedidos de las 8 cafeterías y asignará al arreglo sus promedios
        */     
        double[] promedios = new double[8];
        int suma;
        double promedio;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            promedio = (double) suma / 7;
            promedios[i] = promedio;
        }

        return promedios;
    }

    public static int obtenerSumaTotal(int[][] pedidos) {
        /*
        En esta función nuevamente se recibe como parametro el arreglo con todos
        los pedidos de las cafeterías, para luego sumar todos los datos con un ciclo
        for y se devuelve una variable con la suma asiganda
        */

        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {

            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }

        }

        return suma;
    }

    public static int[] obtenerSumaSemanal(int[][] pedidos) {
        /*
        Suma todos los pedidos de cada cafetería, retornando un arreglo con sus 
        ventas semanales
        */
        int[] sumaSemanal = new int[8];
        int suma;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            sumaSemanal[i] = suma;
        }

        return sumaSemanal;
    }

    public static int obtenerMenor(int[] pedidosCafeteria) {
        /*
        Aquí recibimos como parametro los pedidos de las cafeterías, y se crea
        un ciclo for donde irá recorriendo todo el arreglo y se irá asignando el
        menor número de pedidos
        */
        int menor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    public static int obtenerMayor(int[] pedidosCafeteria) {
        /*
        Aquí recibimos como parametro los pedidos de las cafeterías, y se crea
        un ciclo for donde irá recorriendo todo el arreglo y se irá asignando el
        mayor número de pedidos
        */
        int mayor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor > mayor) {
                mayor = valor;
            }
        }
        return mayor;
    }

}
