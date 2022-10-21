public abstract class NodeVisitor {
	// Abstract class for Visitor Design Pattern
	private Reminder m_Reminder;

	public abstract void visitProduct(Product product);

	public abstract void visitTrading(Trading trading);

	public abstract void visitFacade(Facade facade);

}
