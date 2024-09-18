#ifndef MYDOMAIN_MYPACKAGE_HPP
#define MYDOMAIN_MYPACKAGE_HPP
#include "../vx/core.hpp"
#include "../vx/web/html.hpp"
#include "../vx/web/htmldoc.hpp"

namespace mydomain_mypackage {


  // forward declarations
  class Abstract_mycontext;
  typedef Abstract_mycontext* Type_mycontext;
  extern Type_mycontext e_mycontext;
  extern Type_mycontext t_mycontext;
  class Abstract_context_main;
  typedef Abstract_context_main* Func_context_main;
  extern Func_context_main e_context_main;
  extern Func_context_main t_context_main;
  class Abstract_main_exe;
  typedef Abstract_main_exe* Func_main_exe;
  extern Func_main_exe e_main_exe;
  extern Func_main_exe t_main_exe;
  class Abstract_main_html;
  typedef Abstract_main_html* Func_main_html;
  extern Func_main_html e_main_html;
  extern Func_main_html t_main_html;
  class Abstract_myfunc;
  typedef Abstract_myfunc* Func_myfunc;
  extern Func_myfunc e_myfunc;
  extern Func_myfunc t_myfunc;
  class Abstract_p_from_text;
  typedef Abstract_p_from_text* Func_p_from_text;
  extern Func_p_from_text e_p_from_text;
  extern Func_p_from_text t_p_from_text;
  class Abstract_string_html_from_text;
  typedef Abstract_string_html_from_text* Func_string_html_from_text;
  extern Func_string_html_from_text e_string_html_from_text;
  extern Func_string_html_from_text t_string_html_from_text;
  class Abstract_string_render_from_text;
  typedef Abstract_string_render_from_text* Func_string_render_from_text;
  extern Func_string_render_from_text e_string_render_from_text;
  extern Func_string_render_from_text t_string_render_from_text;
  // (func context-main)
  vx_core::Type_context f_context_main(vx_core::Type_anylist args);

  // (func main-exe)
  vx_core::Type_string f_main_exe(vx_core::Type_context context, vx_core::Type_anylist args);

  // (func main-html)
  vx_core::Type_string f_main_html(vx_core::Type_context context, vx_core::Type_anylist args);

  // (func myfunc)
  vx_core::Type_int f_myfunc(vx_core::Type_int arg1, vx_core::Type_int arg2);

  // (func p<-text)
  vx_web_html::Type_p f_p_from_text(vx_core::Type_string text);

  // (func string-html<-text)
  vx_core::Type_string f_string_html_from_text(vx_core::Type_string text);

  // (func string-render<-text)
  vx_core::Type_string f_string_render_from_text(vx_core::Type_string text);

  // (type mycontext)
  class Abstract_mycontext : public virtual vx_core::Abstract_struct, public virtual vx_core::Abstract_context {
  public:
    Abstract_mycontext() {};
    virtual ~Abstract_mycontext() = 0;
    // vx_map()
    virtual vx_core::vx_Type_mapany vx_map() const = 0;
    // vx_get_any(key)
    virtual vx_core::Type_any vx_get_any(vx_core::Type_string key) const = 0;
    // code()
    vx_core::Type_string vx_p_code = NULL;
    virtual vx_core::Type_string code() const = 0;
    // session()
    vx_core::Type_session vx_p_session = NULL;
    virtual vx_core::Type_session session() const = 0;
    // setting()
    vx_core::Type_setting vx_p_setting = NULL;
    virtual vx_core::Type_setting setting() const = 0;
    // state()
    vx_core::Type_state vx_p_state = NULL;
    virtual vx_core::Type_state state() const = 0;
  };
  class Class_mycontext : public virtual Abstract_mycontext {
  public:
    Class_mycontext();
    virtual ~Class_mycontext() override;
    virtual vx_core::Type_any vx_new(vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_any vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_any vx_empty() const override;
    virtual vx_core::Type_any vx_type() const override;
    virtual vx_core::Type_typedef vx_typedef() const override;
    virtual vx_core::Type_constdef vx_constdef() const override;
    virtual vx_core::Type_msgblock vx_msgblock() const override;
    virtual vx_core::vx_Type_listany vx_dispose() override;
    virtual vx_core::vx_Type_mapany vx_map() const override;
    virtual vx_core::Type_any vx_get_any(vx_core::Type_string key) const override;
    virtual vx_core::Type_string code() const override;
    virtual vx_core::Type_session session() const override;
    virtual vx_core::Type_setting setting() const override;
    virtual vx_core::Type_state state() const override;
  };

  // (func context-main)
  class Abstract_context_main : public vx_core::Abstract_any_from_any, public virtual vx_core::Abstract_replfunc {
  public:
    Abstract_context_main() {};
    virtual ~Abstract_context_main() = 0;
    virtual vx_core::Func_any_from_any vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any::IFn fn) const override = 0;
    virtual vx_core::Type_any vx_any_from_any(vx_core::Type_any value) const override = 0;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override = 0;
  };
  class Class_context_main : public virtual Abstract_context_main {
  public:
    Class_context_main();
    virtual ~Class_context_main() override;
    virtual vx_core::Type_any vx_new(vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_any vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_funcdef vx_funcdef() const override;
    virtual vx_core::Type_typedef vx_typedef() const override;
    virtual vx_core::Type_constdef vx_constdef() const override;
    virtual vx_core::Type_msgblock vx_msgblock() const override;
    virtual vx_core::vx_Type_listany vx_dispose() override;
    virtual vx_core::Type_any vx_empty() const override;
    virtual vx_core::Type_any vx_type() const override;
    virtual vx_core::Func_any_from_any vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any::IFn fn) const override;
    virtual vx_core::Type_any vx_any_from_any(vx_core::Type_any value) const override;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override;
  };

  // (func main-exe)
  class Abstract_main_exe : public vx_core::Abstract_any_from_any_context, public virtual vx_core::Abstract_replfunc {
  public:
    Abstract_main_exe() {};
    virtual ~Abstract_main_exe() = 0;
    virtual vx_core::Func_any_from_any_context vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any_context::IFn fn) const override = 0;
    virtual vx_core::Type_any vx_any_from_any_context(vx_core::Type_context context, vx_core::Type_any value) const override = 0;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override = 0;
  };
  class Class_main_exe : public virtual Abstract_main_exe {
  public:
    Class_main_exe();
    virtual ~Class_main_exe() override;
    virtual vx_core::Type_any vx_new(vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_any vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_funcdef vx_funcdef() const override;
    virtual vx_core::Type_typedef vx_typedef() const override;
    virtual vx_core::Type_constdef vx_constdef() const override;
    virtual vx_core::Type_msgblock vx_msgblock() const override;
    virtual vx_core::vx_Type_listany vx_dispose() override;
    virtual vx_core::Type_any vx_empty() const override;
    virtual vx_core::Type_any vx_type() const override;
    virtual vx_core::Func_any_from_any_context vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any_context::IFn fn) const override;
    virtual vx_core::Type_any vx_any_from_any_context(vx_core::Type_context context, vx_core::Type_any value) const override;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override;
  };

  // (func main-html)
  class Abstract_main_html : public vx_core::Abstract_any_from_any_context, public virtual vx_core::Abstract_replfunc {
  public:
    Abstract_main_html() {};
    virtual ~Abstract_main_html() = 0;
    virtual vx_core::Func_any_from_any_context vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any_context::IFn fn) const override = 0;
    virtual vx_core::Type_any vx_any_from_any_context(vx_core::Type_context context, vx_core::Type_any value) const override = 0;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override = 0;
  };
  class Class_main_html : public virtual Abstract_main_html {
  public:
    Class_main_html();
    virtual ~Class_main_html() override;
    virtual vx_core::Type_any vx_new(vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_any vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_funcdef vx_funcdef() const override;
    virtual vx_core::Type_typedef vx_typedef() const override;
    virtual vx_core::Type_constdef vx_constdef() const override;
    virtual vx_core::Type_msgblock vx_msgblock() const override;
    virtual vx_core::vx_Type_listany vx_dispose() override;
    virtual vx_core::Type_any vx_empty() const override;
    virtual vx_core::Type_any vx_type() const override;
    virtual vx_core::Func_any_from_any_context vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any_context::IFn fn) const override;
    virtual vx_core::Type_any vx_any_from_any_context(vx_core::Type_context context, vx_core::Type_any value) const override;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override;
  };

  // (func myfunc)
  class Abstract_myfunc : public vx_core::Abstract_func, public virtual vx_core::Abstract_replfunc {
  public:
    Abstract_myfunc() {};
    virtual ~Abstract_myfunc() = 0;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override = 0;
  };
  class Class_myfunc : public virtual Abstract_myfunc {
  public:
    Class_myfunc();
    virtual ~Class_myfunc() override;
    virtual vx_core::Type_any vx_new(vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_any vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_funcdef vx_funcdef() const override;
    virtual vx_core::Type_typedef vx_typedef() const override;
    virtual vx_core::Type_constdef vx_constdef() const override;
    virtual vx_core::Type_msgblock vx_msgblock() const override;
    virtual vx_core::vx_Type_listany vx_dispose() override;
    virtual vx_core::Type_any vx_empty() const override;
    virtual vx_core::Type_any vx_type() const override;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override;
  };

  // (func p<-text)
  class Abstract_p_from_text : public vx_core::Abstract_any_from_any, public virtual vx_core::Abstract_replfunc {
  public:
    Abstract_p_from_text() {};
    virtual ~Abstract_p_from_text() = 0;
    virtual vx_core::Func_any_from_any vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any::IFn fn) const override = 0;
    virtual vx_core::Type_any vx_any_from_any(vx_core::Type_any value) const override = 0;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override = 0;
  };
  class Class_p_from_text : public virtual Abstract_p_from_text {
  public:
    Class_p_from_text();
    virtual ~Class_p_from_text() override;
    virtual vx_core::Type_any vx_new(vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_any vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_funcdef vx_funcdef() const override;
    virtual vx_core::Type_typedef vx_typedef() const override;
    virtual vx_core::Type_constdef vx_constdef() const override;
    virtual vx_core::Type_msgblock vx_msgblock() const override;
    virtual vx_core::vx_Type_listany vx_dispose() override;
    virtual vx_core::Type_any vx_empty() const override;
    virtual vx_core::Type_any vx_type() const override;
    virtual vx_core::Func_any_from_any vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any::IFn fn) const override;
    virtual vx_core::Type_any vx_any_from_any(vx_core::Type_any value) const override;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override;
  };

  // (func string-html<-text)
  class Abstract_string_html_from_text : public vx_core::Abstract_any_from_any, public virtual vx_core::Abstract_replfunc {
  public:
    Abstract_string_html_from_text() {};
    virtual ~Abstract_string_html_from_text() = 0;
    virtual vx_core::Func_any_from_any vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any::IFn fn) const override = 0;
    virtual vx_core::Type_any vx_any_from_any(vx_core::Type_any value) const override = 0;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override = 0;
  };
  class Class_string_html_from_text : public virtual Abstract_string_html_from_text {
  public:
    Class_string_html_from_text();
    virtual ~Class_string_html_from_text() override;
    virtual vx_core::Type_any vx_new(vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_any vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_funcdef vx_funcdef() const override;
    virtual vx_core::Type_typedef vx_typedef() const override;
    virtual vx_core::Type_constdef vx_constdef() const override;
    virtual vx_core::Type_msgblock vx_msgblock() const override;
    virtual vx_core::vx_Type_listany vx_dispose() override;
    virtual vx_core::Type_any vx_empty() const override;
    virtual vx_core::Type_any vx_type() const override;
    virtual vx_core::Func_any_from_any vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any::IFn fn) const override;
    virtual vx_core::Type_any vx_any_from_any(vx_core::Type_any value) const override;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override;
  };

  // (func string-render<-text)
  class Abstract_string_render_from_text : public vx_core::Abstract_any_from_any, public virtual vx_core::Abstract_replfunc {
  public:
    Abstract_string_render_from_text() {};
    virtual ~Abstract_string_render_from_text() = 0;
    virtual vx_core::Func_any_from_any vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any::IFn fn) const override = 0;
    virtual vx_core::Type_any vx_any_from_any(vx_core::Type_any value) const override = 0;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override = 0;
  };
  class Class_string_render_from_text : public virtual Abstract_string_render_from_text {
  public:
    Class_string_render_from_text();
    virtual ~Class_string_render_from_text() override;
    virtual vx_core::Type_any vx_new(vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_any vx_copy(vx_core::Type_any copyval, vx_core::vx_Type_listany vals) const override;
    virtual vx_core::Type_funcdef vx_funcdef() const override;
    virtual vx_core::Type_typedef vx_typedef() const override;
    virtual vx_core::Type_constdef vx_constdef() const override;
    virtual vx_core::Type_msgblock vx_msgblock() const override;
    virtual vx_core::vx_Type_listany vx_dispose() override;
    virtual vx_core::Type_any vx_empty() const override;
    virtual vx_core::Type_any vx_type() const override;
    virtual vx_core::Func_any_from_any vx_fn_new(vx_core::vx_Type_listany lambdavars, vx_core::Abstract_any_from_any::IFn fn) const override;
    virtual vx_core::Type_any vx_any_from_any(vx_core::Type_any value) const override;
    virtual vx_core::Type_any vx_repl(vx_core::Type_anylist arglist) override;
  };

  class vx_Class_package {
  public:
    vx_Class_package();
    void init();
  };
  inline vx_Class_package const vx_package;

}

#endif
