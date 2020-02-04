package s4.B193313; // Please modify to s4.Bnnnnnn, where nnnnnn is your student ID. 
import java.lang.*;
import s4.specification.*;

/*
interface FrequencerInterface {     // This interface provides the design for frequency counter.
    void setTarget(byte[]  target); // set the data to search.
    void setSpace(byte[]  space);  // set the data to be searched target from.
    int frequency(); //It return -1, when TARGET is not set or TARGET's length is zero
                    //Otherwise, it return 0, when SPACE is not set or Space's length is zero
                    //Otherwise, get the frequency of TAGET in SPACE
    int subByteFrequency(int start, int end);
    // get the frequency of subByte of taget, i.e target[start], taget[start+1], ... , target[end-1].
    // For the incorrect value of START or END, the behavior is undefined.
}
*/

/*
package s4.specification;
public interface InformationEstimatorInterface{
    void setTarget(byte target[]); // set the data for computing the information quantities
    void setSpace(byte space[]); // set data for sample space to computer probability
    double estimation(); // It returns 0.0 when the target is not set or Target's length is zero;
// It returns Double.MAX_VALUE, when the true value is infinite, or space is not set.
// The behavior is undefined, if the true value is finete but larger than Double.MAX_VALUE.
// Note that this happens only when the space is unreasonably large. We will encounter other problem anyway.
// Otherwise, estimation of information quantity, 
}                        
*/

/*
public class TestCase {
    public static void main(String[] args) {
	try{
		FrequencerInterface  myObject1;
	    int freq;
	    System.out.println("checking s4.B193313.Frequencer");
		myObject1 = new s4.B193313.Frequencer();
		//Hを探し、4つであるか
	    myObject1.setSpace("Hi Ho Hi Ho".getBytes());
		myObject1.setTarget("H".getBytes());		
	    freq = myObject1.frequency();
	    System.out.print("1:\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
		if(4 == freq) { 
			System.out.println("OK"); 
		} else {
			System.out.println("WRONG"); 
		}
	}	
	catch(Exception e) {
		System.out.println("1:Exception occurred : STOP");
	}

	try{
		//iを探し、2つであるか
		FrequencerInterface  myObject2;
		int freq;
		myObject2 = new s4.B193313.Frequencer();
		myObject2.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject2.setTarget("i".getBytes());
	    freq = myObject2.frequency();
	    System.out.print("2:\"i\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
		if(2 == freq) { 
			System.out.println("OK"); 
		} else {
			System.out.println("WRONG"); 
		}
	}
	catch(Exception e) {
		System.out.println("2:Exception occurred : STOP");
	}

	try{
		//oを探し、2つであるか
		FrequencerInterface  myObject3;
		int freq;
		myObject3 = new s4.B193313.Frequencer();
		myObject3.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject3.setTarget("o".getBytes());
	    freq = myObject3.frequency();
	    System.out.print("3:\"o\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
		if(2 == freq) { 
			System.out.println("OK"); 
		} else {
			System.out.println("WRONG"); 
		}
	}
	catch(Exception e) {
		System.out.println("3:Exception occurred : STOP");
	}
	try{
		// を探し、3つであるか
		FrequencerInterface  myObject4;
		int freq;
		myObject4 = new s4.B193313.Frequencer();
		myObject4.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject4.setTarget("".getBytes());
	    freq = myObject4.frequency();
	    System.out.print("4:\"(null)\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
		if(-1 == freq) { 
			System.out.println("OK"); 
		} else {
			System.out.println("WRONG"); 
		}
	}
	catch(Exception e) {
		System.out.println("4:Exception occurred : STOP");
	}
	try{
		//	無からHを探す
		FrequencerInterface  myObject5;
		int freq;
		myObject5 = new s4.B193313.Frequencer();
		myObject5.setSpace("".getBytes());
		myObject5.setTarget("H".getBytes());
		freq = myObject5.frequency();
		System.out.print("5:\"H\" in \"(null)\" appears "+freq+" times. ");
		if(0 == freq) { 
			System.out.println("OK"); 
		} else {
			System.out.println("WRONG"); 
		}
	}
	catch(Exception e) {
		System.out.println("5:Exception occurred : STOP");
	}
	try{
		//	無から無を探す
		FrequencerInterface  myObject6;
		int freq;
		myObject6 = new s4.B193313.Frequencer();
		myObject6.setSpace("".getBytes());
		myObject6.setTarget("".getBytes());
		freq = myObject6.frequency();
		System.out.print("6:\"(null)\" in \"(null)\" appears "+freq+" times. ");
		if(0 == freq) { 
			System.out.println("OK"); 
		} else {
			System.out.println("WRONG"); 
		}
	}
	catch(Exception e) {
	    System.out.println("6:Exception occurred : STOP");
	}
	try{
		//そもそもSPACEをセットしない :7
		FrequencerInterface  myObject7;
	    int freq;
		myObject7 = new s4.B193313.Frequencer();
	    //NO!! setSpace("Hi Ho Hi Ho".getBytes());
		myObject7.setTarget("H".getBytes());		
	    freq = myObject7.frequency();
	    System.out.print("7:\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
		if(4 == freq) { 
			System.out.println("OK"); 
		} else {
			System.out.println("WRONG"); 
		}
	}	
	catch(Exception e) {
		System.out.println("7:Exception occurred : STOP");
	}
	
	try{
		//そもそもTARGETをセットしない :8
		FrequencerInterface  myObject8;
	    int freq;
		myObject8 = new s4.B193313.Frequencer();
	    myObject8.setSpace("Hi Ho Hi Ho".getBytes());
		//NO!!! setTarget("H".getBytes());		
	    freq = myObject8.frequency();
	    System.out.print("8:\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
		if(4 == freq) { 
			System.out.println("OK"); 
		} else {
			System.out.println("WRONG"); 
		}
	}	
	catch(Exception e) {
		System.out.println("8:Exception occurred : STOP");
	}

	try {
	    InformationEstimatorInterface myObject;
	    double value;
	    System.out.println("checking s4.B193313.InformationEstimator");
	    myObject = new s4.B193313.InformationEstimator();
	    myObject.setSpace("3210321001230123".getBytes());
	    myObject.setTarget("0".getBytes());
	    value = myObject.estimation();
	    System.out.println(">0 "+value);
	    myObject.setTarget("01".getBytes());
	    value = myObject.estimation();
	    System.out.println(">01 "+value);
	    myObject.setTarget("0123".getBytes());
	    value = myObject.estimation();
	    System.out.println(">0123 "+value);
	    myObject.setTarget("00".getBytes());
	    value = myObject.estimation();
	    System.out.println(">00 "+value);
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}

    }
}	    
*/

public class TestCase {
    public static void main(String[] args) {
	int c;
	c = 0;
	try {
	    FrequencerInterface  myObject;
	    int freq;
		    c = 0;
	    System.out.println("checking Frequencer");
	    myObject = new Frequencer();
	    freq = myObject.frequency();
	    if(-1 != freq) { System.out.println("frequency() should return -1, when target is not set, but returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setTarget("".getBytes());
	    freq = myObject.frequency();
	    if(-1 != freq) { System.out.println("frequency() should return -1, when target is empty, but return "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAA".getBytes());
	    if(-1 != freq) { System.out.println("frequency() for AAA should return -1, when target is  not set. But it returns  "+freq); c++; }	
	    myObject = new Frequencer();
	    myObject.setSpace("AAA".getBytes());
	    myObject.setTarget("".getBytes());
	    freq = myObject.frequency();
	    if(-1 != freq) { System.out.println("frequency() for AAA should return -1, when taget empty string. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setTarget("A".getBytes());
	    freq = myObject.frequency();	   
 	    if(0 != freq) { System.out.println("frequency() for not set, should return 0, when taget is not empty. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("".getBytes());
	    myObject.setTarget("A".getBytes());
	    freq = myObject.frequency();	   
 	    if(0 != freq) { System.out.println("frequency() for empty space, should return 0, when taget is not empty. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAA".getBytes());
	    myObject.setTarget("A".getBytes());
	    freq = myObject.frequency();
	    if(3 != freq) { System.out.println("frequency() for AAA, should return 3, when taget is A. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAA".getBytes());
	    myObject.setTarget("AA".getBytes());
	    freq = myObject.frequency();
	    if(2 != freq) { System.out.println("frequency() for AAA, should return 2, when taget is AA. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAA".getBytes());
	    myObject.setTarget("AAA".getBytes());
	    freq = myObject.frequency();
	    if(1 != freq) { System.out.println("frequency() for AAA, should return 1, when taget is AAA. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAA".getBytes());
	    myObject.setTarget("AAAA".getBytes());
	    freq = myObject.frequency();
	    if(0 != freq) { System.out.println("frequency() for AAA, should return 0, when taget is AAAA. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    if(4 != freq) {System.out.println("frequency() for Hi_Ho_Hi_Ho, should return 4, when taget is H. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("Ho".getBytes());
	    freq = myObject.frequency();
	    if(2 != freq) {System.out.println("frequency() for Hi_Ho_Hi_Ho, should return 2, when taget is Ho. But it returns "+freq); c++; }
	    /* please note subByteFreqency(0,0) is considered illeagal specification, and you should not include this case */
	    myObject = new Frequencer();
	    myObject.setSpace("AAAB".getBytes());
	    myObject.setTarget("AAAAB".getBytes());
	    freq = myObject.subByteFrequency(0,1);
	    if(3 != freq) { System.out.println("SubBytefrequency() for AAAB, should return 3, when taget is AAAAB[0:1]. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAAB".getBytes());
	    myObject.setTarget("AAAAB".getBytes());
	    freq = myObject.subByteFrequency(1,2);
	    if(3 != freq) { System.out.println("SubBytefrequency() for AAAB, should return 3, when taget is AAAAB[1:2]. But it returns "+freq); c++; }
	    if(2 == freq) { System.out.println("You might be confused by the intentional error in sample code.");   }
	    myObject = new Frequencer();
	    myObject.setSpace("AAAB".getBytes());
	    myObject.setTarget("AAAAB".getBytes());
	    freq = myObject.subByteFrequency(1,3);
	    if(2 != freq) { System.out.println("SubBytefrequency() for AAAB, should return 2, when taget is AAAAB[1:3]. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAAB".getBytes());
	    myObject.setTarget("AAAAB".getBytes());
	    freq = myObject.subByteFrequency(4,5);
	    if(1 != freq) { 
		System.out.println("SubBytefrequency() for AAAB, should return 1, when taget is AAAAB[4:5]. But it returns "+freq); c++;  
	    }
	}
	catch(Exception e) {
	    System.out.println("Exception occurred in Frequencer Object: STOP");
	    c++;
	}

	try {
	    InformationEstimatorInterface myObject;
	    double value;
	    System.out.println("checking s4.slow.InformationEstimator");
	    myObject = new InformationEstimator();
	    myObject.setSpace("3210321001230123".getBytes());
	    myObject.setTarget("0".getBytes());
	    value = myObject.estimation();
	    if((value < 1.9999) || (2.0001 <value)) { System.out.println("IQ for 0 in 3210321001230123 should be 2.0. But it returns "+value); c++; }
	    myObject.setTarget("01".getBytes());
	    value = myObject.estimation();
	    if((value < 2.9999) || (3.0001 <value)) { System.out.println("IQ for 01 in 3210321001230123 should be 3.0. But it returns "+value); c++; }
	    myObject.setTarget("0123".getBytes());
	    value = myObject.estimation();
	    if((value < 2.9999) || (3.0001 <value)) { System.out.println("IQ for 0123 in 3210321001230123 should be 3.0. But it returns "+value); c++; }
	    myObject.setTarget("00".getBytes());
	    value = myObject.estimation();
	    if((value < 3.9999) || (4.0001 <value)) { System.out.println("IQ for 00 in 3210321001230123 should be 4.0. But it returns "+value); c++; }
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	    c++;
	}
	if(c == 0) { System.out.println("TestCase OK"); }
    }
}