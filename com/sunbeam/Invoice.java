package com.sunbeam;

public class Invoice {
	private String partNo;
	private String partDescription;
	private int qunt;
	private double partPrice;

	public Invoice(String partNo, String partDescription, int qunt, double partPrice) {
		this.partNo = partNo;
		this.partDescription = partDescription;
		this.qunt = qunt;
		this.partPrice = partPrice;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		partNo = partNo;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQunt() {
		return qunt;
	}

	public void setQunt(int qunt) {
		this.qunt = qunt;
	}

	public double getPartPrice() {
		return partPrice;
	}

	public void setPartPrice(double partPrice) {
		this.partPrice = partPrice;
	}

	public double invoice() {
		if (qunt < 0) {
			this.setQunt(0);
		}
		if (partPrice < 0) {
			this.setPartPrice(0);
		}
		return qunt * partPrice;
	}

	public void calculateInvoiceAmount() {

		System.out.println("Part No |" + " Part Descroption |" + " Quantity |" + " Part Price |" + "Total Price ");
		System.out.println("=====================================================================================");
		System.out.println(
				partNo + "   " + partDescription + "    " + "  " + qunt + "         " + "" + partPrice + "       " + "     " + invoice());
		System.out.println("=====================================================================================");

	}

}
