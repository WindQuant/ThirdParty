package demo.djz;


import java.io.IOException;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.Pointer.StringType;
import org.bridj.ann.Ptr;

public class StockTest {

	public StockTest() {
		BridJ.addLibraryPath("E:\\woksapce\\ptrade\\log\\.ptrade\\dlls\\resources");
		// System.setProperty("java.library.path",
		// "E:\\woksapce\\test\\src\\test\\resources\\StockTrading");
		// System.loadLibrary("E:\\woksapce\\test\\src\\test\\resources\\StockTrading");
		// Pointer<StockTest> pointer = Pointer.pointerTo(this);
		try {
			org.bridj.NativeLibrary
					.load("E:\\woksapce\\ptrade\\log\\.ptrade\\dlls\\WAPIWrapperCpp.dll");
			org.bridj.NativeLibrary
					.load("E:\\woksapce\\ptrade\\log\\.ptrade\\dlls\\StockTrading.dll");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StockTradingLibrary.QuoteReceiver receiver = new StockTradingLibrary.QuoteReceiver() {
			public void apply(Pointer<CStructQuote > quote) {
				CStructQuote cquote = quote.getNativeObject(CStructQuote.class);
				if(cquote!=null)
				System.out.println("------------------->>> "+cquote);
			}
		
		};
		CStockTrading stock = new CStockTrading();
		stock.receiver(Pointer.pointerTo(receiver));
		System.out.println(stock.start());
		Pointer<Character> names= Pointer.pointerToWideCString("000002.SZ");
		System.out.println(stock.loadHistory(names));
		//System.out.println(stock.subscribe(names));
		//System.out.println(stock);

		try {
			Thread.sleep(1000 * 60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StockTest();
	}

}
