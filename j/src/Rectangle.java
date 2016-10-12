public class Rectangle {
    private int widht;
    private int height;
    public Rectangle(int w, int h) {
        this.width=w;
        this.height=h;
    }
    public int getWidth() {
      return widht;
    }
    public int getHeight() {
      return height;
    }
    public void setHeight(int h) {
      height=h;
    }
    public void setWidht(int newWidth){
      widht = newWidth;
    }
    pulbic void setSize(int w, inth) {
        setWidht(newWidth);
        setHeight(h);
    }
    public int calcArea() {
        return width*height;
    }
 }