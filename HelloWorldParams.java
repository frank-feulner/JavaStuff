public class HelloWorldParams {
  String myString;
  public static String[] Responses;
  void MakeResponsesArray()
  {
    Responses = new String[5];
  }
  public void FillResponsesArray()
  {
    Responses[1] = "One";
    Responses[2] = "Two";
    Responses[3] = "Three";
  }
  public static String MakeMyString(String[] args)
  {
    int tmpIndex;
    try {tmpIndex = Integer.parseInt(args[0]);}
    catch (NumberFormatException ex) {tmpIndex = 0;}
    String tmpString = "Hello " + Responses[tmpIndex] + " World";
    return tmpString;
  }
  public static void main(String[] args) {
    String myString = MakeMyString(args);
    System.out.println(myString);
  }
}
