package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpassword = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblforgot = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldaftar = null;
public b4a.example.home _pagehome = null;
public b4a.example.daftar _pagedaftar = null;
public b4a.example.daftaradmin _pagedaftaradmin = null;
public b4a.example.daftarpengunjung _pagedaftarpengunjung = null;
public b4a.example.httpjob _requestjob = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _animasi(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "animasi", false))
	 {return ((String) Debug.delegate(ba, "animasi", null));}
RDebugUtils.currentLine=41353216;
 //BA.debugLineNum = 41353216;BA.debugLine="Sub animasi";
RDebugUtils.currentLine=41353217;
 //BA.debugLineNum = 41353217;BA.debugLine="Root.Left = 100%x";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__c.PerXToCurrent((float) (100),ba));
RDebugUtils.currentLine=41353218;
 //BA.debugLineNum = 41353218;BA.debugLine="Root.SetLayoutAnimated(300,0,0,Root.Width,Root.He";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (300),(int) (0),(int) (0),__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=41353219;
 //BA.debugLineNum = 41353219;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=41287680;
 //BA.debugLineNum = 41287680;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=41287681;
 //BA.debugLineNum = 41287681;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=41287682;
 //BA.debugLineNum = 41287682;BA.debugLine="Root.LoadLayout(\"Login\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Login",ba);
RDebugUtils.currentLine=41287684;
 //BA.debugLineNum = 41287684;BA.debugLine="txtUserName.Text = \"\"";
__ref._txtusername /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=41287685;
 //BA.debugLineNum = 41287685;BA.debugLine="txtPassword.Text = \"\"";
__ref._txtpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=41287686;
 //BA.debugLineNum = 41287686;BA.debugLine="txtUserName.Color = Colors.Transparent";
__ref._txtusername /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=41287687;
 //BA.debugLineNum = 41287687;BA.debugLine="txtPassword.Color = Colors.Transparent";
__ref._txtpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=41287689;
 //BA.debugLineNum = 41287689;BA.debugLine="pageHome.Initialize";
__ref._pagehome /*b4a.example.home*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=41287690;
 //BA.debugLineNum = 41287690;BA.debugLine="B4XPages.AddPage(\"pageHome1\", pageHome)";
_b4xpages._addpage /*String*/ (ba,"pageHome1",(Object)(__ref._pagehome /*b4a.example.home*/ ));
RDebugUtils.currentLine=41287692;
 //BA.debugLineNum = 41287692;BA.debugLine="pageDaftar.Initialize";
__ref._pagedaftar /*b4a.example.daftar*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=41287693;
 //BA.debugLineNum = 41287693;BA.debugLine="B4XPages.AddPage(\"pageDaftar1\", pageDaftar)";
_b4xpages._addpage /*String*/ (ba,"pageDaftar1",(Object)(__ref._pagedaftar /*b4a.example.daftar*/ ));
RDebugUtils.currentLine=41287695;
 //BA.debugLineNum = 41287695;BA.debugLine="pageDaftarAdmin.Initialize";
__ref._pagedaftaradmin /*b4a.example.daftaradmin*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=41287696;
 //BA.debugLineNum = 41287696;BA.debugLine="B4XPages.AddPage(\"pageDaftarAdmin1\", pageDaftarAd";
_b4xpages._addpage /*String*/ (ba,"pageDaftarAdmin1",(Object)(__ref._pagedaftaradmin /*b4a.example.daftaradmin*/ ));
RDebugUtils.currentLine=41287698;
 //BA.debugLineNum = 41287698;BA.debugLine="pageDaftarPengunjung.Initialize";
__ref._pagedaftarpengunjung /*b4a.example.daftarpengunjung*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=41287699;
 //BA.debugLineNum = 41287699;BA.debugLine="B4XPages.AddPage(\"pageDaftarPengunjung1\", pageDaf";
_b4xpages._addpage /*String*/ (ba,"pageDaftarPengunjung1",(Object)(__ref._pagedaftarpengunjung /*b4a.example.daftarpengunjung*/ ));
RDebugUtils.currentLine=41287701;
 //BA.debugLineNum = 41287701;BA.debugLine="End Sub";
return "";
}
public String  _btnlogin_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnlogin_click", false))
	 {return ((String) Debug.delegate(ba, "btnlogin_click", null));}
RDebugUtils.currentLine=41680896;
 //BA.debugLineNum = 41680896;BA.debugLine="Private Sub btnLogin_Click";
RDebugUtils.currentLine=41680898;
 //BA.debugLineNum = 41680898;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=41156608;
 //BA.debugLineNum = 41156608;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=41156609;
 //BA.debugLineNum = 41156609;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=41156610;
 //BA.debugLineNum = 41156610;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=41156611;
 //BA.debugLineNum = 41156611;BA.debugLine="Private txtUserName As EditText";
_txtusername = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=41156612;
 //BA.debugLineNum = 41156612;BA.debugLine="Private txtPassword As EditText";
_txtpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=41156613;
 //BA.debugLineNum = 41156613;BA.debugLine="Private lblForgot As Label";
_lblforgot = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=41156614;
 //BA.debugLineNum = 41156614;BA.debugLine="Private btnLogin As Button";
_btnlogin = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=41156615;
 //BA.debugLineNum = 41156615;BA.debugLine="Private lblDaftar As Label";
_lbldaftar = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=41156616;
 //BA.debugLineNum = 41156616;BA.debugLine="Dim pageHome As Home";
_pagehome = new b4a.example.home();
RDebugUtils.currentLine=41156617;
 //BA.debugLineNum = 41156617;BA.debugLine="Dim pageDaftar As Daftar";
_pagedaftar = new b4a.example.daftar();
RDebugUtils.currentLine=41156618;
 //BA.debugLineNum = 41156618;BA.debugLine="Dim pageDaftarAdmin As DaftarAdmin";
_pagedaftaradmin = new b4a.example.daftaradmin();
RDebugUtils.currentLine=41156619;
 //BA.debugLineNum = 41156619;BA.debugLine="Dim pageDaftarPengunjung As DaftarPengunjung";
_pagedaftarpengunjung = new b4a.example.daftarpengunjung();
RDebugUtils.currentLine=41156620;
 //BA.debugLineNum = 41156620;BA.debugLine="Dim requestjob As HttpJob";
_requestjob = new b4a.example.httpjob();
RDebugUtils.currentLine=41156621;
 //BA.debugLineNum = 41156621;BA.debugLine="End Sub";
return "";
}
public String  _daftar(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "daftar", false))
	 {return ((String) Debug.delegate(ba, "daftar", null));}
RDebugUtils.currentLine=41615360;
 //BA.debugLineNum = 41615360;BA.debugLine="Sub daftar";
RDebugUtils.currentLine=41615361;
 //BA.debugLineNum = 41615361;BA.debugLine="B4XPages.ShowPage(\"pageDaftar1\")";
_b4xpages._showpage /*String*/ (ba,"pageDaftar1");
RDebugUtils.currentLine=41615362;
 //BA.debugLineNum = 41615362;BA.debugLine="pageDaftar.animasi";
__ref._pagedaftar /*b4a.example.daftar*/ ._animasi /*String*/ (null);
RDebugUtils.currentLine=41615363;
 //BA.debugLineNum = 41615363;BA.debugLine="End Sub";
return "";
}
public String  _daftaradmin1(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "daftaradmin1", false))
	 {return ((String) Debug.delegate(ba, "daftaradmin1", null));}
RDebugUtils.currentLine=43581440;
 //BA.debugLineNum = 43581440;BA.debugLine="Sub DaftarAdmin1";
RDebugUtils.currentLine=43581441;
 //BA.debugLineNum = 43581441;BA.debugLine="B4XPages.ShowPage(\"pageDaftarAdmin1\")";
_b4xpages._showpage /*String*/ (ba,"pageDaftarAdmin1");
RDebugUtils.currentLine=43581442;
 //BA.debugLineNum = 43581442;BA.debugLine="pageDaftarAdmin.animasi";
__ref._pagedaftaradmin /*b4a.example.daftaradmin*/ ._animasi /*String*/ (null);
RDebugUtils.currentLine=43581443;
 //BA.debugLineNum = 43581443;BA.debugLine="End Sub";
return "";
}
public String  _daftarpengunjung1(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "daftarpengunjung1", false))
	 {return ((String) Debug.delegate(ba, "daftarpengunjung1", null));}
RDebugUtils.currentLine=44695552;
 //BA.debugLineNum = 44695552;BA.debugLine="Sub DaftarPengunjung1";
RDebugUtils.currentLine=44695553;
 //BA.debugLineNum = 44695553;BA.debugLine="B4XPages.ShowPage(\"pageDaftarPengunjung1\")";
_b4xpages._showpage /*String*/ (ba,"pageDaftarPengunjung1");
RDebugUtils.currentLine=44695554;
 //BA.debugLineNum = 44695554;BA.debugLine="pageDaftarPengunjung.animasi";
__ref._pagedaftarpengunjung /*b4a.example.daftarpengunjung*/ ._animasi /*String*/ (null);
RDebugUtils.currentLine=44695555;
 //BA.debugLineNum = 44695555;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=41222144;
 //BA.debugLineNum = 41222144;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=41222146;
 //BA.debugLineNum = 41222146;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(b4a.example.b4xmainpage __ref,b4a.example.httpjob _job) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "jobdone", false))
	 {return ((String) Debug.delegate(ba, "jobdone", new Object[] {_job}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _jroot = null;
anywheresoftware.b4a.objects.collections.Map _coljroot = null;
String _id = "";
String _level = "";
String _username = "";
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="If Job.Success = True Then";
if (_job._success /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="Log(Job.GetString)";
__c.LogImpl("241484290",_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=41484292;
 //BA.debugLineNum = 41484292;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"requestjob")) {
case 0: {
RDebugUtils.currentLine=41484294;
 //BA.debugLineNum = 41484294;BA.debugLine="If Job.GetString = \"Not Found\" Then";
if ((_job._getstring /*String*/ (null)).equals("Not Found")) { 
RDebugUtils.currentLine=41484295;
 //BA.debugLineNum = 41484295;BA.debugLine="txtUserName.Text = \"\"";
__ref._txtusername /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=41484296;
 //BA.debugLineNum = 41484296;BA.debugLine="txtPassword.Text = \"\"";
__ref._txtpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=41484297;
 //BA.debugLineNum = 41484297;BA.debugLine="ToastMessageShow(Job.GetString,True)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_job._getstring /*String*/ (null)),__c.True);
RDebugUtils.currentLine=41484298;
 //BA.debugLineNum = 41484298;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=41484300;
 //BA.debugLineNum = 41484300;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=41484301;
 //BA.debugLineNum = 41484301;BA.debugLine="parser.Initialize(Job.GetString)";
_parser.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=41484302;
 //BA.debugLineNum = 41484302;BA.debugLine="Dim jRoot As List = parser.NextArray";
_jroot = new anywheresoftware.b4a.objects.collections.List();
_jroot = _parser.NextArray();
RDebugUtils.currentLine=41484303;
 //BA.debugLineNum = 41484303;BA.debugLine="For Each coljRoot As Map In jRoot";
_coljroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group14 = _jroot;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_coljroot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group14.Get(index14)));
RDebugUtils.currentLine=41484304;
 //BA.debugLineNum = 41484304;BA.debugLine="Dim id As String = coljRoot.Get(\"id\")";
_id = BA.ObjectToString(_coljroot.Get((Object)("id")));
RDebugUtils.currentLine=41484305;
 //BA.debugLineNum = 41484305;BA.debugLine="Dim level As String = coljRoot.Get(\"level\")";
_level = BA.ObjectToString(_coljroot.Get((Object)("level")));
RDebugUtils.currentLine=41484306;
 //BA.debugLineNum = 41484306;BA.debugLine="Dim username As String = coljRoot.Get(\"userna";
_username = BA.ObjectToString(_coljroot.Get((Object)("username")));
RDebugUtils.currentLine=41484307;
 //BA.debugLineNum = 41484307;BA.debugLine="Main.id_user = id";
_main._id_user /*String*/  = _id;
RDebugUtils.currentLine=41484308;
 //BA.debugLineNum = 41484308;BA.debugLine="Main.level_user = level";
_main._level_user /*String*/  = _level;
RDebugUtils.currentLine=41484309;
 //BA.debugLineNum = 41484309;BA.debugLine="B4XPages.ShowPage(\"pageHome1\")";
_b4xpages._showpage /*String*/ (ba,"pageHome1");
RDebugUtils.currentLine=41484310;
 //BA.debugLineNum = 41484310;BA.debugLine="pageHome.animasi";
__ref._pagehome /*b4a.example.home*/ ._animasi /*String*/ (null);
 }
};
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=41484317;
 //BA.debugLineNum = 41484317;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
__c.LogImpl("241484317","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=41484318;
 //BA.debugLineNum = 41484318;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage,";
__c.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage /*String*/ ),__c.True);
 };
RDebugUtils.currentLine=41484320;
 //BA.debugLineNum = 41484320;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=41484321;
 //BA.debugLineNum = 41484321;BA.debugLine="End Sub";
return "";
}
public String  _lbldaftar_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "lbldaftar_click", false))
	 {return ((String) Debug.delegate(ba, "lbldaftar_click", null));}
RDebugUtils.currentLine=41746432;
 //BA.debugLineNum = 41746432;BA.debugLine="Private Sub lblDaftar_Click";
RDebugUtils.currentLine=41746433;
 //BA.debugLineNum = 41746433;BA.debugLine="daftar";
__ref._daftar /*String*/ (null);
RDebugUtils.currentLine=41746434;
 //BA.debugLineNum = 41746434;BA.debugLine="End Sub";
return "";
}
public String  _lblforgot_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "lblforgot_click", false))
	 {return ((String) Debug.delegate(ba, "lblforgot_click", null));}
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Private Sub lblForgot_Click";
RDebugUtils.currentLine=41549826;
 //BA.debugLineNum = 41549826;BA.debugLine="End Sub";
return "";
}
public String  _proseslogin(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "proseslogin", false))
	 {return ((String) Debug.delegate(ba, "proseslogin", null));}
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Sub proseslogin";
RDebugUtils.currentLine=41418753;
 //BA.debugLineNum = 41418753;BA.debugLine="requestjob.Initialize(\"requestjob\",Me)";
__ref._requestjob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"requestjob",this);
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="requestjob.PostString(Main.IPServer & \"tr_data.ph";
__ref._requestjob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,_main._ipserver /*String*/ +"tr_data.php","tipe=login"+"&txtUserName="+__ref._txtusername /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+"&txtPassword="+__ref._txtpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText());
RDebugUtils.currentLine=41418757;
 //BA.debugLineNum = 41418757;BA.debugLine="ProgressDialogShow(\"Proses Login...\")";
__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Proses Login..."));
RDebugUtils.currentLine=41418758;
 //BA.debugLineNum = 41418758;BA.debugLine="End Sub";
return "";
}
}