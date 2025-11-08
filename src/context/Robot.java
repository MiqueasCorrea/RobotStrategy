package context;

import context.strategy.expresion.Expresion;
import context.strategy.voz.Voz;

public class Robot {
    private Voz voz;
    private Expresion expresion;

    // Setters dinamicos
    public void setVoz(Voz voz) {
        this.voz = voz;
    }

    public void setExpresion(Expresion expresion) {
        this.expresion = expresion;
    }

    // Metodos del contexto
    public void hablar(String mensaje) {
        if (voz != null)
            voz.hablar(mensaje);
        else
            System.out.println("No hay voz configurada.");
    }

    public void mostrarExpresion() {
        if (expresion != null)
            expresion.mostrarExpresion();
        else
            System.out.println("No hay expresion configurada.");
    }
}
