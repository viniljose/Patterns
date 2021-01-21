package behavioural.visitor;

public interface Visitor {

	void visit(Book book);
	void visit(CD cd);
}
