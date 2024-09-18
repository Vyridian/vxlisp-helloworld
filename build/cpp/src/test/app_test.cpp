#include <iostream>
#include <stdexcept>
#include "../main/vx/core.hpp"
#include "../main/vx/test.hpp"
#include "test_lib.hpp"
#include "../main/vx/translation/en.hpp"
#include "vx/core_test.hpp"
#include "vx/data/db_test.hpp"
#include "vx/data/table_test.hpp"
#include "vx/data/tree_test.hpp"
#include "vx/event_test.hpp"
#include "vx/sample_test.hpp"
#include "vx/state_test.hpp"
#include "vx/type_test.hpp"
#include "vx/web/html_test.hpp"
#include "vx/collection_test.hpp"
#include "vx/data/textblock_test.hpp"
#include "vx/repl_test.hpp"
#include "vx/data/file_test.hpp"
#include "vx/data/xml_test.hpp"
#include "vx/test_test.hpp"
#include "vx/ui/ui_test.hpp"
#include "vx/web/htmldoc_test.hpp"
#include "mydomain/mypackage_test.hpp"
#include "vx/data/csv_test.hpp"
#include "vx/translate_test.hpp"
#include "vx/translation/en_test.hpp"
#include "vx/translation/es_test.hpp"
#include "vx/ui/html/uihtml_test.hpp"
#include "vx/ui/svg/uisvg_test.hpp"
#include "vx/web/http_test.hpp"
#include "vx/translation/all_test.hpp"

/**
 * Unit test for whole App.
 */

vx_test::Type_testpackagelist testsuite(vx_core::Type_context context) {
  vx_test::Type_testpackagelist output = vx_core::vx_new(vx_test::t_testpackagelist, {
    vx_core_test::test_package(context),
    vx_data_db_test::test_package(context),
    vx_data_table_test::test_package(context),
    vx_data_tree_test::test_package(context),
    vx_event_test::test_package(context),
    vx_sample_test::test_package(context),
    vx_state_test::test_package(context),
    vx_type_test::test_package(context),
    vx_web_html_test::test_package(context),
    vx_collection_test::test_package(context),
    vx_data_textblock_test::test_package(context),
    vx_repl_test::test_package(context),
    vx_data_file_test::test_package(context),
    vx_data_xml_test::test_package(context),
    vx_test_test::test_package(context),
    vx_ui_ui_test::test_package(context),
    vx_web_htmldoc_test::test_package(context),
    mydomain_mypackage_test::test_package(context),
    vx_data_csv_test::test_package(context),
    vx_translate_test::test_package(context),
    vx_translation_en_test::test_package(context),
    vx_translation_es_test::test_package(context),
    vx_ui_html_uihtml_test::test_package(context),
    vx_ui_svg_uisvg_test::test_package(context),
    vx_web_http_test::test_package(context),
    vx_translation_all_test::test_package(context)
  });
  return output;
}

int main(int iarglen, char* arrayarg[]) {
  int output = 0;
  try {
    vx_core::vx_log("Test Start");
    vx_core::Type_anylist arglist = vx_core::vx_anylist_from_arraystring(iarglen, arrayarg, true);
				vx_core::vx_reserve(arglist);
    vx_core::Type_context context = vx_translation_en::f_context_test(arglist);
    vx_core::vx_reserve_context(context);
		  vx_core::vx_release_one(arglist); +
  		test_lib::test_run_all(context, testsuite(context));
    vx_core::vx_memory_leak_test();
    vx_core::vx_log("Test End");
  } catch (std::exception& e) {
    std::cerr << e.what() << std::endl;
    output = -1;
  } catch (...) {
    vx_core::vx_log("Unexpected error");
    output = -1;
  }
  return output;
}
