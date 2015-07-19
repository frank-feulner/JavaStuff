public class HelloWorldParams {
  String myString;

//Dieser Teil deklariert meinen Array
  public static String[] Responses;

//Dieser Teil instanziert meinen Array
  static void MakeResponsesArray()
  {
    Responses = new String[4];
  }

//Dieser Teil füllt meinen Array
  public static void FillResponsesArray()
  {
    Responses[0] = "No";
    Responses[1] = "One";
    Responses[2] = "Two";
    Responses[3] = "Three";
  }

//Dieser Teil definiert, instanziert und füllt meinen String mit dem Suffix "s"
  public static String Suffix = "s";

/*Dieser Teil fügt meinen Ausgabestring zusammen.
  Die Funktion akzeptiert zwei Parameter. Eine Ganzzahl und einen Array vom Typ String.
  Sie fragt ab, ob die Ganzzahl kleiner als zwei ist. Falls nicht, wird das Suffix zur Bildung des Ausgabestrings verwendet.
*/
  public static String MakeMyString(int myParam, String[] myArr)
  {
    int myArrayLength = Responses.length;
    if (myParam < myArrayLength){
      String tmpInputString = myArr[myParam];
      String tmpString;
      if (myParam < 2) {
        tmpString = "Hello " + tmpInputString + " World";
      }
      else{
        tmpString = "Hello " + tmpInputString + " World" + Suffix;
      }
      return tmpString;
    }
    else {return "Bye World. Y u no enter valid param. Izza 0 to 3";}
  }

/*Diese Funktion wird angesprochen, wenn die Klasse HelloWorldParams ausgeführt wird.
  Sie arbeitet mit der Konstanten args (Aufrufargumente).
  Sie prüft, ob Args gefüllt ist.
  Sie fängt ab, ob Args numerisch gefüllt ist.
*/
  public static void main(String[] args) {
    int firstArg = 0;
    if (args.length > 0) {
      try {
          firstArg = Integer.parseInt(args[0]);
      } catch (NumberFormatException e) {
          firstArg = 1;
      }
    }
    //Konstruierende Funktionen aufrufen, damit der Array Responses gefüllt ist.
    MakeResponsesArray();
    FillResponsesArray();

    //Funktion ausführen, die den String zusammensetzt.
    String myString = MakeMyString(firstArg, Responses);

    //Konstruierten String auf die Kommandozeile zurückschreiben (Standard Out)
    System.out.println(myString);
  }
}
