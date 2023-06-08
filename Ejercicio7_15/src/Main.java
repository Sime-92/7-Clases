public class Main {
    public static void main(String[] args) {
        Calendario fecha1 = new Calendario(2023, 6, 8);
        Calendario fecha2 = new Calendario(2023, 6, 8);
        Calendario fecha3 = new Calendario(2023, 6, 9);

        fecha1.mostrar(); // Fecha: 2023/6/8
        fecha1.incrementarDia();
        fecha1.mostrar(); // Fecha: 2023/6/9

        fecha1.incrementarMes();
        fecha1.mostrar(); // Fecha: 2023/7/9

        fecha1.incrementarAño(2);
        fecha1.mostrar(); // Fecha: 2025/7/9

        boolean sonIguales = fecha1.iguales(fecha2);
        System.out.println("Las fechas 1 y 2 son iguales: " + sonIguales); // Las fechas 1 y 2 son iguales: true

        sonIguales = fecha1.iguales(fecha3);
        System.out.println("Las fechas 1 y 3 son iguales: " + sonIguales); // Las fechas 1 y 3 son iguales: false
    }
}
