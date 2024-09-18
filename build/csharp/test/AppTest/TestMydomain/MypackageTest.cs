
namespace AppTest.TestMydomain;

public class MypackageTest {

  public static Vx.Test.Type_testcase f_myfunc(Vx.Core.Type_context context) {
    Vx.Test.Type_testcase output = Vx.Core.vx_new(
      Vx.Test.t_testcase,
      ":passfail", false,
      ":testpkg", "mydomain/mypackage",
      ":casename", "myfunc",
      ":describelist",
      Vx.Core.vx_new(
        Vx.Test.t_testdescribelist,
        f_myfunc_testdescribe_1(context)
      )
    );
    return output;
  }

  public static Vx.Test.Type_testdescribe f_myfunc_testdescribe_1(Vx.Core.Type_context context) {
    Vx.Test.Type_testdescribe output = Vx.Core.vx_new(
      Vx.Test.t_testdescribe,
      ":describename", "(test 10 (myfunc 2 3))",
      ":testresult", Vx.Test.f_test(
        context,
        Vx.Core.vx_new_int(10),
        Mydomain.Mypackage.f_myfunc(
          Vx.Core.vx_new_int(2),
          Vx.Core.vx_new_int(3)
        )
      )
    );
    return output;
  }

  public static Vx.Test.Type_testcase f_p_from_text(Vx.Core.Type_context context) {
    Vx.Test.Type_testcase output = Vx.Core.vx_new(
      Vx.Test.t_testcase,
      ":passfail", false,
      ":testpkg", "mydomain/mypackage",
      ":casename", "p<-text",
      ":describelist",
      Vx.Core.vx_new(
        Vx.Test.t_testdescribelist,
        f_p_from_text_testdescribe_1(context)
      )
    );
    return output;
  }

  public static Vx.Test.Type_testdescribe f_p_from_text_testdescribe_1(Vx.Core.Type_context context) {
    Vx.Test.Type_testdescribe output = Vx.Core.vx_new(
      Vx.Test.t_testdescribe,
      ":describename", "(test\n (html/p :text \"a\")\n (p<-text \"a\"))",
      ":testresult", Vx.Test.f_test(
        context,
        Vx.Core.f_new(
          Vx.Web.Html.t_p,
          Vx.Core.vx_new(
            Vx.Core.t_anylist,
            Vx.Core.vx_new_string(":text"),
            Vx.Core.vx_new_string("a")
          )
        ),
        Mydomain.Mypackage.f_p_from_text(
          Vx.Core.vx_new_string("a")
        )
      )
    );
    return output;
  }

  public static Vx.Test.Type_testcase f_string_html_from_text(Vx.Core.Type_context context) {
    Vx.Test.Type_testcase output = Vx.Core.vx_new(
      Vx.Test.t_testcase,
      ":passfail", false,
      ":testpkg", "mydomain/mypackage",
      ":casename", "string-html<-text",
      ":describelist",
      Vx.Core.vx_new(
        Vx.Test.t_testdescribelist,
        f_string_html_from_text_testdescribe_1(context)
      )
    );
    return output;
  }

  public static Vx.Test.Type_testdescribe f_string_html_from_text_testdescribe_1(Vx.Core.Type_context context) {
    Vx.Test.Type_testdescribe output = Vx.Core.vx_new(
      Vx.Test.t_testdescribe,
      ":describename", "(test\n \"<p>a</p>\"\n (string-html<-text \"a\"))",
      ":testresult", Vx.Test.f_test(
        context,
        Vx.Core.vx_new_string("<p>a</p>"),
        Mydomain.Mypackage.f_string_html_from_text(
          Vx.Core.vx_new_string("a")
        )
      )
    );
    return output;
  }

  public static Vx.Test.Type_testcaselist test_cases(Vx.Core.Type_context context) {
    object[] testcases = [
      MypackageTest.f_myfunc(context),
      MypackageTest.f_p_from_text(context),
      MypackageTest.f_string_html_from_text(context)
    ];
    Vx.Test.Type_testcaselist output = Vx.Core.vx_new(
      Vx.Test.t_testcaselist,
      testcases
    );
    return output;
  }

  public static Vx.Test.Type_testcoveragesummary test_coveragesummary() {
    Vx.Test.Type_testcoveragesummary output = Vx.Core.vx_new(
      Vx.Test.t_testcoveragesummary,
      ":testpkg", "mydomain/mypackage", 
      ":constnums", Vx.Core.vx_new(Vx.Test.t_testcoveragenums, ":pct", 100, ":tests", 0, ":total", 0), 
      ":docnums", Vx.Core.vx_new(Vx.Test.t_testcoveragenums, ":pct", 100, ":tests", 8, ":total", 8), 
      ":funcnums", Vx.Core.vx_new(Vx.Test.t_testcoveragenums, ":pct", 42, ":tests", 3, ":total", 7), 
      ":bigospacenums", Vx.Core.vx_new(Vx.Test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 7), 
      ":bigotimenums", Vx.Core.vx_new(Vx.Test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 7), 
      ":totalnums", Vx.Core.vx_new(Vx.Test.t_testcoveragenums, ":pct", 37, ":tests", 3, ":total", 8), 
      ":typenums", Vx.Core.vx_new(Vx.Test.t_testcoveragenums, ":pct", 0, ":tests", 0, ":total", 1)
    );
    return output;
  }

  public static Vx.Test.Type_testcoveragedetail test_coveragedetail() {
    Vx.Test.Type_testcoveragedetail output = Vx.Core.vx_new(
      Vx.Test.t_testcoveragedetail,
      ":testpkg", "mydomain/mypackage",
      ":typemap", Vx.Core.vx_new(
        Vx.Core.t_intmap,
        ":mycontext", 0
      ), 
      ":constmap", Vx.Core.e_intmap, 
      ":funcmap", Vx.Core.vx_new(
        Vx.Core.t_intmap,
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

  public static Vx.Test.Type_testpackage test_package(Vx.Core.Type_context context) {
    Vx.Test.Type_testcaselist testcaselist = test_cases(context);
    Vx.Test.Type_testpackage output = Vx.Core.vx_new(
      Vx.Test.t_testpackage,
      ":testpkg", "mydomain/mypackage", 
      ":caselist", testcaselist,
      ":coveragesummary", test_coveragesummary(),
      ":coveragedetail", test_coveragedetail()
    );
    return output;
  }

}
