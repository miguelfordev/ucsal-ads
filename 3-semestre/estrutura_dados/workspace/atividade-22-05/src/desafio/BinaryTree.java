package desafio;

public class BinaryTree<T> {

	private Node<T> root;
	
	public BinaryTree() {
		this.root=null;
	}
	
	public Node<T> getRoot(){
		return this.root;
	}
	
	public boolean addRoot(T value) {
		if(this.root!=null) {
			return false;
		}
		
		Node<T> newNode = new Node<>();
		newNode.setValue(value);
		newNode.setLeft(null);
		newNode.setRight(null);
		
		this.root = newNode;
		return true;
	}
	
	public boolean empty() {
		return (this.root==null);
	}
	
	private Node<T> search(Node<T> T, T value){
		if(T == null) {
			return null;
		}
		
		if(T.getValue() == value) {
			return T;
		}
		
		Node<T> supNode = search(T.getLeft(), value);
		if(supNode == null) {
			supNode = search(T.getRight(), value);
		}
		return supNode;
	}
	
	public Node<T> search(T value) {
		if(empty()) {
			return null;
		}
		return search(this.root, value);
	}
	
	public boolean addLeft(T vdad, T vson) {
		Node<T> son = search(vson);
		if(son != null) {
			return false;
		}
		Node<T> dad = search(vdad);
		if(dad == null) {
			return false;
		}
		if(dad.getLeft() != null) {
			return false;
		}
		Node<T> newNode = new Node<>();
		newNode.setValue(vson);
		newNode.setLeft(null);
		newNode.setRight(null);
		
		dad.setLeft(newNode);
		return true;
	}
	
	public boolean addRight(T vdad, T vson) {
		Node<T> son = search(vson);
		if(son != null) {
			return false;
		}
		Node<T> dad = search(vdad);
		if(dad == null) {
			return false;
		}
		if(dad.getRight() != null) {
			return false;
		}
		Node<T> newNode = new Node<>();
		newNode.setValue(vson);
		newNode.setLeft(null);
		newNode.setRight(null);
		
		dad.setRight(newNode);
		return true;
	}
	
	private void printPreOrder(Node<T> T) {
		if(T == null) {
			return;
		}
		System.out.println("" + T.getValue()); // Pré-ordem
		if(T.getLeft() != null) {
			printPreOrder(T.getLeft());
		}
		
		if(T.getRight()!=null) {
			printPreOrder(T.getRight());
		}
		
	}
	
	private void printInOrder(Node<T> T) {
		if(T == null) {
			return;
		}
		
		if(T.getLeft() != null) {
			printPreOrder(T.getLeft());
		}
		System.out.println("" + T.getValue()); // Em-ordem
		if(T.getRight()!=null) {
			printPreOrder(T.getRight());
		}
		
	}
	
	private void printPosOrder(Node<T> T) {
		if(T == null) {
			return;
		}
		
		if(T.getLeft() != null) {
			printPreOrder(T.getLeft());
		}
		
		if(T.getRight()!=null) {
			printPreOrder(T.getRight());
		}
		System.out.println("" + T.getValue()); // Pós-ordem
	}
	
	public void printPreOrder() {
		if(this.root==null) {
			System.out.println("Binary Tree is empty.");
		} else {
			printPreOrder(this.root);
		}
	}

	public void printInOrder() {
		if(this.root==null) {
			System.out.println("Binary Tree is empty.");
		} else {
			printInOrder(this.root);
		}
		
	}

	public void printPosOrder() {
		if(this.root==null) {
			System.out.println("Binary Tree is empty.");
		} else {
			printPosOrder(this.root);
		}
		
	}
	
}
