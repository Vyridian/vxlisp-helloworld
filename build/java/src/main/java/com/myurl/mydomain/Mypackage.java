package com.myurl.mydomain;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.vx.web.*;

public final class Mypackage {


  /**
   * type: mycontext
   * A user defined context.
   * (type mycontext)
   */
  public interface Type_mycontext extends Core.Type_struct, Core.Type_context {
    public Core.Type_string code();
    public Core.Type_session session();
    public Core.Type_setting setting();
    public Core.Type_state state();
  }

  public static class Class_mycontext extends Core.Class_base implements Type_mycontext {

    public Core.Type_string vx_p_code = null;

    @Override
    public Core.Type_string code() {
      Core.Type_string output = Core.e_string;
      Core.Type_string testnull = vx_p_code;
      if (testnull != null) {
        output = testnull;
      }
      return output;
    }

    public Core.Type_session vx_p_session = null;

    @Override
    public Core.Type_session session() {
      Core.Type_session output = Core.e_session;
      Core.Type_session testnull = vx_p_session;
      if (testnull != null) {
        output = testnull;
      }
      return output;
    }

    public Core.Type_setting vx_p_setting = null;

    @Override
    public Core.Type_setting setting() {
      Core.Type_setting output = Core.e_setting;
      Core.Type_setting testnull = vx_p_setting;
      if (testnull != null) {
        output = testnull;
      }
      return output;
    }

    public Core.Type_state vx_p_state = null;

    @Override
    public Core.Type_state state() {
      Core.Type_state output = Core.e_state;
      Core.Type_state testnull = vx_p_state;
      if (testnull != null) {
        output = testnull;
      }
      return output;
    }

    @Override
    public Core.Type_any vx_any(final Core.Type_string key) {
      Core.Type_any output = Core.e_any;
      String skey = key.vx_string();
      if (false) {
      } else if ((skey.equals(":code"))) {
        output = this.code();
      } else if ((skey.equals(":session"))) {
        output = this.session();
      } else if ((skey.equals(":setting"))) {
        output = this.setting();
      } else if ((skey.equals(":state"))) {
        output = this.state();
      }
      return output;
    }

    @Override
    public Map<String, Core.Type_any> vx_map() {
      Map<String, Core.Type_any> map = new LinkedHashMap<String, Core.Type_any>();
      map.put(":code", this.code());
      map.put(":session", this.session());
      map.put(":setting", this.setting());
      map.put(":state", this.state());
      Map<String, Core.Type_any> output = Core.immutablemap(map);
      return output;
    }

    @Override
    public Core.Type_any vx_new(final Object... vals) {
      Mypackage.Type_mycontext output = Core.vx_copy(Mypackage.e_mycontext, vals);
      return output;
    }

    @Override
    public Core.Type_any vx_copy(final Object... vals) {
      Mypackage.Type_mycontext output = this;
      boolean ischanged = false;
      Mypackage.Class_mycontext value = this;
      Core.Type_msgblock msgblock = Core.vx_msgblock_from_copy_arrayval(value, vals);
      if (this.vx_constdef() != Core.e_constdef) {
        ischanged = true;
      }
      Core.Type_string vx_p_code = value.code();
      Core.Type_session vx_p_session = value.session();
      Core.Type_setting vx_p_setting = value.setting();
      Core.Type_state vx_p_state = value.state();
      List<String> validkeys = new ArrayList<String>();
      validkeys.add(":code");
      validkeys.add(":session");
      validkeys.add(":setting");
      validkeys.add(":state");
      String key = "";
      Core.Type_msg msg = Core.e_msg;
      Core.Type_any msgval = Core.e_any;
      for (Object valsub : vals) {
        if (valsub instanceof Core.Type_msgblock) {
          msgblock = Core.vx_copy(msgblock, valsub);
        } else if (valsub instanceof Core.Type_msg) {
          msgblock = Core.vx_copy(msgblock, valsub);
        } else if (key.equals("")) {
          boolean istestkey = false;
          String testkey = "";
          if (false) {
          } else if (valsub instanceof Core.Type_string) {
            Core.Type_string valstr = (Core.Type_string)valsub;
            testkey = valstr.vx_string();
            istestkey = true;
          } else if (valsub instanceof String) {
            String sval = (String)valsub;
            testkey = sval;
            istestkey = true;
          } else {
            if (false) {
            } else if (valsub instanceof Core.Type_any) {
              Core.Type_any valmsg = (Core.Type_any)valsub;
              msgval = valmsg;
            } else {
              msgval = Core.vx_new_string(valsub.toString());
            }
            msg = Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidkeytype", msgval);
            msgblock = Core.vx_copy(msgblock, msg);
          }
          if (istestkey) {
            if (!testkey.startsWith(":")) {
              testkey = ":" + testkey;
            }
            boolean isvalidkey = validkeys.contains(testkey);
            if (isvalidkey) {
              key = testkey;
            } else {
              msgval = Core.vx_new_string(testkey);
              msg = Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidkey", msgval);
              msgblock = Core.vx_copy(msgblock, msg);
            }
          }
        } else {
          if (false) {
          } else if ((key.equals(":code"))) {
            if (valsub == vx_p_code) {
            } else if (valsub instanceof Core.Type_string) {
              Core.Type_string valcode = (Core.Type_string)valsub;
              ischanged = true;
              vx_p_code = valcode;
            } else if (valsub instanceof String) {
              ischanged = true;
              vx_p_code = Core.vx_new(Core.t_string, valsub);
            } else {
              if (false) {
              } else if (valsub instanceof Core.Type_any) {
                Core.Type_any valinvalid = (Core.Type_any)valsub;
                msgval = valinvalid;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<String, Core.Type_any>();
              mapany.put("key", Core.vx_new_string("code"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidvalue", msgmap);
              msgblock = Core.vx_copy(msgblock, msg);
            }
          } else if ((key.equals(":session"))) {
            if (valsub == vx_p_session) {
            } else if (valsub instanceof Core.Type_session) {
              Core.Type_session valsession = (Core.Type_session)valsub;
              ischanged = true;
              vx_p_session = valsession;
            } else {
              if (false) {
              } else if (valsub instanceof Core.Type_any) {
                Core.Type_any valinvalid = (Core.Type_any)valsub;
                msgval = valinvalid;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<String, Core.Type_any>();
              mapany.put("key", Core.vx_new_string("session"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidvalue", msgmap);
              msgblock = Core.vx_copy(msgblock, msg);
            }
          } else if ((key.equals(":setting"))) {
            if (valsub == vx_p_setting) {
            } else if (valsub instanceof Core.Type_setting) {
              Core.Type_setting valsetting = (Core.Type_setting)valsub;
              ischanged = true;
              vx_p_setting = valsetting;
            } else {
              if (false) {
              } else if (valsub instanceof Core.Type_any) {
                Core.Type_any valinvalid = (Core.Type_any)valsub;
                msgval = valinvalid;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<String, Core.Type_any>();
              mapany.put("key", Core.vx_new_string("setting"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidvalue", msgmap);
              msgblock = Core.vx_copy(msgblock, msg);
            }
          } else if ((key.equals(":state"))) {
            if (valsub == vx_p_state) {
            } else if (valsub instanceof Core.Type_state) {
              Core.Type_state valstate = (Core.Type_state)valsub;
              ischanged = true;
              vx_p_state = valstate;
            } else {
              if (false) {
              } else if (valsub instanceof Core.Type_any) {
                Core.Type_any valinvalid = (Core.Type_any)valsub;
                msgval = valinvalid;
              } else {
                msgval = Core.vx_new_string(valsub.toString());
              }
              Map<String, Core.Type_any> mapany = new LinkedHashMap<String, Core.Type_any>();
              mapany.put("key", Core.vx_new_string("state"));
              mapany.put("value", msgval);
              Core.Type_map msgmap = Core.t_anymap.vx_new_from_map(mapany);
              msg = Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidvalue", msgmap);
              msgblock = Core.vx_copy(msgblock, msg);
            }
          } else {
            msgval = Core.vx_new_string(key);
            msg = Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidkey", msgval);
            msgblock = Core.vx_copy(msgblock, msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Core.e_msgblock)) {
        Mypackage.Class_mycontext work = new Mypackage.Class_mycontext();
        work.vx_p_code = vx_p_code;
        work.vx_p_session = vx_p_session;
        work.vx_p_setting = vx_p_setting;
        work.vx_p_state = vx_p_state;
        if (msgblock != Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    @Override
    public Core.Type_any vx_empty() {
      Core.Type_any output = Mypackage.e_mycontext;
      return output;
    }

    @Override
    public Core.Type_any vx_type() {
      Core.Type_any output = Mypackage.t_mycontext;
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {
      Core.Type_typedef output = Core.typedef_new(
        "mydomain/mypackage", // pkgname
        "mycontext", // name
        ":struct", // extends
        Core.vx_new(Core.t_typelist, Core.t_context), // traits
        Core.e_typelist, // allowtypes
        Core.e_typelist, // disallowtypes
        Core.e_funclist, // allowfuncs
        Core.e_funclist, // disallowfuncs
        Core.e_anylist, // allowvalues
        Core.e_anylist, // disallowvalues
        Core.e_argmap // properties
      );
      return output;
    }

  }

  public static final Mypackage.Type_mycontext e_mycontext = new Mypackage.Class_mycontext();
  public static final Mypackage.Type_mycontext t_mycontext = new Mypackage.Class_mycontext();
  /**
   * @function context_main
   * Returns the context for execution. Arguments come from the command line.
   * @param  {anylist} args
   * @return {context}
   * (func context-main)
   */
  public interface Func_context_main extends Core.Func_any_from_any {
    public Core.Type_context vx_context_main(final Core.Type_anylist args);
  }

  public static class Class_context_main extends Core.Class_base implements Func_context_main {

    @Override
    public Core.Type_any vx_new(final Object... vals) {
      Mypackage.Class_context_main output = new Mypackage.Class_context_main();
      return output;
    }

    @Override
    public Core.Type_any vx_copy(final Object... vals) {
      Mypackage.Class_context_main output = new Mypackage.Class_context_main();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {
      Core.Type_typedef output = Core.t_func.vx_typedef();
      return output;
    }

    @Override
    public Core.Type_funcdef vx_funcdef() {
      Core.Type_funcdef output = Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "context-main", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "context", // name
          ":struct", // extends
          Core.e_typelist, // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    @Override
    public Core.Type_any vx_empty() {
      Core.Type_any output = Mypackage.e_context_main;
      return output;
    }

    @Override
    public Core.Type_any vx_type() {
      Core.Type_any output = Mypackage.t_context_main;
      return output;
    }

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {
      return Core.e_any_from_any;
    }

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_anylist inputval = (Core.Type_anylist)value;
      Core.Type_any outputval = Mypackage.f_context_main(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    @Override
    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_anylist args = Core.f_any_from_any(Core.t_anylist, arglist.vx_any(Core.vx_new_int(0)));
      output = Mypackage.f_context_main(args);
      return output;
    }

    @Override
    public Core.Type_context vx_context_main(final Core.Type_anylist args) {
      Core.Type_context output = Mypackage.f_context_main(args);
      return output;
    }

  }

  public static final Mypackage.Func_context_main e_context_main = new Mypackage.Class_context_main();
  public static final Mypackage.Func_context_main t_context_main = new Mypackage.Class_context_main();

  public static Core.Type_context f_context_main(final Core.Type_anylist args) {
    Core.Type_context output = Core.e_context;
    return output;
  }

  /**
   * @function main_exe
   * The default function for app main execution. Arguments come from the command line.
   * @param  {anylist} args
   * @return {string}
   * (func main-exe)
   */
  public interface Func_main_exe extends Core.Func_any_from_any_context {
    public Core.Type_string vx_main_exe(final Core.Type_context context, final Core.Type_anylist args);
  }

  public static class Class_main_exe extends Core.Class_base implements Func_main_exe {

    @Override
    public Core.Type_any vx_new(final Object... vals) {
      Mypackage.Class_main_exe output = new Mypackage.Class_main_exe();
      return output;
    }

    @Override
    public Core.Type_any vx_copy(final Object... vals) {
      Mypackage.Class_main_exe output = new Mypackage.Class_main_exe();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {
      Core.Type_typedef output = Core.t_func.vx_typedef();
      return output;
    }

    @Override
    public Core.Type_funcdef vx_funcdef() {
      Core.Type_funcdef output = Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "main-exe", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Core.e_typelist, // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    @Override
    public Core.Type_any vx_empty() {
      Core.Type_any output = Mypackage.e_main_exe;
      return output;
    }

    @Override
    public Core.Type_any vx_type() {
      Core.Type_any output = Mypackage.t_main_exe;
      return output;
    }

    @Override
    public Core.Func_any_from_any_context vx_fn_new(Core.Class_any_from_any_context.IFn fn) {
      return Core.e_any_from_any_context;
    }

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any_context(final T generic_any_1, final Core.Type_context context, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_anylist inputval = (Core.Type_anylist)value;
      Core.Type_any outputval = Mypackage.f_main_exe(context, inputval);
      output = Core.f_any_from_any_context(generic_any_1, context, outputval);
      return output;
    }

    @Override
    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_context context = Core.f_any_from_any(Core.t_context, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_anylist args = Core.f_any_from_any(Core.t_anylist, arglist.vx_any(Core.vx_new_int(0)));
      output = Mypackage.f_main_exe(context, args);
      return output;
    }

    @Override
    public Core.Type_string vx_main_exe(final Core.Type_context context, final Core.Type_anylist args) {
      Core.Type_string output = Mypackage.f_main_exe(context, args);
      return output;
    }

  }

  public static final Mypackage.Func_main_exe e_main_exe = new Mypackage.Class_main_exe();
  public static final Mypackage.Func_main_exe t_main_exe = new Mypackage.Class_main_exe();

  public static Core.Type_string f_main_exe(final Core.Type_context context, final Core.Type_anylist args) {
    Core.Type_string output = Core.e_string;
    output = Core.vx_new_string("Hello World");
    return output;
  }

  /**
   * @function main_html
   * The default function for app main html output. Arguments come from the command line.
   * @param  {anylist} args
   * @return {string}
   * (func main-html)
   */
  public interface Func_main_html extends Core.Func_any_from_any_context {
    public Core.Type_string vx_main_html(final Core.Type_context context, final Core.Type_anylist args);
  }

  public static class Class_main_html extends Core.Class_base implements Func_main_html {

    @Override
    public Core.Type_any vx_new(final Object... vals) {
      Mypackage.Class_main_html output = new Mypackage.Class_main_html();
      return output;
    }

    @Override
    public Core.Type_any vx_copy(final Object... vals) {
      Mypackage.Class_main_html output = new Mypackage.Class_main_html();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {
      Core.Type_typedef output = Core.t_func.vx_typedef();
      return output;
    }

    @Override
    public Core.Type_funcdef vx_funcdef() {
      Core.Type_funcdef output = Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "main-html", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Core.e_typelist, // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    @Override
    public Core.Type_any vx_empty() {
      Core.Type_any output = Mypackage.e_main_html;
      return output;
    }

    @Override
    public Core.Type_any vx_type() {
      Core.Type_any output = Mypackage.t_main_html;
      return output;
    }

    @Override
    public Core.Func_any_from_any_context vx_fn_new(Core.Class_any_from_any_context.IFn fn) {
      return Core.e_any_from_any_context;
    }

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any_context(final T generic_any_1, final Core.Type_context context, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_anylist inputval = (Core.Type_anylist)value;
      Core.Type_any outputval = Mypackage.f_main_html(context, inputval);
      output = Core.f_any_from_any_context(generic_any_1, context, outputval);
      return output;
    }

    @Override
    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_context context = Core.f_any_from_any(Core.t_context, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_anylist args = Core.f_any_from_any(Core.t_anylist, arglist.vx_any(Core.vx_new_int(0)));
      output = Mypackage.f_main_html(context, args);
      return output;
    }

    @Override
    public Core.Type_string vx_main_html(final Core.Type_context context, final Core.Type_anylist args) {
      Core.Type_string output = Mypackage.f_main_html(context, args);
      return output;
    }

  }

  public static final Mypackage.Func_main_html e_main_html = new Mypackage.Class_main_html();
  public static final Mypackage.Func_main_html t_main_html = new Mypackage.Class_main_html();

  public static Core.Type_string f_main_html(final Core.Type_context context, final Core.Type_anylist args) {
    Core.Type_string output = Core.e_string;
    output = Mypackage.f_string_render_from_text(
      Core.vx_new_string("Hello World")
    );
    return output;
  }

  /**
   * @function myfunc
   * This function adds two integers and multiplies by 2. It includes documentation and a test case.
   * @param  {int} arg1
   * @param  {int} arg2
   * @return {int}
   * (func myfunc)
   */
  public interface Func_myfunc extends Core.Type_func, Core.Type_replfunc {
    public Core.Type_int vx_myfunc(final Core.Type_int arg1, final Core.Type_int arg2);
  }

  public static class Class_myfunc extends Core.Class_base implements Func_myfunc {

    @Override
    public Core.Type_any vx_new(final Object... vals) {
      Mypackage.Class_myfunc output = new Mypackage.Class_myfunc();
      return output;
    }

    @Override
    public Core.Type_any vx_copy(final Object... vals) {
      Mypackage.Class_myfunc output = new Mypackage.Class_myfunc();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {
      Core.Type_typedef output = Core.t_func.vx_typedef();
      return output;
    }

    @Override
    public Core.Type_funcdef vx_funcdef() {
      Core.Type_funcdef output = Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "myfunc", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "int", // name
          "", // extends
          Core.vx_new(Core.t_typelist, Core.t_number), // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    @Override
    public Core.Type_any vx_empty() {
      Core.Type_any output = Mypackage.e_myfunc;
      return output;
    }

    @Override
    public Core.Type_any vx_type() {
      Core.Type_any output = Mypackage.t_myfunc;
      return output;
    }

    @Override
    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_int arg1 = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_int arg2 = Core.f_any_from_any(Core.t_int, arglist.vx_any(Core.vx_new_int(1)));
      output = Mypackage.f_myfunc(arg1, arg2);
      return output;
    }

    @Override
    public Core.Type_int vx_myfunc(final Core.Type_int arg1, final Core.Type_int arg2) {
      Core.Type_int output = Mypackage.f_myfunc(arg1, arg2);
      return output;
    }

  }

  public static final Mypackage.Func_myfunc e_myfunc = new Mypackage.Class_myfunc();
  public static final Mypackage.Func_myfunc t_myfunc = new Mypackage.Class_myfunc();

  public static Core.Type_int f_myfunc(final Core.Type_int arg1, final Core.Type_int arg2) {
    Core.Type_int output = Core.e_int;
    output = Core.f_multiply(
      Core.f_plus(
        arg1,
        arg2
      ),
      Core.vx_new_int(2)
    );
    return output;
  }

  /**
   * @function p_from_text
   * Returns an HTML paragraph tag from text.
   * @param  {string} text
   * @return {p}
   * (func p<-text)
   */
  public interface Func_p_from_text extends Core.Func_any_from_any {
    public Html.Type_p vx_p_from_text(final Core.Type_string text);
  }

  public static class Class_p_from_text extends Core.Class_base implements Func_p_from_text {

    @Override
    public Core.Type_any vx_new(final Object... vals) {
      Mypackage.Class_p_from_text output = new Mypackage.Class_p_from_text();
      return output;
    }

    @Override
    public Core.Type_any vx_copy(final Object... vals) {
      Mypackage.Class_p_from_text output = new Mypackage.Class_p_from_text();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {
      Core.Type_typedef output = Core.t_func.vx_typedef();
      return output;
    }

    @Override
    public Core.Type_funcdef vx_funcdef() {
      Core.Type_funcdef output = Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "p<-text", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/web/html", // pkgname
          "p", // name
          ":struct", // extends
          Core.vx_new(Core.t_typelist, Html.t_node, Html.t_divchild), // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    @Override
    public Core.Type_any vx_empty() {
      Core.Type_any output = Mypackage.e_p_from_text;
      return output;
    }

    @Override
    public Core.Type_any vx_type() {
      Core.Type_any output = Mypackage.t_p_from_text;
      return output;
    }

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {
      return Core.e_any_from_any;
    }

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_string inputval = (Core.Type_string)value;
      Core.Type_any outputval = Mypackage.f_p_from_text(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    @Override
    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_string text = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(0)));
      output = Mypackage.f_p_from_text(text);
      return output;
    }

    @Override
    public Html.Type_p vx_p_from_text(final Core.Type_string text) {
      Html.Type_p output = Mypackage.f_p_from_text(text);
      return output;
    }

  }

  public static final Mypackage.Func_p_from_text e_p_from_text = new Mypackage.Class_p_from_text();
  public static final Mypackage.Func_p_from_text t_p_from_text = new Mypackage.Class_p_from_text();

  public static Html.Type_p f_p_from_text(final Core.Type_string text) {
    Html.Type_p output = Html.e_p;
    output = Core.f_new(
      Html.t_p,
      Core.vx_new(
        Core.t_anylist,
        Core.vx_new_string(":text"),
        text
      )
    );
    return output;
  }

  /**
   * @function string_html_from_text
   * Returns HTML text from text with id=app.
   * @param  {string} text
   * @return {string}
   * (func string-html<-text)
   */
  public interface Func_string_html_from_text extends Core.Func_any_from_any {
    public Core.Type_string vx_string_html_from_text(final Core.Type_string text);
  }

  public static class Class_string_html_from_text extends Core.Class_base implements Func_string_html_from_text {

    @Override
    public Core.Type_any vx_new(final Object... vals) {
      Mypackage.Class_string_html_from_text output = new Mypackage.Class_string_html_from_text();
      return output;
    }

    @Override
    public Core.Type_any vx_copy(final Object... vals) {
      Mypackage.Class_string_html_from_text output = new Mypackage.Class_string_html_from_text();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {
      Core.Type_typedef output = Core.t_func.vx_typedef();
      return output;
    }

    @Override
    public Core.Type_funcdef vx_funcdef() {
      Core.Type_funcdef output = Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "string-html<-text", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Core.e_typelist, // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    @Override
    public Core.Type_any vx_empty() {
      Core.Type_any output = Mypackage.e_string_html_from_text;
      return output;
    }

    @Override
    public Core.Type_any vx_type() {
      Core.Type_any output = Mypackage.t_string_html_from_text;
      return output;
    }

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {
      return Core.e_any_from_any;
    }

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_string inputval = (Core.Type_string)value;
      Core.Type_any outputval = Mypackage.f_string_html_from_text(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    @Override
    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_string text = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(0)));
      output = Mypackage.f_string_html_from_text(text);
      return output;
    }

    @Override
    public Core.Type_string vx_string_html_from_text(final Core.Type_string text) {
      Core.Type_string output = Mypackage.f_string_html_from_text(text);
      return output;
    }

  }

  public static final Mypackage.Func_string_html_from_text e_string_html_from_text = new Mypackage.Class_string_html_from_text();
  public static final Mypackage.Func_string_html_from_text t_string_html_from_text = new Mypackage.Class_string_html_from_text();

  public static Core.Type_string f_string_html_from_text(final Core.Type_string text) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        Html.Type_p p = Mypackage.f_p_from_text(
          text
        );
        Core.Type_any output_1 = Html.f_string_from_node(
          p
        );
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function string_render_from_text
   * Replaces HTML node with id=app.
   * @param  {string} text
   * @return {string}
   * (func string-render<-text)
   */
  public interface Func_string_render_from_text extends Core.Func_any_from_any {
    public Core.Type_string vx_string_render_from_text(final Core.Type_string text);
  }

  public static class Class_string_render_from_text extends Core.Class_base implements Func_string_render_from_text {

    @Override
    public Core.Type_any vx_new(final Object... vals) {
      Mypackage.Class_string_render_from_text output = new Mypackage.Class_string_render_from_text();
      return output;
    }

    @Override
    public Core.Type_any vx_copy(final Object... vals) {
      Mypackage.Class_string_render_from_text output = new Mypackage.Class_string_render_from_text();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {
      Core.Type_typedef output = Core.t_func.vx_typedef();
      return output;
    }

    @Override
    public Core.Type_funcdef vx_funcdef() {
      Core.Type_funcdef output = Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "string-render<-text", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Core.e_typelist, // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    @Override
    public Core.Type_any vx_empty() {
      Core.Type_any output = Mypackage.e_string_render_from_text;
      return output;
    }

    @Override
    public Core.Type_any vx_type() {
      Core.Type_any output = Mypackage.t_string_render_from_text;
      return output;
    }

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {
      return Core.e_any_from_any;
    }

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_string inputval = (Core.Type_string)value;
      Core.Type_any outputval = Mypackage.f_string_render_from_text(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    @Override
    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_string text = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(0)));
      output = Mypackage.f_string_render_from_text(text);
      return output;
    }

    @Override
    public Core.Type_string vx_string_render_from_text(final Core.Type_string text) {
      Core.Type_string output = Mypackage.f_string_render_from_text(text);
      return output;
    }

  }

  public static final Mypackage.Func_string_render_from_text e_string_render_from_text = new Mypackage.Class_string_render_from_text();
  public static final Mypackage.Func_string_render_from_text t_string_render_from_text = new Mypackage.Class_string_render_from_text();

  public static Core.Type_string f_string_render_from_text(final Core.Type_string text) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        Core.Type_string shtml = Mypackage.f_string_html_from_text(
          text
        );
        Core.Type_boolean iswrite = Htmldoc.f_boolean_write_from_id_htmltext(
          Core.vx_new_string("app"),
          shtml
        );
        Core.Type_any output_1 = shtml;
        return output_1;
      })
    );
    return output;
  }


  static {
    Map<String, Core.Type_any> maptype = new LinkedHashMap<String, Core.Type_any>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<String, Core.Type_any>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<String, Core.Type_func>();
    maptype.put("mycontext", Mypackage.t_mycontext);
    mapfunc.put("context-main", Mypackage.t_context_main);
    mapfunc.put("main-exe", Mypackage.t_main_exe);
    mapfunc.put("main-html", Mypackage.t_main_html);
    mapfunc.put("myfunc", Mypackage.t_myfunc);
    mapfunc.put("p<-text", Mypackage.t_p_from_text);
    mapfunc.put("string-html<-text", Mypackage.t_string_html_from_text);
    mapfunc.put("string-render<-text", Mypackage.t_string_render_from_text);
    Core.vx_global_package_set("mydomain/mypackage", maptype, mapconst, mapfunc);
  }

}
