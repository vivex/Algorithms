import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;


public class TeamSkill {
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Long, Long> storage =  new HashMap<Long, Long>();
		HashMap<Long, Long> countStorage =  new HashMap<Long, Long>();;
		Scanner in = new Scanner(System.in);
		int numberOfTestCases = in.nextInt();
		
		for(int i=0;i<numberOfTestCases;i++){
			long n = in.nextLong();
			Object[] keys = countStorage.keySet().toArray();
			Arrays.sort(keys);
			long count = 0;
			long start = 0;
		if(countStorage.get(n)!=null)
				count = countStorage.get(n);
		else{
				for(int j=keys.length;j>=0;j--){
					if(keys.length>j && (Long) keys[j]<=n){
						count = countStorage.get(keys[j]);
						start = (Long) keys[j];
						break;
					}
				}
				
				for(long j=start;j<=n;j++){
					long temp = 0;
					if(storage.get(j)==null){
						 temp = DoubleDabble(j);
						 storage.put(j,temp);
					}
					else
						temp = storage.get(j);
					
					if(temp==2){
						
						count = count+j;
						
						countStorage.put(j,count);
					}
				}	
				
		}
			countStorage.put(n,count);
			System.out.println(count);
		}
	}
	
	public static long countSetBits( long n)
	{
	   int count = 0;
		  while(n!=0)
		  {
		    count += n & 1;
		    n >>= 1;
		  }
		  return count;
	}
	
	public static long DoubleDabble(long n) {
		long dividend = n;
		long divisor = 2;
		long quotient = dividend;
		long remainder = 0;
		long count = 0;
		while (quotient != 0) {
		remainder = quotient % divisor;
		quotient = quotient / divisor;
		if (remainder == 1)
		count++;
		}
		return count;

	}

}