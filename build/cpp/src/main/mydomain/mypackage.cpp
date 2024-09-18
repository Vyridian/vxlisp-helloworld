#include <string>
#include "../vx/core.hpp"
#include "../vx/web/html.hpp"
#include "../vx/web/htmldoc.hpp"
#include "mypackage.hpp"

namespace mydomain_mypackage {



  // (type mycontext)
  // class Class_mycontext {
    Abstract_mycontext::~Abstract_mycontext() {}

    Class_mycontext::Class_mycontext() : Abstract_mycontext::Abstract_mycontext() {
      vx_core::refcount += 1;
    }

    Class_mycontext::~Class_mycontext() {
      vx_core::refcount -= 1;
      if (this->vx_p_msgblock) {
        vx_core::vx_release_one(this->vx_p_msgblock);
      }
      vx_core::vx_release_one({
        this->vx_p_code,
        this->vx_p_session,
        this->vx_p_setting,
        this->vx_p_state
      });
    }

    // code()
    vx_core::Type_string Class_mycontext::code() const {
      vx_core::Type_string output = this->vx_p_code;
      if (!output) {
        output = vx_core::e_string;
      }
      return output;
    }

    // session()
    vx_core::Type_session Class_mycontext::session() const {
      vx_core::Type_session output = this->vx_p_session;
      if (!output) {
        output = vx_core::e_session;
      }
      return output;
    }

    // setting()
    vx_core::Type_setting Class_mycontext::setting() const {
      vx_core::Type_setting output = this->vx_p_setting;
      if (!output) {
        output = vx_core::e_setting;
      }
      return output;
    }

    // state()
    vx_core::Type_state Class_mycontext::state() const {
      vx_core::Type_state output = this->vx_p_state;
      if (!output) {
        output = vx_core::e_state;
      }
      return output;
    }

    // vx_get_any(key)
    vx_core::Type_any Class_mycontext::vx_get_any(vx_core::Type_string key) const {
      vx_core::Type_any output = vx_core::e_any;
      std::string skey = key->vx_string();
      if (false) {
      } else if (skey == ":code") {
        output = this->code();
      } else if (skey == ":session") {
        output = this->session();
      } else if (skey == ":setting") {
        output = this->setting();
      } else if (skey == ":state") {
        output = this->state();
      }
      vx_core::vx_release_except(key, output);
      return output;
    }

    // vx_map()
    vx_core::vx_Type_mapany Class_mycontext::vx_map() const {
      vx_core::vx_Type_mapany output;
      output[":code"] = this->code();
      output[":session"] = this->session();
      output[":setting"] = this->setting();
      output[":state"] = this->state();
      return output;
    }

    vx_core::Type_any Class_mycontext::vx_new(vx_core::vx_Type_listany vals) const {
      return this->vx_copy(mydomain_mypackage::e_mycontext, vals);
    }

    vx_core::Type_any Class_mycontext::vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Type_mycontext output = mydomain_mypackage::e_mycontext;
      bool ischanged = false;
      if (copyval->vx_p_constdef != NULL) {
        ischanged = true;
      }
      mydomain_mypackage::Type_mycontext val = vx_core::vx_any_from_any(mydomain_mypackage::t_mycontext, copyval);
      output = val;
      vx_core::Type_msgblock msgblock = vx_core::vx_msgblock_from_copy_listval(val->vx_msgblock(), vals);
      vx_core::Type_string vx_p_code = val->code();
      vx_core::Type_session vx_p_session = val->session();
      vx_core::Type_setting vx_p_setting = val->setting();
      vx_core::Type_state vx_p_state = val->state();
      std::string key = "";
      for (vx_core::Type_any valsub : vals) {
        vx_core::Type_any valsubtype = valsub->vx_type();
        if (valsubtype == vx_core::t_msgblock) {
          msgblock = vx_core::vx_copy(msgblock, {valsub});
        } else if (valsubtype == vx_core::t_msg) {
          msgblock = vx_core::vx_copy(msgblock, {valsub});
        } else if (key == "") {
          std::string testkey = "";
          if (valsubtype == vx_core::t_string) {
            vx_core::Type_string valstr = vx_core::vx_any_from_any(vx_core::t_string, valsub);
            testkey = valstr->vx_string();
          }
          if (false) {
          } else if (testkey == ":code") {
            key = testkey;
          } else if (testkey == ":session") {
            key = testkey;
          } else if (testkey == ":setting") {
            key = testkey;
          } else if (testkey == ":state") {
            key = testkey;
          } else {
            vx_core::Type_msg msg = vx_core::vx_msg_from_errortext("(new mycontext) - Invalid Key Type: " + vx_core::vx_string_from_any(valsub));
            msgblock = vx_core::vx_copy(msgblock, {msg});
          }
        } else {
          if (false) {
          } else if (key == ":code") {
            if (vx_p_code == valsub) {
            } else if (valsubtype == vx_core::t_string) {
              ischanged = true;
              vx_p_code = vx_core::vx_any_from_any(vx_core::t_string, valsub);
            } else {
              vx_core::Type_msg msg = vx_core::vx_msg_from_errortext("(new mycontext :code " + vx_core::vx_string_from_any(valsub) + ") - Invalid Value");
              msgblock = vx_core::vx_copy(msgblock, {msg});
            }
          } else if (key == ":session") {
            if (vx_p_session == valsub) {
            } else if (valsubtype == vx_core::t_session) {
              ischanged = true;
              vx_p_session = vx_core::vx_any_from_any(vx_core::t_session, valsub);
            } else {
              vx_core::Type_msg msg = vx_core::vx_msg_from_errortext("(new mycontext :session " + vx_core::vx_string_from_any(valsub) + ") - Invalid Value");
              msgblock = vx_core::vx_copy(msgblock, {msg});
            }
          } else if (key == ":setting") {
            if (vx_p_setting == valsub) {
            } else if (valsubtype == vx_core::t_setting) {
              ischanged = true;
              vx_p_setting = vx_core::vx_any_from_any(vx_core::t_setting, valsub);
            } else {
              vx_core::Type_msg msg = vx_core::vx_msg_from_errortext("(new mycontext :setting " + vx_core::vx_string_from_any(valsub) + ") - Invalid Value");
              msgblock = vx_core::vx_copy(msgblock, {msg});
            }
          } else if (key == ":state") {
            if (vx_p_state == valsub) {
            } else if (valsubtype == vx_core::t_state) {
              ischanged = true;
              vx_p_state = vx_core::vx_any_from_any(vx_core::t_state, valsub);
            } else {
              vx_core::Type_msg msg = vx_core::vx_msg_from_errortext("(new mycontext :state " + vx_core::vx_string_from_any(valsub) + ") - Invalid Value");
              msgblock = vx_core::vx_copy(msgblock, {msg});
            }
          } else {
            vx_core::Type_msg msg = vx_core::vx_msg_from_errortext("(new mycontext) - Invalid Key: " + key);
            msgblock = vx_core::vx_copy(msgblock, {msg});
          }
          key = "";
        }
      }
      if (ischanged || (msgblock != vx_core::e_msgblock)) {
        output = new mydomain_mypackage::Class_mycontext();
        if (output->vx_p_code != vx_p_code) {
          if (output->vx_p_code) {
            vx_core::vx_release_one(output->vx_p_code);
          }
          output->vx_p_code = vx_p_code;
          vx_core::vx_reserve(vx_p_code);
        }
        if (output->vx_p_session != vx_p_session) {
          if (output->vx_p_session) {
            vx_core::vx_release_one(output->vx_p_session);
          }
          output->vx_p_session = vx_p_session;
          vx_core::vx_reserve(vx_p_session);
        }
        if (output->vx_p_setting != vx_p_setting) {
          if (output->vx_p_setting) {
            vx_core::vx_release_one(output->vx_p_setting);
          }
          output->vx_p_setting = vx_p_setting;
          vx_core::vx_reserve(vx_p_setting);
        }
        if (output->vx_p_state != vx_p_state) {
          if (output->vx_p_state) {
            vx_core::vx_release_one(output->vx_p_state);
          }
          output->vx_p_state = vx_p_state;
          vx_core::vx_reserve(vx_p_state);
        }
      }
      if (msgblock != vx_core::e_msgblock) {
        output->vx_p_msgblock = msgblock;
        vx_core::vx_reserve(msgblock);
      }
      vx_core::vx_release_except(copyval, output);
      vx_core::vx_release_except(vals, output);
      return output;
    }

    vx_core::Type_msgblock Class_mycontext::vx_msgblock() const {return this->vx_p_msgblock;}
    vx_core::vx_Type_listany mydomain_mypackage::Class_mycontext::vx_dispose() {return vx_core::emptylistany;}
    vx_core::Type_any Class_mycontext::vx_empty() const {return mydomain_mypackage::e_mycontext;}
    vx_core::Type_any Class_mycontext::vx_type() const {return mydomain_mypackage::t_mycontext;}

    vx_core::Type_typedef Class_mycontext::vx_typedef() const {
      vx_core::Type_typedef output = vx_core::Class_typedef::vx_typedef_new(
        "mydomain/mypackage", // pkgname
        "mycontext", // name
        ":struct", // extends
        vx_core::vx_typelist_from_listany({vx_core::t_context}), // traits
        vx_core::e_typelist, // allowtypes
        vx_core::e_typelist, // disallowtypes
        vx_core::e_funclist, // allowfuncs
        vx_core::e_funclist, // disallowfuncs
        vx_core::e_anylist, // allowvalues
        vx_core::e_anylist, // disallowvalues
        vx_core::e_argmap // properties
      );
      return output;
    }

    vx_core::Type_constdef Class_mycontext::vx_constdef() const {return this->vx_p_constdef;}


  //}

  // (func context-main)
  vx_core::Type_context f_context_main(vx_core::Type_anylist args) {
    vx_core::Type_context output = vx_core::e_context;
    vx_core::vx_reserve(args);
    vx_core::vx_release_one_except(args, output);
    return output;
  }
  /**
   * @function context_main
   * Returns the context for execution. Arguments come from the command line.
   * @param  {anylist} args
   * @return {context}
   * (func context-main)
   */
  // (func context-main)
  // class Class_context_main {
    Abstract_context_main::~Abstract_context_main() {}

    Class_context_main::Class_context_main() : Abstract_context_main::Abstract_context_main() {
      vx_core::refcount += 1;
    }

    Class_context_main::~Class_context_main() {
      vx_core::refcount -= 1;
      if (this->vx_p_msgblock) {
        vx_core::vx_release_one(this->vx_p_msgblock);
      }
    }

    vx_core::Type_any Class_context_main::vx_new(vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_context_main output = mydomain_mypackage::e_context_main;
      vx_core::vx_release(vals);
      return output;
    }

    vx_core::Type_any Class_context_main::vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_context_main output = mydomain_mypackage::e_context_main;
      vx_core::vx_release_except(copyval, output);
      vx_core::vx_release_except(vals, output);
      return output;
    }

    vx_core::Type_typedef Class_context_main::vx_typedef() const {
      vx_core::Type_typedef output = vx_core::Class_typedef::vx_typedef_new(
        "mydomain/mypackage", // pkgname
        "context-main", // name
        ":func", // extends
        vx_core::vx_new(vx_core::t_typelist, {vx_core::t_func}), // traits
        vx_core::e_typelist, // allowtypes
        vx_core::e_typelist, // disallowtypes
        vx_core::e_funclist, // allowfuncs
        vx_core::e_funclist, // disallowfuncs
        vx_core::e_anylist, // allowvalues
        vx_core::e_anylist, // disallowvalues
        vx_core::e_argmap // properties
      );
      return output;
    }

    vx_core::Type_constdef Class_context_main::vx_constdef() const {return this->vx_p_constdef;}

    vx_core::Type_funcdef Class_context_main::vx_funcdef() const {
      vx_core::Type_funcdef output = vx_core::Class_funcdef::vx_funcdef_new(
        "mydomain/mypackage", // pkgname
        "context-main", // name
        0, // idx
        false, // async
        this->vx_typedef() // typedef
      );
      return output;
    }

    vx_core::Type_any Class_context_main::vx_empty() const {return mydomain_mypackage::e_context_main;}
    vx_core::Type_any Class_context_main::vx_type() const {return mydomain_mypackage::t_context_main;}
    vx_core::Type_msgblock Class_context_main::vx_msgblock() const {return this->vx_p_msgblock;}
    vx_core::vx_Type_listany Class_context_main::vx_dispose() {return vx_core::emptylistany;}

    vx_core::Func_any_from_any Class_context_main::vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any::IFn fn) const {
      return vx_core::e_any_from_any;
    }

    vx_core::Type_any Class_context_main::vx_any_from_any(vx_core::Type_any val) const {
      vx_core::Type_any output = vx_core::e_any;
      vx_core::Type_anylist inputval = vx_core::vx_any_from_any(vx_core::t_anylist, val);
      output = mydomain_mypackage::f_context_main(inputval);
      vx_core::vx_release_except(val, output);
      return output;
    }

    vx_core::Type_any Class_context_main::vx_repl(vx_core::Type_anylist arglist) {
      vx_core::Type_any output = vx_core::e_any;
      vx_core::Type_anylist args = vx_core::vx_any_from_any(vx_core::t_anylist, arglist->vx_get_any(vx_core::vx_new_int(0)));
      output = mydomain_mypackage::f_context_main(args);
      vx_core::vx_release_except(arglist, output);
      return output;
    }

  //}

  // (func main-exe)
  vx_core::Type_string f_main_exe(vx_core::Type_context context, vx_core::Type_anylist args) {
    vx_core::Type_string output = vx_core::e_string;
    vx_core::vx_reserve(args);
    output = vx_core::vx_new_string("Hello World");
    vx_core::vx_release_one_except(args, output);
    return output;
  }
  /**
   * @function main_exe
   * The default function for app main execution. Arguments come from the command line.
   * @param  {anylist} args
   * @return {string}
   * (func main-exe)
   */
  // (func main-exe)
  // class Class_main_exe {
    Abstract_main_exe::~Abstract_main_exe() {}

    Class_main_exe::Class_main_exe() : Abstract_main_exe::Abstract_main_exe() {
      vx_core::refcount += 1;
    }

    Class_main_exe::~Class_main_exe() {
      vx_core::refcount -= 1;
      if (this->vx_p_msgblock) {
        vx_core::vx_release_one(this->vx_p_msgblock);
      }
    }

    vx_core::Type_any Class_main_exe::vx_new(vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_main_exe output = mydomain_mypackage::e_main_exe;
      vx_core::vx_release(vals);
      return output;
    }

    vx_core::Type_any Class_main_exe::vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_main_exe output = mydomain_mypackage::e_main_exe;
      vx_core::vx_release_except(copyval, output);
      vx_core::vx_release_except(vals, output);
      return output;
    }

    vx_core::Type_typedef Class_main_exe::vx_typedef() const {
      vx_core::Type_typedef output = vx_core::Class_typedef::vx_typedef_new(
        "mydomain/mypackage", // pkgname
        "main-exe", // name
        ":func", // extends
        vx_core::vx_new(vx_core::t_typelist, {vx_core::t_func}), // traits
        vx_core::e_typelist, // allowtypes
        vx_core::e_typelist, // disallowtypes
        vx_core::e_funclist, // allowfuncs
        vx_core::e_funclist, // disallowfuncs
        vx_core::e_anylist, // allowvalues
        vx_core::e_anylist, // disallowvalues
        vx_core::e_argmap // properties
      );
      return output;
    }

    vx_core::Type_constdef Class_main_exe::vx_constdef() const {return this->vx_p_constdef;}

    vx_core::Type_funcdef Class_main_exe::vx_funcdef() const {
      vx_core::Type_funcdef output = vx_core::Class_funcdef::vx_funcdef_new(
        "mydomain/mypackage", // pkgname
        "main-exe", // name
        0, // idx
        false, // async
        this->vx_typedef() // typedef
      );
      return output;
    }

    vx_core::Type_any Class_main_exe::vx_empty() const {return mydomain_mypackage::e_main_exe;}
    vx_core::Type_any Class_main_exe::vx_type() const {return mydomain_mypackage::t_main_exe;}
    vx_core::Type_msgblock Class_main_exe::vx_msgblock() const {return this->vx_p_msgblock;}
    vx_core::vx_Type_listany Class_main_exe::vx_dispose() {return vx_core::emptylistany;}

    vx_core::Func_any_from_any_context Class_main_exe::vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any_context::IFn fn) const {
      return vx_core::e_any_from_any_context;
    }

    vx_core::Type_any Class_main_exe::vx_any_from_any_context(vx_core::Type_context context, vx_core::Type_any val) const {
      vx_core::Type_any output = vx_core::e_any;
      vx_core::Type_anylist inputval = vx_core::vx_any_from_any(vx_core::t_anylist, val);
      output = mydomain_mypackage::f_main_exe(context, inputval);
      vx_core::vx_release_except(val, output);
      return output;
    }

    vx_core::Type_any Class_main_exe::vx_repl(vx_core::Type_anylist arglist) {
      vx_core::Type_any output = vx_core::e_any;
      vx_core::Type_context context = vx_core::vx_any_from_any(vx_core::t_context, arglist->vx_get_any(vx_core::vx_new_int(0)));
      vx_core::Type_anylist args = vx_core::vx_any_from_any(vx_core::t_anylist, arglist->vx_get_any(vx_core::vx_new_int(0)));
      output = mydomain_mypackage::f_main_exe(context, args);
      vx_core::vx_release_except(arglist, output);
      return output;
    }

  //}

  // (func main-html)
  vx_core::Type_string f_main_html(vx_core::Type_context context, vx_core::Type_anylist args) {
    vx_core::Type_string output = vx_core::e_string;
    vx_core::vx_reserve(args);
    output = mydomain_mypackage::f_string_render_from_text(vx_core::vx_new_string("Hello World"));
    vx_core::vx_release_one_except(args, output);
    return output;
  }
  /**
   * @function main_html
   * The default function for app main html output. Arguments come from the command line.
   * @param  {anylist} args
   * @return {string}
   * (func main-html)
   */
  // (func main-html)
  // class Class_main_html {
    Abstract_main_html::~Abstract_main_html() {}

    Class_main_html::Class_main_html() : Abstract_main_html::Abstract_main_html() {
      vx_core::refcount += 1;
    }

    Class_main_html::~Class_main_html() {
      vx_core::refcount -= 1;
      if (this->vx_p_msgblock) {
        vx_core::vx_release_one(this->vx_p_msgblock);
      }
    }

    vx_core::Type_any Class_main_html::vx_new(vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_main_html output = mydomain_mypackage::e_main_html;
      vx_core::vx_release(vals);
      return output;
    }

    vx_core::Type_any Class_main_html::vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_main_html output = mydomain_mypackage::e_main_html;
      vx_core::vx_release_except(copyval, output);
      vx_core::vx_release_except(vals, output);
      return output;
    }

    vx_core::Type_typedef Class_main_html::vx_typedef() const {
      vx_core::Type_typedef output = vx_core::Class_typedef::vx_typedef_new(
        "mydomain/mypackage", // pkgname
        "main-html", // name
        ":func", // extends
        vx_core::vx_new(vx_core::t_typelist, {vx_core::t_func}), // traits
        vx_core::e_typelist, // allowtypes
        vx_core::e_typelist, // disallowtypes
        vx_core::e_funclist, // allowfuncs
        vx_core::e_funclist, // disallowfuncs
        vx_core::e_anylist, // allowvalues
        vx_core::e_anylist, // disallowvalues
        vx_core::e_argmap // properties
      );
      return output;
    }

    vx_core::Type_constdef Class_main_html::vx_constdef() const {return this->vx_p_constdef;}

    vx_core::Type_funcdef Class_main_html::vx_funcdef() const {
      vx_core::Type_funcdef output = vx_core::Class_funcdef::vx_funcdef_new(
        "mydomain/mypackage", // pkgname
        "main-html", // name
        0, // idx
        false, // async
        this->vx_typedef() // typedef
      );
      return output;
    }

    vx_core::Type_any Class_main_html::vx_empty() const {return mydomain_mypackage::e_main_html;}
    vx_core::Type_any Class_main_html::vx_type() const {return mydomain_mypackage::t_main_html;}
    vx_core::Type_msgblock Class_main_html::vx_msgblock() const {return this->vx_p_msgblock;}
    vx_core::vx_Type_listany Class_main_html::vx_dispose() {return vx_core::emptylistany;}

    vx_core::Func_any_from_any_context Class_main_html::vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any_context::IFn fn) const {
      return vx_core::e_any_from_any_context;
    }

    vx_core::Type_any Class_main_html::vx_any_from_any_context(vx_core::Type_context context, vx_core::Type_any val) const {
      vx_core::Type_any output = vx_core::e_any;
      vx_core::Type_anylist inputval = vx_core::vx_any_from_any(vx_core::t_anylist, val);
      output = mydomain_mypackage::f_main_html(context, inputval);
      vx_core::vx_release_except(val, output);
      return output;
    }

    vx_core::Type_any Class_main_html::vx_repl(vx_core::Type_anylist arglist) {
      vx_core::Type_any output = vx_core::e_any;
      vx_core::Type_context context = vx_core::vx_any_from_any(vx_core::t_context, arglist->vx_get_any(vx_core::vx_new_int(0)));
      vx_core::Type_anylist args = vx_core::vx_any_from_any(vx_core::t_anylist, arglist->vx_get_any(vx_core::vx_new_int(0)));
      output = mydomain_mypackage::f_main_html(context, args);
      vx_core::vx_release_except(arglist, output);
      return output;
    }

  //}

  // (func myfunc)
  vx_core::Type_int f_myfunc(vx_core::Type_int arg1, vx_core::Type_int arg2) {
    vx_core::Type_int output = vx_core::e_int;
    vx_core::vx_reserve({arg1, arg2});
    output = vx_core::f_multiply(
      vx_core::f_plus(arg1, arg2),
      vx_core::vx_new_int(2)
    );
    vx_core::vx_release_one_except({arg1, arg2}, output);
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
  // (func myfunc)
  // class Class_myfunc {
    Abstract_myfunc::~Abstract_myfunc() {}

    Class_myfunc::Class_myfunc() : Abstract_myfunc::Abstract_myfunc() {
      vx_core::refcount += 1;
    }

    Class_myfunc::~Class_myfunc() {
      vx_core::refcount -= 1;
      if (this->vx_p_msgblock) {
        vx_core::vx_release_one(this->vx_p_msgblock);
      }
    }

    vx_core::Type_any Class_myfunc::vx_new(vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_myfunc output = mydomain_mypackage::e_myfunc;
      vx_core::vx_release(vals);
      return output;
    }

    vx_core::Type_any Class_myfunc::vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_myfunc output = mydomain_mypackage::e_myfunc;
      vx_core::vx_release_except(copyval, output);
      vx_core::vx_release_except(vals, output);
      return output;
    }

    vx_core::Type_typedef Class_myfunc::vx_typedef() const {
      vx_core::Type_typedef output = vx_core::Class_typedef::vx_typedef_new(
        "mydomain/mypackage", // pkgname
        "myfunc", // name
        ":func", // extends
        vx_core::vx_new(vx_core::t_typelist, {vx_core::t_func}), // traits
        vx_core::e_typelist, // allowtypes
        vx_core::e_typelist, // disallowtypes
        vx_core::e_funclist, // allowfuncs
        vx_core::e_funclist, // disallowfuncs
        vx_core::e_anylist, // allowvalues
        vx_core::e_anylist, // disallowvalues
        vx_core::e_argmap // properties
      );
      return output;
    }

    vx_core::Type_constdef Class_myfunc::vx_constdef() const {return this->vx_p_constdef;}

    vx_core::Type_funcdef Class_myfunc::vx_funcdef() const {
      vx_core::Type_funcdef output = vx_core::Class_funcdef::vx_funcdef_new(
        "mydomain/mypackage", // pkgname
        "myfunc", // name
        0, // idx
        false, // async
        this->vx_typedef() // typedef
      );
      return output;
    }

    vx_core::Type_any Class_myfunc::vx_empty() const {return mydomain_mypackage::e_myfunc;}
    vx_core::Type_any Class_myfunc::vx_type() const {return mydomain_mypackage::t_myfunc;}
    vx_core::Type_msgblock Class_myfunc::vx_msgblock() const {return this->vx_p_msgblock;}
    vx_core::vx_Type_listany Class_myfunc::vx_dispose() {return vx_core::emptylistany;}

    vx_core::Type_any Class_myfunc::vx_repl(vx_core::Type_anylist arglist) {
      vx_core::Type_any output = vx_core::e_any;
      vx_core::Type_int arg1 = vx_core::vx_any_from_any(vx_core::t_int, arglist->vx_get_any(vx_core::vx_new_int(0)));
      vx_core::Type_int arg2 = vx_core::vx_any_from_any(vx_core::t_int, arglist->vx_get_any(vx_core::vx_new_int(1)));
      output = mydomain_mypackage::f_myfunc(arg1, arg2);
      vx_core::vx_release_except(arglist, output);
      return output;
    }

  //}

  // (func p<-text)
  vx_web_html::Type_p f_p_from_text(vx_core::Type_string text) {
    vx_web_html::Type_p output = vx_web_html::e_p;
    vx_core::vx_reserve(text);
    output = vx_core::f_new(
      vx_web_html::t_p,
      vx_core::vx_new(vx_core::t_anylist, {
        vx_core::vx_new_string(":text"),
        text
      })
    );
    vx_core::vx_release_one_except(text, output);
    return output;
  }
  /**
   * @function p_from_text
   * Returns an HTML paragraph tag from text.
   * @param  {string} text
   * @return {p}
   * (func p<-text)
   */
  // (func p<-text)
  // class Class_p_from_text {
    Abstract_p_from_text::~Abstract_p_from_text() {}

    Class_p_from_text::Class_p_from_text() : Abstract_p_from_text::Abstract_p_from_text() {
      vx_core::refcount += 1;
    }

    Class_p_from_text::~Class_p_from_text() {
      vx_core::refcount -= 1;
      if (this->vx_p_msgblock) {
        vx_core::vx_release_one(this->vx_p_msgblock);
      }
    }

    vx_core::Type_any Class_p_from_text::vx_new(vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_p_from_text output = mydomain_mypackage::e_p_from_text;
      vx_core::vx_release(vals);
      return output;
    }

    vx_core::Type_any Class_p_from_text::vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_p_from_text output = mydomain_mypackage::e_p_from_text;
      vx_core::vx_release_except(copyval, output);
      vx_core::vx_release_except(vals, output);
      return output;
    }

    vx_core::Type_typedef Class_p_from_text::vx_typedef() const {
      vx_core::Type_typedef output = vx_core::Class_typedef::vx_typedef_new(
        "mydomain/mypackage", // pkgname
        "p<-text", // name
        ":func", // extends
        vx_core::vx_new(vx_core::t_typelist, {vx_core::t_func}), // traits
        vx_core::e_typelist, // allowtypes
        vx_core::e_typelist, // disallowtypes
        vx_core::e_funclist, // allowfuncs
        vx_core::e_funclist, // disallowfuncs
        vx_core::e_anylist, // allowvalues
        vx_core::e_anylist, // disallowvalues
        vx_core::e_argmap // properties
      );
      return output;
    }

    vx_core::Type_constdef Class_p_from_text::vx_constdef() const {return this->vx_p_constdef;}

    vx_core::Type_funcdef Class_p_from_text::vx_funcdef() const {
      vx_core::Type_funcdef output = vx_core::Class_funcdef::vx_funcdef_new(
        "mydomain/mypackage", // pkgname
        "p<-text", // name
        0, // idx
        false, // async
        this->vx_typedef() // typedef
      );
      return output;
    }

    vx_core::Type_any Class_p_from_text::vx_empty() const {return mydomain_mypackage::e_p_from_text;}
    vx_core::Type_any Class_p_from_text::vx_type() const {return mydomain_mypackage::t_p_from_text;}
    vx_core::Type_msgblock Class_p_from_text::vx_msgblock() const {return this->vx_p_msgblock;}
    vx_core::vx_Type_listany Class_p_from_text::vx_dispose() {return vx_core::emptylistany;}

    vx_core::Func_any_from_any Class_p_from_text::vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any::IFn fn) const {
      return vx_core::e_any_from_any;
    }

    vx_core::Type_any Class_p_from_text::vx_any_from_any(vx_core::Type_any val) const {
      vx_core::Type_any output = vx_core::e_any;
      vx_core::Type_string inputval = vx_core::vx_any_from_any(vx_core::t_string, val);
      output = mydomain_mypackage::f_p_from_text(inputval);
      vx_core::vx_release_except(val, output);
      return output;
    }

    vx_core::Type_any Class_p_from_text::vx_repl(vx_core::Type_anylist arglist) {
      vx_core::Type_any output = vx_core::e_any;
      vx_core::Type_string text = vx_core::vx_any_from_any(vx_core::t_string, arglist->vx_get_any(vx_core::vx_new_int(0)));
      output = mydomain_mypackage::f_p_from_text(text);
      vx_core::vx_release_except(arglist, output);
      return output;
    }

  //}

  // (func string-html<-text)
  vx_core::Type_string f_string_html_from_text(vx_core::Type_string text) {
    vx_core::Type_string output = vx_core::e_string;
    vx_core::vx_reserve(text);
    output = vx_core::f_let(
      vx_core::t_string,
      vx_core::t_any_from_func->vx_fn_new({text}, [text]() {
        vx_web_html::Type_p p = mydomain_mypackage::f_p_from_text(text);
        vx_core::vx_ref_plus(p);
        vx_core::Type_string output_1 = vx_web_html::f_string_from_node(p);
        vx_core::vx_release_one_except(p, output_1);
        return output_1;
      })
    );
    vx_core::vx_release_one_except(text, output);
    return output;
  }
  /**
   * @function string_html_from_text
   * Returns HTML text from text with id=app.
   * @param  {string} text
   * @return {string}
   * (func string-html<-text)
   */
  // (func string-html<-text)
  // class Class_string_html_from_text {
    Abstract_string_html_from_text::~Abstract_string_html_from_text() {}

    Class_string_html_from_text::Class_string_html_from_text() : Abstract_string_html_from_text::Abstract_string_html_from_text() {
      vx_core::refcount += 1;
    }

    Class_string_html_from_text::~Class_string_html_from_text() {
      vx_core::refcount -= 1;
      if (this->vx_p_msgblock) {
        vx_core::vx_release_one(this->vx_p_msgblock);
      }
    }

    vx_core::Type_any Class_string_html_from_text::vx_new(vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_string_html_from_text output = mydomain_mypackage::e_string_html_from_text;
      vx_core::vx_release(vals);
      return output;
    }

    vx_core::Type_any Class_string_html_from_text::vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_string_html_from_text output = mydomain_mypackage::e_string_html_from_text;
      vx_core::vx_release_except(copyval, output);
      vx_core::vx_release_except(vals, output);
      return output;
    }

    vx_core::Type_typedef Class_string_html_from_text::vx_typedef() const {
      vx_core::Type_typedef output = vx_core::Class_typedef::vx_typedef_new(
        "mydomain/mypackage", // pkgname
        "string-html<-text", // name
        ":func", // extends
        vx_core::vx_new(vx_core::t_typelist, {vx_core::t_func}), // traits
        vx_core::e_typelist, // allowtypes
        vx_core::e_typelist, // disallowtypes
        vx_core::e_funclist, // allowfuncs
        vx_core::e_funclist, // disallowfuncs
        vx_core::e_anylist, // allowvalues
        vx_core::e_anylist, // disallowvalues
        vx_core::e_argmap // properties
      );
      return output;
    }

    vx_core::Type_constdef Class_string_html_from_text::vx_constdef() const {return this->vx_p_constdef;}

    vx_core::Type_funcdef Class_string_html_from_text::vx_funcdef() const {
      vx_core::Type_funcdef output = vx_core::Class_funcdef::vx_funcdef_new(
        "mydomain/mypackage", // pkgname
        "string-html<-text", // name
        0, // idx
        false, // async
        this->vx_typedef() // typedef
      );
      return output;
    }

    vx_core::Type_any Class_string_html_from_text::vx_empty() const {return mydomain_mypackage::e_string_html_from_text;}
    vx_core::Type_any Class_string_html_from_text::vx_type() const {return mydomain_mypackage::t_string_html_from_text;}
    vx_core::Type_msgblock Class_string_html_from_text::vx_msgblock() const {return this->vx_p_msgblock;}
    vx_core::vx_Type_listany Class_string_html_from_text::vx_dispose() {return vx_core::emptylistany;}

    vx_core::Func_any_from_any Class_string_html_from_text::vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any::IFn fn) const {
      return vx_core::e_any_from_any;
    }

    vx_core::Type_any Class_string_html_from_text::vx_any_from_any(vx_core::Type_any val) const {
      vx_core::Type_any output = vx_core::e_any;
      vx_core::Type_string inputval = vx_core::vx_any_from_any(vx_core::t_string, val);
      output = mydomain_mypackage::f_string_html_from_text(inputval);
      vx_core::vx_release_except(val, output);
      return output;
    }

    vx_core::Type_any Class_string_html_from_text::vx_repl(vx_core::Type_anylist arglist) {
      vx_core::Type_any output = vx_core::e_any;
      vx_core::Type_string text = vx_core::vx_any_from_any(vx_core::t_string, arglist->vx_get_any(vx_core::vx_new_int(0)));
      output = mydomain_mypackage::f_string_html_from_text(text);
      vx_core::vx_release_except(arglist, output);
      return output;
    }

  //}

  // (func string-render<-text)
  vx_core::Type_string f_string_render_from_text(vx_core::Type_string text) {
    vx_core::Type_string output = vx_core::e_string;
    vx_core::vx_reserve(text);
    output = vx_core::f_let(
      vx_core::t_string,
      vx_core::t_any_from_func->vx_fn_new({text}, [text]() {
        vx_core::Type_string shtml = mydomain_mypackage::f_string_html_from_text(text);
        vx_core::vx_ref_plus(shtml);
        vx_core::Type_boolean iswrite = vx_web_htmldoc::f_boolean_write_from_id_htmltext(vx_core::vx_new_string("app"), shtml);
        vx_core::vx_ref_plus(iswrite);
        vx_core::Type_string output_1 = shtml;
        vx_core::vx_release_one_except({shtml, iswrite}, output_1);
        return output_1;
      })
    );
    vx_core::vx_release_one_except(text, output);
    return output;
  }
  /**
   * @function string_render_from_text
   * Replaces HTML node with id=app.
   * @param  {string} text
   * @return {string}
   * (func string-render<-text)
   */
  // (func string-render<-text)
  // class Class_string_render_from_text {
    Abstract_string_render_from_text::~Abstract_string_render_from_text() {}

    Class_string_render_from_text::Class_string_render_from_text() : Abstract_string_render_from_text::Abstract_string_render_from_text() {
      vx_core::refcount += 1;
    }

    Class_string_render_from_text::~Class_string_render_from_text() {
      vx_core::refcount -= 1;
      if (this->vx_p_msgblock) {
        vx_core::vx_release_one(this->vx_p_msgblock);
      }
    }

    vx_core::Type_any Class_string_render_from_text::vx_new(vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_string_render_from_text output = mydomain_mypackage::e_string_render_from_text;
      vx_core::vx_release(vals);
      return output;
    }

    vx_core::Type_any Class_string_render_from_text::vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const {
      mydomain_mypackage::Func_string_render_from_text output = mydomain_mypackage::e_string_render_from_text;
      vx_core::vx_release_except(copyval, output);
      vx_core::vx_release_except(vals, output);
      return output;
    }

    vx_core::Type_typedef Class_string_render_from_text::vx_typedef() const {
      vx_core::Type_typedef output = vx_core::Class_typedef::vx_typedef_new(
        "mydomain/mypackage", // pkgname
        "string-render<-text", // name
        ":func", // extends
        vx_core::vx_new(vx_core::t_typelist, {vx_core::t_func}), // traits
        vx_core::e_typelist, // allowtypes
        vx_core::e_typelist, // disallowtypes
        vx_core::e_funclist, // allowfuncs
        vx_core::e_funclist, // disallowfuncs
        vx_core::e_anylist, // allowvalues
        vx_core::e_anylist, // disallowvalues
        vx_core::e_argmap // properties
      );
      return output;
    }

    vx_core::Type_constdef Class_string_render_from_text::vx_constdef() const {return this->vx_p_constdef;}

    vx_core::Type_funcdef Class_string_render_from_text::vx_funcdef() const {
      vx_core::Type_funcdef output = vx_core::Class_funcdef::vx_funcdef_new(
        "mydomain/mypackage", // pkgname
        "string-render<-text", // name
        0, // idx
        false, // async
        this->vx_typedef() // typedef
      );
      return output;
    }

    vx_core::Type_any Class_string_render_from_text::vx_empty() const {return mydomain_mypackage::e_string_render_from_text;}
    vx_core::Type_any Class_string_render_from_text::vx_type() const {return mydomain_mypackage::t_string_render_from_text;}
    vx_core::Type_msgblock Class_string_render_from_text::vx_msgblock() const {return this->vx_p_msgblock;}
    vx_core::vx_Type_listany Class_string_render_from_text::vx_dispose() {return vx_core::emptylistany;}

    vx_core::Func_any_from_any Class_string_render_from_text::vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any::IFn fn) const {
      return vx_core::e_any_from_any;
    }

    vx_core::Type_any Class_string_render_from_text::vx_any_from_any(vx_core::Type_any val) const {
      vx_core::Type_any output = vx_core::e_any;
      vx_core::Type_string inputval = vx_core::vx_any_from_any(vx_core::t_string, val);
      output = mydomain_mypackage::f_string_render_from_text(inputval);
      vx_core::vx_release_except(val, output);
      return output;
    }

    vx_core::Type_any Class_string_render_from_text::vx_repl(vx_core::Type_anylist arglist) {
      vx_core::Type_any output = vx_core::e_any;
      vx_core::Type_string text = vx_core::vx_any_from_any(vx_core::t_string, arglist->vx_get_any(vx_core::vx_new_int(0)));
      output = mydomain_mypackage::f_string_render_from_text(text);
      vx_core::vx_release_except(arglist, output);
      return output;
    }

  //}

  mydomain_mypackage::Type_mycontext e_mycontext = NULL;
  mydomain_mypackage::Type_mycontext t_mycontext = NULL;
  mydomain_mypackage::Func_context_main e_context_main = NULL;
  mydomain_mypackage::Func_context_main t_context_main = NULL;
  mydomain_mypackage::Func_main_exe e_main_exe = NULL;
  mydomain_mypackage::Func_main_exe t_main_exe = NULL;
  mydomain_mypackage::Func_main_html e_main_html = NULL;
  mydomain_mypackage::Func_main_html t_main_html = NULL;
  mydomain_mypackage::Func_myfunc e_myfunc = NULL;
  mydomain_mypackage::Func_myfunc t_myfunc = NULL;
  mydomain_mypackage::Func_p_from_text e_p_from_text = NULL;
  mydomain_mypackage::Func_p_from_text t_p_from_text = NULL;
  mydomain_mypackage::Func_string_html_from_text e_string_html_from_text = NULL;
  mydomain_mypackage::Func_string_html_from_text t_string_html_from_text = NULL;
  mydomain_mypackage::Func_string_render_from_text e_string_render_from_text = NULL;
  mydomain_mypackage::Func_string_render_from_text t_string_render_from_text = NULL;

  // class vx_Class_package {
    vx_Class_package::vx_Class_package() {
      init();
    }
    void vx_Class_package::init() {
      mydomain_mypackage::e_mycontext = new Class_mycontext();
      vx_core::vx_reserve_empty(mydomain_mypackage::e_mycontext);
      mydomain_mypackage::t_mycontext = new Class_mycontext();
      vx_core::vx_reserve_type(mydomain_mypackage::t_mycontext);
      mydomain_mypackage::e_context_main = new mydomain_mypackage::Class_context_main();
      vx_core::vx_reserve_empty(mydomain_mypackage::e_context_main);
      mydomain_mypackage::t_context_main = new mydomain_mypackage::Class_context_main();
      vx_core::vx_reserve_type(mydomain_mypackage::t_context_main);
      mydomain_mypackage::e_main_exe = new mydomain_mypackage::Class_main_exe();
      vx_core::vx_reserve_empty(mydomain_mypackage::e_main_exe);
      mydomain_mypackage::t_main_exe = new mydomain_mypackage::Class_main_exe();
      vx_core::vx_reserve_type(mydomain_mypackage::t_main_exe);
      mydomain_mypackage::e_main_html = new mydomain_mypackage::Class_main_html();
      vx_core::vx_reserve_empty(mydomain_mypackage::e_main_html);
      mydomain_mypackage::t_main_html = new mydomain_mypackage::Class_main_html();
      vx_core::vx_reserve_type(mydomain_mypackage::t_main_html);
      mydomain_mypackage::e_myfunc = new mydomain_mypackage::Class_myfunc();
      vx_core::vx_reserve_empty(mydomain_mypackage::e_myfunc);
      mydomain_mypackage::t_myfunc = new mydomain_mypackage::Class_myfunc();
      vx_core::vx_reserve_type(mydomain_mypackage::t_myfunc);
      mydomain_mypackage::e_p_from_text = new mydomain_mypackage::Class_p_from_text();
      vx_core::vx_reserve_empty(mydomain_mypackage::e_p_from_text);
      mydomain_mypackage::t_p_from_text = new mydomain_mypackage::Class_p_from_text();
      vx_core::vx_reserve_type(mydomain_mypackage::t_p_from_text);
      mydomain_mypackage::e_string_html_from_text = new mydomain_mypackage::Class_string_html_from_text();
      vx_core::vx_reserve_empty(mydomain_mypackage::e_string_html_from_text);
      mydomain_mypackage::t_string_html_from_text = new mydomain_mypackage::Class_string_html_from_text();
      vx_core::vx_reserve_type(mydomain_mypackage::t_string_html_from_text);
      mydomain_mypackage::e_string_render_from_text = new mydomain_mypackage::Class_string_render_from_text();
      vx_core::vx_reserve_empty(mydomain_mypackage::e_string_render_from_text);
      mydomain_mypackage::t_string_render_from_text = new mydomain_mypackage::Class_string_render_from_text();
      vx_core::vx_reserve_type(mydomain_mypackage::t_string_render_from_text);
      vx_core::vx_Type_mapany maptype;
      vx_core::vx_Type_mapany mapconst;
      vx_core::vx_Type_mapfunc mapfunc;
      vx_core::vx_Type_mapany mapempty;
      maptype["mycontext"] = mydomain_mypackage::t_mycontext;
      mapfunc["context-main"] = mydomain_mypackage::t_context_main;
      mapfunc["main-exe"] = mydomain_mypackage::t_main_exe;
      mapfunc["main-html"] = mydomain_mypackage::t_main_html;
      mapfunc["myfunc"] = mydomain_mypackage::t_myfunc;
      mapfunc["p<-text"] = mydomain_mypackage::t_p_from_text;
      mapfunc["string-html<-text"] = mydomain_mypackage::t_string_html_from_text;
      mapfunc["string-render<-text"] = mydomain_mypackage::t_string_render_from_text;
      vx_core::vx_global_package_set("mydomain/mypackage", maptype, mapconst, mapfunc);
	   }
  // }

}
