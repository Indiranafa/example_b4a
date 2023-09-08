package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpagesmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xpagesmanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xpagesmanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xpageparent{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.ActivityWrapper NativeType;
public anywheresoftware.b4a.objects.collections.List MenuItems;
public void Initialize() {
IsInitialized = true;
NativeType = new anywheresoftware.b4a.objects.ActivityWrapper();
MenuItems = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _b4amenuitem{
public boolean IsInitialized;
public Object Title;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper Bitmap;
public String Tag;
public boolean AddToBar;
public anywheresoftware.b4j.object.JavaObject NativeMenuItem;
public void Initialize() {
IsInitialized = true;
Title = new Object();
Bitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
Tag = "";
AddToBar = false;
NativeMenuItem = new anywheresoftware.b4j.object.JavaObject();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _b4xpageinfo{
public boolean IsInitialized;
public Object B4XPage;
public String Id;
public boolean Created;
public Object Title;
public anywheresoftware.b4a.objects.B4XViewWrapper Root;
public boolean IsFirst;
public b4a.example.b4xpagesmanager._b4xpageparent Parent;
public void Initialize() {
IsInitialized = true;
B4XPage = new Object();
Id = "";
Created = false;
Title = new Object();
Root = new anywheresoftware.b4a.objects.B4XViewWrapper();
IsFirst = false;
Parent = new b4a.example.b4xpagesmanager._b4xpageparent();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.b4xorderedmap _idtob4xpage = null;
public b4a.example.b4xorderedmap _rootb4xtopage = null;
public anywheresoftware.b4j.object.JavaObject _context = null;
public b4a.example.b4xset _mstackofpageids = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ActivityWrapper _mmainform = null;
public boolean _showupindicator = false;
public anywheresoftware.b4j.object.JavaObject _actionbar = null;
public boolean _isforeground = false;
public int _transitionanimationduration = 0;
public b4a.example.b4xmainpage _mainpage = null;
public String _stackstring = "";
public boolean _logevents = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.example.b4xpagesmanager __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _module = null;
boolean _nonmainpagewasadded = false;
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Public Sub Initialize (Activity As Activity)";
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="IdToB4XPage.Initialize";
__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="RootB4XToPage.Initialize";
__ref._rootb4xtopage /*b4a.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="mStackOfPageIds.Initialize";
__ref._mstackofpageids /*b4a.example.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="Context.InitializeContext";
__ref._context /*anywheresoftware.b4j.object.JavaObject*/ .InitializeContext(ba);
RDebugUtils.currentLine=14811147;
 //BA.debugLineNum = 14811147;BA.debugLine="mMainForm = Activity";
__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activity;
RDebugUtils.currentLine=14811148;
 //BA.debugLineNum = 14811148;BA.debugLine="CheckMainActivityOrientations";
__ref._checkmainactivityorientations /*String*/ (null);
RDebugUtils.currentLine=14811149;
 //BA.debugLineNum = 14811149;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=14811150;
 //BA.debugLineNum = 14811150;BA.debugLine="Dim module As JavaObject";
_module = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=14811151;
 //BA.debugLineNum = 14811151;BA.debugLine="module.InitializeStatic(jo.RunMethodJO(\"getActivi";
_module.InitializeStatic(BA.ObjectToString(_jo.RunMethodJO("getActivityBA",(Object[])(__c.Null)).GetField("className"))).SetField("dontPause",(Object)(__c.True));
RDebugUtils.currentLine=14811155;
 //BA.debugLineNum = 14811155;BA.debugLine="B4XPages.InternalSetPagesManager(Me)";
_b4xpages._internalsetpagesmanager /*String*/ (ba,this);
RDebugUtils.currentLine=14811156;
 //BA.debugLineNum = 14811156;BA.debugLine="MainPage.Initialize";
__ref._mainpage /*b4a.example.b4xmainpage*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14811157;
 //BA.debugLineNum = 14811157;BA.debugLine="Dim NonMainPageWasAdded As Boolean = IdToB4XPage.";
_nonmainpagewasadded = __ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._getsize /*int*/ (null)>0;
RDebugUtils.currentLine=14811158;
 //BA.debugLineNum = 14811158;BA.debugLine="IdToB4XPage.Put(\"~~~~~temp~~~~\", CreateB4XPageInf";
__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)("~~~~~temp~~~~"),(Object)(__ref._createb4xpageinfo /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,(Object)(__ref._mainpage /*b4a.example.b4xmainpage*/ ),"",__c.False,(Object)(""))));
RDebugUtils.currentLine=14811159;
 //BA.debugLineNum = 14811159;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=14811160;
 //BA.debugLineNum = 14811160;BA.debugLine="IdToB4XPage.Remove(\"~~~~~temp~~~~\")";
__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._remove /*String*/ (null,(Object)("~~~~~temp~~~~"));
RDebugUtils.currentLine=14811161;
 //BA.debugLineNum = 14811161;BA.debugLine="AddPageAndCreate(\"MainPage\", MainPage)";
__ref._addpageandcreate /*String*/ (null,"MainPage",(Object)(__ref._mainpage /*b4a.example.b4xmainpage*/ ));
RDebugUtils.currentLine=14811162;
 //BA.debugLineNum = 14811162;BA.debugLine="If LogEvents = False Then";
if (__ref._logevents /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=14811163;
 //BA.debugLineNum = 14811163;BA.debugLine="Log(\"Call B4XPages.GetManager.LogEvents = True t";
__c.LogImpl("914811163","Call B4XPages.GetManager.LogEvents = True to enable logging B4XPages events.",0);
 };
RDebugUtils.currentLine=14811165;
 //BA.debugLineNum = 14811165;BA.debugLine="If NonMainPageWasAdded Then";
if (_nonmainpagewasadded) { 
RDebugUtils.currentLine=14811166;
 //BA.debugLineNum = 14811166;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=14811167;
 //BA.debugLineNum = 14811167;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=14811170;
 //BA.debugLineNum = 14811170;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4amenuitem  _addmenuitem(b4a.example.b4xpagesmanager __ref,Object _b4xpage,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addmenuitem", true))
	 {return ((b4a.example.b4xpagesmanager._b4amenuitem) Debug.delegate(ba, "addmenuitem", new Object[] {_b4xpage,_title}));}
b4a.example.b4xpagesmanager._b4amenuitem _mi = null;
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Public Sub AddMenuItem (B4XPage As Object, Title A";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="Dim mi As B4AMenuItem";
_mi = new b4a.example.b4xpagesmanager._b4amenuitem();
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="mi.Initialize";
_mi.Initialize();
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="mi.Title = Title";
_mi.Title /*Object*/  = _title;
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="mi.Tag = Title";
_mi.Tag /*String*/  = BA.ObjectToString(_title);
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="FindPIFromB4XPage(B4XPage).Parent.MenuItems.Add(m";
__ref._findpifromb4xpage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_mi));
RDebugUtils.currentLine=16187398;
 //BA.debugLineNum = 16187398;BA.debugLine="Return mi";
if (true) return _mi;
RDebugUtils.currentLine=16187399;
 //BA.debugLineNum = 16187399;BA.debugLine="End Sub";
return null;
}
public String  _addpage(b4a.example.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_id,_b4xpage}));}
String _idtolower = "";
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Dim IdToLower As String = Id.ToLowerCase";
_idtolower = _id.toLowerCase();
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="If IdToB4XPage.ContainsKey(IdToLower) Then";
if (__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_idtolower))) { 
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="Log($\"Page with this id already exists: ${IdToLo";
__c.LogImpl("915007747",("Page with this id already exists: "+__c.SmartStringFormatter("",(Object)(_idtolower))+"!"),0);
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="IdToB4XPage.Put(IdToLower, CreateB4XPageInfo(B4XP";
__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_idtolower),(Object)(__ref._createb4xpageinfo /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage,_idtolower,__c.False,(Object)(_id))));
RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="If IdToB4XPage.Size = 1 Then ShowPage(IdToLower)";
if (__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._getsize /*int*/ (null)==1) { 
__ref._showpage /*String*/ (null,_idtolower);};
RDebugUtils.currentLine=15007752;
 //BA.debugLineNum = 15007752;BA.debugLine="End Sub";
return "";
}
public String  _addpageandcreate(b4a.example.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpageandcreate", true))
	 {return ((String) Debug.delegate(ba, "addpageandcreate", new Object[] {_id,_b4xpage}));}
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="AddPage (Id, B4XPage)";
__ref._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="CreatePageIfNeeded(GetPageFromId(Id))";
__ref._createpageifneeded /*String*/ (null,__ref._getpagefromid /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_id));
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="End Sub";
return "";
}
public String  _closepage(b4a.example.b4xpagesmanager __ref,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepage", true))
	 {return ((String) Debug.delegate(ba, "closepage", new Object[] {_b4xpage}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
boolean _isclosingtoppage = false;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) = False Then R";
if (__ref._mstackofpageids /*b4a.example.b4xset*/ ._contains /*boolean*/ (null,(Object)(_pi.Id /*String*/ ))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="If xui.IsB4i And GetTopPage <> pi Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && (__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi) == false) { 
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="Log(\"Only top page can be closed\")";
__c.LogImpl("915269892","Only top page can be closed",0);
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="Else If xui.IsB4i And mStackOfPageIds.Size = 1 Th";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && __ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)==1) { 
RDebugUtils.currentLine=15269895;
 //BA.debugLineNum = 15269895;BA.debugLine="Log(\"First page cannot be closed\")";
__c.LogImpl("915269895","First page cannot be closed",0);
RDebugUtils.currentLine=15269896;
 //BA.debugLineNum = 15269896;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=15269898;
 //BA.debugLineNum = 15269898;BA.debugLine="Dim IsClosingTopPage As Boolean = GetTopPage = pi";
_isclosingtoppage = (__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi);
RDebugUtils.currentLine=15269899;
 //BA.debugLineNum = 15269899;BA.debugLine="ClosePageImpl(pi)";
__ref._closepageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=15269900;
 //BA.debugLineNum = 15269900;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=15269901;
 //BA.debugLineNum = 15269901;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
 };
RDebugUtils.currentLine=15269903;
 //BA.debugLineNum = 15269903;BA.debugLine="If xui.IsB4A And mStackOfPageIds.Size = 1 Then Re";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && __ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)==1) { 
if (true) return "";};
RDebugUtils.currentLine=15269904;
 //BA.debugLineNum = 15269904;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4a.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=15269905;
 //BA.debugLineNum = 15269905;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=15269906;
 //BA.debugLineNum = 15269906;BA.debugLine="If xui.IsB4A Then ShowPageImpl(GetTopPage)";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._showpageimpl /*String*/ (null,__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null));};
RDebugUtils.currentLine=15269907;
 //BA.debugLineNum = 15269907;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
 };
RDebugUtils.currentLine=15269909;
 //BA.debugLineNum = 15269909;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4xpageinfo  _findpifromb4xpage(b4a.example.b4xpagesmanager __ref,Object _page) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "findpifromb4xpage", true))
	 {return ((b4a.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "findpifromb4xpage", new Object[] {_page}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Public Sub FindPIFromB4XPage (Page As Object) As B";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (b4a.example.b4xpagesmanager._b4xpageinfo)(group1.Get(index1));
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="If pi.B4XPage = Page Then";
if ((_pi.B4XPage /*Object*/ ).equals(_page)) { 
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="Return pi";
if (true) return _pi;
 };
 }
};
RDebugUtils.currentLine=15466502;
 //BA.debugLineNum = 15466502;BA.debugLine="Return Null";
if (true) return (b4a.example.b4xpagesmanager._b4xpageinfo)(__c.Null);
RDebugUtils.currentLine=15466503;
 //BA.debugLineNum = 15466503;BA.debugLine="End Sub";
return null;
}
public Object  _getpage(b4a.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpage", true))
	 {return ((Object) Debug.delegate(ba, "getpage", new Object[] {_id}));}
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="Return GetPageFromId(Id).B4XPage";
if (true) return __ref._getpagefromid /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_id).B4XPage /*Object*/ ;
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="End Sub";
return null;
}
public String  _settitle(b4a.example.b4xpagesmanager __ref,Object _b4xpage,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_b4xpage,_title}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="pi.Parent.NativeType.Title = Title";
_pi.Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ .setTitle(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="End Sub";
return "";
}
public String  _showpage(b4a.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpage", true))
	 {return ((String) Debug.delegate(ba, "showpage", new Object[] {_id}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
b4a.example.b4xpagesmanager._b4xpageinfo _top = null;
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="If pi = GetTopPage Then Return";
if ((_pi).equals(__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null))) { 
if (true) return "";};
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="Dim Top As B4XPageInfo = GetTopPage";
_top = __ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="If Top <> Null Then";
if (_top!= null) { 
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="Top.Root.RemoveViewFromParent";
_top.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=15138834;
 //BA.debugLineNum = 15138834;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4a.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=15138835;
 //BA.debugLineNum = 15138835;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=15138836;
 //BA.debugLineNum = 15138836;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4a.example.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=15138837;
 //BA.debugLineNum = 15138837;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=15138838;
 //BA.debugLineNum = 15138838;BA.debugLine="End Sub";
return "";
}
public String  _showpageandremovepreviouspages(b4a.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(ba, "showpageandremovepreviouspages", new Object[] {_id}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
b4a.example.b4xpagesmanager._b4xpageinfo _pagetoremove = null;
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="If GetTopPage = Null Then";
if (__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null)== null) { 
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="ShowPage(Id)";
__ref._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="For Each Id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._mstackofpageids /*b4a.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_id = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="Dim PageToRemove As B4XPageInfo = GetPageFromId(";
_pagetoremove = __ref._getpagefromid /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=15204366;
 //BA.debugLineNum = 15204366;BA.debugLine="PageToRemove.Root.RemoveViewFromParent";
_pagetoremove.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 }
};
RDebugUtils.currentLine=15204373;
 //BA.debugLineNum = 15204373;BA.debugLine="mStackOfPageIds.Clear";
__ref._mstackofpageids /*b4a.example.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=15204374;
 //BA.debugLineNum = 15204374;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4a.example.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=15204375;
 //BA.debugLineNum = 15204375;BA.debugLine="If xui.IsB4A Or xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=15204376;
 //BA.debugLineNum = 15204376;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
 };
RDebugUtils.currentLine=15204378;
 //BA.debugLineNum = 15204378;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=15204379;
 //BA.debugLineNum = 15204379;BA.debugLine="End Sub";
return "";
}
public String  _activity_actionbarhomeclick(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_actionbarhomeclick", true))
	 {return ((String) Debug.delegate(ba, "activity_actionbarhomeclick", null));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Public Sub Activity_ActionBarHomeClick";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="If pi <> Null Then";
if (_pi!= null) { 
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="If CloseRequestExists (pi) Then";
if (__ref._closerequestexists /*boolean*/ (null,_pi)) { 
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="HandleCloseRequest(pi)";
__ref._handlecloserequest /*void*/ (null,_pi);
 }else {
RDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 };
 };
RDebugUtils.currentLine=14942217;
 //BA.debugLineNum = 14942217;BA.debugLine="End Sub";
return "";
}
public boolean  _activity_keypress(b4a.example.b4xpagesmanager __ref,int _keycode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_keypress", true))
	 {return ((Boolean) Debug.delegate(ba, "activity_keypress", new Object[] {_keycode}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Public Sub Activity_KeyPress (KeyCode As Int) As B";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==__c.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="If CloseRequestExists(pi) Then";
if (__ref._closerequestexists /*boolean*/ (null,_pi)) { 
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="HandleCloseRequest(pi)";
__ref._handlecloserequest /*void*/ (null,_pi);
 }else {
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 };
RDebugUtils.currentLine=16121864;
 //BA.debugLineNum = 16121864;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=16121866;
 //BA.debugLineNum = 16121866;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=16121867;
 //BA.debugLineNum = 16121867;BA.debugLine="End Sub";
return false;
}
public String  _activity_pause(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Public Sub Activity_Pause";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="RaiseEventWithResult(GetTopPage, \"B4XPage_Disappe";
__ref._raiseeventwithresult /*Object*/ (null,__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Disappear",(Object[])(__c.Null));
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="BackgroundStateChanged(False)";
__ref._backgroundstatechanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="End Sub";
return "";
}
public String  _raiseevent(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "raiseevent", true))
	 {return ((String) Debug.delegate(ba, "raiseevent", new Object[] {_targetpage,_subname,_params}));}
int _length = 0;
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Public Sub RaiseEvent (TargetPage As B4XPageInfo,";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="If TargetPage = Null Then Return";
if (_targetpage== null) { 
if (true) return "";};
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=16515077;
 //BA.debugLineNum = 16515077;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=16515078;
 //BA.debugLineNum = 16515078;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=16515080;
 //BA.debugLineNum = 16515080;BA.debugLine="CallSubDelayed(TargetPage.B4XPage, SubName)";
__c.CallSubDelayed(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=16515082;
 //BA.debugLineNum = 16515082;BA.debugLine="CallSubDelayed2(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=16515084;
 //BA.debugLineNum = 16515084;BA.debugLine="CallSubDelayed3(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=16515086;
 //BA.debugLineNum = 16515086;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("916515086","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=16515088;
 //BA.debugLineNum = 16515088;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4xpageinfo  _gettoppage(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "gettoppage", true))
	 {return ((b4a.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "gettoppage", null));}
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Public Sub GetTopPage As B4XPageInfo";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="If mStackOfPageIds.Size = 0 Then Return Null";
if (__ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)==0) { 
if (true) return (b4a.example.b4xpagesmanager._b4xpageinfo)(__c.Null);};
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="Return IdToB4XPage.Get(mStackOfPageIds.AsList.Get";
if (true) return (b4a.example.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._get /*Object*/ (null,__ref._mstackofpageids /*b4a.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (__ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)-1))));
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="End Sub";
return null;
}
public String  _activity_resume(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_resume", true))
	 {return ((String) Debug.delegate(ba, "activity_resume", null));}
boolean _shouldraise = false;
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Public Sub Activity_Resume";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Dim ShouldRaise As Boolean = IsForeground = False";
_shouldraise = __ref._isforeground /*boolean*/ ==__c.False;
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="If ShouldRaise Then";
if (_shouldraise) { 
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
RDebugUtils.currentLine=16842758;
 //BA.debugLineNum = 16842758;BA.debugLine="End Sub";
return "";
}
public String  _createmenu(b4a.example.b4xpagesmanager __ref,Object _menu) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createmenu", true))
	 {return ((String) Debug.delegate(ba, "createmenu", new Object[] {_menu}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
b4a.example.b4xpagesmanager._b4amenuitem _mi = null;
anywheresoftware.b4j.object.JavaObject _nativemenuitem = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;
anywheresoftware.b4j.object.JavaObject _listener = null;
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Public Sub CreateMenu (Menu As Object)";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="Dim jo As JavaObject = Menu";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_menu));
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="For Each mi As B4AMenuItem In pi.Parent.MenuItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _pi.Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_mi = (b4a.example.b4xpagesmanager._b4amenuitem)(group4.Get(index4));
RDebugUtils.currentLine=16318469;
 //BA.debugLineNum = 16318469;BA.debugLine="Dim NativeMenuItem As JavaObject = jo.RunMethod(";
_nativemenuitem = new anywheresoftware.b4j.object.JavaObject();
_nativemenuitem = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("add",new Object[]{_mi.Title /*Object*/ })));
RDebugUtils.currentLine=16318470;
 //BA.debugLineNum = 16318470;BA.debugLine="If mi.Bitmap.IsInitialized Then";
if (_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=16318471;
 //BA.debugLineNum = 16318471;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=16318472;
 //BA.debugLineNum = 16318472;BA.debugLine="bd.Initialize(mi.Bitmap)";
_bd.Initialize((android.graphics.Bitmap)(_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=16318473;
 //BA.debugLineNum = 16318473;BA.debugLine="NativeMenuItem.RunMethod(\"setIcon\", Array(bd))";
_nativemenuitem.RunMethod("setIcon",new Object[]{(Object)(_bd.getObject())});
 };
RDebugUtils.currentLine=16318475;
 //BA.debugLineNum = 16318475;BA.debugLine="If mi.AddToBar Then";
if (_mi.AddToBar /*boolean*/ ) { 
RDebugUtils.currentLine=16318476;
 //BA.debugLineNum = 16318476;BA.debugLine="NativeMenuItem.RunMethod(\"setShowAsAction\", Arr";
_nativemenuitem.RunMethod("setShowAsAction",new Object[]{(Object)(1)});
 };
RDebugUtils.currentLine=16318478;
 //BA.debugLineNum = 16318478;BA.debugLine="Dim listener As JavaObject";
_listener = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=16318479;
 //BA.debugLineNum = 16318479;BA.debugLine="listener.InitializeNewInstance(Application.Packa";
_listener.InitializeNewInstance(__c.Application.getPackageName()+".b4xpagesmanager$PagesMenuListener",new Object[]{_pi.B4XPage /*Object*/ ,(Object)(_mi.Tag /*String*/ )});
RDebugUtils.currentLine=16318480;
 //BA.debugLineNum = 16318480;BA.debugLine="NativeMenuItem.RunMethod(\"setOnMenuItemClickList";
_nativemenuitem.RunMethod("setOnMenuItemClickListener",new Object[]{(Object)(_listener.getObject())});
 }
};
RDebugUtils.currentLine=16318482;
 //BA.debugLineNum = 16318482;BA.debugLine="End Sub";
return "";
}
public String  _mainform_resize(b4a.example.b4xpagesmanager __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_resize", true))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
int _w = 0;
int _h = 0;
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Dim w As Int = Width";
_w = (int) (_width);
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="Dim h As Int = Height";
_h = (int) (_height);
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
__ref._raiseevent /*String*/ (null,__ref._getpageinfofromroot /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)))),"B4XPage_Resize",new Object[]{(Object)(_w),(Object)(_h)});
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="End Sub";
return "";
}
public boolean  _closerequestexists(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closerequestexists", true))
	 {return ((Boolean) Debug.delegate(ba, "closerequestexists", new Object[] {_pi}));}
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Private Sub CloseRequestExists (pi As B4XPageInfo)";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="Return xui.SubExists(pi.B4XPage, \"B4XPage_CloseRe";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest",(int) (0));
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="End Sub";
return false;
}
public void  _handlecloserequest(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "handlecloserequest", true))
	 {Debug.delegate(ba, "handlecloserequest", new Object[] {_pi}); return;}
ResumableSub_HandleCloseRequest rsub = new ResumableSub_HandleCloseRequest(this,__ref,_pi);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleCloseRequest extends BA.ResumableSub {
public ResumableSub_HandleCloseRequest(b4a.example.b4xpagesmanager parent,b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) {
this.parent = parent;
this.__ref = __ref;
this._pi = _pi;
this.__ref = parent;
}
b4a.example.b4xpagesmanager __ref;
b4a.example.b4xpagesmanager parent;
b4a.example.b4xpagesmanager._b4xpageinfo _pi;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _shouldclose = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xpagesmanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="LogEvent(pi, \"B4XPage_CloseRequest\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_CloseRequest");
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="Dim rs As ResumableSub = CallSub(pi.B4XPage, \"B4X";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), (anywheresoftware.b4a.BA.ResumableSub)(parent.__c.CallSubDebug(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest")));
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="Wait For (rs) Complete (ShouldClose As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xpagesmanager", "handlecloserequest"), _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_shouldclose = (Boolean) result[1];
;
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="If ShouldClose Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_shouldclose) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=16449541;
 //BA.debugLineNum = 16449541;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=16449543;
 //BA.debugLineNum = 16449543;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object  _raiseeventwithresult(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "raiseeventwithresult", true))
	 {return ((Object) Debug.delegate(ba, "raiseeventwithresult", new Object[] {_targetpage,_subname,_params}));}
int _length = 0;
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Public Sub RaiseEventWithResult (TargetPage As B4X";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="If TargetPage = Null Then Return Null";
if (_targetpage== null) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=16580613;
 //BA.debugLineNum = 16580613;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=16580616;
 //BA.debugLineNum = 16580616;BA.debugLine="Return CallSub(TargetPage.B4XPage, SubName)";
if (true) return __c.CallSubNew(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=16580618;
 //BA.debugLineNum = 16580618;BA.debugLine="Return CallSub2(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=16580620;
 //BA.debugLineNum = 16580620;BA.debugLine="Return CallSub3(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=16580622;
 //BA.debugLineNum = 16580622;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("916580622","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=16580624;
 //BA.debugLineNum = 16580624;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=16580625;
 //BA.debugLineNum = 16580625;BA.debugLine="End Sub";
return null;
}
public String  _backgroundstatechanged(b4a.example.b4xpagesmanager __ref,boolean _newstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "backgroundstatechanged", true))
	 {return ((String) Debug.delegate(ba, "backgroundstatechanged", new Object[] {_newstate}));}
String _ev = "";
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Private Sub BackgroundStateChanged (NewState As Bo";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="If IsForeground = NewState Then Return";
if (__ref._isforeground /*boolean*/ ==_newstate) { 
if (true) return "";};
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="IsForeground = NewState";
__ref._isforeground /*boolean*/  = _newstate;
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="Dim ev As String";
_ev = "";
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="If IsForeground Then ev = \"B4XPage_Foreground\" El";
if (__ref._isforeground /*boolean*/ ) { 
_ev = "B4XPage_Foreground";}
else {
_ev = "B4XPage_Background";};
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pi = (b4a.example.b4xpagesmanager._b4xpageinfo)(group5.Get(index5));
RDebugUtils.currentLine=16908294;
 //BA.debugLineNum = 16908294;BA.debugLine="If xui.SubExists(pi.B4XPage, ev, 0) Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,_ev,(int) (0))) { 
RDebugUtils.currentLine=16908295;
 //BA.debugLineNum = 16908295;BA.debugLine="LogEvent(pi, ev)";
__ref._logevent /*String*/ (null,_pi,_ev);
RDebugUtils.currentLine=16908296;
 //BA.debugLineNum = 16908296;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=16908297;
 //BA.debugLineNum = 16908297;BA.debugLine="CallSubDelayed(pi.B4XPage, ev)";
__c.CallSubDelayed(ba,_pi.B4XPage /*Object*/ ,_ev);
 }else {
RDebugUtils.currentLine=16908299;
 //BA.debugLineNum = 16908299;BA.debugLine="CallSub(pi.B4XPage, ev)";
__c.CallSubNew(ba,_pi.B4XPage /*Object*/ ,_ev);
 };
 };
 }
};
RDebugUtils.currentLine=16908303;
 //BA.debugLineNum = 16908303;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4xpageinfo  _createb4xpageinfo(b4a.example.b4xpagesmanager __ref,Object _b4xpage,String _id,boolean _created,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageinfo", true))
	 {return ((b4a.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "createb4xpageinfo", new Object[] {_b4xpage,_id,_created,_title}));}
b4a.example.b4xpagesmanager._b4xpageinfo _t1 = null;
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Private Sub CreateB4XPageInfo (B4XPage As Object,";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="Dim t1 As B4XPageInfo";
_t1 = new b4a.example.b4xpagesmanager._b4xpageinfo();
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="t1.B4XPage = B4XPage";
_t1.B4XPage /*Object*/  = _b4xpage;
RDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="t1.Id = Id";
_t1.Id /*String*/  = _id;
RDebugUtils.currentLine=16056325;
 //BA.debugLineNum = 16056325;BA.debugLine="t1.Created = Created";
_t1.Created /*boolean*/  = _created;
RDebugUtils.currentLine=16056326;
 //BA.debugLineNum = 16056326;BA.debugLine="t1.Title = Title";
_t1.Title /*Object*/  = _title;
RDebugUtils.currentLine=16056327;
 //BA.debugLineNum = 16056327;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=16056328;
 //BA.debugLineNum = 16056328;BA.debugLine="End Sub";
return null;
}
public String  _createpageifneeded(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageifneeded", true))
	 {return ((String) Debug.delegate(ba, "createpageifneeded", new Object[] {_pi}));}
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Private Sub CreatePageIfNeeded(pi As B4XPageInfo)";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="If pi.Created Then Return";
if (_pi.Created /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="pi.IsFirst = IdToB4XPage.Size = 1";
_pi.IsFirst /*boolean*/  = __ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._getsize /*int*/ (null)==1;
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="CreatePageImpl (pi)";
__ref._createpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="pi.Created = True";
_pi.Created /*boolean*/  = __c.True;
RDebugUtils.currentLine=15663109;
 //BA.debugLineNum = 15663109;BA.debugLine="RootB4XToPage.Put(pi.Root, pi)";
__ref._rootb4xtopage /*b4a.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_pi));
RDebugUtils.currentLine=15663110;
 //BA.debugLineNum = 15663110;BA.debugLine="LogEvent(pi, \"B4XPage_Created\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_Created");
RDebugUtils.currentLine=15663111;
 //BA.debugLineNum = 15663111;BA.debugLine="CallSub2(pi.B4XPage, \"B4XPage_Created\", pi.root)";
__c.CallSubDebug2(ba,_pi.B4XPage /*Object*/ ,"B4XPage_Created",(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ));
RDebugUtils.currentLine=15663113;
 //BA.debugLineNum = 15663113;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4xpageinfo  _getpagefromid(b4a.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpagefromid", true))
	 {return ((b4a.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpagefromid", new Object[] {_id}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Private Sub GetPageFromId (id As String) As B4XPag";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="Dim pi As B4XPageInfo = IdToB4XPage.Get(id.ToLowe";
_pi = (b4a.example.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_id.toLowerCase())));
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="If pi = Null Then";
if (_pi== null) { 
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="Log(\"Error: page id not found: \" & id)";
__c.LogImpl("915925251","Error: page id not found: "+_id,0);
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="Log(\"Ids: \" & IdToB4XPage.Keys) 'ignore";
__c.LogImpl("915925252","Ids: "+BA.ObjectToString(__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null)),0);
 };
RDebugUtils.currentLine=15925254;
 //BA.debugLineNum = 15925254;BA.debugLine="Return pi";
if (true) return _pi;
RDebugUtils.currentLine=15925255;
 //BA.debugLineNum = 15925255;BA.debugLine="End Sub";
return null;
}
public String  _logevent(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi,String _ev) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "logevent", true))
	 {return ((String) Debug.delegate(ba, "logevent", new Object[] {_pi,_ev}));}
String _msg = "";
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Private Sub LogEvent (pi As B4XPageInfo, ev As Str";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="If LogEvents Then";
if (__ref._logevents /*boolean*/ ) { 
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="Dim msg As String = $\"*** ${pi.Id}: ${ev} ${Stac";
_msg = ("*** "+__c.SmartStringFormatter("",(Object)(_pi.Id /*String*/ ))+": "+__c.SmartStringFormatter("",(Object)(_ev))+" "+__c.SmartStringFormatter("",(Object)(__ref._stackstring /*String*/ ))+"");
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="Log(msg)";
__c.LogImpl("917039363",_msg,0);
 };
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="End Sub";
return "";
}
public String  _checkmainactivityorientations(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "checkmainactivityorientations", true))
	 {return ((String) Debug.delegate(ba, "checkmainactivityorientations", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _jme = null;
boolean _isappcompat = false;
anywheresoftware.b4j.object.JavaObject _pi = null;
Object[] _activities = null;
anywheresoftware.b4j.object.JavaObject _act = null;
String _name = "";
int _screenorientation = 0;
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Private Sub CheckMainActivityOrientations";
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="ActionBar = jo.RunMethod(\"getActionBar\", Null)";
__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getActionBar",(Object[])(__c.Null))));
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="If ActionBar.IsInitialized = False Then";
if (__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="Dim jme As JavaObject = Me";
_jme = new anywheresoftware.b4j.object.JavaObject();
_jme = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=14876680;
 //BA.debugLineNum = 14876680;BA.debugLine="Dim IsAppCompat As Boolean = jme.RunMethod(\"chec";
_isappcompat = BA.ObjectToBoolean(_jme.RunMethod("checkIfAppCompat",new Object[]{(Object)(_jo.getObject())}));
RDebugUtils.currentLine=14876681;
 //BA.debugLineNum = 14876681;BA.debugLine="If IsAppCompat Then";
if (_isappcompat) { 
RDebugUtils.currentLine=14876682;
 //BA.debugLineNum = 14876682;BA.debugLine="ActionBar = jo.RunMethod(\"getSupportActionBar\",";
__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getSupportActionBar",(Object[])(__c.Null))));
 };
 };
RDebugUtils.currentLine=14876686;
 //BA.debugLineNum = 14876686;BA.debugLine="Dim pi As JavaObject = jo.RunMethodJO(\"getPackage";
_pi = new anywheresoftware.b4j.object.JavaObject();
_pi = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethodJO("getPackageManager",(Object[])(__c.Null)).RunMethod("getPackageInfo",new Object[]{(Object)(__c.Application.getPackageName()),(Object)(1)})));
RDebugUtils.currentLine=14876687;
 //BA.debugLineNum = 14876687;BA.debugLine="Dim activities() As Object = pi.GetField(\"activit";
_activities = (Object[])(_pi.GetField("activities"));
RDebugUtils.currentLine=14876688;
 //BA.debugLineNum = 14876688;BA.debugLine="For Each Act As JavaObject In activities";
_act = new anywheresoftware.b4j.object.JavaObject();
{
final Object[] group13 = _activities;
final int groupLen13 = group13.length
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_act = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group13[index13]));
RDebugUtils.currentLine=14876689;
 //BA.debugLineNum = 14876689;BA.debugLine="Dim name As String = Act.GetField(\"name\")";
_name = BA.ObjectToString(_act.GetField("name"));
RDebugUtils.currentLine=14876690;
 //BA.debugLineNum = 14876690;BA.debugLine="If name.EndsWith(\".main\") Then";
if (_name.endsWith(".main")) { 
RDebugUtils.currentLine=14876691;
 //BA.debugLineNum = 14876691;BA.debugLine="Dim screenOrientation As Int = Act.GetField(\"sc";
_screenorientation = (int)(BA.ObjectToNumber(_act.GetField("screenOrientation")));
RDebugUtils.currentLine=14876692;
 //BA.debugLineNum = 14876692;BA.debugLine="If screenOrientation = -1 Then";
if (_screenorientation==-1) { 
RDebugUtils.currentLine=14876693;
 //BA.debugLineNum = 14876693;BA.debugLine="LogColor(\"#SupportedOrientations attribute mus";
__c.LogImpl("914876693","#SupportedOrientations attribute must be set to landscape or portrait.",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
 };
 };
 }
};
RDebugUtils.currentLine=14876697;
 //BA.debugLineNum = 14876697;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Private IdToB4XPage As B4XOrderedMap";
_idtob4xpage = new b4a.example.b4xorderedmap();
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="Private RootB4XToPage As B4XOrderedMap";
_rootb4xtopage = new b4a.example.b4xorderedmap();
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="Private Context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="Type B4XPageParent (NativeType As Activity, MenuI";
;
RDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="Type B4AMenuItem (Title As Object, Bitmap As B4XB";
;
RDebugUtils.currentLine=14745612;
 //BA.debugLineNum = 14745612;BA.debugLine="Type B4XPageInfo (B4XPage As Object, Id As String";
;
RDebugUtils.currentLine=14745616;
 //BA.debugLineNum = 14745616;BA.debugLine="Public mStackOfPageIds As B4XSet";
_mstackofpageids = new b4a.example.b4xset();
RDebugUtils.currentLine=14745617;
 //BA.debugLineNum = 14745617;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=14745621;
 //BA.debugLineNum = 14745621;BA.debugLine="Private mMainForm As Activity";
_mmainform = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=14745622;
 //BA.debugLineNum = 14745622;BA.debugLine="Public ShowUpIndicator As Boolean = True";
_showupindicator = __c.True;
RDebugUtils.currentLine=14745623;
 //BA.debugLineNum = 14745623;BA.debugLine="Public ActionBar As JavaObject";
_actionbar = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=14745627;
 //BA.debugLineNum = 14745627;BA.debugLine="Public IsForeground As Boolean";
_isforeground = false;
RDebugUtils.currentLine=14745628;
 //BA.debugLineNum = 14745628;BA.debugLine="Public TransitionAnimationDuration As Int = 100";
_transitionanimationduration = (int) (100);
RDebugUtils.currentLine=14745629;
 //BA.debugLineNum = 14745629;BA.debugLine="Public MainPage As B4XMainPage";
_mainpage = new b4a.example.b4xmainpage();
RDebugUtils.currentLine=14745630;
 //BA.debugLineNum = 14745630;BA.debugLine="Private StackString As String";
_stackstring = "";
RDebugUtils.currentLine=14745631;
 //BA.debugLineNum = 14745631;BA.debugLine="Public LogEvents As Boolean = False";
_logevents = __c.False;
RDebugUtils.currentLine=14745632;
 //BA.debugLineNum = 14745632;BA.debugLine="End Sub";
return "";
}
public String  _closepageimpl(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepageimpl", true))
	 {return ((String) Debug.delegate(ba, "closepageimpl", new Object[] {_pi}));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Private Sub ClosePageImpl (pi As B4XPageInfo) 'ign";
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="If mStackOfPageIds.Size = 1 Then";
if (__ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)==1) { 
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="i.Initialize(i.ACTION_MAIN, \"\")";
_i.Initialize(_i.ACTION_MAIN,"");
RDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="i.AddCategory(\"android.intent.category.HOME\")";
_i.AddCategory("android.intent.category.HOME");
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="i.Flags = 0x10000000";
_i.setFlags(((int)0x10000000));
RDebugUtils.currentLine=15532039;
 //BA.debugLineNum = 15532039;BA.debugLine="StartActivity(i)";
__c.StartActivity(ba,(Object)(_i.getObject()));
 }else {
RDebugUtils.currentLine=15532041;
 //BA.debugLineNum = 15532041;BA.debugLine="pi.Root.RemoveViewFromParent";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=15532048;
 //BA.debugLineNum = 15532048;BA.debugLine="End Sub";
return "";
}
public String  _toppagedisappear(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppagedisappear", true))
	 {return ((String) Debug.delegate(ba, "toppagedisappear", null));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Private Sub TopPageDisappear";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="If xui.IsB4J Then Return";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
if (true) return "";};
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", N";
__ref._raiseeventwithresult /*Object*/ (null,_pi,"B4XPage_Disappear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=15335433;
 //BA.debugLineNum = 15335433;BA.debugLine="End Sub";
return "";
}
public String  _showpageimpl(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageimpl", true))
	 {return ((String) Debug.delegate(ba, "showpageimpl", new Object[] {_pi}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Private Sub ShowPageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="If pi.Root.Parent.IsInitialized Then pi.Root.Remo";
if (_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=15597575;
 //BA.debugLineNum = 15597575;BA.debugLine="Dim pnl As Panel = pi.Root";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=15597576;
 //BA.debugLineNum = 15597576;BA.debugLine="If TransitionAnimationDuration > 0 Then";
if (__ref._transitionanimationduration /*int*/ >0) { 
RDebugUtils.currentLine=15597577;
 //BA.debugLineNum = 15597577;BA.debugLine="mMainForm.AddView(pnl, 0, 0, 20dip, 20dip)";
__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=15597578;
 //BA.debugLineNum = 15597578;BA.debugLine="pnl.SetLayoutAnimated(TransitionAnimationDuratio";
_pnl.SetLayoutAnimated(__ref._transitionanimationduration /*int*/ ,(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 }else {
RDebugUtils.currentLine=15597580;
 //BA.debugLineNum = 15597580;BA.debugLine="mMainForm.AddView(pnl, 0, 0, 100%x, 100%y)";
__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
RDebugUtils.currentLine=15597585;
 //BA.debugLineNum = 15597585;BA.debugLine="End Sub";
return "";
}
public String  _toppageappear(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppageappear", true))
	 {return ((String) Debug.delegate(ba, "toppageappear", null));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Private Sub TopPageAppear";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
_pi.Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ .setTitle(BA.ObjectToCharSequence(_pi.Title /*Object*/ ));
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,_pi,"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=15400970;
 //BA.debugLineNum = 15400970;BA.debugLine="If ShowUpIndicator And ActionBar.IsInitialized Th";
if (__ref._showupindicator /*boolean*/  && __ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .IsInitialized()) { 
RDebugUtils.currentLine=15400971;
 //BA.debugLineNum = 15400971;BA.debugLine="ActionBar.RunMethod(\"setDisplayHomeAsUpEnabled\",";
__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDisplayHomeAsUpEnabled",new Object[]{(Object)(__ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)>1)});
 };
RDebugUtils.currentLine=15400973;
 //BA.debugLineNum = 15400973;BA.debugLine="UpdateMenuItems";
__ref._updatemenuitems /*String*/ (null);
RDebugUtils.currentLine=15400975;
 //BA.debugLineNum = 15400975;BA.debugLine="UpdateStackString";
__ref._updatestackstring /*String*/ (null);
RDebugUtils.currentLine=15400976;
 //BA.debugLineNum = 15400976;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4xpageparent  _createb4xpageparent(b4a.example.b4xpagesmanager __ref,Object _nativetype) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageparent", true))
	 {return ((b4a.example.b4xpagesmanager._b4xpageparent) Debug.delegate(ba, "createb4xpageparent", new Object[] {_nativetype}));}
b4a.example.b4xpagesmanager._b4xpageparent _t1 = null;
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Private Sub CreateB4XPageParent (NativeType As Obj";
RDebugUtils.currentLine=16777222;
 //BA.debugLineNum = 16777222;BA.debugLine="Dim t1 As B4XPageParent";
_t1 = new b4a.example.b4xpagesmanager._b4xpageparent();
RDebugUtils.currentLine=16777223;
 //BA.debugLineNum = 16777223;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=16777224;
 //BA.debugLineNum = 16777224;BA.debugLine="t1.NativeType = NativeType";
_t1.NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/  = (anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_nativetype));
RDebugUtils.currentLine=16777225;
 //BA.debugLineNum = 16777225;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=16777226;
 //BA.debugLineNum = 16777226;BA.debugLine="End Sub";
return null;
}
public String  _createpageimpl(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageimpl", true))
	 {return ((String) Debug.delegate(ba, "createpageimpl", new Object[] {_pi}));}
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Private Sub CreatePageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=15794188;
 //BA.debugLineNum = 15794188;BA.debugLine="pi.Root = xui.CreatePanel(\"root\")";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"root");
RDebugUtils.currentLine=15794189;
 //BA.debugLineNum = 15794189;BA.debugLine="pi.root.SetLayoutAnimated(0, 0, 0, 100%x, 100%y)";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=15794190;
 //BA.debugLineNum = 15794190;BA.debugLine="pi.Parent = CreateB4XPageParent(mMainForm)";
_pi.Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/  = __ref._createb4xpageparent /*b4a.example.b4xpagesmanager._b4xpageparent*/ (null,(Object)(__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/ .getObject()));
RDebugUtils.currentLine=15794191;
 //BA.debugLineNum = 15794191;BA.debugLine="pi.Parent.MenuItems.Initialize";
_pi.Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=15794199;
 //BA.debugLineNum = 15794199;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4xpageinfo  _getpageinfofromroot(b4a.example.b4xpagesmanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpageinfofromroot", true))
	 {return ((b4a.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpageinfofromroot", new Object[] {_root}));}
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Public Sub GetPageInfoFromRoot (Root As B4XView) A";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="Return RootB4XToPage.Get(Root)";
if (true) return (b4a.example.b4xpagesmanager._b4xpageinfo)(__ref._rootb4xtopage /*b4a.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_root.getObject())));
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="End Sub";
return null;
}
public String  _updatemenuitems(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "updatemenuitems", true))
	 {return ((String) Debug.delegate(ba, "updatemenuitems", null));}
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Private Sub UpdateMenuItems";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="Context.RunMethod(\"invalidateOptionsMenu\", Null)";
__ref._context /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("invalidateOptionsMenu",(Object[])(__c.Null));
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="End Sub";
return "";
}
public String  _updatestackstring(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "updatestackstring", true))
	 {return ((String) Debug.delegate(ba, "updatestackstring", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _id = "";
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Public Sub UpdateStackString";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="sb.Append(\"[\")";
_sb.Append("[");
RDebugUtils.currentLine=17104900;
 //BA.debugLineNum = 17104900;BA.debugLine="If mStackOfPageIds.Size > 0 Then";
if (__ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)>0) { 
RDebugUtils.currentLine=17104901;
 //BA.debugLineNum = 17104901;BA.debugLine="For Each id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._mstackofpageids /*b4a.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_id = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=17104902;
 //BA.debugLineNum = 17104902;BA.debugLine="sb.Append(id).Append(\", \")";
_sb.Append(_id).Append(", ");
 }
};
RDebugUtils.currentLine=17104904;
 //BA.debugLineNum = 17104904;BA.debugLine="sb.Remove(sb.Length - 2, sb.Length)";
_sb.Remove((int) (_sb.getLength()-2),_sb.getLength());
 };
RDebugUtils.currentLine=17104906;
 //BA.debugLineNum = 17104906;BA.debugLine="sb.Append(\"]\")";
_sb.Append("]");
RDebugUtils.currentLine=17104907;
 //BA.debugLineNum = 17104907;BA.debugLine="StackString = sb.ToString";
__ref._stackstring /*String*/  = _sb.ToString();
RDebugUtils.currentLine=17104908;
 //BA.debugLineNum = 17104908;BA.debugLine="End Sub";
return "";
}
public boolean checkIfAppCompat(android.app.Activity act) {
	return act.getClass().getSuperclass().getName().equals("androidx.appcompat.app.AppCompatActivity");
}
public static class PagesMenuListener implements android.view.MenuItem.OnMenuItemClickListener {
	private B4AClass target;
	private String tag;
	public PagesMenuListener(B4AClass target, String tag) {
		this.target = target;
		this.tag = tag;
	}
 	public boolean onMenuItemClick(android.view.MenuItem item) {
		target.getBA().raiseEventFromUI(null, "b4xpage_menuclick", tag);
		return true;
	}
}
}