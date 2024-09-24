package PRACTICA_DOMICILIARIA_02.EJERCICIO_7;

public class PruebaFecha_4 {
    public static void main(String[] args){
        //PRUEBA4
        FECHA fecha4 = new FECHA(8,2,2024);
        System.out.println(fecha4.formaAbreviada());
        System.out.println(fecha4.formaExtendida());
        fecha4.incrementarAño(10);
        System.out.println("Despues de incrementar 10 años: " +fecha4.formaAbreviada());
        System.out.println("En su forma extendida: "+fecha4.formaExtendida());
    }
}
