public class ValidateAddressTest {

    private PlaceOrderController placeOrderController;

    @BeforeEach
    void setUp() throws Exception {
        this.placeOrderController = new PlaceOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "hanoi,true",
            "so 15 Hai Ba Trung Ha Noi,false",
            "@@,false",
            "null,false"
    })
    public void test(String address, boolean expected) {
        boolean isValid = placeOrderController.validateAddress(address);

        assertEquals(expected, isValid);
    }

}
