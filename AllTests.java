package muz;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ dsf.class, JUnitTestingTest.class })
public class AllTests {

}
