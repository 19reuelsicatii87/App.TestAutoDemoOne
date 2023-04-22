package webApp.AppName.pageObject;

import org.openqa.selenium.By;

public class PageObject {

	private ObjectService objectService;

	public PageObject(ObjectService objectService) {
		super();
		this.objectService = objectService;
	}

	public By getElement(String elementName) {
		return this.objectService.getElement(elementName);
		
	}

}
