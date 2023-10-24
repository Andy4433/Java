public class OR{
	public static void main(String[] args){
		// and--> &&, or --> ||, not -->!
		double valortotalconta = 200;
		double valortotalcontap = 10000;
		float valorPlay = 5000F;
		boolean isPlaystationCompravel = valortotalconta >= valorPlay || valortotalcontap >= valorPlay;
		System.out.println(isPlaystationCompravel);

	}

}