package com.abm.component;

import org.springframework.stereotype.Component;

@Component("splChckr")
public class SpellChecker {
	
	public void checkSpellingMistakes(String document) {
		System.out.println("spell checker executed for " + document);
	}
}
