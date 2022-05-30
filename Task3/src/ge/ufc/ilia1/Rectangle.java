package ge.ufc.ilia1;

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

public static int  isEqual(Rectangle r1 ,Rectangle r2) {
	int ans = 0;
		if(r1.perimeter() > r2.perimeter())
			ans = 1;
		if(r1.perimeter() < r2.perimeter())
			ans = -1;
	return ans;
}

}
