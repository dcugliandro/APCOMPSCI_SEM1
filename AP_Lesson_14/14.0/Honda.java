public class Honda implements Location
{
	private double xco, yco;
	public Honda()
	{
		xco = 0;
		yco = 0;
	}
	public Honda(double[] xy)
	{
		xco = 0;
		yco = 0;
		move(xy[0], xy[1]);
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	public void move(double x, double y)
	{
		xco+=x;
		yco+=y;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = xco;
		location[1] = yco;
		return location;
	}
}