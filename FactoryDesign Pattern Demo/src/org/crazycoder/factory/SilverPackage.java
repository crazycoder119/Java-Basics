package org.crazycoder.factory;

public class SilverPackage extends Package{

	@Override
	protected void createPackage() {
		decorationList.add(new BridleDeco());
		decorationList.add(new BridleMaidDeco());
	}

}
