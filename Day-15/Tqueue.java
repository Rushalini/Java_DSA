class Tqueue{
	int data;
	Tqueue Link;
}
class Basicqueue {
	Tqueue head;
		void enqueue(int value) {
			Tqueue newNode = new Tqueue();
			newNode.data=value;
			if(head==null) {
				head=newNode;
			}else {
				Tqueue temp = head;
				while(temp.Link!=null) {
					temp=temp.Link;
				}
				temp.Link=newNode;
			}
		}
		void Dequeue() {
			if(!isEmpty())
				 // add10.link =>add20
			head=head.Link;
			else {
				System.out.println("queue is empty");
			}
		}
        boolean contains(int value) {
            Tqueue temp = head;
            while(temp!=null){
                if(temp.data==value){
                    return true;
                }
                temp=temp.Link;
            }
            return false;
        }
		int peek() {
			if(!isEmpty()) {
				return head.data;
			}
			return -1;
		}
		boolean isEmpty() {
			return head==null;
		}

	public static void main(String[] args) {

		Basicqueue ob = new Basicqueue() ;

		ob.enqueue(10);

		ob.enqueue(20);

		ob.enqueue(30);

		ob.enqueue(40);

		ob.Dequeue();

		ob.Dequeue();
        System.out.println(ob.contains(30));
        System.out.println(ob.contains(50));
		System.out.println(ob.peek());

		System.out.println(ob.isEmpty());

	}

}


