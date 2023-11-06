//You can use a text editor to open different type of files, e.g // vscode to open .sql, .csv, .py, .java --------!
// Solution: You creates an abstract class with it's all method as abstract
//abstract class Plugin {

//  public abstract void draw();
//  public abstract void save();
//}
// But if you want a class with everything abstract you can better use interface.
//
// < ------------- interface ---------------->
interface Plugin {

  public void draw();
  public void save();
}
// API's also works the same way so whenever someone wants to create Plugin he must provide implementation of draw and save.
//
// < ----- interface is implementend like class is extended ---->
class TextEditorPlugin implements Plugin {
 

  public void draw() {
    System.out.println("Drawing text.........!");
    
  }
  public void save() {
    System.out.println("Saved text.......!");
    
  }
}
class PDFViewerPlugin implements Plugin { 

  public void draw() {
    System.out.println("Showing PDF..");
    
  }
  public void save() {
    System.out.println("Saved PDF...!");
    
  }
}


public class Runner09 {
  public static void main(String[] args) {
    //Plugin p = new TextEditorPlugin();

  //  p.draw();
//    p.save();

    Plugin p = new PDFViewerPlugin();
    
    // That's how text editor works:
    //e.g:
    // Plugin p = PluginFactory.getPluginFor("filename.pdf");
    // PluginFactory will give plugins and based on extension of file the editor would call only that class with .pdf
    p.draw();
    p.save();
  }
}
