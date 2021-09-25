package walletfactory.iteratordesign;

public class WalletCollectionImplementation implements WalltetCollection {

 private String walletDetails[]= {
		 "Different Type of Wallets are Bifold Wallet,Trifold Wallet,Wrist Wallet etc...",
		 "Mens Wallets : Bifold , Hybrid Slim, Money clip Wallets etc..",
		 "Women Wallets: Trifold, Slim Wallet, Card Case Wallet etc..",
		 "Wallets are made with Leather, Fabric and Tyvek etc."
		 };
	@Override
	public Iterator getIterator() {
		return new WalletIteratorImpl();
	}
 private class WalletIteratorImpl implements Iterator
 {
	 int index=0;
	@Override
	public boolean hasNext() {
		if(index<walletDetails.length)
			 return true;
		else
			return false;
	}

	@Override
	public Object next() {
		if(hasNext())
			return walletDetails[index++];
		else
			return null;
	}
	 
 }

}
