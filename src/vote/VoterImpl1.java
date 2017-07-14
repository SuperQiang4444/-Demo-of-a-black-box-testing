package vote;

import test.Test1;

public class VoterImpl1 extends VoterImpl{
	
	@Override
	public boolean vote() {
		boolean temp = super.vote();
		System.out.println(temp);
		return temp;
		
	}
	
	
}
