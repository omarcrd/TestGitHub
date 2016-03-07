package testSuite;

import objectLibrary.browserSetUp;
import testCaseLibrary.SearchGoogle;

public class TestSuiteOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		browserSetUp.initializeBrowser();	
		SearchGoogle.doSearch();
		browserSetUp.tearDown();

	}

}
