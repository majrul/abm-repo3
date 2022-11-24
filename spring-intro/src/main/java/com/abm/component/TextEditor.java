package com.abm.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txtEdtr")
public class TextEditor {

	@Autowired //DI
	//@Resource @Inject
	private SpellChecker sp;
	
	//private SpellChecker sp;
	
	/*
	@Autowired
	public void setSp(SpellChecker sp) {
		this.sp = sp;
	}*/
	/*@Autowired
	public TextEditor(SpellChecker sp) {
		this.sp = sp;
	}*/
	
	
	
	public void loadDocument(String document) {
		System.out.println("text editor loaded " + document);
		//SpellChecker sp = new SpellChecker();
		sp.checkSpellingMistakes(document);
	}
}





