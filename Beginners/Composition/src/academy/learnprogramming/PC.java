package academy.learnprogramming;

public class PC {

    private Motherboard motherboard;
    private Monitor monitor;
    private Case theCase;

    public PC(Motherboard motherboard, Monitor monitor, Case theCase) {
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.theCase = theCase;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 600, "Green");
    }
}
