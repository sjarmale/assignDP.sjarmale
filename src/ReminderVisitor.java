public class ReminderVisitor extends NodeVisitor {

	// Concrete class to implement product, trading and facade visitors
	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public void visitProduct(Product product) {
		System.out.println("Visited product, and in turn visit each of the product trading objects");
		visitTrading(product.trading);
	}

	public void visitTrading(Trading trading) {
		System.out.println("Visiting trading");
		// Check for current date and due date of trading
		m_Reminder = new Reminder() {
			@Override
			public void remind() {
				System.out.println("Reminder sent to Reminder class");
			}

			@Override
			public int visit(Product product) {
				return 0;
			}
		};
	}

	public void visitFacade(Facade facade) {
		System.out.println("Visited facade, and in turn visit each of the facade productList objects");
		classProductList = facade.theProductList;
		visitProduct(classProductList.product);
	}

}
