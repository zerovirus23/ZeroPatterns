//=======================================================================
// FILE TestPattern.java
// CREATION DATE: Jan 27, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.zero_patterns.design.structure.composite;

/**
 * This class expose how to use the pattern in a concrete example
 * @author Hernán Tenjo
 * @version 1.0
 */
public class TestPattern {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Build distinct tags
		HtmlTag html = new HtmlParentTag("html");
		HtmlTag body = new HtmlParentTag("body");
		HtmlTag form = new HtmlParentTag("form");
		HtmlTag text = new HtmlElement("p");
		
			//Build the composite hierarchy
		html.addChildTag(body);
		body.addChildTag(form);
		form.addChildTag(text);
		
		//The composite operation
		html.generateHtml();
	}
}
