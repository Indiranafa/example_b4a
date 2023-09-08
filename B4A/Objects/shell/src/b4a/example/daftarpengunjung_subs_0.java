package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class daftarpengunjung_subs_0 {


public static RemoteObject  _animasi(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("animasi (daftarpengunjung) ","daftarpengunjung",6,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("animasi")) { return __ref.runUserSub(false, "daftarpengunjung","animasi", __ref);}
 BA.debugLineNum = 19;BA.debugLine="Sub animasi";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root.Left = 100%x";
Debug.ShouldStop(524288);
__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"setLeft",daftarpengunjung.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")));
 BA.debugLineNum = 21;BA.debugLine="Root.SetLayoutAnimated(300,0,0,Root.Width,Root.He";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("B4XPage_Created (daftarpengunjung) ","daftarpengunjung",6,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "daftarpengunjung","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 12;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="Root = Root1";
Debug.ShouldStop(4096);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 14;BA.debugLine="Root.LoadLayout(\"Registrasi\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Registrasi")),__ref.getField(false, "ba"));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
daftarpengunjung._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",daftarpengunjung._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
daftarpengunjung._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",daftarpengunjung._xui);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (daftarpengunjung) ","daftarpengunjung",6,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "daftarpengunjung","initialize", __ref, _ba);}
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
}