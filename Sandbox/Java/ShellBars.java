public class ShellBars {
  public class Point {
    int x_coord;
    int y_coord;

    public void Point(int x, int y) {
      this.x_coord = x;
      this.y_coord = y;
    }
  }

  public class Node {
    boolean containsPoints;
    ArrayList<Point> totalPoints;

    public void Node(ArrayList<Point> points) {}
  }

  public class Rectangle {
    int x, y, w, h;

    public Rectangle(int x, int y, int w, int h) {
      this.x = x;
      this.y = y;
      this.w = w;
      this.h = h;
    }
    public boolean Contains(point){
    return // is it within the rectangle
    }
  }

  public class Quadtree {
    Rectangle boundry;
    int capacity;
    int[] points;
    boolean divided;

    // Constructor
    public Quadtree(Rectangle boundryw, int capacity) {
      this.boundry = boundryw;
      this.capacity = capacity;
      this.points = points;
      this.divided = false;
    }

    // subdivide
    public subdivide() {
    int x = this.boundry.x
    int y = this.boundry.y
    int w = this.boundry.w
    int h = this.boundry.h

      Rectangle nw =
          new Rectangle(
              x + w / 2,
              y - w / 2,
              w / 2,
              w / 2);
      this.northWest = new QuadTree(nw);

        // swap the new
      Rectangle ne =
          new Rectangle(
              x - w / 2,
              y - w / 2,
              w / 2,
              w / 2);
      this.northEast = new QuadTree(ne);

      Rectangle sw =
          new Rectangle(
              x + w / 2,
              y + w / 2,
              w / 2,
              w / 2);
      this.southWest = new QuadTree(sw);

      Rectangle se =
          new Rectangle(
              x - w / 2,
              y + w / 2,
              w / 2,
              w / 2);
      this.southEast = new QuadTree(se);

      this.divided = true;

    }

    // insertion
    public insert(int point) {
      if(!this.boundry.contains(point){

      }

      if (points.length < capacity) {
        points.add(point);
      } else {
        if (!this.divided) {
          this.subdivide();
        }

        this.northWest.insert(point)

      }
    }


    public query(range){
    if(!this.boundry.intersects(range)){
    return;
    }

    }
  }

  public static void main(String[] args) {
    Rectangle boundry = new Rectangle(200, 200, 200, 200);
    Quadtree qt = new Quadtree(boundry);
  }
}
