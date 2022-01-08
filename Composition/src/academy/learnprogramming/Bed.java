package academy.learnprogramming;

public class Bed {

    private String style, color;
    private int width, length;
    private int pillows;
    private int quilt;

    public Bed(String style, String color, int width, int length, int pillows, int quilt) {
        this.style = style;
        this.color = color;
        this.width = width;
        this.length = length;
        this.pillows = pillows;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("On Bed, Making Bed...");
    }

    public String getStyle() {
        return style;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilt() {
        return quilt;
    }
}
