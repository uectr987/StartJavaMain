public class Calculator{
	   public static void main(String[] args) {
	   int y = 5;
	   int x = 4;
	   char mathOperation = '^';

	   if (mathOperation == '+') {
			   System.out.println(y + x);
               } else if (mathOperation == '-') {
					   System.out.println(y - x);
			   } else if (mathOperation == '*') {
					   System.out.println(y * x);
			   } else if (mathOperation == '/') {
                       System.out.println(y / x);
               } else if (mathOperation == '%') {
                       System.out.println(y % x);
			   } else if (mathOperation == '^') {
					   int result = 1;
					   for (int i = 1; i <= y; i++) {
									   result *= x;
                       }
                       System.out.println(result); {
               }
       }

  }