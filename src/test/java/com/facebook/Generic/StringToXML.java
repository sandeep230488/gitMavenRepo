package com.facebook.Generic;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class StringToXML {

	static Document doc = null;
	
	static Document originaldoc = null;

	public String getAttributeValue(String tagName, int index) {
		return doc.getElementsByTagName(tagName).item(index).getTextContent();
	}

	public String getAttributeValue1(String tagName, int index) {
		return originaldoc.getElementsByTagName(tagName).item(index).getTextContent();
	}
	/*public void readXML(String fileName) throws ParserConfigurationException, SAXException, IOException {
		File fXmlFile = new File(fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		doc = dBuilder.parse(fXmlFile);
	}*/
	
	public Document readXML(String fileName) throws ParserConfigurationException, SAXException, IOException {
		File fXmlFile = new File(fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		System.out.println("original stub to be changed="+fXmlFile);
		doc = dBuilder.parse(fXmlFile);
		return doc;	
	}
	
	public Document originalreadXML(String fileName) throws ParserConfigurationException, SAXException, IOException {
		File fXmlFile = new File(fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		originaldoc= dBuilder.parse(fXmlFile);
		return originaldoc;	
	}
	
	public void setAttributeValue(String tagName, String tagValue, int index) {
		doc.getElementsByTagName(tagName).item(index).setTextContent(tagValue);
	}

	public void writeToFile(String fileName) throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(fileName));
		transformer.transform(source, result);
	}

	
	public void writeToOriginalFile(String fileName) throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(originaldoc);
		StreamResult result = new StreamResult(new File(fileName));
		transformer.transform(source, result);
	}
	
	
	public Document toXmlDocument(String str) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		doc = docBuilder.parse(new InputSource(new StringReader(str)));
		return doc;
	}
	

	
	public void ToUpdateRetrivePartnerPromoStub() 
		throws ParserConfigurationException, SAXException, IOException, TransformerException 
		{
		//StringToXML stringToXML = new StringToXML();
		readXML("\\\\win8019\\stubss\\retrievePartnerPromotionsV1Request\\default.xml");
		String NetflixOfferID = getAttributeValue("msg:offerID", 0);
		setAttributeValue("msg:offerID", NetflixOfferID, 0);
		System.out.println(getAttributeValue("msg:offerID", 0));
		writeToFile("\\\\win8019\\stubss\\retrievePartnerPromotionsV1Request\\default.xml");
		}
	
	
	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, TransformerException {
		StringToXML stringToXML = new StringToXML();
		stringToXML.readXML("\\\\win8019\\stubss\\manageResourceV1Reest\\default.xml");
		stringToXML.setAttributeValue("msg:lineNumber", "36434643", 1);
		System.out.println(stringToXML.getAttributeValue("msg:lineNumber", 1));
		stringToXML.writeToFile("\\\\win8019\\stubss\\manageResourceV1Request\\default.xml");
	}

}
