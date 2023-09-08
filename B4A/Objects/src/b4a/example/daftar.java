package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class daftar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.daftar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.daftar.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ButtonWrapper _btnadmin = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnpengunjung = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnkembali = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.daftar __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="daftar";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=41877504;
 //BA.debugLineNum = 41877504;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=41877505;
 //BA.debugLineNum = 41877505;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=41877506;
 //BA.debugLineNum = 41877506;BA.debugLine="End Sub";
return null;
}
public String  _animasi(b4a.example.daftar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="daftar";
if (Debug.shouldDelegate(ba, "animasi", false))
	 {return ((String) Debug.delegate(ba, "animasi", null));}
RDebugUtils.currentLine=42008576;
 //BA.debugLineNum = 42008576;BA.debugLine="Sub animasi";
RDebugUtils.currentLine=42008577;
 //BA.debugLineNum = 42008577;BA.debugLine="Root.Left = 100%x";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__c.PerXToCurrent((float) (100),ba));
RDebugUtils.currentLine=42008578;
 //BA.debugLineNum = 42008578;BA.debugLine="Root.SetLayoutAnimated(300,0,0,Root.Width,Root.He";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (300),(int) (0),(int) (0),__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=42008579;
 //BA.debugLineNum = 42008579;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.daftar __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="daftar";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=41943040;
 //BA.debugLineNum = 41943040;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=41943041;
 //BA.debugLineNum = 41943041;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=41943042;
 //BA.debugLineNum = 41943042;BA.debugLine="Root.LoadLayout(\"Daftar\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Daftar",ba);
RDebugUtils.currentLine=41943045;
 //BA.debugLineNum = 41943045;BA.debugLine="End Sub";
return "";
}
public String  _btnadmin_click(b4a.example.daftar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="daftar";
if (Debug.shouldDelegate(ba, "btnadmin_click", false))
	 {return ((String) Debug.delegate(ba, "btnadmin_click", null));}
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Private Sub btnAdmin_Click";
RDebugUtils.currentLine=42139649;
 //BA.debugLineNum = 42139649;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=42139650;
 //BA.debugLineNum = 42139650;BA.debugLine="B4XPages.MainPage.DaftarAdmin1";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._daftaradmin1 /*String*/ (null);
RDebugUtils.currentLine=42139651;
 //BA.debugLineNum = 42139651;BA.debugLine="End Sub";
return "";
}
public String  _btnkembali_click(b4a.example.daftar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="daftar";
if (Debug.shouldDelegate(ba, "btnkembali_click", false))
	 {return ((String) Debug.delegate(ba, "btnkembali_click", null));}
RDebugUtils.currentLine=42336256;
 //BA.debugLineNum = 42336256;BA.debugLine="Private Sub btnKembali_Click";
RDebugUtils.currentLine=42336257;
 //BA.debugLineNum = 42336257;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=42336258;
 //BA.debugLineNum = 42336258;BA.debugLine="B4XPages.MainPage.animasi";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._animasi /*String*/ (null);
RDebugUtils.currentLine=42336259;
 //BA.debugLineNum = 42336259;BA.debugLine="End Sub";
return "";
}
public String  _btnpengunjung_click(b4a.example.daftar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="daftar";
if (Debug.shouldDelegate(ba, "btnpengunjung_click", false))
	 {return ((String) Debug.delegate(ba, "btnpengunjung_click", null));}
RDebugUtils.currentLine=42074112;
 //BA.debugLineNum = 42074112;BA.debugLine="Private Sub btnPengunjung_Click";
RDebugUtils.currentLine=42074113;
 //BA.debugLineNum = 42074113;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=42074114;
 //BA.debugLineNum = 42074114;BA.debugLine="B4XPages.MainPage.DaftarPengunjung1";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._daftarpengunjung1 /*String*/ (null);
RDebugUtils.currentLine=42074115;
 //BA.debugLineNum = 42074115;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.daftar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="daftar";
RDebugUtils.currentLine=41811968;
 //BA.debugLineNum = 41811968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=41811969;
 //BA.debugLineNum = 41811969;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=41811970;
 //BA.debugLineNum = 41811970;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=41811971;
 //BA.debugLineNum = 41811971;BA.debugLine="Private btnAdmin As Button";
_btnadmin = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=41811972;
 //BA.debugLineNum = 41811972;BA.debugLine="Private btnPengunjung As Button";
_btnpengunjung = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=41811973;
 //BA.debugLineNum = 41811973;BA.debugLine="Private btnKembali As Label";
_btnkembali = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=41811974;
 //BA.debugLineNum = 41811974;BA.debugLine="End Sub";
return "";
}
}