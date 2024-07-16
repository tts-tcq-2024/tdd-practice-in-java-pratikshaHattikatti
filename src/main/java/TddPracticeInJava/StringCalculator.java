package TddPracticeInJava;

public class StringCalculator{

  public static int add( String inputNumbers){
   
   if (isEmptyString(str) || str == "0") {
            return 0;
        }
    int total =  verifytoAdd(inputNumbers);
    
   return total;
  }

}
 protected static boolean isEmptyString(String inputNumbers) {  
if(inputNumbers == null || inputNumbers.isEmpty){
        return true;
      }
return false;
}

protected static  verifytoAdd(String inputNumbers){
   inputNumbers = inputNumbers.replace ("\n",",");
    inputNumbers = inputNumbers.replace("[^\\d,]",",");  
    String[] numbers = inputNumbers.split(",");
    int total = 0
    for(String inputN : numbers){
      if(inputN < 1000){
        total += Integer.parseInt(inputN.trim());
      
      } 
    }
    return total;
  }



