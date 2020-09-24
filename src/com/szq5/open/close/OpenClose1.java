package com.szq5.open.close;
/**
 * 开闭原则(设计原则核心)：对扩展开发(提供方)，对修改关闭(使用方)；用抽象构建框架，用实现扩展细节
 * @author suozhenqing
 * @date 2020-08-19
 */
public class OpenClose1 {
	
	public static void main(String[] args) {
		
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawShape(new Rectangle());
		graphicEditor.drawShape(new Circle());
		
		// 新增三角形，修改较多
		graphicEditor.drawShape(new Triangle());
	}
}

class Shape {
	int m_type;
}
class GraphicEditor {
	
	public void drawShape(Shape s) {
		if (s.m_type == 1) {
			drawRectangle(s);
		} else if (s.m_type == 2){
			drawCircle(s);
		} else if (s.m_type == 3){
			drawTriangle(s);
		}
	}
	public void drawRectangle(Shape r) {
		System.out.println("绘制矩形。。。");
	}
	public void drawCircle(Shape r) {
		System.out.println("绘制圆形。。。");
	}
	
	public void drawTriangle(Shape r) {
		System.out.println("绘制三角形。。。");
	}
}
class Rectangle extends Shape {
	Rectangle() {
		super.m_type = 1;
	}
}
class Circle extends Shape {
	Circle() {
		super.m_type = 2;
	}
}
class Triangle extends Shape {
	Triangle() {
		super.m_type = 3;
	}
}