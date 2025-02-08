import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void printjava(){
        System.out.println("hello java");          //METHODS
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static void printSum(int a,int b){
        int sum = a+b;
        System.out.println(sum);

    }
    public static void main(String[] args) {
        /*

        //PRINT COMMAND (sout)
        System.out.println("Hello, World!"); //println :- leaves a line after printing
        System.out.print("hello java");  //do not leave any line after printing.
        System.out.println();


        //VARIABLES
        String name="chirag";  //string variable
        int age=30;  //integer variable
        String city = "Delhi";
        String birthplace = city;  //one variable can be stored in another variable
        System.out.println(name);
        System.out.println(birthplace);

        //DATA TYPE {Primitive / non-primitive(reference)}

        //PRIMITIVE --> These have fixed sizes
        //              byte - 1 [-128 to 127]
        //              short - 2
        //              int - 4 [1,2,3,4,5...]
        //              long - 8
        //              float - 4 [3.14]
        //              double - 8
        //              char - 2 [a,b,c...]
        //              boolean - 1 [True/False]


        //RANGE OF DATA TYPES
        byte age = 20;
        int phone = 1234567890;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char symbol_letters = '@';
        boolean isAdult = true;

        //NON-PRIMITIVE --> these do not have any fixed size(can store data until memory limit is reached.)
        String name="chirag";
        String name2 = new String("nishad123");  //primitive can also be written using new keyword
        System.out.println(name.length()); // .length will give the length of the string
        System.out.println(name2.length());


        //STRING

        //CONCATENATION
        String name1 = "Suresh";
        String name2 = "Utsav";
        String name3 = name1 + " loves " + name2;
        System.out.println(name3);

        //chatAt function
        String name ="chirag";
        System.out.println(name.charAt(0));  //In java  string index starts from 0.
        System.out.println(name.charAt(3));

        //replace function
        String name1 = "chirag nishad";
        String name2 = name1.replace('a', 'b');
        System.out.println(name2);
        System.out.println(name1); //does not change anything in original string(strings are immutable in java)

        //substring
        String name ="suresh and utsav";
        System.out.println(name.substring(0, 6));  //first index is included but second is not
        System.out.println(name.substring(11, 16));



        //ARRAYS


        int[] marks=new int[3];
        marks[0]= 99;
        marks[1]= 98;
        marks[2]= 97;
        System.out.println(marks); //this will not print the array (marks) but returns a garbage value
        System.out.println(marks[0]); //this will return value at 0\th index


        int[] age=new int [3];
        System.out.println(age[1]); //if we do not add any values to array it will return 0.


        boolean[] age2=new boolean[3];
        System.out.println(age2[2]);


        //Functions of arrays -->

        int[] marks=new int[3];
        marks[0]= 97;
        marks[1]= 98;
        marks[2]= 96;

        //length function
        System.out.println(marks.length);

        //sort function (ascending order)
        System.out.println(marks[0]); //before sorting
        Arrays.sort(marks);
        System.out.println(marks[0]); //after sorting

        int[] marks={10,20,45,36,24}; //array can be written in this format if the values are known.
        System.out.println(marks[3]);


        //2D ARRAYS
        int[][] finalmarks= {{98, 92, 95, 97, 99}, {96, 97, 95, 94, 89}};
        System.out.println(finalmarks[0][2]);
        System.out.println(finalmarks[1][3]);


        //CASTING -->

        //Implicit casting (smaller values can be stored in bigger values)
        double price=100.0;
        double finalPrice= price + 18;   //int is stored in float
        System.out.println(finalPrice);


        //Explicit Casting (bigger values are inside smaller values)  **Data may lose**
        int price = 100;
        int finalPrice= price + (int)18.5;  //float is casted into int datatype
        System.out.println(finalPrice);



        //CONSTANT (final)

        float Pi= 3.14F;  //this is a variable.
        final float  PI = 3.14F; //this is a constant.



        //OPERATORS -->
        //              Arithmetic operators(+,-,*,/,%)
        //              Assignment operators
        //              Logical operators
        //              Comparison operators( ==, !=, <, >, <=, >=)

        //Arithmetic operator
        double a=5;
        double b=2;
        double sum = a+b;
        double diff = a-b;
        double mult= a*b;
        double div= a/b;
        double rem = a%b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(rem);


        //unary  operator
        int num = 2;
        System.out.println(num++); //2 (number is first printed then increased)
        System.out.println(++num); //3 (number is first increased then printed)


        int num2= 3;
        System.out.println(num2--);  //3 (number is first printed then decreased)
        System.out.println(--num2);  //2 (number is first decreased then printed)



        //MATHS CLASS

        // min\max function
        System.out.println(Math.max(5,7));
        System.out.println(Math.min(5,7));

        //random function (returns random no. b\w 0.0 to 1.0)
        System.out.println(Math.random());
        System.out.println((int)Math.random());
        System.out.println((int)(Math.random()*100));



        //INPUTS
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println(name);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();  //nextInt only take tokens as input
        System.out.println(age);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a line : ");
        String line = sc.nextLine();  //nextLine takes line as a input
        System.out.println(line);


        //Comparison operator -->
        //                      a == b
        //                      a != b
        //                      a < b
        //                      a <= b
        //                      a > b
        //                      a >= b

        //CONDITIONAL STATEMENTS (if \ else)
        boolean sunIsUp = false;
        if (sunIsUp == true)
            System.out.println("day");
        else
            System.out.println("night");


        int age = 20;
        if(age > 18)
            System.out.println("can vote");
        else
            System.out.println("can't vote");
            


        //Logical operator

        //AND operator (&&)
        int a = 10;
        int b = 30;
        if (a < 50 && b < 50)
            System.out.println("both are less than 50!");

        //OR operator ( || )
        int a =60;
        int b =40;
        if (a<50 || b<50)
            System.out.println("atleast one is less than 50");

        //NOT operator ( ! )
        boolean isAdult = false;
        if(!isAdult)
            System.out.println("is adult");
        else
            System.out.println("is not adult");


        //conditional statement example
        Scanner sc = new Scanner(System.in);
        System.out.println("enter available amount : ");  //pen=10 //notebook=40
        int money= sc.nextInt();
        if(money<10){
            System.out.println("you cannot buy anything");
            System.out.println("get more cash");
        } //this curly braces after the statement is called block

        else if (money>10 && money<50)
            System.out.println("can buy one item");
        else
            System.out.println("can buy both");



        //SWITCH (conditional statement)
        int day=2;
        switch (day){
            case 1:  //prints all condition if case is true
                System.out.println("monday");
                break; //only print the true case
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("thursday - sunday");

        }



        //LOOPS (for / do-while / while)

        //For loop
        for (int i = 1; i <=10; i++){
            System.out.println(i);
        }


        //while loop
        int j = 100;
        while (j>= 10){
            System.out.println(j);
            j = j-1;
        }


        //do-while loop
        int k = 100;
        do{
            System.out.println(k);
            k = k-1;
        }while(k>=1);


        //BREAK and CONTINUE
        int i=0;
        while(true){
            if (i == 3){
                i = i+1;
                continue;
            }
        System.out.println(i);
        i = i+1;
        if (i > 5){
            break;
            }
        }


        //EXCEPTION HANDLING (try-catch)
        int[] marks={99,98,97};
        try{
            System.out.println(marks[5]);
        } catch(Exception e) {

        }
        System.out.println("my name is chirag");


        //METHODS
        printjava();
        printjava();
        printjava();

        printName("chirag");
        printName("suresh");
        printName("ravi");
        printName("utsav");


        printSum(3,5);
        
         */


    }
}