import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class ProducerConsumerClass {
	
	public static void main(String[] args) {
		Queue<Integer> buffer = new LinkedList<>();
		int MAX_SIZE = 5;
		
		Thread producer = new Producer(buffer, MAX_SIZE, "PRODUCER");
		Thread consumer = new Consumer(buffer, MAX_SIZE, "CONSUMER");
		
		producer.start();
		consumer.start();
	}

}

class Producer extends Thread{
	Queue<Integer> queue;
	int MAX_SIZE;
	
	Producer(Queue<Integer> buffer, int MAX_SIZE, String name){
		super(name);
		this.queue = buffer;
		this.MAX_SIZE = MAX_SIZE;
	}
	
	public void run(){
		while(true){
			synchronized (queue) {
				while(queue.size() == MAX_SIZE){
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				Random random = new Random();
				int value = random.nextInt();
				System.out.println("Producing value : " + value);
				queue.add(value);
				queue.notifyAll();
			}
		}
	}
}

class Consumer extends Thread{
	Queue<Integer> queue;
	int MAX_SIZE;
	
	Consumer(Queue<Integer> buffer, int MAX_SIZE, String name){
		super(name);
		this.queue = buffer;
		this.MAX_SIZE = MAX_SIZE;
	}
	
	public void run(){
		while(true){
			synchronized (queue) {
				while(queue.isEmpty()){
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				 System.out.println("Consuming value : " + queue.remove());
				queue.notifyAll();
			}
		}
	}
}
