package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class home extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.home");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.home.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.home __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=42467328;
 //BA.debugLineNum = 42467328;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=42467329;
 //BA.debugLineNum = 42467329;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=42467330;
 //BA.debugLineNum = 42467330;BA.debugLine="End Sub";
return null;
}
public String  _animasi(b4a.example.home __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(ba, "animasi", false))
	 {return ((String) Debug.delegate(ba, "animasi", null));}
RDebugUtils.currentLine=42663936;
 //BA.debugLineNum = 42663936;BA.debugLine="Sub animasi";
RDebugUtils.currentLine=42663937;
 //BA.debugLineNum = 42663937;BA.debugLine="Root.Left = 100%x";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__c.PerXToCurrent((float) (100),ba));
RDebugUtils.currentLine=42663938;
 //BA.debugLineNum = 42663938;BA.debugLine="Root.SetLayoutAnimated(300,0,0,Root.Width,Root.He";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (300),(int) (0),(int) (0),__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=42663939;
 //BA.debugLineNum = 42663939;BA.debugLine="End Sub";
return "";
}
public String  _admin1(b4a.example.home __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(ba, "admin1", false))
	 {return ((String) Debug.delegate(ba, "admin1", null));}
RDebugUtils.currentLine=42729472;
 //BA.debugLineNum = 42729472;BA.debugLine="Sub admin1";
RDebugUtils.currentLine=42729473;
 //BA.debugLineNum = 42729473;BA.debugLine="Root.LoadLayout(\"Home\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Home",ba);
RDebugUtils.currentLine=42729475;
 //BA.debugLineNum = 42729475;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_appear(b4a.example.home __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=42598400;
 //BA.debugLineNum = 42598400;BA.debugLine="Sub B4XPage_Appear";
RDebugUtils.currentLine=42598401;
 //BA.debugLineNum = 42598401;BA.debugLine="If Main.level_user <> \"Pengunjung\" Then";
if ((_main._level_user /*String*/ ).equals("Pengunjung") == false) { 
RDebugUtils.currentLine=42598402;
 //BA.debugLineNum = 42598402;BA.debugLine="admin1";
__ref._admin1 /*String*/ (null);
 }else {
RDebugUtils.currentLine=42598404;
 //BA.debugLineNum = 42598404;BA.debugLine="pengunjung1";
__ref._pengunjung1 /*String*/ (null);
 };
RDebugUtils.currentLine=42598406;
 //BA.debugLineNum = 42598406;BA.debugLine="End Sub";
return "";
}
public String  _pengunjung1(b4a.example.home __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(ba, "pengunjung1", false))
	 {return ((String) Debug.delegate(ba, "pengunjung1", null));}
RDebugUtils.currentLine=42795008;
 //BA.debugLineNum = 42795008;BA.debugLine="Sub pengunjung1";
RDebugUtils.currentLine=42795009;
 //BA.debugLineNum = 42795009;BA.debugLine="Root.LoadLayout(\"Home\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Home",ba);
RDebugUtils.currentLine=42795010;
 //BA.debugLineNum = 42795010;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.home __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="home";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=42532864;
 //BA.debugLineNum = 42532864;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=42532865;
 //BA.debugLineNum = 42532865;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=42532868;
 //BA.debugLineNum = 42532868;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.home __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="home";
RDebugUtils.currentLine=42401792;
 //BA.debugLineNum = 42401792;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=42401793;
 //BA.debugLineNum = 42401793;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=42401794;
 //BA.debugLineNum = 42401794;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=42401795;
 //BA.debugLineNum = 42401795;BA.debugLine="End Sub";
return "";
}
}