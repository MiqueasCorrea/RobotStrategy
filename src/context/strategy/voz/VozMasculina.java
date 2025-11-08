package context.strategy.voz;

public class VozMasculina implements Voz{
    @Override
    public void hablar(String mensaje) {
        System.out.print("Voz Masculina: " + mensaje);
    }
}
