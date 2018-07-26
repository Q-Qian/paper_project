package IHUI_colocation;

import java.io.BufferedWriter;
import java.util.List;

public class IHUI_colocation_Mining {

	/** the current level k in the breadth-first search */
	protected int k; 

	/** total number of candidates */
	protected int totalCandidateCount = 0; 
	
	/** number of candidate generated during last execution */
	protected long startTimestamp; //
	
	/**  start time of last execution */
	protected long endTimestamp; //
	
	/**  end time of last execution */
	private int itemsetCount;  // 
	
	/** itemset found during last execution */
	private int databaseSize;
	
	/** the minimum support set by the user */
	private int minsupRelative;
	
	/** A memory representation of the database. 
	 * Each position in the list represents a transaction */
	private List<int[]> database = null;
	
	/**The  patterns that are found 
	 *  (if the user want to keep them into memory)
	 */
	protected Itemset patterns = null;

	/** object to write the output file (if the user wants to write to a file) */
	BufferedWriter writer = null;

	/** maximum pattern length */
	private int maxPatternLength = Integer.MAX_VALUE; 
	public static void main(String[] args) {
				
	}
	
}
