package demo.djz;
import org.bridj.BridJ;


public class DJZMain {
	
	public DJZMain(){
		String dllpath = "D:\\ptrade_client\\DJZDemo";
		BridJ.addLibraryPath(dllpath);
		try {
			org.bridj.NativeLibrary.load(dllpath+"\\WAPIWrapperCpp.dll");
			org.bridj.NativeLibrary.load(dllpath+"\\DJZTrading.dll");
		}catch(Exception e){
			
		}
	}
	
	public static void main(String args[]){
		new DJZMain();
	}
}
