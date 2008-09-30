package org.phpmaven.plugin.build;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.phpmaven.plugin.build.PHPVersion;
import org.phpmaven.plugin.build.PhpUnitCompile;

public class PhpUnitCompileTest extends TestCase {
	public void testGetPhpVersion() throws Exception{
		PhpUnitCompile compile = new PhpUnitCompile();
		compile.phpExe="php.exe";
		PHPVersion phpVersion = compile.getPhpVersion();
		Assert.assertEquals(PHPVersion.PHP5, phpVersion);
	}
}