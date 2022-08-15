package Classes;

import java.util.*;

public class Class {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            room r = new room(); // the objects are always created in the main method

            System.out.println("Enter the lenght of the room");
            r.length = sc.nextInt();

            System.out.println("Enter the breadth of the room");
            r.breadth = sc.nextInt();

            System.out.println("Enter the height of the room");
            r.height = sc.nextInt();

            System.out.println("The area of the room is " + r.area());
            System.out.println("The circumference of the room is " + r.circumference());
        }

    }

}

class room // here class is the keyword and room is the user defined datatype
{
    public int length;
    int breadth;
    int height;

    int area() // we can use the ans variable 2 times because of the concpet of function scope
    {
        int ans = length * breadth * height;
        return ans;
    }

    int circumference() {
        int ans = 2 * (length + breadth);
        return ans;
    }

};
