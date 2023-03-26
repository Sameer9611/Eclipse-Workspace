
public class Product {
	
		void productCheck(int weight) {
		if(weight<100) {
			throw new ProductException("Weight is less than 100");//stuck for 30 min  cause did not time throw
			// also if productEXception Extends checked exception(ex Exception) then here when we call the throw constructor it says to handle it
		}
		else {
			System.out.println("weight is nice and healthy and above 100");
		}
	}

}
