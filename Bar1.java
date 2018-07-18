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
		//1\׼�����ݼ���
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(100, "����", "����");
		dataset.setValue(50, "����", "��֦");
		dataset.setValue(150, "����", "����");
		dataset.setValue(80, "����", "�㽶");
		dataset.setValue(60, "����", "â��");
		dataset.setValue(80, "����", "â��");
		
		//2\����һ��Jfreechartʵ������1\���� 2��x���ǩ 3\y���ǩ 4�����ݼ��� 5\���䷽��ˮƽ����ֱ��6\ͼ���Ŀ��� 7\�Ƿ���ñ�׼��������8\�Ƿ������ҳ����
		JFreeChart chart = ChartFactory.createBarChart("ˮ������ͼ", "ˮ������", "����", dataset, PlotOrientation.VERTICAL, false, true, false);
		
		//3\��������
		
		//4\ֱ������ͼƬ
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\bar2.jpg"), chart, 700, 500);
		System.out.println("ͼ������ok");

	}

}
