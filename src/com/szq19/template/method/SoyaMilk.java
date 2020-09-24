package com.szq19.template.method;

public abstract class SoyaMilk {
	
	// 模版方法做成final，不允许子类覆盖
	final void make() {
		select();
		if (isAdd()) {
			add();
		}
		soak();
		beat();
	}
	void select() {
		System.out.println("第一步，选择新鲜的黄豆。。。");
	}
	abstract void add();
	
	void soak() {
		System.out.println("第三步，黄豆和配料浸泡。。。");
	}
	
	void beat() {
		System.out.println("第四步，放到豆浆机打碎并制成豆浆。。。");
	}
	
	// 钩子方法，是否需要添加配料
	boolean isAdd() {
		return true;
	}
}
