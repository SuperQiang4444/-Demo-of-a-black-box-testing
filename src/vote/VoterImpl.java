package vote;

import java.util.Random;

import org.junit.Test;
//Voter's implementation
public class VoterImpl implements Voter {

	@Override
	public boolean vote() {
		//generate a random number of 1 or 2
		int num = new Random().nextInt(2)+1;
		//return true or false in half
		if(num == 1) {
			return true;
		}else {
			return false;
		}
		
	}
	

}
