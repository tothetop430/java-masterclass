public class Wall {

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println(wall.getArea());

        wall.setHeight(-1.5);
        System.out.println(wall.getWidth());
        System.out.println(wall.getHeight());
        System.out.println(wall.getArea());

        wall.setWidth(2);
        wall.setHeight(2);
        System.out.println(wall.getWidth());
        System.out.println(wall.getHeight());
        System.out.println(wall.getArea());
    }


    private double height, width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public Wall() {
        this(2, 2);
    }

    public Wall(double width, double height) {
        this.height = height < 0 ? 0 : height;
        this.width = width < 0 ? 0 : width;
    }

    public double getArea() {
        return width * height;
    }

}
