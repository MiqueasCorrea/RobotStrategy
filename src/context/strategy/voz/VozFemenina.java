package context.strategy.voz;

public class VozFemenina implements Voz{
    @Override
    public void hablar(String mensaje) {
        System.out.print("Voz Femenina: " + mensaje);
    }
}
