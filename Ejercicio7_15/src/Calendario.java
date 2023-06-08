public class Calendario {
    private int año;
    private int mes;
    private int dia;

    public Calendario(int año, int mes, int dia) {
        if (esFechaValida(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("Fecha inválida");
        }
    }

    public void incrementarDia() {
        if (esFechaValida(año, mes, dia + 1)) {
            dia++;
        } else {
            incrementarMes();
            dia = 1;
        }
    }

    public void incrementarMes() {
        if (mes < 12) {
            mes++;
        } else {
            incrementarAño(1);
            mes = 1;
        }
    }

    public void incrementarAño(int cantidad) {
        año += cantidad;
    }

    public void mostrar() {
        System.out.println("Fecha: " + año + "/" + mes + "/" + dia);
    }

    public boolean iguales(Calendario otraFecha) {
        return (año == otraFecha.año && mes == otraFecha.mes && dia == otraFecha.dia);
    }

    private boolean esFechaValida(int año, int mes, int dia) {
        if (año <= 0 || mes <= 0 || mes > 12 || dia <= 0) {
            return false;
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diasEnElMes = diasPorMes[mes - 1];

        if (mes == 2 && esAñoBisiesto(año)) {
            diasEnElMes = 29;
        }

        return dia <= diasEnElMes;
    }

    private boolean esAñoBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}

