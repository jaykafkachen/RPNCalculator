import java.util.Scanner;
import java.io.*;
/*
Enter your postfix expression with a known answer into the calculator to determine if you've correctly converted from Infix to Postfix

Format for entering data into the calculator:

"Enter equation: 926*+48/-3+q"

You can't enter spaces or more than single digit numbers, and every expression should end with q before you press enter so that the equation returns a result.
*/

class Main {
  public static void main(String[] args) {
        RPN name = new RPN();
        name.calculate();

  }
}
