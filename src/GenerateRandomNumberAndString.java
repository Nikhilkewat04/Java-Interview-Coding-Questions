import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumberAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach 1- Using Random class
		
//		Random random = new Random();
//		int random_num = random.nextInt(1000);
//		System.out.println("Random Number is :"+random_num);
//		
//		double random_dbl = random.nextDouble(10);
//		System.out.println("random Double is :"+random_dbl);
		
		//Approach 2- Using Math class
		
		//System.out.println("Random Number Using Math :"+Math.random());
		
		
		//Approach 3 - using apache commons -lang API
		
		//String rand_num = RandomStringUtils.randomNumeric(5);
		//System.out.println("Random Number using API :"+rand_num);
		
		String rand_str = RandomStringUtils.randomAlphabetic(4);
		System.out.println("Random String Generated :"+rand_str);
	}

}
