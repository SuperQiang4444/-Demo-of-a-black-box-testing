package vote;

import java.util.Vector;

import org.junit.Test;
//correct Census's implementation
public class CensusImplTrue implements Census{
	public static Vector<Voter> getVoters() {
		Vector<Voter> voters = new Vector<Voter>();
		Voter voter1 = new VoterImpl();
		Voter voter2 = new VoterImpl();
		Voter voter3 = new VoterImpl();
		Voter voter4 = new VoterImpl();
		voters.add(voter1);
		voters.add(voter2);
		voters.add(voter3);
		voters.add(voter4);
		return voters;
	}
	
	@Override
	public int voting(Vector<Voter> voters) {
		//how many false and true
		int i1 = 0;
		int i2 = 0;
		for(int i = 0;i < voters.size();i++){
			if(voters.get(i).vote() == false){
				i1++;
			}else {
				i2++;
			}
		}
		//judge the return value according to the result
		if(i1 != 0) {
			return i1;
		}else if(i1 == 0 && i2 == voters.size()) {
			return 0;
		}else {
			return -1;
		}
		
	}
}
