package InterCommuniicationThread;

public class Producer extends Thread{
	Shop shop;

	public Producer(Shop shop) {
		super();
		this.shop = shop;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			shop.producer();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
