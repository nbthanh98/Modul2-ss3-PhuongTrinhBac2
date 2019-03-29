public class Main {

    public static void main(String[] args) {

        QuadraticEquation pt1 = new QuadraticEquation(1.0, 3, 1);

        if( pt1.getDiscriminant() >= 0){
            System.out.println("Nghiem 1: " + pt1.getRoot1());
            System.out.println("Nghiem 2: " + pt1.getRoot2());
        }else if( pt1.getDiscriminant() == 0){
            System.out.println( pt1.getRoot1());
        }else{
            System.out.println("The equation has no roots");
        }
    }
}
