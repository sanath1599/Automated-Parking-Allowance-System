package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.HorizontalScrollArrangement;
import com.google.appinventor.components.runtime.Button;
import android.content.Intent;
class Screen1 extends Form implements HandlesEventDispatching {
  private VerticalArrangement VerticalArrangement1;
  private Image Image1;
  private Label Label1;
  private VerticalArrangement VerticalArrangement2;
  private HorizontalScrollArrangement HorizontalScrollArrangement1;
  private Button Button1;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AlignHorizontal(3);
    this.AppName("APAS");
    this.BackgroundImage("Flare.jpg");
    this.Icon("logo.png");
    this.Title("Login");
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.BackgroundColor(0x00FFFFFF);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Image1 = new Image(VerticalArrangement1);
    Image1.Picture("samlllogo.png");
    Label1 = new Label(this);
    Label1.FontBold(true);
    Label1.FontSize(24);
    Label1.FontTypeface(1);
    Label1.Text("Click Below button ");
    VerticalArrangement2 = new VerticalArrangement(this);
    VerticalArrangement2.AlignHorizontal(3);
    VerticalArrangement2.BackgroundColor(0x00FFFFFF);
    VerticalArrangement2.Height(LENGTH_FILL_PARENT);
    VerticalArrangement2.Width(LENGTH_FILL_PARENT);
    HorizontalScrollArrangement1 = new HorizontalScrollArrangement(VerticalArrangement2);
    HorizontalScrollArrangement1.BackgroundColor(0x00FFFFFF);
    HorizontalScrollArrangement1.Width(LENGTH_FILL_PARENT);
    Button1 = new Button(HorizontalScrollArrangement1);
    Button1.BackgroundColor(0x00FFFFFF);
    Button1.Height(100);
    Button1.Width(-1030);
    Button1.Image("carowner.png");
    Button1.Shape(2);
    Button2 = new Button(HorizontalScrollArrangement1);
    Button2.Height(100);
    Button2.Width(-1030);
    Button2.Image("securitylogo.png");
    Button3 = new Button(HorizontalScrollArrangement1);
    Button3.Height(100);
    Button3.Width(-1030);
    Button3.Image("managerlogo.png");
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
    if( component.equals(Button3) && eventName.equals("Click") ){
      Button3Click();
      return true;
    }
    return false;
  }
  public void Button1Click(){
    startActivity(new Intent().setClass(this, owner.class));
  }
  public void Button2Click(){
    startActivity(new Intent().setClass(this, Security.class));
  }
  public void Button3Click(){
    startActivity(new Intent().setClass(this, Security.class));
  }
}