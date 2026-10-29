/**
 * A rectangle with mutable dimensions.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle.
   *
   * @param w the width
   * @param h the height
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns this rectangle's area.
   *
   * @return the area
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the scale factor
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle has a larger area than another rectangle.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle has a larger area
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}