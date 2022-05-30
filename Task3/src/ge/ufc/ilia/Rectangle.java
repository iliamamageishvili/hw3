package ge.ufc.ilia;

public class Rectangle {
	private float height;
	private float width;
	
public void setHeight(float height) {
	this.height = height;
}

public void setWidth(float width) {
	this.width = width;
}

public float getHeight() {
	return height;
}

public float getWidth() {
	return width;
}

protected float perimeter() {
	return 2*(height + width);
}
protected float area() {
	return height * width;
}
public int  isEqual(Rectangle r1 ) {
	int ans = 0;
		if(this.area() > r1.area())
			ans = 1;
		if(this.area() < r1.area())
			ans = -1;
	return ans;
}
}
