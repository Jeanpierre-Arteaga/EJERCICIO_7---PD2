package PRACTICA_DOMICILIARIA_02.EJERCICIO_7;

public class PruebaFecha_2 {
    public static void main(String[] args){
        //PRUEBA2
        FECHA fecha2 =new FECHA(7,9,2023);
        System.out.println(fecha2.formaAbreviada());
        System.out.println(fecha2.formaExtendida());
        fecha2.incrementarDias(175);
        System.out.println("Despues de incrementar 175 dias: "+fecha2.formaAbreviada());
        System.out.println("En su forma extendida: "+fecha2.formaExtendida());
    }
}
