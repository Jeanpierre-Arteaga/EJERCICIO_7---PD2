package PRACTICA_DOMICILIARIA_02.EJERCICIO_7;

public class PruebaFecha_1 {
    public static void main(String[] args){
        //PRUEBA1
        FECHA fecha1 =new FECHA(7, 9, 2024);
        System.out.println(fecha1.formaAbreviada());
        System.out.println(fecha1.formaExtendida());
        fecha1.incrementarDias(175);
        System.out.println("Despues de incrementar 175 dias: "+fecha1.formaAbreviada());
        System.out.println("En su forma extendida: "+fecha1.formaExtendida());
    }
}
