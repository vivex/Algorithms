import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class TestClass {

	/**
	 * @param args
	 */
		public static void main(String args[] ) throws Exception {
		
			List<Long> superSet = new ArrayList<Long>();
			
			Scanner in = new Scanner(System.in);
			int numberOfTestCases = in.nextInt(); 
			
			for(int i=0;i<numberOfTestCases;i++){
				superSet.add(in.nextLong()) ;
			}
			List<Set<Long>> subSets = new ArrayList<Set<Long>>();
			for(int i=1;i<superSet.size();i++){
				subSets.addAll(getSubsets(superSet,i));
			}
			
			
			ArrayList<Long> xors = new ArrayList<Long>();
			for(int i =0;i<subSets.size();i++){
				Set<Long> set = subSets.get(i);
				long xor = 0;
				for(long n:set){
					xor = xor^n;
				}
				xors.add(xor);
			}
			
			long mainXor = 0;
			for(long x: xors){
				mainXor = mainXor^x;
			}
			
			System.out.println(mainXor);
			
			
			
	    }
		
		private static void getSubsets(List<Long> superSet, int k, int idx, HashSet<Long> hashSet,List<Set<Long>> res) {
		    //successful stop clause
		    if (hashSet.size() == k) {
		        res.add(new HashSet<Long>(hashSet));
		        return;
		    }
		    //unseccessful stop clause
		    if (idx == superSet.size()) return;
		    Long x = superSet.get(idx);
		    hashSet.add(x);
		    //"guess" x is in the subset
		    getSubsets(superSet, k, idx+1, hashSet, res);
		    hashSet.remove(x);
		    //"guess" x is not in the subset
		    getSubsets(superSet, k, idx+1, hashSet, res);
		}

		public static List<Set<Long>> getSubsets(List<Long> superSet, int k) {
		    List<Set<Long>> res = new ArrayList<Set<Long>>();
		    getSubsets(superSet, k, 0, new HashSet<Long>(), res);
		    return res;
		}
		


}
