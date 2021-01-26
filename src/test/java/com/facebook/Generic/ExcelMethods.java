package com.facebook.Generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExcelMethods {
	int rowcount = 0;
	ArrayList<String> SNo = new ArrayList<String>();
	ArrayList<String> TestCaseName = new ArrayList<String>();
	ArrayList<String> Execute = new ArrayList<String>();
	ArrayList<String> TestDataRow = new ArrayList<String>();
	ArrayList<String> Env = new ArrayList<String>();
	ArrayList<String> ExecutionCount = new ArrayList<String>();
	HashMap<String, String> objects = new HashMap<String, String>();
	HashMap<String, List<String>> testdata = new HashMap<String, List<String>>();
	HashMap<String, String> variables = new HashMap<String, String>();
	LinkedHashMap<String, List<String>> Status = new LinkedHashMap<String, List<String>>();

	public ExcelObjects readExcelData(ExcelObjects data, ExcelReader excelReader) {
		for (int rowCnt = 1; rowCnt < excelReader.RowCount(); rowCnt++) {
			SNo.add(excelReader.ReadCell(excelReader.GetCell("S No"), rowCnt));
			TestCaseName.add(excelReader.ReadCell(excelReader.GetCell("TestCaseName"), rowCnt));
			TestDataRow.add(excelReader.ReadCell(excelReader.GetCell("TestDataRow"), rowCnt));
			Env.add(excelReader.ReadCell(excelReader.GetCell("Env"), rowCnt));
			Execute.add(excelReader.ReadCell(excelReader.GetCell("Execute"), rowCnt));
			ExecutionCount.add(excelReader.ReadCell(excelReader.GetCell("ExecutionCount"), rowCnt));
		}
		data.setSNo(SNo);
		data.setTestCaseName(TestCaseName);
		data.setExecute(Execute);
		data.setTestDataRow(TestDataRow);
		data.setEnv(Env);
		data.setExecutionCount(ExecutionCount);
		return data;
	}

	public void readObjects(ExcelObjects objectData, ExcelReader excelReader) {
		for (int rowCnt = 1; rowCnt < excelReader.RowCount(); rowCnt++) {
			objects.put(excelReader.ReadCell(excelReader.GetCell("Object"), rowCnt),
					excelReader.ReadCell(excelReader.GetCell("Xpath"), rowCnt));
		}
		objectData.setObjects(objects);
	}

	public void readTestData(ExcelObjects testData, ExcelReader excelReader) {
		for (int columncount = 0; columncount < excelReader.ColumnCount(); columncount++) {
			List<String> sub = new ArrayList<String>();
			for (rowcount = 1; rowcount < excelReader.RowCount() - 1; rowcount++) {
				sub.add(excelReader.ReadCell(columncount, rowcount + 1));
			}
			testdata.put(excelReader.ReadCell(columncount, 1), sub);
			}
		testData.setData(testdata);
	}

	public void readTestDetailsHeader(ExcelObjects testData, ExcelReader excelReader) {
		for (int columncount = 0; columncount < excelReader.ColumnCount(); columncount++) {
			List<String> sub = new ArrayList<String>();
				sub.add(excelReader.ReadCell(columncount, 0));			
			testdata.put(excelReader.ReadCell(columncount, 0), sub);
		}
		testData.setData(testdata);
	}
	
	public void variableStore(ExcelObjects parentData, String varname, String temp) {
		variables.put(varname, temp);
		parentData.setVariables(variables);
	}
}
