//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.onOff();
        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.upDownCanal("up");
        smartTv.upDownCanal("up");
        smartTv.upDownCanal("up");
        smartTv.upDownCanal("up");
        smartTv.upDownCanal("up");
        System.out.println("Canal atual? " + smartTv.canal);

        smartTv.upDownVolume("DOWN");
        smartTv.upDownVolume("DOWN");
        smartTv.upDownVolume("DOWN");
        smartTv.upDownVolume("DOWN");
        smartTv.upDownVolume("DOWN");
        System.out.println("Volume Atual? " + smartTv.volume);

    }
}