
public class StringCalculator {
	int add(String numbers) throws Exception {
		int sum=0;
		int index = numbers.indexOf('-');
		while(index >= 0) {
			if(index<numbers.length()-1) {
				char c=numbers.charAt(index+1); 
				if(Character.isDigit(c)) {
					throw new Exception("negatives not allowed");					
				}
			}
		   index = numbers.indexOf('-', index+1);
		}
		//Replace all non digit to space
		String digitStr = numbers.replaceAll("[^\\d]", " ");
		// Remove extra spaces from the beginning
        // and the ending of the string
		digitStr = digitStr.trim();
		// Replace all the consecutive white
        // spaces with a single space
		digitStr = digitStr.replaceAll(" +", " ");
		if(!digitStr.equals("")) {
			String[] numArray = digitStr.split(" ");
			for(int i=0;i<numArray.length;i++) {
				int num=Integer.parseInt(numArray[i]);
				sum+=num;
			}			
		}
		return sum;
	}

}
