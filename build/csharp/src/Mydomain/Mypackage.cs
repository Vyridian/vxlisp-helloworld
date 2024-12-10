namespace Mydomain;

public static class Mypackage {


  /**
   * type: mycontext
   * A user defined context.
   * (type mycontext)
   */
  public interface Type_mycontext : Vx.Core.Type_struct, Vx.Core.Type_context {
  }

  public class Class_mycontext : Vx.Core.Class_base, Type_mycontext {

    public Vx.Core.Type_string? vx_p_code = null;

    public Vx.Core.Type_string code() {
      Vx.Core.Type_string output = Vx.Core.e_string;
      Vx.Core.Type_string? testnull = vx_p_code;
      if (testnull != null) {
        output = testnull;
      }
      return output;
    }

    public Vx.Core.Type_session? vx_p_session = null;

    public Vx.Core.Type_session session() {
      Vx.Core.Type_session output = Vx.Core.e_session;
      Vx.Core.Type_session? testnull = vx_p_session;
      if (testnull != null) {
        output = testnull;
      }
      return output;
    }

    public Vx.Core.Type_setting? vx_p_setting = null;

    public Vx.Core.Type_setting setting() {
      Vx.Core.Type_setting output = Vx.Core.e_setting;
      Vx.Core.Type_setting? testnull = vx_p_setting;
      if (testnull != null) {
        output = testnull;
      }
      return output;
    }

    public Vx.Core.Type_state? vx_p_state = null;

    public Vx.Core.Type_state state() {
      Vx.Core.Type_state output = Vx.Core.e_state;
      Vx.Core.Type_state? testnull = vx_p_state;
      if (testnull != null) {
        output = testnull;
      }
      return output;
    }

    public Vx.Core.Type_any vx_any(Vx.Core.Type_string key) {
      Vx.Core.Type_any output = Vx.Core.e_any;
      string skey = key.vx_string();
      if (false) {
      } else if ((skey == ":code")) {
        output = this.code();
      } else if ((skey == ":session")) {
        output = this.session();
      } else if ((skey == ":setting")) {
        output = this.setting();
      } else if ((skey == ":state")) {
        output = this.state();
      }
      return output;
    }

    public Vx.Core.Map<string, Vx.Core.Type_any> vx_map() {
      Vx.Core.Map<string, Vx.Core.Type_any> map = new Vx.Core.LinkedHashMap<string, Vx.Core.Type_any>();
      map.put(":code", this.code());
      map.put(":session", this.session());
      map.put(":setting", this.setting());
      map.put(":state", this.state());
      Vx.Core.Map<string, Vx.Core.Type_any> output = Vx.Core.immutablemap(map);
      return output;
    }

    public override Vx.Core.Type_any vx_new(params object[] vals) {
      Mydomain.Mypackage.Type_mycontext output = Vx.Core.vx_copy(Mydomain.Mypackage.e_mycontext, vals);
      return output;
    }

    public override Vx.Core.Type_any vx_copy(params object[] vals) {
      Mydomain.Mypackage.Type_mycontext output = this;
      bool ischanged = false;
      Mydomain.Mypackage.Class_mycontext value = this;
      Vx.Core.Type_msgblock msgblock = Vx.Core.vx_msgblock_from_copy_arrayval(value, vals);
      if (this.vx_constdef() != Vx.Core.e_constdef) {
        ischanged = true;
      }
      Vx.Core.Type_string vx_p_code = value.code();
      Vx.Core.Type_session vx_p_session = value.session();
      Vx.Core.Type_setting vx_p_setting = value.setting();
      Vx.Core.Type_state vx_p_state = value.state();
      List<string> validkeys = new List<string>();
      validkeys.Add(":code");
      validkeys.Add(":session");
      validkeys.Add(":setting");
      validkeys.Add(":state");
      string key = "";
      Vx.Core.Type_msg msg = Vx.Core.e_msg;
      Vx.Core.Type_any msgval = Vx.Core.e_any;
      foreach (object valsub in vals) {
        if (valsub is Vx.Core.Type_msgblock) {
          msgblock = Vx.Core.vx_copy(msgblock, valsub);
        } else if (valsub is Vx.Core.Type_msg) {
          msgblock = Vx.Core.vx_copy(msgblock, valsub);
        } else if (key == "") {
          bool istestkey = false;
          string testkey = "";
          if (false) {
          } else if (valsub is Vx.Core.Type_string valstr) {
            testkey = valstr.vx_string();
            istestkey = true;
          } else if (valsub is string sval) {
            testkey = sval;
            istestkey = true;
          } else {
            if (false) {
            } else if (valsub is Vx.Core.Type_any valmsg) {
              msgval = valmsg;
            } else {
              msgval = Vx.Core.vx_new_string(Vx.Core.vx_string_from_object(valsub));
            }
            msg = Vx.Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidkeytype", msgval);
            msgblock = Vx.Core.vx_copy(msgblock, msg);
          }
          if (istestkey) {
            if (!testkey.StartsWith(":")) {
              testkey = ":" + testkey;
            }
            bool isvalidkey = validkeys.Contains(testkey);
            if (isvalidkey) {
              key = testkey;
            } else {
              msgval = Vx.Core.vx_new_string(testkey);
              msg = Vx.Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidkey", msgval);
              msgblock = Vx.Core.vx_copy(msgblock, msg);
            }
          }
        } else {
          if (false) {
          } else if ((key == ":code")) {
            if (valsub == vx_p_code) {
            } else if (valsub is Vx.Core.Type_string valcode) {
              ischanged = true;
              vx_p_code = valcode;
            } else if (valsub is string) {
              ischanged = true;
              vx_p_code = Vx.Core.vx_new(Vx.Core.t_string, valsub);
            } else {
              if (false) {
              } else if (valsub is Vx.Core.Type_any valinvalid) {
                msgval = valinvalid;
              } else {
                msgval = Vx.Core.vx_new_string(Vx.Core.vx_string_from_object(valsub));
              }
              Vx.Core.Map<string, Vx.Core.Type_any> mapany = new Vx.Core.LinkedHashMap<string, Vx.Core.Type_any>();
              mapany.put("key", Vx.Core.vx_new_string("code"));
              mapany.put("value", msgval);
              Vx.Core.Type_map msgmap = Vx.Core.t_anymap.vx_new_from_map(mapany);
              msg = Vx.Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidvalue", msgmap);
              msgblock = Vx.Core.vx_copy(msgblock, msg);
            }
          } else if ((key == ":session")) {
            if (valsub == vx_p_session) {
            } else if (valsub is Vx.Core.Type_session valsession) {
              ischanged = true;
              vx_p_session = valsession;
            } else {
              if (false) {
              } else if (valsub is Vx.Core.Type_any valinvalid) {
                msgval = valinvalid;
              } else {
                msgval = Vx.Core.vx_new_string(Vx.Core.vx_string_from_object(valsub));
              }
              Vx.Core.Map<string, Vx.Core.Type_any> mapany = new Vx.Core.LinkedHashMap<string, Vx.Core.Type_any>();
              mapany.put("key", Vx.Core.vx_new_string("session"));
              mapany.put("value", msgval);
              Vx.Core.Type_map msgmap = Vx.Core.t_anymap.vx_new_from_map(mapany);
              msg = Vx.Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidvalue", msgmap);
              msgblock = Vx.Core.vx_copy(msgblock, msg);
            }
          } else if ((key == ":setting")) {
            if (valsub == vx_p_setting) {
            } else if (valsub is Vx.Core.Type_setting valsetting) {
              ischanged = true;
              vx_p_setting = valsetting;
            } else {
              if (false) {
              } else if (valsub is Vx.Core.Type_any valinvalid) {
                msgval = valinvalid;
              } else {
                msgval = Vx.Core.vx_new_string(Vx.Core.vx_string_from_object(valsub));
              }
              Vx.Core.Map<string, Vx.Core.Type_any> mapany = new Vx.Core.LinkedHashMap<string, Vx.Core.Type_any>();
              mapany.put("key", Vx.Core.vx_new_string("setting"));
              mapany.put("value", msgval);
              Vx.Core.Type_map msgmap = Vx.Core.t_anymap.vx_new_from_map(mapany);
              msg = Vx.Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidvalue", msgmap);
              msgblock = Vx.Core.vx_copy(msgblock, msg);
            }
          } else if ((key == ":state")) {
            if (valsub == vx_p_state) {
            } else if (valsub is Vx.Core.Type_state valstate) {
              ischanged = true;
              vx_p_state = valstate;
            } else {
              if (false) {
              } else if (valsub is Vx.Core.Type_any valinvalid) {
                msgval = valinvalid;
              } else {
                msgval = Vx.Core.vx_new_string(Vx.Core.vx_string_from_object(valsub));
              }
              Vx.Core.Map<string, Vx.Core.Type_any> mapany = new Vx.Core.LinkedHashMap<string, Vx.Core.Type_any>();
              mapany.put("key", Vx.Core.vx_new_string("state"));
              mapany.put("value", msgval);
              Vx.Core.Type_map msgmap = Vx.Core.t_anymap.vx_new_from_map(mapany);
              msg = Vx.Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidvalue", msgmap);
              msgblock = Vx.Core.vx_copy(msgblock, msg);
            }
          } else {
            msgval = Vx.Core.vx_new_string(key);
            msg = Vx.Core.vx_msg_from_error("mydomain/mypackage/mycontext", ":invalidkey", msgval);
            msgblock = Vx.Core.vx_copy(msgblock, msg);
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != Vx.Core.e_msgblock)) {
        Mydomain.Mypackage.Class_mycontext work = new Mydomain.Mypackage.Class_mycontext();
        work.vx_p_code = vx_p_code;
        work.vx_p_session = vx_p_session;
        work.vx_p_setting = vx_p_setting;
        work.vx_p_state = vx_p_state;
        if (msgblock != Vx.Core.e_msgblock) {
          work.vxmsgblock = msgblock;
        }
        output = work;
      }
      return output;
    }

    public override Vx.Core.Type_any vx_empty() {
      Vx.Core.Type_any output = Mydomain.Mypackage.e_mycontext;
      return output;
    }

    public override Vx.Core.Type_any vx_type() {
      Vx.Core.Type_any output = Mydomain.Mypackage.t_mycontext;
      return output;
    }

    public override Vx.Core.Type_typedef vx_typedef() {
      Vx.Core.Type_typedef output = Vx.Core.typedef_new(
        "mydomain/mypackage", // pkgname
        "mycontext", // name
        ":struct", // extends
        Vx.Core.vx_new(Vx.Core.t_typelist, Vx.Core.t_context), // traits
        Vx.Core.e_typelist, // allowtypes
        Vx.Core.e_typelist, // disallowtypes
        Vx.Core.e_funclist, // allowfuncs
        Vx.Core.e_funclist, // disallowfuncs
        Vx.Core.e_anylist, // allowvalues
        Vx.Core.e_anylist, // disallowvalues
        Vx.Core.e_argmap // properties
      );
      return output;
    }

  }

  public static Mydomain.Mypackage.Type_mycontext e_mycontext = new Mydomain.Mypackage.Class_mycontext();
  public static Mydomain.Mypackage.Type_mycontext t_mycontext = new Mydomain.Mypackage.Class_mycontext();
  /**
   * @function context_main
   * Returns the context for execution. Arguments come from the command line.
   * @param  {anylist} args
   * @return {context}
   * (func context-main)
   */
  public interface Func_context_main : Vx.Core.Func_any_from_any {
    public Vx.Core.Type_context vx_context_main(Vx.Core.Type_anylist args);
  }

  public class Class_context_main : Vx.Core.Class_base, Func_context_main {

    public override Vx.Core.Type_any vx_new(params object[] vals) {
      Mydomain.Mypackage.Class_context_main output = new Mydomain.Mypackage.Class_context_main();
      return output;
    }

    public override Vx.Core.Type_any vx_copy(params object[] vals) {
      Mydomain.Mypackage.Class_context_main output = new Mydomain.Mypackage.Class_context_main();
      return output;
    }

    public override Vx.Core.Type_typedef vx_typedef() {
      Vx.Core.Type_typedef output = Vx.Core.t_func.vx_typedef();
      return output;
    }

    public Vx.Core.Type_funcdef vx_funcdef() {
      Vx.Core.Type_funcdef output = Vx.Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "context-main", // name
        0, // idx
        false, // async
        Vx.Core.typedef_new(
          "vx/core", // pkgname
          "context", // name
          ":struct", // extends
          Vx.Core.e_typelist, // traits
          Vx.Core.e_typelist, // allowtypes
          Vx.Core.e_typelist, // disallowtypes
          Vx.Core.e_funclist, // allowfuncs
          Vx.Core.e_funclist, // disallowfuncs
          Vx.Core.e_anylist, // allowvalues
          Vx.Core.e_anylist, // disallowvalues
          Vx.Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    public override Vx.Core.Type_any vx_empty() {
      Vx.Core.Type_any output = Mydomain.Mypackage.e_context_main;
      return output;
    }

    public override Vx.Core.Type_any vx_type() {
      Vx.Core.Type_any output = Mydomain.Mypackage.t_context_main;
      return output;
    }

    public Vx.Core.Func_any_from_any vx_fn_new(Vx.Core.Class_any_from_any.IFn fn) {
      return Vx.Core.e_any_from_any;
    }

    public T vx_any_from_any<T, U>(T generic_any_1, U value) where T : Vx.Core.Type_any where U : Vx.Core.Type_any {
      T output = Vx.Core.f_empty(generic_any_1);
      Vx.Core.Type_anylist inputval = (Vx.Core.Type_anylist)value;
      Vx.Core.Type_any outputval = Mydomain.Mypackage.f_context_main(inputval);
      output = Vx.Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Vx.Core.Type_any vx_repl(Vx.Core.Type_anylist arglist) {
      Vx.Core.Type_any output = Vx.Core.e_any;
      Vx.Core.Type_anylist args = Vx.Core.f_any_from_any(Vx.Core.t_anylist, arglist.vx_any(Vx.Core.vx_new_int(0)));
      output = Mydomain.Mypackage.f_context_main(args);
      return output;
    }

    public Vx.Core.Type_context vx_context_main(Vx.Core.Type_anylist args) {
      Vx.Core.Type_context output = Mydomain.Mypackage.f_context_main(args);
      return output;
    }

  }

  public static Mydomain.Mypackage.Func_context_main e_context_main = new Mydomain.Mypackage.Class_context_main();
  public static Mydomain.Mypackage.Func_context_main t_context_main = new Mydomain.Mypackage.Class_context_main();

  public static Vx.Core.Type_context f_context_main(Vx.Core.Type_anylist args) {
    Vx.Core.Type_context output = Vx.Core.e_context;
    return output;
  }

  /**
   * @function main_exe
   * The default function for app main execution. Arguments come from the command line.
   * @param  {anylist} args
   * @return {string}
   * (func main-exe)
   */
  public interface Func_main_exe : Vx.Core.Func_any_from_any_context {
    public Vx.Core.Type_string vx_main_exe(Vx.Core.Type_context context, Vx.Core.Type_anylist args);
  }

  public class Class_main_exe : Vx.Core.Class_base, Func_main_exe {

    public override Vx.Core.Type_any vx_new(params object[] vals) {
      Mydomain.Mypackage.Class_main_exe output = new Mydomain.Mypackage.Class_main_exe();
      return output;
    }

    public override Vx.Core.Type_any vx_copy(params object[] vals) {
      Mydomain.Mypackage.Class_main_exe output = new Mydomain.Mypackage.Class_main_exe();
      return output;
    }

    public override Vx.Core.Type_typedef vx_typedef() {
      Vx.Core.Type_typedef output = Vx.Core.t_func.vx_typedef();
      return output;
    }

    public Vx.Core.Type_funcdef vx_funcdef() {
      Vx.Core.Type_funcdef output = Vx.Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "main-exe", // name
        0, // idx
        false, // async
        Vx.Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Vx.Core.e_typelist, // traits
          Vx.Core.e_typelist, // allowtypes
          Vx.Core.e_typelist, // disallowtypes
          Vx.Core.e_funclist, // allowfuncs
          Vx.Core.e_funclist, // disallowfuncs
          Vx.Core.e_anylist, // allowvalues
          Vx.Core.e_anylist, // disallowvalues
          Vx.Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    public override Vx.Core.Type_any vx_empty() {
      Vx.Core.Type_any output = Mydomain.Mypackage.e_main_exe;
      return output;
    }

    public override Vx.Core.Type_any vx_type() {
      Vx.Core.Type_any output = Mydomain.Mypackage.t_main_exe;
      return output;
    }

    public Vx.Core.Func_any_from_any_context vx_fn_new(Vx.Core.Class_any_from_any_context.IFn fn) {
      return Vx.Core.e_any_from_any_context;
    }

    public T vx_any_from_any_context<T, U>(T generic_any_1, Vx.Core.Type_context context, U value) where T : Vx.Core.Type_any where U : Vx.Core.Type_any {
      T output = Vx.Core.f_empty(generic_any_1);
      Vx.Core.Type_anylist inputval = (Vx.Core.Type_anylist)value;
      Vx.Core.Type_any outputval = Mydomain.Mypackage.f_main_exe(context, inputval);
      output = Vx.Core.f_any_from_any_context(generic_any_1, context, outputval);
      return output;
    }

    public Vx.Core.Type_any vx_repl(Vx.Core.Type_anylist arglist) {
      Vx.Core.Type_any output = Vx.Core.e_any;
      Vx.Core.Type_context context = Vx.Core.f_any_from_any(Vx.Core.t_context, arglist.vx_any(Vx.Core.vx_new_int(0)));
      Vx.Core.Type_anylist args = Vx.Core.f_any_from_any(Vx.Core.t_anylist, arglist.vx_any(Vx.Core.vx_new_int(0)));
      output = Mydomain.Mypackage.f_main_exe(context, args);
      return output;
    }

    public Vx.Core.Type_string vx_main_exe(Vx.Core.Type_context context, Vx.Core.Type_anylist args) {
      Vx.Core.Type_string output = Mydomain.Mypackage.f_main_exe(context, args);
      return output;
    }

  }

  public static Mydomain.Mypackage.Func_main_exe e_main_exe = new Mydomain.Mypackage.Class_main_exe();
  public static Mydomain.Mypackage.Func_main_exe t_main_exe = new Mydomain.Mypackage.Class_main_exe();

  public static Vx.Core.Type_string f_main_exe(Vx.Core.Type_context context, Vx.Core.Type_anylist args) {
    Vx.Core.Type_string output = Vx.Core.e_string;
    output = Vx.Core.vx_new_string("Hello World");
    return output;
  }

  /**
   * @function main_html
   * The default function for app main html output. Arguments come from the command line.
   * @param  {anylist} args
   * @return {string}
   * (func main-html)
   */
  public interface Func_main_html : Vx.Core.Func_any_from_any_context {
    public Vx.Core.Type_string vx_main_html(Vx.Core.Type_context context, Vx.Core.Type_anylist args);
  }

  public class Class_main_html : Vx.Core.Class_base, Func_main_html {

    public override Vx.Core.Type_any vx_new(params object[] vals) {
      Mydomain.Mypackage.Class_main_html output = new Mydomain.Mypackage.Class_main_html();
      return output;
    }

    public override Vx.Core.Type_any vx_copy(params object[] vals) {
      Mydomain.Mypackage.Class_main_html output = new Mydomain.Mypackage.Class_main_html();
      return output;
    }

    public override Vx.Core.Type_typedef vx_typedef() {
      Vx.Core.Type_typedef output = Vx.Core.t_func.vx_typedef();
      return output;
    }

    public Vx.Core.Type_funcdef vx_funcdef() {
      Vx.Core.Type_funcdef output = Vx.Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "main-html", // name
        0, // idx
        false, // async
        Vx.Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Vx.Core.e_typelist, // traits
          Vx.Core.e_typelist, // allowtypes
          Vx.Core.e_typelist, // disallowtypes
          Vx.Core.e_funclist, // allowfuncs
          Vx.Core.e_funclist, // disallowfuncs
          Vx.Core.e_anylist, // allowvalues
          Vx.Core.e_anylist, // disallowvalues
          Vx.Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    public override Vx.Core.Type_any vx_empty() {
      Vx.Core.Type_any output = Mydomain.Mypackage.e_main_html;
      return output;
    }

    public override Vx.Core.Type_any vx_type() {
      Vx.Core.Type_any output = Mydomain.Mypackage.t_main_html;
      return output;
    }

    public Vx.Core.Func_any_from_any_context vx_fn_new(Vx.Core.Class_any_from_any_context.IFn fn) {
      return Vx.Core.e_any_from_any_context;
    }

    public T vx_any_from_any_context<T, U>(T generic_any_1, Vx.Core.Type_context context, U value) where T : Vx.Core.Type_any where U : Vx.Core.Type_any {
      T output = Vx.Core.f_empty(generic_any_1);
      Vx.Core.Type_anylist inputval = (Vx.Core.Type_anylist)value;
      Vx.Core.Type_any outputval = Mydomain.Mypackage.f_main_html(context, inputval);
      output = Vx.Core.f_any_from_any_context(generic_any_1, context, outputval);
      return output;
    }

    public Vx.Core.Type_any vx_repl(Vx.Core.Type_anylist arglist) {
      Vx.Core.Type_any output = Vx.Core.e_any;
      Vx.Core.Type_context context = Vx.Core.f_any_from_any(Vx.Core.t_context, arglist.vx_any(Vx.Core.vx_new_int(0)));
      Vx.Core.Type_anylist args = Vx.Core.f_any_from_any(Vx.Core.t_anylist, arglist.vx_any(Vx.Core.vx_new_int(0)));
      output = Mydomain.Mypackage.f_main_html(context, args);
      return output;
    }

    public Vx.Core.Type_string vx_main_html(Vx.Core.Type_context context, Vx.Core.Type_anylist args) {
      Vx.Core.Type_string output = Mydomain.Mypackage.f_main_html(context, args);
      return output;
    }

  }

  public static Mydomain.Mypackage.Func_main_html e_main_html = new Mydomain.Mypackage.Class_main_html();
  public static Mydomain.Mypackage.Func_main_html t_main_html = new Mydomain.Mypackage.Class_main_html();

  public static Vx.Core.Type_string f_main_html(Vx.Core.Type_context context, Vx.Core.Type_anylist args) {
    Vx.Core.Type_string output = Vx.Core.e_string;
    output = Mydomain.Mypackage.f_string_render_from_text(
      Vx.Core.vx_new_string("Hello World")
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
  public interface Func_myfunc : Vx.Core.Type_func, Vx.Core.Type_replfunc {
    public Vx.Core.Type_int vx_myfunc(Vx.Core.Type_int arg1, Vx.Core.Type_int arg2);
  }

  public class Class_myfunc : Vx.Core.Class_base, Func_myfunc {

    public override Vx.Core.Type_any vx_new(params object[] vals) {
      Mydomain.Mypackage.Class_myfunc output = new Mydomain.Mypackage.Class_myfunc();
      return output;
    }

    public override Vx.Core.Type_any vx_copy(params object[] vals) {
      Mydomain.Mypackage.Class_myfunc output = new Mydomain.Mypackage.Class_myfunc();
      return output;
    }

    public override Vx.Core.Type_typedef vx_typedef() {
      Vx.Core.Type_typedef output = Vx.Core.t_func.vx_typedef();
      return output;
    }

    public Vx.Core.Type_funcdef vx_funcdef() {
      Vx.Core.Type_funcdef output = Vx.Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "myfunc", // name
        0, // idx
        false, // async
        Vx.Core.typedef_new(
          "vx/core", // pkgname
          "int", // name
          "", // extends
          Vx.Core.vx_new(Vx.Core.t_typelist, Vx.Core.t_number), // traits
          Vx.Core.e_typelist, // allowtypes
          Vx.Core.e_typelist, // disallowtypes
          Vx.Core.e_funclist, // allowfuncs
          Vx.Core.e_funclist, // disallowfuncs
          Vx.Core.e_anylist, // allowvalues
          Vx.Core.e_anylist, // disallowvalues
          Vx.Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    public override Vx.Core.Type_any vx_empty() {
      Vx.Core.Type_any output = Mydomain.Mypackage.e_myfunc;
      return output;
    }

    public override Vx.Core.Type_any vx_type() {
      Vx.Core.Type_any output = Mydomain.Mypackage.t_myfunc;
      return output;
    }

    public Vx.Core.Type_any vx_repl(Vx.Core.Type_anylist arglist) {
      Vx.Core.Type_any output = Vx.Core.e_any;
      Vx.Core.Type_int arg1 = Vx.Core.f_any_from_any(Vx.Core.t_int, arglist.vx_any(Vx.Core.vx_new_int(0)));
      Vx.Core.Type_int arg2 = Vx.Core.f_any_from_any(Vx.Core.t_int, arglist.vx_any(Vx.Core.vx_new_int(1)));
      output = Mydomain.Mypackage.f_myfunc(arg1, arg2);
      return output;
    }

    public Vx.Core.Type_int vx_myfunc(Vx.Core.Type_int arg1, Vx.Core.Type_int arg2) {
      Vx.Core.Type_int output = Mydomain.Mypackage.f_myfunc(arg1, arg2);
      return output;
    }

  }

  public static Mydomain.Mypackage.Func_myfunc e_myfunc = new Mydomain.Mypackage.Class_myfunc();
  public static Mydomain.Mypackage.Func_myfunc t_myfunc = new Mydomain.Mypackage.Class_myfunc();

  public static Vx.Core.Type_int f_myfunc(Vx.Core.Type_int arg1, Vx.Core.Type_int arg2) {
    Vx.Core.Type_int output = Vx.Core.e_int;
    output = Vx.Core.f_multiply(
      Vx.Core.f_plus(
        arg1,
        arg2
      ),
      Vx.Core.vx_new_int(2)
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
  public interface Func_p_from_text : Vx.Core.Func_any_from_any {
    public Vx.Web.Html.Type_p vx_p_from_text(Vx.Core.Type_string text);
  }

  public class Class_p_from_text : Vx.Core.Class_base, Func_p_from_text {

    public override Vx.Core.Type_any vx_new(params object[] vals) {
      Mydomain.Mypackage.Class_p_from_text output = new Mydomain.Mypackage.Class_p_from_text();
      return output;
    }

    public override Vx.Core.Type_any vx_copy(params object[] vals) {
      Mydomain.Mypackage.Class_p_from_text output = new Mydomain.Mypackage.Class_p_from_text();
      return output;
    }

    public override Vx.Core.Type_typedef vx_typedef() {
      Vx.Core.Type_typedef output = Vx.Core.t_func.vx_typedef();
      return output;
    }

    public Vx.Core.Type_funcdef vx_funcdef() {
      Vx.Core.Type_funcdef output = Vx.Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "p<-text", // name
        0, // idx
        false, // async
        Vx.Core.typedef_new(
          "vx/web/html", // pkgname
          "p", // name
          ":struct", // extends
          Vx.Core.vx_new(Vx.Core.t_typelist, Vx.Web.Html.t_node, Vx.Web.Html.t_divchild), // traits
          Vx.Core.e_typelist, // allowtypes
          Vx.Core.e_typelist, // disallowtypes
          Vx.Core.e_funclist, // allowfuncs
          Vx.Core.e_funclist, // disallowfuncs
          Vx.Core.e_anylist, // allowvalues
          Vx.Core.e_anylist, // disallowvalues
          Vx.Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    public override Vx.Core.Type_any vx_empty() {
      Vx.Core.Type_any output = Mydomain.Mypackage.e_p_from_text;
      return output;
    }

    public override Vx.Core.Type_any vx_type() {
      Vx.Core.Type_any output = Mydomain.Mypackage.t_p_from_text;
      return output;
    }

    public Vx.Core.Func_any_from_any vx_fn_new(Vx.Core.Class_any_from_any.IFn fn) {
      return Vx.Core.e_any_from_any;
    }

    public T vx_any_from_any<T, U>(T generic_any_1, U value) where T : Vx.Core.Type_any where U : Vx.Core.Type_any {
      T output = Vx.Core.f_empty(generic_any_1);
      Vx.Core.Type_string inputval = (Vx.Core.Type_string)value;
      Vx.Core.Type_any outputval = Mydomain.Mypackage.f_p_from_text(inputval);
      output = Vx.Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Vx.Core.Type_any vx_repl(Vx.Core.Type_anylist arglist) {
      Vx.Core.Type_any output = Vx.Core.e_any;
      Vx.Core.Type_string text = Vx.Core.f_any_from_any(Vx.Core.t_string, arglist.vx_any(Vx.Core.vx_new_int(0)));
      output = Mydomain.Mypackage.f_p_from_text(text);
      return output;
    }

    public Vx.Web.Html.Type_p vx_p_from_text(Vx.Core.Type_string text) {
      Vx.Web.Html.Type_p output = Mydomain.Mypackage.f_p_from_text(text);
      return output;
    }

  }

  public static Mydomain.Mypackage.Func_p_from_text e_p_from_text = new Mydomain.Mypackage.Class_p_from_text();
  public static Mydomain.Mypackage.Func_p_from_text t_p_from_text = new Mydomain.Mypackage.Class_p_from_text();

  public static Vx.Web.Html.Type_p f_p_from_text(Vx.Core.Type_string text) {
    Vx.Web.Html.Type_p output = Vx.Web.Html.e_p;
    output = Vx.Core.f_new(
      Vx.Web.Html.t_p,
      Vx.Core.vx_new(
        Vx.Core.t_anylist,
        Vx.Core.vx_new_string(":text"),
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
  public interface Func_string_html_from_text : Vx.Core.Func_any_from_any {
    public Vx.Core.Type_string vx_string_html_from_text(Vx.Core.Type_string text);
  }

  public class Class_string_html_from_text : Vx.Core.Class_base, Func_string_html_from_text {

    public override Vx.Core.Type_any vx_new(params object[] vals) {
      Mydomain.Mypackage.Class_string_html_from_text output = new Mydomain.Mypackage.Class_string_html_from_text();
      return output;
    }

    public override Vx.Core.Type_any vx_copy(params object[] vals) {
      Mydomain.Mypackage.Class_string_html_from_text output = new Mydomain.Mypackage.Class_string_html_from_text();
      return output;
    }

    public override Vx.Core.Type_typedef vx_typedef() {
      Vx.Core.Type_typedef output = Vx.Core.t_func.vx_typedef();
      return output;
    }

    public Vx.Core.Type_funcdef vx_funcdef() {
      Vx.Core.Type_funcdef output = Vx.Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "string-html<-text", // name
        0, // idx
        false, // async
        Vx.Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Vx.Core.e_typelist, // traits
          Vx.Core.e_typelist, // allowtypes
          Vx.Core.e_typelist, // disallowtypes
          Vx.Core.e_funclist, // allowfuncs
          Vx.Core.e_funclist, // disallowfuncs
          Vx.Core.e_anylist, // allowvalues
          Vx.Core.e_anylist, // disallowvalues
          Vx.Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    public override Vx.Core.Type_any vx_empty() {
      Vx.Core.Type_any output = Mydomain.Mypackage.e_string_html_from_text;
      return output;
    }

    public override Vx.Core.Type_any vx_type() {
      Vx.Core.Type_any output = Mydomain.Mypackage.t_string_html_from_text;
      return output;
    }

    public Vx.Core.Func_any_from_any vx_fn_new(Vx.Core.Class_any_from_any.IFn fn) {
      return Vx.Core.e_any_from_any;
    }

    public T vx_any_from_any<T, U>(T generic_any_1, U value) where T : Vx.Core.Type_any where U : Vx.Core.Type_any {
      T output = Vx.Core.f_empty(generic_any_1);
      Vx.Core.Type_string inputval = (Vx.Core.Type_string)value;
      Vx.Core.Type_any outputval = Mydomain.Mypackage.f_string_html_from_text(inputval);
      output = Vx.Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Vx.Core.Type_any vx_repl(Vx.Core.Type_anylist arglist) {
      Vx.Core.Type_any output = Vx.Core.e_any;
      Vx.Core.Type_string text = Vx.Core.f_any_from_any(Vx.Core.t_string, arglist.vx_any(Vx.Core.vx_new_int(0)));
      output = Mydomain.Mypackage.f_string_html_from_text(text);
      return output;
    }

    public Vx.Core.Type_string vx_string_html_from_text(Vx.Core.Type_string text) {
      Vx.Core.Type_string output = Mydomain.Mypackage.f_string_html_from_text(text);
      return output;
    }

  }

  public static Mydomain.Mypackage.Func_string_html_from_text e_string_html_from_text = new Mydomain.Mypackage.Class_string_html_from_text();
  public static Mydomain.Mypackage.Func_string_html_from_text t_string_html_from_text = new Mydomain.Mypackage.Class_string_html_from_text();

  public static Vx.Core.Type_string f_string_html_from_text(Vx.Core.Type_string text) {
    Vx.Core.Type_string output = Vx.Core.e_string;
    output = Vx.Core.f_let(
      Vx.Core.t_string,
      Vx.Core.t_any_from_func.vx_fn_new(() => {
        Vx.Web.Html.Type_p p = Mydomain.Mypackage.f_p_from_text(
          text
        );
        Vx.Core.Type_any output_1 = Vx.Web.Html.f_string_from_node(
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
  public interface Func_string_render_from_text : Vx.Core.Func_any_from_any {
    public Vx.Core.Type_string vx_string_render_from_text(Vx.Core.Type_string text);
  }

  public class Class_string_render_from_text : Vx.Core.Class_base, Func_string_render_from_text {

    public override Vx.Core.Type_any vx_new(params object[] vals) {
      Mydomain.Mypackage.Class_string_render_from_text output = new Mydomain.Mypackage.Class_string_render_from_text();
      return output;
    }

    public override Vx.Core.Type_any vx_copy(params object[] vals) {
      Mydomain.Mypackage.Class_string_render_from_text output = new Mydomain.Mypackage.Class_string_render_from_text();
      return output;
    }

    public override Vx.Core.Type_typedef vx_typedef() {
      Vx.Core.Type_typedef output = Vx.Core.t_func.vx_typedef();
      return output;
    }

    public Vx.Core.Type_funcdef vx_funcdef() {
      Vx.Core.Type_funcdef output = Vx.Core.funcdef_new(
        "mydomain/mypackage", // pkgname
        "string-render<-text", // name
        0, // idx
        false, // async
        Vx.Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Vx.Core.e_typelist, // traits
          Vx.Core.e_typelist, // allowtypes
          Vx.Core.e_typelist, // disallowtypes
          Vx.Core.e_funclist, // allowfuncs
          Vx.Core.e_funclist, // disallowfuncs
          Vx.Core.e_anylist, // allowvalues
          Vx.Core.e_anylist, // disallowvalues
          Vx.Core.e_argmap // properties
        ) // typedef
      );
      return output;
    }

    public override Vx.Core.Type_any vx_empty() {
      Vx.Core.Type_any output = Mydomain.Mypackage.e_string_render_from_text;
      return output;
    }

    public override Vx.Core.Type_any vx_type() {
      Vx.Core.Type_any output = Mydomain.Mypackage.t_string_render_from_text;
      return output;
    }

    public Vx.Core.Func_any_from_any vx_fn_new(Vx.Core.Class_any_from_any.IFn fn) {
      return Vx.Core.e_any_from_any;
    }

    public T vx_any_from_any<T, U>(T generic_any_1, U value) where T : Vx.Core.Type_any where U : Vx.Core.Type_any {
      T output = Vx.Core.f_empty(generic_any_1);
      Vx.Core.Type_string inputval = (Vx.Core.Type_string)value;
      Vx.Core.Type_any outputval = Mydomain.Mypackage.f_string_render_from_text(inputval);
      output = Vx.Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Vx.Core.Type_any vx_repl(Vx.Core.Type_anylist arglist) {
      Vx.Core.Type_any output = Vx.Core.e_any;
      Vx.Core.Type_string text = Vx.Core.f_any_from_any(Vx.Core.t_string, arglist.vx_any(Vx.Core.vx_new_int(0)));
      output = Mydomain.Mypackage.f_string_render_from_text(text);
      return output;
    }

    public Vx.Core.Type_string vx_string_render_from_text(Vx.Core.Type_string text) {
      Vx.Core.Type_string output = Mydomain.Mypackage.f_string_render_from_text(text);
      return output;
    }

  }

  public static Mydomain.Mypackage.Func_string_render_from_text e_string_render_from_text = new Mydomain.Mypackage.Class_string_render_from_text();
  public static Mydomain.Mypackage.Func_string_render_from_text t_string_render_from_text = new Mydomain.Mypackage.Class_string_render_from_text();

  public static Vx.Core.Type_string f_string_render_from_text(Vx.Core.Type_string text) {
    Vx.Core.Type_string output = Vx.Core.e_string;
    output = Vx.Core.f_let(
      Vx.Core.t_string,
      Vx.Core.t_any_from_func.vx_fn_new(() => {
        Vx.Core.Type_string shtml = Mydomain.Mypackage.f_string_html_from_text(
          text
        );
        Vx.Core.Type_boolean iswrite = Vx.Web.Htmldoc.f_boolean_write_from_id_htmltext(
          Vx.Core.vx_new_string("app"),
          shtml
        );
        Vx.Core.Type_any output_1 = shtml;
        return output_1;
      })
    );
    return output;
  }


  public static class PackageRunOnce {
    public static bool RunOnce() {
    Vx.Core.Map<string, Vx.Core.Type_any> maptype = new Vx.Core.LinkedHashMap<string, Vx.Core.Type_any>();
    Vx.Core.Map<string, Vx.Core.Type_any> mapconst = new Vx.Core.LinkedHashMap<string, Vx.Core.Type_any>();
    Vx.Core.Map<string, Vx.Core.Type_func> mapfunc = new Vx.Core.LinkedHashMap<string, Vx.Core.Type_func>();
    maptype.put("mycontext", Mydomain.Mypackage.t_mycontext);
    mapfunc.put("context-main", Mydomain.Mypackage.t_context_main);
    mapfunc.put("main-exe", Mydomain.Mypackage.t_main_exe);
    mapfunc.put("main-html", Mydomain.Mypackage.t_main_html);
    mapfunc.put("myfunc", Mydomain.Mypackage.t_myfunc);
    mapfunc.put("p<-text", Mydomain.Mypackage.t_p_from_text);
    mapfunc.put("string-html<-text", Mydomain.Mypackage.t_string_html_from_text);
    mapfunc.put("string-render<-text", Mydomain.Mypackage.t_string_render_from_text);
    Vx.Core.vx_global_package_set("mydomain/mypackage", maptype, mapconst, mapfunc);
      return true;
    }
  }

  public static bool ranonce = PackageRunOnce.RunOnce();

}
