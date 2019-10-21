package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.WebViewer;
class Security extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private TextBox TextBox1;
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement2;
  private TextBox TextBox2;
  private Button Button2;
  private WebViewer WebViewer1;
  protected void $define() {
    this.AlignHorizontal(3);
    this.AppName("APAS");
    this.Title("Security");
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(3);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    TextBox1 = new TextBox(HorizontalArrangement1);
    TextBox1.Hint("Hint for TextBox1");
    Button1 = new Button(HorizontalArrangement1);
    Button1.BackgroundColor(0xFF888888);
    Button1.Shape(1);
    Button1.Text("Search Vehicle");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    TextBox2 = new TextBox(HorizontalArrangement2);
    TextBox2.Hint("Hint for TextBox2");
    Button2 = new Button(HorizontalArrangement2);
    Button2.BackgroundColor(0xFF888888);
    Button2.Shape(1);
    Button2.Text("Search Visitor");
    Button2.TextColor(0xFFFFFFFF);
    WebViewer1 = new WebViewer(this);
    WebViewer1.Width(LENGTH_FILL_PARENT);
    EventDispatcher.registerEventForDelegation(this, "ClickEvent", "Click" );
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    if( component.equals(Button1) && eventName.equals("Click") ){
      Button1Click();
      return true;
    }
    if( component.equals(Button2) && eventName.equals("Click") ){
      Button2Click();
      return true;
    }
    return false;
  }
  public void Button1Click(){
  }
  public void Button2Click(){
  }
}