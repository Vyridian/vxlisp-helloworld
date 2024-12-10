package com.myurl.mydomain

import com.vxlisp.vx.*
import com.vxlisp.vx.web.*

object mydomain_mypackage {


  /**
   * type: mycontext
   * A user defined context.
   * (type mycontext)
   */
  interface Type_mycontext : vx_core.Type_struct, vx_core.Type_context {
  }

  class Class_mycontext : vx_core.Class_base, Type_mycontext {
    constructor() {}

    var vx_p_code : vx_core.Type_string? = null

    override fun code() : vx_core.Type_string {
      var output : vx_core.Type_string = vx_core.e_string
      var testnull : vx_core.Type_string? = vx_p_code
      if (testnull != null) {
        output = testnull
      }
      return output
    }

    var vx_p_session : vx_core.Type_session? = null

    override fun session() : vx_core.Type_session {
      var output : vx_core.Type_session = vx_core.e_session
      var testnull : vx_core.Type_session? = vx_p_session
      if (testnull != null) {
        output = testnull
      }
      return output
    }

    var vx_p_setting : vx_core.Type_setting? = null

    override fun setting() : vx_core.Type_setting {
      var output : vx_core.Type_setting = vx_core.e_setting
      var testnull : vx_core.Type_setting? = vx_p_setting
      if (testnull != null) {
        output = testnull
      }
      return output
    }

    var vx_p_state : vx_core.Type_state? = null

    override fun state() : vx_core.Type_state {
      var output : vx_core.Type_state = vx_core.e_state
      var testnull : vx_core.Type_state? = vx_p_state
      if (testnull != null) {
        output = testnull
      }
      return output
    }

    override fun vx_any(key : vx_core.Type_string) : vx_core.Type_any {
      var output : vx_core.Type_any = vx_core.e_any
      var skey : String = key.vx_string()
      if (false) {
      } else if ((skey == ":code")) {
        output = this.code()
      } else if ((skey == ":session")) {
        output = this.session()
      } else if ((skey == ":setting")) {
        output = this.setting()
      } else if ((skey == ":state")) {
        output = this.state()
      }
      return output
    }

    override fun vx_map() : Map<String, vx_core.Type_any> {
      var map : MutableMap<String, vx_core.Type_any> = LinkedHashMap<String, vx_core.Type_any>()
      map.put(":code", this.code())
      map.put(":session", this.session())
      map.put(":setting", this.setting())
      map.put(":state", this.state())
      var output : Map<String, vx_core.Type_any> = vx_core.immutablemap(map)
      return output
    }

    override fun vx_new(vararg vals : Any) : vx_core.Type_any {
      var output : mydomain_mypackage.Type_mycontext = vx_core.vx_copy(mydomain_mypackage.e_mycontext, *vals)
      return output
    }

    override fun vx_copy(vararg vals : Any) : vx_core.Type_any {
      var output : mydomain_mypackage.Type_mycontext = this
      var ischanged : Boolean = false
      var value : mydomain_mypackage.Class_mycontext = this
      var msgblock : vx_core.Type_msgblock = vx_core.vx_msgblock_from_copy_arrayval(value, vals)
      if (this.vx_constdef() != vx_core.e_constdef) {
        ischanged = true
      }
      var vx_p_code : vx_core.Type_string = value.code()
      var vx_p_session : vx_core.Type_session = value.session()
      var vx_p_setting : vx_core.Type_setting = value.setting()
      var vx_p_state : vx_core.Type_state = value.state()
      var validkeys : MutableList<String> = ArrayList<String>()
      validkeys.add(":code")
      validkeys.add(":session")
      validkeys.add(":setting")
      validkeys.add(":state")
      var key : String = ""
      var msg : vx_core.Type_msg = vx_core.e_msg
      var msgval : vx_core.Type_any = vx_core.e_any
      for (valsub : Any in vals) {
        if (valsub is vx_core.Type_msgblock) {
          msgblock = vx_core.vx_copy(msgblock, valsub)
        } else if (valsub is vx_core.Type_msg) {
          msgblock = vx_core.vx_copy(msgblock, valsub)
        } else if (key.equals("")) {
          var istestkey : Boolean = false
          var testkey : String = ""
          if (false) {
          } else if (valsub is vx_core.Type_string) {
            var valstr : vx_core.Type_string = valsub as vx_core.Type_string
            testkey = valstr.vx_string()
            istestkey = true
          } else if (valsub is String) {
            var sval : String = valsub as String
            testkey = sval
            istestkey = true
          } else {
            if (false) {
            } else if (valsub is vx_core.Type_any) {
              var valmsg : vx_core.Type_any = valsub as vx_core.Type_any
              msgval = valmsg
            } else {
              msgval = vx_core.vx_new_string(valsub.toString())
            }
            msg = vx_core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidkeytype", msgval)
            msgblock = vx_core.vx_copy(msgblock, msg)
          }
          if (istestkey) {
            if (!testkey.startsWith(":")) {
              testkey = ":" + testkey
            }
            var isvalidkey : Boolean = validkeys.contains(testkey)
            if (isvalidkey) {
              key = testkey
            } else {
              msgval = vx_core.vx_new_string(testkey)
              msg = vx_core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidkey", msgval)
              msgblock = vx_core.vx_copy(msgblock, msg)
            }
          }
        } else {
          if (false) {
          } else if ((key == ":code")) {
            if (valsub == vx_p_code) {
            } else if (valsub is vx_core.Type_string) {
              var valcode : vx_core.Type_string = valsub as vx_core.Type_string
              ischanged = true
              vx_p_code = valcode
            } else if (valsub is String) {
              ischanged = true
              vx_p_code = vx_core.vx_new(vx_core.t_string, valsub)
            } else {
              if (false) {
              } else if (valsub is vx_core.Type_any) {
                var valinvalid : vx_core.Type_any = valsub as vx_core.Type_any
                msgval = valinvalid
              } else {
                msgval = vx_core.vx_new_string(valsub.toString())
              }
              var mapany : MutableMap<String, vx_core.Type_any> = LinkedHashMap<String, vx_core.Type_any>()
              mapany.put("key", vx_core.vx_new_string("code"))
              mapany.put("value", msgval)
              var msgmap : vx_core.Type_map = vx_core.t_anymap.vx_new_from_map(mapany)
              msg = vx_core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidvalue", msgmap)
              msgblock = vx_core.vx_copy(msgblock, msg)
            }
          } else if ((key == ":session")) {
            if (valsub == vx_p_session) {
            } else if (valsub is vx_core.Type_session) {
              var valsession : vx_core.Type_session = valsub as vx_core.Type_session
              ischanged = true
              vx_p_session = valsession
            } else {
              if (false) {
              } else if (valsub is vx_core.Type_any) {
                var valinvalid : vx_core.Type_any = valsub as vx_core.Type_any
                msgval = valinvalid
              } else {
                msgval = vx_core.vx_new_string(valsub.toString())
              }
              var mapany : MutableMap<String, vx_core.Type_any> = LinkedHashMap<String, vx_core.Type_any>()
              mapany.put("key", vx_core.vx_new_string("session"))
              mapany.put("value", msgval)
              var msgmap : vx_core.Type_map = vx_core.t_anymap.vx_new_from_map(mapany)
              msg = vx_core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidvalue", msgmap)
              msgblock = vx_core.vx_copy(msgblock, msg)
            }
          } else if ((key == ":setting")) {
            if (valsub == vx_p_setting) {
            } else if (valsub is vx_core.Type_setting) {
              var valsetting : vx_core.Type_setting = valsub as vx_core.Type_setting
              ischanged = true
              vx_p_setting = valsetting
            } else {
              if (false) {
              } else if (valsub is vx_core.Type_any) {
                var valinvalid : vx_core.Type_any = valsub as vx_core.Type_any
                msgval = valinvalid
              } else {
                msgval = vx_core.vx_new_string(valsub.toString())
              }
              var mapany : MutableMap<String, vx_core.Type_any> = LinkedHashMap<String, vx_core.Type_any>()
              mapany.put("key", vx_core.vx_new_string("setting"))
              mapany.put("value", msgval)
              var msgmap : vx_core.Type_map = vx_core.t_anymap.vx_new_from_map(mapany)
              msg = vx_core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidvalue", msgmap)
              msgblock = vx_core.vx_copy(msgblock, msg)
            }
          } else if ((key == ":state")) {
            if (valsub == vx_p_state) {
            } else if (valsub is vx_core.Type_state) {
              var valstate : vx_core.Type_state = valsub as vx_core.Type_state
              ischanged = true
              vx_p_state = valstate
            } else {
              if (false) {
              } else if (valsub is vx_core.Type_any) {
                var valinvalid : vx_core.Type_any = valsub as vx_core.Type_any
                msgval = valinvalid
              } else {
                msgval = vx_core.vx_new_string(valsub.toString())
              }
              var mapany : MutableMap<String, vx_core.Type_any> = LinkedHashMap<String, vx_core.Type_any>()
              mapany.put("key", vx_core.vx_new_string("state"))
              mapany.put("value", msgval)
              var msgmap : vx_core.Type_map = vx_core.t_anymap.vx_new_from_map(mapany)
              msg = vx_core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidvalue", msgmap)
              msgblock = vx_core.vx_copy(msgblock, msg)
            }
          } else {
            msgval = vx_core.vx_new_string(key)
            msg = vx_core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidkey", msgval)
            msgblock = vx_core.vx_copy(msgblock, msg)
          }
          key = ""
        }
      }
      if (ischanged || (msgblock != vx_core.e_msgblock)) {
        var work : mydomain_mypackage.Class_mycontext = mydomain_mypackage.Class_mycontext()
        work.vx_p_code = vx_p_code
        work.vx_p_session = vx_p_session
        work.vx_p_setting = vx_p_setting
        work.vx_p_state = vx_p_state
        if (msgblock != vx_core.e_msgblock) {
          work.vxmsgblock = msgblock
        }
        output = work
      }
      return output
    }

    override fun vx_empty() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.e_mycontext
      return output
    }

    override fun vx_type() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.t_mycontext
      return output
    }

    override fun vx_typedef() : vx_core.Type_typedef {
      var output : vx_core.Type_typedef = vx_core.typedef_new(
        "mydomain/mypackage", // pkgname
        "mycontext", // name
        ":struct", // extends
        vx_core.vx_new(vx_core.t_typelist, vx_core.t_context), // traits
        vx_core.e_typelist, // allowtypes
        vx_core.e_typelist, // disallowtypes
        vx_core.e_funclist, // allowfuncs
        vx_core.e_funclist, // disallowfuncs
        vx_core.e_anylist, // allowvalues
        vx_core.e_anylist, // disallowvalues
        vx_core.e_argmap // properties
      )
      return output
    }

  }

  val e_mycontext : mydomain_mypackage.Type_mycontext = mydomain_mypackage.Class_mycontext()
  val t_mycontext : mydomain_mypackage.Type_mycontext = mydomain_mypackage.Class_mycontext()
  /**
   * @function context_main
   * Returns the context for execution. Arguments come from the command line.
   * @param  {anylist} args
   * @return {context}
   * (func context-main)
   */
  interface Func_context_main : vx_core.Func_any_from_any {
    fun vx_context_main(args : vx_core.Type_anylist) : vx_core.Type_context
  }

  class Class_context_main : vx_core.Class_base, Func_context_main {
    constructor() {}

    override fun vx_new(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_context_main = mydomain_mypackage.Class_context_main()
      return output
    }

    override fun vx_copy(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_context_main = mydomain_mypackage.Class_context_main()
      return output
    }

    override fun vx_typedef() : vx_core.Type_typedef {
      var output : vx_core.Type_typedef = vx_core.t_func.vx_typedef()
      return output
    }

    override fun vx_funcdef() : vx_core.Type_funcdef {
      var output : vx_core.Type_funcdef = vx_core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "context-main", // name
        0, // idx
        false, // async
        vx_core.typedef_new(
          "vx/core", // pkgname
          "context", // name
          ":struct", // extends
          vx_core.e_typelist, // traits
          vx_core.e_typelist, // allowtypes
          vx_core.e_typelist, // disallowtypes
          vx_core.e_funclist, // allowfuncs
          vx_core.e_funclist, // disallowfuncs
          vx_core.e_anylist, // allowvalues
          vx_core.e_anylist, // disallowvalues
          vx_core.e_argmap // properties
        ) // typedef
      )
      return output
    }

    override fun vx_empty() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.e_context_main
      return output
    }

    override fun vx_type() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.t_context_main
      return output
    }

    override fun vx_fn_new(fn : vx_core.Class_any_from_any.IFn) : vx_core.Func_any_from_any {
      return vx_core.e_any_from_any
    }

    override fun <T : vx_core.Type_any, U : vx_core.Type_any> vx_any_from_any(generic_any_1 : T, value : U) : T {
      var output : T = vx_core.f_empty(generic_any_1)
      var inputval : vx_core.Type_anylist = value as vx_core.Type_anylist
      var outputval : vx_core.Type_any = mydomain_mypackage.f_context_main(inputval)
      output = vx_core.f_any_from_any(generic_any_1, outputval)
      return output
    }

    override fun vx_repl(arglist : vx_core.Type_anylist) : vx_core.Type_any {
      var output : vx_core.Type_any = vx_core.e_any
      var args : vx_core.Type_anylist = vx_core.f_any_from_any(vx_core.t_anylist, arglist.vx_any(vx_core.vx_new_int(0)))
      output = mydomain_mypackage.f_context_main(args)
      return output
    }

    override fun vx_context_main(args : vx_core.Type_anylist) : vx_core.Type_context {
      var output : vx_core.Type_context = mydomain_mypackage.f_context_main(args)
      return output
    }

  }

  val e_context_main : mydomain_mypackage.Func_context_main = mydomain_mypackage.Class_context_main()
  val t_context_main : mydomain_mypackage.Func_context_main = mydomain_mypackage.Class_context_main()

  fun f_context_main(args : vx_core.Type_anylist) : vx_core.Type_context {
    var output : vx_core.Type_context = vx_core.e_context
    return output
  }

  /**
   * @function main_exe
   * The default function for app main execution. Arguments come from the command line.
   * @param  {anylist} args
   * @return {string}
   * (func main-exe)
   */
  interface Func_main_exe : vx_core.Func_any_from_any_context {
    fun vx_main_exe(context : vx_core.Type_context, args : vx_core.Type_anylist) : vx_core.Type_string
  }

  class Class_main_exe : vx_core.Class_base, Func_main_exe {
    constructor() {}

    override fun vx_new(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_main_exe = mydomain_mypackage.Class_main_exe()
      return output
    }

    override fun vx_copy(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_main_exe = mydomain_mypackage.Class_main_exe()
      return output
    }

    override fun vx_typedef() : vx_core.Type_typedef {
      var output : vx_core.Type_typedef = vx_core.t_func.vx_typedef()
      return output
    }

    override fun vx_funcdef() : vx_core.Type_funcdef {
      var output : vx_core.Type_funcdef = vx_core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "main-exe", // name
        0, // idx
        false, // async
        vx_core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          vx_core.e_typelist, // traits
          vx_core.e_typelist, // allowtypes
          vx_core.e_typelist, // disallowtypes
          vx_core.e_funclist, // allowfuncs
          vx_core.e_funclist, // disallowfuncs
          vx_core.e_anylist, // allowvalues
          vx_core.e_anylist, // disallowvalues
          vx_core.e_argmap // properties
        ) // typedef
      )
      return output
    }

    override fun vx_empty() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.e_main_exe
      return output
    }

    override fun vx_type() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.t_main_exe
      return output
    }

    override fun vx_fn_new(fn : vx_core.Class_any_from_any_context.IFn) : vx_core.Func_any_from_any_context {
      return vx_core.e_any_from_any_context
    }

    override fun <T : vx_core.Type_any, U : vx_core.Type_any> vx_any_from_any_context(generic_any_1 : T, context : vx_core.Type_context, value : U) : T {
      var output : T = vx_core.f_empty(generic_any_1)
      var inputval : vx_core.Type_anylist = value as vx_core.Type_anylist
      var outputval : vx_core.Type_any = mydomain_mypackage.f_main_exe(context, inputval)
      output = vx_core.f_any_from_any_context(generic_any_1, context, outputval)
      return output
    }

    override fun vx_repl(arglist : vx_core.Type_anylist) : vx_core.Type_any {
      var output : vx_core.Type_any = vx_core.e_any
      var context : vx_core.Type_context = vx_core.f_any_from_any(vx_core.t_context, arglist.vx_any(vx_core.vx_new_int(0)))
      var args : vx_core.Type_anylist = vx_core.f_any_from_any(vx_core.t_anylist, arglist.vx_any(vx_core.vx_new_int(0)))
      output = mydomain_mypackage.f_main_exe(context, args)
      return output
    }

    override fun vx_main_exe(context : vx_core.Type_context, args : vx_core.Type_anylist) : vx_core.Type_string {
      var output : vx_core.Type_string = mydomain_mypackage.f_main_exe(context, args)
      return output
    }

  }

  val e_main_exe : mydomain_mypackage.Func_main_exe = mydomain_mypackage.Class_main_exe()
  val t_main_exe : mydomain_mypackage.Func_main_exe = mydomain_mypackage.Class_main_exe()

  fun f_main_exe(context : vx_core.Type_context, args : vx_core.Type_anylist) : vx_core.Type_string {
    var output : vx_core.Type_string = vx_core.e_string
    output = vx_core.vx_new_string("Hello World")
    return output
  }

  /**
   * @function main_html
   * The default function for app main html output. Arguments come from the command line.
   * @param  {anylist} args
   * @return {string}
   * (func main-html)
   */
  interface Func_main_html : vx_core.Func_any_from_any_context {
    fun vx_main_html(context : vx_core.Type_context, args : vx_core.Type_anylist) : vx_core.Type_string
  }

  class Class_main_html : vx_core.Class_base, Func_main_html {
    constructor() {}

    override fun vx_new(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_main_html = mydomain_mypackage.Class_main_html()
      return output
    }

    override fun vx_copy(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_main_html = mydomain_mypackage.Class_main_html()
      return output
    }

    override fun vx_typedef() : vx_core.Type_typedef {
      var output : vx_core.Type_typedef = vx_core.t_func.vx_typedef()
      return output
    }

    override fun vx_funcdef() : vx_core.Type_funcdef {
      var output : vx_core.Type_funcdef = vx_core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "main-html", // name
        0, // idx
        false, // async
        vx_core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          vx_core.e_typelist, // traits
          vx_core.e_typelist, // allowtypes
          vx_core.e_typelist, // disallowtypes
          vx_core.e_funclist, // allowfuncs
          vx_core.e_funclist, // disallowfuncs
          vx_core.e_anylist, // allowvalues
          vx_core.e_anylist, // disallowvalues
          vx_core.e_argmap // properties
        ) // typedef
      )
      return output
    }

    override fun vx_empty() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.e_main_html
      return output
    }

    override fun vx_type() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.t_main_html
      return output
    }

    override fun vx_fn_new(fn : vx_core.Class_any_from_any_context.IFn) : vx_core.Func_any_from_any_context {
      return vx_core.e_any_from_any_context
    }

    override fun <T : vx_core.Type_any, U : vx_core.Type_any> vx_any_from_any_context(generic_any_1 : T, context : vx_core.Type_context, value : U) : T {
      var output : T = vx_core.f_empty(generic_any_1)
      var inputval : vx_core.Type_anylist = value as vx_core.Type_anylist
      var outputval : vx_core.Type_any = mydomain_mypackage.f_main_html(context, inputval)
      output = vx_core.f_any_from_any_context(generic_any_1, context, outputval)
      return output
    }

    override fun vx_repl(arglist : vx_core.Type_anylist) : vx_core.Type_any {
      var output : vx_core.Type_any = vx_core.e_any
      var context : vx_core.Type_context = vx_core.f_any_from_any(vx_core.t_context, arglist.vx_any(vx_core.vx_new_int(0)))
      var args : vx_core.Type_anylist = vx_core.f_any_from_any(vx_core.t_anylist, arglist.vx_any(vx_core.vx_new_int(0)))
      output = mydomain_mypackage.f_main_html(context, args)
      return output
    }

    override fun vx_main_html(context : vx_core.Type_context, args : vx_core.Type_anylist) : vx_core.Type_string {
      var output : vx_core.Type_string = mydomain_mypackage.f_main_html(context, args)
      return output
    }

  }

  val e_main_html : mydomain_mypackage.Func_main_html = mydomain_mypackage.Class_main_html()
  val t_main_html : mydomain_mypackage.Func_main_html = mydomain_mypackage.Class_main_html()

  fun f_main_html(context : vx_core.Type_context, args : vx_core.Type_anylist) : vx_core.Type_string {
    var output : vx_core.Type_string = vx_core.e_string
    output = mydomain_mypackage.f_string_render_from_text(
      vx_core.vx_new_string("Hello World")
    )
    return output
  }

  /**
   * @function myfunc
   * This function adds two integers and multiplies by 2. It includes documentation and a test case.
   * @param  {int} arg1
   * @param  {int} arg2
   * @return {int}
   * (func myfunc)
   */
  interface Func_myfunc : vx_core.Type_func, vx_core.Type_replfunc {
    fun vx_myfunc(arg1 : vx_core.Type_int, arg2 : vx_core.Type_int) : vx_core.Type_int
  }

  class Class_myfunc : vx_core.Class_base, Func_myfunc {
    constructor() {}

    override fun vx_new(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_myfunc = mydomain_mypackage.Class_myfunc()
      return output
    }

    override fun vx_copy(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_myfunc = mydomain_mypackage.Class_myfunc()
      return output
    }

    override fun vx_typedef() : vx_core.Type_typedef {
      var output : vx_core.Type_typedef = vx_core.t_func.vx_typedef()
      return output
    }

    override fun vx_funcdef() : vx_core.Type_funcdef {
      var output : vx_core.Type_funcdef = vx_core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "myfunc", // name
        0, // idx
        false, // async
        vx_core.typedef_new(
          "vx/core", // pkgname
          "int", // name
          "", // extends
          vx_core.vx_new(vx_core.t_typelist, vx_core.t_number), // traits
          vx_core.e_typelist, // allowtypes
          vx_core.e_typelist, // disallowtypes
          vx_core.e_funclist, // allowfuncs
          vx_core.e_funclist, // disallowfuncs
          vx_core.e_anylist, // allowvalues
          vx_core.e_anylist, // disallowvalues
          vx_core.e_argmap // properties
        ) // typedef
      )
      return output
    }

    override fun vx_empty() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.e_myfunc
      return output
    }

    override fun vx_type() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.t_myfunc
      return output
    }

    override fun vx_repl(arglist : vx_core.Type_anylist) : vx_core.Type_any {
      var output : vx_core.Type_any = vx_core.e_any
      var arg1 : vx_core.Type_int = vx_core.f_any_from_any(vx_core.t_int, arglist.vx_any(vx_core.vx_new_int(0)))
      var arg2 : vx_core.Type_int = vx_core.f_any_from_any(vx_core.t_int, arglist.vx_any(vx_core.vx_new_int(1)))
      output = mydomain_mypackage.f_myfunc(arg1, arg2)
      return output
    }

    override fun vx_myfunc(arg1 : vx_core.Type_int, arg2 : vx_core.Type_int) : vx_core.Type_int {
      var output : vx_core.Type_int = mydomain_mypackage.f_myfunc(arg1, arg2)
      return output
    }

  }

  val e_myfunc : mydomain_mypackage.Func_myfunc = mydomain_mypackage.Class_myfunc()
  val t_myfunc : mydomain_mypackage.Func_myfunc = mydomain_mypackage.Class_myfunc()

  fun f_myfunc(arg1 : vx_core.Type_int, arg2 : vx_core.Type_int) : vx_core.Type_int {
    var output : vx_core.Type_int = vx_core.e_int
    output = vx_core.f_multiply(
      vx_core.f_plus(
        arg1,
        arg2
      ),
      vx_core.vx_new_int(2)
    )
    return output
  }

  /**
   * @function p_from_text
   * Returns an HTML paragraph tag from text.
   * @param  {string} text
   * @return {p}
   * (func p<-text)
   */
  interface Func_p_from_text : vx_core.Func_any_from_any {
    fun vx_p_from_text(text : vx_core.Type_string) : vx_web_html.Type_p
  }

  class Class_p_from_text : vx_core.Class_base, Func_p_from_text {
    constructor() {}

    override fun vx_new(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_p_from_text = mydomain_mypackage.Class_p_from_text()
      return output
    }

    override fun vx_copy(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_p_from_text = mydomain_mypackage.Class_p_from_text()
      return output
    }

    override fun vx_typedef() : vx_core.Type_typedef {
      var output : vx_core.Type_typedef = vx_core.t_func.vx_typedef()
      return output
    }

    override fun vx_funcdef() : vx_core.Type_funcdef {
      var output : vx_core.Type_funcdef = vx_core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "p<-text", // name
        0, // idx
        false, // async
        vx_core.typedef_new(
          "vx/web/html", // pkgname
          "p", // name
          ":struct", // extends
          vx_core.vx_new(vx_core.t_typelist, vx_web_html.t_node, vx_web_html.t_divchild), // traits
          vx_core.e_typelist, // allowtypes
          vx_core.e_typelist, // disallowtypes
          vx_core.e_funclist, // allowfuncs
          vx_core.e_funclist, // disallowfuncs
          vx_core.e_anylist, // allowvalues
          vx_core.e_anylist, // disallowvalues
          vx_core.e_argmap // properties
        ) // typedef
      )
      return output
    }

    override fun vx_empty() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.e_p_from_text
      return output
    }

    override fun vx_type() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.t_p_from_text
      return output
    }

    override fun vx_fn_new(fn : vx_core.Class_any_from_any.IFn) : vx_core.Func_any_from_any {
      return vx_core.e_any_from_any
    }

    override fun <T : vx_core.Type_any, U : vx_core.Type_any> vx_any_from_any(generic_any_1 : T, value : U) : T {
      var output : T = vx_core.f_empty(generic_any_1)
      var inputval : vx_core.Type_string = value as vx_core.Type_string
      var outputval : vx_core.Type_any = mydomain_mypackage.f_p_from_text(inputval)
      output = vx_core.f_any_from_any(generic_any_1, outputval)
      return output
    }

    override fun vx_repl(arglist : vx_core.Type_anylist) : vx_core.Type_any {
      var output : vx_core.Type_any = vx_core.e_any
      var text : vx_core.Type_string = vx_core.f_any_from_any(vx_core.t_string, arglist.vx_any(vx_core.vx_new_int(0)))
      output = mydomain_mypackage.f_p_from_text(text)
      return output
    }

    override fun vx_p_from_text(text : vx_core.Type_string) : vx_web_html.Type_p {
      var output : vx_web_html.Type_p = mydomain_mypackage.f_p_from_text(text)
      return output
    }

  }

  val e_p_from_text : mydomain_mypackage.Func_p_from_text = mydomain_mypackage.Class_p_from_text()
  val t_p_from_text : mydomain_mypackage.Func_p_from_text = mydomain_mypackage.Class_p_from_text()

  fun f_p_from_text(text : vx_core.Type_string) : vx_web_html.Type_p {
    var output : vx_web_html.Type_p = vx_web_html.e_p
    output = vx_core.f_new(
      vx_web_html.t_p,
      vx_core.vx_new(
        vx_core.t_anylist,
        vx_core.vx_new_string(":text"),
        text
      )
    )
    return output
  }

  /**
   * @function string_html_from_text
   * Returns HTML text from text with id=app.
   * @param  {string} text
   * @return {string}
   * (func string-html<-text)
   */
  interface Func_string_html_from_text : vx_core.Func_any_from_any {
    fun vx_string_html_from_text(text : vx_core.Type_string) : vx_core.Type_string
  }

  class Class_string_html_from_text : vx_core.Class_base, Func_string_html_from_text {
    constructor() {}

    override fun vx_new(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_string_html_from_text = mydomain_mypackage.Class_string_html_from_text()
      return output
    }

    override fun vx_copy(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_string_html_from_text = mydomain_mypackage.Class_string_html_from_text()
      return output
    }

    override fun vx_typedef() : vx_core.Type_typedef {
      var output : vx_core.Type_typedef = vx_core.t_func.vx_typedef()
      return output
    }

    override fun vx_funcdef() : vx_core.Type_funcdef {
      var output : vx_core.Type_funcdef = vx_core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "string-html<-text", // name
        0, // idx
        false, // async
        vx_core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          vx_core.e_typelist, // traits
          vx_core.e_typelist, // allowtypes
          vx_core.e_typelist, // disallowtypes
          vx_core.e_funclist, // allowfuncs
          vx_core.e_funclist, // disallowfuncs
          vx_core.e_anylist, // allowvalues
          vx_core.e_anylist, // disallowvalues
          vx_core.e_argmap // properties
        ) // typedef
      )
      return output
    }

    override fun vx_empty() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.e_string_html_from_text
      return output
    }

    override fun vx_type() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.t_string_html_from_text
      return output
    }

    override fun vx_fn_new(fn : vx_core.Class_any_from_any.IFn) : vx_core.Func_any_from_any {
      return vx_core.e_any_from_any
    }

    override fun <T : vx_core.Type_any, U : vx_core.Type_any> vx_any_from_any(generic_any_1 : T, value : U) : T {
      var output : T = vx_core.f_empty(generic_any_1)
      var inputval : vx_core.Type_string = value as vx_core.Type_string
      var outputval : vx_core.Type_any = mydomain_mypackage.f_string_html_from_text(inputval)
      output = vx_core.f_any_from_any(generic_any_1, outputval)
      return output
    }

    override fun vx_repl(arglist : vx_core.Type_anylist) : vx_core.Type_any {
      var output : vx_core.Type_any = vx_core.e_any
      var text : vx_core.Type_string = vx_core.f_any_from_any(vx_core.t_string, arglist.vx_any(vx_core.vx_new_int(0)))
      output = mydomain_mypackage.f_string_html_from_text(text)
      return output
    }

    override fun vx_string_html_from_text(text : vx_core.Type_string) : vx_core.Type_string {
      var output : vx_core.Type_string = mydomain_mypackage.f_string_html_from_text(text)
      return output
    }

  }

  val e_string_html_from_text : mydomain_mypackage.Func_string_html_from_text = mydomain_mypackage.Class_string_html_from_text()
  val t_string_html_from_text : mydomain_mypackage.Func_string_html_from_text = mydomain_mypackage.Class_string_html_from_text()

  fun f_string_html_from_text(text : vx_core.Type_string) : vx_core.Type_string {
    var output : vx_core.Type_string = vx_core.e_string
    output = vx_core.f_let(
      vx_core.t_string,
      vx_core.t_any_from_func.vx_fn_new({ ->
        var p : vx_web_html.Type_p = mydomain_mypackage.f_p_from_text(
          text
        )
        var output_1 : vx_core.Type_any = vx_web_html.f_string_from_node(
          p
        )
        output_1
      })
    )
    return output
  }

  /**
   * @function string_render_from_text
   * Replaces HTML node with id=app.
   * @param  {string} text
   * @return {string}
   * (func string-render<-text)
   */
  interface Func_string_render_from_text : vx_core.Func_any_from_any {
    fun vx_string_render_from_text(text : vx_core.Type_string) : vx_core.Type_string
  }

  class Class_string_render_from_text : vx_core.Class_base, Func_string_render_from_text {
    constructor() {}

    override fun vx_new(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_string_render_from_text = mydomain_mypackage.Class_string_render_from_text()
      return output
    }

    override fun vx_copy(vararg vals : Any) : vx_core.Type_any {
      val output : mydomain_mypackage.Class_string_render_from_text = mydomain_mypackage.Class_string_render_from_text()
      return output
    }

    override fun vx_typedef() : vx_core.Type_typedef {
      var output : vx_core.Type_typedef = vx_core.t_func.vx_typedef()
      return output
    }

    override fun vx_funcdef() : vx_core.Type_funcdef {
      var output : vx_core.Type_funcdef = vx_core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "string-render<-text", // name
        0, // idx
        false, // async
        vx_core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          vx_core.e_typelist, // traits
          vx_core.e_typelist, // allowtypes
          vx_core.e_typelist, // disallowtypes
          vx_core.e_funclist, // allowfuncs
          vx_core.e_funclist, // disallowfuncs
          vx_core.e_anylist, // allowvalues
          vx_core.e_anylist, // disallowvalues
          vx_core.e_argmap // properties
        ) // typedef
      )
      return output
    }

    override fun vx_empty() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.e_string_render_from_text
      return output
    }

    override fun vx_type() : vx_core.Type_any {
      var output : vx_core.Type_any = mydomain_mypackage.t_string_render_from_text
      return output
    }

    override fun vx_fn_new(fn : vx_core.Class_any_from_any.IFn) : vx_core.Func_any_from_any {
      return vx_core.e_any_from_any
    }

    override fun <T : vx_core.Type_any, U : vx_core.Type_any> vx_any_from_any(generic_any_1 : T, value : U) : T {
      var output : T = vx_core.f_empty(generic_any_1)
      var inputval : vx_core.Type_string = value as vx_core.Type_string
      var outputval : vx_core.Type_any = mydomain_mypackage.f_string_render_from_text(inputval)
      output = vx_core.f_any_from_any(generic_any_1, outputval)
      return output
    }

    override fun vx_repl(arglist : vx_core.Type_anylist) : vx_core.Type_any {
      var output : vx_core.Type_any = vx_core.e_any
      var text : vx_core.Type_string = vx_core.f_any_from_any(vx_core.t_string, arglist.vx_any(vx_core.vx_new_int(0)))
      output = mydomain_mypackage.f_string_render_from_text(text)
      return output
    }

    override fun vx_string_render_from_text(text : vx_core.Type_string) : vx_core.Type_string {
      var output : vx_core.Type_string = mydomain_mypackage.f_string_render_from_text(text)
      return output
    }

  }

  val e_string_render_from_text : mydomain_mypackage.Func_string_render_from_text = mydomain_mypackage.Class_string_render_from_text()
  val t_string_render_from_text : mydomain_mypackage.Func_string_render_from_text = mydomain_mypackage.Class_string_render_from_text()

  fun f_string_render_from_text(text : vx_core.Type_string) : vx_core.Type_string {
    var output : vx_core.Type_string = vx_core.e_string
    output = vx_core.f_let(
      vx_core.t_string,
      vx_core.t_any_from_func.vx_fn_new({ ->
        var shtml : vx_core.Type_string = mydomain_mypackage.f_string_html_from_text(
          text
        )
        var iswrite : vx_core.Type_boolean = vx_web_htmldoc.f_boolean_write_from_id_htmltext(
          vx_core.vx_new_string("app"),
          shtml
        )
        var output_1 : vx_core.Type_any = shtml
        output_1
      })
    )
    return output
  }


  init {
    var maptype : MutableMap<String, vx_core.Type_any> = LinkedHashMap<String, vx_core.Type_any>()
    var mapconst : MutableMap<String, vx_core.Type_any> = LinkedHashMap<String, vx_core.Type_any>()
    var mapfunc : MutableMap<String, vx_core.Type_func> = LinkedHashMap<String, vx_core.Type_func>()
    maptype.put("mycontext", mydomain_mypackage.t_mycontext)
    mapfunc.put("context-main", mydomain_mypackage.t_context_main)
    mapfunc.put("main-exe", mydomain_mypackage.t_main_exe)
    mapfunc.put("main-html", mydomain_mypackage.t_main_html)
    mapfunc.put("myfunc", mydomain_mypackage.t_myfunc)
    mapfunc.put("p<-text", mydomain_mypackage.t_p_from_text)
    mapfunc.put("string-html<-text", mydomain_mypackage.t_string_html_from_text)
    mapfunc.put("string-render<-text", mydomain_mypackage.t_string_render_from_text)
    vx_core.vx_global_package_set("mydomain/mypackage", maptype, mapconst, mapfunc)
  }

}
