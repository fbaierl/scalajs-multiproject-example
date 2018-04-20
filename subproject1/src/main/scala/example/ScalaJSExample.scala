package example

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom

import magic.MagicNumber

object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = s"<strong>It works! Magic number from core project: ${MagicNumber.doMagic}!</strong>"
    dom.document.getElementById("mainElement").appendChild(paragraph)
  }
}
