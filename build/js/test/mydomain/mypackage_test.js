'strict mode'

import mydomain_mypackage from "../../src/mydomain/mypackage.js"
import vx_core from "../../src/vx/core.js"
import vx_test from "../../src/vx/test.js"
import vx_web_html from "../../src/vx/web/html.js"
import vx_web_htmldoc from "../../src/vx/web/htmldoc.js"

export default class mydomain_mypackage_test {


  static test_package(context) {
    const testcaselist = mydomain_mypackage_test.test_cases(context)
    const output = vx_core.f_new(
      vx_test.t_testpackage,
      ":testpkg", "mydomain/mypackage",
      ":caselist", testcaselist,
      ":coveragesummary", mydomain_mypackage_test.test_coveragesummary(),
      ":coveragedetail", mydomain_mypackage_test.test_coveragedetail()
    );
    return output;
  }

  static test_coveragesummary() {
    return vx_core.f_new(
      vx_test.t_testcoveragesummary,
      "testpkg",   "mydomain/mypackage", 
      "constnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "docnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 8, ":total", 8), 
      "funcnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 42, ":tests", 3, ":total", 7), 
      "bigospacenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "bigotimenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      "totalnums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 37, ":tests", 3, ":total", 8), 
      "typenums", vx_core.f_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 1)
    )
  }

  static test_coveragedetail() {
    return vx_core.f_new(
      vx_test.t_testcoveragedetail,
      "testpkg", "mydomain/mypackage",
      "typemap",
        vx_core.f_new(
          vx_core.t_intmap,
          "mycontext", 0
        ),
      "constmap",
        vx_core.f_new(
          vx_core.t_intmap
        ),
      "funcmap",
        vx_core.f_new(
          vx_core.t_intmap,
          "context-main", 0,
          "main-exe", 0,
          "main-html", 0,
          "myfunc", 1,
          "p<-text", 1,
          "string-html<-text", 1,
          "string-render<-text", 0
        )
    )
  }

  static f_myfunc(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "mydomain/mypackage",
      ":casename", "myfunc",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test 10 (myfunc 2 3))",
            ":testresult",
            vx_test.f_test(
              context,
              10,
              mydomain_mypackage.f_myfunc(2, 3)
            )
          )
        )
    )
    return output
  }

  static f_p_from_text(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "mydomain/mypackage",
      ":casename", "p<-text",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n (html/p :text \"a\")\n (p<-text \"a\"))",
            ":testresult",
            vx_test.f_test(
              context,
              vx_core.f_new(
                vx_web_html.t_p,
                ":text",
                "a"
              ),
              mydomain_mypackage.f_p_from_text("a")
            )
          )
        )
    )
    return output
  }

  static f_string_html_from_text(context) {
    const output = vx_core.f_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "mydomain/mypackage",
      ":casename", "string-html<-text",
      ":describelist",
        vx_core.f_new(
          vx_test.t_testdescribelist,
          vx_core.f_new(
            vx_test.t_testdescribe,
            ":describename", "(test\n \"<p>a</p>\"\n (string-html<-text \"a\"))",
            ":testresult",
            vx_test.f_test(
              context,
              "<p>a</p>",
              mydomain_mypackage.f_string_html_from_text("a")
            )
          )
        )
    )
    return output
  }

  static test_cases(context) {
    const output = vx_core.f_new(
      vx_test.t_testcaselist,
      mydomain_mypackage_test.f_myfunc(context),
      mydomain_mypackage_test.f_p_from_text(context),
      mydomain_mypackage_test.f_string_html_from_text(context)
    )
    return output
  }
}
