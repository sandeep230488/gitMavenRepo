package com.facebook.Generic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.util.SystemOutLogger;
import org.testng.Assert;

public class CsvFileGeneration {

	public String readFile(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			return sb.toString();
		} finally {
			br.close();
		}
	}

	public String writeWholesaleCsv(String RequestType, String RequestSubType, String DueDate, String externalBatchId,
			String Cust_MVNOName, String accountNumber, String MobileNumber, String ChangedMobileNumber,
			String simNumber, String ProductOfferID, String ParentProductOfferID, String PrimaryOffer,
			String Add_Remove, String ContractTerm, String EntitlementRef, String GSPID, String LSPID,
			String LSPAccountNumber, String LSPSIMNumber, String SOMID, String APNProfile, String ContactFirstName,
			String ContactLastName, String ContactMobilePhone, String ContactEmailAddress, String Comments,
			String LineDescription, String filePath) {

		// CSV file header
		final String FILE_HEADER = "RequestType,RequestSubType,DueDate,ExternalBatchId,Cust_MVNOName,AccountNumber"
				+ ",MobileNumber,ChangedMobileNumber,SIMNumber,ProductOfferID,ParentProductOfferID,PrimaryOffer,"
				+ "Add_Remove,ContractTerm,EntitlementRef,GSPID,LSPID,LSPAccountNumber,LSPSIMNumber,SOMID,APNProfile,"
				+ "ContactFirstName,ContactLastName,ContactMobilePhone,ContactEmailAddress,Comments,LineDescription";

		FileWriter fileWriter = null;
		String fileName = RequestType.replace(" ", "") + ".csv";

		try {
			fileWriter = new FileWriter(filePath + fileName);
			System.out.println(filePath + fileName);
			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add customer Info after the header
			String customerInfo = RequestType + "," + RequestSubType + "," + DueDate + "," + externalBatchId + ","
					+ Cust_MVNOName + "," + accountNumber + "," + MobileNumber + "," + ChangedMobileNumber + ","
					+ simNumber + "," + ProductOfferID + "," + ParentProductOfferID + "," + PrimaryOffer + ","
					+ Add_Remove + "," + ContractTerm + "," + EntitlementRef + "," + GSPID + "," + LSPID + ","
					+ LSPAccountNumber + "," + LSPSIMNumber + "," + SOMID + "," + APNProfile + "," + ContactFirstName
					+ "," + ContactLastName + "," + ContactMobilePhone + "," + ContactEmailAddress + "," + Comments
					+ "," + LineDescription;
			fileWriter.append(System.lineSeparator());
			fileWriter.append(customerInfo.toString());
			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
			}

		}
		return fileName;
	}

	public String writeBPPCsv(String email, String dueDate, int totalOrder, List<String> simNumber, String filepath) {

		// CSV file header
		final String FILE_HEADER = "BulkNotifyEmail,DueDate,ExternalOrderNumber,LineNumber,SIMNumber,PromotionOfferId,ProductOfferId,AdditionalProductOfferId,DiscountOfferId,TermUnit,TermPeriod";
		String fileName = "BulkPrepayProvisioning.csv";
		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(filepath + fileName);

			// Write the CSV file header'
			fileWriter.append(FILE_HEADER.toString());

			// Add customer Info after the header
			for (int i = 0; i < totalOrder; i++) {
				String customerInfo = email + "," + dueDate + "," + RandomStringUtils.randomNumeric(5) + ",,"
						+ simNumber.get(i) + ",smartprepaidBPO,,,,,";
				fileWriter.append(System.lineSeparator());
				fileWriter.append(customerInfo.toString());
			}
			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
			}

		}
		return fileName;
	}

	/*Author : Sulagna*/
	public String writeSparkDigitalCsv(String RequestType, String RequestSubType, String DueDate,
			String externalBatchId, String accountNumber, String MobileNumber, String simNumber, String SembelSim,
			String PrimaryOffer, String FirstName, String Lastname, String Email, String Comments,
			String LineDescription, String EntitlementRef, String filepath) {

		// CSV file header
		final String FILE_HEADER = "RequestType,RequestSubType,DueDate,ExternalBatchId,AccountNumber,MobileNumber,SIMNumber,SembleSIM,ContactFirstName,ContactLastName,ContactMobilePhone,ContactEmailAddress,Comments,LineDescription,EntitlementRef";

		FileWriter fileWriter = null;

		String fileName = RequestType.replace(" ", "") + ".csv";

		try {
			fileWriter = new FileWriter(filepath + fileName);

			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add customer Info after the header

			String customerInfo = RequestType + "," + RequestSubType + "," + DueDate + "," + externalBatchId + ","
					+ accountNumber + "," + MobileNumber + "," + simNumber + "," + SembelSim + "," + FirstName + ","
					+ Lastname + "," + PrimaryOffer + "," + Email + "," + Comments + "," + LineDescription + ","
					+ EntitlementRef;
			fileWriter.append(System.lineSeparator());
			fileWriter.append(customerInfo.toString());

			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
			}

		}
		return fileName;
	}

	public String writeHVCCsv(String RequestType, int totalOrder, String CustomerNo, String SegmentName,
			String SegmentValue, String SegmentDecile, String filepath, String DataType) {
		String Cust = CustomerNo;

		// CSV file header
		final String FILE_HEADER = "CustomerNo,SegmentName,SegmentValue,SegmentDecile";
		FileWriter fileWriter = null;
		String fileName = RequestType.replace(" ", "") + ".csv";

		try {
			System.out.println("1");
			fileWriter = new FileWriter(filepath + fileName);
			System.out.println("2");
			System.out.println(filepath + fileName);
			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());
			System.out.println("3");
			// Add customer Info after the header
			for (int i = 0; i < totalOrder; i++) {
				System.out.println("4");
				if ((i == 0 || i == 2) && DataType.equalsIgnoreCase("Incorrect")) {
					Cust = CustomerNo + i;
					System.out.println("if wrong=" + Cust);
				}
				String customerInfo = Cust + "," + SegmentName + "," + SegmentValue + "," + SegmentDecile;
				fileWriter.append(System.lineSeparator());
				fileWriter.append(customerInfo.toString());
				Cust = CustomerNo;
				System.out.println("Corrected=" + Cust);
				System.out.println(customerInfo);
			}
			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
			}

		}
		return fileName;
	}
	
	public String writeAPNCCsv(String Action,String attr_name,String attr_val,String lic,
			String version_start_date,String version_end_date,String filePath,String valueToDelete,
			String displayNameToDelete, String valueToAdd) {

		// CSV file header
		final String FILE_HEADER = "Action,attr name,attr val,lic,version start date,version end date";
		FileWriter fileWriter = null;
		String fileName = "apn" + ".csv";
		String customerInfo;
		String[] date=version_start_date.split("/");
		try {
			System.out.println("1");
			fileWriter = new FileWriter(filePath + fileName);
			System.out.println("2");
			System.out.println(filePath + fileName);
			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());
			System.out.println("3");
			for(String Actions :Action.split(","))
			{
				if(Actions.equalsIgnoreCase("D"))
				{
				customerInfo = Actions + "," + attr_name + "," + valueToDelete + "," + displayNameToDelete + "," + date[1]+"/"+date[0]+"/"+date[2]+" 00:00:00" + ",";
				fileWriter.append(System.lineSeparator());
				fileWriter.append(customerInfo.toString());
				System.out.println(customerInfo);
				}
				else
				{
					customerInfo = Actions + "," + attr_name + "," + valueToAdd + "," + lic+ "," + date[1]+"/"+date[0]+"/"+date[2]+" 00:00:00" + ",";
					fileWriter.append(System.lineSeparator());
					fileWriter.append(customerInfo.toString());
					System.out.println(customerInfo);
				}
			}
			System.out.println("CSV file was created successfully !!!");
		} 
	catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
			}

		}
		return fileName;
	}
	
	public String writeWrongAPNCCsv(String Action,String attr_name,String attr_val,String lic,
			String version_start_date,String version_end_date,String filePath,String valueToDelete,
			String displayNameToDelete, String valueToAdd) {

		// CSV file header
		final String FILE_HEADER = "Action,attr name,attr val,lic,version start date,version end date";
		FileWriter fileWriter = null;
		String fileName = "apn" + ".csv";
		String customerInfo;
		String[] date=version_start_date.split("/");
		try {
			System.out.println("1");
			fileWriter = new FileWriter(filePath + fileName);
			System.out.println("2");
			System.out.println(filePath + fileName);
			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());
			System.out.println("3");
			for(String Actions :Action.split(","))
			{
				if(Actions.equalsIgnoreCase("D"))
				{
				customerInfo = Actions + "," + attr_name + "," + valueToDelete + "," + lic + "," + date[1]+"/"+date[0]+"/"+date[2]+" 00:00:00" + ",";
				fileWriter.append(System.lineSeparator());
				fileWriter.append(customerInfo.toString());
				System.out.println(customerInfo);
				}
				else
				{
					customerInfo = Actions + "," + attr_name + "," + valueToAdd + "," + lic+ "," + date[1]+"/"+date[0]+"/"+date[2]+" 00:00:00" + ",";
					fileWriter.append(System.lineSeparator());
					fileWriter.append(customerInfo.toString());
					System.out.println(customerInfo);
				}
			}
			System.out.println("CSV file was created successfully !!!");
		} 
	catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
			}

		}
		return fileName;
	}


	public void writeDigitalChangeOfferCsv(String SOType, String promotion, Boolean deviceflag, String device,
			String pofValue, String deffTerm, String insurance, String externalBatchId, String accountNumber,
			String serviceId, String Pofentitlement, String pricingentitlementId, String lineDesc, String ETFFlag,
			String subsidyAmt, String filepath) {

		String customerInfo;
		// CSV file header
		final String FILE_HEADER = "RequestType,RequestSubType,DueDate,ExternalBatchId,AccountNumber,MobileNumber,SIMNumber,ProductOfferId,EntitlementRef,Comments,LineDescription,IMEI,POFAmount,DeferredPayTerm,MobileInsurance,CorrelationId,ContactFirstName,ContactLastName,ContactMobilePhone,ContactEmailAddress,ETFFlag,SubsidyAmount";
		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(filepath);

			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add customer Info after the header

			switch (SOType) {
			case "Change Offer":
				if (lineDesc.equalsIgnoreCase("null"))
					lineDesc = "";
				customerInfo = "Change Offer,Change Offer,07/08/2017 23:06:00," + externalBatchId + "," + accountNumber
						+ "," + serviceId + "," + serviceId + "," + promotion + "," + pricingentitlementId + ",test,"
						+ lineDesc + ",,,,,1,ashwini,kamath,25847,sgf@ygf.com,,";
				fileWriter.append(System.lineSeparator());
				fileWriter.append(customerInfo.toString());
				customerInfo = null;
				if (deviceflag) {
					if (ETFFlag.equalsIgnoreCase("null"))
						ETFFlag = "";
					if (subsidyAmt.equalsIgnoreCase("null"))
						subsidyAmt = "";
					if (lineDesc.equalsIgnoreCase("null"))
						lineDesc = "";
					if (pofValue.equalsIgnoreCase("null"))
						pofValue = "";
					if (Pofentitlement.equalsIgnoreCase("null"))
						Pofentitlement = "";
					if (pricingentitlementId.equalsIgnoreCase("null"))
						pricingentitlementId = "";
					customerInfo = "Change Offer,Change Offer,07/08/2017 23:06:00," + externalBatchId + ","
							+ accountNumber + ",,," + device + "," + Pofentitlement + ",test," + lineDesc + ","
							+ serviceId + "," + pofValue + "," + deffTerm + "," + insurance + ","
							+ "1,ashwini,kamath,25847,sgf@ygf.com," + ETFFlag + "," + subsidyAmt;
					fileWriter.append(System.lineSeparator());
					fileWriter.append(customerInfo.toString());
				}
				break;
			case "Mobile Resign":
				if (lineDesc.equalsIgnoreCase("null"))
					lineDesc = "";
				customerInfo = "Change Offer,Mobile Resign,07/08/2017 23:06:00," + externalBatchId + "," + accountNumber
						+ "," + serviceId + "," + serviceId + "," + promotion + "," + pricingentitlementId + ",test,"
						+ lineDesc + ",,,,,1,ashwini,kamath,25847,sgf@ygf.com,,";
				fileWriter.append(System.lineSeparator());
				fileWriter.append(customerInfo.toString());
				customerInfo = null;
				if (deviceflag) {
					if (ETFFlag.equalsIgnoreCase("null"))
						ETFFlag = "";
					if (subsidyAmt.equalsIgnoreCase("null"))
						subsidyAmt = "";
					if (lineDesc.equalsIgnoreCase("null"))
						lineDesc = "";
					if (pofValue.equalsIgnoreCase("null"))
						pofValue = "";
					if (Pofentitlement.equalsIgnoreCase("null"))
						Pofentitlement = "";
					if (pricingentitlementId.equalsIgnoreCase("null"))
						pricingentitlementId = "";
					customerInfo = "Change Offer,Mobile Resign,07/08/2017 23:06:00," + externalBatchId + ","
							+ accountNumber + ",,," + device + "," + Pofentitlement + ",test," + lineDesc + ","
							+ serviceId + "," + pofValue + "," + deffTerm + "," + insurance + ","
							+ "1,ashwini,kamath,25847,sgf@ygf.com," + ETFFlag + "," + subsidyAmt;
					fileWriter.append(System.lineSeparator());
					fileWriter.append(customerInfo.toString());
				}

			default:
				break;
			}

			System.out.println("CSV file was created successfully !!!");

		} catch (

		Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			Assert.fail("Error in CsvFileWriter !!!");
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
			}

		}
	}

	public void writeDigitalChangeOfferCsvNOPOF(String SOType, String promotion, Boolean deviceflag, String device,
			String pofValue, String deffTerm, String insurance, String externalBatchId, String accountNumber,
			String serviceId, String lineDesc, String ETFFlag, String subsidyAmt, String filepath) {

		String customerInfo;
		// CSV file header
		final String FILE_HEADER = "RequestType,RequestSubType,DueDate,ExternalBatchId,AccountNumber,MobileNumber,SIMNumber,ProductOfferId,EntitlementRef,Comments,LineDescription,IMEI,POFAmount,DeferredPayTerm,MobileInsurance,CorrelationId,ContactFirstName,ContactLastName,ContactMobilePhone,ContactEmailAddress,ETFFlag,SubsidyAmount";
		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(filepath);

			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add customer Info after the header

			switch (SOType) {
			case "Change Offer":
				if (lineDesc.equalsIgnoreCase("null"))
					lineDesc = "";
				customerInfo = "Change Offer,Change Offer,07/05/2017 23:06:00," + externalBatchId + "," + accountNumber
						+ "," + serviceId + "," + serviceId + "," + promotion + ",,test," + lineDesc
						+ ",,,,,1,ashwini,kamath,25847,sgf@ygf.com,,";
				fileWriter.append(System.lineSeparator());
				fileWriter.append(customerInfo.toString());
				customerInfo = null;
				if (deviceflag) {
					if (ETFFlag.equalsIgnoreCase("null"))
						ETFFlag = "";
					if (subsidyAmt.equalsIgnoreCase("null"))
						subsidyAmt = "";
					if (lineDesc.equalsIgnoreCase("null"))
						lineDesc = "";
					if (pofValue.equalsIgnoreCase("null"))
						pofValue = "";

					customerInfo = "Change Offer,Change Offer,07/07/2016 23:06:00," + externalBatchId + ","
							+ accountNumber + ",,," + device + ",,test," + lineDesc + "," + serviceId + "," + pofValue
							+ "," + deffTerm + "," + insurance + "," + "1,ashwini,kamath,25847,sgf@ygf.com," + ETFFlag
							+ "," + subsidyAmt;
					fileWriter.append(System.lineSeparator());
					fileWriter.append(customerInfo.toString());
				}
				break;
			case "Mobile Resign":
				if (lineDesc.equalsIgnoreCase("null"))
					lineDesc = "";
				customerInfo = "Change Offer,Mobile Resign,07/05/2017 23:06:00," + externalBatchId + "," + accountNumber
						+ "," + serviceId + "," + serviceId + "," + promotion + ",,test," + lineDesc
						+ ",,,,,1,ashwini,kamath,25847,sgf@ygf.com,,";
				fileWriter.append(System.lineSeparator());
				fileWriter.append(customerInfo.toString());
				customerInfo = null;
				if (deviceflag) {
					if (ETFFlag.equalsIgnoreCase("null"))
						ETFFlag = "";
					if (subsidyAmt.equalsIgnoreCase("null"))
						subsidyAmt = "";
					if (lineDesc.equalsIgnoreCase("null"))
						lineDesc = "";
					if (pofValue.equalsIgnoreCase("null"))
						pofValue = "";

					customerInfo = "Change Offer,Mobile Resign,07/05/2017 23:06:00," + externalBatchId + ","
							+ accountNumber + ",,," + device + ",,test," + lineDesc + "," + serviceId + "," + pofValue
							+ "," + deffTerm + "," + insurance + "," + "1,ashwini,kamath,25847,sgf@ygf.com," + ETFFlag
							+ "," + subsidyAmt;
					fileWriter.append(System.lineSeparator());
					fileWriter.append(customerInfo.toString());
				}

			default:
				break;
			}

			System.out.println("CSV file was created successfully !!!");

		} catch (

		Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
			}

		}
	}

	/*
	 * Author Name: Ankita Banerjee; Description:For fibre to fibre and Wireless
	 * to wireless offers
	 */
	public String writeFibreWirelessCSV(String SourcePlan, String TargetPlan, String Type, String WaiveOffETF,
			String Sequence, String ServiceId, String ProductOfferId, String ParentProductOfferId, String ActionCode,
			String AltOrderRef, String PriceOverrideAmt, String OverrideReason, String DueDate,
			String BillingEffectiveDate, String UpfrontPayment, String Attrib1, String Attrib2, String Attrib3,
			String Attrib4, String Attrib5, String Attrib6, String Attrib7, String Attrib8, String Attrib9,
			String Attrib10, String Attrib11, String Attrib12, String Attrib13, String Attrib14, String Attrib15,
			String Attrib16, String Attrib17, String Attrib18, String Attrib19, String Attrib20, String filePath) {
		// CSV file header
		final String FILE_HEADER = "SourcePlan,TargetPlan,Type,WaiveOffETF,Sequence,ServiceId,ProductOfferId,"
				+ "ParentProductOfferId,ActionCode,AltOrderRef,PriceOverrideAmt,OverrideReason,DueDate,"
				+ "BillingEffectiveDate,UpfrontPayment,Attrib1,Attrib2,Attrib3,Attrib4,Attrib5,Attrib6,Attrib7,"
				+ "Attrib8,Attrib9,Attrib10,Attrib11,Attrib12,Attrib13,Attrib14,Attrib15,Attrib16,Attrib17,"
				+ "Attrib18,Attrib19,Attrib20";

		FileWriter fileWriter = null;
		String fileName = Type.replace(" ", "") + ".csv";

		try {
			fileWriter = new FileWriter(filePath + fileName);
			System.out.println(filePath + fileName);
			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add customer Info after the header
			String customerInfo = SourcePlan + "," + TargetPlan + "," + Type + "," + WaiveOffETF + "," + Sequence + ","
					+ ServiceId + "," + ProductOfferId + "," + ParentProductOfferId + "," + ActionCode + ","
					+ AltOrderRef + "," + PriceOverrideAmt + "," + OverrideReason + "," + DueDate + ","
					+ BillingEffectiveDate + "," + UpfrontPayment + "," + Attrib1 + "," + Attrib2 + "," + Attrib3 + ","
					+ Attrib4 + "," + Attrib5 + "," + Attrib6 + "," + Attrib7 + "," + Attrib8 + "," + Attrib9 + ","
					+ Attrib10 + "," + Attrib11 + "," + Attrib12 + "," + Attrib13 + "," + Attrib14 + "," + Attrib15
					+ "," + Attrib16 + "," + Attrib17 + "," + Attrib18 + "," + Attrib19 + "," + Attrib20;

			fileWriter.append(System.lineSeparator());
			fileWriter.append(customerInfo.toString());
			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
			}

		}
		return fileName;
	}

	/*
	 * Author Name: Sulagna; Description:For bulk SD mobile resign
	 */
	public String createSDMobileResignCSV(String RequestType, String RequestSubType, String DueDate,
			String ExternalBatchId, String AccountNumber, String MobileNumber, String SIMNumber, String ProductOfferID,
			String EntitlementRef, String Comments, String LineDescription, String IMEI, String POFAmount,
			String DeferredPayTerm, String MobileInsurance, String CorrelationId, String ContactFirstName,
			String ContactLastName, String ContactMobilePhone, String ContactEmailAddress, String ETFFlag,
			String SubsidyAmount, String filePath) {
		// CSV file header
		final String FILE_HEADER = "RequestType,RequestSubType,DueDate,ExternalBatchId,AccountNumber,MobileNumber,SIMNumber,ProductOfferId,EntitlementRef,Comments,LineDescription,IMEI,POFAmount,DeferredPayTerm,MobileInsurance,CorrelationId,ContactFirstName,ContactLastName,ContactMobilePhone,ContactEmailAddress,ETFFlag,SubsidyAmount";

		FileWriter fileWriter = null;
		String fileName = RequestSubType.replace(" ", "") + ".csv";
		try {
			fileWriter = new FileWriter(filePath + fileName);
			System.out.println(filePath + fileName);
			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add customer Info after the header
			String customerInfo = RequestType + "," + RequestSubType + "," + DueDate + "," + ExternalBatchId + ","
					+ AccountNumber + "," + MobileNumber + "," + SIMNumber + "," + ProductOfferID + "," + EntitlementRef
					+ "," + Comments + "," + LineDescription + "," + IMEI + "," + POFAmount + "," + DeferredPayTerm
					+ "," + MobileInsurance + "," + CorrelationId + "," + ContactFirstName + "," + ContactLastName + ","
					+ ContactMobilePhone + "," + ContactEmailAddress + "," + ETFFlag + "," + SubsidyAmount;

			fileWriter.append(System.lineSeparator());
			fileWriter.append(customerInfo.toString());
			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
			}

		}
		return fileName;
	}

	public String writeBulkMobilePoilcyControl(String ServiceId, String ProductOfferId, String ParentProductOfferId,
			String ActionCode, String AltOrderRef, String PriceOverrideAmt, String OverrideReason, String Attrib1,
			String Attrib2, String Attrib3, String Attrib4, String Attrib5, String Attrib6, String Attrib7,
			String Attrib8, String Attrib9, String Attrib10, String Attrib11, String Attrib12, String Attrib13,
			String Attrib14, String Attrib15, String Attrib16, String Attrib17, String Attrib18, String Attrib19,
			String Attrib20, String EffectiveDate, String filePath) {
		// CSV file header
		final String FILE_HEADER = "ServiceId,ProductOfferId,ParentProductOfferId,"
				+ "ActionCode,AltOrderRef,PriceOverrideAmt,OverrideReason,"
				+ "BillingEffectiveDate,Attrib1,Attrib2,Attrib3,Attrib4,Attrib5,"
				+ "Attrib6,Attrib7,Attrib8,Attrib9,Attrib10,Attrib11,"
				+ "Attrib12,Attrib13,Attrib14,Attrib15,Attrib16,Attrib17,Attrib18,Attrib19,Attrib20,EffectiveDate";

		FileWriter fileWriter = null;
		String fileName = "bulkMobilePoilcy.csv";

		try {
			fileWriter = new FileWriter(filePath + fileName);
			System.out.println(filePath + fileName);
			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add customer Info after the header
			String customerInfo = ServiceId + "," + ProductOfferId + "," + ParentProductOfferId + "," + ActionCode + ","
					+ AltOrderRef + "," + PriceOverrideAmt + "," + OverrideReason + "," + Attrib1 + "," + Attrib2 + ","
					+ Attrib3 + "," + Attrib4 + "," + Attrib5 + "," + Attrib6 + "," + Attrib7 + "," + Attrib8 + ","
					+ Attrib9 + "," + Attrib10 + "," + Attrib11 + "," + Attrib12 + "," + Attrib13 + "," + Attrib14 + ","
					+ Attrib15 + "," + Attrib16 + "," + Attrib17 + "," + Attrib18 + "," + Attrib19 + "," + Attrib20
					+ "," + EffectiveDate;

			fileWriter.append(System.lineSeparator());
			fileWriter.append(customerInfo.toString());
			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
			}

		}
		return fileName;
	}

	/* Author Sandeep Amrutkar. Dec: To create file for alert preferences in account screen */
	public String writeAlertPreferences(String Action, String Level, String BillingAccntNum, String LineNumber,
			String Type, String SubType, String OldMedium, String OldMediumValue, String Medium,
			String MediumValue, String OptOut, String filePath) {
		// CSV file header
		final String FILE_HEADER = "Action,Level,BillingAccntNum,LineNumber,"
				+ "Type,SubType,OldMedium,OldMediumValue,"
				+ "Medium,MediumValue,OptOut";
				
		FileWriter fileWriter = null;
		String fileName = "alertPreferences.csv";

		try {
			fileWriter = new FileWriter(filePath + fileName);
			System.out.println(filePath + fileName);
			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add customer Info after the header
			String customerInfo = Action + "," + Level + "," + BillingAccntNum + "," + LineNumber + ","
					+ Type + "," + SubType + "," + OldMedium + "," + OldMediumValue + "," + Medium + ","
					+ MediumValue + "," + OptOut;

			fileWriter.append(System.lineSeparator());
			fileWriter.append(customerInfo.toString());
			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
			}

		}
		return fileName;
	}
}
