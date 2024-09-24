package PRACTICA_DOMICILIARIA_02.EJERCICIO_7;

public class PruebaFecha_3 {
    public static void main(String[] args){
        //PRUEBA3
        FECHA fecha3 = new FECHA(18,9,2024);
        System.out.println(fecha3.formaAbreviada());
        System.out.println(fecha3.formaExtendida());
        fecha3.incrementarMes(15);
        System.out.println("Despues de incrementar 15 meses: " +fecha3.formaAbreviada());
        System.out.println("En su forma extendida: "+fecha3.formaExtendida());
    }
}
