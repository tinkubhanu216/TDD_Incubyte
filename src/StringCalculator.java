
public class StringCalculator {
	int add(String numbers) {
		int sum=0;
		//Replace comma to space
		String digitStr = numbers.replaceAll(",", " ");
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
