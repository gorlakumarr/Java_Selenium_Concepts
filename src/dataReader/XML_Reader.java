package dataReader;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XML_Reader {
	private static DocumentBuilderFactory builderFactory;
	private static DocumentBuilder documentBuilder;
	private static Document document;

	public static void main(String[] args) {
		builderFactory = DocumentBuilderFactory.newInstance();

		try {
			builderFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			documentBuilder = builderFactory.newDocumentBuilder();
			document = documentBuilder.parse(new File("C:\\GK_Work\\codebase\\sele_learn_gk\\src\\xmlread.xml"));
			document.getDocumentElement().normalize();

			System.out.println("Root Element :" + document.getDocumentElement().getNodeName());
			System.out.println("------");

			NodeList list = document.getElementsByTagName("staff");

			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {

					Element element = (Element) node;

					String id = element.getAttribute("id");
					String firstname = element.getElementsByTagName("firstname").item(0).getTextContent();
					String lastname = element.getElementsByTagName("lastname").item(0).getTextContent();
					String nickname = element.getElementsByTagName("nickname").item(0).getTextContent();

					NodeList salaryNodeList = element.getElementsByTagName("salary");
					String salary = salaryNodeList.item(0).getTextContent();

					String currency = salaryNodeList.item(0).getAttributes().getNamedItem("currency").getTextContent();

					System.out.println("Current Element :" + node.getNodeName());
					System.out.println("Staff Id : " + id);
					System.out.println("First Name : " + firstname);
					System.out.println("Last Name : " + lastname);
					System.out.println("Nick Name : " + nickname);
					System.out.printf("Salary [Currency] : %,.2f [%s]%n%n", Float.parseFloat(salary), currency);

				}

			}
		} catch (IOException | SAXException | ParserConfigurationException e) {
			e.printStackTrace();
		}

	}
}
