package org.crazycoder.chain;

public class Application {

	public static void main(String[] args) {
		VAT vat = new VAT();
		NBT nbt = new NBT();
		BTT btt = new BTT();
		SSF ssf = new SSF();
		Tax tax = new Tax();
		
		// In here we can change the chain if we want so we dont want to change the code
		tax.setSuccessor(vat);
		vat.setSuccessor(nbt);
		nbt.setSuccessor(btt);
		btt.setSuccessor(ssf);
		
		Invoice invoice1 = new Invoice(1, 50);
		System.out.println("Invoice1 amount 50 tax :" +tax.applyTax(invoice1));
		Invoice invoice2 = new Invoice(2, 150);
		System.out.println("Invoice2 amount 150 tax :" +tax.applyTax(invoice2));
		Invoice invoice3 = new Invoice(3, 250);
		System.out.println("Invoice3 amount 250 tax :" +tax.applyTax(invoice3));
		Invoice invoice4 = new Invoice(4, 350);
		System.out.println("Invoice4 amount 350 tax :" +tax.applyTax(invoice4));
		Invoice invoice5 = new Invoice(5, 450);
		System.out.println("Invoice5 amount 450 tax :" +tax.applyTax(invoice5));
		Invoice invoice6 = new Invoice(6, 550);
		System.out.println("Invoice6 amount 550 tax :" +tax.applyTax(invoice6)); 
		
		
	}

}
