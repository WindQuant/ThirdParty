package demo.djz;


import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("DJZTrading") 
public class CStructBalance extends StructObject {
	static {
		BridJ.register();
	}
	@Field(0) 
	public double available() {
		return this.io.getDoubleField(this, 0);
	}
	@Field(0) 
	public CStructBalance available(double available) {
		this.io.setDoubleField(this, 0, available);
		return this;
	}
	@Field(1) 
	public double balance() {
		return this.io.getDoubleField(this, 1);
	}
	@Field(1) 
	public CStructBalance balance(double balance) {
		this.io.setDoubleField(this, 1, balance);
		return this;
	}
	@Field(2) 
	public double closeProfit() {
		return this.io.getDoubleField(this, 2);
	}
	@Field(2) 
	public CStructBalance closeProfit(double closeProfit) {
		this.io.setDoubleField(this, 2, closeProfit);
		return this;
	}
	@Field(3) 
	public double positionProfit() {
		return this.io.getDoubleField(this, 3);
	}
	@Field(3) 
	public CStructBalance positionProfit(double positionProfit) {
		this.io.setDoubleField(this, 3, positionProfit);
		return this;
	}
	@Field(4) 
	public double preBalance() {
		return this.io.getDoubleField(this, 4);
	}
	@Field(4) 
	public CStructBalance preBalance(double preBalance) {
		this.io.setDoubleField(this, 4, preBalance);
		return this;
	}
	@Field(5) 
	public double margin() {
		return this.io.getDoubleField(this, 5);
	}
	@Field(5) 
	public CStructBalance margin(double margin) {
		this.io.setDoubleField(this, 5, margin);
		return this;
	}
	@Field(6) 
	public double frozenMargin() {
		return this.io.getDoubleField(this, 6);
	}
	@Field(6) 
	public CStructBalance frozenMargin(double frozenMargin) {
		this.io.setDoubleField(this, 6, frozenMargin);
		return this;
	}
	@Field(7) 
	public double commission() {
		return this.io.getDoubleField(this, 7);
	}
	@Field(7) 
	public CStructBalance commission(double commission) {
		this.io.setDoubleField(this, 7, commission);
		return this;
	}
	public CStructBalance() {
		super();
	}
	public CStructBalance(Pointer pointer) {
		super(pointer);
	}
}
