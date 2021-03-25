package ThreadPrograms;

public class RunnableExample implements Runnable{

	
		public static int amount=12;
		public static void main(String[] args) {
			
			RunnableExample obj = new RunnableExample();
			Thread thread = new Thread(obj);
			thread.start();
			

			thread.isAlive();
			{
				System.out.println("run method is running");
			}
			System.out.println("1: "+amount);
			amount--;
			System.out.println("3: "+amount);

			
		}
		public void run()
		{
			amount--;
			System.out.println("2: "+amount);
		}
	}

