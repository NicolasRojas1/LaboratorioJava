package mundopc;

import com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        //Creando los objetos
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("usb", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Monitor monitorLG = new Monitor("LG", 28);
        Teclado tecladoLG = new Teclado("USB", "LG");
        Raton ratonLG = new Raton("Bluetooth", "LG");
        Computadora computadoraLG = new Computadora("Computadora LG", monitorLG, tecladoLG, ratonLG);

        //Ejecutando sus acciones
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraLG);
        orden2.mostrarOrden();
    }
}
