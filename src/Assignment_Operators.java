public class Assignment_Operators {
   
 public static void main(String[] args) {
    //Arthimetic operations :
    int num1 = 100;
    int num2 = 50;
    //1 - Addition
    int result1 = num1 + num2;
    System.out.println("Result of Addition = " +result1);
    //2 - subtraction
    int result2 = num1 - num2;
    System.out.println("Result of Subtraction= " +result2);
    //3 - multiplication
    int result3 = num1 * num2;
    System.out.println("Result of Multiplication= " +result3);
    //4 - division 
    int result4 = num1 / num2;
    System.out.println("Result of Division= " +result4);
    //5 - modulus
    int result5 = num1 % num2;
    System.out.println("Result of Modulus= " +result5);
    //6 - increment & decrement
    num1 ++;
    num2 --;
    System.out.println("New value of num1 is = " + num1 );
    System.out.println("New value of num2 is = " + num2 );
    //7 - Addition Assignment
    num1 += 7;
    System.out.println("New value of num1 is = " + num1 );
    //8 - subtraction Assignment
    num1 -= 8;
    System.out.println("New value of num1 is = " + num1 );
    //9 - multiplication Assignment
    num1 *= 2;
    System.out.println("New value of num1 is = " + num1 );
    //10 - division Assignment
    num1 /= 2;
    System.out.println("New value of num1 is = " + num1 );
    //11 - modulus Assignment
    num1 %= 2;
    System.out.println("New value of num1 is = " + num1 );
    //_____________________________________________
    //The Bitwise Operator
    int a = 60; // a = 0011 1100
    int b = 13; // b = 0000 1101
    System.out.println("the value of a and b is = " + (a&b));
    System.out.println("the value of a OR b is = " + (a|b));
    System.out.println("the value of a Exclusive OR b is = " + (a^b));
    System.out.println("the value of a shifted left by 2 bits is = " + (a<<2));
    System.out.println("the value of a shifted right by 2 bits is = " + (a>>2));
    System.out.println("the value of a shifted right zero fill by 2 bits is = " + (a>>>2));
    System.out.println("the value of ~a is = " + (~a));
    //_____________________________________________
    //The Relational Operators
    int x = 6;
    int y = 5;
    boolean RelationResult = x < y;//less than
    System.out.println(RelationResult);
    boolean RelationResult1 = x > y;//Greater than
    System.out.println(RelationResult1);
    boolean RelationResult2 = x <= y;//less than or equal
    System.out.println(RelationResult2);
    boolean RelationResult3 = x >= y;//Greater than or equal
    System.out.println(RelationResult3);
    int z = 8;
    int k = 8;
    boolean RelationResult4 = z == k;//equal
    System.out.println(RelationResult4);
    boolean RelationResult5 = z != k;//equal
    System.out.println(RelationResult5);
    //_____________________________________________
    //Boolean logical Operators
    boolean f = true;
    boolean m = false;
    boolean c = f|m; //or
    boolean d = f&m; //and
    boolean e = f^m; //xor
    boolean g =(!f&m)|(f&!m); 
    boolean h =!f;//if it was true make it false and if it was false make it true
    System.out.println("f = " +a);
    System.out.println("m = " +b);
    System.out.println("f|m = " +c);
    System.out.println("f&m = " +d);
    System.out.println("f^m = " +e);
    System.out.println("(!f&m)|(f&!m) = " +g);
    System.out.println("!m = " +h);
    int l = 7;
    int n = 5;
    int o = 5;
    int p = 9;
    boolean LogicalResult = l > n && o > p;//short circuit AND
    System.out.println(LogicalResult);
    boolean LogicalResult1 = l > n || o > p;//short circuit OR
    System.out.println(LogicalResult1);

}
}
