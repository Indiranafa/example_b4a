package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_actionbarhomeclick() throws Exception{
try {
		Debug.PushSubsStack("Activity_ActionBarHomeClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,38);
if (RapidSub.canDelegate("activity_actionbarhomeclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_actionbarhomeclick");}
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_ActionBarHomeClick";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="ActionBarHomeClicked = True";
Debug.ShouldStop(64);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 40;BA.debugLine="B4XPages.Delegate.Activity_ActionBarHomeClick";
Debug.ShouldStop(128);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.b4xpagesdelegator.class, "_activity_actionbarhomeclick" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="ActionBarHomeClicked = False";
Debug.ShouldStop(256);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"False");
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
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _pm = RemoteObject.declareNull("b4a.example.b4xpagesmanager");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Dim pm As B4XPagesManager";
Debug.ShouldStop(1073741824);
_pm = RemoteObject.createNew ("b4a.example.b4xpagesmanager");Debug.locals.put("pm", _pm);
 BA.debugLineNum = 32;BA.debugLine="pm.Initialize(Activity)";
Debug.ShouldStop(-2147483648);
_pm.runClassMethod (b4a.example.b4xpagesmanager.class, "_initialize" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._activity));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Return B4XPages.Delegate.Activity_KeyPress(KeyCod";
Debug.ShouldStop(4096);
if (true) return main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.b4xpagesdelegator.class, "_activity_keypress" /*RemoteObject*/ ,(Object)(_keycode));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="B4XPages.Delegate.Activity_Pause";
Debug.ShouldStop(1048576);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.b4xpagesdelegator.class, "_activity_pause" /*RemoteObject*/ );
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
public static RemoteObject  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("Activity_PermissionResult (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,56);
if (RapidSub.canDelegate("activity_permissionresult")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_permissionresult", _permission, _result);}
Debug.locals.put("Permission", _permission);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 56;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="B4XPages.Delegate.Activity_PermissionResult(Permi";
Debug.ShouldStop(16777216);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.b4xpagesdelegator.class, "_activity_permissionresult" /*RemoteObject*/ ,(Object)(_permission),(Object)(_result));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="B4XPages.Delegate.Activity_Resume";
Debug.ShouldStop(65536);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.b4xpagesdelegator.class, "_activity_resume" /*RemoteObject*/ );
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _create_menu(RemoteObject _menu) throws Exception{
try {
		Debug.PushSubsStack("Create_Menu (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,60);
if (RapidSub.canDelegate("create_menu")) { return b4a.example.main.remoteMe.runUserSub(false, "main","create_menu", _menu);}
Debug.locals.put("Menu", _menu);
 BA.debugLineNum = 60;BA.debugLine="Sub Create_Menu (Menu As Object)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="B4XPages.Delegate.Create_Menu(Menu)";
Debug.ShouldStop(268435456);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.b4xpagesdelegator.class, "_create_menu" /*RemoteObject*/ ,(Object)(_menu));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private txtUserName As EditText";
main.mostCurrent._txtusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btnLogin As Button";
main.mostCurrent._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblDaftar As Label";
main.mostCurrent._lbldaftar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
b4xpages_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
httputils2service_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
b4xmainpage.myClass = BA.getDeviceClass ("b4a.example.b4xmainpage");
daftar.myClass = BA.getDeviceClass ("b4a.example.daftar");
home.myClass = BA.getDeviceClass ("b4a.example.home");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
daftaradmin.myClass = BA.getDeviceClass ("b4a.example.daftaradmin");
daftarpengunjung.myClass = BA.getDeviceClass ("b4a.example.daftarpengunjung");
astabmenu.myClass = BA.getDeviceClass ("b4a.example.astabmenu");
b4xdrawer.myClass = BA.getDeviceClass ("b4a.example.b4xdrawer");
b4xpages.myClass = BA.getDeviceClass ("b4a.example.b4xpages");
b4xbitset.myClass = BA.getDeviceClass ("b4a.example.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4a.example.b4xbytesbuilder");
b4xcache.myClass = BA.getDeviceClass ("b4a.example.b4xcache");
b4xcollections.myClass = BA.getDeviceClass ("b4a.example.b4xcollections");
b4xcomparatorsort.myClass = BA.getDeviceClass ("b4a.example.b4xcomparatorsort");
b4xorderedmap.myClass = BA.getDeviceClass ("b4a.example.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4a.example.b4xset");
b4xpagesdelegator.myClass = BA.getDeviceClass ("b4a.example.b4xpagesdelegator");
b4xpagesmanager.myClass = BA.getDeviceClass ("b4a.example.b4xpagesmanager");
httputils2service.myClass = BA.getDeviceClass ("b4a.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.example.httpjob");
animatedcounter.myClass = BA.getDeviceClass ("b4a.example.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4a.example.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4a.example.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4a.example.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4a.example.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4a.example.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4a.example.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4a.example.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("b4a.example.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4a.example.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4a.example.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4a.example.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4a.example.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("b4a.example.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4a.example.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4a.example.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4a.example.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4a.example.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("b4a.example.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("b4a.example.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4a.example.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4a.example.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("b4a.example.xuiviewsutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Public ActionBarHomeClicked As Boolean";
main._actionbarhomeclicked = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 19;BA.debugLine="Dim IPServer As String = \"https://serverhost1.my.";
main._ipserver = BA.ObjectToString("https://serverhost1.my.id/");
 //BA.debugLineNum = 20;BA.debugLine="Dim id_user As String";
main._id_user = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="Dim level_user As String";
main._level_user = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}