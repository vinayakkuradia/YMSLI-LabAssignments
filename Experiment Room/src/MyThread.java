class MyThread extends Thread {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		try {
			t.join(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.run();
	}

	public void run() {
		for (int i = 1; i < 3; ++i) {
			System.out.print(i + "..");
		}
	}
}