package test;

import java.util.Vector;

import org.junit.Test;

import vote.Census;
import vote.CensusImplTrue;
import vote.Voter;
//test
//Unfinished!!!
//TODO
import vote.VoterImpl;
import vote.VoterImpl1;
public class Test1 {
	//在只知道2个接口名字和2个方法名的情况下进行测试
	public static void main(String[] args){
	CensusImplTrue censusImplTrue = new CensusImplTrue();
	Vector<Voter> voters = censusImplTrue.getVoters();
	int i1=0;
	int i2=0;
	int i3=0;
	for(int i = 0;i < voters.size();i++){
		boolean temp = voters.get(i).vote();
		if(temp == false){
			i1++;
		}else if(temp == true) {
			i2++;
		}else {
			i3++;
		}
	}
	//如果i3等于0说明满足第4条
	if(i3 !=0 ){
		System.out.println("未通过");
	}else{
	//利用voters.get(0).getClass()可以得到Voter实现类的名字为VoterImpl
	//利用cglib动态代理的思想写一个实现的子类VoterImpl1，对其进行增强
	//创建子类VoterImpl1的Vector集合
	Vector<Voter> voters1 = new Vector<Voter>();
	Voter voter1 = new VoterImpl1();
	Voter voter2 = new VoterImpl1();
	Voter voter3 = new VoterImpl1();
	Voter voter4 = new VoterImpl1();
	voters1.add(voter1);
	voters1.add(voter2);
	voters1.add(voter3);
	voters1.add(voter4);
	//根据结果可以很清晰的看出
	int value = censusImplTrue.voting(voters1);
	System.out.println(value);
	}
	}
}
