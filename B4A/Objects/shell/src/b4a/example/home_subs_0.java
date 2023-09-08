package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class home_subs_0 {


public static RemoteObject  _admin1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("admin1 (home) ","home",3,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("admin1")) { return __ref.runUserSub(false, "home","admin1", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Sub admin1";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Root.LoadLayout(\"Home\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Home")),__ref.getField(false, "ba"));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animasi(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("animasi (home) ","home",3,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("animasi")) { return __ref.runUserSub(false, "home","animasi", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Sub animasi";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Root.Left = 100%x";
Debug.ShouldStop(67108864);
__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"setLeft",home.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")));
 BA.debugLineNum = 28;BA.debugLine="Root.SetLayoutAnimated(300,0,0,Root.Width,Root.He";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (home) ","home",3,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "home","b4xpage_appear", __ref);}
 BA.debugLineNum = 18;BA.debugLine="Sub B4XPage_Appear";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="If Main.level_user <> \"Pengunjung\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",home._main._level_user /*RemoteObject*/ ,BA.ObjectToString("Pengunjung"))) { 
 BA.debugLineNum = 20;BA.debugLine="admin1";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.home.class, "_admin1" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 22;BA.debugLine="pengunjung1";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.home.class, "_pengunjung1" /*RemoteObject*/ );
 };
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("B4XPage_Created (home) ","home",3,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "home","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 12;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="Root = Root1";
Debug.ShouldStop(4096);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
home._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",home._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
home._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",home._xui);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (home) ","home",3,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "home","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="Return Me";
Debug.ShouldStop(128);
if (true) return __ref;
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pengunjung1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pengunjung1 (home) ","home",3,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("pengunjung1")) { return __ref.runUserSub(false, "home","pengunjung1", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Sub pengunjung1";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Root.LoadLayout(\"Home\")";
Debug.ShouldStop(16);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Home")),__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}