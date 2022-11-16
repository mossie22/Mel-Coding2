package classwork;


public class Scope {
    private int x;
    private int y;
    private int z;

    public Scope() {
        x = 3;
        y = 18;
        z = 21;
    }

    public void printScope(){
       // Start here!
       System.out.println(getT());
       System.out.println(getW());
       System.out.println(getX());
       System.out.println(getY());
       System.out.println(getZ());
    }

	 public int getX() {
		return x;
	 }

	 public int getY() {
		return y;
	 }

	 public int getZ() {
		return z;
	 }

    public int getW(){
        int w = x + z;
        return w;
    }

	public int getT() {
        int t = y + z;
		return t;
	}
}