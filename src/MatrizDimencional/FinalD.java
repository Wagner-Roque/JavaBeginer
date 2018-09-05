package MatrizDimencional;

public class FinalD {
	public static void main(String[] args) {
		ErroMsg err = new ErroMsg();
		
		System.out.println(err.getErrorMsg(err.OUTER));
		System.out.println(err.getErrorMsg(err.DISKERR));
		System.out.println(err.getErrorMsg(err.INERR));
		System.out.println(err.getErrorMsg(err.INDEXERR));
	}
}
