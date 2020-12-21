package org.crazycoder.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {
	protected List<Decoration> decorationList = new ArrayList<>();
	
	public Package() {
		createPackage();
	}
	/**
	 * This is the key we give way to create packages 
	 */
	protected abstract void +();
	
	@Override
	public String toString() {return "Package(" +"decorations" +decorationList +")";}
	
}
