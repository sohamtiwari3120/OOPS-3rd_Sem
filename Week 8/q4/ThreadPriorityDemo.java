class NewThread extends Thread{

	int prio;

	NewThread(int i){
		setPriority(i);
		start();
		prio = i;
	}

	public void run(){
		try{
			System.out.println("Thread with priority " + prio + " starts." + this);
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Thread with priority " + prio + " ends." + this);
	}
}

class ThreadPriorityDemo{
	public static void main(String[] args) {
		new NewThread(1);
		new NewThread(2);
		new NewThread(4);
	}
}