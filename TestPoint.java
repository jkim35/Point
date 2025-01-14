public class TestPoint {
    public static void main(String[]args){
        point p1 = new point(0,0);
        point p2 = new point(3,4);
        point p3 = new point(-5,7);
        point p4 = new point(3,-10);
        point p5 = new point(3,10);
        point p6 = new point(6,8);
        int x = p2.manhattanDistance(p2,p3);
        System.out.println(x);
        x = p2.manhattanDistance(p3,p4);
        System.out.println(x);
        boolean coline = p1.isCollinear(p2,p4,p5);
        System.out.println(coline);
        coline = p1.isCollinear(p2,p4,p3);
        System.out.println(coline);
        coline = p1.isCollinear(p2,p1,p6);
        System.out.println(coline);
        coline = p1.isCollinear(p2,p3,p1);
        System.out.println(coline);
    }
}
