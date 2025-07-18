public class Type_conversion_and_Casting {
    public static void main(String[] args) {
         int age =30;
        System.out.println(age);
        System.out.println(3+5);
        //type conversion and casting

        // 1-called implicit(widening)which automatically hapend
        int num =100;
        long bignum =num;
        System.out.println(bignum);

        // 2-called explicit(narrowing)manually from large to small
        double pi=3.14159;
        int approxpi=(int)pi;//syntax is : (TargetType)value
        System.out.println(approxpi);
    }  
}
