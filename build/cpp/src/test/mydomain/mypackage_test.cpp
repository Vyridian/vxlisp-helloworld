#include "../../main/mydomain/mypackage.hpp"
#include "../../main/vx/core.hpp"
#include "../../main/vx/test.hpp"
#include "../../main/vx/web/html.hpp"
#include "../../main/vx/web/htmldoc.hpp"
#include "mypackage_test.hpp"

namespace mydomain_mypackage_test {


  vx_test::Type_testcase f_myfunc(vx_core::Type_context context) {
    vx_core::vx_log("Test Start: f_myfunc");
    // testdescribe_1
    vx_test::Type_testresult testresult_1 = vx_test::f_test(
      context,
      vx_core::vx_new_int(10),
      mydomain_mypackage::f_myfunc(vx_core::vx_new_int(2), vx_core::vx_new_int(3))
    );
    vx_test::Type_testdescribe testdescribe_1 = vx_core::vx_new(vx_test::t_testdescribe, {
      vx_core::vx_new_string(":describename"), vx_core::vx_new_string("(test 10 (myfunc 2 3))"),
      vx_core::vx_new_string(":testpkg"), vx_core::vx_new_string("mydomain/mypackage"),
      vx_core::vx_new_string(":testresult"), testresult_1
    });
    vx_core::vx_Type_listany listdescribe = {
      testdescribe_1
    };
    vx_test::Type_testcase output = vx_core::vx_new(vx_test::t_testcase, {
      vx_core::vx_new_string(":passfail"), vx_core::c_false,
      vx_core::vx_new_string(":testpkg"), vx_core::vx_new_string("mydomain/mypackage"),
      vx_core::vx_new_string(":casename"), vx_core::vx_new_string("myfunc"),
      vx_core::vx_new_string(":describelist"),
      vx_core::vx_any_from_any(
        vx_test::t_testdescribelist,
        vx_test::t_testdescribelist->vx_new_from_list(listdescribe)
      )
    });
    vx_core::vx_log("Test End  : f_myfunc");
    return output;
  }

  vx_test::Type_testcase f_p_from_text(vx_core::Type_context context) {
    vx_core::vx_log("Test Start: f_p_from_text");
    // testdescribe_1
    vx_test::Type_testresult testresult_1 = vx_test::f_test(
      context,
      vx_core::f_new(
        vx_web_html::t_p,
        vx_core::vx_new(vx_core::t_anylist, {
          vx_core::vx_new_string(":text"),
          vx_core::vx_new_string("a")
        })
      ),
      mydomain_mypackage::f_p_from_text(vx_core::vx_new_string("a"))
    );
    vx_test::Type_testdescribe testdescribe_1 = vx_core::vx_new(vx_test::t_testdescribe, {
      vx_core::vx_new_string(":describename"), vx_core::vx_new_string("(test\n (html/p :text \"a\")\n (p<-text \"a\"))"),
      vx_core::vx_new_string(":testpkg"), vx_core::vx_new_string("mydomain/mypackage"),
      vx_core::vx_new_string(":testresult"), testresult_1
    });
    vx_core::vx_Type_listany listdescribe = {
      testdescribe_1
    };
    vx_test::Type_testcase output = vx_core::vx_new(vx_test::t_testcase, {
      vx_core::vx_new_string(":passfail"), vx_core::c_false,
      vx_core::vx_new_string(":testpkg"), vx_core::vx_new_string("mydomain/mypackage"),
      vx_core::vx_new_string(":casename"), vx_core::vx_new_string("p<-text"),
      vx_core::vx_new_string(":describelist"),
      vx_core::vx_any_from_any(
        vx_test::t_testdescribelist,
        vx_test::t_testdescribelist->vx_new_from_list(listdescribe)
      )
    });
    vx_core::vx_log("Test End  : f_p_from_text");
    return output;
  }

  vx_test::Type_testcase f_string_html_from_text(vx_core::Type_context context) {
    vx_core::vx_log("Test Start: f_string_html_from_text");
    // testdescribe_1
    vx_test::Type_testresult testresult_1 = vx_test::f_test(
      context,
      vx_core::vx_new_string("<p>a</p>"),
      mydomain_mypackage::f_string_html_from_text(vx_core::vx_new_string("a"))
    );
    vx_test::Type_testdescribe testdescribe_1 = vx_core::vx_new(vx_test::t_testdescribe, {
      vx_core::vx_new_string(":describename"), vx_core::vx_new_string("(test\n \"<p>a</p>\"\n (string-html<-text \"a\"))"),
      vx_core::vx_new_string(":testpkg"), vx_core::vx_new_string("mydomain/mypackage"),
      vx_core::vx_new_string(":testresult"), testresult_1
    });
    vx_core::vx_Type_listany listdescribe = {
      testdescribe_1
    };
    vx_test::Type_testcase output = vx_core::vx_new(vx_test::t_testcase, {
      vx_core::vx_new_string(":passfail"), vx_core::c_false,
      vx_core::vx_new_string(":testpkg"), vx_core::vx_new_string("mydomain/mypackage"),
      vx_core::vx_new_string(":casename"), vx_core::vx_new_string("string-html<-text"),
      vx_core::vx_new_string(":describelist"),
      vx_core::vx_any_from_any(
        vx_test::t_testdescribelist,
        vx_test::t_testdescribelist->vx_new_from_list(listdescribe)
      )
    });
    vx_core::vx_log("Test End  : f_string_html_from_text");
    return output;
  }

  vx_test::Type_testcaselist test_cases(vx_core::Type_context context) {
    vx_core::vx_Type_listany listtestcase;
    listtestcase.push_back(mydomain_mypackage_test::f_myfunc(context));
    listtestcase.push_back(mydomain_mypackage_test::f_p_from_text(context));
    listtestcase.push_back(mydomain_mypackage_test::f_string_html_from_text(context));
    vx_test::Type_testcaselist output = vx_core::vx_any_from_any(
      vx_test::t_testcaselist,
      vx_test::t_testcaselist->vx_new_from_list(listtestcase)
    );
    return output;
  }

  vx_test::Type_testcoveragesummary test_coveragesummary() {
    vx_test::Type_testcoveragesummary output = vx_core::vx_new(vx_test::t_testcoveragesummary, {
      vx_core::vx_new_string(":testpkg"), vx_core::vx_new_string("mydomain/mypackage"),
      vx_core::vx_new_string(":constnums"), vx_core::vx_new(vx_test::t_testcoveragenums, {
        vx_core::vx_new_string(":pct"), vx_core::vx_new_int(100), 
        vx_core::vx_new_string(":tests"), vx_core::vx_new_int(0), 
        vx_core::vx_new_string(":total"), vx_core::vx_new_int(0)
      }),
      vx_core::vx_new_string(":docnums"), vx_core::vx_new(vx_test::t_testcoveragenums, {
        vx_core::vx_new_string(":pct"), vx_core::vx_new_int(100), 
        vx_core::vx_new_string(":tests"), vx_core::vx_new_int(8), 
        vx_core::vx_new_string(":total"), vx_core::vx_new_int(8)
      }),
      vx_core::vx_new_string(":funcnums"), vx_core::vx_new(vx_test::t_testcoveragenums, {
        vx_core::vx_new_string(":pct"), vx_core::vx_new_int(42), 
        vx_core::vx_new_string(":tests"), vx_core::vx_new_int(3), 
        vx_core::vx_new_string(":total"), vx_core::vx_new_int(7)
      }),
      vx_core::vx_new_string(":bigospacenums"), vx_core::vx_new(vx_test::t_testcoveragenums, {
        vx_core::vx_new_string(":pct"), vx_core::vx_new_int(0), 
        vx_core::vx_new_string(":tests"), vx_core::vx_new_int(0), 
        vx_core::vx_new_string(":total"), vx_core::vx_new_int(7)
      }),
      vx_core::vx_new_string(":bigotimenums"), vx_core::vx_new(vx_test::t_testcoveragenums, {
        vx_core::vx_new_string(":pct"), vx_core::vx_new_int(0), 
        vx_core::vx_new_string(":tests"), vx_core::vx_new_int(0), 
        vx_core::vx_new_string(":total"), vx_core::vx_new_int(7)
      }),
      vx_core::vx_new_string(":totalnums"), vx_core::vx_new(vx_test::t_testcoveragenums, {
        vx_core::vx_new_string(":pct"), vx_core::vx_new_int(37), 
        vx_core::vx_new_string(":tests"), vx_core::vx_new_int(3), 
        vx_core::vx_new_string(":total"), vx_core::vx_new_int(8)
      }),
      vx_core::vx_new_string(":typenums"), vx_core::vx_new(vx_test::t_testcoveragenums, {
        vx_core::vx_new_string(":pct"), vx_core::vx_new_int(0), 
        vx_core::vx_new_string(":tests"), vx_core::vx_new_int(0), 
        vx_core::vx_new_string(":total"), vx_core::vx_new_int(1)
      })
    });
    return output;
  }

  vx_test::Type_testcoveragedetail test_coveragedetail() {
    vx_test::Type_testcoveragedetail output = vx_core::vx_new(vx_test::t_testcoveragedetail, {
      vx_core::vx_new_string(":testpkg"), vx_core::vx_new_string("mydomain/mypackage"),
      vx_core::vx_new_string(":typemap"), vx_core::vx_new(vx_core::t_intmap, {
        vx_core::vx_new_string(":mycontext"), vx_core::vx_new_int(0)
      }),
      vx_core::vx_new_string(":constmap"), vx_core::vx_new(vx_core::t_intmap, {
        
      }),
      vx_core::vx_new_string(":funcmap"), vx_core::vx_new(vx_core::t_intmap, {
        vx_core::vx_new_string(":context-main"), vx_core::vx_new_int(0),
        vx_core::vx_new_string(":main-exe"), vx_core::vx_new_int(0),
        vx_core::vx_new_string(":main-html"), vx_core::vx_new_int(0),
        vx_core::vx_new_string(":myfunc"), vx_core::vx_new_int(1),
        vx_core::vx_new_string(":p<-text"), vx_core::vx_new_int(1),
        vx_core::vx_new_string(":string-html<-text"), vx_core::vx_new_int(1),
        vx_core::vx_new_string(":string-render<-text"), vx_core::vx_new_int(0)
      })
    });
    return output;
  }

  vx_test::Type_testpackage test_package(vx_core::Type_context context) {
    vx_test::Type_testcaselist testcaselist = mydomain_mypackage_test::test_cases(context);
    vx_test::Type_testcoveragesummary testcoveragesummary = mydomain_mypackage_test::test_coveragesummary();
    vx_test::Type_testcoveragedetail testcoveragedetail = mydomain_mypackage_test::test_coveragedetail();
    vx_test::Type_testpackage output = vx_core::vx_new(vx_test::t_testpackage, {
      vx_core::vx_new_string(":testpkg"), vx_core::vx_new_string("mydomain/mypackage"),
      vx_core::vx_new_string(":caselist"), testcaselist,
      vx_core::vx_new_string(":coveragesummary"), testcoveragesummary,
      vx_core::vx_new_string(":coveragedetail"), testcoveragedetail
    });
    return output;
  }

}
