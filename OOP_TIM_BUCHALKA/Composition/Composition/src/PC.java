public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherBoard;

    public PC(Case theCase, Monitor monitor, Motherboard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drewPixelAt(1200, 50, "yellow");
    }


}
