import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidatePhoneNumberTest {

	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		this.placeOrderController = new PlaceOrderController();
	}

	@ParameterizedTest
	@CsvSource({
			"0123456789,true",
			"0123,false",
			"abc12,false",
			"12345123,false"
	})
	public void test(String phone, boolean expected) {
		boolean isValid = placeOrderController.validatePhoneNumber(phone);

		assertEquals(expected, isValid);
	}



}
