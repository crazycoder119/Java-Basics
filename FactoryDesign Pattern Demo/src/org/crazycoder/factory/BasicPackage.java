package org.crazycoder.factory;

public class BasicPackage extends Package{

	@Override
	protected void createPackage() {
		decorationList.add(new BridleDeco());
		
	}

}
