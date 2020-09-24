package com.szq29.chain;

public class SchoolApprover extends Approver {

	public SchoolApprover(String name) {
		super(name);
	}

	@Override
	void processRequest(PurchaseRequest purchaseRequest) {
		if (purchaseRequest.getPrice() > 30000) {
			System.out.println("请求编号 id = " + purchaseRequest.getId() + "被" + this.name + "处理。。。");
		}
	}

}