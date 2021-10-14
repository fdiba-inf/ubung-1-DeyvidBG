package exercise1;

public class Tree {

 public static void main(String[] args) {

  for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 10 - i; j++) {
      System.out.print(" ");
    }
    for (int k = 0; k < (2 * i + 1); k++) {
      System.out.print("*");
    }
    System.out.println();
  }
  
  for (int i = 0; i < 1; i++) {
    for (int j = 0; j < 9; j++)
      System.out.print(" ");
    for (int k = 0; k < 3; k++)
      System.out.print("*");
    System.out.println();
  }
  
  }
}