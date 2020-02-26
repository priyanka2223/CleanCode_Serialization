package clean_code;

public class Interest {

	public double simpleInterest(double p, double t, double r) {
		return ((p*t*r)/100);
	}

	public double compoundInterest(double p, double t, double r) {
		return (p*(Math.pow(1+(r/100),t)));
	}

}