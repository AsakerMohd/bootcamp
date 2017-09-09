
public class Triangle {
	
	private double x1, y1, x2, y2, x3, y3;
	
	public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
		this.x1 = x1;	this.y1 = y1;
		this.x2 = x1;	this.y2 = y1;
		this.x3 = x1;	this.y3 = y1;
	//	assert(this.area() > 0);
	}
	
	public double area() {
		double area = ((x1-x3)*(y2-y1)-(x1-x2)*(y2-y3))/2;
		
	}
}

