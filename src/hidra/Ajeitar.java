package hidra;

public class Ajeitar {
	
	public int cord;
	public int getCord() {
		int cord = (int) (Math.random() * 1000);
		return cord;
	}
	
	public void setCord(int cord) {
		this.cord = cord - 7;
	}

}
