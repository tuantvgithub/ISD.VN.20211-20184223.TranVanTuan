public class ValidateNameTest {

    private PlaceOrderController placeOrderController;

    @BeforeEach
    void setUp() throws Exception {
        this.placeOrderController = new PlaceOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "tuantv,true",
            "@@tu,false",
            "null,false",
            "tran12,false"
    })
    public void test(String name, boolean expected) {
        boolean isValid = placeOrderController.validateName(name);

        assertEquals(expected, isValid);
    }

}
