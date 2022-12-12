package Test;

public class Main {
    public static void main(String[] args) {
        Geometric geometricObj = new Circle(1);
        displayGeometricObject(new Circle(1, "red", false));
        displayGeometricObject(new Rectangle(1, 1, "black", true));

    }
    public static void displayGeometricObject(Geometric geometricObj){
        System.out.println("Created on " + geometricObj.getDateCreated()+
                ". Color is " + geometricObj.getColor());
    }
}
