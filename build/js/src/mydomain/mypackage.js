'strict mode'

import vx_core from "../vx/core.js"
import vx_web_html from "../vx/web/html.js"
import vx_web_htmldoc from "../vx/web/htmldoc.js"


export default class mydomain_mypackage {


  /**
   * type: mycontext
   * A user defined context.
   */
  static t_mycontext = {}
  static e_mycontext = {vx_type: mydomain_mypackage.t_mycontext}
  /**
   * @function context_main
   * Returns the context for execution. Arguments come from the command line.
   * @param  {anylist} ... args
   * @return {context}
   */
  static t_context_main = {
    vx_type: vx_core.t_type
  }
  static e_context_main = {
    vx_type: mydomain_mypackage.t_context_main
  }

  // (func context-main)
  static f_context_main(...args) {
    let output = vx_core.e_context
    args = vx_core.f_new(vx_core.t_anylist, ...args)
    return output
  }

  /**
   * @function main_exe
   * The default function for app main execution. Arguments come from the command line.
   * @param  {anylist} ... args
   * @return {string}
   */
  static t_main_exe = {
    vx_type: vx_core.t_type
  }
  static e_main_exe = {
    vx_type: mydomain_mypackage.t_main_exe
  }

  // (func main-exe)
  static f_main_exe(context, ...args) {
    let output = vx_core.e_string
    args = vx_core.f_new(vx_core.t_anylist, ...args)
    output = "Hello World"
    return output
  }

  /**
   * @function main_html
   * The default function for app main html output. Arguments come from the command line.
   * @param  {anylist} ... args
   * @return {string}
   */
  static t_main_html = {
    vx_type: vx_core.t_type
  }
  static e_main_html = {
    vx_type: mydomain_mypackage.t_main_html
  }

  // (func main-html)
  static f_main_html(context, ...args) {
    let output = vx_core.e_string
    args = vx_core.f_new(vx_core.t_anylist, ...args)
    output = mydomain_mypackage.f_string_render_from_text("Hello World")
    return output
  }

  /**
   * @function myfunc
   * This function adds two integers and multiplies by 2. It includes documentation and a test case.
   * @param  {int} arg1
   * @param  {int} arg2
   * @return {int}
   */
  static t_myfunc = {
    vx_type: vx_core.t_type
  }
  static e_myfunc = {
    vx_type: mydomain_mypackage.t_myfunc
  }

  // (func myfunc)
  static f_myfunc(arg1, arg2) {
    let output = vx_core.e_int
    output = vx_core.f_multiply(
      vx_core.f_plus(arg1, arg2),
      2
    )
    return output
  }

  /**
   * @function p_from_text
   * Returns an HTML paragraph tag from text.
   * @param  {string} text
   * @return {p}
   */
  static t_p_from_text = {
    vx_type: vx_core.t_type
  }
  static e_p_from_text = {
    vx_type: mydomain_mypackage.t_p_from_text
  }

  // (func p<-text)
  static f_p_from_text(text) {
    let output = vx_web_html.e_p
    output = vx_core.f_new(
      vx_web_html.t_p,
      ":text",
      text
    )
    return output
  }

  /**
   * @function string_html_from_text
   * Returns HTML text from text with id=app.
   * @param  {string} text
   * @return {string}
   */
  static t_string_html_from_text = {
    vx_type: vx_core.t_type
  }
  static e_string_html_from_text = {
    vx_type: mydomain_mypackage.t_string_html_from_text
  }

  // (func string-html<-text)
  static f_string_html_from_text(text) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const p = mydomain_mypackage.f_p_from_text(text)
        return vx_web_html.f_string_from_node(p)
      })
    )
    return output
  }

  /**
   * @function string_render_from_text
   * Replaces HTML node with id=app.
   * @param  {string} text
   * @return {string}
   */
  static t_string_render_from_text = {
    vx_type: vx_core.t_type
  }
  static e_string_render_from_text = {
    vx_type: mydomain_mypackage.t_string_render_from_text
  }

  // (func string-render<-text)
  static f_string_render_from_text(text) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const shtml = mydomain_mypackage.f_string_html_from_text(text)
        const iswrite = vx_web_htmldoc.f_boolean_write_from_id_htmltext("app", shtml)
        return shtml
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "mycontext": mydomain_mypackage.e_mycontext,
      "context-main": mydomain_mypackage.e_context_main,
      "main-exe": mydomain_mypackage.e_main_exe,
      "main-html": mydomain_mypackage.e_main_html,
      "myfunc": mydomain_mypackage.e_myfunc,
      "p<-text": mydomain_mypackage.e_p_from_text,
      "string-html<-text": mydomain_mypackage.e_string_html_from_text,
      "string-render<-text": mydomain_mypackage.e_string_render_from_text
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "context-main": mydomain_mypackage.t_context_main,
      "main-exe": mydomain_mypackage.t_main_exe,
      "main-html": mydomain_mypackage.t_main_html,
      "myfunc": mydomain_mypackage.t_myfunc,
      "p<-text": mydomain_mypackage.t_p_from_text,
      "string-html<-text": mydomain_mypackage.t_string_html_from_text,
      "string-render<-text": mydomain_mypackage.t_string_render_from_text
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      "mycontext": mydomain_mypackage.t_mycontext
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "mydomain/mypackage",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (type mycontext)
    mydomain_mypackage.t_mycontext['vx_type'] = vx_core.t_type
    mydomain_mypackage.t_mycontext['vx_value'] = {
      name          : "mycontext",
      pkgname       : "mydomain/mypackage",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [vx_core.t_context],
      properties    : {
        "code": {
          "name" : "code",
          "type" : vx_core.t_string,
          "multi": false
        },
        "session": {
          "name" : "session",
          "type" : vx_core.t_session,
          "multi": false
        },
        "setting": {
          "name" : "setting",
          "type" : vx_core.t_setting,
          "multi": false
        },
        "state": {
          "name" : "state",
          "type" : vx_core.t_state,
          "multi": false
        }
      },
      proplast      : {
        "name" : "state",
        "type" : vx_core.t_state,
        "multi": false
      }
    }
    mydomain_mypackage.e_mycontext['vx_type'] = mydomain_mypackage.t_mycontext
    mydomain_mypackage.e_mycontext['vx_value'] = {}

    // (func context-main)
    mydomain_mypackage.t_context_main['vx_value'] = {
      name          : "context-main",
      pkgname       : "mydomain/mypackage",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : mydomain_mypackage.f_context_main
    }

    // (func main-exe)
    mydomain_mypackage.t_main_exe['vx_value'] = {
      name          : "main-exe",
      pkgname       : "mydomain/mypackage",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : mydomain_mypackage.f_main_exe
    }

    // (func main-html)
    mydomain_mypackage.t_main_html['vx_value'] = {
      name          : "main-html",
      pkgname       : "mydomain/mypackage",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : mydomain_mypackage.f_main_html
    }

    // (func myfunc)
    mydomain_mypackage.t_myfunc['vx_value'] = {
      name          : "myfunc",
      pkgname       : "mydomain/mypackage",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : mydomain_mypackage.f_myfunc
    }

    // (func p<-text)
    mydomain_mypackage.t_p_from_text['vx_value'] = {
      name          : "p<-text",
      pkgname       : "mydomain/mypackage",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : mydomain_mypackage.f_p_from_text
    }

    // (func string-html<-text)
    mydomain_mypackage.t_string_html_from_text['vx_value'] = {
      name          : "string-html<-text",
      pkgname       : "mydomain/mypackage",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : mydomain_mypackage.f_string_html_from_text
    }

    // (func string-render<-text)
    mydomain_mypackage.t_string_render_from_text['vx_value'] = {
      name          : "string-render<-text",
      pkgname       : "mydomain/mypackage",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : mydomain_mypackage.f_string_render_from_text
    }

  }
}
