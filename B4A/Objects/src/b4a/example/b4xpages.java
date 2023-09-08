package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpages {
private static b4xpages mostCurrent = new b4xpages();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static Object _mpm = null;
public static b4a.example.b4xpagesdelegator _delegate = null;
public static Object _globalcontext = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _addpage(anywheresoftware.b4a.BA _ba,String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addpage", true))
	 {return ((String) Debug.delegate(null, "addpage", new Object[] {_ba,_id,_b4xpage}));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="GetManager.AddPage(Id, B4XPage)";
_getmanager(_ba)._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="End Sub";
return "";
}
public static String  _showpage(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "showpage", true))
	 {return ((String) Debug.delegate(null, "showpage", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="GetManager.ShowPage(Id)";
_getmanager(_ba)._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="End Sub";
return "";
}
public static String  _closepage(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "closepage", true))
	 {return ((String) Debug.delegate(null, "closepage", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="GetManager.ClosePage (B4XPage)";
_getmanager(_ba)._closepage /*String*/ (null,_b4xpage);
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="End Sub";
return "";
}
public static b4a.example.b4xmainpage  _mainpage(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "mainpage", true))
	 {return ((b4a.example.b4xmainpage) Debug.delegate(null, "mainpage", new Object[] {_ba}));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Public Sub MainPage As B4XMainPage";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Return GetManager.MainPage";
if (true) return _getmanager(_ba)._mainpage /*b4a.example.b4xmainpage*/ ;
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xpagesmanager._b4amenuitem  _addmenuitem(anywheresoftware.b4a.BA _ba,Object _b4xpage,Object _title) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addmenuitem", true))
	 {return ((b4a.example.b4xpagesmanager._b4amenuitem) Debug.delegate(null, "addmenuitem", new Object[] {_ba,_b4xpage,_title}));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub AddMenuItem(B4XPage As Object, Title As";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Return GetManager.AddMenuItem(B4XPage, Title)";
if (true) return _getmanager(_ba)._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (null,_b4xpage,_title);
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xpagesmanager  _getmanager(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getmanager", true))
	 {return ((b4a.example.b4xpagesmanager) Debug.delegate(null, "getmanager", new Object[] {_ba}));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub GetManager As B4XPagesManager";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Return mPM";
if (true) return (b4a.example.b4xpagesmanager)(_mpm);
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return null;
}
public static String  _addpageandcreate(anywheresoftware.b4a.BA _ba,String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addpageandcreate", true))
	 {return ((String) Debug.delegate(null, "addpageandcreate", new Object[] {_ba,_id,_b4xpage}));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="GetManager.AddPageAndCreate(Id, B4XPage)";
_getmanager(_ba)._addpageandcreate /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.ActivityWrapper  _getnativeparent(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getnativeparent", true))
	 {return ((anywheresoftware.b4a.objects.ActivityWrapper) Debug.delegate(null, "getnativeparent", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Public Sub GetNativeParent (B4XPage As Object) As";
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Pare";
if (true) return _getmanager(_ba)._findpifromb4xpage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ ;
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="End Sub";
return null;
}
public static Object  _getpage(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getpage", true))
	 {return ((Object) Debug.delegate(null, "getpage", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Return GetManager.GetPage(Id)";
if (true) return _getmanager(_ba)._getpage /*Object*/ (null,_id);
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="End Sub";
return null;
}
public static String  _getpageid(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getpageid", true))
	 {return ((String) Debug.delegate(null, "getpageid", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub GetPageId (B4XPage As Object) As String";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Id";
if (true) return _getmanager(_ba)._findpifromb4xpage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Id /*String*/ ;
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="End Sub";
return "";
}
public static String  _internalsetpagesmanager(anywheresoftware.b4a.BA _ba,Object _pm) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "internalsetpagesmanager", true))
	 {return ((String) Debug.delegate(null, "internalsetpagesmanager", new Object[] {_ba,_pm}));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub InternalSetPagesManager(PM As Object)";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Delegate.Initialize";
_delegate._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="mPM = PM";
_mpm = _pm;
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="End Sub";
return "";
}
public static boolean  _isinitialized(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "isinitialized", true))
	 {return ((Boolean) Debug.delegate(null, "isinitialized", new Object[] {_ba}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub IsInitialized As Boolean";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Return mPM Is B4XPagesManager";
if (true) return _mpm instanceof b4a.example.b4xpagesmanager;
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="End Sub";
return false;
}
public static String  _settitle(anywheresoftware.b4a.BA _ba,Object _b4xpage,Object _title) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "settitle", true))
	 {return ((String) Debug.delegate(null, "settitle", new Object[] {_ba,_b4xpage,_title}));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="GetManager.SetTitle(B4XPage, Title)";
_getmanager(_ba)._settitle /*String*/ (null,_b4xpage,_title);
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="End Sub";
return "";
}
public static String  _showpageandremovepreviouspages(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(null, "showpageandremovepreviouspages", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="GetManager.ShowPageAndRemovePreviousPages (Id)";
_getmanager(_ba)._showpageandremovepreviouspages /*String*/ (null,_id);
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="End Sub";
return "";
}
}