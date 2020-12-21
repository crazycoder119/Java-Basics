package org.crazycoder.factory;

public class Application {
	public static void main(String args[]) {
		Package basicPackage = PackageFactory.creatPackage(PackageCode.BASIC);
		System.out.println(basicPackage);
		
		Package silverPackage = PackageFactory.creatPackage(PackageCode.SILVER);
		System.out.println(silverPackage);
	}	
}
