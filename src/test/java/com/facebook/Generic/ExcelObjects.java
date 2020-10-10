package com.facebook.Generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExcelObjects {
	ArrayList<String> SNo = null;
	ArrayList<String> TestCaseName = null;
	ArrayList<String> Execute = null;
	ArrayList<String> TestDataRow = null;
	ArrayList<String> Env = null;
	ArrayList<String> ExecutionCount = null;
	HashMap<String, List<String>> Data = null;
	HashMap<String, String> Objects = null;
	HashMap<String, String> Variables = null;
	LinkedHashMap<String, List<String>> Status = null;
	HashMap<String, List<String>> Database = null;

	public HashMap<String, String> getObjects() {
		return Objects;
	}

	public void setObjects(HashMap<String, String> objects) {
		Objects = objects;
	}

	public HashMap<String, List<String>> getDatabase() {
		return Database;
	}

	public void setDatabase(HashMap<String, List<String>> database) {
		Database = database;
	}

	public HashMap<String, List<String>> getData() {
		return Data;
	}

	public void setData(HashMap<String, List<String>> data) {
		Data = data;
	}

	public LinkedHashMap<String, List<String>> getStatus() {
		return Status;
	}

	public void setStatus(LinkedHashMap<String, List<String>> status) {
		Status = status;
	}

	public HashMap<String, String> getVariables() {
		return Variables;
	}

	public void setVariables(HashMap<String, String> variables) {
		Variables = variables;
	}

	public ArrayList<String> getSNo() {
		return SNo;
	}

	public void setSNo(ArrayList<String> sNo) {
		SNo = sNo;
	}

	public ArrayList<String> getTestCaseName() {
		return TestCaseName;
	}

	public void setTestCaseName(ArrayList<String> testCaseName) {
		TestCaseName = testCaseName;
	}

	public ArrayList<String> getExecute() {
		return Execute;
	}

	public void setExecute(ArrayList<String> execute) {
		Execute = execute;
	}
	
	public ArrayList<String> getTestDataRow() {
		return TestDataRow;
	}

	public void setTestDataRow(ArrayList<String> testDataRow) {
		TestDataRow = testDataRow;
	}

	public ArrayList<String> getEnv() {
		return Env;
	}

	public void setEnv(ArrayList<String> env) {
		Env = env;
	}

	public ArrayList<String> getExecutionCount() {
		return ExecutionCount;
	}

	public void setExecutionCount(ArrayList<String> executionCount) {
		ExecutionCount = executionCount;
	}

}