'strict mode'

import vx_core from "../src/vx/core.js"
import vx_type from "../src/vx/type.js"
import vx_web_htmldoc from "../src/vx/web/htmldoc.js"
import mydomain_mypackage from "../src/mydomain/mypackage.js"

export default class app {

  static async f_main(arglist) {
    const context = mydomain_mypackage.f_context_main(...arglist)
    const output = mydomain_mypackage.f_main_html(context, ...arglist)
    return output
  }

  static async f_htmlmain() {
    const argtext = vx_web_htmldoc.f_string_from_id("args")
    const elem = document.getElementById("args")
    const arglist = vx_type.f_stringlist_from_string_split(argtext, " ")
    const mainstring = await app.f_main(arglist)
    vx_web_htmldoc.f_boolean_write_from_id_htmltext("display", mainstring)
  }

}

