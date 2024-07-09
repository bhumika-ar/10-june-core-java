class Speaker {

	static boolean isConnected = false;

	public static boolean onOrOff() {
		System.out.println("Start of turnOn method");

		if ( isConnected == false) {
			isConnected = true;
			System.out.println("Speaker is turned on");
		}
		 else if ( isConnected == true) {
			isConnected = false;
			System.out.println("Main Ended");
		}
		
		
		System.out.println("End of turnOn method");
		return isConnected ;
	}
}

	