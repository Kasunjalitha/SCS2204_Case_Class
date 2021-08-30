// Index-Number : 19000642

object caseclassproblem extends App{

    case class Point(a:Int, b:Int){

        def x:Int = a;
        def y:Int = b;

        def +(t:Point):Point =  Point(x + t.x, y + t.y);
        
        def move(dx:Int, dy:Int):Point = Point(x + dx, y + dy);

        def distance(t:Point):Double = math.sqrt(math.pow(math.abs(this.x - t.x), 2)  +  math.pow(math.abs(this.y - t.y), 2))
    
        def invert():Point = Point(y, x);

    }

    val p1 = Point(1, 2);
    val p2 = Point(2, -4);


    // Print points
    println(p1);
    println(p2);
    println("");

    // Points addition
    println("Addition of " + p1 + " and " + p2 + " : " +  (p1+p2));
    println("");

    // Move point
    println("Move " + p2 + " by (10, 12) : " +   p2.move(10, 12));
    println("");

    // Distance between points
    println("Distance between " + p1 + " and " + p2 + " : " +  p2.distance(p1));
    println("");

    // Invert point
    println("Inverse of " + p2 + " : "+  p2.invert());
    println("");

}