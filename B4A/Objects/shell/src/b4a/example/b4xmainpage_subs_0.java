package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _animasi(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("animasi (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("animasi")) { return __ref.runUserSub(false, "b4xmainpage","animasi", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Sub animasi";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Root.Left = 100%x";
Debug.ShouldStop(524288);
__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"setLeft",b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")));
 BA.debugLineNum = 53;BA.debugLine="Root.SetLayoutAnimated(300,0,0,Root.Width,Root.He";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 28;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Root = Root1";
Debug.ShouldStop(268435456);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 30;BA.debugLine="Root.LoadLayout(\"Login\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Login")),__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="txtUserName.Text = \"\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtusername" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 33;BA.debugLine="txtPassword.Text = \"\"";
Debug.ShouldStop(1);
__ref.getField(false,"_txtpassword" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 34;BA.debugLine="txtUserName.Color = Colors.Transparent";
Debug.ShouldStop(2);
__ref.getField(false,"_txtusername" /*RemoteObject*/ ).runVoidMethod ("setColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 35;BA.debugLine="txtPassword.Color = Colors.Transparent";
Debug.ShouldStop(4);
__ref.getField(false,"_txtpassword" /*RemoteObject*/ ).runVoidMethod ("setColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 37;BA.debugLine="pageHome.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_pagehome" /*RemoteObject*/ ).runClassMethod (b4a.example.home.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="B4XPages.AddPage(\"pageHome1\", pageHome)";
Debug.ShouldStop(32);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("pageHome1")),(Object)((__ref.getField(false,"_pagehome" /*RemoteObject*/ ))));
 BA.debugLineNum = 40;BA.debugLine="pageDaftar.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_pagedaftar" /*RemoteObject*/ ).runClassMethod (b4a.example.daftar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 41;BA.debugLine="B4XPages.AddPage(\"pageDaftar1\", pageDaftar)";
Debug.ShouldStop(256);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("pageDaftar1")),(Object)((__ref.getField(false,"_pagedaftar" /*RemoteObject*/ ))));
 BA.debugLineNum = 43;BA.debugLine="pageDaftarAdmin.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_pagedaftaradmin" /*RemoteObject*/ ).runClassMethod (b4a.example.daftaradmin.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 44;BA.debugLine="B4XPages.AddPage(\"pageDaftarAdmin1\", pageDaftarAd";
Debug.ShouldStop(2048);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("pageDaftarAdmin1")),(Object)((__ref.getField(false,"_pagedaftaradmin" /*RemoteObject*/ ))));
 BA.debugLineNum = 46;BA.debugLine="pageDaftarPengunjung.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_pagedaftarpengunjung" /*RemoteObject*/ ).runClassMethod (b4a.example.daftarpengunjung.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 47;BA.debugLine="B4XPages.AddPage(\"pageDaftarPengunjung1\", pageDaf";
Debug.ShouldStop(16384);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("pageDaftarPengunjung1")),(Object)((__ref.getField(false,"_pagedaftarpengunjung" /*RemoteObject*/ ))));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnLogin_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("btnlogin_click")) { return __ref.runUserSub(false, "b4xmainpage","btnlogin_click", __ref);}
 BA.debugLineNum = 110;BA.debugLine="Private Sub btnLogin_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 112;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private txtUserName As EditText";
b4xmainpage._txtusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtusername",b4xmainpage._txtusername);
 //BA.debugLineNum = 12;BA.debugLine="Private txtPassword As EditText";
b4xmainpage._txtpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtpassword",b4xmainpage._txtpassword);
 //BA.debugLineNum = 13;BA.debugLine="Private lblForgot As Label";
b4xmainpage._lblforgot = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblforgot",b4xmainpage._lblforgot);
 //BA.debugLineNum = 14;BA.debugLine="Private btnLogin As Button";
b4xmainpage._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnlogin",b4xmainpage._btnlogin);
 //BA.debugLineNum = 15;BA.debugLine="Private lblDaftar As Label";
b4xmainpage._lbldaftar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldaftar",b4xmainpage._lbldaftar);
 //BA.debugLineNum = 16;BA.debugLine="Dim pageHome As Home";
b4xmainpage._pagehome = RemoteObject.createNew ("b4a.example.home");__ref.setField("_pagehome",b4xmainpage._pagehome);
 //BA.debugLineNum = 17;BA.debugLine="Dim pageDaftar As Daftar";
b4xmainpage._pagedaftar = RemoteObject.createNew ("b4a.example.daftar");__ref.setField("_pagedaftar",b4xmainpage._pagedaftar);
 //BA.debugLineNum = 18;BA.debugLine="Dim pageDaftarAdmin As DaftarAdmin";
b4xmainpage._pagedaftaradmin = RemoteObject.createNew ("b4a.example.daftaradmin");__ref.setField("_pagedaftaradmin",b4xmainpage._pagedaftaradmin);
 //BA.debugLineNum = 19;BA.debugLine="Dim pageDaftarPengunjung As DaftarPengunjung";
b4xmainpage._pagedaftarpengunjung = RemoteObject.createNew ("b4a.example.daftarpengunjung");__ref.setField("_pagedaftarpengunjung",b4xmainpage._pagedaftarpengunjung);
 //BA.debugLineNum = 20;BA.debugLine="Dim requestjob As HttpJob";
b4xmainpage._requestjob = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_requestjob",b4xmainpage._requestjob);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _daftar(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("daftar (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("daftar")) { return __ref.runUserSub(false, "b4xmainpage","daftar", __ref);}
 BA.debugLineNum = 105;BA.debugLine="Sub daftar";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="B4XPages.ShowPage(\"pageDaftar1\")";
Debug.ShouldStop(512);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pageDaftar1")));
 BA.debugLineNum = 107;BA.debugLine="pageDaftar.animasi";
Debug.ShouldStop(1024);
__ref.getField(false,"_pagedaftar" /*RemoteObject*/ ).runClassMethod (b4a.example.daftar.class, "_animasi" /*RemoteObject*/ );
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _daftaradmin1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DaftarAdmin1 (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("daftaradmin1")) { return __ref.runUserSub(false, "b4xmainpage","daftaradmin1", __ref);}
 BA.debugLineNum = 118;BA.debugLine="Sub DaftarAdmin1";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="B4XPages.ShowPage(\"pageDaftarAdmin1\")";
Debug.ShouldStop(4194304);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pageDaftarAdmin1")));
 BA.debugLineNum = 120;BA.debugLine="pageDaftarAdmin.animasi";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pagedaftaradmin" /*RemoteObject*/ ).runClassMethod (b4a.example.daftaradmin.class, "_animasi" /*RemoteObject*/ );
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _daftarpengunjung1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DaftarPengunjung1 (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("daftarpengunjung1")) { return __ref.runUserSub(false, "b4xmainpage","daftarpengunjung1", __ref);}
 BA.debugLineNum = 123;BA.debugLine="Sub DaftarPengunjung1";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="B4XPages.ShowPage(\"pageDaftarPengunjung1\")";
Debug.ShouldStop(134217728);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pageDaftarPengunjung1")));
 BA.debugLineNum = 125;BA.debugLine="pageDaftarPengunjung.animasi";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pagedaftarpengunjung" /*RemoteObject*/ ).runClassMethod (b4a.example.daftarpengunjung.class, "_animasi" /*RemoteObject*/ );
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("jobdone")) { return __ref.runUserSub(false, "b4xmainpage","jobdone", __ref, _job);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _jroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coljroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _level = RemoteObject.createImmutable("");
RemoteObject _username = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 64;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4xmainpage.__c.getField(true,"True"))) { 
 BA.debugLineNum = 66;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(2);
b4xmainpage.__c.runVoidMethod ("LogImpl","241484290",_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 68;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("requestjob"))) {
case 0: {
 BA.debugLineNum = 70;BA.debugLine="If Job.GetString = \"Not Found\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("Not Found"))) { 
 BA.debugLineNum = 71;BA.debugLine="txtUserName.Text = \"\"";
Debug.ShouldStop(64);
__ref.getField(false,"_txtusername" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 72;BA.debugLine="txtPassword.Text = \"\"";
Debug.ShouldStop(128);
__ref.getField(false,"_txtpassword" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 73;BA.debugLine="ToastMessageShow(Job.GetString,True)";
Debug.ShouldStop(256);
b4xmainpage.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ ))),(Object)(b4xmainpage.__c.getField(true,"True")));
 BA.debugLineNum = 74;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
b4xmainpage.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 76;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 77;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 78;BA.debugLine="Dim jRoot As List = parser.NextArray";
Debug.ShouldStop(8192);
_jroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_jroot = _parser.runMethod(false,"NextArray");Debug.locals.put("jRoot", _jroot);Debug.locals.put("jRoot", _jroot);
 BA.debugLineNum = 79;BA.debugLine="For Each coljRoot As Map In jRoot";
Debug.ShouldStop(16384);
_coljroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group14 = _jroot;
final int groupLen14 = group14.runMethod(true,"getSize").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_coljroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group14.runMethod(false,"Get",index14));Debug.locals.put("coljRoot", _coljroot);
Debug.locals.put("coljRoot", _coljroot);
 BA.debugLineNum = 80;BA.debugLine="Dim id As String = coljRoot.Get(\"id\")";
Debug.ShouldStop(32768);
_id = BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 81;BA.debugLine="Dim level As String = coljRoot.Get(\"level\")";
Debug.ShouldStop(65536);
_level = BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("level")))));Debug.locals.put("level", _level);Debug.locals.put("level", _level);
 BA.debugLineNum = 82;BA.debugLine="Dim username As String = coljRoot.Get(\"userna";
Debug.ShouldStop(131072);
_username = BA.ObjectToString(_coljroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 83;BA.debugLine="Main.id_user = id";
Debug.ShouldStop(262144);
b4xmainpage._main._id_user /*RemoteObject*/  = _id;
 BA.debugLineNum = 84;BA.debugLine="Main.level_user = level";
Debug.ShouldStop(524288);
b4xmainpage._main._level_user /*RemoteObject*/  = _level;
 BA.debugLineNum = 85;BA.debugLine="B4XPages.ShowPage(\"pageHome1\")";
Debug.ShouldStop(1048576);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pageHome1")));
 BA.debugLineNum = 86;BA.debugLine="pageHome.animasi";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pagehome" /*RemoteObject*/ ).runClassMethod (b4a.example.home.class, "_animasi" /*RemoteObject*/ );
 }
}Debug.locals.put("coljRoot", _coljroot);
;
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 93;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(268435456);
b4xmainpage.__c.runVoidMethod ("LogImpl","241484317",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 94;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage,";
Debug.ShouldStop(536870912);
b4xmainpage.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(b4xmainpage.__c.getField(true,"True")));
 };
 BA.debugLineNum = 96;BA.debugLine="Job.Release";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbldaftar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblDaftar_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("lbldaftar_click")) { return __ref.runUserSub(false, "b4xmainpage","lbldaftar_click", __ref);}
 BA.debugLineNum = 114;BA.debugLine="Private Sub lblDaftar_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="daftar";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_daftar" /*RemoteObject*/ );
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblforgot_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblForgot_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("lblforgot_click")) { return __ref.runUserSub(false, "b4xmainpage","lblforgot_click", __ref);}
 BA.debugLineNum = 101;BA.debugLine="Private Sub lblForgot_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _proseslogin(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("proseslogin (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("proseslogin")) { return __ref.runUserSub(false, "b4xmainpage","proseslogin", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Sub proseslogin";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="requestjob.Initialize(\"requestjob\",Me)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_requestjob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("requestjob")),(Object)(__ref));
 BA.debugLineNum = 58;BA.debugLine="requestjob.PostString(Main.IPServer & \"tr_data.ph";
Debug.ShouldStop(33554432);
__ref.getField(false,"_requestjob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4xmainpage._main._ipserver /*RemoteObject*/ ,RemoteObject.createImmutable("tr_data.php"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("tipe=login"),RemoteObject.createImmutable("&txtUserName="),__ref.getField(false,"_txtusername" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("&txtPassword="),__ref.getField(false,"_txtpassword" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 61;BA.debugLine="ProgressDialogShow(\"Proses Login...\")";
Debug.ShouldStop(268435456);
b4xmainpage.__c.runVoidMethod ("ProgressDialogShow",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Proses Login..."))));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}