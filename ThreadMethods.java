class ThreadMethods extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){}
			System.out.println("Threadid: "+this.getId()+" Priority: "+this.getPriority()+" Thread Name: "+this.getName());
		}
	}
	public static void main(String[] args) throws InterruptedException{
		ThreadMethods ob1=new ThreadMethods();
		ob1.setName("Thread A");
		System.out.println(ob1.getName());
		ob1.start();
		ob1.join();
		ThreadMethods ob2=new ThreadMethods();
		ob2.start();
		ob2.join();
		ThreadMethods ob3=new ThreadMethods();
		ob3.start();
		ob3.join();
		System.out.println("Main thread ends here!");
	}
}