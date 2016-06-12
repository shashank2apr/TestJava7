package test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestEffectiveFinal {
	
	
	
	public static void main(String[] args) {
		
		final String outer="Outer";
		/*ExecutorService pool = Executors.newFixedThreadPool(10);
		//Future f=pool.submit(()->{return null;})
		
		Future future = pool.submit(new Callable<Future>() {

			@Override
			public Future call() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		});
				*/
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println(outer);
			}
		}).start();
		
		
	}
	
}
