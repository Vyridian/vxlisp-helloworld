
package com.myurl.mydomain;

import java.util.List;
import com.vxlisp.vx.*;
import com.vxlisp.vx.web.*;

public final class MypackageTest {

  public static Test.Type_testcase f_myfunc(final Core.Type_context context) {
    Test.Type_testcase output = Core.vx_new(
      Test.t_testcase,
      ":passfail", false,
      ":testpkg", "mydomain/mypackage",
      ":casename", "myfunc",
      ":describelist",
      Core.vx_new(
        Test.t_testdescribelist,
        f_myfunc_testdescribe_1(context)
      )
    );
    return output;
  }

  public static Test.Type_testdescribe f_myfunc_testdescribe_1(final Core.Type_context context) {
    Test.Type_testdescribe output = Core.vx_new(
      Test.t_testdescribe,
      ":describename", "(test 10 (myfunc 2 3))",
      ":testresult", Test.f_test(
        context,
        Core.vx_new_int(10),
        Mypackage.f_myfunc(
          Core.vx_new_int(2),
          Core.vx_new_int(3)
        )
      )
    );
    return output;
  }

  public static Test.Type_testcase f_p_from_text(final Core.Type_context context) {
    Test.Type_testcase output = Core.vx_new(
      Test.t_testcase,
      ":passfail", false,
      ":testpkg", "mydomain/mypackage",
      ":casename", "p<-text",
      ":describelist",
      Core.vx_new(
        Test.t_testdescribelist,
        f_p_from_text_testdescribe_1(context)
      )
    );
    return output;
  }

  public static Test.Type_testdescribe f_p_from_text_testdescribe_1(final Core.Type_context context) {
    Test.Type_testdescribe output = Core.vx_new(
      Test.t_testdescribe,
      ":describename", "(test\n (html/p :text \"a\")\n (p<-text \"a\"))",
      ":testresult", Test.f_test(
        context,
        Core.f_new(
          Html.t_p,
          Core.vx_new(
            Core.t_anylist,
            Core.vx_new_string(":text"),
            Core.vx_new_string("a")
          )
        ),
        Mypackage.f_p_from_text(
          Core.vx_new_string("a")
        )
      )
    );
    return output;
  }

  public static Test.Type_testcase f_string_html_from_text(final Core.Type_context context) {
    Test.Type_testcase output = Core.vx_new(
      Test.t_testcase,
      ":passfail", false,
      ":testpkg", "mydomain/mypackage",
      ":casename", "string-html<-text",
      ":describelist",
      Core.vx_new(
        Test.t_testdescribelist,
        f_string_html_from_text_testdescribe_1(context)
      )
    );
    return output;
  }

  public static Test.Type_testdescribe f_string_html_from_text_testdescribe_1(final Core.Type_context context) {
    Test.Type_testdescribe output = Core.vx_new(
      Test.t_testdescribe,
      ":describename", "(test\n \"<p>a</p>\"\n (string-html<-text \"a\"))",
      ":testresult", Test.f_test(
        context,
        Core.vx_new_string("<p>a</p>"),
        Mypackage.f_string_html_from_text(
          Core.vx_new_string("a")
        )
      )
    );
    return output;
  }

  public static Test.Type_testcaselist test_cases(final Core.Type_context context) {
    List<Core.Type_any> testcases = Core.arraylist_from_array(
      MypackageTest.f_myfunc(context),
      MypackageTest.f_p_from_text(context),
      MypackageTest.f_string_html_from_text(context)
    );
    Test.Type_testcaselist output = Core.vx_new(
      Test.t_testcaselist,
      testcases
    );
    return output;
  }

  public static Test.Type_testcoveragesummary test_coveragesummary() {
    Test.Type_testcoveragesummary output = Core.vx_new(
      Test.t_testcoveragesummary,
      ":testpkg", "mydomain/mypackage", 
      ":constnums", Core.vx_new(Test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      ":docnums", Core.vx_new(Test.t_testcoveragenums, ":pct", 100, ":tests", 8, ":total", 8), 
      ":funcnums", Core.vx_new(Test.t_testcoveragenums, ":pct", 42, ":tests", 3, ":total", 7), 
      ":bigospacenums", Core.vx_new(Test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 7), 
      ":bigotimenums", Core.vx_new(Test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 7), 
      ":totalnums", Core.vx_new(Test.t_testcoveragenums, ":pct", 37, ":tests", 3, ":total", 8), 
      ":typenums", Core.vx_new(Test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 1)
    );
    return output;
  }

  public static Test.Type_testcoveragedetail test_coveragedetail() {
    Test.Type_testcoveragedetail output = Core.vx_new(
      Test.t_testcoveragedetail,
      ":testpkg", "mydomain/mypackage",
      ":typemap", Core.vx_new(
        Core.t_intmap,
        ":mycontext", 0
      ), 
      ":constmap", Core.e_intmap, 
      ":funcmap", Core.vx_new(
        Core.t_intmap,
        ":context-main", 0,
        ":main-exe", 0,
        ":main-html", 0,
        ":myfunc", 1,
        ":p<-text", 1,
        ":string-html<-text", 1,
        ":string-render<-text", 0
      )
    );
    return output;
  }

  public static Test.Type_testpackage test_package(final Core.Type_context context) {
    Test.Type_testcaselist testcaselist = test_cases(context);
    Test.Type_testpackage output = Core.vx_new(
      Test.t_testpackage,
      ":testpkg", "mydomain/mypackage", 
      ":caselist", testcaselist,
      ":coveragesummary", test_coveragesummary(),
      ":coveragedetail", test_coveragedetail()
    );
    return output;
  }

}
