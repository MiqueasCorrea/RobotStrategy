import context.Robot;
import context.strategy.expresion.ExpresionFeliz;
import context.strategy.expresion.*;
import context.strategy.voz.*;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();

        // Configuracion inicial
        robot.setVoz(new VozMasculina());
        robot.setExpresion(new ExpresionFeliz());

        robot.hablar("Hola, soy tu robot asistente, configuración en Masculino ");
        robot.mostrarExpresion();

        // Cambio dinamico de estrategias
        robot.setVoz(new VozRobotica());
        robot.setExpresion(new ExpresionTriste());
        System.out.println();

        robot.hablar("Error detectado en el sistema ");
        robot.mostrarExpresion();
        System.out.println();

        robot.setVoz(new VozFemenina());
        robot.setExpresion(new ExpresionNormal());

        robot.hablar("Hola, soy tu robot asistente, configuración en Femenino ");
        robot.mostrarExpresion();
    }
}