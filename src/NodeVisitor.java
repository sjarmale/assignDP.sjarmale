public abstract class NodeVisitor {
	private Reminder m_Reminder;

	public abstract void visitProduct(Product product);

	public abstract void visitTrading(Trading trading);

	public abstract void visitFacade(Facade facade);

}
