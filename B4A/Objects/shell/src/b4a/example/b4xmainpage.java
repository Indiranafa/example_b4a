
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _txtusername = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtpassword = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lblforgot = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lbldaftar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pagehome = RemoteObject.declareNull("b4a.example.home");
public static RemoteObject _pagedaftar = RemoteObject.declareNull("b4a.example.daftar");
public static RemoteObject _pagedaftaradmin = RemoteObject.declareNull("b4a.example.daftaradmin");
public static RemoteObject _pagedaftarpengunjung = RemoteObject.declareNull("b4a.example.daftarpengunjung");
public static RemoteObject _requestjob = RemoteObject.declareNull("b4a.example.httpjob");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnLogin",_ref.getField(false, "_btnlogin"),"DateUtils",_ref.getField(false, "_dateutils"),"lblDaftar",_ref.getField(false, "_lbldaftar"),"lblForgot",_ref.getField(false, "_lblforgot"),"pageDaftar",_ref.getField(false, "_pagedaftar"),"pageDaftarAdmin",_ref.getField(false, "_pagedaftaradmin"),"pageDaftarPengunjung",_ref.getField(false, "_pagedaftarpengunjung"),"pageHome",_ref.getField(false, "_pagehome"),"requestjob",_ref.getField(false, "_requestjob"),"Root",_ref.getField(false, "_root"),"txtPassword",_ref.getField(false, "_txtpassword"),"txtUserName",_ref.getField(false, "_txtusername"),"xui",_ref.getField(false, "_xui")};
}
}