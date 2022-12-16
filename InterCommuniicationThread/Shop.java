package InterCommuniicationThread;

public class Shop {

	int pen = 10;

	public synchronized void producer() {
		pen++;
		System.out.println("producer " + pen);
		if (pen > 20) {
			try {
				wait();
			} catch (Exception e) {

			}
			if (pen > 10) {
				notify();
			}
		}

	}

	public synchronized void consumer() {
		pen--;
		System.out.println("consumer " + pen);
		if (pen < 1) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}

			if (pen > 5) {
				notify();
			}
		}
	}

}
