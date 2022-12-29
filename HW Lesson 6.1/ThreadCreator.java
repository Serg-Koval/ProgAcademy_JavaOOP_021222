package sample;

public class ThreadCreator {
	private Thread[] threads;

	public ThreadCreator(Thread[] threads) {
		super();
		this.threads = threads;
	}
		
	public void createThreads() {
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new GetFactorialTask(i));
		}
	}

	public void startThreads() {
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
	}
}
