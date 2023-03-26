//no need to import prestent in java.lang by default
public class ProductException extends RuntimeException {//using runtime exc does not give any error to handlle when called
	public ProductException(String message){
		super(message);
	}
	

}
