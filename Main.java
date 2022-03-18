class Main {
  public static void main(String[] args) {
// if, else, else if, switch
    int count =4;

     switch(count){
    case 1:
         System.out.println("0%");
        break;
    case 2:
        System.out.println("10%");
      break;
    case 3:
        System.out.println("15%");
      break;
    case 4:
        System.out.println("25%");
      break;
    case 5:
        System.out.println("30%");
        break;
        default :
        System.out.println("50%");
    }
  }
        
private static void printBinary(long value, int size){
  for (int i = size -1; i >= 0; i --){
    long mask = 1L << i;
    long result = (mask & value) >> i;
    System.out.print (result);
  }
System.out.println();
//System.out.println(Long.toBinaryString(value));
}
}