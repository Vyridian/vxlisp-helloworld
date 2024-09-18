
package com.myurl.mydomain

import com.vxlisp.vx.*
import com.vxlisp.vx.web.*

object mydomain_mypackageTest {

  fun f_myfunc(context : vx_core.Type_context) : vx_test.Type_testcase {
    var output : vx_test.Type_testcase = vx_core.vx_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "mydomain/mypackage",
      ":casename", "myfunc",
      ":describelist",
      vx_core.vx_new(
        vx_test.t_testdescribelist,
        f_myfunc_testdescribe_1(context)
      )
    )
    return output
  }

  fun f_myfunc_testdescribe_1(context : vx_core.Type_context) : vx_test.Type_testdescribe {
    var output : vx_test.Type_testdescribe = vx_core.vx_new(
      vx_test.t_testdescribe,
      ":describename", "(test 10 (myfunc 2 3))",
      ":testresult", vx_test.f_test(
        context,
        vx_core.vx_new_int(10),
        mydomain_mypackage.f_myfunc(
          vx_core.vx_new_int(2),
          vx_core.vx_new_int(3)
        )
      )
    )
    return output
  }

  fun f_p_from_text(context : vx_core.Type_context) : vx_test.Type_testcase {
    var output : vx_test.Type_testcase = vx_core.vx_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "mydomain/mypackage",
      ":casename", "p<-text",
      ":describelist",
      vx_core.vx_new(
        vx_test.t_testdescribelist,
        f_p_from_text_testdescribe_1(context)
      )
    )
    return output
  }

  fun f_p_from_text_testdescribe_1(context : vx_core.Type_context) : vx_test.Type_testdescribe {
    var output : vx_test.Type_testdescribe = vx_core.vx_new(
      vx_test.t_testdescribe,
      ":describename", "(test\n (html/p :text \"a\")\n (p<-text \"a\"))",
      ":testresult", vx_test.f_test(
        context,
        vx_core.f_new(
          vx_web_html.t_p,
          vx_core.vx_new(
            vx_core.t_anylist,
            vx_core.vx_new_string(":text"),
            vx_core.vx_new_string("a")
          )
        ),
        mydomain_mypackage.f_p_from_text(
          vx_core.vx_new_string("a")
        )
      )
    )
    return output
  }

  fun f_string_html_from_text(context : vx_core.Type_context) : vx_test.Type_testcase {
    var output : vx_test.Type_testcase = vx_core.vx_new(
      vx_test.t_testcase,
      ":passfail", false,
      ":testpkg", "mydomain/mypackage",
      ":casename", "string-html<-text",
      ":describelist",
      vx_core.vx_new(
        vx_test.t_testdescribelist,
        f_string_html_from_text_testdescribe_1(context)
      )
    )
    return output
  }

  fun f_string_html_from_text_testdescribe_1(context : vx_core.Type_context) : vx_test.Type_testdescribe {
    var output : vx_test.Type_testdescribe = vx_core.vx_new(
      vx_test.t_testdescribe,
      ":describename", "(test\n \"<p>a</p>\"\n (string-html<-text \"a\"))",
      ":testresult", vx_test.f_test(
        context,
        vx_core.vx_new_string("<p>a</p>"),
        mydomain_mypackage.f_string_html_from_text(
          vx_core.vx_new_string("a")
        )
      )
    )
    return output
  }

  fun test_cases(context : vx_core.Type_context) : vx_test.Type_testcaselist {
    var testcases : List<vx_core.Type_any> = vx_core.arraylist_from_array(
      mydomain_mypackageTest.f_myfunc(context),
      mydomain_mypackageTest.f_p_from_text(context),
      mydomain_mypackageTest.f_string_html_from_text(context)
    )
    var output : vx_test.Type_testcaselist = vx_core.vx_new(
      vx_test.t_testcaselist,
      testcases
    )
    return output
  }

  fun test_coveragesummary() : vx_test.Type_testcoveragesummary {
    var output : vx_test.Type_testcoveragesummary = vx_core.vx_new(
      vx_test.t_testcoveragesummary,
      ":testpkg", "mydomain/mypackage", 
      ":constnums", vx_core.vx_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      ":docnums", vx_core.vx_new(vx_test.t_testcoveragenums, ":pct", 100, ":tests", 8, ":total", 8), 
      ":funcnums", vx_core.vx_new(vx_test.t_testcoveragenums, ":pct", 42, ":tests", 3, ":total", 7), 
      ":bigospacenums", vx_core.vx_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 7), 
      ":bigotimenums", vx_core.vx_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 7), 
      ":totalnums", vx_core.vx_new(vx_test.t_testcoveragenums, ":pct", 37, ":tests", 3, ":total", 8), 
      ":typenums", vx_core.vx_new(vx_test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 1)
    )
    return output
  }

  fun test_coveragedetail() : vx_test.Type_testcoveragedetail {
    var output : vx_test.Type_testcoveragedetail = vx_core.vx_new(
      vx_test.t_testcoveragedetail,
      ":testpkg", "mydomain/mypackage",
      ":typemap", vx_core.vx_new(
        vx_core.t_intmap,
        ":mycontext", 0
      ), 
      ":constmap", vx_core.e_intmap, 
      ":funcmap", vx_core.vx_new(
        vx_core.t_intmap,
        ":context-main", 0,
        ":main-exe", 0,
        ":main-html", 0,
        ":myfunc", 1,
        ":p<-text", 1,
        ":string-html<-text", 1,
        ":string-render<-text", 0
      )
    )
    return output
  }

  fun test_package(context : vx_core.Type_context) : vx_test.Type_testpackage {
    var testcaselist : vx_test.Type_testcaselist = test_cases(context)
    var output : vx_test.Type_testpackage = vx_core.vx_new(
      vx_test.t_testpackage,
      ":testpkg", "mydomain/mypackage", 
      ":caselist", testcaselist,
      ":coveragesummary", test_coveragesummary(),
      ":coveragedetail", test_coveragedetail()
    )
    return output
  }

}
