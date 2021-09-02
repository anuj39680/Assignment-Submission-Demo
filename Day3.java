//Submit the Project done in the class i.e. cab free calculation.


import java.util.*;

class Price {
    int fare=30;
    
    Price(){

    } 
    
    Price(int i) {
        fare=i;
    }
    
    void showTotalPrice() {
        System.out.println("Total Fare is " +fare+" Rs");
    }
}

class Cab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cab distance from user ");
        int i=sc.nextInt();
        if(i>5) {
            Price obj = new Price(30+10*(i-5));
            System.out.println("Enter the distance travelled by user");
            int j = sc.nextInt();
            obj.fare = obj.fare+10*j;
            obj.showTotalPrice();
        }
        else {
            Price obj1 = new Price();
            System.out.println("Enter the distance travelled by user");
            int k = sc.nextInt();
            obj1.fare = obj1.fare+10*k;
            obj1.showTotalPrice();
        }
    }
}