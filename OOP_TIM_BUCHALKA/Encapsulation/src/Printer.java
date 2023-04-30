public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;

    public void fillToner(int filling) {
        if(filling + this.tonerLevel <= 100 && filling + this.tonerLevel > 0) {
            this.tonerLevel = this.tonerLevel + filling;
        } else {
            System.out.println("You screwed up");

        }

        if(filling < 0) {
            System.out.println("Are you fucking kidding");
        }
    }

    public void print(int pages) {
        if(pages < 0) {
            System.out.println("Are you fucking kidding?");
        } else {
            this.pagesPrinted = this.pagesPrinted + pages;
            this.tonerLevel = this.tonerLevel - pages;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
