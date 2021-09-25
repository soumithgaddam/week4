package walletfactory.iteratordesign;

public class TestWalletFactory {

	public static void main(String[] args) {
		WalletCollectionImplementation wallet=new WalletCollectionImplementation();
		Iterator it = wallet.getIterator();
		while(it.hasNext())
			System.out.println(it.next());

	}

}
