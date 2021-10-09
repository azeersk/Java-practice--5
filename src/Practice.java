import java.util.*;

public class Practice {
    /*
    static void factorialOf(int a){
        int b  = 1;
        int c = 0;
        for(int i=1; i<=a; i++){
            b = c + b*i;
        }
        System.out.println(b);
    }
    static void sumOfString(String a){
        int sum = 0;
        for(int i=0; i<a.length(); i++){
            sum = sum + Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        System.out.println(sum);
    }


    static void powerOf(int a, int b){
        double c = Math.pow(a,b);
        System.out.println(c);
    }

    static void AppendOf(String a){
        ArrayList<String>  string = new ArrayList<>();
        String[] array = {"azeer","saheb","shaik","apple","milk"};
        string.addAll(List.of(array));
        string.add(1,a);
        System.out.println(string);
    }

    static void removeOf(int a){
        LinkedList<String > ListA = new LinkedList<>();
        String[] array = {"azeer", "saheb", "shaik", "apple", "milk"};
        ListA.addAll(List.of(array));
        for(int i=0; i<a;i++){
            ListA.removeLast();
        }
        System.out.println(ListA);
    }

    static int Fibonacci_Series(int a){
        if (a<=1)
            return a;
        else{
           return Fibonacci_Series(a-1)+Fibonacci_Series(a-2);
        }

    }
    static void Fibonacci_Series_All(int a){
        ArrayList<Integer> ListA = new ArrayList<>();
        for(int i=0; i<a; i++){
            int b = Fibonacci_Series(i);
            ListA.add(b);
        }
        System.out.println(ListA);
    }

     */

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*Write a program to print the largest number in the list.
        String a = input.nextLine();
        String[] List = a.split(",");
        int Max = Integer.parseInt(List[0]);
        for(int i=1; i<List.length; i++){
            int c = Integer.parseInt(List[i]);
            if (Max<=c){
                Max = c;
            }
        }
        System.out.println(Max);

        Write a program to print the smallest Kth number in the list.
        String inputOf = input.nextLine();
        int a = input.nextInt();
        String[] List = inputOf.split(",");
        ArrayList<Integer> ListI = new ArrayList<>();
        for(int i=0; i<List.length; i++){
            int arg = Integer.parseInt(List[i]);
            ListI.add(arg);
        }
        Collections.sort(ListI);
        System.out.println(ListI.get(a-1));

        Write a program to recursively compute the factorial of a given number N.
        Factorial is the product of all positive integers less than or equal to N.
        int a = input.nextInt();
        factorialOf(a);

        Write a program to recursively compute the sum of all the digits in the given number N.
        String a = input.nextLine();
        sumOfString(a);

        Write a program to recursively compute the value of A raised to the power B.
        int a = input.nextInt();
        int b = input.nextInt();
        powerOf(a,b);

        For this problem, the prefilled code will contain a list. Write a program to add the given word at the end of the list.
        String  a = input.nextLine();
        AppendOf(a);

        For this problem, the prefilled code will contain a list. Write a program to remove the last N items in the list.
        int a = input.nextInt();
        removeOf(a);

         For this problem, the prefilled code will contain a list. Write a program to count all the occurrences of
         the given number (N) in the list
        int a = input.nextInt();
        int[] array = {5, 10, 20, 35, 5, 50, 20, 100, 200, 10, 150, 100, 100, 20, 20};
        int count = 0;
        for(int i=0; i<array.length; i++){
            if (a==array[i]){
                count = count + 1;
            }
        }
        System.out.println(count);

        Write a program to recursively find the Nth term in the Fibonacci series.A Fibonacci sequence
        is the integer sequence of 0, 1, 1, 2, 3, 5, 8... The first two terms are 0 and 1. All other
        terms are obtained by adding the preceding two terms.
        int a = input.nextInt();
        System.out.println(Fibonacci_Series(a));

        Write a program to recursively create a list of N Fibonacci terms. A Fibonacci sequence is the integer
        sequence of 0, 1, 1, 2, 3, 5, 8... The first two terms are 0 and 1. All other terms are obtained by adding
        the preceding two terms.
        int a = input.nextInt();
        Fibonacci_Series_All(a);

        For this problem, the prefilled code will contain a dictionary. Write a program to add a key-value pair to the dictionary.
        For this problem, the prefilled code will contain a dictionary. Write a program to remove a key.
        String a = input.nextLine();
        String[] array = a.split(" ");
        Map<String,String> map = new HashMap<String,String>();
        map.put("Ram", "Cricket");
        map.put("Rajesh", "Football");
        map.put("Rama", "Tennis");
        map.put("Rahim", "Cricket");
        map.put(array[0], array[1]);
        System.out.println(map);
        map.remove("Ram");
        System.out.println(map);*/

    }
}