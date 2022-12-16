package InterCommuniicationThread;

public class Consumer extends Thread{
Shop shop;

public Consumer(Shop shop) {
	super();
	this.shop = shop;
}
@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			shop.consumer();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
