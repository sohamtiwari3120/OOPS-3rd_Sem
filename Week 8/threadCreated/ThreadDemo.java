class NewThread extends Thread{


	NewThread(){
		super("Child Thread. ");
		System.out.println("Child thread: " + this.getName());
		start();
	}
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("Child thread  " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}

class ThreadDemo{
	public static void main(String[] args) {
		new NewThread();
		// System.out.println("Main thread: " + this.getName());
		try{
			for(int i=5;i>0;i--){
				System.out.println("Main thread   " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Main interrupted.");
		}
		System.out.println("Exiting Main thread.");
	}
}