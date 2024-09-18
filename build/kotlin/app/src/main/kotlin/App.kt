/**
 * App
 */
import com.vxlisp.vx.*
import com.myurl.mydomain.*

  fun main(args : Array<String>) {
    try {
      var output : String = ""
      val arglist : vx_core.Type_anylist = vx_core.vx_anylist_from_arraystring(*args)
      val context : vx_core.Type_context = mydomain_mypackage.f_context_main(arglist)
      val mainstring : vx_core.Type_string = mydomain_mypackage.f_main_exe(context, arglist)
      output = mainstring.vx_string()
      println(output)
    } catch (e : Exception) {
      println(e.toString())
    }
  }
