package creational.factorymethod;

public class ComplexNumber {
	private float real;
	private float img;

	public static ComplexNumber valueOf(float real,float img){
		return new ComplexNumber(real,img);
	}
	
	private ComplexNumber(float real,float img){
		this.real=real;
		this.img=img;
	}
}
