package sample;

public class Main {

	public static void main(String[] args) {

		int numberOfThreads = 100;
		Thread[] threadsArray = new Thread[numberOfThreads];

		ThreadCreator creator = new ThreadCreator(threadsArray);

		creator.createThreads();

		creator.startThreads();
	}

}
