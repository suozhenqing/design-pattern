package com.szq29.chain;

public class DepartmentApprover extends Approver {

	public DepartmentApprover(String name) {
		super(name);
	}

	@Override
	void processRequest(PurchaseRequest purchaseRequest) {
		if (purchaseRequest.getPrice() <= 5000) {
			System.out.println("请求编号 id = " + purchaseRequest.getId() + "被" + this.name + "处理。。。");
		} else {
			approver.processRequest(purchaseRequest);
		}
	}

}
