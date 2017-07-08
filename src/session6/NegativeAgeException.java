package session6;

//User Defined Exception
class NegativeAgeException extends Exception{
	NegativeAgeException(){
		System.out.println("**********************Error*************************************");
		System.out.println("Throwing Negative Age Exception :Enter positive Value");
		System.out.println("**********************Error*************************************");
	}

}
