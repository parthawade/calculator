class Calculator {

	public int add(int a, int b) {
		int c = a+b;
		return c;
	}

	public void addAndPrint(int a, int b) {
		int c = a+b;
		System.out.print("From addAndPrint() from Github: "+c);
	}

	public static void main(String[] abc) {
		Calculator calculator = new Calculator();
		int sum = calculator.add(20,30);
		System.out.println(sum);
		calculator.addAndPrint(2424,87909);

	}
}