package staticDemo;

public class ProductValidator {
	public boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()){  //! = değilse demek
			return true;
		}else {
			return false;
		}
	}
}
