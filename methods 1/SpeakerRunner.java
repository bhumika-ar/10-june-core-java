class SpeakerRunner{
	
	public static void main(String[] tester){
		System.out.println("Main started");
		boolean connect = Speaker.onOrOff();
		System.out.println(" is speaker connected :" + connect);

		connect = Speaker.onOrOff();
		System.out.println(" is Speaker Connected :" + connect);
	
		
		
		
		System.out.println("Main Ended");
	}
}