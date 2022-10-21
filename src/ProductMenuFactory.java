public class ProductMenuFactory {
    // Factory method to choose with MeatProductMenu and ProduceProductMenu
    public ProductMenu makeProductMenu(int productMenuType) {
        ProductMenu productMenu = null;

        if (productMenuType == 0) {
            return new MeatProductMenu();
        }
        else if (productMenuType == 1) {
            return new ProduceProductMenu();
        } else {
            return null;
        }
    }
}
