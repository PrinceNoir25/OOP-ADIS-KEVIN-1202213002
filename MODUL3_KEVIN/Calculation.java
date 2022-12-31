public class Calculation implements Runnable {
  public double r;
  public double sideLength;
  public double area;
  public final double PI = 3.14;

  @Override
  public void run() {
    System.out.println("====Program Will Start In====");
    System.out.println("");

    for (int i = 3; i > 0; i--) {
      System.out.println("Starting with thread" + i);
    }
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
    }
  }

  public double getSquare() {
    return this.area;
  }

  public void setSquare() {
    if (sideLength < 1) {
      throw new IllegalArgumentException();
    } else {
      this.area = sideLength * sideLength;
    }
  }

  public double getCircle() {
    return this.area;
  }

  public void setCircle() {
    if (r<= 1) {
      throw new IllegalArgumentException();
    } else {
      this.area = this.PI * r * r;
    }
  }

  public double getTrapezoid() {
    return this.area;
  }

  public void setTrapezoid(double b, double c) {
    if (b < 1 || c < 1) {
      throw new IllegalArgumentException();
    } else {
      this.area = (b + c) / 2;
    }
  }
}
