class Dnode{

	int data;

	Dnode left;

	Dnode right;

}

class Basic2 {

	Dnode head;

	Dnode tail;

	int length;

		void addFirst(int value) {

			Dnode newNode = new Dnode();

			newNode.data=value;

			if(head==null) {

				head=newNode;

				tail=newNode;

			}else {

			newNode.right=head;

			head.left=newNode;

			head=newNode;

			}

		}

		void addLast(int value) {

			Dnode newNode = new Dnode();

			newNode.data=value;

			tail.right=newNode;

			newNode.left=tail;

			tail=newNode;

		}

		void addPos(int pos,int value) {

			Dnode newNode = new Dnode();

			newNode.data=value;

			if(pos<0 || pos>len()) {

				System.out.println("invalid position");

				return;

			}

			if(pos==0) addFirst(value);

			if(pos==len())addLast(value);

			else {

				Dnode temp= head;

				while(pos>1) {

					temp=temp.right;

					pos--;

				}

				newNode.right= temp.right;

				newNode.left=temp;

				temp.right=newNode;

				newNode.right.left=newNode;

			}

		}

		void deleteFirst() {

			head=head.right;

			head.left=null;

		}

		void deleteLast() {

			Dnode temp= head;

			tail.left.right=null;

			tail=tail.left;

		}

		void deletePos(int pos) {

			if(pos<0 || pos>=len()) {

				System.out.println("invalid position");

				return;

			}

			if(pos==0) deleteFirst();

			if(pos==len()-1) deleteLast();

			else {

				Dnode temp= head;

				while(pos>1) {

					temp=temp.right;

					pos--;

				}

				temp.right=temp.right.right;

				temp.right.left=temp;

			}

		}




		void update(int target,int value) {

			Dnode temp = head;

			while(temp!=null) {

				if(temp.data==target) {

					temp.data=value;

				}

				temp=temp.right;

			}

		}

		void update2(int pos,int value) {

			if(pos<0 || pos>=len()) {

				System.out.println("invalid position");

				return;

			}

			if(pos==0)head.data=value;

			else {

				Dnode temp = head;

				while(pos>1) {

					temp=temp.right;

					pos--;

				}

				temp.right.data=value;

			}

		}

		int len() {

			Dnode temp= head;

			length=0;

			while(temp!=null) {

				length++;

				temp=temp.right;

			}

			return length;

		}

		void display() {

			Dnode temp= head;

			while(temp!=null) {

				System.out.println(temp.data);

				temp=temp.right;

			}

			System.out.println("forward");

		}

		void reverse() {

			Dnode temp= tail;

			while(temp!=null) {

				System.out.println(temp.data);

				temp=temp.left;

			}

			System.out.println("reverse");

		}




		boolean contains(int target) {

			Dnode temp= head;

			while(temp!=null) {

				if(temp.data==target)

					return true;

				temp=temp.right;

			}

			return false;

		}

	public static void main(String[] args) {

		Basic ob = new Basic() ;

		ob.addFirst(10);

		ob.addFirst(20);

		ob.addLast(30);

		ob.addPos(3, 5);

//		ob.deleteFirst();

//		ob.deleteLast();

//		ob.deletePos(20);

		ob.update(10, 50);

		ob.update2(0, 80);

		System.out.println(ob.contains(30));

		ob.display();

		ob.reverse();

		System.out.println("Len = "+ob.len());

	}

}