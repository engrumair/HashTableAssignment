package com.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestHashTable {

	/**
	 * @param args
	 */
	
	static String FILE_ADDRESS = "G:/assignment6/task1data.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		int[] a = new int[2];
		long aTestNumber = 20000000000l;
		for(long i=0; i < aTestNumber; i++  ){
			
			a[0]=1;
			
			
		}
		System.out.println("Done");*/
		
		java.util.HashMap aMap = new HashMap();
		
		
		In aFile = new In(FILE_ADDRESS);
		
		int totalValues = 1000000;
		int start =0;
		int totalDistinctValues =0;
		
		//int aValue = 68037543430;
		
		while(start< totalValues){
			
		
			start++;
			
			long aNumber =  aFile.readLong(); //totalDistinctValues++;//aFile.readLine();
			
			//aMap.put(null, aNumber);
			
			
			
			//System.out.println(aNumber);
			
			if(!aMap.containsKey(aNumber)){
				
				aMap.put( aNumber, aNumber);
				
				totalDistinctValues++;
			}
			
			
			
			
		} 
		System.out.println("Things Loaded ");
		
		Set aSet =  aMap.keySet();
		
		Iterator keysIterator =  aSet.iterator();
		
		ArrayList<Integer> aListTarget = new ArrayList<Integer>();
		
		for(int t=-10000; t<=10000; t++){
			
			aListTarget.add(t);
			
		}
		
		int resultantCount =0; 
		while(keysIterator.hasNext()){
			
			long resultNumber = (long) keysIterator.next();
			
			for(int k=0; k<aListTarget.size();k++ ){
				
				long toCompare = aListTarget.get(k)-resultNumber;
				
				if(aMap.containsKey(toCompare)){
					
					resultantCount++;
					aListTarget.remove(k);
					
				}
				
			}
			
			
			
		}
		System.out.println("Resultant Count: ");
		
		System.out.println(resultantCount);

		
		
		
		

	}

}
