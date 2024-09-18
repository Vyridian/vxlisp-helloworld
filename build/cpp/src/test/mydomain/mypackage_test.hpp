#ifndef MYDOMAIN_MYPACKAGE_TEST_HPP
#define MYDOMAIN_MYPACKAGE_TEST_HPP
#include "../../main/vx/core.hpp"
#include "../../main/vx/test.hpp"

namespace mydomain_mypackage_test {


  vx_test::Type_testcase f_myfunc(vx_core::Type_context context);
  vx_test::Type_testcase f_p_from_text(vx_core::Type_context context);
  vx_test::Type_testcase f_string_html_from_text(vx_core::Type_context context);

  vx_test::Type_testcaselist test_cases(vx_core::Type_context context);
  vx_test::Type_testcoveragesummary test_coveragesummary();
  vx_test::Type_testcoveragedetail test_coveragedetail();
  vx_test::Type_testpackage test_package(vx_core::Type_context context);

}

#endif
