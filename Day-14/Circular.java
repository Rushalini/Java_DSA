class Circular{

	int data;

	Circular left;

	Circular right;

}

class Basic1 {

	Circular head;

	Circular tail;

	int length;

		void addFirst(int value) {

			Circular newNode = new Circular();

			newNode.data=value;

			if(head==null) {

				head=newNode;

				tail=newNode;

			}else {

			newNode.right=head;

			head.left=newNode;

			head=newNode;

			head.left=tail;

			tail.right=head;

			}

		}

		void addLast(int value) {

			Circular newNode = new Circular();

			newNode.data=value;

			tail.right=newNode;

			newNode.left=tail;

			tail=newNode;

			head.left=tail;

			tail.right=head;

		}

		void addPos(int pos,int value) {

			Circular newNode = new Circular();

			newNode.data=value;

			if(pos<0 || pos>len()) {

				System.out.println("invalid position");

				return;

			}

			if(pos==0) addFirst(value);

			if(pos==len())addLast(value);

			else {

				Circular temp= head;

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

			head.left=tail;

			tail.right=head;

		}

		void deleteLast() {

			tail.left.right=head;

			tail=tail.left;

			head.left=tail;

		}

		void deletePos(int pos) {

			if(pos<0 || pos>=len()) {

				System.out.println("invalid position");

				return;

			}

			if(pos==0) deleteFirst();

			if(pos==len()-1) deleteLast();

			else {

				Circular temp= head;

				while(pos>1) {

					temp=temp.right;

					pos--;

				}

				temp.right=temp.right.right;

				temp.right.left=temp;

			}

		}




		void update(int target,int value) {

			Circular temp = head;

			do {

				if(temp.data==target) {

					temp.data=value;

				}

				}while(temp!=head);

			temp=temp.right;

		}

		void update2(int pos,int value) {

			if(pos<0 || pos>=len()) {

				System.out.println("invalid position");

				return;

			}

			if(pos==0)head.data=value;

			else {

				Circular temp = head;

				while(pos>1) {

					temp=temp.right;

					pos--;

				}

				temp.right.data=value;

			}

		}

		int len() {

			Circular temp= head;

			length=0;

			do{

				length++;

				temp=temp.right;

			}	while(temp!=head);

			return length;

		}

		void display() {

			Circular temp= head;

			do {

				System.out.println(temp.data);

				temp=temp.right;

			}while(temp!=head);

			System.out.println("forward");

		}

		void reverse() {

			Circular temp= tail;

			do {

				System.out.println(temp.data);

				temp=temp.left;

			}while(temp!=tail);

			System.out.println("reverse");

		}




		boolean contains(int target) {

			Circular temp= head;

			do {

				if(temp.data==target)

					return true;

				temp=temp.right;

			}while(temp!=head);

			return false;

		}

	public static void main(String[] args) {

		Basic1 ob = new Basic1() ;

		ob.addFirst(10);

		ob.addFirst(20);

		ob.addLast(30);

		ob.addPos(3, 5);

		ob.deleteFirst();

		ob.deleteLast();

		ob.deletePos(1);

		ob.update(10, 50);

		ob.update2(0, 80);

		System.out.println(ob.contains(30));

		ob.display();

		ob.reverse();

		System.out.println("Len = "+ob.len());

	}

}


