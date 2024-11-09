public class Cylinder {
    public static void main(String[] args){
        
        //These are the variables
        double Pi = 3.14;
        double radius = 5; //put the radius here
        double height = 6; //put the height here
        double surfaceArea = 2*Pi*radius*radius + 2*Pi*radius*height;
        double volume = Pi*radius*radius*height;
        
        //Prints out the answers
        System.out.println("The surface area is: " + surfaceArea);
        System.out.println("The volume area is: " + volume);
    }   
}