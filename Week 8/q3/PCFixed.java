class Q{
	int n;
	boolean isThereElementInQ = false;

	synchronized int get(){
		while(!isThereElementInQ)
			try{
				wait();
				Thread.sleep(200);
			}catch(InterruptedException e){
				System.out.println("InterruptedException caught");
			}
		

		System.out.println("Got: " + n);
		isThereElementInQ = false;
		notify();
		return n;
	}

	synchronized void put(int n){
		while(isThereElementInQ)
			try{
				wait();
				Thread.sleep(200);
			}catch(InterruptedException e){
				System.out.println("InterruptedException caught");
			}

			this.n = n;
			isThereElementInQ = true;
			System.out.println("Put: " + n);
			notify();
		
	}
}

class Producer implements Runnable{
	Q q;

	Producer(Q q){
		this.q = q;
		new Thread(this, "Producer").start();
	}

	public void run(){
		int i=0;
		while(true){
			q.put(i++);
		}
	}
}

class Consumer implements Runnable{
	Q q;

	Consumer(Q q){
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	public void run(){
		while(true){
			q.get();
		}
	}
}

class PCFixed{
	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);

		System.out.println("PRess ctrl to exit");
	}
}