public class ValidateOrderTime {

    private PlaceOrderController placeOrderController;

    @BeforeEach
    void setUp() throws Exception {
        this.placeOrderController = new PlaceOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "20/12/2021 12:12:12,true",
            "20-12-2021 12:12:12,false",
            "null,false"
    })
    public void test(String time, boolean expected) {
        boolean isValid = placeOrderController.validateOrderTime(time);

        assertEquals(expected, isValid);
    }
}
