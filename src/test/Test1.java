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
	//��ֻ֪��2���ӿ����ֺ�2��������������½��в���
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
	//���i3����0˵�������4��
	if(i3 !=0 ){
		System.out.println("δͨ��");
	}else{
	//����voters.get(0).getClass()���Եõ�Voterʵ���������ΪVoterImpl
	//����cglib��̬�����˼��дһ��ʵ�ֵ�����VoterImpl1�����������ǿ
	//��������VoterImpl1��Vector����
	Vector<Voter> voters1 = new Vector<Voter>();
	Voter voter1 = new VoterImpl1();
	Voter voter2 = new VoterImpl1();
	Voter voter3 = new VoterImpl1();
	Voter voter4 = new VoterImpl1();
	voters1.add(voter1);
	voters1.add(voter2);
	voters1.add(voter3);
	voters1.add(voter4);
	//���ݽ�����Ժ������Ŀ���
	int value = censusImplTrue.voting(voters1);
	System.out.println(value);
	}
	}
}
