/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;
import paquete04.Operacion;

/**
 *
 * @author reroes
 */
public class Informe {
    
    public static int obtenerTotalDia(int [][] pedidos, int dia){
        /*
        Aqui también se recibe como parametro el arreglo con los pedidos, pero
        se hace la suma de los pedidos de solo el día miercoles, por ello también
        recibe otro parametro que hace referencia al día, y al momento de sumar
        se le resta Uno, para que encaje con la posición del día deseado
        */
        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {
            suma = suma + pedidos[i][dia-1];
        }
        return suma;
    }
    
    public static String obtenerCafeteriaMasPedidos(int [][] pedidos, String[] cafeterias){
        /*
        En esta función, recibimos como parametros los areglos con los pedidos
        y las cafeterías, primero se llama a la función para obtener la suma
        total de pedidos de cada cafetería y se asigna a un arrelo unidimensional,
        Luego se crea un ciclo for que irá recorriendo el arreglo de la sumaSemanal
        ee irá determinando cual es el número mayor de pedidos, para finalmente 
        acorde a la ubicación del mayor de pedidos, se retorne el nombre de la 
        cafetería
        
        */
        int [] sumaSemanal = Operacion.obtenerSumaSemanal(pedidos);
        
        int mayor = sumaSemanal[0];
        int indice = 0;
        for (int i = 0; i < sumaSemanal.length; i++) {
            int valor = sumaSemanal[i];
            
            if (valor > mayor){
                mayor = valor;
                indice = i;
            }
        }
        
        return cafeterias[indice];
        
    }
    
    public static int [] obtenerMenorPedidoCafeteria(int [][] pedidos){
        /*
        En esta función tendremos parametro el arreglo de los pedidos, dentro de
        esta función creamos otro arreglo el cual almacenará el MENOR numero de
        pedidos de cada cafetería, esto se determinará mediante un ciclo for
        que llamará a otra función donde se realizará la operación para obtener
        el menor número de pedidos
        */
        int [] pedidosMenores = new int[8];
        
        for (int i = 0; i < pedidos.length; i++) {
            pedidosMenores[i] = Operacion.obtenerMenor(pedidos[i]);
        }
        
        return pedidosMenores;
    
    }
    
    public static int [] obtenerMayorPedidoCafeteria(int [][] pedidos){
        /*
        En esta función tendremos parametro el arreglo de los pedidos, dentro de
        esta función creamos otro arreglo el cual almacenará el MAYOR numero de
        pedidos de cada cafetería, esto se determinará mediante un ciclo for
        que llamará a otra función donde se realizará la operación para obtener
        el mayor número de pedidos
        */
        int [] pedidosMayores = new int[8];
        
        for (int i = 0; i < pedidos.length; i++) {
            pedidosMayores[i] = Operacion.obtenerMayor(pedidos[i]);
        }
        
        return pedidosMayores;
    }
    
    
    
}
