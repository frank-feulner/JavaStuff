public class HelloWorldParams {
  String myString;

  public static String[] Responses;
  static void MakeResponsesArray()
  {
    Responses = new String[4];
  }

  public static void FillResponsesArray()
  {
    Responses[0] = "No";
    Responses[1] = "One";
    Responses[2] = "Two";
    Responses[3] = "Three";
  }

  public static String MakeMyString(int myParam, String[] myArr)
  {
    int myArrayLength = Responses.length;
    if (myParam < myArrayLength) {
    String tmpInputString = myArr[myParam];
    String tmpString = "Hello " + tmpInputString + " World";
    return tmpString;
    }
    else {return "Bye World. Y u no enter valid param. Izza 0 to 3";}
  }

  public static void main(String[] args) {
    int firstArg = 0;
    if (args.length > 0) {
      try {
          firstArg = Integer.parseInt(args[0]);
      } catch (NumberFormatException e) {
          firstArg = 1;
      }
    }
    MakeResponsesArray();
    FillResponsesArray();
    String myString = MakeMyString(firstArg, Responses);
    System.out.println(myString);
  }
}
