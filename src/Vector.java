
/**
 * @author Zane Stauffer
 */
public class Vector {
	public float x;
	public float y;
	
	public Vector(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public static Vector add(Vector a, Vector b){
		return new Vector(a.x + b.x, a.y + b.y);
	}
	public static Vector subtract(Vector a, Vector b){
		return new Vector(a.x - b.x, a.y - b.y);
	}
	public static Vector multiply(Vector a, Vector b){
		return new Vector(a.x * b.x, a.y * b.y);
	}
	public static Vector divide(Vector a, Vector b){
		if(b.x == 0 || b.y == 0){
			throw new IllegalArgumentException("vector divisor component is 0");
		}
		return new Vector(a.x / b.x, a.y / b.y);
	}
	public static Vector lerp(Vector a, Vector b, float t){
		if(t == 0) return a;
		if(t == 1) return b;
		float _x = (1 - t) * a.x + (t * b.x);
		float _y = (1 - t) * a.y + (t * b.y);
		return new Vector(_x, _y);
	}
	public String toString(){
		return new String("(" + x + ", " + y + ")");
	}
}
