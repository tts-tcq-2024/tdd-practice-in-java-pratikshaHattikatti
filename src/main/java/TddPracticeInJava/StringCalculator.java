package TddPracticeInJava;

public class StringCalculator{

  int total = 0
  String inputSeries;

  public static int add( String inputNumbers){
      if(inputNumbers == null || inputNumbers.isEmpty){
        return 0;
      }

      
    inputNumbers = inputNumbers.replace ("\n",",");
    inputNumbers = inputNumbers.replace("[^\\d,]",",");  
    String[] numbers = inputNumbers.split(",");

    for(String inputN : numbers){
      if(inputN < 1000){
        total += Integer.parseInt(inputN.trim());
      
      } 
    
    }
    return total;

    
  }


}
