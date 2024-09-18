/**
 * App
 */

class App {

  static void Main(string[] args) {
    try {
      string output = "";
      Vx.Core.Type_anylist arglist = Vx.Core.vx_anylist_from_arraystring(args);
      Vx.Core.Type_context context = Mydomain.Mypackage.f_context_main(arglist);
      Vx.Core.Type_string mainstring = Mydomain.Mypackage.f_main_exe(context, arglist);
      output = mainstring.vx_string();
      System.Console.WriteLine(output);
    } catch (Exception e) {
      System.Console.WriteLine("Untrapped Error!" + e.ToString());
    }
  }

}
