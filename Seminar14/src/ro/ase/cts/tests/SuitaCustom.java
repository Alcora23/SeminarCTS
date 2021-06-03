package ro.ase.cts.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.tests.categorii.GetPromovabilitateCategory;
import ro.ase.cts.tests.categorii.TesteUrgente;

@RunWith(Categories.class)
@SuiteClasses({TesteGrupaMock.class,TestsGupa.class,TesteGrupaFixture.class})
@IncludeCategory(GetPromovabilitateCategory.class)
@ExcludeCategory(TesteUrgente.class)
public class SuitaCustom {

}
