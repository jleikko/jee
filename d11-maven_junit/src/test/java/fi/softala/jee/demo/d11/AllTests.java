package fi.softala.jee.demo.d11;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fi.softala.jee.demo.d11.kello.InternetKelloLahdeTest;
import fi.softala.jee.demo.d11.kello.SuomiKelloTest;
import fi.softala.jee.demo.d11.laskin.LaskinTest;

@RunWith(Suite.class)
@SuiteClasses({
	LaskinTest.class,
	SuomiKelloTest.class,
	InternetKelloLahdeTest.class
	})
public class AllTests {
}