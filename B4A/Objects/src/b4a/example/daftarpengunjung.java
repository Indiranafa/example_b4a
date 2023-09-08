package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class daftarpengunjung extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.daftarpengunjung");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.daftarpengunjung.class).invoke(this, new Object[] {null});
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
public Object  _initialize(b4a.example.daftarpengunjung __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="daftarpengunjung";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=44826624;
 //BA.debugLineNum = 44826624;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=44826625;
 //BA.debugLineNum = 44826625;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=44826626;
 //BA.debugLineNum = 44826626;BA.debugLine="End Sub";
return null;
}
public String  _animasi(b4a.example.daftarpengunjung __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="daftarpengunjung";
if (Debug.shouldDelegate(ba, "animasi", false))
	 {return ((String) Debug.delegate(ba, "animasi", null));}
RDebugUtils.currentLine=44957696;
 //BA.debugLineNum = 44957696;BA.debugLine="Sub animasi";
RDebugUtils.currentLine=44957697;
 //BA.debugLineNum = 44957697;BA.debugLine="Root.Left = 100%x";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__c.PerXToCurrent((float) (100),ba));
RDebugUtils.currentLine=44957698;
 //BA.debugLineNum = 44957698;BA.debugLine="Root.SetLayoutAnimated(300,0,0,Root.Width,Root.He";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (300),(int) (0),(int) (0),__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=44957699;
 //BA.debugLineNum = 44957699;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.daftarpengunjung __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="daftarpengunjung";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=44892160;
 //BA.debugLineNum = 44892160;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=44892161;
 //BA.debugLineNum = 44892161;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=44892162;
 //BA.debugLineNum = 44892162;BA.debugLine="Root.LoadLayout(\"Registrasi\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Registrasi",ba);
RDebugUtils.currentLine=44892165;
 //BA.debugLineNum = 44892165;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.daftarpengunjung __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="daftarpengunjung";
RDebugUtils.currentLine=44761088;
 //BA.debugLineNum = 44761088;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=44761089;
 //BA.debugLineNum = 44761089;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44761090;
 //BA.debugLineNum = 44761090;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=44761091;
 //BA.debugLineNum = 44761091;BA.debugLine="End Sub";
return "";
}
}