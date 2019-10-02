class NewThread implements Runnable{

	Thread t;

	NewThread(){
		t = new Thread(this, "Child thread");
		System.out.println("Child thread: " + t.getName());
		t.start();
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

class RunnableDemo{
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