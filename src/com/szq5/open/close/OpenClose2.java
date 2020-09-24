package com.szq5.open.close;
/**
 * 开闭原则(设计原则核心)
 * @author suozhenqing
 * @date 2020-08-19
 */
public class OpenClose2 {
	
	public static void main(String[] args) {
		
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawShape(new Rectangle());
		graphicEditor.drawShape(new Circle());
		
		// 新增三角形，不用修改使用方(GraphicEditor1)
		graphicEditor.drawShape(new Triangle());
	}
}

abstract class Shape1 {
	
	abstract void draw();
}
class GraphicEditor1 {
	
	public void drawShape(Shape1 s) {
		s.draw();
	}
}
class Rectangle1 extends Shape1 {
	
	@Override
	void draw() {
		System.out.println("绘制矩形。。。");
	}
}
class Circle1 extends Shape1 {
	
	@Override
	void draw() {
		System.out.println("绘制圆形。。。");
	}
}
class Triangle1 extends Shape1 {

	@Override
	void draw() {
		System.out.println("绘制三角形。。。");
	}
}