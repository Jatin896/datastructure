package com.test;
import java.util.*;
public class DictionaryNode {
	
	public DictionaryNode parent;
	public Boolean endOfWord = false; //Does this Node mark the end of a particular word?
	public HashMap<Character,DictionaryNode> children = new HashMap<Character,DictionaryNode>();


}
