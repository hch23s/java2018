package com.offcn.bar;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Bar1 {

	public static void main(String[] args) throws IOException {
		//1\准备数据集合
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(100, "北京", "桃子");
		dataset.setValue(50, "北京", "荔枝");
		dataset.setValue(150, "北京", "西瓜");
		dataset.setValue(80, "北京", "香蕉");
		dataset.setValue(60, "北京", "芒果");
		dataset.setValue(80, "北京", "芒果");
		
		//2\创建一个Jfreechart实例对象1\标题 2、x轴标签 3\y轴标签 4、数据集合 5\对其方向（水平、垂直）6\图例的开关 7\是否采用标准化生成器8\是否包含网页链接
		JFreeChart chart = ChartFactory.createBarChart("水果销量图", "水果类型", "销量", dataset, PlotOrientation.VERTICAL, false, true, false);
		
		//3\设置属性
		
		//4\直接生成图片
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\bar2.jpg"), chart, 700, 500);
		System.out.println("图表生成ok");

	}

}
