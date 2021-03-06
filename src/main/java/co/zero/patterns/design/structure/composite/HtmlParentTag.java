//=======================================================================
// FILE HtmlParentTag.java
// CREATION DATE: Jan 27, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.patterns.design.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represent the composite part of the pattern
 * @author Hernán Tenjo
 * @version 1.0
*/
public class HtmlParentTag extends HtmlTag {
	private String name;
	private String start;
	private String end;
	private List<HtmlTag> children;
	
	/**
	 * 
	 * @param name
	 */
	public HtmlParentTag(String name) {
		this.name = name;
		this.start = "<" + name + ">";
		this.end = "</" + name + ">";
		children = new ArrayList<>();
	}
	
	/*
	 * (non-Javadoc)
	 * @see HtmlTag#getTagName()
	 */
	@Override
	public String getTagName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * @see HtmlTag#setStartTag(java.lang.String)
	 */
	@Override
	public void setStartTag(String startTag) {
		this.start = startTag;
	}

	/*
	 * (non-Javadoc)
	 * @see HtmlTag#setEndTag(java.lang.String)
	 */
	@Override
	public void setEndTag(String endTag) {
		this.end = endTag;
	}

	/*
	 * (non-Javadoc)
	 * @see HtmlTag#generateHtml()
	 */
	@Override
	public void generateHtml() {
		System.out.println(this.start);

		for(HtmlTag tag : this.children){
			tag.generateHtml();
		}

		System.out.println(this.end);
	}

	/* (non-Javadoc)
	 * @see HtmlTag#addChildTag(HtmlTag)
	 */
	@Override
	public void addChildTag(HtmlTag childTag) {
		this.children.add(childTag);
	}

	/* (non-Javadoc)
	 * @see HtmlTag#remoteChildTag(HtmlTag)
	 */
	@Override
	public void remoteChildTag(HtmlTag childTag) {
		this.children.remove(childTag);
	}

	/* (non-Javadoc)
	 * @see HtmlTag#getChildren()
	 */
	@Override
	public List<HtmlTag> getChildren() {
		return this.getChildren();
	}	
}