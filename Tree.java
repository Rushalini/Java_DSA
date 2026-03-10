class Tnode{

	int data;

	Tnode left;

	Tnode right;

	Tnode(int value){

		data=value;

	}

}

class Tree {

		void inorder(Tnode root) {

			if(root==null)return;

			inorder(root.left);

			System.out.println(root.data);

			inorder(root.right);

		}

		void preorder(Tnode root) {

			if(root==null)return;

			System.out.println(root.data);

			preorder(root.left);

			preorder(root.right);

		}

		void postorder(Tnode root) {

			if(root==null)return;

			postorder(root.left);

			postorder(root.right);

			System.out.println(root.data);

		}

	public static void main(String[] args) {

		Tree ob = new Tree();

		Tnode root = new Tnode(10);

		root.left=new Tnode(20);

		root.right=new Tnode(30);

		root.left.left = new Tnode(40);

		root.left.right = new Tnode(50);

//		ob.inorder(root);

//		ob.preorder(root);

		ob.postorder(root);

	}

}


