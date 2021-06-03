package ro.ase.cts.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ro.ase.cts.Mock.DummyStudent;
import ro.ase.cts.Mock.FakeStudent;
import ro.ase.cts.Mock.StubStudent;

@RunWith (Suite.class)
@Suite.SuiteClasses({
	TesteGrupaMock.class,
	TestsGupa.class,
	TesteGrupaFixture.class
})
public class TestSuite {

}
