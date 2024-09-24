package PRACTICA_DOMICILIARIA_02.EJERCICIO_7;

public class FECHA{
    // ATRIBUTOS
    private int dia;
    private int mes;
    private int año;

    // CONSTRUCTORES
    public FECHA(int dia, int mes ,int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }

    // SETTERS
    public void setDia(int dia) {
            this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // GETTERS
    public void getDia(int dia) {
    this.dia = dia;
    }

    public void getMes(int mes) {
    this.mes = mes;
    }

    public void getAño(int año) {
    this.año = año;
    }

    //METODO PARA MOSTRAR LA FECHA EN FORMATO: dd/mm/aa
    public String formaAbreviada (){
        return String.format("%02d/%02d/%02d", dia, mes, año);
    }

    //METODO PARA MOSTRAR LA FECHA EN SU FORMA EXTENDIDA
    public String formaExtendida() {
        String[] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return String.format("%02d de %s de %04d", dia, nombreMeses[mes - 1], año);
    }

    //METODO QUE VERIFICA SI ES UN AÑO BISIESTO
    private boolean esBisiesto() {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
    
    //METODO QUE INCREMENTA UN DIA
    public void incrementarUnDia() {
        int[] diasPorMes = {31, (esBisiesto() ? 29 : 28), 
                            31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        dia++;
        if (dia > diasPorMes[mes - 1]) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
    }
    
    //METODO QUE INCREMENTA VARIOS DIAS
    public void incrementarDias(int dias) {
        for (int i = 0; i < dias; i++) {
            incrementarUnDia();
        }
    }
    
    //METODO PARA INCREMENTAR MESES
    public void incrementarMes(int meses) {
        for (int i=0; i<meses; i++){
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
    }
    
    //METODO PARA INCREMENTAR AÑOS
     public void incrementarAño(int años) {
        for (int i=0; i<años; i++){
            año++;
        }
    }
 }
