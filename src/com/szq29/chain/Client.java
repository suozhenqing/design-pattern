package com.szq29.chain;
/**
 * 责任链模式：为请求创建一个接收者对象的链，请求和处理解耦
 *   springmvc：DispatcherServlet(doDispatch) --> HandlerExecutionChain --> HandlerInterceptor
 *   缺点：链很长时，性能可能会受到影响
 * @author suozhenqing
 * @date 2020-09-08
 */
public class Client {
	
	public static void main(String[] args) {
		
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 30000, 1);
		DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
		CollegeApprover collegeApprover = new CollegeApprover("李院长");
		MasterApprover masterApprover = new MasterApprover("副校长");
		SchoolApprover schoolApprover = new SchoolApprover("万校长");
		
		// 设置审批级别
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(masterApprover);
		masterApprover.setApprover(schoolApprover);
		schoolApprover.setApprover(departmentApprover);
		
		departmentApprover.processRequest(purchaseRequest);
	}
}