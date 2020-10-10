package com.facebook.Generic;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;

import javax.xml.soap.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.testng.Assert;

public class RequestToSOAP {

	private SOAPMessage createRequest(String soapAction, String xml) {
		SOAPMessage request = null;
		try {
			// add raw content
			ByteArrayInputStream bis = new ByteArrayInputStream(xml.getBytes());
			MimeHeaders header = new MimeHeaders();
			header.setHeader("SOAPAction", soapAction);
			MessageFactory msgFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL);
			request = msgFactory.createMessage(header, bis);
			request.saveChanges();
		} catch (Exception ex) {
			Assert.fail("Error while creating soap request");
		}

		return request;
	}
	
	 /*
	  * Author: Ankita Banerjee
	  * Description: Updated return type of createSoapResponse and sendRequestToSOAP to store value in string
	  */

	private String createSoapResponse(SOAPMessage soapResponse) throws Exception {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		Source sourceContent = soapResponse.getSOAPPart().getContent();
		StringWriter writer = new StringWriter();
		System.out.println("\n----------SOAP Response-----------");
		StreamResult result = new StreamResult(writer);
		transformer.transform(sourceContent, result);
		String SOAPResponse=writer.toString();
		System.out.println(SOAPResponse);
		return SOAPResponse;
	}

	public String sendRequestToSOAP(String endpoint, String soapAction, String xml) {
		String result=null;
		try {
			SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
			SOAPConnection soapConnection = soapConnectionFactory.createConnection();
			
			String url = endpoint;
			SOAPMessage soapRequest = createRequest(soapAction, xml);
			// hit soapRequest to the server to get response
			SOAPMessage soapResponse = soapConnection.call(soapRequest, url);
			result=createSoapResponse(soapResponse);
			soapConnection.close();
			
		} catch (Exception e) {
			Assert.fail("Error while sending soap request");
		}
		return result;
	}
	
	

	/*public static void main(String[] args) {
		sendRequestToSOAP(
				"http://unx8372.telecom.co.nz:6100/eai_anon_enu/start.swe?SWEExtSource=WebService&SWEExtCmd=Execute&WSSOAP=1",
				"\"document/http://siebel.com/asi/:notifyCustomerCreditApplication\"",
				"<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:asi='http://siebel.com/asi/' xmlns:tnz='http://www.siebel.com/xml/TNZNotifyCustomerCreditApplication'><soapenv:Header/><soapenv:Body><asi:notifyCustomerCreditApplication_Input><asi:Process_spcInstance_spcId/><asi:correlationId/><asi:transactionId/><asi:lineOfBusiness/><asi:application/><asi:timeStamp/><asi:Object_spcId/><asi:Siebel_spcOperation_spcObject_spcId/><asi:correlationSource/><tnz:ListOfNotifyCustomerCreditApplication><!--Optional:--><tnz:ListOfAccount><!--Zero or more repetitions:--><tnz:Account><!--Optional:--><tnz:CSN>700953351</tnz:CSN><!--Optional:--><tnz:ListOfComFinancialProfile><!--Zero or more repetitions:--><tnz:ComFinancialProfile><!--Optional:--><tnz:CreditCheckStatusDesc>Pass</tnz:CreditCheckStatusDesc><!--Optional:--><tnz:CreditCheckStatus>Approved</tnz:CreditCheckStatus><!--Optional:--><tnz:CreditCheckStatusReason>Reason</tnz:CreditCheckStatusReason><!--Optional:--><tnz:ParentAccountNumber>700953351</tnz:ParentAccountNumber></tnz:ComFinancialProfile></tnz:ListOfComFinancialProfile><!--Optional:--><tnz:ListOfOrder><!--Zero or more repetitions:--><tnz:Order><!--Optional:--><tnz:OrderNumber>1-133004809640</tnz:OrderNumber></tnz:Order></tnz:ListOfOrder></tnz:Account></tnz:ListOfAccount></tnz:ListOfNotifyCustomerCreditApplication><asi:Order_spcNumber/><asi:user/><asi:processContext/><asi:Error_spcCode/><asi:Error_spcMessage/></asi:notifyCustomerCreditApplication_Input></soapenv:Body></soapenv:Envelope>");

	}*/
}