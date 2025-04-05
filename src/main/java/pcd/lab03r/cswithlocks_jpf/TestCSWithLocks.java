package pcd.lab03r.cswithlocks_jpf;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestCSWithLocks {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		new MyWorkerB("MyAgent-01", lock).start();
		new MyWorkerA("MyAgent-02", lock).start();		
	}
}
