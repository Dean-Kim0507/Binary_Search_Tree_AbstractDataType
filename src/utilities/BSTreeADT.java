package utilities;


import java.io.Serializable;

/**
 * The Binary Search Tree interface. This interface has methods to get or modify data in the tree structure. 
 * 
 * @author Jaehan Kim, Donghyun Kim, Maria Laura Diaz Pena
 * @version April 7, 2021
 * @param <E> The type of elements that the tree holds.
 */
public interface BSTreeADT<E> extends Serializable  {
	/**
	 * Adds an element to the binary search tree.
	 * Appends an element to the binary search tree.
	 * 
	 * Pre-conditions: E is not null.
	 * Post-conditions: Element is appended to the binary search tree.
	 * 
	 * @param Element to be appended.
	 * @return true if the element is appended successfully.
	 */
	public boolean add(E data);

	
	/**
	 * Remove a specific node from the binary search tree
	 * 
	 * Pre-conditions: A valid node contains the element
	 * Post-conditions: Returns a node removed.
	 * 
	 * @param node Node to be deleted
	 * @return node deleted
	 * @throws NullPointerException If the specified node is null.
	 */
	public BSTNodeADT<E> remove(BSTNode<E> node) throws NullPointer Exception;

	/**
	 * Determine whether a specific node has left child or not.
	 * 
	 * Pre-conditions: A valid node contains the element
	 * Post-conditions: It returns true if the node has a left child
	 * 
	 * @param node Node to be checked whether having a left child
	 * @return True if node has a left child.
	 */
	public boolean hasLeftChild(BSTNode<E> node);

	/**
	 * Determine whether a specific node has right child or not
	 * 
	 * Pre-conditions: A valid node contains the element
	 * Post-conditions: It returns true if the node has a right child
	 * 
	 * @param node Node to be checked whether having a right child
	 * @return True if node has a right child.
	 */
	public boolean hasRightChild(BSTNode<E> node);

	/**
	 * Determine whether a node's left and child nodes are null.
	 * 
	 * Pre-conditions: A valid node contains the element.
	 * Post-conditions: It returns true if the node is a leaf.
	 * 
	 * @param node Node to be checked.
	 * @return True if node is a leaf.
	 */
	public boolean isLeaf(BSTNode<E> node);

	/**
	 * Return a root node for the binary search tree
	 * 
	 * Pre-conditions: A valid binary search tree.
	 * Post-conditions: It returs root node of the tree.
	 * 
	 * @return node Root node of the binary search tree.
	 */
	public BSTNodeADT<E> getRoot();

	/**
	 * Return the size of the binary search tree
	 * 
	 * Pre-conditions: A valid binary search tree.
	 * Post-conditions: It returns the total size of the binary search tree
	 * 
	 * @return int The number of nodes of the binary search tree.
	 */
	public int size();

	/**
	 * It determines whether the binary search tree is empty or not.
	 * 
	 * Pre-conditions: A valid binary search tree.
	 * Post-conditions: It returns true if the binary search tree has no node.
	 * 
	 * @return true if the binary search tree is empty
	 */
	public boolean isEmpty();

	/**
	 * Clear the binary search tree to be empty
	 * 
	 * Pre-conditions: A valid binary search tree.
	 * Post-conditions: All nodes of the binary search tree will be disconnected.
	 * 
	 */
	public void clear();

	/**
	 * It determines whether the binary search tree has a specific node or not.
	 * 
	 * Pre-conditions: A valid binary search tree.
	 * Post-conditions: It returns true if the binary search tree contains a specific node.
	 * 
	 * @param node A node to be search in the binary search tree
	 * @return true if the binary search tree contains the node.
	 * @throws NullPointerException If the specified node is null
	 */
	
	public boolean contains(BSTNode<E> node) throws NullPointerException;
	
	/**
	 * Returns an iterator over the elements in this list, in proper sequence.
	 * 
	 * @return An iterator over the elements in this list, in proper sequence. NB:
	 *         The return is of type utilities.Iterator.
	 */
	public Iterator<E> iterator();

	
}
