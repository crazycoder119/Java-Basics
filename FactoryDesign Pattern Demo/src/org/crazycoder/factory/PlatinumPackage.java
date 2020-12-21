package org.crazycoder.factory;

public class PlatinumPackage extends Package {

	@Override
	protected void createPackage() {
		decorationList.add(new BridleDeco());
		decorationList.add(new BridleMaidDeco());
		decorationList.add(new ParentDeco());
		decorationList.add(new FlowerGirlDeco());
	}
	
}
