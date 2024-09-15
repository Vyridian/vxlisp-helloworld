/**
 * App
 */
import com.vxlisp.vx.Core;
import com.myurl.mydomain.Mypackage;

public final class App {

  public static void main(String[] args) {
    try {
      String output = "";
      final Core.Type_anylist arglist = Core.vx_anylist_from_arraystring(args);
      final Core.Type_context context = Mypackage.f_context_main(arglist);
      final Core.Type_string mainstring = Mypackage.f_main_exe(context, arglist);
      output = mainstring.vx_string();
      System.out.println(output);
    } catch (Exception e) {
      System.out.println("Untrapped Error!" + e.toString());
    }
  }

}
