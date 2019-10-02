class NewThread extends Thread{
	NewThread(){
		//create a new second thread
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		start();
	}

	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Child interrupted!");
		}
		System.out.println("Exiting child thread.");
	}
}

class Demo{
	public static void main(String[] args) {
		new NewThread(); //create a new thread

		try{
			for(int i=5;i>0;i--){
				System.out.println("Main thread: " + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted.");
		}
	}
}