class Notes {
	public static void main(String args[]) {

		//forwards

		int[] arr = {1, 3, 5, 7, 8, 2, 4, 6};
		
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
		}

		//backwards

		for (int i = arr.length - 1; i >= 0; i--) {
			// System.out.println(arr[i]);
		}

		//backwards while going forwards with a counter

		int counter = arr.length - 1;
		
		for (int i = 0; i < arr.length; i++) {
			// System.out.println("forwards: " + arr[i]);
			// System.out.println("backwards: " + arr[counter]);
			counter--;
		}

		//backwards while going forwards without a counter

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Forwards: " + arr[i]);
			System.out.println("Backwards: " + arr[arr.length - 1 - i]);
		}

		
	}
}