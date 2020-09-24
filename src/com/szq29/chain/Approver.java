package com.szq29.chain;

public abstract class Approver {
	
	// 下一个处理者
	Approver approver;
	String name;
	public Approver(String name) {
		this.name = name;
	}
	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	
	abstract void processRequest(PurchaseRequest purchaseRequest);
}
