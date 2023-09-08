package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class daftar_subs_0 {


public static RemoteObject  _animasi(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("animasi (daftar) ","daftar",2,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("animasi")) { return __ref.runUserSub(false, "daftar","animasi", __ref);}
 BA.debugLineNum = 22;BA.debugLine="Sub animasi";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Root.Left = 100%x";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"setLeft",daftar.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")));
 BA.debugLineNum = 24;BA.debugLine="Root.SetLayoutAnimated(300,0,0,Root.Width,Root.He";
Debug.ShouldStop(8388608);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (daftar) ","daftar",2,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "daftar","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Root = Root1";
Debug.ShouldStop(32768);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 17;BA.debugLine="Root.LoadLayout(\"Daftar\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Daftar")),__ref.getField(false, "ba"));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnadmin_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnAdmin_Click (daftar) ","daftar",2,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("btnadmin_click")) { return __ref.runUserSub(false, "daftar","btnadmin_click", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Private Sub btnAdmin_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(4);
daftar._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 36;BA.debugLine="B4XPages.MainPage.DaftarAdmin1";
Debug.ShouldStop(8);
daftar._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).runClassMethod (b4a.example.b4xmainpage.class, "_daftaradmin1" /*RemoteObject*/ );
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnkembali_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnKembali_Click (daftar) ","daftar",2,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("btnkembali_click")) { return __ref.runUserSub(false, "daftar","btnkembali_click", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Private Sub btnKembali_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(128);
daftar._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 41;BA.debugLine="B4XPages.MainPage.animasi";
Debug.ShouldStop(256);
daftar._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).runClassMethod (b4a.example.b4xmainpage.class, "_animasi" /*RemoteObject*/ );
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpengunjung_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnPengunjung_Click (daftar) ","daftar",2,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("btnpengunjung_click")) { return __ref.runUserSub(false, "daftar","btnpengunjung_click", __ref);}
 BA.debugLineNum = 29;BA.debugLine="Private Sub btnPengunjung_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(536870912);
daftar._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 31;BA.debugLine="B4XPages.MainPage.DaftarPengunjung1";
Debug.ShouldStop(1073741824);
daftar._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).runClassMethod (b4a.example.b4xmainpage.class, "_daftarpengunjung1" /*RemoteObject*/ );
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
daftar._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",daftar._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
daftar._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",daftar._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private btnAdmin As Button";
daftar._btnadmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnadmin",daftar._btnadmin);
 //BA.debugLineNum = 5;BA.debugLine="Private btnPengunjung As Button";
daftar._btnpengunjung = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnpengunjung",daftar._btnpengunjung);
 //BA.debugLineNum = 6;BA.debugLine="Private btnKembali As Label";
daftar._btnkembali = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_btnkembali",daftar._btnkembali);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (daftar) ","daftar",2,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "daftar","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Return Me";
Debug.ShouldStop(1024);
if (true) return __ref;
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}