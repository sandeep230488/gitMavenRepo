package com.facebook.Generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.w3c.dom.Document;

public class XMLgeneration {
	Document doc = null;

	public String getAttributeValue(String tagName, int index) {
		return doc.getElementsByTagName(tagName).item(index).getTextContent();
	}

	public static void main(String[] args) {
		RequestToSOAP rs = new RequestToSOAP();
		rs.sendRequestToSOAP("http://146.171.237.221:8892/BSToMQ_STG", "\"document/queryServiceByService\"",
				"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://partnerapi.brightstarcorp.com/v1.0\"><soapenv:Header/><soapenv:Body><xsi:PutDespatchAdvice><xsi:despatchAdvice><lastUpdateDate>2017-09-21T19:09:19</lastUpdateDate><creationDateTime>2017-09-21T19:09:19</creationDateTime><documentStatus>ORIGINAL</documentStatus><contentVersion><versionIdentification>1.0</versionIdentification></contentVersion><documentStructureVersion><versionIdentification>1.0</versionIdentification></documentStructureVersion><despatchAdviceIdentification><contentOwner><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>IMNZ</additionalPartyIdentificationValue></contentOwner><uniqueCreatorIdentification>18074505</uniqueCreatorIdentification></despatchAdviceIdentification><despatchInformation><despatchDateTime>2017-09-21T00:00:00</despatchDateTime><loadingDateTime>2017-09-21T00:00:00</loadingDateTime><pickupDateTime>2017-09-21T00:00:00</pickupDateTime><releaseDateTimeOfSupplier>2017-09-21T00:00:00</releaseDateTimeOfSupplier></despatchInformation><consignmentInformation><consignedItemWeight><tradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>SUPPLIER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>SIM3IN1</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>BUYER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>mSIMTrioPRS</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><gtin>9421030900763</gtin></tradeItemIdentification><unitMeasurement><measurementType>DECLARED_NET_WEIGHT</measurementType><measurementValue><unitOfMeasure>KG</unitOfMeasure><value>0.01</value></measurementValue></unitMeasurement></consignedItemWeight><consignedItemWeight><tradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>SUPPLIER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>MN9A2X/A</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>BUYER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>iphone121070PRS</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><gtin>9121030900763</gtin></tradeItemIdentification><unitMeasurement><measurementType>DECLARED_NET_WEIGHT</measurementType><measurementValue><unitOfMeasure>KG</unitOfMeasure><value>0.11</value></measurementValue></unitMeasurement></consignedItemWeight><consignedItemWeight><tradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>SUPPLIER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>SPKMOBAGRMNT</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>BUYER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>smAgreementPRS</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><gtin/></tradeItemIdentification><unitMeasurement><measurementType>DECLARED_NET_WEIGHT</measurementType><measurementValue><unitOfMeasure>KG</unitOfMeasure><value>0.01</value></measurementValue></unitMeasurement></consignedItemWeight><consignedItemWeight><tradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>SUPPLIER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>CTSCHDISFEECHAR</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>BUYER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>smShDiscFeesPRS</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><gtin/></tradeItemIdentification><unitMeasurement><measurementType>DECLARED_NET_WEIGHT</measurementType><measurementValue><unitOfMeasure>KG</unitOfMeasure><value>0.01</value></measurementValue></unitMeasurement></consignedItemWeight><consignmentIdentification><referenceDateTime>2017-09-21T00:00:00</referenceDateTime><referenceIdentification>2178350209921401WRE001JS</referenceIdentification></consignmentIdentification><packageInformation><numberOfUnits>1</numberOfUnits><packageType><packageTypeDescriptionCodeValue>A5</packageTypeDescriptionCodeValue></packageType></packageInformation><unitMeasurement><measurementType>DECLARED_NET_WEIGHT</measurementType><measurementValue><unitOfMeasure>KG</unitOfMeasure><value>0.03</value></measurementValue></unitMeasurement></consignmentInformation><despatchAdviceItemContainmentLineItem><number>8293290971</number><consignment><number>2178350209921401WRE001JS</number><reference><referenceDateTime>2017-09-21T19:09:19</referenceDateTime><referenceIdentification>1/M1-132604098327</referenceIdentification></reference></consignment><containedItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>SUPPLIER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>SIM3IN1</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>BUYER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>mSIMTrioPRS</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><gtin>9421030900763</gtin></containedItemIdentification><extendedAttributes><esn>896490000000001997</esn><iccid/><mdn/><msid/></extendedAttributes><purchaseOrder><documentReference><contentOwner><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>C00074</additionalPartyIdentificationValue></contentOwner><uniqueCreatorIdentification>1/M1-132604098327</uniqueCreatorIdentification></documentReference></purchaseOrder><quantityContained><unitOfMeasure><measurementUnitCodeValue>EA</measurementUnitCodeValue></unitOfMeasure><value>1</value></quantityContained><requestedQuantity><unitOfMeasure><measurementUnitCodeValue>EA</measurementUnitCodeValue></unitOfMeasure><value>1</value></requestedQuantity></despatchAdviceItemContainmentLineItem><despatchAdviceItemContainmentLineItem><number>8293290887</number><consignment><number>2178350209921401WRE001JS</number><reference><referenceDateTime>2017-09-21T19:09:19</referenceDateTime><referenceIdentification>1/M1-132604098327</referenceIdentification></reference></consignment><containedItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>SUPPLIER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>MN9A2X/A</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>BUYER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>miphone120454PRS</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><gtin>9421030900763</gtin></containedItemIdentification><extendedAttributes><esn>615002178614714</esn><iccid/><mdn/><msid/></extendedAttributes><purchaseOrder><documentReference><contentOwner><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>C00074</additionalPartyIdentificationValue></contentOwner><uniqueCreatorIdentification>1/M1-132604098327</uniqueCreatorIdentification></documentReference></purchaseOrder><quantityContained><unitOfMeasure><measurementUnitCodeValue>EA</measurementUnitCodeValue></unitOfMeasure><value>1</value></quantityContained><requestedQuantity><unitOfMeasure><measurementUnitCodeValue>EA</measurementUnitCodeValue></unitOfMeasure><value>1</value></requestedQuantity></despatchAdviceItemContainmentLineItem><despatchAdviceItemContainmentLineItem><number>8291856300-0</number><consignment><number>2178350209921401WRE001JS</number><reference><referenceDateTime>2017-09-21T19:09:19</referenceDateTime><referenceIdentification>1/M1-132604098327</referenceIdentification></reference></consignment><containedItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>SUPPLIER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>SPKMOBAGRMNT</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>BUYER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>smAgreementPRS</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><gtin/></containedItemIdentification><purchaseOrder><documentReference><contentOwner><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>C00074</additionalPartyIdentificationValue></contentOwner><uniqueCreatorIdentification>1/M1-132604098327</uniqueCreatorIdentification></documentReference></purchaseOrder><quantityContained><unitOfMeasure><measurementUnitCodeValue>EA</measurementUnitCodeValue></unitOfMeasure><value>1</value></quantityContained><requestedQuantity><unitOfMeasure><measurementUnitCodeValue>EA</measurementUnitCodeValue></unitOfMeasure><value>1</value></requestedQuantity></despatchAdviceItemContainmentLineItem><despatchAdviceItemContainmentLineItem><number>8291856300-1</number><consignment><number>2178350209921401WRE001JS</number><reference><referenceDateTime>2017-09-21T19:09:19</referenceDateTime><referenceIdentification>1/M1-132604098327</referenceIdentification></reference></consignment><containedItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>SUPPLIER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>CTSCHDISFEECHAR</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>BUYER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>smShDiscFeesPRS</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><gtin/></containedItemIdentification><purchaseOrder><documentReference><contentOwner><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>C00074</additionalPartyIdentificationValue></contentOwner><uniqueCreatorIdentification>1/M1-132604098327</uniqueCreatorIdentification></documentReference></purchaseOrder><quantityContained><unitOfMeasure><measurementUnitCodeValue>EA</measurementUnitCodeValue></unitOfMeasure><value>1</value></quantityContained><requestedQuantity><unitOfMeasure><measurementUnitCodeValue>EA</measurementUnitCodeValue></unitOfMeasure><value>1</value></requestedQuantity></despatchAdviceItemContainmentLineItem><orderLogisticalInformation><shipToNonCommercial><city>WHAU VALLEY</city><cityCode/><countryCode><countryISOCode>NZL</countryISOCode></countryCode><name>JANETTE KAYE MALCOLM 0274484965</name><currency><currencyISOCode>NZD</currencyISOCode></currency><postalCode>112</postalCode><streetAddressOne>2/261 Kamo Road</streetAddressOne></shipToNonCommercial><shipFrom><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>NZOC</additionalPartyIdentificationValue></shipFrom><shipmentTransportationInformation><carrier><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>Courier Post</additionalPartyIdentificationValue></carrier><serviceLevelCode>CPOLP</serviceLevelCode><shipmentSpecialHandlingCode>A</shipmentSpecialHandlingCode><transportationMethodType/></shipmentTransportationInformation></orderLogisticalInformation><purchaseOrder><documentReference><contentOwner><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>C00074</additionalPartyIdentificationValue></contentOwner><uniqueCreatorIdentification>1/M1-132604098327</uniqueCreatorIdentification></documentReference></purchaseOrder><extensionReference><key>ROM</key><value>10000216074836</value></extensionReference><extensionReference><key>transactionId</key><value>SBL_1-1NA7D1ND</value></extensionReference><extensionReference><key>OrderType</key><value>RMO_DIRECT</value></extensionReference><extensionReference><key>WarehouseOrder</key><value>2902979</value></extensionReference><extensionReference><key>Shipment</key><value>62303271</value></extensionReference></xsi:despatchAdvice></xsi:PutDespatchAdvice></soapenv:Body></soapenv:Envelope>");
	}

	public String getShipmentXML(String orderId, String simNumber, String correlationId, String deviceItemId,
			String simItemId) {

		String shipmentXML = "<SOAP-ENV:Envelope xmlns:SOAP-ENV='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsi='xsi'><SOAP-ENV:Header/><SOAP-ENV:Body xsi:type='ns0:PartnerAPI_PutDespatchAdvice_InputMessage' xmlns:ns0='wsdl.http://partnerapi.brightstarcorp.com/v1.0'><xci0:PutDespatchAdvice xmlns:xci0='http://partnerapi.brightstarcorp.com/v1.0'><xci0:despatchAdvice xmlns='http://partnerapi.brightstarcorp.com/v1.0'><lastUpdateDate>2017-09-21T19:09:19</lastUpdateDate><creationDateTime>2017-09-21T19:09:19</creationDateTime><documentStatus>ORIGINAL</documentStatus><contentVersion><versionIdentification>1.0</versionIdentification></contentVersion><documentStructureVersion><versionIdentification>1.0</versionIdentification></documentStructureVersion><despatchAdviceIdentification><contentOwner><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>IMNZ</additionalPartyIdentificationValue></contentOwner><uniqueCreatorIdentification>"
				+ orderId
				+ "</uniqueCreatorIdentification></despatchAdviceIdentification><despatchInformation><despatchDateTime>2017-09-21T00:00:00</despatchDateTime><loadingDateTime>2017-09-21T00:00:00</loadingDateTime><pickupDateTime>2017-09-21T00:00:00</pickupDateTime><releaseDateTimeOfSupplier>2017-09-21T00:00:00</releaseDateTimeOfSupplier></despatchInformation><consignmentInformation><consignedItemWeight><tradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>SUPPLIER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>SIM3IN1</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>BUYER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>mSIMTrioPRS</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><gtin>9421030900763</gtin></tradeItemIdentification><unitMeasurement><measurementType>DECLARED_NET_WEIGHT</measurementType><measurementValue><unitOfMeasure>KG</unitOfMeasure><value>0.01</value></measurementValue></unitMeasurement></consignedItemWeight><consignedItemWeight><tradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>SUPPLIER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>MN9A2X/A</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>BUYER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>miphone5s16gbgreyPRS</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><gtin>9121030900763</gtin></tradeItemIdentification><unitMeasurement><measurementType>DECLARED_NET_WEIGHT</measurementType><measurementValue><unitOfMeasure>KG</unitOfMeasure><value>0.11</value></measurementValue></unitMeasurement></consignedItemWeight><consignmentIdentification><referenceDateTime>2017-09-21T00:00:00</referenceDateTime><referenceIdentification>2178350209921401WRE001JS</referenceIdentification></consignmentIdentification><packageInformation><numberOfUnits>1</numberOfUnits><packageType><packageTypeDescriptionCodeValue>A5</packageTypeDescriptionCodeValue></packageType></packageInformation><unitMeasurement><measurementType>DECLARED_NET_WEIGHT</measurementType><measurementValue><unitOfMeasure>KG</unitOfMeasure><value>0.03</value></measurementValue></unitMeasurement></consignmentInformation><despatchAdviceItemContainmentLineItem><number>"
				+ simItemId
				+ "</number><consignment><number>2178350209921401WRE001JS</number><reference><referenceDateTime>2017-09-21T19:09:19</referenceDateTime><referenceIdentification>1/M1-129049160972</referenceIdentification></reference></consignment><containedItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>SUPPLIER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>SIM3IN1</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>BUYER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>mSIMTrioPRS</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><gtin>9421030900763</gtin></containedItemIdentification><extendedAttributes><esn>"
				+ simNumber
				+ "</esn><iccid/><mdn/><msid/></extendedAttributes><purchaseOrder><documentReference><contentOwner><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>C00074</additionalPartyIdentificationValue></contentOwner><uniqueCreatorIdentification>"
				+ orderId
				+ "</uniqueCreatorIdentification></documentReference></purchaseOrder><quantityContained><unitOfMeasure><measurementUnitCodeValue>EA</measurementUnitCodeValue></unitOfMeasure><value>1</value></quantityContained><requestedQuantity><unitOfMeasure><measurementUnitCodeValue>EA</measurementUnitCodeValue></unitOfMeasure><value>1</value></requestedQuantity></despatchAdviceItemContainmentLineItem><despatchAdviceItemContainmentLineItem><number>"
				+ deviceItemId
				+ "</number><consignment><number>2178350209921401WRE001JS</number><reference><referenceDateTime>2017-09-21T19:09:19</referenceDateTime><referenceIdentification>1/M1-129049160972</referenceIdentification></reference></consignment><containedItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>SUPPLIER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>MN9A2X/A</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><additionalTradeItemIdentification><additionalTradeItemIdentificationType>BUYER_ASSIGNED</additionalTradeItemIdentificationType><additionalTradeItemIdentificationValue>miphone5s16gbgreyPRS</additionalTradeItemIdentificationValue></additionalTradeItemIdentification><gtin>9421030900763</gtin></containedItemIdentification><extendedAttributes><esn>615002178614714</esn><iccid/><mdn/><msid/></extendedAttributes><purchaseOrder><documentReference><contentOwner><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>C00074</additionalPartyIdentificationValue></contentOwner><uniqueCreatorIdentification>"
				+ orderId
				+ "</uniqueCreatorIdentification></documentReference></purchaseOrder><quantityContained><unitOfMeasure><measurementUnitCodeValue>EA</measurementUnitCodeValue></unitOfMeasure><value>1</value></quantityContained><requestedQuantity><unitOfMeasure><measurementUnitCodeValue>EA</measurementUnitCodeValue></unitOfMeasure><value>1</value></requestedQuantity></despatchAdviceItemContainmentLineItem><orderLogisticalInformation><shipToNonCommercial><city>WHAU VALLEY</city><cityCode/><countryCode><countryISOCode>NZL</countryISOCode></countryCode><name>JANETTE KAYE MALCOLM 0274484965</name><currency><currencyISOCode>NZD</currencyISOCode></currency><postalCode>112</postalCode><streetAddressOne>2/261 Kamo Road</streetAddressOne></shipToNonCommercial><shipFrom><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>NZOC</additionalPartyIdentificationValue></shipFrom><shipmentTransportationInformation><carrier><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>Courier Post</additionalPartyIdentificationValue></carrier><serviceLevelCode>CPOLP</serviceLevelCode><shipmentSpecialHandlingCode>A</shipmentSpecialHandlingCode><transportationMethodType/></shipmentTransportationInformation></orderLogisticalInformation><purchaseOrder><documentReference><contentOwner><additionalPartyIdentificationType>SELLER_ASSIGNED_IDENTIFIER_FOR_A_PARTY</additionalPartyIdentificationType><additionalPartyIdentificationValue>C00074</additionalPartyIdentificationValue></contentOwner><uniqueCreatorIdentification>"
				+ orderId
				+ "</uniqueCreatorIdentification></documentReference></purchaseOrder><extensionReference><key>ROM</key><value>"
				+ correlationId
				+ "</value></extensionReference><extensionReference><key>transactionId</key><value>SBL_1-1NA7D1ND</value></extensionReference><extensionReference><key>OrderType</key><value>RMO_DIRECT</value></extensionReference><extensionReference><key>WarehouseOrder</key><value>2902979</value></extensionReference><extensionReference><key>Shipment</key><value>62303271</value></extensionReference></xci0:despatchAdvice></xci0:PutDespatchAdvice></SOAP-ENV:Body></SOAP-ENV:Envelope>";
		return shipmentXML;

	}

	public String getCreditCheckXML(String CustomerNumber, String OrderNumber) {

		String creditCheckXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:asi='http://siebel.com/asi/' xmlns:tnz='http://www.siebel.com/xml/TNZNotifyCustomerCreditApplication'><soapenv:Header/><soapenv:Body><asi:notifyCustomerCreditApplication_Input><asi:Process_spcInstance_spcId/><asi:correlationId/><asi:transactionId/><asi:lineOfBusiness/><asi:application/><asi:timeStamp/><asi:Object_spcId/><asi:Siebel_spcOperation_spcObject_spcId/><asi:correlationSource/><tnz:ListOfNotifyCustomerCreditApplication><tnz:ListOfAccount><tnz:Account><tnz:CSN>"
				+ CustomerNumber
				+ "</tnz:CSN><tnz:ListOfComFinancialProfile><tnz:ComFinancialProfile><tnz:CreditCheckStatusDesc>Pass</tnz:CreditCheckStatusDesc><tnz:CreditCheckStatus>Approved</tnz:CreditCheckStatus><tnz:CreditCheckStatusReason>Reason</tnz:CreditCheckStatusReason><tnz:ParentAccountNumber>"
				+ CustomerNumber
				+ "</tnz:ParentAccountNumber></tnz:ComFinancialProfile></tnz:ListOfComFinancialProfile><tnz:ListOfOrder><tnz:Order><tnz:OrderNumber>"
				+ OrderNumber
				+ "</tnz:OrderNumber></tnz:Order></tnz:ListOfOrder></tnz:Account></tnz:ListOfAccount></tnz:ListOfNotifyCustomerCreditApplication><asi:Order_spcNumber/><asi:user/><asi:processContext/><asi:Error_spcCode/><asi:Error_spcMessage/></asi:notifyCustomerCreditApplication_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println("Request=" + creditCheckXML);
		return creditCheckXML;

	}

	/*
	 * public String getDetermineETCXML(String AccountNumber, String
	 * ProductInstanceId, String ServiceId, String SourcePromo, String
	 * TargetPromo, String NoticeDate, String EffectiveDate) {
	 * 
	 * String DetermineETCXML =
	 * "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/'xmlns:cus='http://siebel.com/CustomUI' xmlns:det='http://www.siebel.com/xml/determineTerminationCharges_Input'><soapenv:Header/><soapenv:Body><cus:determineTerminationCharges_Input><det:determineTerminationChargesV1Request><det:changeProduct><det:AccountNumber>"
	 * + AccountNumber + "</det:AccountNumber><det:FromProductInstanceId>" +
	 * ProductInstanceId + "</det:FromProductInstanceId><det:ServiceId>" +
	 * ServiceId + "</det:ServiceId><det:FromProductPartNum>" + SourcePromo +
	 * "</det:FromProductPartNum><det:ToProductPartNum>" +TargetPromo +
	 * "</det:ToProductPartNum><det:OrderAim>Change Offer</det:OrderAim><det:NoticeDate>"
	 * + NoticeDate + "</det:NoticeDate><det:EffectiveDate>" + EffectiveDate +
	 * "</det:EffectiveDate><det:orderContext>Change Offer</det:orderContext></det:changeProduct><det:Mode>Display ETF</det:Mode></det:determineTerminationChargesV1Request><cus:transactionId></cus:transactionId><cus:lineOfBusiness>Spark</cus:lineOfBusiness><cus:application>ONLINE</cus:application><cus:timeStamp></cus:timeStamp><cus:user>Hybris</cus:user><cus:processContext></cus:processContext></cus:determineTerminationCharges_Input></soapenv:Body></soapenv:Envelope>"
	 * ; return DetermineETCXML;
	 * 
	 * }
	 */

	public String getDetermineETCXML(String OrderType, String OrderSubType, String AccountNumber,
			String ProductInstanceId, String ServiceId, String SourcePromo, String TargetPromo, String NoticeDate,
			String EffectiveDate) {

		String DetermineETCXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:det='http://www.siebel.com/xml/determineTerminationCharges_Input'><soapenv:Header/><soapenv:Body><cus:determineTerminationCharges_Input><det:determineTerminationChargesV1Request><det:changeProduct><det:AccountNumber>"
				+ AccountNumber + "</det:AccountNumber><det:FromProductInstanceId>" + ProductInstanceId
				+ "</det:FromProductInstanceId><det:ServiceId>" + ServiceId + "</det:ServiceId><det:FromProductPartNum>"
				+ SourcePromo + "</det:FromProductPartNum><det:ToProductPartNum>" + TargetPromo
				+ "</det:ToProductPartNum><det:OrderAim>" + OrderType + "</det:OrderAim><det:NoticeDate>" + NoticeDate
				+ "</det:NoticeDate><det:EffectiveDate>" + EffectiveDate + "</det:EffectiveDate><det:orderContext>"
				+ OrderSubType
				+ "</det:orderContext></det:changeProduct><det:Mode>Display ETF</det:Mode></det:determineTerminationChargesV1Request><cus:transactionId></cus:transactionId><cus:lineOfBusiness>Spark</cus:lineOfBusiness><cus:application>ONLINE</cus:application><cus:timeStamp></cus:timeStamp><cus:user>Hybris</cus:user><cus:processContext></cus:processContext></cus:determineTerminationCharges_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println("Request:" + DetermineETCXML);
		return DetermineETCXML;

	}

	public String getMaintainCustomerAccountPayment_DirectDebitXMLForNewTags(String AccountNumber, String PaymentType,
			String StartDate, String ID, String lname, String CompanyName, String phonenumber, String postionincompany,
			String email, String fname) {
		String directDebitOnlinePaymentXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:main='http://siebel.com/MaintainCustomerAccount' xmlns:acc='http://www.siebel.com/xml/AccountPaymentProfileIO'><soapenv:Header><UsernameToken xmlns='http://siebel.com/webservices'>T967991</UsernameToken><PasswordText xmlns='http://siebel.com/webservices'>winter27</PasswordText><SessionType xmlns='http://siebel.com/webservices'>None</SessionType></soapenv:Header><soapenv:Body><main:maintainCustomerAccountPaymentMethod_Input><main:Process_spcInstance_spcId></main:Process_spcInstance_spcId><main:transactionId></main:transactionId><main:lineOfBusiness></main:lineOfBusiness><main:application></main:application><main:timeStamp></main:timeStamp><main:Siebel_spcOperation_spcObject_spcId></main:Siebel_spcOperation_spcObject_spcId><main:user></main:user><acc:ListOfAccountPaymentProfile><acc:CutInvoiceSubAccounts><acc:AccountNumber>"
				+ AccountNumber
				+ "</acc:AccountNumber><acc:nextBillDate>11/29/2017</acc:nextBillDate><acc:ListOfOrganizationPaymentProfile><acc:OrganizationPaymentProfile><acc:Id>"
				+ ID
				+ "</acc:Id><acc:isOneOff>true</acc:isOneOff><acc:paymentMethodType>Direct Debit</acc:paymentMethodType><acc:paymentType>"
				+ PaymentType
				+ "</acc:paymentType><acc:amount>50.0</acc:amount><acc:channel>Online</acc:channel><acc:consent>Y</acc:consent><acc:ipAddress>Y</acc:ipAddress><acc:contactId>Ravi Kant</acc:contactId><acc:bankAccountName>ASB Bank Limited</acc:bankAccountName><acc:bankAccountNumber>0209503</acc:bankAccountNumber><acc:bankAccountSuffixNumber>00</acc:bankAccountSuffixNumber><acc:bankNumber>12</acc:bankNumber><acc:branchNumber>3188</acc:branchNumber><acc:branchName>Queenstown</acc:branchName><acc:validFromDate>"
				+ StartDate
				+ "T05:00:00:000Z</acc:validFromDate><acc:expirationDate></acc:expirationDate><acc:cardHolderName>AnjuJainAhya</acc:cardHolderName><acc:paymentStartDate>11/12/2017</acc:paymentStartDate><acc:lastName>"
				+ lname + "</acc:lastName><acc:companyName>" + CompanyName
				+ "</acc:companyName><acc:contactPhoneNumber>" + phonenumber
				+ "</acc:contactPhoneNumber><acc:positionInCompany>" + postionincompany
				+ "</acc:positionInCompany><acc:emailAddress>" + email + "</acc:emailAddress><acc:firstName>" + fname
				+ "</acc:firstName></acc:OrganizationPaymentProfile></acc:ListOfOrganizationPaymentProfile></acc:CutInvoiceSubAccounts></acc:ListOfAccountPaymentProfile><main:processContext></main:processContext><main:Error_spcCode></main:Error_spcCode><main:Error_spcMessage></main:Error_spcMessage></main:maintainCustomerAccountPaymentMethod_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(directDebitOnlinePaymentXML);
		return directDebitOnlinePaymentXML;
	}

	public String getMaintainCustomerAccountPayment_DirectDebitXMLwithNoIDForNewTags(String AccountNumber,
			String StartDate, String PaymentType, String lname, String CompanyName, String phonenumber,
			String postionincompany, String email, String fname) {
		String directDebitOnlinePaymentXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:main='http://siebel.com/MaintainCustomerAccount' xmlns:acc='http://www.siebel.com/xml/AccountPaymentProfileIO'><soapenv:Header><UsernameToken xmlns='http://siebel.com/webservices'>T967991</UsernameToken><PasswordText xmlns='http://siebel.com/webservices'>winter27</PasswordText><SessionType xmlns='http://siebel.com/webservices'>None</SessionType></soapenv:Header><soapenv:Body><main:maintainCustomerAccountPaymentMethod_Input><main:Process_spcInstance_spcId></main:Process_spcInstance_spcId><main:transactionId></main:transactionId><main:lineOfBusiness></main:lineOfBusiness><main:application></main:application><main:timeStamp></main:timeStamp><main:Siebel_spcOperation_spcObject_spcId></main:Siebel_spcOperation_spcObject_spcId><main:user></main:user><acc:ListOfAccountPaymentProfile><acc:CutInvoiceSubAccounts><acc:AccountNumber>"
				+ AccountNumber
				+ "</acc:AccountNumber><acc:nextBillDate>11/29/2017</acc:nextBillDate><acc:ListOfOrganizationPaymentProfile><acc:OrganizationPaymentProfile><acc:Id></acc:Id><acc:isOneOff>true</acc:isOneOff><acc:paymentMethodType>Direct Debit</acc:paymentMethodType><acc:paymentType>"
				+ PaymentType
				+ "</acc:paymentType><acc:amount>50.0</acc:amount><acc:channel>Online</acc:channel><acc:consent>Y</acc:consent><acc:ipAddress>Y</acc:ipAddress><acc:contactId>Ravi Kant</acc:contactId><acc:bankAccountName>ASB Bank Limited</acc:bankAccountName><acc:bankAccountNumber>0209503</acc:bankAccountNumber><acc:bankAccountSuffixNumber>00</acc:bankAccountSuffixNumber><acc:bankNumber>12</acc:bankNumber><acc:branchNumber>3188</acc:branchNumber><acc:branchName>Queenstown</acc:branchName><acc:validFromDate>"
				+ StartDate
				+ "T05:00:00:000Z</acc:validFromDate><acc:expirationDate></acc:expirationDate><acc:cardHolderName>AnjuJainAhya</acc:cardHolderName><acc:paymentStartDate>11/12/2017</acc:paymentStartDate><acc:lastName>"
				+ lname + "</acc:lastName><acc:companyName>" + CompanyName
				+ "</acc:companyName><acc:contactPhoneNumber>" + phonenumber
				+ "</acc:contactPhoneNumber><acc:positionInCompany>" + postionincompany
				+ "</acc:positionInCompany><acc:emailAddress>" + email + "</acc:emailAddress><acc:firstName>" + fname
				+ "</acc:firstName></acc:OrganizationPaymentProfile></acc:ListOfOrganizationPaymentProfile></acc:CutInvoiceSubAccounts></acc:ListOfAccountPaymentProfile><main:processContext></main:processContext><main:Error_spcCode></main:Error_spcCode><main:Error_spcMessage></main:Error_spcMessage></main:maintainCustomerAccountPaymentMethod_Input></soapenv:Body></soapenv:Envelope> ";
		System.out.println(directDebitOnlinePaymentXML);
		return directDebitOnlinePaymentXML;
	}

	public String ValidatePartnerOfferNotInContractError(Document determinePartnerPromotionResponse) {

		doc = determinePartnerPromotionResponse;

		String errorMessage = getAttributeValue("ns:Error_spcMessage", 0);

		return errorMessage;
	}

	public String ValidatePartnerOfferNotEligibleError(Document determinePartnerPromotionResponse) {

		doc = determinePartnerPromotionResponse;

		String errorMessage = getAttributeValue("ns:Error_spcMessage", 0);

		return errorMessage;
	}

	public String ValidateRetrievePremiseAddressError(Document retrievePremiseAddressResponse) {

		doc = retrievePremiseAddressResponse;

		String errorMessage = getAttributeValue("siebelf:errormsg", 0);

		return errorMessage;
	}

	public String ValidateUpsertPremiseAddressError(Document upsertPremiseAddressResponse) {

		doc = upsertPremiseAddressResponse;

		String errorMessage = getAttributeValue("siebelf:errormsg", 0);

		return errorMessage;
	}

	public String ValidateHeaderRequest(Document queryProductResponse) {

		doc = queryProductResponse;

		String HeaderRequestValues = "Service Point Id is :" + getAttributeValue("servicePointId", 0)
				+ ", Customer number is :" + getAttributeValue("customerNumber", 0) + ", Billing account number is : "
				+ getAttributeValue("billingAccountNumber", 0) + ", Product Name is :"
				+ getAttributeValue("productName", 0) + ".";
		/*
		 * String tag="BillingAccountNumber_ServicePointId_ProductName";
		 * 
		 * String index ="0_1"; for(String tags : tag.split("_"))
		 * 
		 * { for (String indexes : index.split("_")) { String
		 * queryProductResponse = getAttributeValue(tags, indexes); } } String
		 * errorMessage = getAttributeValue("ns:Error_spcMessage", 0);
		 */

		Assert.assertEquals(getAttributeValue("servicePointId", 0).equalsIgnoreCase(""), false);
		Assert.assertEquals(getAttributeValue("customerNumber", 0).equalsIgnoreCase(""), false);
		Assert.assertEquals(getAttributeValue("billingAccountNumber", 0).equalsIgnoreCase(""), false);
		Assert.assertEquals(getAttributeValue("productName", 0).equalsIgnoreCase(""), false);

		return HeaderRequestValues;

	}

	public String CheckPremiseAddressDetails(Document retrievePremiseAddressResponse) {

		doc = retrievePremiseAddressResponse;

		String CheckPremiseDetails = "Account Number is :" + getAttributeValue("AccountNumber", 0) + ", ELID is :"
				+ getAttributeValue("TNZELID", 0) + ", Site Name is : " + getAttributeValue("TNZSiteName", 0)
				+ ", City is :" + getAttributeValue("City", 0) + ", Street Address is : "
				+ getAttributeValue("StreetAddress", 0) + ",StreetAddress2 is : "
				+ getAttributeValue("StreetAddress2", 0) + ",StreetAddress3 is : "
				+ getAttributeValue("StreetAddress3", 0) + ", StreetAddress4 is : "
				+ getAttributeValue("StreetAddress4", 0) + ", Country is :" + getAttributeValue("Country", 0) + ""
				+ " longitude is :" + getAttributeValue("Longitude", 0) + ",latitude is :"
				+ getAttributeValue("Latitude", 0) + ",   Postal Code is :" + getAttributeValue("PostalCode", 0) + ".";
		/*
		 * String tag="BillingAccountNumber_ServicePointId_ProductName";
		 * 
		 * String index ="0_1"; for(String tags : tag.split("_"))
		 * 
		 * { for (String indexes : index.split("_")) { String
		 * queryProductResponse = getAttributeValue(tags, indexes); } } String
		 * errorMessage = getAttributeValue("ns:Error_spcMessage", 0);
		 */

		Assert.assertEquals(getAttributeValue("AccountNumber", 0).equalsIgnoreCase(""), false);
		Assert.assertEquals(getAttributeValue("TNZELID", 0).equalsIgnoreCase(""), false);
		Assert.assertEquals(getAttributeValue("TNZSiteName", 0).equalsIgnoreCase(""), false);
		Assert.assertEquals(getAttributeValue("Country", 0).equalsIgnoreCase(""), false);
		Assert.assertEquals(getAttributeValue("PostalCode", 0).equalsIgnoreCase(""), false);
		Assert.assertEquals(getAttributeValue("City", 0).equalsIgnoreCase(""), false);

		return CheckPremiseDetails;

	}

	public String CheckServicePointIdRequest(Document queryProductResponse) {

		doc = queryProductResponse;

		String ServicePointId = "Service Point Id is :" + getAttributeValue("servicePointId", 0) + ".";

		return ServicePointId;
	}

	public String getCreateAssetHeaderRequestXML(Document determinePartnerPromotionResponse) {

		doc = determinePartnerPromotionResponse;

		String createAssetHeaderReq = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:ass='http://www.siebel.com/xml/Asset_Management_IO'><soapenv:Header></soapenv:Header><soapenv:Body><cus:createAssetHeader_Input><cus:transactionId/><cus:lineOfBusiness/><cus:application/><cus:timeStamp/><ass:ListOfAsset_Management_Io><!--Zero or more repetitions:--><ass:AssetMgmt-Asset><!--Optional:--><!--Optional:--><ass:Id>"
				+ getAttributeValue("ns:PartnerCustomerIdentifier", 0)
				+ "</ass:Id><!--Optional:--><!--Optional:--><ass:offerID>" + getAttributeValue("ProductOfferId", 0)
				+ "</ass:offerID><!--Optional:--><ass:lineNumber>" + getAttributeValue("ns:SerialNumber", 0)
				+ "</ass:lineNumber><!--Optional:--><ass:accountNumber>" + getAttributeValue("ns:accountNumber", 0)
				+ "</ass:accountNumber><!--Optional:--><ass:customerNumber>" + getAttributeValue("ns:customerNumber", 0)
				+ "</ass:customerNumber><!--Optional:--><ass:offerName>" + getAttributeValue("OfferName", 0)
				+ "</ass:offerName><!--Zero or more repetitions:--><ass:AssetMgmtAssetXA><ass:textValue>"
				+ getAttributeValue("ns:PartnerCustomerIdentifier", 0)
				+ "</ass:textValue><ass:name>partnerCustomerIdentifier</ass:name></ass:AssetMgmtAssetXA><ass:AssetMgmtAssetXA><ass:textValue>"
				+ getAttributeValue("ExternalPromotionId", 0)
				+ "</ass:textValue><ass:name>partnerPromotionId</ass:name></ass:AssetMgmtAssetXA><ass:AssetMgmtAssetXA><ass:textValue>"
				+ getAttributeValue("ns:IntegrationId", 0)
				+ "</ass:textValue><ass:name>generatingProductInstanceId</ass:name></ass:AssetMgmtAssetXA><ass:AssetMgmtAssetXA><ass:textValue>"
				+ "PreActive"
				+ "</ass:textValue><ass:name>promotionRedemptionState</ass:name></ass:AssetMgmtAssetXA></ass:AssetMgmt-Asset></ass:ListOfAsset_Management_Io><cus:user/><cus:processContext/><cus:Error_spcCode/><cus:Error_spcMessage/></cus:createAssetHeader_Input></soapenv:Body></soapenv:Envelope>";

		System.out.println(createAssetHeaderReq);
		return createAssetHeaderReq;

	}

	public String getRedemptionInboundCallRequestXML(Document determinePartnerPromotionResponse) {

		doc = determinePartnerPromotionResponse;

		String redemptionmInboundReq = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI'><soapenv:Header/><soapenv:Body><cus:initiateRedemptionCheck_Input><cus:PAI>"
				+ getAttributeValue("ns:PartnerCustomerIdentifier", 0)
				+ "</cus:PAI><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage></cus:initiateRedemptionCheck_Input></soapenv:Body></soapenv:Envelope>";

		System.out.println(redemptionmInboundReq);
		return redemptionmInboundReq;

	}

	public String getResponseForCreditExtensionEligibility(Document ResponseForCreditExtensionEligibility) {

		doc = ResponseForCreditExtensionEligibility;

		String responseForCreditExtensionEligibility = getAttributeValue("reasonCode", 0);

		System.out.println("Attribute value=" + responseForCreditExtensionEligibility);

		return responseForCreditExtensionEligibility;

	}

	public String getResponseForServiceAvailabilitySLATag(Document ResponseForServiceAvailability) {

		doc = ResponseForServiceAvailability;

		String responseForServiceAvailability = getAttributeValue("ns:SLA", 0);

		System.out.println("Attribute value=" + responseForServiceAvailability);

		return responseForServiceAvailability;

	}

	public String getResponseForServiceAvailability(Document ResponseForServiceAvailability, String tagname,
			String tagindex) {

		doc = ResponseForServiceAvailability;

		int index = Integer.parseInt(tagindex);
		String responseForServiceAvailability = getAttributeValue(tagname, index);

		System.out.println("Attribute value=" + responseForServiceAvailability);

		return responseForServiceAvailability;

	}

	public String getResponseForServiceAvailability(Document ResponseForServiceAvailability) {

		doc = ResponseForServiceAvailability;

		String responseForServiceAvailability = getAttributeValue("ns:SRNumber", 0);

		System.out.println("Attribute value=" + responseForServiceAvailability);

		return responseForServiceAvailability;

	}

	public String getResponseForCreditExtensionEligibilityID(Document ResponseForCreditExtensionEligibility) {

		doc = ResponseForCreditExtensionEligibility;

		String responseForCreditExtensionEligibility = getAttributeValue("eligibilityID", 0);

		System.out.println("Attribute value=" + responseForCreditExtensionEligibility);
		return responseForCreditExtensionEligibility;

	}

	public String getResponseForDeterminePartnerPromo(Document ResponseForDeterminePartnerPromo, String tagname,
			int index) {

		doc = ResponseForDeterminePartnerPromo;

		String responseForDeterminePartnerPromo = getAttributeValue(tagname, index);

		System.out.println("Attribute value=" + responseForDeterminePartnerPromo);

		return responseForDeterminePartnerPromo;

	}

	public String determinePartnerPromotionXML(String ServiceID, String PartNumber, String IntegrationID) {

		String determinePartnerPromotionXML = null;
		if (!ServiceID.isEmpty()) {
			determinePartnerPromotionXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI'><soapenv:Header/><soapenv:Body><cus:determinePartnerPromotion_Input><cus:IntegrationId></cus:IntegrationId><cus:SerialNumber>"
					+ ServiceID
					+ "</cus:SerialNumber><cus:transactionId></cus:transactionId><cus:lineOfBusiness></cus:lineOfBusiness><cus:application></cus:application><cus:timeStamp></cus:timeStamp><cus:PartNumber></cus:PartNumber><cus:user></cus:user><cus:processContext></cus:processContext><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage></cus:determinePartnerPromotion_Input></soapenv:Body></soapenv:Envelope>";
		} else if (!PartNumber.isEmpty()) {
			determinePartnerPromotionXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI'><soapenv:Header/><soapenv:Body><cus:determinePartnerPromotion_Input><cus:IntegrationId></cus:IntegrationId><cus:SerialNumber>"
					+ PartNumber
					+ "</cus:SerialNumber><cus:transactionId></cus:transactionId><cus:lineOfBusiness></cus:lineOfBusiness><cus:application></cus:application><cus:timeStamp></cus:timeStamp><cus:PartNumber></cus:PartNumber><cus:user></cus:user><cus:processContext></cus:processContext><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage></cus:determinePartnerPromotion_Input></soapenv:Body></soapenv:Envelope>";
		} else if (!IntegrationID.isEmpty()) {
			determinePartnerPromotionXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI'><soapenv:Header/><soapenv:Body><cus:determinePartnerPromotion_Input><cus:IntegrationId>"
					+ IntegrationID
					+ "</cus:IntegrationId><cus:SerialNumber></cus:SerialNumber><cus:transactionId></cus:transactionId><cus:lineOfBusiness></cus:lineOfBusiness><cus:application></cus:application><cus:timeStamp></cus:timeStamp><cus:PartNumber></cus:PartNumber><cus:user></cus:user><cus:processContext></cus:processContext><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage></cus:determinePartnerPromotion_Input></soapenv:Body></soapenv:Envelope>";
		} else {
			System.out.println("WISDL data not provided");
		}
		System.out.println(determinePartnerPromotionXML);
		return determinePartnerPromotionXML;
	}

	public String queryProductDetailsXML(String CustomerNumber, String RowId) {

		String queryProductDetailsXML = null;

		queryProductDetailsXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:ret='http://www.siebel.com/xml/RetrieveProductRequestIO'><soapenv:Header><UsernameToken xmlns='http://siebel.com/webservices'>T967619</UsernameToken><PasswordText xmlns='http://siebel.com/webservices'>kitkat10</PasswordText><SessionType xmlns='http://siebel.com/webservices'>None</SessionType></soapenv:Header><soapenv:Body><cus:queryProductDetails_Input><cus:Process_spcInstance_spcId></cus:Process_spcInstance_spcId><cus:LastPage></cus:LastPage><cus:transactionId></cus:transactionId><cus:lineOfBusiness></cus:lineOfBusiness><cus:application></cus:application><cus:NewQuery>true</cus:NewQuery><cus:Object_spcId></cus:Object_spcId><ret:AssetPromotionHierarchy><!--Optional:--><ret:ListOfPromotionAsset><!--Zero or more repetitions:--><ret:PromotionAsset><!--Optional:--><ret:serialNumber></ret:serialNumber><!--Optional:--><ret:productType></ret:productType><!--Optional:--><ret:productPartNumber></ret:productPartNumber><!--Optional:--><ret:customerNumber>"
				+ CustomerNumber
				+ "</ret:customerNumber><!--Optional:--><ret:billingAccountNumber></ret:billingAccountNumber><!--Optional:--><ret:instanceId></ret:instanceId><!--Optional:--><ret:premiseAddressId>"
				+ RowId
				+ "</ret:premiseAddressId><!--Optional:--><ret:status></ret:status></ret:PromotionAsset></ret:ListOfPromotionAsset></ret:AssetPromotionHierarchy><cus:includeAssetHeader></cus:includeAssetHeader><cus:Siebel_spcOperation_spcObject_spcId></cus:Siebel_spcOperation_spcObject_spcId><cus:PageSize>99</cus:PageSize><cus:timestamp></cus:timestamp><cus:user></cus:user><cus:statusMode></cus:statusMode><cus:processContext></cus:processContext><cus:StartRowNum>0</cus:StartRowNum><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage></cus:queryProductDetails_Input></soapenv:Body></soapenv:Envelope>";

		System.out.println(queryProductDetailsXML);
		return queryProductDetailsXML;
	}

	public String retrievePreferenceXML(String CustomerNumber, String AccountNumber, String AlertType, String ServiceId,
			String LOB) {

		String retrievePreferenceXML = null;

		retrievePreferenceXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:tnz='http://www.siebel.com/xml/TNZRetrieveAlertPreferencesRequestIO'><soapenv:Header/><soapenv:Body><cus:retrieverPreference_Input><ListOfretrieverPreferenceRequest><retrieverPreferenceRequest><customerNumber>"
				+ CustomerNumber + "</customerNumber><BillingAccountNumber>" + AccountNumber
				+ "</BillingAccountNumber><AlertType>" + AlertType
				+ "</AlertType><SubType></SubType><FunctionArea>SERVICE</FunctionArea><ServiceId>" + ServiceId
				+ "</ServiceId></retrieverPreferenceRequest></ListOfretrieverPreferenceRequest><cus:transactionId>046f02a8b11b7005</cus:transactionId><cus:lineOfBusiness>"
				+ LOB
				+ "</cus:lineOfBusiness><cus:application>ONLINE</cus:application><cus:timeStamp>2018-01-24T10:22:58.665Z</cus:timeStamp><cus:user>T967991</cus:user><cus:processContext>ONL_MANAGE_PREFERENCES</cus:processContext></cus:retrieverPreference_Input></soapenv:Body></soapenv:Envelope>";

		System.out.println(retrievePreferenceXML);
		return retrievePreferenceXML;
	}

	public String retrievePremiseAddressDetailsXML(String CustomerNumber) {

		String retrievePremiseAddressDetailsXML = null;

		retrievePremiseAddressDetailsXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI'><soapenv:Header/><soapenv:Body><cus:retrievePremiseAddress><transactionId></transactionId><application></application><timeStamp></timeStamp><CustomerNumber>"
				+ CustomerNumber
				+ "</CustomerNumber><user></user><Mode></Mode><processContext></processContext></cus:retrievePremiseAddress></soapenv:Body></soapenv:Envelope>";

		System.out.println(retrievePremiseAddressDetailsXML);
		return retrievePremiseAddressDetailsXML;
	}

	public String getAddSiteContactDetailsXML(String CustomerNumber, String ELID, String siteContactId,
			String contactMethod, String email, String firstName, String lastName, String phoneNumber, String role) {

		String getAddSiteContactDetailsXML = null;

		getAddSiteContactDetailsXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:tnz='http://www.siebel.com/xml/TNZManageSiteContactIO'><soapenv:Header/><soapenv:Body><cus:upsertSiteContact_Input><cus:transactionId></cus:transactionId><cus:lineOfBusiness></cus:lineOfBusiness><cus:application></cus:application><cus:timeStamp></cus:timeStamp><tnz:ListOftnzmanagesitecontactio><tnz:PrmAccountThinBc><!--Optional:--><tnz:customerNumber>"
				+ CustomerNumber
				+ "</tnz:customerNumber><!--Optional:--><tnz:ListOftnzAccountPremiseAddressBc><!--Zero or more repetitions:--><tnz:AccountPremiseAddressBc><!--Optional:--><tnz:ELID>"
				+ ELID
				+ "</tnz:ELID><!--Optional:--><tnz:listOftnzSiteContacts><!--Zero or more repetitions:--><tnz:SiteContacts><!--Optional:--><tnz:siteContactId>"
				+ siteContactId + "</tnz:siteContactId><!--Optional:--><tnz:ContactMethod>" + contactMethod
				+ "</tnz:ContactMethod><!--Optional:--><tnz:Email>" + email
				+ "</tnz:Email><!--Optional:--><tnz:FirstName>" + firstName
				+ "</tnz:FirstName><!--Optional:--><tnz:LastName>" + lastName
				+ "</tnz:LastName><!--Optional:--><tnz:PhoneNumber>" + phoneNumber + "</tnz:PhoneNumber><tnz:Role>"
				+ role
				+ "</tnz:Role><!--Optional:--><tnz:action>ADD</tnz:action></tnz:SiteContacts></tnz:listOftnzSiteContacts><!--Optional:--><tnz:listOftnzSiteInstructions><!--Zero or more repetitions:--><tnz:SiteInstructions><!--Optional:--><tnz:BldgOwnerLegalName></tnz:BldgOwnerLegalName><!--Optional:--><tnz:ConstRefurbish></tnz:ConstRefurbish><!--Optional:--><tnz:EnvRisks></tnz:EnvRisks><!--Optional:--><tnz:HLDayAccess></tnz:HLDayAccess><!--Optional:--><tnz:HLDayAccessFrom></tnz:HLDayAccessFrom><!--Optional:--><tnz:HLDayAccessTo></tnz:HLDayAccessTo><!--Optional:--><tnz:HLDayAccessToTimeOnly></tnz:HLDayAccessToTimeOnly><!--Optional:--><tnz:HLDayAcessFromTimeOnly></tnz:HLDayAcessFromTimeOnly><!--Optional:--><tnz:InsideBoundaryDetails></tnz:InsideBoundaryDetails><!--Optional:--><tnz:InstallObstacles></tnz:InstallObstacles><!--Optional:--><tnz:OnsiteNetRedundancy></tnz:OnsiteNetRedundancy><!--Optional:--><tnz:PowerCabling></tnz:PowerCabling><!--Optional:--><tnz:PropOwnerConsent></tnz:PropOwnerConsent><!--Optional:--><tnz:RoomLocation></tnz:RoomLocation><!--Optional:--><tnz:SpecAccReq></tnz:SpecAccReq><!--Optional:--><tnz:UPSdetails></tnz:UPSdetails><!--Optional:--><tnz:WkdayAccessFrom></tnz:WkdayAccessFrom><!--Optional:--><tnz:WkdayAccessFromTimeOnly></tnz:WkdayAccessFromTimeOnly><!--Optional:--><tnz:WkdayAccessTo></tnz:WkdayAccessTo><!--Optional:--><tnz:WkdayAccessToTimeOnly></tnz:WkdayAccessToTimeOnly></tnz:SiteInstructions></tnz:listOftnzSiteInstructions></tnz:AccountPremiseAddressBc></tnz:ListOftnzAccountPremiseAddressBc></tnz:PrmAccountThinBc></tnz:ListOftnzmanagesitecontactio><cus:user></cus:user><cus:processContext></cus:processContext><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage></cus:upsertSiteContact_Input></soapenv:Body></soapenv:Envelope>";

		System.out.println(getAddSiteContactDetailsXML);
		return getAddSiteContactDetailsXML;
	}

	public String getUpdateSiteContactDetailsXML(String CustomerNumber, String ELID, String siteContactId,
			String contactMethod, String email, String firstName, String lastName, String phoneNumber, String role) {

		String getUpdateSiteContactDetailsXML = null;

		getUpdateSiteContactDetailsXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:tnz='http://www.siebel.com/xml/TNZManageSiteContactIO'><soapenv:Header/><soapenv:Body><cus:upsertSiteContact_Input><cus:transactionId></cus:transactionId><cus:lineOfBusiness></cus:lineOfBusiness><cus:application></cus:application><cus:timeStamp></cus:timeStamp><tnz:ListOftnzmanagesitecontactio><tnz:PrmAccountThinBc><!--Optional:--><tnz:customerNumber>"
				+ CustomerNumber
				+ "</tnz:customerNumber><!--Optional:--><tnz:ListOftnzAccountPremiseAddressBc><!--Zero or more repetitions:--><tnz:AccountPremiseAddressBc><!--Optional:--><tnz:ELID>"
				+ ELID
				+ "</tnz:ELID><!--Optional:--><tnz:listOftnzSiteContacts><!--Zero or more repetitions:--><tnz:SiteContacts><!--Optional:--><tnz:siteContactId>"
				+ siteContactId + "</tnz:siteContactId><!--Optional:--><tnz:ContactMethod>" + contactMethod
				+ "</tnz:ContactMethod><!--Optional:--><tnz:Email>" + email
				+ "</tnz:Email><!--Optional:--><tnz:FirstName>" + firstName
				+ "</tnz:FirstName><!--Optional:--><tnz:LastName>" + lastName
				+ "</tnz:LastName><!--Optional:--><tnz:PhoneNumber>" + phoneNumber + "</tnz:PhoneNumber><tnz:Role>"
				+ role
				+ "</tnz:Role><!--Optional:--><tnz:action>UPDATE</tnz:action></tnz:SiteContacts></tnz:listOftnzSiteContacts><!--Optional:--><tnz:listOftnzSiteInstructions><!--Zero or more repetitions:--><tnz:SiteInstructions><!--Optional:--><tnz:BldgOwnerLegalName></tnz:BldgOwnerLegalName><!--Optional:--><tnz:ConstRefurbish></tnz:ConstRefurbish><!--Optional:--><tnz:EnvRisks></tnz:EnvRisks><!--Optional:--><tnz:HLDayAccess></tnz:HLDayAccess><!--Optional:--><tnz:HLDayAccessFrom></tnz:HLDayAccessFrom><!--Optional:--><tnz:HLDayAccessTo></tnz:HLDayAccessTo><!--Optional:--><tnz:HLDayAccessToTimeOnly></tnz:HLDayAccessToTimeOnly><!--Optional:--><tnz:HLDayAcessFromTimeOnly></tnz:HLDayAcessFromTimeOnly><!--Optional:--><tnz:InsideBoundaryDetails></tnz:InsideBoundaryDetails><!--Optional:--><tnz:InstallObstacles></tnz:InstallObstacles><!--Optional:--><tnz:OnsiteNetRedundancy></tnz:OnsiteNetRedundancy><!--Optional:--><tnz:PowerCabling></tnz:PowerCabling><!--Optional:--><tnz:PropOwnerConsent></tnz:PropOwnerConsent><!--Optional:--><tnz:RoomLocation></tnz:RoomLocation><!--Optional:--><tnz:SpecAccReq></tnz:SpecAccReq><!--Optional:--><tnz:UPSdetails></tnz:UPSdetails><!--Optional:--><tnz:WkdayAccessFrom></tnz:WkdayAccessFrom><!--Optional:--><tnz:WkdayAccessFromTimeOnly></tnz:WkdayAccessFromTimeOnly><!--Optional:--><tnz:WkdayAccessTo></tnz:WkdayAccessTo><!--Optional:--><tnz:WkdayAccessToTimeOnly></tnz:WkdayAccessToTimeOnly></tnz:SiteInstructions></tnz:listOftnzSiteInstructions></tnz:AccountPremiseAddressBc></tnz:ListOftnzAccountPremiseAddressBc></tnz:PrmAccountThinBc></tnz:ListOftnzmanagesitecontactio><cus:user></cus:user><cus:processContext></cus:processContext><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage></cus:upsertSiteContact_Input></soapenv:Body></soapenv:Envelope>";

		System.out.println(getUpdateSiteContactDetailsXML);
		return getUpdateSiteContactDetailsXML;
	}

	public String getDeleteSiteContactDetailsXML(String CustomerNumber, String ELID, String siteContactId) {

		String getDeleteSiteContactDetailsXML = null;

		getDeleteSiteContactDetailsXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:tnz='http://www.siebel.com/xml/TNZManageSiteContactIO'><soapenv:Header/><soapenv:Body><cus:upsertSiteContact_Input><cus:transactionId></cus:transactionId><cus:lineOfBusiness></cus:lineOfBusiness><cus:application></cus:application><cus:timeStamp></cus:timeStamp><tnz:ListOftnzmanagesitecontactio><tnz:PrmAccountThinBc><!--Optional:--><tnz:customerNumber>"
				+ CustomerNumber
				+ "</tnz:customerNumber><!--Optional:--><tnz:ListOftnzAccountPremiseAddressBc><!--Zero or more repetitions:--><tnz:AccountPremiseAddressBc><!--Optional:--><tnz:ELID>"
				+ ELID
				+ "</tnz:ELID><!--Optional:--><tnz:listOftnzSiteContacts><!--Zero or more repetitions:--><tnz:SiteContacts><!--Optional:--><tnz:siteContactId>"
				+ siteContactId
				+ "</tnz:siteContactId><!--Optional:--><tnz:ContactMethod></tnz:ContactMethod><!--Optional:--><tnz:Email></tnz:Email><!--Optional:--><tnz:FirstName></tnz:FirstName><!--Optional:--><tnz:LastName></tnz:LastName><!--Optional:--><tnz:PhoneNumber></tnz:PhoneNumber><tnz:Role></tnz:Role><!--Optional:--><tnz:action>DELETE</tnz:action></tnz:SiteContacts></tnz:listOftnzSiteContacts><!--Optional:--><tnz:listOftnzSiteInstructions><!--Zero or more repetitions:--><tnz:SiteInstructions><!--Optional:--><tnz:BldgOwnerLegalName></tnz:BldgOwnerLegalName><!--Optional:--><tnz:ConstRefurbish></tnz:ConstRefurbish><!--Optional:--><tnz:EnvRisks></tnz:EnvRisks><!--Optional:--><tnz:HLDayAccess></tnz:HLDayAccess><!--Optional:--><tnz:HLDayAccessFrom></tnz:HLDayAccessFrom><!--Optional:--><tnz:HLDayAccessTo></tnz:HLDayAccessTo><!--Optional:--><tnz:HLDayAccessToTimeOnly></tnz:HLDayAccessToTimeOnly><!--Optional:--><tnz:HLDayAcessFromTimeOnly></tnz:HLDayAcessFromTimeOnly><!--Optional:--><tnz:InsideBoundaryDetails></tnz:InsideBoundaryDetails><!--Optional:--><tnz:InstallObstacles></tnz:InstallObstacles><!--Optional:--><tnz:OnsiteNetRedundancy></tnz:OnsiteNetRedundancy><!--Optional:--><tnz:PowerCabling></tnz:PowerCabling><!--Optional:--><tnz:PropOwnerConsent></tnz:PropOwnerConsent><!--Optional:--><tnz:RoomLocation></tnz:RoomLocation><!--Optional:--><tnz:SpecAccReq></tnz:SpecAccReq><!--Optional:--><tnz:UPSdetails></tnz:UPSdetails><!--Optional:--><tnz:WkdayAccessFrom></tnz:WkdayAccessFrom><!--Optional:--><tnz:WkdayAccessFromTimeOnly></tnz:WkdayAccessFromTimeOnly><!--Optional:--><tnz:WkdayAccessTo></tnz:WkdayAccessTo><!--Optional:--><tnz:WkdayAccessToTimeOnly></tnz:WkdayAccessToTimeOnly></tnz:SiteInstructions></tnz:listOftnzSiteInstructions></tnz:AccountPremiseAddressBc></tnz:ListOftnzAccountPremiseAddressBc></tnz:PrmAccountThinBc></tnz:ListOftnzmanagesitecontactio><cus:user></cus:user><cus:processContext></cus:processContext><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage></cus:upsertSiteContact_Input></soapenv:Body></soapenv:Envelope>";

		System.out.println(getDeleteSiteContactDetailsXML);
		return getDeleteSiteContactDetailsXML;
	}

	// public String CreditExtensionEligibilityXML(String CustomerNumber, String
	// AccountNumber) {
	//
	// String creditExtensionEligibilityXML = "<soapenv:Envelope
	// xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/'
	// xmlns:cus='http://siebel.com/CustomUI'
	// xmlns:tnz='http://www.siebel.com/xml/TNZCustomerCreditExtensionIO'><soapenv:Header/><soapenv:Body><cus:checkCEEligibility_Input><cus:Process_spcInstance_spcId></cus:Process_spcInstance_spcId>"
	// +"<cus:correlationId></cus:correlationId><cus:transactionId></cus:transactionId><cus:lineOfBusiness></cus:lineOfBusiness><cus:application></cus:application><cus:timeStamp></cus:timeStamp><cus:Object_spcId></cus:Object_spcId><cus:Siebel_spcOperation_spcObject_spcId></cus:Siebel_spcOperation_spcObject_spcId><tnz:maintainCustomerCreditExtension><tnz:maintainCustomerCE>"
	// +"<!--Optional:--><tnz:creditExtension><!--Optional:--><tnz:validToDatewithNoLPF></tnz:validToDatewithNoLPF><!--Optional:--><tnz:validToDate></tnz:validToDate><!--Optional:--><tnz:reasonCode></tnz:reasonCode><!--Optional:--><tnz:planAmt></tnz:planAmt><!--Optional:--><tnz:eligibilityID></tnz:eligibilityID></tnz:creditExtension><!--Optional:--><tnz:customer><!--Optional:--><tnz:customerNumber>"
	// + CustomerNumber +
	// "</tnz:customerNumber></tnz:customer><!--Optional:--><tnz:customerAccount><!--Optional:--><tnz:accountID>"
	// + AccountNumber +
	// "</tnz:accountID></tnz:customerAccount></tnz:maintainCustomerCE></tnz:maintainCustomerCreditExtension><cus:user></cus:user><cus:processContext></cus:processContext><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage></cus:checkCEEligibility_Input></soapenv:Body></soapenv:Envelope>";
	// System.out.println(creditExtensionEligibilityXML);
	// return creditExtensionEligibilityXML;
	// }

	public String upsertPremiseAddressDetailsXML(String CustomerNumber, String ELID, String sitename) {

		String upsertPremiseAddressDetailsXML = null;

		upsertPremiseAddressDetailsXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:tnz='http://www.siebel.com/xml/TNZ%20Account%20Address'><soapenv:Header/><soapenv:Body><cus:upsertPremiseAddress><SiebelMessageRequest><tnz:ListOfTnzAccountAddress><!--Zero or more repetitions:--><tnz:TnzAccountAddress><!--Optional:--><tnz:Id></tnz:Id><!--Optional:--><tnz:AccountId></tnz:AccountId><!--Optional:--><tnz:AccountNumber>"
				+ CustomerNumber
				+ "</tnz:AccountNumber><!--Optional:--><tnz:Country></tnz:Country><!--Optional:--><tnz:MetroArea></tnz:MetroArea><!--Optional:--><tnz:Suburb></tnz:Suburb><!--Optional:--><tnz:StreetAddress></tnz:StreetAddress><!--Optional:--><tnz:StreetAddress2></tnz:StreetAddress2><!--Optional:--><tnz:StreetAddress3></tnz:StreetAddress3><!--Optional:--><tnz:StreetAddress4></tnz:StreetAddress4><!--Optional:--><tnz:Latitude></tnz:Latitude><!--Optional:--><tnz:Longitude></tnz:Longitude><!--Optional:--><tnz:UnitNumber></tnz:UnitNumber><!--Optional:--><tnz:BoxLobbyName></tnz:BoxLobbyName><!--Optional:--><tnz:BuildingName></tnz:BuildingName><!--Optional:--><tnz:City></tnz:City><!--Optional:--><tnz:TNZELID>"
				+ ELID
				+ "</tnz:TNZELID><!--Optional:--><tnz:PostalCode></tnz:PostalCode><!--Optional:--><tnz:PrivateBagName></tnz:PrivateBagName><!--Optional:--><tnz:TNZSiteName>"
				+ sitename
				+ "</tnz:TNZSiteName><!--Optional:--><tnz:StreetNumber></tnz:StreetNumber><!--Optional:--><tnz:StreetNumberLast></tnz:StreetNumberLast><!--Optional:--><tnz:StreetSuffix></tnz:StreetSuffix><!--Optional:--><tnz:StreetType></tnz:StreetType><!--Optional:--><tnz:District></tnz:District><!--Optional:--><tnz:XCoordinate></tnz:XCoordinate><!--Optional:--><tnz:YCoordinate></tnz:YCoordinate><!--Optional:--><tnz:RelationTypeCD></tnz:RelationTypeCD></tnz:TnzAccountAddress></tnz:ListOfTnzAccountAddress></SiebelMessageRequest><transactionId></transactionId><application></application><timeStamp></timeStamp><user></user><Mode></Mode><processContext></processContext></cus:upsertPremiseAddress></soapenv:Body></soapenv:Envelope>";

		System.out.println(upsertPremiseAddressDetailsXML);
		return upsertPremiseAddressDetailsXML;
	}

	public String getRetrieveSiteContactDetailsXML(String CustomerNumber, String ELID) {

		String getRetrieveSiteContactDetailsXML = null;

		getRetrieveSiteContactDetailsXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:tnz='http://www.siebel.com/xml/TNZManageSiteContactIO'><soapenv:Header/><soapenv:Body><cus:retrieveSiteContact_Input><cus:transactionId></cus:transactionId><cus:lineOfBusiness></cus:lineOfBusiness><cus:application></cus:application><cus:timeStamp></cus:timeStamp><tnz:ListOftnzmanagesitecontactio><tnz:PrmAccountThinBc><!--Optional:--><tnz:customerNumber>"
				+ CustomerNumber
				+ "</tnz:customerNumber><!--Optional:--><tnz:ListOftnzAccountPremiseAddressBc><!--Zero or more repetitions:--><tnz:AccountPremiseAddressBc><!--Optional:--><tnz:ELID>"
				+ ELID
				+ "</tnz:ELID><!--Optional:--><tnz:listOftnzSiteContacts><!--Zero or more repetitions:--><tnz:SiteContacts><!--Optional:--><tnz:siteContactId></tnz:siteContactId><!--Optional:--><tnz:ContactMethod></tnz:ContactMethod><!--Optional:--><tnz:Email></tnz:Email><!--Optional:--><tnz:FirstName></tnz:FirstName><!--Optional:--><tnz:LastName></tnz:LastName><!--Optional:--><tnz:PhoneNumber></tnz:PhoneNumber><tnz:Role></tnz:Role><!--Optional:--><tnz:action></tnz:action></tnz:SiteContacts></tnz:listOftnzSiteContacts><!--Optional:--><tnz:listOftnzSiteInstructions><!--Zero or more repetitions:--><tnz:SiteInstructions><!--Optional:--><tnz:BldgOwnerLegalName></tnz:BldgOwnerLegalName><!--Optional:--><tnz:ConstRefurbish></tnz:ConstRefurbish><!--Optional:--><tnz:EnvRisks></tnz:EnvRisks><!--Optional:--><tnz:HLDayAccess></tnz:HLDayAccess><!--Optional:--><tnz:HLDayAccessFrom></tnz:HLDayAccessFrom><!--Optional:--><tnz:HLDayAccessTo></tnz:HLDayAccessTo><!--Optional:--><tnz:HLDayAccessToTimeOnly></tnz:HLDayAccessToTimeOnly><!--Optional:--><tnz:HLDayAcessFromTimeOnly></tnz:HLDayAcessFromTimeOnly><!--Optional:--><tnz:InsideBoundaryDetails></tnz:InsideBoundaryDetails><!--Optional:--><tnz:InstallObstacles></tnz:InstallObstacles><!--Optional:--><tnz:OnsiteNetRedundancy></tnz:OnsiteNetRedundancy><!--Optional:--><tnz:PowerCabling></tnz:PowerCabling><!--Optional:--><tnz:PropOwnerConsent></tnz:PropOwnerConsent><!--Optional:--><tnz:RoomLocation></tnz:RoomLocation><!--Optional:--><tnz:SpecAccReq></tnz:SpecAccReq><!--Optional:--><tnz:UPSdetails></tnz:UPSdetails><!--Optional:--><tnz:WkdayAccessFrom></tnz:WkdayAccessFrom><!--Optional:--><tnz:WkdayAccessFromTimeOnly></tnz:WkdayAccessFromTimeOnly><!--Optional:--><tnz:WkdayAccessTo></tnz:WkdayAccessTo><!--Optional:--><tnz:WkdayAccessToTimeOnly></tnz:WkdayAccessToTimeOnly></tnz:SiteInstructions></tnz:listOftnzSiteInstructions></tnz:AccountPremiseAddressBc></tnz:ListOftnzAccountPremiseAddressBc></tnz:PrmAccountThinBc></tnz:ListOftnzmanagesitecontactio><cus:user></cus:user><cus:processContext></cus:processContext><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage></cus:retrieveSiteContact_Input></soapenv:Body></soapenv:Envelope>";

		System.out.println(getRetrieveSiteContactDetailsXML);
		return getRetrieveSiteContactDetailsXML;
	}

	public String[] siteContactDetails(Document getRetrieveSiteContactDetailsXML, int index) {

		doc = getRetrieveSiteContactDetailsXML;

		String[] siteDetails = new String[4];

		siteDetails[0] = getAttributeValue("siteContactId", index);
		siteDetails[1] = getAttributeValue("FirstName", index);
		siteDetails[2] = getAttributeValue("LastName", index);
		siteDetails[3] = getAttributeValue("Role", index);

		return siteDetails;

	}
	
	public String siteContactId(Document getRetrieveSiteContactDetailsXML, int index) {

		doc = getRetrieveSiteContactDetailsXML;

		String siteContactId = getAttributeValue("siteContactId", index);

		return siteContactId;

	}

	public void siteContactDetailsMatch(Document getRetrieveSiteContactDetailsXML, List<String> values) {

		doc = getRetrieveSiteContactDetailsXML;

		int i = 0;
		int j = values.size();
		System.out.println("Total values are=" + j);
		for (String element : values) {
			String Name = getAttributeValue("FirstName", i);
			Assert.assertEquals(element.equalsIgnoreCase(Name), true);
			System.out.println(i + " value match");
			i++;
		}
	}

	public String upsertSiteContact(Document determinePartnerPromotionResponse) {

		doc = determinePartnerPromotionResponse;

		String createAssetHeaderReq = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:ass='http://www.siebel.com/xml/Asset_Management_IO'><soapenv:Header></soapenv:Header><soapenv:Body><cus:createAssetHeader_Input><cus:transactionId/><cus:lineOfBusiness/><cus:application/><cus:timeStamp/><ass:ListOfAsset_Management_Io><!--Zero or more repetitions:--><ass:AssetMgmt-Asset><!--Optional:--><!--Optional:--><ass:Id>"
				+ getAttributeValue("ns:PartnerCustomerIdentifier", 0)
				+ "</ass:Id><!--Optional:--><!--Optional:--><ass:offerID>" + getAttributeValue("ProductOfferId", 0)
				+ "</ass:offerID><!--Optional:--><ass:lineNumber>" + getAttributeValue("ns:SerialNumber", 0)
				+ "</ass:lineNumber><!--Optional:--><ass:accountNumber>" + getAttributeValue("ns:accountNumber", 0)
				+ "</ass:accountNumber><!--Optional:--><ass:customerNumber>" + getAttributeValue("ns:customerNumber", 0)
				+ "</ass:customerNumber><!--Optional:--><ass:offerName>" + getAttributeValue("OfferName", 0)
				+ "</ass:offerName><!--Zero or more repetitions:--><ass:AssetMgmtAssetXA><ass:textValue>"
				+ getAttributeValue("ns:PartnerCustomerIdentifier", 0)
				+ "</ass:textValue><ass:name>partnerCustomerIdentifier</ass:name></ass:AssetMgmtAssetXA><ass:AssetMgmtAssetXA><ass:textValue>"
				+ getAttributeValue("ExternalPromotionId", 0)
				+ "</ass:textValue><ass:name>partnerPromotionId</ass:name></ass:AssetMgmtAssetXA><ass:AssetMgmtAssetXA><ass:textValue>"
				+ getAttributeValue("ns:IntegrationId", 0)
				+ "</ass:textValue><ass:name>generatingProductInstanceId</ass:name></ass:AssetMgmtAssetXA><ass:AssetMgmtAssetXA><ass:textValue>"
				+ "PreActive"
				+ "</ass:textValue><ass:name>promotionRedemptionState</ass:name></ass:AssetMgmtAssetXA></ass:AssetMgmt-Asset></ass:ListOfAsset_Management_Io><cus:user/><cus:processContext/><cus:Error_spcCode/><cus:Error_spcMessage/></cus:createAssetHeader_Input></soapenv:Body></soapenv:Envelope>";

		System.out.println(createAssetHeaderReq);
		return createAssetHeaderReq;

	}

	public String retrieveCustomerAgreementXML(String CustomerNumber) {

		String retrieveCustomerAgreementXML = null;

		retrieveCustomerAgreementXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:tnz='http://www.siebel.com/xml/TNZRetrieveCustomerAgreement'><soapenv:Header/><soapenv:Body><cus:retrieveCustomerAgreement_Input><tnz:customerServiceAgreement><!--Optional:--><tnz:Status>Active</tnz:Status><tnz:customerNumber>"
				+ CustomerNumber
				+ "</tnz:customerNumber></tnz:customerServiceAgreement><cus:transactionId>3</cus:transactionId><cus:lineOfBusiness>Spark Digital</cus:lineOfBusiness><cus:application>Siebel</cus:application><cus:user>T967829</cus:user></cus:retrieveCustomerAgreement_Input></soapenv:Body></soapenv:Envelope>";

		System.out.println(retrieveCustomerAgreementXML);
		return retrieveCustomerAgreementXML;
	}

	public String smartShareActivityXML(String AccountNumber, String CustomerNumber, String SerialNumber) {

		String smartShareActivityXML = null;

		smartShareActivityXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:new='http://www.siebel.com/xml/NewActionIO'><soapenv:Header/><soapenv:Body><cus:createInteraction_Input><cus:messageId></cus:messageId><cus:Process_spcInstance_spcId></cus:Process_spcInstance_spcId><cus:transactionId>5</cus:transactionId><cus:lineOfBusiness>Spark</cus:lineOfBusiness><cus:application>Siebel</cus:application><cus:Object_spcId></cus:Object_spcId><cus:Siebel_spcOperation_spcObject_spcId></cus:Siebel_spcOperation_spcObject_spcId><new:createInteraction><new:Action><new:CLI></new:CLI><new:CIRN></new:CIRN><new:Category>Account</new:Category><new:AccountNumber>"
				+ AccountNumber
				+ "</new:AccountNumber><new:OrderNumber></new:OrderNumber><new:ContactMedium>Call - Outbound</new:ContactMedium><new:CustomerNumber>"
				+ CustomerNumber
				+ "</new:CustomerNumber><new:AgentId>T967829</new:AgentId><new:ReadOnly>N</new:ReadOnly><new:Subtype>Mobile</new:Subtype><new:HLSCreatedDate>2018-02-13T23:42:45.000Z</new:HLSCreatedDate><new:Description>1000</new:Description><new:MessagingId></new:MessagingId><new:SerialNumber>"
				+ SerialNumber
				+ "</new:SerialNumber><new:Type>SMARTSHARE_OVERAGE</new:Type></new:Action></new:createInteraction><cus:timestamp>2018-02-13T23:42:45.000Z</cus:timestamp><cus:user>t967829</cus:user><cus:processContext>BPM8-21402</cus:processContext><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage></cus:createInteraction_Input></soapenv:Body></soapenv:Envelope>";

		System.out.println(smartShareActivityXML);
		return smartShareActivityXML;
	}

	public String CreditExtensionEligibilityXML(String CustomerNumber, String AccountNumber) {

		String creditExtensionEligibilityXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:tnz='http://www.siebel.com/xml/TNZCustomerCreditExtensionIO'><soapenv:Header/><soapenv:Body><cus:checkCEEligibility_Input><cus:Process_spcInstance_spcId></cus:Process_spcInstance_spcId><cus:correlationId></cus:correlationId><cus:transactionId></cus:transactionId><cus:lineOfBusiness></cus:lineOfBusiness><cus:application></cus:application><cus:timeStamp></cus:timeStamp><cus:Object_spcId></cus:Object_spcId><cus:Siebel_spcOperation_spcObject_spcId></cus:Siebel_spcOperation_spcObject_spcId><tnz:maintainCustomerCreditExtension><tnz:maintainCustomerCE><tnz:creditExtension><tnz:validToDatewithNoLPF></tnz:validToDatewithNoLPF><tnz:validToDate></tnz:validToDate><tnz:reasonCode></tnz:reasonCode><tnz:planAmt></tnz:planAmt><tnz:eligibilityID></tnz:eligibilityID></tnz:creditExtension><tnz:customer><tnz:customerNumber>"
				+ CustomerNumber + "</tnz:customerNumber></tnz:customer><tnz:customerAccount><tnz:accountID>"
				+ AccountNumber
				+ "</tnz:accountID></tnz:customerAccount></tnz:maintainCustomerCE></tnz:maintainCustomerCreditExtension><cus:user></cus:user><cus:processContext></cus:processContext><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage></cus:checkCEEligibility_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(creditExtensionEligibilityXML);
		return creditExtensionEligibilityXML;
	}

	public String serviceAvailabilityXML(String CustomerNumber, String AccountNumber) {

		String ServiceAvailabilityXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:tnz='http://www.siebel.com/xml/TNZ%20Service%20Request%20Bill%20Dispute%20XML%20IO'>"
				+ "<soapenv:Header/><soapenv:Body><cus:manageSR_Input><cus:Object_spcId>?</cus:Object_spcId><tnz:ListOfTnzServiceRequestBillDisputeXMLIO><tnz:ListOfTnzServiceRequestBillDisputeBc><!--Zero or more repetitions:--><tnz:TnzServiceRequestBillDisputeBc>"
				+ "<!--Optional:--><tnz:Id>1-JF4V8W1</tnz:Id><!--Optional:--><tnz:AccountNumber>" + CustomerNumber
				+ "</tnz:AccountNumber><!--Optional:--><tnz:INSArea>Billing &amp; Credit</tnz:INSArea><!--Optional:--><tnz:INSProduct>Complaint</tnz:INSProduct><!--Optional:-->"
				+ "<tnz:INSSub-Area>Disputes amount</tnz:INSSub-Area><!--Optional:--><tnz:SendTo>sarmapurak@gmail.com</tnz:SendTo><!--Optional:--><tnz:Source>Online</tnz:Source><!--Optional:--><tnz:TNZBillingAccountNumber>"
				+ AccountNumber
				+ "</tnz:TNZBillingAccountNumber><!--Optional:--><tnz:TNZContactName>Purak</tnz:TNZContactName><!--Optional:--><tnz:TNZContactPhoneNum>8254924900</tnz:TNZContactPhoneNum><!--Optional:--><tnz:TNZDescription>Sprint 3</tnz:TNZDescription><!--Optional:--><tnz:TNZPreferredMethod>Email</tnz:TNZPreferredMethod>"
				+ "<tnz:substitutionParameter><!--Optional:--><tnz:name>TNZ Tax Treatment</tnz:name><!--Optional:--><tnz:value>GST Inclusive</tnz:value></tnz:substitutionParameter><tnz:substitutionParameter><!--Optional:--><tnz:name>TNZ Enquiry Amount</tnz:name>"
				+ "<!--Optional:--><tnz:value>20</tnz:value></tnz:substitutionParameter></tnz:TnzServiceRequestBillDisputeBc></tnz:ListOfTnzServiceRequestBillDisputeBc></tnz:ListOfTnzServiceRequestBillDisputeXMLIO><cus:Mode>CreateBillDisputeSR</cus:Mode>"
				+ "<cus:processContext>?</cus:processContext></cus:manageSR_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(ServiceAvailabilityXML);
		return ServiceAvailabilityXML;
	}

	public String serviceAvailabilityXML1(String CustomerNumber, String AccountNumber) {

		String ServiceAvailabilityXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:tnz='http://www.siebel.com/xml/TNZ%20Service%20Request%20Bill%20Dispute%20XML%20IO'>"
				+ "<soapenv:Header/><soapenv:Body><cus:manageSR_Input><cus:transactionId/><cus:application/><cus:Object_spcId/><tnz:ListOfTnzServiceRequestBillDisputeXMLIO><tnz:ListOfTnzServiceRequestBillDisputeBc><!--Zero or more repetitions:-->"
				+ "<tnz:TnzServiceRequestBillDisputeBc><!--Optional:--><tnz:Id>1234</tnz:Id><!--Optional:--><tnz:AccountNumber>"
				+ CustomerNumber
				+ "</tnz:AccountNumber><!--Optional:--><tnz:INSArea>Bill Explanation</tnz:INSArea><!--Optional:--><tnz:INSProduct>Billing Enquiry</tnz:INSProduct><!--Optional:--><tnz:INSSub-Area>Mobile</tnz:INSSub-Area>"
				+ "<!--Optional:--><tnz:SendTo>amit.vajpeyi@spark.co.nz</tnz:SendTo><!--Optional:--><tnz:SerialNumber/><!--Optional:--><tnz:Source>Online</tnz:Source><!--Optional:--><tnz:Status/><!--Optional:--><tnz:Sub-Status/>"
				+ "<!--Optional:--><tnz:TNZBillingAccountNumber>" + AccountNumber
				+ "</tnz:TNZBillingAccountNumber><!--Optional:--><tnz:TNZComplaintDetails/><!--Optional:--> <tnz:TNZContactName>Raushan</tnz:TNZContactName><!--Optional:--><tnz:TNZContactPhoneNum>+64220349747</tnz:TNZContactPhoneNum>"
				+ "<!--Optional:--><tnz:TNZDescription>abcd</tnz:TNZDescription> <!--Optional:--><tnz:TNZPreferredMethod>Email</tnz:TNZPreferredMethod></tnz:TnzServiceRequestBillDisputeBc></tnz:ListOfTnzServiceRequestBillDisputeBc></tnz:ListOfTnzServiceRequestBillDisputeXMLIO>"
				+ "<cus:timestamp>?</cus:timestamp><cus:user>?</cus:user><cus:Mode>CreateBillDisputeSR</cus:Mode><cus:processContext>?</cus:processContext></cus:manageSR_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(ServiceAvailabilityXML);
		return ServiceAvailabilityXML;
	}

	public String applyCreditExtensionEligibilityXML(String eligibilityID, String CustomerNumber,
			String AccountNumber) {

		String ApplycreditExtensionEligibilityXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus='http://siebel.com/CustomUI' xmlns:tnz='http://www.siebel.com/xml/TNZCustomerCreditExtensionIO'>"
				+ "<soapenv:Header/><soapenv:Body><cus:applyCreditExtension_Input><cus:Process_spcInstance_spcId></cus:Process_spcInstance_spcId><cus:correlationId></cus:correlationId><cus:transactionId>"
				+ "</cus:transactionId><cus:lineOfBusiness></cus:lineOfBusiness><cus:application></cus:application><cus:timeStamp></cus:timeStamp><cus:Object_spcId></cus:Object_spcId><cus:Siebel_spcOperation_spcObject_spcId>"
				+ "</cus:Siebel_spcOperation_spcObject_spcId><tnz:maintainCustomerCreditExtension><tnz:maintainCustomerCE><!--Optional:--><tnz:creditExtension><!--Optional:--><tnz:validToDatewithNoLPF></tnz:validToDatewithNoLPF>"
				+ "<!--Optional:--><tnz:validToDate></tnz:validToDate><!--Optional:--><tnz:reasonCode></tnz:reasonCode><!--Optional:--><tnz:planAmt></tnz:planAmt><!--Optional:--><tnz:eligibilityID>"
				+ eligibilityID
				+ "</tnz:eligibilityID></tnz:creditExtension><!--Optional:--><tnz:customer><!--Optional:--><tnz:customerNumber>"
				+ CustomerNumber
				+ "</tnz:customerNumber></tnz:customer><!--Optional:--><tnz:customerAccount><!--Optional:--><tnz:accountID>"
				+ AccountNumber
				+ "</tnz:accountID></tnz:customerAccount></tnz:maintainCustomerCE></tnz:maintainCustomerCreditExtension><cus:user></cus:user><cus:processContext></cus:processContext><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage></cus:applyCreditExtension_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(ApplycreditExtensionEligibilityXML);
		return ApplycreditExtensionEligibilityXML;
	}

	public String getMaintainCustomerAccountPayment_Credit_DebitXMLForNewTags(String AccountNumber, String StartDate,
			String paymentType, String ID, String lname, String CompanyName, String phonenumber,
			String postionincompany, String email, String fname) {

		String creditDebitOnlinePaymentXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:main='http://siebel.com/MaintainCustomerAccount' xmlns:acc='http://www.siebel.com/xml/AccountPaymentProfileIO'><soapenv:Header><UsernameToken xmlns='http://siebel.com/webservices'>T967991</UsernameToken><PasswordText xmlns='http://siebel.com/webservices'>winter27</PasswordText><SessionType xmlns='http://siebel.com/webservices'>None</SessionType></soapenv:Header><soapenv:Body><main:maintainCustomerAccountPaymentMethod_Input><main:Process_spcInstance_spcId></main:Process_spcInstance_spcId><main:transactionId></main:transactionId><main:lineOfBusiness></main:lineOfBusiness><main:application></main:application><main:timeStamp></main:timeStamp><main:Siebel_spcOperation_spcObject_spcId></main:Siebel_spcOperation_spcObject_spcId><main:user></main:user><acc:ListOfAccountPaymentProfile><acc:CutInvoiceSubAccounts><acc:AccountNumber>"
				+ AccountNumber
				+ "</acc:AccountNumber><acc:ListOfOrganizationPaymentProfile><acc:OrganizationPaymentProfile><acc:Id>"
				+ ID
				+ "</acc:Id><acc:cardNumber>25233446</acc:cardNumber><acc:cardIssuer>AMEX</acc:cardIssuer><acc:cardExpiryMonth>10</acc:cardExpiryMonth><acc:cardExpiryYear>2024</acc:cardExpiryYear><acc:paymentMethodType>Credit/Debit Card</acc:paymentMethodType><acc:paymentType>"
				+ paymentType + "</acc:paymentType><acc:ccToken>123</acc:ccToken><acc:validFromDate>" + StartDate
				+ " 00:00:00</acc:validFromDate><acc:cardHolderName>Rashmimkr</acc:cardHolderName><acc:maxMonthlyAmtLimit></acc:maxMonthlyAmtLimit><acc:paymentEventDay></acc:paymentEventDay><acc:preferenceType>None</acc:preferenceType><acc:paymentStartDate></acc:paymentStartDate><acc:thresholdAmount>$5</acc:thresholdAmount><acc:topUpAmount></acc:topUpAmount><acc:lastName>"
				+ lname + "</acc:lastName><acc:companyName>" + CompanyName
				+ "</acc:companyName><acc:contactPhoneNumber>" + phonenumber
				+ "</acc:contactPhoneNumber><acc:positionInCompany>" + postionincompany
				+ "</acc:positionInCompany><acc:emailAddress>" + email + "</acc:emailAddress><acc:firstName>" + fname
				+ "</acc:firstName></acc:OrganizationPaymentProfile></acc:ListOfOrganizationPaymentProfile></acc:CutInvoiceSubAccounts></acc:ListOfAccountPaymentProfile><main:processContext></main:processContext><main:Error_spcCode></main:Error_spcCode><main:Error_spcMessage></main:Error_spcMessage></main:maintainCustomerAccountPaymentMethod_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(creditDebitOnlinePaymentXML);
		return creditDebitOnlinePaymentXML;

	}

	public String getMaintainCustomerAccountPayment_Credit_DebitXMLwithNoIDForNewTags(String AccountNumber,
			String StartDate, String paymentType, String lname, String CompanyName, String phonenumber,
			String postionincompany, String email, String fname) {

		String creditDebitOnlinePaymentXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:main='http://siebel.com/MaintainCustomerAccount' xmlns:acc='http://www.siebel.com/xml/AccountPaymentProfileIO'><soapenv:Header><UsernameToken xmlns='http://siebel.com/webservices'>T967991</UsernameToken><PasswordText xmlns='http://siebel.com/webservices'>winter27</PasswordText><SessionType xmlns='http://siebel.com/webservices'>None</SessionType></soapenv:Header><soapenv:Body><main:maintainCustomerAccountPaymentMethod_Input><main:Process_spcInstance_spcId></main:Process_spcInstance_spcId><main:transactionId></main:transactionId><main:lineOfBusiness></main:lineOfBusiness><main:application></main:application><main:timeStamp></main:timeStamp><main:Siebel_spcOperation_spcObject_spcId></main:Siebel_spcOperation_spcObject_spcId><main:user></main:user><acc:ListOfAccountPaymentProfile><acc:CutInvoiceSubAccounts><acc:AccountNumber>"
				+ AccountNumber
				+ "</acc:AccountNumber><acc:ListOfOrganizationPaymentProfile><acc:OrganizationPaymentProfile><acc:Id></acc:Id><acc:cardNumber>25233446</acc:cardNumber><acc:cardIssuer>AMEX</acc:cardIssuer><acc:cardExpiryMonth>10</acc:cardExpiryMonth><acc:cardExpiryYear>2024</acc:cardExpiryYear><acc:paymentMethodType>Credit/Debit Card</acc:paymentMethodType><acc:paymentType>"
				+ paymentType + "</acc:paymentType><acc:ccToken>123</acc:ccToken><acc:validFromDate>" + StartDate
				+ " 00:00:00</acc:validFromDate><acc:cardHolderName>Rashmimkr</acc:cardHolderName><acc:maxMonthlyAmtLimit></acc:maxMonthlyAmtLimit><acc:paymentEventDay></acc:paymentEventDay><acc:preferenceType>None</acc:preferenceType><acc:paymentStartDate></acc:paymentStartDate><acc:thresholdAmount>$5</acc:thresholdAmount><acc:topUpAmount></acc:topUpAmount><acc:lastName>"
				+ lname + "</acc:lastName><acc:companyName>" + CompanyName
				+ "</acc:companyName><acc:contactPhoneNumber>" + phonenumber
				+ "</acc:contactPhoneNumber><acc:positionInCompany>" + postionincompany
				+ "</acc:positionInCompany><acc:emailAddress>" + email + "</acc:emailAddress><acc:firstName>" + fname
				+ "</acc:firstName></acc:OrganizationPaymentProfile></acc:ListOfOrganizationPaymentProfile></acc:CutInvoiceSubAccounts></acc:ListOfAccountPaymentProfile><main:processContext></main:processContext><main:Error_spcCode></main:Error_spcCode><main:Error_spcMessage></main:Error_spcMessage></main:maintainCustomerAccountPaymentMethod_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(creditDebitOnlinePaymentXML);
		return creditDebitOnlinePaymentXML;

	}

	public String getMaintainCustomerAccountPayment_Credit_DebitXML(String AccountNumber, String StartDate,
			String paymentType, String ID) {

		String creditDebitOnlinePaymentXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:main='http://siebel.com/MaintainCustomerAccount' xmlns:acc='http://www.siebel.com/xml/AccountPaymentProfileIO'><soapenv:Header><UsernameToken xmlns='http://siebel.com/webservices'>T967991</UsernameToken><PasswordText xmlns='http://siebel.com/webservices'>winter27</PasswordText><SessionType xmlns='http://siebel.com/webservices'>None</SessionType></soapenv:Header><soapenv:Body><main:maintainCustomerAccountPaymentMethod_Input><main:Process_spcInstance_spcId></main:Process_spcInstance_spcId><main:transactionId></main:transactionId><main:lineOfBusiness></main:lineOfBusiness><main:application></main:application><main:timeStamp></main:timeStamp><main:Siebel_spcOperation_spcObject_spcId></main:Siebel_spcOperation_spcObject_spcId><main:user></main:user><acc:ListOfAccountPaymentProfile><acc:CutInvoiceSubAccounts><acc:AccountNumber>"
				+ AccountNumber
				+ "</acc:AccountNumber><acc:ListOfOrganizationPaymentProfile><acc:OrganizationPaymentProfile><acc:Id>"
				+ ID
				+ "</acc:Id><acc:cardNumber>25233446</acc:cardNumber><acc:cardIssuer>AMEX</acc:cardIssuer><acc:cardExpiryMonth>10</acc:cardExpiryMonth><acc:cardExpiryYear>2024</acc:cardExpiryYear><acc:paymentMethodType>Credit/Debit Card</acc:paymentMethodType><acc:paymentType>"
				+ paymentType + "</acc:paymentType><acc:ccToken>123</acc:ccToken><acc:validFromDate>" + StartDate
				+ " 00:00:00</acc:validFromDate><acc:cardHolderName>Rashmimkr</acc:cardHolderName><acc:maxMonthlyAmtLimit></acc:maxMonthlyAmtLimit><acc:paymentEventDay></acc:paymentEventDay><acc:preferenceType>None</acc:preferenceType><acc:paymentStartDate></acc:paymentStartDate><acc:thresholdAmount>$5</acc:thresholdAmount><acc:topUpAmount></acc:topUpAmount></acc:OrganizationPaymentProfile></acc:ListOfOrganizationPaymentProfile></acc:CutInvoiceSubAccounts></acc:ListOfAccountPaymentProfile><main:processContext></main:processContext><main:Error_spcCode></main:Error_spcCode><main:Error_spcMessage></main:Error_spcMessage></main:maintainCustomerAccountPaymentMethod_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(creditDebitOnlinePaymentXML);
		return creditDebitOnlinePaymentXML;

	}

	public String getMaintainCustomerAccountPayment_Credit_DebitXMLwithNoID(String AccountNumber, String StartDate,
			String paymentType) {

		String creditDebitOnlinePaymentXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:main='http://siebel.com/MaintainCustomerAccount' xmlns:acc='http://www.siebel.com/xml/AccountPaymentProfileIO'><soapenv:Header><UsernameToken xmlns='http://siebel.com/webservices'>T967991</UsernameToken><PasswordText xmlns='http://siebel.com/webservices'>winter27</PasswordText><SessionType xmlns='http://siebel.com/webservices'>None</SessionType></soapenv:Header><soapenv:Body><main:maintainCustomerAccountPaymentMethod_Input><main:Process_spcInstance_spcId></main:Process_spcInstance_spcId><main:transactionId></main:transactionId><main:lineOfBusiness></main:lineOfBusiness><main:application></main:application><main:timeStamp></main:timeStamp><main:Siebel_spcOperation_spcObject_spcId></main:Siebel_spcOperation_spcObject_spcId><main:user></main:user><acc:ListOfAccountPaymentProfile><acc:CutInvoiceSubAccounts><acc:AccountNumber>"
				+ AccountNumber
				+ "</acc:AccountNumber><acc:ListOfOrganizationPaymentProfile><acc:OrganizationPaymentProfile><acc:Id></acc:Id><acc:cardNumber>25233446</acc:cardNumber><acc:cardIssuer>AMEX</acc:cardIssuer><acc:cardExpiryMonth>10</acc:cardExpiryMonth><acc:cardExpiryYear>2024</acc:cardExpiryYear><acc:paymentMethodType>Credit/Debit Card</acc:paymentMethodType><acc:paymentType>"
				+ paymentType + "</acc:paymentType><acc:ccToken>123</acc:ccToken><acc:validFromDate>" + StartDate
				+ " 00:00:00</acc:validFromDate><acc:cardHolderName>Rashmimkr</acc:cardHolderName><acc:maxMonthlyAmtLimit></acc:maxMonthlyAmtLimit><acc:paymentEventDay></acc:paymentEventDay><acc:preferenceType>None</acc:preferenceType><acc:paymentStartDate></acc:paymentStartDate><acc:thresholdAmount>$5</acc:thresholdAmount><acc:topUpAmount></acc:topUpAmount></acc:OrganizationPaymentProfile></acc:ListOfOrganizationPaymentProfile></acc:CutInvoiceSubAccounts></acc:ListOfAccountPaymentProfile><main:processContext></main:processContext><main:Error_spcCode></main:Error_spcCode><main:Error_spcMessage></main:Error_spcMessage></main:maintainCustomerAccountPaymentMethod_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(creditDebitOnlinePaymentXML);
		return creditDebitOnlinePaymentXML;

	}

	public String getQueryCustomerPaymentMethodXML(String AccountNumber) {
		String queryCustomerPaymentMethodXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:main='http://siebel.com/MaintainCustomerAccount'><soapenv:Header><UsernameToken xmlns='http://siebel.com/webservices'>T967991</UsernameToken><PasswordText xmlns='http://siebel.com/webservices'>winter27</PasswordText><SessionType xmlns='http://siebel.com/webservices'>None</SessionType></soapenv:Header><soapenv:Body><main:queryCustomerPaymentMethod_Input><main:Process_spcInstance_spcId></main:Process_spcInstance_spcId><main:AccountNumber>"
				+ AccountNumber
				+ "</main:AccountNumber><main:mode></main:mode><main:transactionId></main:transactionId><main:lineOfBusiness></main:lineOfBusiness><main:application></main:application><main:Object_spcId></main:Object_spcId><main:Siebel_spcOperation_spcObject_spcId></main:Siebel_spcOperation_spcObject_spcId><main:timestamp></main:timestamp><main:user></main:user><main:processContext></main:processContext><main:Error_spcCode></main:Error_spcCode><main:Error_spcMessage></main:Error_spcMessage></main:queryCustomerPaymentMethod_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(queryCustomerPaymentMethodXML);
		return queryCustomerPaymentMethodXML;
	}

	/*
	 * Author: Ankita Banerjee; Description: For triggering
	 * queryOrderHierarchyWF
	 */
	public String getQueryOrderHierarchy(String OrderNumber, String LOB) {
		String queryOrderHierarchyXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus="
				+ "'http://siebel.com/CustomUI' xmlns:tnz='http://www.siebel.com/xml/TNZQueryOrderReqIO'><soapenv:Header/>"
				+ "<soapenv:Body><cus:queryOrderHierarchy_Input><tnz:Order><tnz:orderStatus></tnz:orderStatus><tnz:OrderNumber>"
				+ OrderNumber
				+ "</tnz:OrderNumber></tnz:Order><cus:LastPage></cus:LastPage><cus:transactionId></cus:transactionId>"
				+ "<cus:lineOfBusiness>" + LOB
				+ "</cus:lineOfBusiness><cus:application></cus:application><cus:NewQuery>true"
				+ "</cus:NewQuery><cus:queryMode>Detail</cus:queryMode><cus:PageSize>100</cus:PageSize><cus:timestamp>"
				+ "</cus:timestamp><cus:user></cus:user><cus:processContext></cus:processContext><cus:StartRowNum>"
				+ "</cus:StartRowNum><cus:Error_spcCode></cus:Error_spcCode><cus:Error_spcMessage></cus:Error_spcMessage>"
				+ "</cus:queryOrderHierarchy_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(queryOrderHierarchyXML);
		return queryOrderHierarchyXML;
	}

	/*
	 * Author: Ankita Banerjee; Description: For triggering
	 * getQueryOrderByServiceId
	 */
	public String getQueryOrderByServiceId(String Serviceid, String CustomerNumber, String AccountNumber) {
		String queryOrderByServiceIdXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' "
				+ "xmlns:cus='http://siebel.com/CustomUI' xmlns:quer='http://www.siebel.com/xml/queryOrderbyServiceIdReqeustIO'>"
				+ "<soapenv:Header/><soapenv:Body><cus:queryOrderByServiceId_Input><quer:Order><!--Optional:-->"
				+ "<quer:customerNumber>" + CustomerNumber
				+ "</quer:customerNumber><!--Optional:--><quer:billingAccountNumber>" + AccountNumber
				+ "</quer:billingAccountNumber><!--Optional:--></quer:Order><cus:externalordernumber>"
				+ "</cus:externalordernumber><cus:LastPage></cus:LastPage><cus:serviceID>" + Serviceid
				+ "</cus:serviceID><cus:transactionId></cus:transactionId><cus:lineOfBusiness>Spark Digital"
				+ "</cus:lineOfBusiness><cus:application></cus:application><cus:NewQuery>true</cus:NewQuery><cus:PageSize>"
				+ "30</cus:PageSize><cus:timestamp>2017-12-19T06:49:36.000Z</cus:timestamp><cus:endDate></cus:endDate>"
				+ "<cus:user></cus:user><cus:startDate></cus:startDate><cus:processContext></cus:processContext>"
				+ "<cus:StartRowNum>0</cus:StartRowNum><cus:Error_spcCode></cus:Error_spcCode><cus:orderAim></cus:orderAim><cus:Error_spcMessage>"
				+ "</cus:Error_spcMessage></cus:queryOrderByServiceId_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(queryOrderByServiceIdXML);
		return queryOrderByServiceIdXML;
	}

	/*
	 * public String getMobileXML(HashMap<String, List<String>> row_id) {
	 * System.out.println(row_id); String NOXML =
	 * "<notifyServiceOrderV2Request><messageHeader><user>T966860</user><transactionId>SBL_1-M3ZJVVX</transactionId><timestamp>2017-02-26T23:51:30Z</timestamp><processContext>BPM8-22008</processContext><lineOfBusiness>Spark Digital</lineOfBusiness><application>OrderManager</application></messageHeader><Order><mode>GENERAL</mode><Exception><description/><code/></Exception><orderReceivedDateTime>2017-02-26T23:45:43.000Z</orderReceivedDateTime>"
	 * + "<orderNum>" + row_id.get("ORDER_NUM").get(0) + "</orderNum>" +
	 * "<orderID>" + row_id.get("ORDER_ID").get(0) + "</orderID>" + "<orderAim>"
	 * + row_id.get("ORDER_AIM").get(0) +
	 * "</orderAim><omOrderID>7401186021</omOrderID><Status>Complete</Status>";
	 * 
	 * for (int j2 = 0; j2 < row_id.get("PRFLAG").size(); j2++) { if
	 * (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y") &&
	 * !row_id.get("ACTION").get(j2).equalsIgnoreCase("-") &&
	 * row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("N")) {
	 * System.out.println("PRFLAG : " + row_id.get("NAME").get(j2));
	 * 
	 * if (row_id.get("NAME").get(j2).equals("BS3 Fibre Access") ||
	 * row_id.get("NAME").get(j2).equals("WAN Service Offer") ||
	 * row_id.get("NAME").get(j2).equals("Managed VPN Configuration")) { NOXML =
	 * NOXML +
	 * "<OrderItem><lastUpdatedDateTime>2017-02-26T23:51:30.918Z</lastUpdatedDateTime><status>Complete</status><rootproductID>"
	 * + row_id.get("ROOTPRODUCT_ID").get(j2) +
	 * "</rootproductID><provisionPONRflag>Y</provisionPONRflag><prodSpecID>bs3FibreAccessAPS</prodSpecID><prodInstantID>"
	 * + row_id.get("ASSET_ID").get(j2) + "</prodInstantID><parentproductID>" +
	 * row_id.get("PARENTPRODUCT_ID").get(j2) +
	 * "</parentproductID><originalPlannedCompletionDate>2017-02-27T11:00:00.000Z</originalPlannedCompletionDate><itemId>"
	 * + row_id.get("ROW_ID").get(j2) +
	 * "</itemId><currentPlannedCompletionDate>2017-02-27T11:00:00.000Z</currentPlannedCompletionDate><shippingPONRflag>N</shippingPONRflag><chargeAggregationID>"
	 * + getRandomNumber() +
	 * "</chargeAggregationID><serviceActivationDate>2017-05-10T06:36:33.000Z</serviceActivationDate></OrderItem>";
	 * } else { NOXML = NOXML +
	 * "<OrderItem><lastUpdatedDateTime>2017-02-26T23:51:30.918Z</lastUpdatedDateTime><status>Complete</status><rootproductID>"
	 * + row_id.get("ROOTPRODUCT_ID").get(j2) +
	 * "</rootproductID><provisionPONRflag>Y</provisionPONRflag><prodSpecID>bs3FibreAccessAPS</prodSpecID><prodInstantID>"
	 * + row_id.get("ASSET_ID").get(j2) + "</prodInstantID><parentproductID>" +
	 * row_id.get("PARENTPRODUCT_ID").get(j2) +
	 * "</parentproductID><originalPlannedCompletionDate>2017-02-27T11:00:00.000Z</originalPlannedCompletionDate><itemId>"
	 * + row_id.get("ROW_ID").get(j2) +
	 * "</itemId><currentPlannedCompletionDate>2017-02-27T11:00:00.000Z</currentPlannedCompletionDate><shippingPONRflag>N</shippingPONRflag><serviceActivationDate>2017-05-10T06:36:33.000Z</serviceActivationDate></OrderItem>";
	 * } } }
	 * 
	 * NOXML = NOXML + "</Order></notifyServiceOrderV2Request>";
	 * System.out.println("New Offer xml : " + NOXML); return NOXML; }
	 */

	public String getMobileXML(HashMap<String, List<String>> row_id) {

		System.out.println(row_id);
		String NOXML = "<?xml version='1.0' encoding='UTF-8'?><re:notifyServiceOrderV2Request xmlns:re='http://www.siebel.com/xml/notifyServiceOrderV2Request_2'><re:messageHeader><re:transactionId>1-8W3MH2</re:transactionId><re:timestamp>2015-06-05T23:06:41Z</re:timestamp><re:processContext>BPM8-22127</re:processContext><re:lineOfBusiness/><re:application>T-OM</re:application></re:messageHeader><re:Order><re:mode>GENERAL</re:mode><re:orderReceivedDateTime>2016-22-04T02:23:06.000Z</re:orderReceivedDateTime>"
				+ "<re:orderNum>" + row_id.get("ORDER_NUM").get(0) + "</re:orderNum>" + "<re:orderID>"
				+ row_id.get("ORDER_ID").get(0) + "</re:orderID>" + "<re:orderAim>" + row_id.get("ORDER_AIM").get(0)
				+ "</re:orderAim><re:omOrderID>2748640607</re:omOrderID><re:Status>Complete</re:Status>";

		for (int j2 = 0; j2 < row_id.get("PRFLAG").size(); j2++) {
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("N")) {
				System.out.println("PRFLAG : " + row_id.get("NAME").get(j2));
				NOXML = NOXML + "<re:OrderItem><re:status>Complete</re:status><re:rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</re:rootproductID><re:provisionPONRflag>Y</re:provisionPONRflag><re:prodSpecID>mobileservicespecAPS</re:prodSpecID><re:prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2)
						+ "</re:prodInstantID><re:phase>Provisioning</re:phase><re:parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2)
						+ "</re:parentproductID><re:milestone>Submitted To OM</re:milestone><re:itemId>"
						+ row_id.get("ROW_ID").get(j2) + "</re:itemId></re:OrderItem>";
				// System.out.println(row_id.get("PRFLAG").get(j2));
				// NOXML = NOXML + System.lineSeparator();
			}

			if (row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("Y")
					&& row_id.get("PRFLAG").get(j2).equalsIgnoreCase("N")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")) {
				System.out.println("SHIPFLAG : " + row_id.get("NAME").get(j2));
				NOXML = NOXML + "<re:OrderItem><re:status>Complete</re:status><re:rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</re:rootproductID><re:prodSpecID>mobileservicespecAPS</re:prodSpecID><re:prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2)
						+ "</re:prodInstantID><re:phase>Provisioning</re:phase><re:parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2)
						+ "</re:parentproductID><re:milestone>Submitted To OM</re:milestone><re:itemId>"
						+ row_id.get("ROW_ID").get(j2)
						+ "</re:itemId><re:shippingPONRflag>Y</re:shippingPONRflag></re:OrderItem>";
				// NOXML = NOXML + System.lineSeparator();
			}
			if (row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("Y")
					&& row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")) {
				System.out.println("SHIPFLAG & PRFLAG : " + row_id.get("NAME").get(j2));
				NOXML = NOXML + "<re:OrderItem><re:status>Complete</re:status><re:rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</re:rootproductID><re:prodSpecID>mobileservicespecAPS</re:prodSpecID><re:prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2)
						+ "</re:prodInstantID><re:phase>Provisioning</re:phase><re:parentproductID>"
						+ "</re:parentproductID><re:milestone>Submitted To OM</re:milestone><re:itemId>"
						+ row_id.get("ROW_ID").get(j2)
						+ "</re:itemId><re:shippingPONRflag>Y</re:shippingPONRflag></re:OrderItem>";
				// NOXML = NOXML + System.lineSeparator();
			}
		}
		NOXML = NOXML + "</re:Order></re:notifyServiceOrderV2Request>";
		System.out.println("New Offer xml : " + NOXML);
		return NOXML;
	}

	public String getMobileOrderCancelXML(HashMap<String, List<String>> row_id) {

		System.out.println(row_id);
		String NOXML = "<?xml version='1.0' encoding='UTF-8'?><re:notifyServiceOrderV2Request xmlns:re='http://www.siebel.com/xml/notifyServiceOrderV2Request_2'><re:messageHeader><re:transactionId>1-8W3MH2</re:transactionId><re:timestamp>2015-06-05T23:06:41Z</re:timestamp><re:processContext>BPM8-22127</re:processContext><re:lineOfBusiness/><re:application>T-OM</re:application></re:messageHeader><re:Order><re:mode>GENERAL</re:mode><re:orderReceivedDateTime>2016-22-04T02:23:06.000Z</re:orderReceivedDateTime>"
				+ "<re:orderNum>" + row_id.get("ORDER_NUM").get(0) + "</re:orderNum>" + "<re:orderID>"
				+ row_id.get("ORDER_ID").get(0) + "</re:orderID>" + "<re:orderAim>" + row_id.get("ORDER_AIM").get(0)
				+ "</re:orderAim><re:omOrderID>2748640607</re:omOrderID><re:Status>Cancelled</re:Status>";

		for (int j2 = 0; j2 < row_id.get("PRFLAG").size(); j2++) {
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("N")) {
				System.out.println("PRFLAG : " + row_id.get("NAME").get(j2));
				NOXML = NOXML + "<re:OrderItem><re:status>Cancelled</re:status><re:rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</re:rootproductID><re:provisionPONRflag>Y</re:provisionPONRflag><re:prodSpecID>mobileservicespecAPS</re:prodSpecID><re:prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2)
						+ "</re:prodInstantID><re:phase>Provisioning</re:phase><re:parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2)
						+ "</re:parentproductID><re:milestone>Submitted To OM</re:milestone><re:itemId>"
						+ row_id.get("ROW_ID").get(j2) + "</re:itemId></re:OrderItem>";
				// System.out.println(row_id.get("PRFLAG").get(j2));
				// NOXML = NOXML + System.lineSeparator();
			}

			if (row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("Y")
					&& row_id.get("PRFLAG").get(j2).equalsIgnoreCase("N")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")) {
				System.out.println("SHIPFLAG : " + row_id.get("NAME").get(j2));
				NOXML = NOXML + "<re:OrderItem><re:status>Cancelled</re:status><re:rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</re:rootproductID><re:prodSpecID>mobileservicespecAPS</re:prodSpecID><re:prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2)
						+ "</re:prodInstantID><re:phase>Provisioning</re:phase><re:parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2)
						+ "</re:parentproductID><re:milestone>Submitted To OM</re:milestone><re:itemId>"
						+ row_id.get("ROW_ID").get(j2)
						+ "</re:itemId><re:shippingPONRflag>Y</re:shippingPONRflag></re:OrderItem>";
				// NOXML = NOXML + System.lineSeparator();
			}
			if (row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("Y")
					&& row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")) {
				System.out.println("SHIPFLAG & PRFLAG : " + row_id.get("NAME").get(j2));
				NOXML = NOXML + "<re:OrderItem><re:status>Cancelled</re:status><re:rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</re:rootproductID><re:prodSpecID>mobileservicespecAPS</re:prodSpecID><re:prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2)
						+ "</re:prodInstantID><re:phase>Provisioning</re:phase><re:parentproductID>"
						+ "</re:parentproductID><re:milestone>Submitted To OM</re:milestone><re:itemId>"
						+ row_id.get("ROW_ID").get(j2)
						+ "</re:itemId><re:shippingPONRflag>Y</re:shippingPONRflag></re:OrderItem>";
				// NOXML = NOXML + System.lineSeparator();
			}
		}
		NOXML = NOXML + "</re:Order></re:notifyServiceOrderV2Request>";
		System.out.println("New Offer xml : " + NOXML);
		return NOXML;
	}

	public String getFibreXML(HashMap<String, List<String>> row_id) {
		System.out.println(row_id);
		String FibreXML = "<not:notifyServiceOrderV2Request xmlns:not='http://www.siebel.com/xml/notifyServiceOrderV2Request_2'><not:messageHeader><!--Optional:--><not:user/><!--Optional:--><not:transactionId/><!--Optional:--><timestamp>2016-09-12T11:36:42.000Z</timestamp><!--Optional:--><not:processContext/><!--Optional:--><not:lineOfBusiness/><!--Optional:--><not:messageId/><!--Optional:--><not:application/></not:messageHeader><not:Order><!--Optional:--><not:mode>GENERAL</not:mode><!--Optional:--><not:Jeopardy><!--Optional:--><not:status/><!--Optional:--><not:jeopardyID/><!--Optional:--><not:description/><!--Optional:--><not:createdDate/><!--Optional:--><not:code/><!--Optional:--><not:closedDate/></not:Jeopardy><!--Optional:--><not:Exception><!--Optional:--><not:description/><!--Optional:--><not:code>?</not:code></not:Exception><!--Optional:--><not:orderReceivedDateTime>2016-04-29T09:55:12.000Z</not:orderReceivedDateTime><!--Optional:-->"
				+ "<not:orderNum>" + row_id.get("ORDER_NUM").get(0) + "</not:orderNum>" + "<not:orderID>"
				+ row_id.get("ORDER_ID").get(0) + "</not:orderID>" + "<not:orderAim>" + row_id.get("ORDER_AIM").get(0)
				+ "</not:orderAim>"
				+ "<not:omOrderID>2222</not:omOrderID><!--Optional:--><not:Status>Complete</not:Status><!--Zero or more repetitions:-->";
		for (int j2 = 0; j2 < row_id.get("PRFLAG").size(); j2++) {
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("N")) {
				System.out.println("PRFLAG : " + row_id.get("NAME").get(j2));
				FibreXML = FibreXML
						+ "<not:OrderItem><!--Optional:--><not:lastUpdatedDateTime>2016-04-29T09:55:12.000Z</not:lastUpdatedDateTime><!--Optional:--><not:status>Complete</not:status><!--Optional:--><not:shippableFlg>Y</not:shippableFlg><!--Optional:--><not:serviceActivationDate/><!--Optional:--><not:sequence/><!--Optional:--><not:rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</not:rootproductID><!--Optional:--><not:provisionableFlg>Y</not:provisionableFlg><!--Optional:--><not:provisionPONRflag/><!--Optional:--><not:prodSpecID/><!--Optional:--><not:prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2)
						+ "</not:prodInstantID><!--Optional:--><not:phase>Phase</not:phase><!--Optional:--><not:parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2)
						+ "</not:parentproductID><!--Optional:--><not:originalPlannedCompletionDate/><!--Optional:--><not:milestone>Milestone</not:milestone><!--Optional:--><not:itemId>"
						+ row_id.get("ROW_ID").get(j2)
						+ "</not:itemId><!--Optional:--><not:description/><!--Optional:--><not:customerNum/><!--Optional:--><not:currentPlannedCompletionDate/><!--Optional:--><!--Optional:--><not:billableFlg/><!--Optional:--><not:action/><!--Optional:--><not:accountID/><!--Optional:--><not:shippingPONRflag/><!--Optional:--><not:productSpecType/><not:LineItemsXA><not:value>492700</not:value><not:name>serviceGuidingId</not:name></not:LineItemsXA></not:OrderItem>";
				// System.out.println(row_id.get("PRFLAG").get(j2));
				// FibreXML = FibreXML + System.lineSeparator();
			}
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("N")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("Y")) {
				System.out.println("SHIPFLAG : " + row_id.get("NAME").get(j2));
				FibreXML = FibreXML
						+ "<not:OrderItem><!--Optional:--><not:lastUpdatedDateTime>2016-04-29T09:55:12.000Z</not:lastUpdatedDateTime><!--Optional:--><not:status>Complete</not:status><!--Optional:--><not:shippableFlg>Y</not:shippableFlg><!--Optional:--><not:serviceActivationDate/><!--Optional:--><not:sequence/><!--Optional:--><not:rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</not:rootproductID><!--Optional:--><not:provisionableFlg>Y</not:provisionableFlg><!--Optional:--><not:provisionPONRflag/><!--Optional:--><not:prodSpecID/><!--Optional:--><not:prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2)
						+ "</not:prodInstantID><!--Optional:--><not:phase>Phase</not:phase><!--Optional:--><not:parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2)
						+ "</not:parentproductID><!--Optional:--><not:originalPlannedCompletionDate/><!--Optional:--><not:milestone>Milestone</not:milestone><!--Optional:--><not:itemId>"
						+ row_id.get("ROW_ID").get(j2)
						+ "</not:itemId><!--Optional:--><not:description/><!--Optional:--><not:customerNum/><!--Optional:--><not:currentPlannedCompletionDate/><!--Optional:--><!--Optional:--><not:billableFlg/><!--Optional:--><not:action/><!--Optional:--><not:accountID/><!--Optional:--><not:shippingPONRflag/><!--Optional:--><not:productSpecType/><not:LineItemsXA><not:value>492700</not:value><not:name>serviceGuidingId</not:name></not:LineItemsXA></not:OrderItem>";
				// System.out.println(row_id.get("PRFLAG").get(j2));
				// FibreXML = FibreXML + System.lineSeparator();
			}
		}
		FibreXML = FibreXML
				+ "<not:Notes><!--Optional:--><not:questionID>asdas</not:questionID><!--Optional:--><not:providerId>5454</not:providerId><!--Optional:--><not:noteType>Permanent</not:noteType><!--Optional:--><not:messageID>5543</not:messageID><!--Optional:--><not:message>dfgdf</not:message><!--Optional:--><not:expiryDate/><!--Optional:--><not:expirationAction/></not:Notes><!--Optional:--></not:Order></not:notifyServiceOrderV2Request>";
		System.out.println("Fibre New Connect VOF xml : " + FibreXML);
		return FibreXML;

	}

	public String getWholesaleXML(HashMap<String, List<String>> row_id) {
		System.out.println(row_id);
		String NOXML = "<?xml version='1.0' encoding='UTF-8'?><re:notifyServiceOrderV2Request xmlns:re='http://www.siebel.com/xml/notifyServiceOrderV2Request_2'><re:messageHeader><re:transactionId>1-8W3MH2</re:transactionId><re:timestamp>2015-06-05T23:06:41Z</re:timestamp><re:processContext>BPM8-22127</re:processContext><re:lineOfBusiness/><re:application>T-OM</re:application></re:messageHeader><re:Order><re:mode>GENERAL</re:mode><re:orderReceivedDateTime>2016-22-04T02:23:06.000Z</re:orderReceivedDateTime>"
				+ "<re:orderNum>" + row_id.get("ORDER_NUM").get(0) + "</re:orderNum>" + "<re:orderID>"
				+ row_id.get("ORDER_ID").get(0) + "</re:orderID>" + "<re:orderAim>" + row_id.get("ORDER_AIM").get(0)
				+ "</re:orderAim><re:omOrderID>2748640607</re:omOrderID><re:Status>Complete</re:Status>";

		for (int j2 = 0; j2 < row_id.get("PRFLAG").size(); j2++) {
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("N")) {
				System.out.println("PRFLAG : " + row_id.get("NAME").get(j2));
				NOXML = NOXML + "<re:OrderItem><re:status>Complete</re:status><re:rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</re:rootproductID><re:provisionPONRflag>Y</re:provisionPONRflag><re:prodSpecID>mobileservicespecAPS</re:prodSpecID><re:prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2)
						+ "</re:prodInstantID><re:phase>Provisioning</re:phase><re:parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2)
						+ "</re:parentproductID><re:milestone>Submitted To OM</re:milestone><re:itemId>"
						+ row_id.get("ROW_ID").get(j2) + "</re:itemId></re:OrderItem>";
				// System.out.println(row_id.get("PRFLAG").get(j2));
				// NOXML = NOXML + System.lineSeparator();
			}

			if (row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("Y")
					&& row_id.get("PRFLAG").get(j2).equalsIgnoreCase("N")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")) {
				System.out.println("SHIPFLAG : " + row_id.get("NAME").get(j2));
				NOXML = NOXML + "<re:OrderItem><re:status>Complete</re:status><re:rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</re:rootproductID><re:prodSpecID>mobileservicespecAPS</re:prodSpecID><re:prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2)
						+ "</re:prodInstantID><re:phase>Provisioning</re:phase><re:parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2)
						+ "</re:parentproductID><re:milestone>Submitted To OM</re:milestone><re:itemId>"
						+ row_id.get("ROW_ID").get(j2)
						+ "<re:shippingPONRflag>Y</re:shippingPONRflag></re:itemId></re:OrderItem>";
				// NOXML = NOXML + System.lineSeparator();
			}
			if (row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("Y")
					&& row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")) {
				System.out.println("SHIPFLAG & PRFLAG : " + row_id.get("NAME").get(j2));
				NOXML = NOXML + "<re:OrderItem><re:status>Complete</re:status><re:rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</re:rootproductID><re:prodSpecID>mobileservicespecAPS</re:prodSpecID><re:prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2)
						+ "</re:prodInstantID><re:phase>Provisioning</re:phase><re:parentproductID>"
						+ "</re:parentproductID><re:milestone>Submitted To OM</re:milestone><re:itemId>"
						+ row_id.get("ROW_ID").get(j2)
						+ "<re:shippingPONRflag>Y</re:shippingPONRflag></re:itemId></re:OrderItem>";
				// NOXML = NOXML + System.lineSeparator();
			}
		}
		NOXML = NOXML + "</re:Order></re:notifyServiceOrderV2Request>";
		System.out.println("New Offer xml : " + NOXML);
		return NOXML;
	}

	public String getLFCFibreXML(HashMap<String, List<String>> row_id) {
		System.out.println(row_id);
		String FibreXML = "<not:notifyServiceOrderV2Request xmlns:not='http://www.siebel.com/xml/notifyServiceOrderV2Request_2'><not:messageHeader><!--Optional:--><not:user/><!--Optional:--><not:transactionId/><!--Optional:--><timestamp>2016-09-12T11:36:42.000Z</timestamp><!--Optional:--><not:processContext/><!--Optional:--><not:lineOfBusiness/><!--Optional:--><not:messageId/><!--Optional:--><not:application/></not:messageHeader><not:Order><!--Optional:--><not:mode>GENERAL</not:mode><!--Optional:--><not:Jeopardy><!--Optional:--><not:status/><!--Optional:--><not:jeopardyID/><!--Optional:--><not:description/><!--Optional:--><not:createdDate/><!--Optional:--><not:code/><!--Optional:--><not:closedDate/></not:Jeopardy><!--Optional:--><not:Exception><!--Optional:--><not:description/><!--Optional:--><not:code>?</not:code></not:Exception><!--Optional:--><not:orderReceivedDateTime>2016-04-29T09:55:12.000Z</not:orderReceivedDateTime><!--Optional:-->"
				+ "<not:orderNum>OrderNumber</not:orderNum>" + "<not:orderID>OrderRowId</not:orderID>"
				+ "<not:orderAim>NewOfferOrderType</not:orderAim>"
				+ "<not:omOrderID>2222</not:omOrderID><!--Optional:--><not:Status>Complete</not:Status><!--Zero or more repetitions:-->";

		for (int j2 = 0; j2 < row_id.get("PRFLAG").size(); j2++) {
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("N")) {
				System.out.println("PRFLAG : " + row_id.get("NAME").get(j2));
				FibreXML = FibreXML
						+ "<not:OrderItem><!--Optional:--><not:lastUpdatedDateTime>2016-04-29T09:55:12.000Z</not:lastUpdatedDateTime><!--Optional:--><not:status>Complete</not:status><!--Optional:--><not:shippableFlg>Y</not:shippableFlg><!--Optional:--><not:serviceActivationDate/><!--Optional:--><not:sequence/><!--Optional:--><not:rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</not:rootproductID><!--Optional:--><not:provisionableFlg>Y</not:provisionableFlg><!--Optional:--><not:provisionPONRflag/><!--Optional:--><not:prodSpecID/><!--Optional:--><not:prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2)
						+ "</not:prodInstantID><!--Optional:--><not:phase>Supplier Processing</not:phase><!--Optional:--><not:parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2)
						+ "</not:parentproductID><!--Optional:--><not:originalPlannedCompletionDate/><!--Optional:--><not:milestone>Install Scheduled</not:milestone><!--Optional:--><not:itemId>"
						+ row_id.get("ROW_ID").get(j2)
						+ "</not:itemId><!--Optional:--><not:description/><!--Optional:--><not:customerNum/><!--Optional:--><not:currentPlannedCompletionDate/><!--Optional:--><!--Optional:--><not:billableFlg/><!--Optional:--><not:action/><!--Optional:--><not:accountID/><!--Optional:--><not:shippingPONRflag/><!--Optional:--><not:productSpecType/><not:LineItemsXA><not:value>492700</not:value><not:name>serviceGuidingId</not:name></not:LineItemsXA></not:OrderItem>";
				// System.out.println(row_id.get("PRFLAG").get(j2));
				// FibreXML = FibreXML + System.lineSeparator();
			}
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("N")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("Y")) {
				System.out.println("SHIPFLAG : " + row_id.get("NAME").get(j2));
				FibreXML = FibreXML
						+ "<not:OrderItem><!--Optional:--><not:lastUpdatedDateTime>2016-04-29T09:55:12.000Z</not:lastUpdatedDateTime><!--Optional:--><not:status>Complete</not:status><!--Optional:--><not:shippableFlg>Y</not:shippableFlg><!--Optional:--><not:serviceActivationDate/><!--Optional:--><not:sequence/><!--Optional:--><not:rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</not:rootproductID><!--Optional:--><not:provisionableFlg>Y</not:provisionableFlg><!--Optional:--><not:provisionPONRflag/><!--Optional:--><not:prodSpecID/><!--Optional:--><not:prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2)
						+ "</not:prodInstantID><!--Optional:--><not:phase>Supplier Processing</not:phase><!--Optional:--><not:parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2)
						+ "</not:parentproductID><!--Optional:--><not:originalPlannedCompletionDate/><!--Optional:--><not:milestone>Install Scheduled</not:milestone><!--Optional:--><not:itemId>"
						+ row_id.get("ROW_ID").get(j2)
						+ "</not:itemId><!--Optional:--><not:description/><!--Optional:--><not:customerNum/><!--Optional:--><not:currentPlannedCompletionDate/><!--Optional:--><!--Optional:--><not:billableFlg/><!--Optional:--><not:action/><!--Optional:--><not:accountID/><!--Optional:--><not:shippingPONRflag/><!--Optional:--><not:productSpecType/><not:LineItemsXA><not:value>492700</not:value><not:name>serviceGuidingId</not:name></not:LineItemsXA></not:OrderItem>";
				// System.out.println(row_id.get("PRFLAG").get(j2));
				// FibreXML = FibreXML + System.lineSeparator();
			}
		}
		FibreXML = FibreXML
				+ "<not:Notes><!--Optional:--><not:questionID>asdas</not:questionID><!--Optional:--><not:providerId>5454</not:providerId><!--Optional:--><not:noteType>Permanent</not:noteType><!--Optional:--><not:messageID>5543</not:messageID><!--Optional:--><not:message>dfgdf</not:message><!--Optional:--><not:expiryDate/><!--Optional:--><not:expirationAction/></not:Notes><!--Optional:--></not:Order></not:notifyServiceOrderV2Request>";
		System.out.println("LFC Fibre xml : :" + FibreXML);
		return FibreXML;

	}

	public String getOnlineXML(String CustomerNumber, String AccountNumber, String Date) {
		String ONLINEXML = "<SubmitCustomerOrderRequest><CustomerOrderMessage><messageHeader><transactionId>QiokAil5ufeJ8md5B2mBCoUaLao6Su</transactionId><timestamp>2016-06-08T07:15:36.000Z</timestamp><application>ONLINE</application><user>Hybris</user><processContext>BPM8-22106</processContext><lineOfBusiness>Spark</lineOfBusiness></messageHeader><ListOfOrder><Order><submitOrderFlag>Y</submitOrderFlag><serviceOrderId/><salesChannelName>TNZOnlineStore</salesChannelName><contactPreferredMethod>Email</contactPreferredMethod><customerRequestedDate>"
				+ Date + "T12:00:00.000Z"
				+ "</customerRequestedDate><orderDate>2016-12-6</orderDate><orderContext>New Offer</orderContext><orderAim>New Offer</orderAim><externalOrderNumber>ONL0000007477</externalOrderNumber><customerNumber>"
				+ CustomerNumber
				+ "</customerNumber><contactMobilePhone>020234324343</contactMobilePhone><contactLastName>KOSHE2</contactLastName><contactFirstName>JUHI2</contactFirstName><contactEmailAddress>harsha.kardile@spark.co.nz</contactEmailAddress><billingAccountNumber>"
				+ AccountNumber
				+ "</billingAccountNumber><billingReferenceID/><ListOfPayments><Payments><paymentStatus>Processed</paymentStatus><paymentMethod>Credit/Debit Card</paymentMethod><paymentAmount>29.0</paymentAmount><orderNumber>ONL0000007477</orderNumber><creditCardNumber>cc owner</creditCardNumber><authorizationDate>2016-06-08</authorizationDate><authorizationCode>91170427</authorizationCode></Payments></ListOfPayments><ListOfLocation><Location><nztmY>5893812.793</nztmY><nztmX>1772663.78</nztmX><verifiedstatus>Verified</verifiedstatus><terrAuthName>AUCKLAND</terrAuthName><tui>1002487370</tui><streetType>ROAD</streetType><streetNrLast>2</streetNrLast><streetNrFirst>2</streetNrFirst><streetName>GATLAND</streetName><samid/><region>AUCKLAND REGION</region><recipientName>JUHI2 KOSHE2</recipientName><postCode>2113</postCode><longitude>174.9426541</longitude><locality>OPAHEKE</locality><latitude>-37.0860812</latitude><elid>301949377</elid><dpid>1453649</dpid><townOrCity>Papakura</townOrCity><addressType>Street</addressType><role>Shipping</role><addressLine4>Papakura 2113</addressLine4><addressLine1>2 Gatland Road</addressLine1><locationId>SHP_WuZi4s6fkpR</locationId><recipientCompanyName/><recipientEMailID/><recipientContactNumber/></Location></ListOfLocation><ListOfOrderItem><OrderItem><amountPaid>0.0</amountPaid><shipToAddressId>SHP_WuZi4s6fkpR</shipToAddressId><serviceAddressId/><rootOrderItemId>ONL0000007477-OI-1-4</rootOrderItemId><productPartNum>SIMTrioSPO</productPartNum><parentOrderItemId>ONL0000007477-OI-1-3</parentOrderItemId><itemId>ONL0000007477-OI-1-1</itemId><customerRequestedDate>"
				+ Date + "T12:00:00.000Z</customerRequestedDate><customerNumber>" + CustomerNumber
				+ "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000007477-OI-1-1</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><amountPaid>0.0</amountPaid><serviceId>0299978696</serviceId><rootOrderItemId>ONL0000007477-OI-1-4</rootOrderItemId><productPartNum>maccess040029</productPartNum><parentOrderItemId>ONL0000007477-OI-1-3</parentOrderItemId><itemId>ONL0000007477-OI-1-2</itemId><customerRequestedDate>"
				+ Date + "T12:00:00.000Z</customerRequestedDate><customerNumber>" + CustomerNumber
				+ "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000007477-OI-1-2</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA><OrderItemXA><value>0299978696</value><name>serviceGuidingId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>RE_20160608_000138925</value><name>reservationId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>MDN</value><name>serviceGuidingIdType</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>2</value><name>gainingServicerProvider</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>101</value><name>lspId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>39432974324283742</value><name>lspSimNumber</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>Port</value><name>numberSource</name><actionCode>Add</actionCode></OrderItemXA></ListOfOrderItemXA></OrderItem><OrderItem><amountPaid>0.0</amountPaid><serviceId>0299978696</serviceId><rootOrderItemId>ONL0000007477-OI-1-4</rootOrderItemId><productPartNum>maccess040007</productPartNum><parentOrderItemId>ONL0000007477-OI-1-4</parentOrderItemId><itemId>ONL0000007477-OI-1-3</itemId><customerRequestedDate>"
				+ Date + "T12:00:00.000Z</customerRequestedDate><customerNumber>" + CustomerNumber
				+ "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000007477-OI-1-3</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><amountPaid>0.0</amountPaid><serviceId>0299978696</serviceId><rootOrderItemId/><productPartNum>mbundle040006</productPartNum><parentOrderItemId/><itemId>ONL0000007477-OI-1-4</itemId><customerRequestedDate>"
				+ Date + "T12:00:00.000Z</customerRequestedDate><customerNumber>" + CustomerNumber
				+ "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000007477-OI-1-4</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><amountPaid>0.0</amountPaid><rootOrderItemId>ONL0000007477-OI-1-4</rootOrderItemId><productPartNum>discount040513</productPartNum><parentOrderItemId>ONL0000007477-OI-1-1</parentOrderItemId><manualPriceOverride/><manualDiscountPercent/><manualDiscountAmount>5.0</manualDiscountAmount><manualAdjustmentReason>SIM price correction</manualAdjustmentReason><itemId>ONL0000007477-OI-1-6</itemId><customerRequestedDate>"
				+ Date + "T12:00:00.000Z</customerRequestedDate><customerNumber>" + CustomerNumber
				+ "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000007477-OI-1-6</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem></ListOfOrderItem></Order></ListOfOrder></CustomerOrderMessage></SubmitCustomerOrderRequest>";
		System.out.println("ONLINEXML : " + ONLINEXML);
		return ONLINEXML;
	}

	/* TO GENERATE ONLINE XML WHERE DEVICE IS PRESENT = JUHI */
	/*
	 * public String getOnlineXMLWithDevice(String CustomerNumber, String
	 * AccountNumber, String Date, String DeviceID,String DEPstatus) {
	 * 
	 * String ONLINEXML =
	 * "<SubmitCustomerOrderRequest><CustomerOrderMessage><messageHeader><transactionId>QzQFrLQY74xXcUU2xK4BuXhpE7INyh</transactionId><timestamp>2016-06-07T04:39:48.000Z</timestamp><application>ONLINE</application><user>Hybris</user><processContext>BPM8-22106</processContext><lineOfBusiness>Spark</lineOfBusiness></messageHeader><ListOfOrder><Order><submitOrderFlag>Y</submitOrderFlag><serviceOrderId/><salesChannelName>TNZOnlineStore</salesChannelName><contactPreferredMethod>Email</contactPreferredMethod><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><orderDate>2016-06-07</orderDate><orderContext>New Offer</orderContext><orderAim>New Offer</orderAim><externalOrderNumber>ONL0000006154</externalOrderNumber><chargeAggId></chargeAggId><customerNumber>"
	 * + CustomerNumber +
	 * "</customerNumber><contactMobilePhone>027123126</contactMobilePhone><contactLastName>KOSHE13</contactLastName><contactFirstName>JUHI13</contactFirstName><contactEmailAddress>sarika.mandlik@spark.co.nz</contactEmailAddress><billingAccountNumber>"
	 * + AccountNumber +
	 * "</billingAccountNumber><billingReferenceID/><ListOfPayments/><ListOfLocation><Location><nztmY>5529084.682</nztmY><nztmX>1822929.275</nztmX><verifiedstatus>Verified</verifiedstatus><terrAuthName>PALMERSTON NORTH CITY</terrAuthName><tui>1001280662</tui><streetType>AVENUE</streetType><streetNrLast>167</streetNrLast><streetNrFirst>167</streetNrFirst><streetName>VICTORIA</streetName><samid/><region>MANAWATU-WANGANUI REGION</region><recipientName>JUHI13 KOSHE13</recipientName><postCode>4410</postCode><longitude>175.6252972</longitude><locality>HOKOWHITU</locality><latitude>-40.3590247</latitude><elid>300920171</elid><dpid>1192587</dpid><townOrCity>Palmerston North</townOrCity><addressType>Street</addressType><role>Shipping</role><addressLine4>Palmerston North 4410</addressLine4><addressLine1>167 Victoria Avenue</addressLine1><locationId>SHP_A6Bl9ZymZF0</locationId><recipientCompanyName/><recipientEMailID/><recipientContactNumber/></Location></ListOfLocation><ListOfOrderItem><OrderItem><amountPaid>0.0</amountPaid><shipToAddressId>SHP_A6Bl9ZymZF0</shipToAddressId><serviceAddressId/><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>"
	 * + DeviceID +
	 * "</productPartNum><parentOrderItemId>ONL0000006154-OI-1-4</parentOrderItemId><itemId>ONL0000006154-OI-1-1</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
	 * + CustomerNumber + "</customerNumber><billingAccountNumber>" +
	 * AccountNumber +
	 * "</billingAccountNumber><instanceId>ONL0000006154-OI-1-1</instanceId><actionCode>Add</actionCode><depStatus>"
	 * + DEPstatus +
	 * "</depStatus><ListOfOrderItemXA/><ListOfdeferredPayments><deferredPayments><term>12</term><lastIntalmentAmount>99.88</lastIntalmentAmount><instalmentAmount>99.92</instalmentAmount><firstInstalmentAmount>99.92</firstInstalmentAmount></deferredPayments></ListOfdeferredPayments></OrderItem><OrderItem><amountPaid>0.0</amountPaid><serviceId>0272000385</serviceId><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>maccess040029</productPartNum><parentOrderItemId>ONL0000006154-OI-1-3</parentOrderItemId><itemId>ONL0000006154-OI-1-2</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
	 * + CustomerNumber + "</customerNumber><billingAccountNumber>" +
	 * AccountNumber +
	 * "</billingAccountNumber><instanceId>ONL0000006154-OI-1-2</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA><OrderItemXA><value>0272000385</value><name>serviceGuidingId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>RE_20160607_000138213</value><name>reservationId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>MDN</value><name>serviceGuidingIdType</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>New</value><name>numberSource</name><actionCode>Add</actionCode></OrderItemXA></ListOfOrderItemXA></OrderItem><OrderItem><amountPaid>0.0</amountPaid><serviceId>0272000385</serviceId><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>maccess040007</productPartNum><parentOrderItemId>ONL0000006154-OI-1-4</parentOrderItemId><itemId>ONL0000006154-OI-1-3</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
	 * + CustomerNumber + "</customerNumber><billingAccountNumber>" +
	 * AccountNumber +
	 * "</billingAccountNumber><instanceId>ONL0000006154-OI-1-3</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><amountPaid>0.0</amountPaid><serviceId>0272000385</serviceId><rootOrderItemId/><productPartNum>mbundle040006</productPartNum><parentOrderItemId/><itemId>ONL0000006154-OI-1-4</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
	 * + CustomerNumber + "</customerNumber><billingAccountNumber>" +
	 * AccountNumber +
	 * "</billingAccountNumber><instanceId>ONL0000006154-OI-1-4</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><amountPaid>0.0</amountPaid><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>misc040223</productPartNum><parentOrderItemId>ONL0000006154-OI-1-1</parentOrderItemId><itemId>ONL0000006154-OI-1-5</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
	 * + CustomerNumber + "</customerNumber><billingAccountNumber>" +
	 * AccountNumber +
	 * "</billingAccountNumber><instanceId>ONL0000006154-OI-1-5</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><amountPaid>0.0</amountPaid><shipToAddressId>SHP_A6Bl9ZymZF0</shipToAddressId><serviceAddressId/><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>SIMTrioSPO</productPartNum><parentOrderItemId>ONL0000006154-OI-1-3</parentOrderItemId><itemId>ONL0000006154-OI-1-6</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
	 * + CustomerNumber + "</customerNumber><billingAccountNumber>" +
	 * AccountNumber +
	 * "</billingAccountNumber><instanceId>ONL0000006154-OI-1-6</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem></ListOfOrderItem></Order></ListOfOrder></CustomerOrderMessage></SubmitCustomerOrderRequest>";
	 * System.out.println("ONLINEXML : " + ONLINEXML); return ONLINEXML; }
	 */

	/* TO GENERATE ONLINE XML WHERE DEVICE IS PRESENT = SULAGNA */
	public String getOnlineXMLWithDevice(String CustomerNumber, String AccountNumber, String DeviceID,
			String DEPstatus) {
		String ONLINEXML = "<SubmitCustomerOrderRequest><CustomerOrderMessage><messageHeader><transactionId>QzQFrLQY74xXcUU2xK4BuXhpE7INyh</transactionId><timestamp>2017-11-11T04:39:48.000Z</timestamp><application>ONLINE</application><user>Hybris</user><processContext>BPM8-22106</processContext><lineOfBusiness>Spark</lineOfBusiness></messageHeader><ListOfOrder><Order><submitOrderFlag>Y</submitOrderFlag><serviceOrderId/><salesChannelName>TNZOnlineStore</salesChannelName><contactPreferredMethod>Email</contactPreferredMethod><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><orderDate>2016-06-07</orderDate><orderContext>New Offer</orderContext><orderAim>New Offer</orderAim><externalOrderNumber>ONL0000006154</externalOrderNumber>"
				+ "<customerNumber>" + CustomerNumber
				+ "</customerNumber><contactMobilePhone>027123126</contactMobilePhone><contactLastName>mandlik</contactLastName><contactFirstName>sarika</contactFirstName><contactEmailAddress>sarika.mandlik@spark.co.nz</contactEmailAddress>"
				+ "<billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billingReferenceID/><ListOfPayments/><ListOfLocation><Location><nztmY>5529084.682</nztmY><nztmX>1822929.275</nztmX><verifiedstatus>Verified</verifiedstatus><terrAuthName>PALMERSTON NORTH CITY</terrAuthName><tui>1001280662</tui><streetType>AVENUE</streetType><streetNrLast>167</streetNrLast><streetNrFirst>167</streetNrFirst><streetName>VICTORIA</streetName><samid/><region>MANAWATU-WANGANUI REGION</region><recipientName>sarika mandlik</recipientName><postCode>4410</postCode><longitude>175.6252972</longitude><locality>HOKOWHITU</locality><latitude>-40.3590247</latitude><elid>300920171</elid><dpid>1192587</dpid><townOrCity>Palmerston North</townOrCity><addressType>Street</addressType><role>Shipping</role><addressLine4>Palmerston North 4410</addressLine4>"
				+ "<addressLine1>167 Victoria Avenue</addressLine1><locationId>SHP_A6Bl9ZymZF0</locationId><recipientCompanyName/><recipientEMailID/><recipientContactNumber/></Location></ListOfLocation><ListOfOrderItem><OrderItem><amountPaid>0.0</amountPaid><shipToAddressId>SHP_A6Bl9ZymZF0</shipToAddressId><serviceAddressId/><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>"
				+ DeviceID
				+ "</productPartNum><parentOrderItemId>ONL0000006154-OI-1-4</parentOrderItemId><itemId>ONL0000006154-OI-1-1</itemId><customerRequestedDate>2017-12-12T04:39:48.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000006154-OI-1-1</instanceId><actionCode>Add</actionCode><depStatus>"
				+ DEPstatus
				+ "</depStatus><ListOfOrderItemXA/><ListOfdeferredPayments><deferredPayments><term>12</term><lastIntalmentAmount>99.88</lastIntalmentAmount><instalmentAmount>99.92</instalmentAmount><firstInstalmentAmount>99.92</firstInstalmentAmount></deferredPayments></ListOfdeferredPayments></OrderItem><OrderItem><amountPaid>0.0</amountPaid><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>valuepack101133</productPartNum><parentOrderItemId>ONL0000006154-OI-1-3</parentOrderItemId><itemId>ONL0000006154-OI-1-10</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000006154-OI-1-10</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><amountPaid>0.0</amountPaid><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>discount040513</productPartNum><parentOrderItemId>ONL0000006154-OI-1-6</parentOrderItemId><manualPriceOverride/><manualDiscountPercent/><manualDiscountAmount>5.0</manualDiscountAmount><manualAdjustmentReason>SIM price correction</manualAdjustmentReason><itemId>ONL0000006154-OI-1-12</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000006154-OI-1-12</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><amountPaid>0.0</amountPaid><serviceId>0272000385</serviceId><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>maccess040029</productPartNum><parentOrderItemId>ONL0000006154-OI-1-3</parentOrderItemId><itemId>ONL0000006154-OI-1-2</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000006154-OI-1-2</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA><OrderItemXA><value>0272000385</value><name>serviceGuidingId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>RE_20160607_000138213</value><name>reservationId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>MDN</value><name>serviceGuidingIdType</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>New</value><name>numberSource</name><actionCode>Add</actionCode></OrderItemXA></ListOfOrderItemXA></OrderItem><OrderItem><amountPaid>0.0</amountPaid><serviceId>0272000385</serviceId><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>maccess040007</productPartNum><parentOrderItemId>ONL0000006154-OI-1-4"
				+ "</parentOrderItemId><itemId>ONL0000006154-OI-1-3</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000006154-OI-1-3</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><amountPaid>0.0</amountPaid><serviceId>0272000385</serviceId><rootOrderItemId/><productPartNum>mbundle040050</productPartNum><parentOrderItemId/><itemId>ONL0000006154-OI-1-4</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000006154-OI-1-4</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><amountPaid>0.0</amountPaid><shipToAddressId>SHP_A6Bl9ZymZF0</shipToAddressId><serviceAddressId/><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>SIMTrioSPO</productPartNum><parentOrderItemId>ONL0000006154-OI-1-3</parentOrderItemId><itemId>ONL0000006154-OI-1-6</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000006154-OI-1-6</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><amountPaid>0.0</amountPaid><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>dataextra100140</productPartNum><parentOrderItemId>ONL0000006154-OI-1-3</parentOrderItemId><itemId>ONL0000006154-OI-1-7</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000006154-OI-1-7</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><amountPaid>0.0</amountPaid><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>dataextra101231</productPartNum><parentOrderItemId>ONL0000006154-OI-1-3</parentOrderItemId><itemId>ONL0000006154-OI-1-8</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000006154-OI-1-8</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><amountPaid>0.0</amountPaid><rootOrderItemId>ONL0000006154-OI-1-4</rootOrderItemId><productPartNum>inttexttalkpack101061</productPartNum><parentOrderItemId>ONL0000006154-OI-1-3</parentOrderItemId><itemId>ONL0000006154-OI-1-9</itemId><customerRequestedDate>2016-06-07T04:39:48.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0000006154-OI-1-9</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem></ListOfOrderItem></Order></ListOfOrder></CustomerOrderMessage></SubmitCustomerOrderRequest>";
		System.out.println("ONLINEXML : " + ONLINEXML);
		return ONLINEXML;
	}

	/*
	 * Author Name: Ankita Banerjee; Description:For terminate journey of online
	 * order
	 */
	public String getOnlineTerminateXML(String custnumber, String accountNumber, String serviceId, String terminateDate,
			String instanceId, String promo, String startDate, String itemId) {
		String ONLINE_TERMINATE_XML = "<SubmitCustomerOrderRequest><CustomerOrderMessage><messageHeader><transactionId>c06a6b7"
				+ "</transactionId><timestamp>2017-11-20T15:47:48.205Z</timestamp><application>MSSP</application>"
				+ "<user>T961736</user><processContext>BPM8-22106</processContext><messageId>c06a6b7</messageId></messageHeader><ListOfOrder>"
				+ "<Order><totalParts>1</totalParts><toCustomerNumber></toCustomerNumber><toBillingAccountNumber>"
				+ "</toBillingAccountNumber><disconnectedReason>Collections action</disconnectedReason>"
				+ "<payToAccountNum></payToAccountNum><collectionTerminationDate>" + terminateDate
				+ "T00:00:00.000Z</collectionTerminationDate><billingReferenceID></billingReferenceID>"
				+ "<submitOrderFlag>Y</submitOrderFlag><serviceOrderId></serviceOrderId>"
				+ "<salesChannelName>TNZOnlineStore</salesChannelName>" + "<orderDate>" + startDate + "</orderDate>"
				+ "<orderContext>Terminate</orderContext><orderAim>Terminate</orderAim><externalOrderNumber>90043-SG"
				+ "</externalOrderNumber><customerNumber>" + custnumber + "</customerNumber><billingAccountNumber>"
				+ accountNumber
				+ "</billingAccountNumber><ListOfPayments/><ListOfLocation/><ListOfOrderItem><OrderItem><payToAccountNum></payToAccountNum>"
				+ "<chargeRedirectionTermUnit></chargeRedirectionTermUnit><chargeRedirectionTerm></chargeRedirectionTerm>"
				+ "<amountPaid></amountPaid><serviceId>" + serviceId + "</serviceId><rootOrderItemId></rootOrderItemId>"
				+ "<productPartNum>" + promo + "</productPartNum><parentOrderItemId></parentOrderItemId><itemId>"
				+ itemId + "</itemId><customerNumber>" + custnumber + "</customerNumber><billingAccountNumber>"
				+ accountNumber + "</billingAccountNumber><instanceId>" + instanceId
				+ "</instanceId><actionCode>Delete</actionCode>"
				+ "<ListOfOrderItemXA/></OrderItem></ListOfOrderItem></Order></ListOfOrder></CustomerOrderMessage></SubmitCustomerOrderRequest>";
		System.out.println("ONLINE_TERMINATE_XML : " + ONLINE_TERMINATE_XML);
		return ONLINE_TERMINATE_XML;
	}

	/* Author Name:Sandeep Functionality: Change Ownership */
	public String getOnlineChangeOwnershipXML(String custnumber, String toAccountNumber, String fromAccountNumber,
			String serviceId, String changeOwnershipDate, String instanceId, String part_num, String startDate,
			String noticeDate, String itemId) {
		String ONLINE_ChangeOwnership_XML = "<SubmitCustomerOrderRequest><CustomerOrderMessage><messageHeader><transactionId>aee55d61-754e-4777-89f7-5703576452aa"
				+ "</transactionId><timestamp>2018-02-02T04:13:07.932Z</timestamp><application>MSSP</application>"
				+ "<processContext>BPM8-22106</processContext><lineOfBusiness>Spark Digital</lineOfBusiness></messageHeader><ListOfOrder>"
				+ "<Order><totalParts>1</totalParts><toCustomerNumber>" + custnumber + "</toCustomerNumber>"
				+ "<toBillingAccountNumber>" + toAccountNumber + "</toBillingAccountNumber><status>Hold</status>"
				+ "<payToAccountNum></payToAccountNum><originator>Customer</originator><lastMilestone>QA Pending</lastMilestone>"
				+ "<holdReason>Quality check required</holdReason><currentPartSequence>1</currentPartSequence>"
				+ "<billingReferenceID>Greg Hoggard upgrade</billingReferenceID><submitOrderFlag>Y</submitOrderFlag>"
				+ "<serviceOrderId></serviceOrderId><salesChannelName>TNZOnlineStore</salesChannelName><contactPreferredMethod>Email</contactPreferredMethod>"
				+ "<customerRequestedDate>" + changeOwnershipDate + "T18:00:00.000Z</customerRequestedDate><orderDate>"
				+ startDate + "</orderDate>"
				+ "<orderContext>Change Ownership</orderContext><orderAim>Change Ownership</orderAim><externalOrderNumber>1234567</externalOrderNumber>"
				+ "<dealerCode>GENDF</dealerCode><customerNumber>" + custnumber
				+ "</customerNumber><contactMobilePhone></contactMobilePhone>"
				+ "<contactLastName>REGRESSION</contactLastName><contactFirstName>RASHMI</contactFirstName><contactEmailAddress></contactEmailAddress>"
				+ "<billingAccountNumber>" + fromAccountNumber + "</billingAccountNumber><serviceCustomerNumber>"
				+ custnumber + "</serviceCustomerNumber>"
				+ "<applyCharges>N</applyCharges><priceWaiverReason>Estate</priceWaiverReason><billingEndDate>"
				+ noticeDate + "T11:00:00.000Z</billingEndDate>"
				+ "<billingDateChangeReason>Spark error</billingDateChangeReason><secondaryContact><contactEmailAddress></contactEmailAddress>"
				+ "<contactFirstName>Rachel</contactFirstName><contactLastName>Honey</contactLastName><contactMobilePhone></contactMobilePhone>"
				+ "<contactRole>Order Contact</contactRole></secondaryContact><ListOfPayments/><ListOfLocation>"
				+ "<Location><recipientEMailID></recipientEMailID><recipientContactNumber></recipientContactNumber>"
				+ "<recipientCompanyName>Parceline Express - Greg Hoggard</recipientCompanyName><nztmY>5430049.869</nztmY>"
				+ "<nztmX>1749543.431</nztmX><deliveryNotes>c/- NZC Wellington</deliveryNotes><verifiedstatus>Verified</verifiedstatus>"
				+ "<terrAuthName>WELLINGTON CITY</terrAuthName><streetType>QUAY</streetType><streetNrLast>195</streetNrLast>"
				+ "<streetNrFirst>195</streetNrFirst><streetName>AOTEA</streetName><startDate>2018-12-13</startDate>"
				+ "<region>PIPITEA</region><recipientName>Greg Hoggard</recipientName><postCode>6011</postCode>"
				+ "<longitude>174.7853196</longitude><locality>PIPITEA</locality><latitude>-41.267143</latitude>"
				+ "<elid>301035866</elid><townOrCity>WELLINGTON</townOrCity><addressType>Street</addressType>"
				+ "<role>Shipping</role><addressLine4>WELLINGTON 6011</addressLine4><addressLine3>Pipitea</addressLine3>"
				+ "<addressLine1>195 Aotea Quay</addressLine1><locationId>1</locationId><country>New Zealand</country></Location>"
				+ "</ListOfLocation><ListOfOrderItem><OrderItem><quantity>1</quantity><lineDescription>Greg Hoggard</lineDescription>"
				+ "<chargeRedirectionTermUnit></chargeRedirectionTermUnit><chargeRedirectionTerm></chargeRedirectionTerm>"
				+ "<amountPaid></amountPaid><shipToAddressId>1</shipToAddressId><serviceId>" + serviceId
				+ "</serviceId>" + "<rootOrderItemId /><productPartNum>" + part_num
				+ "</productPartNum><parentOrderItemId />" + "<itemId>" + itemId + "</itemId><customerRequestedDate>"
				+ changeOwnershipDate + "T18:00:00.000Z</customerRequestedDate>" + "<customerNumber>" + custnumber
				+ "</customerNumber><billingAccountNumber>" + fromAccountNumber + "</billingAccountNumber>"
				+ "<instanceId>" + instanceId + "</instanceId><actionCode>Add</actionCode><depStatus>Enrol</depStatus>"
				+ "<ListOfOrderItemXA></ListOfOrderItemXA></OrderItem></ListOfOrderItem></Order></ListOfOrder></CustomerOrderMessage></SubmitCustomerOrderRequest>";
		System.out.println("ONLINE_ChangeOwnership_XML : " + ONLINE_ChangeOwnership_XML);
		return ONLINE_ChangeOwnership_XML;
	}

	public String getOnlineChangeOwnership_DCDAXML(String toCustnumber, String toAccountNumber,
			String fromCustomerNumber, String fromAccountNumber, String serviceId, String changeOwnershipDate,
			String instanceId, String part_num, String target_part_num, String startDate, String noticeDate,
			String itemId) {
		String ONLINE_ChangeOwnership_DCDAXML = "<SubmitCustomerOrderRequest><CustomerOrderMessage><messageHeader><transactionId>9jfZjcEJDbFLhrpJl9rpZI5TutLI40</transactionId>"
				+ "<timestamp>" + startDate
				+ "T00:00:00.000Z</timestamp><application>MSSP</application><user>Hybris</user><processContext>BPM8-22106</processContext>"
				+ "<lineOfBusiness>Spark Digital</lineOfBusiness></messageHeader><ListOfOrder>"
				+ "<Order><toCustomerNumber>" + toCustnumber + "</toCustomerNumber><toBillingAccountNumber>"
				+ toAccountNumber + "</toBillingAccountNumber>"
				+ "<payToAccountNum /><billingReferenceID /><submitOrderFlag>Y</submitOrderFlag><serviceOrderId />"
				+ "<salesChannelName>TNZOnlineStore</salesChannelName><contactPreferredMethod>Email</contactPreferredMethod>"
				+ "<customerRequestedDate>" + changeOwnershipDate + "T00:00:00.000Z</customerRequestedDate><orderDate>"
				+ startDate + "</orderDate>"
				+ "<orderContext>Change Ownership</orderContext><orderAim>Change Ownership</orderAim><externalOrderNumber>6546543</externalOrderNumber>"
				+ "<customerNumber>" + fromCustomerNumber
				+ "</customerNumber><contactMobilePhone>0268677452</contactMobilePhone>"
				+ "<contactLastName>WALSER</contactLastName><contactFirstName>KERRIE MARIE</contactFirstName>"
				+ "<contactEmailAddress>Kerri.walser@xtra.co.nz</contactEmailAddress><billingAccountNumber>"
				+ fromAccountNumber + "</billingAccountNumber>" + "<serviceCustomerNumber>" + toCustnumber
				+ "</serviceCustomerNumber><applyCharges>Y</applyCharges><priceWaiverReason />"
				+ "<billingEndDate></billingEndDate><billingDateChangeReason></billingDateChangeReason>"
				+ "<ListOfPayments /><ListOfLocation /><ListOfOrderItem><OrderItem><payToAccountNum /><chargeRedirectionTermUnit />"
				+ "<chargeRedirectionTerm /><amountPaid>0.0</amountPaid><serviceId>012122355623</serviceId>"
				+ "<rootOrderItemId /><productPartNum>" + target_part_num + "</productPartNum><parentOrderItemId />"
				+ "<itemId>1-H8FV861</itemId><customerRequestedDate>" + changeOwnershipDate
				+ "T00:00:00.000Z</customerRequestedDate>" + "<customerNumber>" + toCustnumber
				+ "</customerNumber><billingAccountNumber>" + toAccountNumber + "</billingAccountNumber>"
				+ "<instanceId>1-H8F6IBV</instanceId><actionCode>Add</actionCode>"
				+ "</OrderItem><OrderItem><payToAccountNum /><chargeRedirectionTermUnit /><chargeRedirectionTerm /><amountPaid>0.0</amountPaid>"
				+ "<serviceId>" + serviceId + "</serviceId><rootOrderItemId /><productPartNum>" + part_num
				+ "</productPartNum>" + "<parentOrderItemId /><itemId>" + itemId + "</itemId><customerRequestedDate>"
				+ changeOwnershipDate + "T18:00:00.000Z</customerRequestedDate>" + "<customerNumber>"
				+ fromCustomerNumber + "</customerNumber><billingAccountNumber>" + fromAccountNumber
				+ "</billingAccountNumber>" + "<instanceId>" + instanceId
				+ "</instanceId><actionCode>Delete</actionCode><ListOfOrderItemXA /></OrderItem></ListOfOrderItem></Order>"
				+ "</ListOfOrder></CustomerOrderMessage></SubmitCustomerOrderRequest>";

		System.out.println("ONLINE_ChangeOwnership_DCDAXML : " + ONLINE_ChangeOwnership_DCDAXML);
		return ONLINE_ChangeOwnership_DCDAXML;
	}

	/* Author Sandeep Change ownership for sharer */
	public String getOnlineChangeOwnership_DCDASharerXML(String toCustnumber, String toAccountNumber,
			String fromCustomerNumber, String fromAccountNumber, String serviceId, String changeOwnershipDate,
			String instanceId, String part_num, String target_part_num, String startDate, String noticeDate,
			String groupId, String itemId) {
		String ONLINE_ChangeOwnership_DCDASharerXML = "<SubmitCustomerOrderRequest><CustomerOrderMessage><messageHeader><transactionId>9jfZjcEJDbFLhrpJl9rpZI5TutLI40</transactionId>"
				+ "<timestamp>" + startDate
				+ "T00:00:00.000Z</timestamp><application>MSSP</application><user>Hybris</user><processContext>BPM8-22106</processContext>"
				+ "<lineOfBusiness>Spark Digital</lineOfBusiness></messageHeader><ListOfOrder>"
				+ "<Order><toCustomerNumber>" + toCustnumber + "</toCustomerNumber><toBillingAccountNumber>"
				+ toAccountNumber + "</toBillingAccountNumber>"
				+ "<payToAccountNum /><billingReferenceID /><submitOrderFlag>Y</submitOrderFlag><serviceOrderId />"
				+ "<salesChannelName>TNZOnlineStore</salesChannelName><contactPreferredMethod>Email</contactPreferredMethod>"
				+ "<customerRequestedDate>" + changeOwnershipDate + "T00:00:00.000Z</customerRequestedDate><orderDate>"
				+ startDate + "</orderDate>"
				+ "<orderContext>Change Ownership</orderContext><orderAim>Change Ownership</orderAim><externalOrderNumber>6546543</externalOrderNumber>"
				+ "<customerNumber>" + fromCustomerNumber
				+ "</customerNumber><contactMobilePhone>0268677452</contactMobilePhone>"
				+ "<contactLastName>WALSER</contactLastName><contactFirstName>KERRIE MARIE</contactFirstName>"
				+ "<contactEmailAddress>Kerri.walser@xtra.co.nz</contactEmailAddress><billingAccountNumber>"
				+ fromAccountNumber + "</billingAccountNumber>" + "<serviceCustomerNumber>" + toCustnumber
				+ "</serviceCustomerNumber><applyCharges>Y</applyCharges><priceWaiverReason />"
				+ "<billingEndDate></billingEndDate><billingDateChangeReason></billingDateChangeReason>"
				+ "<ListOfPayments /><ListOfLocation /><ListOfOrderItem><OrderItem><payToAccountNum /><chargeRedirectionTermUnit />"
				+ "<chargeRedirectionTerm /><amountPaid>0.0</amountPaid><serviceId>012122355623</serviceId>"
				+ "<rootOrderItemId /><productPartNum>" + target_part_num + "</productPartNum><parentOrderItemId />"
				+ "<itemId>1-H8FV861</itemId><customerRequestedDate>" + changeOwnershipDate
				+ "T00:00:00.000Z</customerRequestedDate>" + "<customerNumber>" + toCustnumber
				+ "</customerNumber><billingAccountNumber>" + toAccountNumber + "</billingAccountNumber>"
				+ "<instanceId>1-H8F6IBV</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA><OrderItemXA>"
				+ "<value>" + groupId + "</value><name>groupId</name><actionCode>Add</actionCode></OrderItemXA>"
				+ "<OrderItemXA><value>Leader</value><name>shareProfile</name><actionCode>Add</actionCode></OrderItemXA></ListOfOrderItemXA>"
				+ "</OrderItem><OrderItem><payToAccountNum /><chargeRedirectionTermUnit /><chargeRedirectionTerm /><amountPaid>0.0</amountPaid>"
				+ "<serviceId>" + serviceId + "</serviceId><rootOrderItemId /><productPartNum>" + part_num
				+ "</productPartNum>" + "<parentOrderItemId /><itemId>" + itemId + "</itemId><customerRequestedDate>"
				+ changeOwnershipDate + "T18:00:00.000Z</customerRequestedDate>" + "<customerNumber>"
				+ fromCustomerNumber + "</customerNumber><billingAccountNumber>" + fromAccountNumber
				+ "</billingAccountNumber>" + "<instanceId>" + instanceId
				+ "</instanceId><actionCode>Delete</actionCode><ListOfOrderItemXA /></OrderItem></ListOfOrderItem></Order>"
				+ "</ListOfOrder></CustomerOrderMessage></SubmitCustomerOrderRequest>";

		System.out.println("ONLINE_ChangeOwnership_DCDASharerXML : " + ONLINE_ChangeOwnership_DCDASharerXML);
		return ONLINE_ChangeOwnership_DCDASharerXML;
	}

	public String getResignXML(String CustomerNumber, String AccountNumber, String ServiceId,
			HashMap<String, List<String>> row_id) {
		String RESIGNXML = "<SubmitCustomerOrderRequest><CustomerOrderMessage><messageHeader><transactionId>ZWAQS8gX9GuDlwbVx0GeY0ray2AFq9</transactionId><timestamp>2016-12-13T04:39:58.000Z</timestamp><application>ONLINE</application><user>Hybris</user><processContext>BPM8-22106</processContext><lineOfBusiness>Spark</lineOfBusiness></messageHeader><ListOfOrder><Order><toCustomerNumber>"
				+ CustomerNumber + "</toCustomerNumber><toBillingAccountNumber>" + AccountNumber
				+ "</toBillingAccountNumber><payToAccountNum></payToAccountNum><billingReferenceID></billingReferenceID><submitOrderFlag>Y</submitOrderFlag><serviceOrderId></serviceOrderId><salesChannelName>TNZOnlineStore</salesChannelName><contactPreferredMethod>Email</contactPreferredMethod><customerRequestedDate>2016-12-12T11:00:00.000Z</customerRequestedDate><orderDate>2016-12-13</orderDate><orderContext>Mobile Resign</orderContext><orderAim>Change Offer</orderAim><externalOrderNumber>ONL0002678103</externalOrderNumber><customerNumber>"
				+ CustomerNumber
				+ "</customerNumber><contactMobilePhone>02005467456</contactMobilePhone><contactLastName>PARKER</contactLastName><contactFirstName>MARK</contactFirstName><contactEmailAddress>test@test.com</contactEmailAddress><billingAccountNumber>"
				+ AccountNumber
				+ "</billingAccountNumber><ListOfPayments/><ListOfLocation><Location><recipientEMailID></recipientEMailID><recipientContactNumber></recipientContactNumber><recipientCompanyName></recipientCompanyName><nztmY>5893812.793</nztmY><nztmX>1772663.78</nztmX><verifiedstatus>Verified</verifiedstatus><terrAuthName>AUCKLAND</terrAuthName><tui>1002487370</tui><streetType>ROAD</streetType><streetNrLast>2</streetNrLast><streetNrFirst>2</streetNrFirst><streetName>GATLAND</streetName><samid></samid><region>AUCKLAND REGION</region><recipientName>MARK PARKER</recipientName><postCode>2113</postCode><longitude>174.9426541</longitude><locality>OPAHEKE</locality><latitude>-37.0860812</latitude><elid>301949377</elid><dpid>1453649</dpid><townOrCity>Papakura</townOrCity><addressType>Street</addressType><role>Shipping</role><addressLine4>Papakura 2113</addressLine4><addressLine1>2 Gatland Road</addressLine1><locationId>SHP_m4KpWM4bJRz</locationId></Location></ListOfLocation><ListOfOrderItem><OrderItem><payToAccountNum></payToAccountNum><chargeRedirectionTermUnit></chargeRedirectionTermUnit><chargeRedirectionTerm></chargeRedirectionTerm><amountPaid>0.0</amountPaid><shipToAddressId>SHP_m4KpWM4bJRz</shipToAddressId><serviceAddressId></serviceAddressId><rootOrderItemId>ONL0002678103-OI-1-2</rootOrderItemId><productPartNum>samsung120602SPO</productPartNum><parentOrderItemId>ONL0002678103-OI-1-2</parentOrderItemId><itemId>ONL0002678103-OI-1-1</itemId><customerRequestedDate>2016-12-12T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0002678103-OI-1-1</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum></payToAccountNum><chargeRedirectionTermUnit></chargeRedirectionTermUnit><chargeRedirectionTerm></chargeRedirectionTerm><amountPaid>0.0</amountPaid><serviceId>"
				+ ServiceId
				+ "</serviceId><rootOrderItemId></rootOrderItemId><productPartNum>mbundle040057</productPartNum><parentOrderItemId></parentOrderItemId><itemId>ONL0002678103-OI-1-2</itemId><customerRequestedDate>2016-12-12T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0002678103-OI-1-2</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum></payToAccountNum><chargeRedirectionTermUnit></chargeRedirectionTermUnit><chargeRedirectionTerm></chargeRedirectionTerm><amountPaid>0.0</amountPaid><rootOrderItemId></rootOrderItemId><productPartNum>misc020793</productPartNum><parentOrderItemId></parentOrderItemId><itemId>ONL0002678103-OI-1-4</itemId><customerRequestedDate>2016-12-12T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0002678103-OI-1-4</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum></payToAccountNum><chargeRedirectionTermUnit></chargeRedirectionTermUnit><chargeRedirectionTerm></chargeRedirectionTerm><amountPaid>0.0</amountPaid><rootOrderItemId>ONL0002678103-OI-1-2</rootOrderItemId><productPartNum>discount040021</productPartNum><parentOrderItemId>ONL0002678103-OI-1-1</parentOrderItemId><manualPriceOverride></manualPriceOverride><manualDiscountPercent></manualDiscountPercent><manualDiscountAmount>300.0</manualDiscountAmount><manualAdjustmentReason>Current Promotion</manualAdjustmentReason><itemId>ONL0002678103-OI-1-5</itemId><customerRequestedDate>2016-12-12T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0002678103-OI-1-5</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum></payToAccountNum><chargeRedirectionTermUnit></chargeRedirectionTermUnit><chargeRedirectionTerm></chargeRedirectionTerm><amountPaid>0.0</amountPaid><rootOrderItemId>ONL0002678103-OI-1-3</rootOrderItemId><productPartNum>discount040513</productPartNum><parentOrderItemId>ONL0002678103-OI-1-3</parentOrderItemId><manualPriceOverride></manualPriceOverride><manualDiscountPercent></manualDiscountPercent><manualDiscountAmount>5.0</manualDiscountAmount><manualAdjustmentReason>SIM price correction</manualAdjustmentReason><itemId>ONL0002678103-OI-1-6</itemId><customerRequestedDate>2016-12-12T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0002678103-OI-1-6</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum></payToAccountNum><chargeRedirectionTermUnit></chargeRedirectionTermUnit><chargeRedirectionTerm></chargeRedirectionTerm><amountPaid>0.0</amountPaid><rootOrderItemId>ONL0002678103-OI-1-4</rootOrderItemId><productPartNum>fees020632</productPartNum><parentOrderItemId>ONL0002678103-OI-1-4</parentOrderItemId><manualPriceOverride>1400.0</manualPriceOverride><manualDiscountPercent></manualDiscountPercent><manualDiscountAmount></manualDiscountAmount><itemId>ONL0002678103-OI-1-7</itemId><customerRequestedDate>2016-12-12T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>ONL0002678103-OI-1-7</instanceId><actionCode>Add</actionCode><ListOfOrderItemXA><OrderItemXA><value>"
				+ row_id.get("INSTANCE_ID").get(0)

				+ "</value><name>generatingProductInstanceId</name><actionCode>Add</actionCode></OrderItemXA></ListOfOrderItemXA></OrderItem><OrderItem><payToAccountNum></payToAccountNum><chargeRedirectionTermUnit></chargeRedirectionTermUnit><chargeRedirectionTerm></chargeRedirectionTerm><amountPaid>0.0</amountPaid><serviceId>"
				+ ServiceId
				+ "</serviceId><rootOrderItemId></rootOrderItemId><productPartNum>mbundle040074</productPartNum><parentOrderItemId></parentOrderItemId><itemId>ONL0002678103-OI-1-8</itemId><customerRequestedDate>2016-12-12T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><instanceId>" + row_id.get("INSTANCE_ID").get(0)
				+ "</instanceId><actionCode>Delete</actionCode><ListOfOrderItemXA/></OrderItem></ListOfOrderItem></Order></ListOfOrder></CustomerOrderMessage></SubmitCustomerOrderRequest>";
		System.out.println("RESIGNXML : " + RESIGNXML);
		return RESIGNXML;
	}

	public String getWirelessXML(HashMap<String, List<String>> row_id) {
		System.out.println(row_id);
		String FibreXML = "<notifyServiceOrderV2Request><messageHeader><user>T823145</user><transactionId>SBL_1-GMIY8GB</transactionId><timestamp>2016-10-25T06:47:15Z</timestamp><processContext>BPM8-22008</processContext><lineOfBusiness>Spark</lineOfBusiness><application>OrderManager</application></messageHeader><Order><mode>GENERAL</mode><Exception><description/><code/></Exception><orderReceivedDateTime>2016-10-25T06:45:23.000Z</orderReceivedDateTime><orderNum>"
				+ row_id.get("ORDER_NUM").get(0) + "</orderNum><orderID>" + row_id.get("ORDER_ID").get(0)
				+ "</orderID><orderAim>" + row_id.get("ORDER_AIM").get(0)
				+ "</orderAim><omOrderID>7294016865</omOrderID><Status>Complete</Status>";
		for (int j2 = 0; j2 < row_id.get("PRFLAG").size(); j2++) {
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("N")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("Y")
					&& !row_id.get("NAME").get(j2).contains("Voice")) {
				System.out.println("SHIPFLAG : " + row_id.get("NAME").get(j2));
				FibreXML = FibreXML
						+ "<OrderItem><lastUpdatedDateTime>2016-10-25T06:47:15.074Z</lastUpdatedDateTime><status>Complete</status><serviceActivationDate>2016-10-25T06:47:15.000Z</serviceActivationDate><rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</rootproductID><provisionPONRflag>N</provisionPONRflag><prodSpecID>mSIMWirelessAPS</prodSpecID><prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2) + "</prodInstantID><parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2) + "</parentproductID><itemId>"
						+ row_id.get("ROW_ID").get(j2) + "</itemId><chargeAggregationID>"
						+ row_id.get("SERVICE_NUM").get(j2)
						+ "</chargeAggregationID><shippingPONRflag>Y</shippingPONRflag><LineItemsXA><value>SIM_RES_001</value><name>simReservationId</name><action/></LineItemsXA><LineItemsXA><value>530052192736336</value><name>imsi</name><action/></LineItemsXA></OrderItem>";
				// System.out.println(row_id.get("PRFLAG").get(j2));
				// FibreXML = FibreXML + System.lineSeparator();
			}
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("N")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("Y")
					&& row_id.get("NAME").get(j2).contains("Voice")) {
				System.out.println("SHIPFLAG : " + row_id.get("NAME").get(j2));
				FibreXML = FibreXML
						+ "<OrderItem><lastUpdatedDateTime>2016-10-25T06:47:15.074Z</lastUpdatedDateTime><status>Complete</status><serviceActivationDate>2016-10-25T06:47:15.000Z</serviceActivationDate><rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</rootproductID><provisionPONRflag>N</provisionPONRflag><prodSpecID>mSIMWirelessAPS</prodSpecID><prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2) + "</prodInstantID><parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2) + "</parentproductID><itemId>"
						+ row_id.get("ROW_ID").get(j2) + "</itemId><chargeAggregationID>"
						+ row_id.get("SERVICE_NUM").get(j2)
						+ "</chargeAggregationID><shippingPONRflag>Y</shippingPONRflag><LineItemsXA><value>SIM_RES_001</value><name>simReservationId</name><action/></LineItemsXA><LineItemsXA><value>530052192736336</value><name>imsi</name><action/></LineItemsXA></OrderItem>";
				// System.out.println(row_id.get("PRFLAG").get(j2));
				// FibreXML = FibreXML + System.lineSeparator();
			}
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("N")
					&& !row_id.get("NAME").get(j2).contains("Voice")) {
				System.out.println("PRFLAG : " + row_id.get("NAME").get(j2));
				FibreXML = FibreXML
						+ "<OrderItem><lastUpdatedDateTime>2016-10-25T06:47:15.088Z</lastUpdatedDateTime><status>Complete</status><serviceActivationDate>2016-10-25T06:47:15.000Z</serviceActivationDate><rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</rootproductID><provisionPONRflag>Y</provisionPONRflag><prodSpecID>mhuawei120577APS</prodSpecID><prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2) + "</prodInstantID><parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2) + "</parentproductID><itemId>"
						+ row_id.get("ROW_ID").get(j2) + "</itemId><chargeAggregationID>"
						+ row_id.get("SERVICE_NUM").get(j2)
						+ "</chargeAggregationID><shippingPONRflag>N</shippingPONRflag></OrderItem>";
				// System.out.println(row_id.get("PRFLAG").get(j2));
				// FibreXML = FibreXML + System.lineSeparator();
			}
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("N")
					&& row_id.get("NAME").get(j2).contains("Voice")) {
				System.out.println("PRFLAG : " + row_id.get("NAME").get(j2));
				FibreXML = FibreXML
						+ "<OrderItem><lastUpdatedDateTime>2016-10-25T06:47:15.088Z</lastUpdatedDateTime><status>Complete</status><serviceActivationDate>2016-10-25T06:47:15.000Z</serviceActivationDate><rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</rootproductID><provisionPONRflag>Y</provisionPONRflag><prodSpecID>mhuawei120577APS</prodSpecID><prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2) + "</prodInstantID><parentproductID>"
						+ row_id.get("PARENTPRODUCT_ID").get(j2) + "</parentproductID><itemId>"
						+ row_id.get("ROW_ID").get(j2) + "</itemId><chargeAggregationID>"
						+ row_id.get("SERVICE_NUM").get(j2)
						+ "</chargeAggregationID><shippingPONRflag>N</shippingPONRflag></OrderItem>";

				if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
						&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("Y")) {
					System.out.println("SHIPFLAG And PRFLAG: " + row_id.get("NAME").get(j2));
					FibreXML = FibreXML
							+ "<OrderItem><lastUpdatedDateTime>2016-10-25T06:47:15.074Z</lastUpdatedDateTime><status>Complete</status><serviceActivationDate>2016-10-25T06:47:15.000Z</serviceActivationDate><rootproductID>"
							+ row_id.get("ROOTPRODUCT_ID").get(j2)
							+ "</rootproductID><provisionPONRflag>Y</provisionPONRflag><prodSpecID>mSIMWirelessAPS</prodSpecID><prodInstantID>"
							+ row_id.get("ASSET_ID").get(j2)
							+ "</prodInstantID><parentproductID></parentproductID><itemId>"
							+ row_id.get("ROW_ID").get(j2)
							+ "</itemId><shippingPONRflag>Y</shippingPONRflag><LineItemsXA><value>SIM_RES_001</value><name>simReservationId</name><action/></LineItemsXA><LineItemsXA><value>530052192736336</value><name>imsi</name><action/></LineItemsXA></OrderItem>";

				}

			}
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("Y")) {
				System.out.println("SHIPFLAG & PRFLAG : " + row_id.get("NAME").get(j2));
				FibreXML = FibreXML
						+ "<OrderItem><lastUpdatedDateTime>2016-10-25T06:47:15.088Z</lastUpdatedDateTime><status>Complete</status><serviceActivationDate>2016-10-25T06:47:15.000Z</serviceActivationDate><rootproductID>"
						+ row_id.get("ROOTPRODUCT_ID").get(j2)
						+ "</rootproductID><provisionPONRflag>Y</provisionPONRflag><prodSpecID>mhuawei120577APS</prodSpecID><prodInstantID>"
						+ row_id.get("ASSET_ID").get(j2) + "</prodInstantID><parentproductID>"
						+ "</parentproductID><itemId>" + row_id.get("ROW_ID").get(j2)
						+ "</itemId><shippingPONRflag>N</shippingPONRflag></OrderItem>";
				// System.out.println(row_id.get("PRFLAG").get(j2));
				// FibreXML = FibreXML + System.lineSeparator();
			}
		}
		FibreXML = FibreXML + "</Order></notifyServiceOrderV2Request>";
		System.out.println("Wireless New Connect xml : " + FibreXML);
		return FibreXML;

	}

	public String getAccessOnlyXML(HashMap<String, List<String>> row_id) {
		System.out.println(row_id);
		String NOXML = "<notifyServiceOrderV2Request><messageHeader><user>T966860</user><transactionId>SBL_1-M3ZJVVX</transactionId><timestamp>2017-02-26T23:51:30Z</timestamp><processContext>BPM8-22008</processContext><lineOfBusiness>Spark Digital</lineOfBusiness><application>OrderManager</application></messageHeader><Order><mode>GENERAL</mode><Exception><description/><code/></Exception><orderReceivedDateTime>2017-02-26T23:45:43.000Z</orderReceivedDateTime>"
				+ "<orderNum>" + row_id.get("ORDER_NUM").get(0) + "</orderNum>" + "<orderID>"
				+ row_id.get("ORDER_ID").get(0) + "</orderID>" + "<orderAim>" + row_id.get("ORDER_AIM").get(0)
				+ "</orderAim><omOrderID>7401186021</omOrderID><Status>Complete</Status>";

		for (int j2 = 0; j2 < row_id.get("PRFLAG").size(); j2++) {
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("N")) {
				System.out.println("PRFLAG : " + row_id.get("NAME").get(j2));

				if (row_id.get("NAME").get(j2).equals("BS3 Fibre Access")
						|| row_id.get("NAME").get(j2).equals("WAN Service Offer")) {
					System.out.println("PRFLAG : " + row_id.get("NAME").get(j2));
					NOXML = NOXML
							+ "<OrderItem><lastUpdatedDateTime>2017-02-26T23:51:30.918Z</lastUpdatedDateTime><status>Complete</status><rootproductID>"
							+ row_id.get("ROOTPRODUCT_ID").get(j2)
							+ "</rootproductID><provisionPONRflag>Y</provisionPONRflag><prodSpecID>bs3FibreAccessAPS</prodSpecID><prodInstantID>"
							+ row_id.get("ASSET_ID").get(j2)
							+ "</prodInstantID><parentproductID></parentproductID><originalPlannedCompletionDate>2017-02-27T11:00:00.000Z</originalPlannedCompletionDate><itemId>"
							+ row_id.get("ROW_ID").get(j2)
							+ "</itemId><currentPlannedCompletionDate>2017-02-27T11:00:00.000Z</currentPlannedCompletionDate><shippingPONRflag>N</shippingPONRflag><chargeAggregationID>"
							+ row_id.get("SERVICE_NUM").get(j2)
							+ "</chargeAggregationID><serviceActivationDate>2017-05-10T06:36:33.000Z</serviceActivationDate></OrderItem>";
				} else {
					NOXML = NOXML
							+ "<OrderItem><lastUpdatedDateTime>2017-02-26T23:51:30.918Z</lastUpdatedDateTime><status>Complete</status><rootproductID>"
							+ row_id.get("ROOTPRODUCT_ID").get(j2)
							+ "</rootproductID><provisionPONRflag>Y</provisionPONRflag><prodSpecID>bs3FibreAccessAPS</prodSpecID><prodInstantID>"
							+ row_id.get("ASSET_ID").get(j2)
							+ "</prodInstantID><parentproductID></parentproductID><originalPlannedCompletionDate>2017-02-27T11:00:00.000Z</originalPlannedCompletionDate><itemId>"
							+ row_id.get("ROW_ID").get(j2)
							+ "</itemId><currentPlannedCompletionDate>2017-02-27T11:00:00.000Z</currentPlannedCompletionDate><shippingPONRflag>N</shippingPONRflag><serviceActivationDate>2017-05-10T06:36:33.000Z</serviceActivationDate></OrderItem>";
				}
			}
		}

		NOXML = NOXML + "</Order></notifyServiceOrderV2Request>";
		System.out.println("New Offer xml : " + NOXML);
		return NOXML;
	}

	/* Returns a random number */
	public String getRandomNumber() {
		String randomNumber = Integer.toString(showRandomInteger());
		return randomNumber;
	}

	public int showRandomInteger() {
		Random aRandom = new Random();
		// get the range, casting to long to avoid overflow problems
		long range = (long) 9999999 - (long) 1000000 + 1;
		// compute a fraction of the range, 0 <= frac < range
		long fraction = (long) (range * aRandom.nextDouble());
		int randomNumber = (int) (fraction + 1000000);
		return randomNumber;
	}

	public String getAccessAndServiceOfferXML(HashMap<String, List<String>> row_id) {
		System.out.println(row_id);
		String serviceNum = getRandomNumber();
		String NOXML = "<notifyServiceOrderV2Request><messageHeader><user>T966860</user><transactionId>SBL_1-M3ZJVVX</transactionId><timestamp>2017-02-26T23:51:30Z</timestamp><processContext>BPM8-22008</processContext><lineOfBusiness>Spark Digital</lineOfBusiness><application>OrderManager</application></messageHeader><Order><mode>GENERAL</mode><Exception><description/><code/></Exception><orderReceivedDateTime>2017-02-26T23:45:43.000Z</orderReceivedDateTime>"
				+ "<orderNum>" + row_id.get("ORDER_NUM").get(0) + "</orderNum>" + "<orderID>"
				+ row_id.get("ORDER_ID").get(0) + "</orderID>" + "<orderAim>" + row_id.get("ORDER_AIM").get(0)
				+ "</orderAim><omOrderID>7401186021</omOrderID><Status>Complete</Status>";

		for (int j2 = 0; j2 < row_id.get("PRFLAG").size(); j2++) {
			if (row_id.get("PRFLAG").get(j2).equalsIgnoreCase("Y")
					&& !row_id.get("ACTION").get(j2).equalsIgnoreCase("-")
					&& row_id.get("SHIPFLAG").get(j2).equalsIgnoreCase("N")) {
				System.out.println("PRFLAG : " + row_id.get("NAME").get(j2));

				if (row_id.get("NAME").get(j2).equals("BS3 Fibre Access")
						|| row_id.get("NAME").get(j2).equals("BS4 Fibre Access")
						|| row_id.get("NAME").get(j2).equals("HSNS Lite Fibre Access")
						|| row_id.get("NAME").get(j2).equals("WAN Service Offer")
						|| row_id.get("NAME").get(j2).equals("Internet Service Plus Promotion Offer")
						|| row_id.get("NAME").get(j2).equals("Managed VPN Configuration")) {
					System.out.println("PRFLAG : " + row_id.get("NAME").get(j2));
					NOXML = NOXML
							+ "<OrderItem><lastUpdatedDateTime>2017-02-26T23:51:30.918Z</lastUpdatedDateTime><status>Complete</status><rootproductID>"
							+ row_id.get("ROOTPRODUCT_ID").get(j2)
							+ "</rootproductID><provisionPONRflag>Y</provisionPONRflag><prodSpecID>bs3FibreAccessAPS</prodSpecID><prodInstantID>"
							+ row_id.get("ASSET_ID").get(j2) + "</prodInstantID><parentproductID>"
							+ row_id.get("PARENTPRODUCT_ID").get(j2)
							+ "</parentproductID><originalPlannedCompletionDate>2017-02-27T11:00:00.000Z</originalPlannedCompletionDate><itemId>"
							+ row_id.get("ROW_ID").get(j2)
							+ "</itemId><currentPlannedCompletionDate>2017-02-27T11:00:00.000Z</currentPlannedCompletionDate><shippingPONRflag>N</shippingPONRflag><chargeAggregationID>"
							+ serviceNum
							+ "</chargeAggregationID><serviceActivationDate>2017-05-10T06:36:33.000Z</serviceActivationDate></OrderItem>";
				} else {
					NOXML = NOXML
							+ "<OrderItem><lastUpdatedDateTime>2017-02-26T23:51:30.918Z</lastUpdatedDateTime><status>Complete</status><rootproductID>"
							+ row_id.get("ROOTPRODUCT_ID").get(j2)
							+ "</rootproductID><provisionPONRflag>Y</provisionPONRflag><prodSpecID>bs3FibreAccessAPS</prodSpecID><prodInstantID>"
							+ row_id.get("ASSET_ID").get(j2) + "</prodInstantID><parentproductID>"
							+ row_id.get("PARENTPRODUCT_ID").get(j2)
							+ "</parentproductID><originalPlannedCompletionDate>2017-02-27T11:00:00.000Z</originalPlannedCompletionDate><itemId>"
							+ row_id.get("ROW_ID").get(j2)
							+ "</itemId><currentPlannedCompletionDate>2017-02-27T11:00:00.000Z</currentPlannedCompletionDate><shippingPONRflag>N</shippingPONRflag><serviceActivationDate>2017-05-10T06:36:33.000Z</serviceActivationDate></OrderItem>";
				}
			}
		}

		NOXML = NOXML + "</Order></notifyServiceOrderV2Request>";
		System.out.println("New Offer xml : " + NOXML);
		return NOXML;
	}

	public String getLegacyProductXML(String Promotion, String CustomerNumber, String AccountNumber, String Date,
			String serviceID) {
		String LegacyProductXML = "<assetManagementJMSRequest><messageHeader><user>ICMS</user><transactionId>2016021717552709</transactionId><timestamp>2017-03-28T23:01:00.985Z</timestamp><processContext>BPM8-21042</processContext><lineOfBusiness>Retail</lineOfBusiness><application>ICMS</application></messageHeader><AssetMgmt-Asset><Mode>UPDATE</Mode><AssetNumber>043669</AssetNumber><ProductName>"
				+ Promotion + "</ProductName><SerialNumber>" + serviceID + "</SerialNumber><StartDate>" + Date
				+ "</StartDate><ServiceType>MOBILE</ServiceType><ServiceCustNumber>" + CustomerNumber
				+ "</ServiceCustNumber><PrimaryLineFlag>Y</PrimaryLineFlag><DirectoryListingCode>UL</DirectoryListingCode><BillingAccountNumber>"
				+ AccountNumber + "</BillingAccountNumber><CustomerNumber>" + CustomerNumber
				+ "</CustomerNumber></AssetMgmt-Asset></assetManagementJMSRequest>";
		System.out.println("LegacyProductXML : " + LegacyProductXML);
		return LegacyProductXML;
	}

	public String getLegacyProductInactivateXML(Document legacyProductRequest) {

		doc = legacyProductRequest;
		String InactivateLegacyProductXML = "<assetManagementJMSRequest><messageHeader><user>ICMS</user><transactionId>2016021717552709</transactionId><timestamp>2017-03-28T23:01:00.985Z</timestamp><processContext>BPM8-21042</processContext><lineOfBusiness>Retail</lineOfBusiness><application>ICMS</application></messageHeader><AssetMgmt-Asset><Mode>INSERT</Mode><AssetNumber>"
				+ getAttributeValue("SerialNumber", 0) + " " + "_1" + "</AssetNumber><ProductName>"
				+ getAttributeValue("ProductName", 0) + "</ProductName><SerialNumber>"
				+ getAttributeValue("SerialNumber", 0) + "</SerialNumber><StartDate>"
				+ getAttributeValue("StartDate", 0) + "</StartDate><ServiceType>MOBILE</ServiceType><ServiceCustNumber>"
				+ getAttributeValue("ServiceCustNumber", 0)
				+ "</ServiceCustNumber><PrimaryLineFlag>Y</PrimaryLineFlag><DirectoryListingCode>UL</DirectoryListingCode><BillingAccountNumber>"
				+ getAttributeValue("BillingAccountNumber", 0) + "</BillingAccountNumber><CustomerNumber>"
				+ getAttributeValue("CustomerNumber", 0)
				+ "</CustomerNumber></AssetMgmt-Asset></assetManagementJMSRequest>";
		System.out.println("LegacyProductXML : " + InactivateLegacyProductXML);
		return InactivateLegacyProductXML;
	}

	public String getLegacyProductUpdateXML(String Promotion, String CustomerNumber, String AccountNumber,
			String PartNum, String Date, String serviceID) {
		String LegacyProductXML = "<assetManagementJMSRequest><messageHeader><user>ICMS</user><transactionId>2016021717552709</transactionId><timestamp>2017-03-28T23:01:00.985Z</timestamp><processContext>BPM8-21042</processContext><lineOfBusiness>Retail</lineOfBusiness><application>ICMS</application></messageHeader><AssetMgmt-Asset><Mode>UPDATE</Mode><AssetNumber>043669</AssetNumber><ProductName>"
				+ Promotion + "</ProductName><SerialNumber>" + serviceID + "</SerialNumber><StartDate>" + Date
				+ "</StartDate><ServiceType>MOBILE</ServiceType><ServiceCustNumber>" + CustomerNumber
				+ "</ServiceCustNumber><PrimaryLineFlag>Y</PrimaryLineFlag><DirectoryListingCode>UL</DirectoryListingCode><BillingAccountNumber>"
				+ AccountNumber + "</BillingAccountNumber><CustomerNumber>" + CustomerNumber
				+ "</CustomerNumber></AssetMgmt-Asset></assetManagementJMSRequest>";
		System.out.println("LegacyProductXML : " + LegacyProductXML);
		return LegacyProductXML;
	}

	public String getCutoFibreXML(String CustomerNumber, String AccountNumber, String serviceID) {
		String CutoFibreXML = "<SubmitCustomerOrderRequest><CustomerOrderMessage><messageHeader><transactionId>rHbajkwU1bqmxUbu5iaXSgggtIyR0L</transactionId><timestamp>2017-03-13T04:03:01.000Z</timestamp><application>ONLINE</application><user>TNZ Test User</user><processContext>BPM8-22106</processContext><lineOfBusiness>Spark</lineOfBusiness></messageHeader><ListOfOrder><Order><toCustomerNumber/><toBillingAccountNumber/><payToAccountNum/><billingReferenceID/><submitOrderFlag>N</submitOrderFlag><status>Hold</status><holdReason>Inflight ICMS Order</holdReason><serviceOrderId>2676967951</serviceOrderId><salesChannelName>TNZOnlineStore</salesChannelName><contactPreferredMethod>Email</contactPreferredMethod><preOrderId>2225555123</preOrderId><customerRequestedDate>2017-03-31T12:00:00.000Z</customerRequestedDate><orderDate>2017-03-13</orderDate><orderContext>Copper To Fibre New Address</orderContext><orderAim>New Offer</orderAim><legacyServiceType>FIXED VOICE/BB-BBA</legacyServiceType><legacyServiceId>"
				+ serviceID + "</legacyServiceId><externalOrderNumber>suda1</externalOrderNumber><customerNumber>"
				+ CustomerNumber
				+ "</customerNumber><contactMobilePhone>09844852146</contactMobilePhone><contactLastName>ONLCU</contactLastName><contactFirstName>TEST</contactFirstName><contactEmailAddress>geeta.tiwari@spark.co.nz</contactEmailAddress><billingAccountNumber>"
				+ AccountNumber
				+ "</billingAccountNumber><SiteDetails><availability>Active</availability><consentStatus>Unknown</consentStatus><dwellingType>Unknown</dwellingType><installType>Unknown</installType><rightOfWay>Yes</rightOfWay></SiteDetails><ListOfPayments/><ListOfLocation><Location><nztmY>5674661.516</nztmY><nztmX>1694410.769</nztmX><verifiedstatus>Unverified</verifiedstatus><terrAuthName>NEW PLYMOUTH DISTRICT</terrAuthName><tui>1001693474</tui><streetType>AVENUE</streetType><streetNrLast>229</streetNrLast><streetNrFirst>229</streetNrFirst><streetName>Coronation</streetName><samid/><region>TARANAKI REGION</region><postCode>4310</postCode><longitude>174.0913914</longitude><locality>Welbourn</locality><latitude>-39.0720463</latitude><elid>301079000</elid><dpid>1001693474</dpid><townOrCity>New Plymouth</townOrCity><addressType>Street</addressType><role>Physical</role><addressLine4>New Plymouth 4310</addressLine4><addressLine3>Welbourn</addressLine3><addressLine1>229 Coronation Avenue</addressLine1><locationId>CON_jXiwUZ3auXw</locationId></Location></ListOfLocation><ListOfOrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceId>"
				+ serviceID
				+ "</serviceId><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId/><provisionableFlag>N</provisionableFlag><productPartNum>bvbundle002065</productPartNum><parentOrderItemId/><itemId>6</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>Y</provisionableFlag><productPartNum>miscfee002217</productPartNum><parentOrderItemId>21</parentOrderItemId><itemId>7</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>Y</provisionableFlag><productPartNum>misc002154</productPartNum><parentOrderItemId>6</parentOrderItemId><itemId>8</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><rootOrderItemId>6</rootOrderItemId><provisionableFlag>N</provisionableFlag><productPartNum>discount020740</productPartNum><parentOrderItemId>14</parentOrderItemId><manualPriceOverride/><manualDiscountPercent/><manualDiscountAmount>299.0</manualDiscountAmount><manualAdjustmentReason>Current Promotion</manualAdjustmentReason><itemId>Discount14</itemId><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>Y</provisionableFlag><productPartNum>fees002409</productPartNum><parentOrderItemId>21</parentOrderItemId><itemId>14</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>N</provisionableFlag><productPartNum>baccess002001</productPartNum><parentOrderItemId>6</parentOrderItemId><itemId>15</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>N</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>Y</provisionableFlag><productPartNum>baccess002410</productPartNum><parentOrderItemId>15</parentOrderItemId><itemId>16</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>N</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA><OrderItemXA><value>Primary</value><name>primaryAccess</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>None</value><name>replaceInd</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>UFF</value><name>accessProviderId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>Spark</value><name>serviceProvider</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>118134423</value><name>ontId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>Residential Fibre</value><name>offerType</name><actionCode>Add</actionCode></OrderItemXA></ListOfOrderItemXA></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceId>"
				+ serviceID
				+ "</serviceId><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>Y</provisionableFlag><productPartNum>baccess002002</productPartNum><parentOrderItemId>15</parentOrderItemId><itemId>17</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>N</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA><OrderItemXA><value>FBBI</value><name>serviceGuidingIdType</name><actionCode>Add</actionCode></OrderItemXA></ListOfOrderItemXA></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>N</provisionableFlag><productPartNum>vaccess002001</productPartNum><parentOrderItemId>6</parentOrderItemId><itemId>18</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>N</provisionableFlag><productPartNum>vfeature002169</productPartNum><parentOrderItemId>18</parentOrderItemId><itemId>19</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA><OrderItemXA><value>Primary</value><name>primaryAccess</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>None</value><name>replaceInd</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>UFF</value><name>accessProviderId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>Spark</value><name>serviceProvider</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>118134423</value><name>ontId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>Residential Fibre</value><name>offerType</name><actionCode>Add</actionCode></OrderItemXA></ListOfOrderItemXA></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceId>"
				+ serviceID
				+ "</serviceId><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>N</provisionableFlag><productPartNum>vaccess002186</productPartNum><parentOrderItemId>18</parentOrderItemId><listingOption>Unlisted</listingOption><itemId>20</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA><OrderItemXA><value>Primary</value><name>numberRanking</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>FGDN</value><name>serviceGuidingIdType</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>"
				+ serviceID
				+ "</value><name>serviceGuidingId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>RE_20170313_000450769</value><name>reservationId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>2017-07-11</value><name>reservationExpiry</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>CuToFibre</value><name>numberSource</name><actionCode>Add</actionCode></OrderItemXA></ListOfOrderItemXA></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>N</provisionableFlag><productPartNum>misc020682</productPartNum><parentOrderItemId>6</parentOrderItemId><itemId>21</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>N</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem></ListOfOrderItem></Order></ListOfOrder></CustomerOrderMessage></SubmitCustomerOrderRequest>";

		System.out.println("CutoFibreXML : " + CutoFibreXML);
		return CutoFibreXML;
	}

	public String getCutoWirelessXML(String CustomerNumber, String AccountNumber, String serviceID) {
		String CutoFibreXML = "<SubmitCustomerOrderRequest><CustomerOrderMessage><messageHeader><transactionId>rHbajkwU1bqmxUbu5iaXSgggtIyR0L</transactionId><timestamp>2017-03-13T04:03:01.000Z</timestamp><application>ONLINE</application><user>TNZ Test User</user><processContext>BPM8-22106</processContext><lineOfBusiness>Spark</lineOfBusiness></messageHeader><ListOfOrder><Order><toCustomerNumber/><toBillingAccountNumber/><payToAccountNum/><billingReferenceID/><submitOrderFlag>Y</submitOrderFlag><serviceOrderId>2676967951</serviceOrderId><salesChannelName>TNZOnlineStore</salesChannelName><contactPreferredMethod>Email</contactPreferredMethod><preOrderId>2225555123</preOrderId><customerRequestedDate>2017-03-31T12:00:00.000Z</customerRequestedDate><orderDate>2017-04-17</orderDate><orderContext>Copper - Wireless New Address</orderContext><orderAim>New Offer</orderAim><legacyServiceType>FIXED VOICE/BB-BBA</legacyServiceType><legacyServiceId>"
				+ serviceID + "</legacyServiceId><externalOrderNumber>Km0007</externalOrderNumber><customerNumber>"
				+ CustomerNumber
				+ "</customerNumber><contactMobilePhone>02343212323</contactMobilePhone><contactLastName>M</contactLastName><contactFirstName>K</contactFirstName><contactEmailAddress>k.m@spark.co.nz</contactEmailAddress><billingAccountNumber>"
				+ AccountNumber
				+ "</billingAccountNumber><SiteDetails><availability>Active</availability><consentStatus>Unknown</consentStatus><dwellingType>Unknown</dwellingType><installType>Unknown</installType><rightOfWay>Yes</rightOfWay></SiteDetails><ListOfPayments/><ListOfLocation><Location><nztmY>5674661.516</nztmY><nztmX>1694410.769</nztmX><verifiedstatus>Unverified</verifiedstatus><terrAuthName>NEW PLYMOUTH DISTRICT</terrAuthName><tui>1001693474</tui><streetType>AVENUE</streetType><streetNrLast>229</streetNrLast><streetNrFirst>229</streetNrFirst><streetName>Coronation</streetName><samid/><region>TARANAKI REGION</region><postCode>4310</postCode><longitude>174.0913914</longitude><locality>Welbourn</locality><latitude>-39.0720463</latitude><elid>301742642</elid><dpid>1001693474</dpid><townOrCity>New Plymouth</townOrCity><addressType>Street</addressType><role>Physical</role><addressLine4>New Plymouth 4310</addressLine4><addressLine3>Welbourn</addressLine3><addressLine1>229 Coronation Avenue</addressLine1><locationId>CON_jXiwUZ3auXw</locationId></Location></ListOfLocation><ListOfOrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceId>"
				+ serviceID
				+ "</serviceId><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId/><provisionableFlag>N</provisionableFlag><productPartNum>fwvbundle050068</productPartNum><parentOrderItemId/><itemId>6</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>Y</shippableFlag><shipToAddressId/><serviceId>"
				+ serviceID
				+ "</serviceId><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>N</provisionableFlag><productPartNum>SIMWirelessBBSPO</productPartNum><parentOrderItemId>15</parentOrderItemId><itemId>16</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA><OrderItemXA><value>Primary</value><name>primaryAccess</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>None</value><name>replaceInd</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>UFF</value><name>accessProviderId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>Spark</value><name>serviceProvider</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>118134423</value><name>ontId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>Residential Fibre</value><name>offerType</name><actionCode>Add</actionCode></OrderItemXA></ListOfOrderItemXA></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceId>"
				+ serviceID
				+ "</serviceId><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>Y</provisionableFlag><productPartNum>misc040789</productPartNum><parentOrderItemId>15</parentOrderItemId><itemId>17</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA><OrderItemXA><value>FBBI</value><name>serviceGuidingIdType</name><actionCode>Add</actionCode></OrderItemXA></ListOfOrderItemXA></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>N</provisionableFlag><productPartNum>vcalling040821</productPartNum><parentOrderItemId>6</parentOrderItemId><itemId>18</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>Y</provisionableFlag><productPartNum>vfeature020976</productPartNum><parentOrderItemId>18</parentOrderItemId><itemId>19</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA><OrderItemXA><value>Primary</value><name>primaryAccess</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>None</value><name>replaceInd</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>UFF</value><name>accessProviderId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>Spark</value><name>serviceProvider</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>118134423</value><name>ontId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>Residential Fibre</value><name>offerType</name><actionCode>Add</actionCode></OrderItemXA></ListOfOrderItemXA></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><shipToAddressId/><serviceId>"
				+ serviceID
				+ "</serviceId><serviceAddressId>CON_jXiwUZ3auXw</serviceAddressId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>Y</provisionableFlag><productPartNum>vaccess002186</productPartNum><parentOrderItemId>18</parentOrderItemId><listingOption>Unlisted</listingOption><itemId>20</itemId><customerRequestedDate>2017-03-13T11:00:00.000Z</customerRequestedDate><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA><OrderItemXA><value>Primary</value><name>numberRanking</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>FGDN</value><name>serviceGuidingIdType</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>"
				+ serviceID
				+ "</value><name>serviceGuidingId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>RE_20170313_000450769</value><name>reservationId</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>2017-07-11</value><name>reservationExpiry</name><actionCode>Add</actionCode></OrderItemXA><OrderItemXA><value>CuToFibre</value><name>numberSource</name><actionCode>Add</actionCode></OrderItemXA></ListOfOrderItemXA></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>Y</shippableFlag><shipToAddressId>SHP_QmnYpEcI49O</shipToAddressId><serviceAddressId/><serviceId>"
				+ serviceID
				+ "</serviceId><rootOrderItemId>6</rootOrderItemId><provisionableFlag>N</provisionableFlag><productPartNum>huawei121040SPO</productPartNum><parentOrderItemId>6</parentOrderItemId><itemId>21</itemId><customerRequestedDate>2017-09-21T12:00:00.000Z</customerRequestedDate> <customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem><OrderItem><payToAccountNum/><chargeRedirectionTermUnit/><chargeRedirectionTerm/><amountPaid>0.0</amountPaid><shippableFlag>N</shippableFlag><rootOrderItemId>6</rootOrderItemId><provisionableFlag>N</provisionableFlag><productPartNum>miscfee002183</productPartNum><parentOrderItemId>21</parentOrderItemId><itemId>22</itemId><itemId>Delivery7</itemId><customerNumber>"
				+ CustomerNumber + "</customerNumber><billingAccountNumber>" + AccountNumber
				+ "</billingAccountNumber><billableFlag>Y</billableFlag><instanceId/><actionCode>Add</actionCode><ListOfOrderItemXA/></OrderItem></ListOfOrderItem></Order></ListOfOrder></CustomerOrderMessage></SubmitCustomerOrderRequest>";

		System.out.println("CutoFibreXML : " + CutoFibreXML);
		return CutoFibreXML;
	}

	/* Author:Ankita */
	public String getPortOutXML(String duedate, String assetIntegrationId, String productSpecId) {

		String portOutXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:cus="
				+ "'http://siebel.com/CustomUI' xmlns:tnz='http://www.siebel.com/xml/TNZProductIO'><soapenv:Header/><soapenv:Body>"
				+ "<cus:activatePortTransfer_Input><cus:transactionId>NPM20000023803699</cus:transactionId><cus:lineOfBusiness>"
				+ "Spark</cus:lineOfBusiness><cus:application>NPM</cus:application><cus:timestamp>2017-12-28T09:44:35.000Z"
				+ "</cus:timestamp><tnz:PortTransferNotification><tnz:requestID>NPM_NPI20000023803699</tnz:requestID> "
				+ "<tnz:dueDateTime>" + duedate
				+ "T10:12:04.000Z</tnz:dueDateTime><tnz:action>Activate</tnz:action><!--Optional:-->"
				+ "<tnz:noticeDate>2017-12-28T08:21:02.000Z</tnz:noticeDate><!--1 or more repetitions:--><tnz:products>"
				+ "<tnz:assetIntegrationId>" + assetIntegrationId + "</tnz:assetIntegrationId><tnz:requestType>Port Out"
				+ "</tnz:requestType><!--Optional:--><tnz:lineNumber>078340162</tnz:lineNumber><tnz:secondaryVOF>N"
				+ "</tnz:secondaryVOF><!--Optional:--><tnz:portType>Simple</tnz:portType><tnz:productSpecId>"
				+ productSpecId
				+ "</tnz:productSpecId><!--Optional:--><tnz:isEmergencyReturn>N</tnz:isEmergencyReturn><!--Optional:-->"
				+ "<tnz:portingID>5510209</tnz:portingID></tnz:products></tnz:PortTransferNotification><cus:user>T967827</cus:user>"
				+ "<cus:processContext>NPM_PROCESS_ORDER_PORT_OUT</cus:processContext><cus:Error_spcCode></cus:Error_spcCode>"
				+ "<cus:Error_spcMessage></cus:Error_spcMessage></cus:activatePortTransfer_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println("Request:" + portOutXML);
		return portOutXML;
	}

	public String getMaintainCustomerAccountPayment_DirectDebitXML(String AccountNumber, String PaymentType,
			String StartDate, String ID) {
		String directDebitOnlinePaymentXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:main='http://siebel.com/MaintainCustomerAccount' xmlns:acc='http://www.siebel.com/xml/AccountPaymentProfileIO'><soapenv:Header><UsernameToken xmlns='http://siebel.com/webservices'>T967991</UsernameToken><PasswordText xmlns='http://siebel.com/webservices'>winter27</PasswordText><SessionType xmlns='http://siebel.com/webservices'>None</SessionType></soapenv:Header><soapenv:Body><main:maintainCustomerAccountPaymentMethod_Input><main:Process_spcInstance_spcId></main:Process_spcInstance_spcId><main:transactionId></main:transactionId><main:lineOfBusiness></main:lineOfBusiness><main:application></main:application><main:timeStamp></main:timeStamp><main:Siebel_spcOperation_spcObject_spcId></main:Siebel_spcOperation_spcObject_spcId><main:user></main:user><acc:ListOfAccountPaymentProfile><acc:CutInvoiceSubAccounts><acc:AccountNumber>"
				+ AccountNumber
				+ "</acc:AccountNumber><acc:nextBillDate>11/29/2017</acc:nextBillDate><acc:ListOfOrganizationPaymentProfile><acc:OrganizationPaymentProfile><acc:Id>"
				+ ID
				+ "</acc:Id><acc:isOneOff>true</acc:isOneOff><acc:paymentMethodType>Direct Debit</acc:paymentMethodType><acc:paymentType>"
				+ PaymentType
				+ "</acc:paymentType><acc:amount>50.0</acc:amount><acc:channel>Online</acc:channel><acc:consent>Y</acc:consent><acc:ipAddress>Y</acc:ipAddress><acc:contactId>Ravi Kant</acc:contactId><acc:bankAccountName>ASB Bank Limited</acc:bankAccountName><acc:bankAccountNumber>0209503</acc:bankAccountNumber><acc:bankAccountSuffixNumber>00</acc:bankAccountSuffixNumber><acc:bankNumber>12</acc:bankNumber><acc:branchNumber>3188</acc:branchNumber><acc:branchName>Queenstown</acc:branchName><acc:validFromDate>"
				+ StartDate
				+ "T05:00:00:000Z</acc:validFromDate><acc:expirationDate></acc:expirationDate><acc:cardHolderName>AnjuJainAhya</acc:cardHolderName><acc:paymentStartDate>11/12/2017</acc:paymentStartDate></acc:OrganizationPaymentProfile></acc:ListOfOrganizationPaymentProfile></acc:CutInvoiceSubAccounts></acc:ListOfAccountPaymentProfile><main:processContext></main:processContext><main:Error_spcCode></main:Error_spcCode><main:Error_spcMessage></main:Error_spcMessage></main:maintainCustomerAccountPaymentMethod_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(directDebitOnlinePaymentXML);
		return directDebitOnlinePaymentXML;
	}

	public String getMaintainCustomerAccountPayment_DirectDebitXMLwithNoID(String AccountNumber, String StartDate,
			String PaymentType) {
		String directDebitOnlinePaymentXML = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:main='http://siebel.com/MaintainCustomerAccount' xmlns:acc='http://www.siebel.com/xml/AccountPaymentProfileIO'><soapenv:Header><UsernameToken xmlns='http://siebel.com/webservices'>T967991</UsernameToken><PasswordText xmlns='http://siebel.com/webservices'>winter27</PasswordText><SessionType xmlns='http://siebel.com/webservices'>None</SessionType></soapenv:Header><soapenv:Body><main:maintainCustomerAccountPaymentMethod_Input><main:Process_spcInstance_spcId></main:Process_spcInstance_spcId><main:transactionId></main:transactionId><main:lineOfBusiness></main:lineOfBusiness><main:application></main:application><main:timeStamp></main:timeStamp><main:Siebel_spcOperation_spcObject_spcId></main:Siebel_spcOperation_spcObject_spcId><main:user></main:user><acc:ListOfAccountPaymentProfile><acc:CutInvoiceSubAccounts><acc:AccountNumber>"
				+ AccountNumber
				+ "</acc:AccountNumber><acc:nextBillDate>11/29/2017</acc:nextBillDate><acc:ListOfOrganizationPaymentProfile><acc:OrganizationPaymentProfile><acc:Id></acc:Id><acc:isOneOff>true</acc:isOneOff><acc:paymentMethodType>Direct Debit</acc:paymentMethodType><acc:paymentType>"
				+ PaymentType
				+ "</acc:paymentType><acc:amount>50.0</acc:amount><acc:channel>Online</acc:channel><acc:consent>Y</acc:consent><acc:ipAddress>Y</acc:ipAddress><acc:contactId>Ravi Kant</acc:contactId><acc:bankAccountName>ASB Bank Limited</acc:bankAccountName><acc:bankAccountNumber>0209503</acc:bankAccountNumber><acc:bankAccountSuffixNumber>00</acc:bankAccountSuffixNumber><acc:bankNumber>12</acc:bankNumber><acc:branchNumber>3188</acc:branchNumber><acc:branchName>Queenstown</acc:branchName><acc:validFromDate>"
				+ StartDate
				+ "T05:00:00:000Z</acc:validFromDate><acc:expirationDate></acc:expirationDate><acc:cardHolderName>AnjuJainAhya</acc:cardHolderName><acc:paymentStartDate>11/12/2017</acc:paymentStartDate><acc:lastName>AutomationTC</acc:lastName><acc:companyName>TechM</acc:companyName><acc:contactPhoneNumber>96659</acc:contactPhoneNumber><acc:positionInCompany>Employee</acc:positionInCompany><acc:emailAddress>pqr@gmail.com</acc:emailAddress><acc:firstName>jain</acc:firstName></acc:OrganizationPaymentProfile></acc:ListOfOrganizationPaymentProfile></acc:CutInvoiceSubAccounts></acc:ListOfAccountPaymentProfile><main:processContext></main:processContext><main:Error_spcCode></main:Error_spcCode><main:Error_spcMessage></main:Error_spcMessage></main:maintainCustomerAccountPaymentMethod_Input></soapenv:Body></soapenv:Envelope>";
		System.out.println(directDebitOnlinePaymentXML);
		return directDebitOnlinePaymentXML;
	}

	/* Author:Ankita */
	public String getVPNOnlyXML(HashMap<String, List<String>> row_id) {

		System.out.println(row_id);
		String NOXML = "<?xml version='1.0' encoding='UTF-8'?><re:notifyServiceOrderV2Request xmlns:re='http://www.siebel.com/xml/notifyServiceOrderV2Request_2'><re:messageHeader><re:transactionId>1-8W3MH2</re:transactionId><re:timestamp>2015-06-05T23:06:41Z</re:timestamp><re:processContext>BPM8-22127</re:processContext><re:lineOfBusiness/><re:application>T-OM</re:application></re:messageHeader><re:Order><re:mode>GENERAL</re:mode><re:orderReceivedDateTime>2016-22-04T02:23:06.000Z</re:orderReceivedDateTime>"
				+ "<re:orderNum>" + row_id.get("ORDER_NUM").get(0) + "</re:orderNum>" + "<re:orderID>"
				+ row_id.get("ORDER_ID").get(0) + "</re:orderID>" + "<re:orderAim>" + row_id.get("ORDER_AIM").get(0)
				+ "</re:orderAim><re:omOrderID>2748640607</re:omOrderID><re:Status>Complete</re:Status>"
				+ "<re:OrderItem><re:status>Complete</re:status><re:rootproductID>"
				+ row_id.get("ROOTPRODUCT_ID").get(0)
				+ "</re:rootproductID><re:provisionPONRflag>Y</re:provisionPONRflag><re:prodSpecID>mobileservicespecAPS</re:prodSpecID><re:prodInstantID>"
				+ row_id.get("ASSET_ID").get(0)
				+ "</re:prodInstantID><re:phase>Provisioning</re:phase><re:parentproductID>"
				+ row_id.get("PARENTPRODUCT_ID").get(0)
				+ "</re:parentproductID><re:milestone>Submitted To OM</re:milestone><re:itemId>"
				+ row_id.get("ROW_ID").get(0) + "</re:itemId><re:shippingPONRflag>N"
				+ "</re:shippingPONRflag><re:chargeAggregationID>132323232"
				+ "</re:chargeAggregationID><re:LineItemsXA><re:action>Add</re:action>"
				+ "<re:name>vpnId</re:name><re:value>132323232</re:value>"
				+ "</re:LineItemsXA></re:OrderItem></re:Order></re:notifyServiceOrderV2Request>";
		// System.out.println(row_id.get("PRFLAG").get(j2));

		System.out.println("VPN NSO:" + NOXML);// NOXML = NOXML +
												// System.lineSeparator();
		return NOXML;
	}

	/*Author:Ankita*/
	public String getTrackandTraceNSO(String orderNum, String orderId, String courierBagId, String returnBagId) {
		String TrackAndTraceNSO="<notifyServiceOrderV2Request><messageHeader><user>T822505</user><transactionId>SBL_1-1Y7S3BNE"
				+ "</transactionId><timestamp>2018-02-16T01:19:40Z</timestamp><processContext>BPM8-22008</processContext>"
				+ "<lineOfBusiness>Spark</lineOfBusiness><application>OrderManager</application></messageHeader><Order><mode>GENERAL"
				+ "</mode><Exception><description /><code /></Exception><orderReceivedDateTime>2018-02-15T23:17:35.000Z"
				+ "</orderReceivedDateTime><orderNum>"+orderNum+"</orderNum><orderID>"+orderId+"</orderID><orderAim>Return</orderAim>"
				+ "<omOrderID>9061057196</omOrderID><Status>In Progress</Status><OrderItem><lastUpdatedDateTime>2018-02-16T01:19:40.860"
				+ "Z</lastUpdatedDateTime><status>In Progress</status><rootproductID>"+courierBagId+"</rootproductID><provisionPONRflag"
				+ ">N</provisionPONRflag><prodSpecID>null</prodSpecID><prodInstantID>"+courierBagId+"</prodInstantID><phase>Shipping"
				+ "</phase><parentproductID>"+courierBagId+"</parentproductID><milestone>Shipped</milestone><itemId>"+courierBagId+
				"</itemId><shippingPONRflag>Y</shippingPONRflag><ShippingDetails><trackNTraceNumber>12345678CB</trackNTraceNumber>"
				+ "<despatchDateTime>2018-02-15T11:00:00.000Z</despatchDateTime></ShippingDetails></OrderItem><OrderItem><lastUpdatedDa"
				+ "teTime>2018-02-16T01:19:40.860Z</lastUpdatedDateTime><status>In Progress</status><rootproductID>"+returnBagId+
				"</rootproductID><provisionPONRflag>N</provisionPONRflag><prodSpecID>SpecReturnBag</prodSpecID><prodInstantID>"
				+returnBagId+"</prodInstantID><phase>Shipping</phase><parentproductID>"+returnBagId+"</parentproductID><milestone>"
				+ "Shipped</milestone><itemId>"+returnBagId+"</itemId><shippingPONRflag>Y</shippingPONRflag><ShippingDetails><trackN"
				+ "TraceNumber>12345678RB</trackNTraceNumber><despatchDateTime>2018-02-15T11:00:00.000Z</despatchDateTime></ShippingDe"
				+ "tails></OrderItem></Order></notifyServiceOrderV2Request>";
		System.out.println(TrackAndTraceNSO);
		return TrackAndTraceNSO;	
	}
	/*Author:Ankita*/
	public String getDeviceConditionNSO(String orderNum, String orderId, String courierBagId, String returnBagId,
			String serviceId, String bagsize, String product, String deviceCondition) {
		String deviceConditionNSO="<notifyServiceOrderV2Request><messageHeader><transactionId>1-8W3MH2</transactionId><timestamp>2015-06-05T23:06:41Z</timestamp><processContext>BPM8-22127</processContext><lineOfBusiness></lineOfBusiness><application>T-OM</application></messageHeader><Order><mode>GENERAL</mode><orderReceivedDateTime>2016-22-04T02:23:06.000Z</orderReceivedDateTime><orderNum>"+orderNum+"</orderNum><orderID>"+orderId+"</orderID><orderAim>Return</orderAim><omOrderID>"+orderNum+"</omOrderID><Status>Complete</Status><OrderItem><status>Complete</status><rootproductID></rootproductID><prodSpecID></prodSpecID><prodInstantID>"+courierBagId+"</prodInstantID><phase>Provisioning</phase><parentproductID></parentproductID><milestone>Submitted To OM</milestone><itemId>"+courierBagId+"</itemId><shippingPONRflag>Y</shippingPONRflag></OrderItem><OrderItem><status>Complete</status><rootproductID>null</rootproductID><prodSpecID>SpecReturnBag</prodSpecID><prodInstantID>"+returnBagId+"</prodInstantID><phase>Provisioning</phase><parentproductID></parentproductID><milestone>Submitted To OM</milestone><itemId>"+returnBagId+"</itemId><shippingPONRflag>Y</shippingPONRflag><LineItemsXA><value>"+bagsize+"</value><name>bagSize</name><action></action></LineItemsXA><LineItemsXA><value>Box sealed</value><name>expectedProductCondition</name><action></action></LineItemsXA><LineItemsXA><value>"+product+"</value><name>expectedProductDescription</name><action></action></LineItemsXA><LineItemsXA><value>"+serviceId+"</value><name>expectedProductSerial</name><action></action></LineItemsXA><LineItemsXA><value>"+deviceCondition+"</value><name>deviceGrade</name><action></action></LineItemsXA><LineItemsXA><value>Faulty</value><name>deviceGradeReason</name><action></action></LineItemsXA></OrderItem></Order></notifyServiceOrderV2Request>";
		System.out.println(deviceConditionNSO);
		return deviceConditionNSO;
	}

}
