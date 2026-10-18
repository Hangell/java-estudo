public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void onOff() {
        ligada = !ligada;
    }

    public void upDownCanal(String status) {
        if ("UP".equalsIgnoreCase(status)) {
            canal++;
        } else if ("DOWN".equalsIgnoreCase(status)) {
            canal--;
        }
    }

    public void upDownVolume(String status) {
        if ("UP".equalsIgnoreCase(status)) {
            volume++;
        } else if ("DOWN".equalsIgnoreCase(status)) {
            volume--;
        }
    }

}

