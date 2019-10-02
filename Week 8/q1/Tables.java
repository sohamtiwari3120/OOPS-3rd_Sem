class Multi extends Thread{

	int num;

	Multi(int n){
		num = n;
		start();
	}

	public void run(){
		try{
				for(int i=1;i<11;i++){
					System.out.println(num + "*" + i + " = " + num*i);
					Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Child interrupted");
		}
		System.out.println("************************");
	}
}

class Tables{
	public static void main(String args[]){
		//Multi m = new Multi(5);
		new Multi(5);
		// try{
		// 	m.join();
		// }catch(InterruptedException e){
		// 	e.printStackTrace();
		// }
		new Multi(7);

	}
}