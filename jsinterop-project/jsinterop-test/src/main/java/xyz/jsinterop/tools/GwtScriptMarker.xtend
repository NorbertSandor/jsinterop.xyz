/*
 * #%L
 * JsInterop.xyz
 * %%
 * Copyright (C) 2015 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */
package xyz.jsinterop.tools

import java.io.File
import java.io.IOException
import java.nio.file.FileVisitResult
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.SimpleFileVisitor
import java.nio.file.attribute.BasicFileAttributes
import org.apache.commons.io.FileUtils
import java.util.regex.Pattern

class GwtScriptMarker {
	def static void main(String[] args) {
		val outputDirectory = args.get(0)
		val gwtOutputDirectory = '''«outputDirectory»/gwt-out/app'''

		val gwtJsPath = {
			val gwtJsPathList = <Path>newLinkedList
			Files.walkFileTree(Paths.get(gwtOutputDirectory), new SimpleFileVisitor<Path>() {
				override visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					if (file.fileName.toString.matches('''.{32}\.cache\.js''')) {
						gwtJsPathList.add(file)
						FileVisitResult.TERMINATE
					} else {
						FileVisitResult.CONTINUE
					}
				}
			})
			gwtJsPathList.head
		}

		val convertedOutputDirectory = new File('''«outputDirectory»/gwt-asciidoc''')
		convertedOutputDirectory.mkdir
		val outputJs = new File(convertedOutputDirectory, "gwt.js")

		val inputJs = FileUtils.readFileToString(gwtJsPath.toFile, "UTF-8")

		val codeMarkerStartPattern = Pattern.compile('''[\t ]*xjtc.generatedCodeMarkerStart\('(\w+)'\);''')
		val codeMarkerStartMatcher = codeMarkerStartPattern.matcher(inputJs)
		val replaced1 = codeMarkerStartMatcher.replaceAll("// tag::$1[]")

		val codeMarkerEndPattern = Pattern.compile('''[\t ]*xjtc.generatedCodeMarkerEnd\('(\w+)'\);''')
		val codeMarkerEndMatcher = codeMarkerEndPattern.matcher(replaced1)
		val replaced2 = codeMarkerEndMatcher.replaceAll("// end::$1[]")

		FileUtils.writeStringToFile(outputJs, replaced2)
	}
}
