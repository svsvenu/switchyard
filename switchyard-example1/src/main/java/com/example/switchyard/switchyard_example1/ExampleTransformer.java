package com.example.switchyard.switchyard_example1;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

public final class ExampleTransformer {

	@Transformer(to = "{urn:com.example.switchyard:switchyard-example:1.0}string")
	public String transformStringToString(String from) {
	// TODO Auto-generated method stub
	String to = "Hello World!";
	return "<sayHelloResponse xmlns=\"urn:com.example.switchyard:switchyard-example:1.0\"><string>"
	+ from + " TRANSFORMED TO " + to + "</string></sayHelloResponse>";
	}

	@Transformer(from = "{urn:com.example.switchyard:switchyard-example:1.0}string")
	public String transformStringToString1(Element from) {
	// TODO Auto-generated method stub
	return new String(from.getTextContent());
	}


}
