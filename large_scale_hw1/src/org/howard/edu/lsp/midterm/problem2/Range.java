package org.howard.edu.lsp.midterm.problem2;

public class Range {
	
	int start;
	int end;
	
	public Range(int rangeStart, int rangeEnd) {
		this.start = rangeStart;
		this.end = rangeEnd;
	}
	
	public boolean isValueInRange(int value) {
		if (start <= value && value <= end) {
			return true;
		}
		return false;
	}
	
	public boolean doRangesOverlap(Range otherRange) {
		if (otherRange.end < start || end < otherRange.start) {
			return false;
		}
		return true;
	}
	
	public int size() {
		return end-start+1;
	}
}
