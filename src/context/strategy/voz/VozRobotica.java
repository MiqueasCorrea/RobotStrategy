package context.strategy.voz;

public class VozRobotica implements Voz{
    @Override
    public void hablar(String mensaje) {
        System.out.print("Voz Robótica: " + mensaje.toUpperCase());
    }
}
