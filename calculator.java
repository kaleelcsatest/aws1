import java.io.*;

class calculator {
        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(
                                System.in));
                double x, y, store = 0;
                char cal;
                System.out.println("Enter the two numbers: ");
                x = Integer.parseInt(reader.readLine());
                y = Integer.parseInt(reader.readLine());
                System.out.println("Enter the operator: ");
                cal = (char) System.in.read();
                   
                if (cal == '+') {
                        store = x + y;
                } else if (cal == '-') {
                        if (x > y)
                                store = x - y;
                        if(x < y)
                                store= x - y;
        } else if (cal == '*') {
                        store = x * y;
                } else if (cal == '/') {
                        if (x > y)
                                store = x / y;
                         if( x < y)
                                 store = x / y;

                } else
                        System.out.println("Wrong operator: ");
                System.out.println("The result is: " + store);
        }

}