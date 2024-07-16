package TddPracticeInJava;

public class StringCalculator{

  public static int add( String inputNumbers){
   
   if (isEmptyString(inputNumbers) || inputNumbers == "0") {
            return 0;
        }
    int total =  -1;
    total = verifytoAdd(inputNumbers);
    
   return total;
  }


private static boolean isEmptyString(String inputNumber) {  
if(inputNumber == null || inputNumber.isEmpty()){
        return true;
      }
return false;
}

private static int verifytoAdd(String inputNumbers){
  
   inputNumbers = inputNumbers.replace ("\n",",");
    inputNumbers = inputNumbers.replace("[^\\d,]",",");  
    String[] numbers = inputNumbers.split(",");
    int total = 0;
    for(String inputN : numbers){
      if(inputN <= 1000){
        total += Integer.parseInt(inputN.trim());
      
      } 
    }
    return total;
  }
}


