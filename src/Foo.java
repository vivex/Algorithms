
public class Foo {

	TeamSkill t = new TeamSkill();
	/**
	 * @param args
	 */
	 static   public void  main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("OK");
		
		   RunnableDemo R1 = new RunnableDemo( "Thread-1");
		      R1.start();
		      
		      RunnableDemo R2 = new RunnableDemo( "Thread-2");
		      R2.start();
	}

}
