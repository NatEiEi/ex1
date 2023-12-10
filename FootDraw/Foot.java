import java.util.Scanner;
public class Foot {
    
    FootShape shape;

    Foot(FootShape shape) {
        this.shape = shape;
    }

    public void draw(int type) {
        if (type == 1) {
            shape.drawAsEllipse();
        } else if (type == 2) {
            shape.drawAsRectangle();
        } else {
            System.out.println("Invalid type");
        }
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1.Ellipse, 2.Rectangle : ");
        int type = inp.nextInt();

        FootShape shape = new FootShape();
        Foot foot = new Foot(shape);
        
        foot.draw(type);
        
    }

}