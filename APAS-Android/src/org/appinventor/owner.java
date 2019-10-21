package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.WebViewer;
class owner extends Form implements HandlesEventDispatching {
  private WebViewer WebViewer1;
  protected void $define() {
    this.AppName("APAS");
    this.BackgroundColor(0x00FFFFFF);
    this.BackgroundImage("Flare.jpg");
    this.Title("Owner");
    WebViewer1 = new WebViewer(this);
    WebViewer1.Height(LENGTH_FILL_PARENT);
    WebViewer1.Width(LENGTH_FILL_PARENT);
    WebViewer1.HomeUrl(https://sanathswaroop.com/miniproject/owner.php?vehicle=AP11AH1682);
    WebViewer1.IgnoreSslErrors(true);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}