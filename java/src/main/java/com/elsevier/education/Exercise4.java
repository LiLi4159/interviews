package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
Answer: No, it is not safe because multiple threads can access it concurrently.
We can use AtomicInteger to fix it.
*/
public class Exercise4 {

	public static class Counter {
		
		private static java.util.concurrent.atomic.AtomicInteger count = new java.util.concurrent.atomic.AtomicInteger(0);
		
		public int increment() {
			return count.incrementAndGet();
		}
		
		public int getCount() {
			return count.get();
		}
		
		public void resetCount() {
			count = new java.util.concurrent.atomic.AtomicInteger(0);
		}

	}
}