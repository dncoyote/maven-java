package hello1;

//Print Numbers from 1 to 20
//But when number is multiple of 3 print Fizz
//when number is multiple of 5 print Buzz
public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            StringBuilder str = new StringBuilder();
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                if(str.length())
                System.out.println();
            }
        }
    }
}
