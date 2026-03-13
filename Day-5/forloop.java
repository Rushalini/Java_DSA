class Main {
    public static void main(String[] args) {
		int i=0;
		/*for (System.out.print("1");i<5;System.out.print("+")){
			System.out.print(i);
			i++;
		}*/
		//infinite with +
		/*for (System.out.print("1");true;System.out.print("+")){
			System.out.print(i);
			i++;
		}*/
		/*it will not executed
		for (System.out.print("1");false;System.out.print("+")){
			System.out.print(i);
			i++;
		}*/
		for (;;)//infinite loop
		{
			System.out.print(i);
			i++;
		}
	}
}