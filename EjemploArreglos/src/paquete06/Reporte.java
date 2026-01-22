/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Reporte {
    
    public static void imprimirReporte(String [] cafeterias, String [] sedes, 
            double [] promediosCaf, int [] pedidosMenor, int [] pedidosMayor, 
            int pedidosDia, String caferiaMasPedidos){
        /*
        Finalmente, con los arreglos ya llenados con los datos solicitados, se
        crea el mensaje final con cada una de las cafeterías, tenemos como 
        parametros, toda la información necesaria para presentar en pantalla.
        Se crea un ciclo for para ir concatenando el mensaje con todas las cafet
        erías, en orden acorde al arreglo. Y se presenta también los pedidos del
        día miercoles y la cafetería con mayor pedidos receptados 
        
        */
        String mensaje = "Listado de Cafeterías\n";
        
        for (int i = 0; i < cafeterias.length; i++) {
            mensaje = String.format("%sCafetería: %s (Sede: %s), "
                    + "promedio de pedidos: %.2f, número menor de pedidos: %d, "
                    + "número mayor de pedidos: %d\n", 
            mensaje, 
            cafeterias[i], 
            sedes[i], 
            promediosCaf[i], 
            pedidosMenor[i], 
            pedidosMayor[i]);
        }
        
        mensaje = String.format("%s\nPedidos del día miércoles: %d\n", mensaje, pedidosDia);
        mensaje = String.format("%s\nCafeterías más pedidos: %s", mensaje, caferiaMasPedidos);
            
        System.out.printf("%s\n", mensaje);
    }
}
