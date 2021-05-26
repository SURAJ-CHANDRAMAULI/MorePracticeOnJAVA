package trees;

import java.util.Scanner;

public class TreeUse {
	
	public static  Scanner s = new Scanner(System.in);
	
	
//	public static TreeNode<Integer> takeInput(){
//		
//		int n;
//		
//		System.out.println("enter node data");
//		n=s.nextInt();
//		TreeNode<Integer> root = new TreeNode<Integer>(n);
//		
//		System.out.println("enter no. children nodes for " + n);
//		int childcount = s.nextInt();
//		for(int i =0; i<childcount;i++) {
//			
//			TreeNode<Integer> child =	takeInput();
//			root.children.add(child);
//			
//		}
//		
//		return root;
//	}
	
	public static void print(TreeNode<Integer> root) {
		  
		String s = root.data+" :";
		
		for(int i=0;i<root.children.size();i++)
		s=s+root.children.get(i).data +",";
		
		System.out.println(s);
		

		for(int i=0;i<root.children.size();i++)
			print(root.children.get(i));
		
	}
	
	
	public static TreeNode<Integer> takeInputLevelWise(){
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the root Data");
		
		int rootData = s.nextInt();
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			try {
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			System.out.print("Enter the num of children of "+ frontNode.data);
			
			int numChildren=s.nextInt();
			
			for(int i=0;i<numChildren;i++) {
				
				System.out.println("enter "+(i+1)+"th child of "+frontNode.data);
				int child=s.nextInt();
				
				TreeNode<Integer> childNode = new TreeNode<>(child);
				
				frontNode.children.add(childNode);
				
				pendingNodes.enqueue(childNode);
			}
			
			}
			catch(QueueEmptyException e) {
				//shouldn't come
				return null;
			}
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		
		TreeNode<Integer> root = takeInputLevelWise();
		print(root);
		
		// TODO Auto-generated method stub
//		TreeNode<Integer> root = new TreeNode<>(4);
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(5);
//		TreeNode<Integer> node4 = new TreeNode<>(6);
//		
//		
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node1);
//		
//		System.out.println(root);

	}

}
