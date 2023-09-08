
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class astabmenu {
    public static RemoteObject myClass;
	public astabmenu() {
	}
    public static PCBA staticBA = new PCBA(null, astabmenu.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _underlinewidthbyonlyicon = RemoteObject.createImmutable(0);
public static RemoteObject _txt_height = RemoteObject.createImmutable(0f);
public static RemoteObject _icon_height = RemoteObject.createImmutable(0f);
public static RemoteObject _badge_height = RemoteObject.createImmutable(0f);
public static RemoteObject _texticon_padding = RemoteObject.createImmutable(0f);
public static RemoteObject _m_textfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
public static RemoteObject _g_tabs = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
public static RemoteObject _currenindex = RemoteObject.createImmutable(0);
public static RemoteObject _pl_clr = RemoteObject.createImmutable(0);
public static RemoteObject _pl_width = RemoteObject.createImmutable(0f);
public static RemoteObject _ul_clr = RemoteObject.createImmutable(0);
public static RemoteObject _ul_height = RemoteObject.createImmutable(0f);
public static RemoteObject _g_badge_gravity = RemoteObject.createImmutable("");
public static RemoteObject _g_commitmode = RemoteObject.createImmutable("");
public static RemoteObject _g_orientation = RemoteObject.createImmutable("");
public static RemoteObject _g_tabstyle = RemoteObject.createImmutable("");
public static RemoteObject _g_tabtextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _g_partinglinevisible = RemoteObject.createImmutable(false);
public static RemoteObject _g_currenttabunderline = RemoteObject.createImmutable(false);
public static RemoteObject _g_currenttabunderlineanimation = RemoteObject.createImmutable("");
public static RemoteObject _g_currenttabunderlineanimationduration = RemoteObject.createImmutable(0);
public static RemoteObject _g_currenttabunderlinegravity = RemoteObject.createImmutable("");
public static RemoteObject _g_enableselectedtabtextcolor = RemoteObject.createImmutable(false);
public static RemoteObject _g_selectedtabtextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _g_tabclickcolor = RemoteObject.createImmutable(0);
public static RemoteObject _g_tabstripmode = RemoteObject.createImmutable(false);
public static RemoteObject _g_haloduration = RemoteObject.createImmutable(0);
public static RemoteObject _g_badgeleftpadding = RemoteObject.createImmutable(0f);
public static RemoteObject _g_badgetoppadding = RemoteObject.createImmutable(0f);
public static RemoteObject _g_isinupdate = RemoteObject.createImmutable(false);
public static RemoteObject _xpnl_tabbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xpnl_underline = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _borderpadding = RemoteObject.createImmutable(0f);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"badge_height",_ref.getField(false, "_badge_height"),"BorderPadding",_ref.getField(false, "_borderpadding"),"CurrenIndex",_ref.getField(false, "_currenindex"),"DateUtils",_ref.getField(false, "_dateutils"),"g_badge_gravity",_ref.getField(false, "_g_badge_gravity"),"g_BadgeLeftPadding",_ref.getField(false, "_g_badgeleftpadding"),"g_BadgeTopPadding",_ref.getField(false, "_g_badgetoppadding"),"g_commitmode",_ref.getField(false, "_g_commitmode"),"g_CurrentTabUnderline",_ref.getField(false, "_g_currenttabunderline"),"g_CurrentTabUnderlineAnimation",_ref.getField(false, "_g_currenttabunderlineanimation"),"g_CurrentTabUnderlineAnimationDuration",_ref.getField(false, "_g_currenttabunderlineanimationduration"),"g_CurrentTabUnderlineGravity",_ref.getField(false, "_g_currenttabunderlinegravity"),"g_EnableSelectedTabTextColor",_ref.getField(false, "_g_enableselectedtabtextcolor"),"g_HaloDuration",_ref.getField(false, "_g_haloduration"),"g_isInUpdate",_ref.getField(false, "_g_isinupdate"),"g_orientation",_ref.getField(false, "_g_orientation"),"g_PartingLineVisible",_ref.getField(false, "_g_partinglinevisible"),"g_SelectedTabTextColor",_ref.getField(false, "_g_selectedtabtextcolor"),"g_TabClickColor",_ref.getField(false, "_g_tabclickcolor"),"g_Tabs",_ref.getField(false, "_g_tabs"),"g_TabStripMode",_ref.getField(false, "_g_tabstripmode"),"g_TabStyle",_ref.getField(false, "_g_tabstyle"),"g_TabTextColor",_ref.getField(false, "_g_tabtextcolor"),"icon_height",_ref.getField(false, "_icon_height"),"m_TextFont",_ref.getField(false, "_m_textfont"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"pl_clr",_ref.getField(false, "_pl_clr"),"pl_width",_ref.getField(false, "_pl_width"),"TextIcon_Padding",_ref.getField(false, "_texticon_padding"),"txt_height",_ref.getField(false, "_txt_height"),"ul_clr",_ref.getField(false, "_ul_clr"),"ul_height",_ref.getField(false, "_ul_height"),"underlinewidthbyonlyicon",_ref.getField(false, "_underlinewidthbyonlyicon"),"xpnl_tabbase",_ref.getField(false, "_xpnl_tabbase"),"xpnl_underline",_ref.getField(false, "_xpnl_underline"),"xui",_ref.getField(false, "_xui")};
}
}