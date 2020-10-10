package com.facebook.Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.facebook.utilities.ConfigReader;

public class TestCaseDetails {
	HashMap<String, String> variables = new HashMap<String, String>();
	ArrayList<String> assetcheck = new ArrayList<String>();
	ConfigReader config = new ConfigReader();

	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	public void storeInformation(String name, String value) {
		variables.put(name, value);
	}

	public String getInformation(String name) {
		return variables.get(name);
	}

	public HashMap<String, String> displayInfo() {
		return variables;
	}

	public void addLineItem(String lineItem) {
		assetcheck.add(lineItem);
	}

	public ArrayList<String> getAssetInfo() {
		return assetcheck;
	}

	public void writeTestCaseDetails(String testCaseName, String testCaseDescription, String status, String envname,
			String executionTime) throws Exception {
		String excelFilePath = config.TestCaseDetails();
		Date sysdate = new Date();
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
		System.out.println("pass");
		System.out.println(variables.size());
		if (variables.size() != 0) {
			System.out.println(variables);
			try {
				if (!envname.equals("ST03_OM") && !envname.equals("INT05_OM")) {
					HSSFSheet sheet = workbook.getSheetAt(0);
					HSSFRow rowHeader = sheet.getRow(0);
					int rowCount = sheet.getLastRowNum();
					HSSFRow rowNew = sheet.createRow(rowCount + 1);
					HSSFCell envName = rowNew.createCell(0);
					envName.setCellValue(envname);
					HSSFCell testCaseStatus = rowNew.createCell(1);
					testCaseStatus.setCellValue(status);
					HSSFCell date = rowNew.createCell(2);
					date.setCellValue(sdf.format(sysdate));
					HSSFCell time = rowNew.createCell(3);
					time.setCellValue(executionTime);
					HSSFCell testCase = rowNew.createCell(4);
					testCase.setCellValue(testCaseName);
					HSSFCell testDescription = rowNew.createCell(5);
					testDescription.setCellValue(testCaseDescription);

					for (String varName : variables.keySet()) {
						for (int i = 5; i < 31; i++) {
							HSSFCell cellvalue = rowHeader.getCell(i);
							String headerName = cellvalue.getStringCellValue();
							if (headerName.equalsIgnoreCase(varName)) {
								HSSFCell cell = rowNew.createCell(cellvalue.getColumnIndex());
								cell.setCellValue(variables.get(varName));
							}
						}
					}
					if (variables.containsKey("Order Processed in OM")) {
						HSSFSheet ordersSheet = workbook.getSheet("Order Management");
						int ordersRowCount = ordersSheet.getLastRowNum();
						HSSFRow newOrderRecord = ordersSheet.createRow(ordersRowCount + 1);
						HSSFCell functionality = newOrderRecord.createCell(0);
						functionality.setCellValue(testCaseDescription);
						HSSFCell orderNumber = newOrderRecord.createCell(1);
						orderNumber.setCellValue(variables.get("OrderNumber"));
						HSSFCell omProcessed = newOrderRecord.createCell(2);
						omProcessed.setCellValue(variables.get("Order Processed in OM"));
					}
				} else {
					HSSFSheet ordersSheet = workbook.getSheet("Order Management");
					for (String varName : variables.keySet()) {
						HSSFRow row = ordersSheet.getRow(Integer.parseInt(varName)+1);
						HSSFCell cellvalue = row.getCell(2);
						cellvalue.setCellValue(variables.get(varName));
					}
				}
				inputStream.close();
				FileOutputStream outputStream = new FileOutputStream(excelFilePath);
				workbook.write(outputStream);
				outputStream.flush();
				workbook.close();
				outputStream.close();
				workbook.close();

			} catch (FileNotFoundException f) {
				System.out.println("Execution details not stored as sheet is in use by some other process");
			} catch (IOException t) {
				t.printStackTrace();
			}
		} else
			System.out.println("No details captured for testcase : " + testCaseName);

	}

	public void storeAssetInfo(String lineItem) {
		switch (lineItem) {
		case "$120.85 Business Mobile 24 Month Plan":
			addLineItem("$120.85 Business Mobile 24 Month Plan");
			addLineItem("Mobile Subscription");
			addLineItem("Mobile Service Specification");
			addLineItem("Trio SIM");
			addLineItem("SIM Subsidy");
			addLineItem("Spark Wifi");
			addLineItem("Spotify Premium");
			addLineItem("Voicemail");
			break;

		case "$45.85 Business Mobile 24 Month Plan":
			addLineItem("$45.85 Business Mobile 24 Month Plan");
			addLineItem("Mobile Subscription");
			addLineItem("Mobile Service Specification");
			addLineItem("Trio SIM");
			addLineItem("SIM Subsidy");
			addLineItem("Spark Wifi");
			addLineItem("Voicemail");
			break;

		case "Mobile $39.99 Plan":
			addLineItem("Mobile $39.99 Plan");
			addLineItem("Mobile Subscription");
			addLineItem("6 Month Deal");
			addLineItem("Bonus Socialiser");
			addLineItem("Mobile Service Specification");
			addLineItem("Trio SIM");
			addLineItem("SIM Subsidy");
			addLineItem("Spark Wifi");
			addLineItem("Spotify Premium");
			addLineItem("Voicemail");
			break;

		case "Smart Prepaid":
			addLineItem("Smart Prepaid");
			addLineItem("Mobile Subscription");
			addLineItem("Mobile Service Specification");
			addLineItem("Trio SIM");
			addLineItem("Voicemail");
			break;

		case "Fibre Gigatown Broadband and Landline - 80GB 12 Month":
			addLineItem("Fibre Gigatown Broadband and Landline - 80GB 12 Month");
			addLineItem("Broadband Subscription");
			addLineItem("Additional Data $5.00/5GB GST");
			addLineItem("Broadband Service Configuration");
			addLineItem("Broadband Over Fibre Access");
			addLineItem("Voice Subscription");
			addLineItem("Voice Over Fibre Access");
			addLineItem("Voice Service Configuration");
			addLineItem("Fibre Install Products Consumer");
			break;

		case "Fibre100 Broadband and Landline - Unlimited GB 12 Month":
			addLineItem("Fibre100 Broadband and Landline - Unlimited GB 12 Month");
			addLineItem("Broadband Subscription");
			addLineItem("Broadband Service Configuration");
			addLineItem("Broadband Over Fibre Access");
			addLineItem("Voice Subscription");
			addLineItem("Voice Over Fibre Access");
			addLineItem("Voice Service Configuration");
			addLineItem("Fibre Install Products Consumer");
			break;

		case "Fibre200 Broadband and Landline - Unlimited GB 12 Month":
			addLineItem("Fibre200 Broadband and Landline - Unlimited GB 12 Month"); // added
																					// by
																					// shivam
			addLineItem("Broadband Subscription");
			addLineItem("Broadband Service Configuration");
			addLineItem("Broadband Over Fibre Access");
			addLineItem("Voice Subscription");
			addLineItem("Voice Over Fibre Access");
			addLineItem("Voice Service Configuration");
			addLineItem("Fibre Install Products Consumer");
			break;

		case "Fibre200 Naked Broadband - Unlimited GB 12 Month":
			addLineItem("Fibre200 Naked Broadband - Unlimited GB 12 Month");
			addLineItem("Broadband Subscription");
			addLineItem("Broadband Service Configuration");
			addLineItem("Broadband Over Fibre Access");
			addLineItem("Fibre Install Products Consumer");
			break;

		case "Fibre Landline 12 Month":
			addLineItem("Fibre Landline 12 Month");
			addLineItem("Voice Subscription");
			addLineItem("Voice Over Wireless Broadband Access");
			addLineItem("Voice Service Configuration");
			addLineItem("Fibre Install Products Consumer");
			break;

		case "Rural Wireless Broadband - 120GB (12 Months)":
			addLineItem("Rural Wireless Broadband - 120GB (12 Months)");
			addLineItem("Broadband Subscription");
			addLineItem("Wireless Broadband SIM");
			addLineItem("Wireless Broadband Service Specification");
			break;

		case "Rural Wireless Broadband and Landline - 120GB (Open Term)":
			addLineItem("Rural Wireless Broadband and Landline - 120GB (Open Term)");
			addLineItem("Broadband Subscription");
			addLineItem("Wireless Broadband SIM");
			addLineItem("Wireless Broadband Service Specification");
			addLineItem("Voice Subscription");
			addLineItem("Fixed Wireless Voice Everyday National");
			addLineItem("Voice Over Wireless Broadband Access");
			addLineItem("Voice Service Configuration");
			break;

		case "Home Wireless Broadband and Landline - 120GB (Open Term)":
			addLineItem("Home Wireless Broadband and Landline - 120GB (Open Term)");
			addLineItem("Broadband Subscription");
			addLineItem("Wireless Broadband SIM");
			addLineItem("Wireless Broadband Service Specification");
			addLineItem("Voice Subscription");
			;
			addLineItem("Voice Over Wireless Broadband Access");
			addLineItem("Voice Service Configuration");
			break;

		case "iPhone 6s Plus 16GB Space Grey":
			addLineItem("iPhone 6s Plus 16GB Space Grey");
			break;

		case "iPhone 6s Plus 64GB Space Grey":
			addLineItem("iPhone 6s Plus 64GB Space Grey");
			break;

		case "Student Deal":
			addLineItem("Student Deal");
			break;

		case "Generic Discount":
			addLineItem("Generic One Off Discount");
			break;

		case "Fibre Broadband":
			addLineItem("Fibre Broadband Activation");
			break;

		case "Data Extra":
			addLineItem("$9 Socialiser");
			break;

		case "International Pack":
			addLineItem("International Pack");
			break;

		case "Static IP":
			addLineItem("Broadband Static IP");
			break;

		case "Tech Wizard":
			addLineItem("Tech Wizard Monthly Subscription");
			break;

		case "My favorite":
			addLineItem("My Favourites");
			break;

		case "Bar Settings":
			addLineItem("Bar Settings");
			break;

		case "Bolte Extra": // Need to add correct
			addLineItem("My Favourites");
			break;

		case "Value Pack":
			addLineItem("Value Packs");
			break;

		case "International value pack":
			addLineItem("International Packs");
			break;

		case "Pool of Funds":
			addLineItem("Pool of Funds");
			break;

		case "Insurance":
			addLineItem("Mobile Insurance Premium");
			break;

		case "Fibre and Line Activation":
			addLineItem("Fibre Landline Activation");
			break;

		case "Fibre Broadband Landline":
			addLineItem("Fibre Broadband and Landline Installation");
			break;

		case "Talk It Up":
			addLineItem("Talk It Up");
			break;

		case "WAN Service Premium Promotion":
			addLineItem("WAN Service Premium Promotion");
			addLineItem("Managed Service");
			addLineItem("WAN Service Offer");
			break;

		case "BS2 Fibre Access Offer":
			addLineItem("BS2 Fibre Access Offer");
			addLineItem("BS2 Fibre Access");
			break;

		case "CLNE Offer":
			addLineItem("CLNE Offer");
			addLineItem("CLNE");
			break;

		default:
			break;

		}
		System.out.println(assetcheck);
	}

}
