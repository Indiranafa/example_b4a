package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class astabmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.astabmenu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.astabmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _tabs{
public boolean IsInitialized;
public String TabText;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper Icon;
public Object Tag;
public int Index;
public boolean BadgeVisible;
public boolean Visible;
public float TextIconPadding;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont xFont;
public int BackgroundColor;
public int TextColor;
public void Initialize() {
IsInitialized = true;
TabText = "";
Icon = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
Tag = new Object();
Index = 0;
BadgeVisible = false;
Visible = false;
TextIconPadding = 0f;
xFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
BackgroundColor = 0;
TextColor = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _underlinewidthbyonlyicon = 0;
public float _txt_height = 0f;
public float _icon_height = 0f;
public float _badge_height = 0f;
public float _texticon_padding = 0f;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _m_textfont = null;
public b4a.example.astabmenu._tabs _g_tabs = null;
public int _currenindex = 0;
public int _pl_clr = 0;
public float _pl_width = 0f;
public int _ul_clr = 0;
public float _ul_height = 0f;
public String _g_badge_gravity = "";
public String _g_commitmode = "";
public String _g_orientation = "";
public String _g_tabstyle = "";
public int _g_tabtextcolor = 0;
public boolean _g_partinglinevisible = false;
public boolean _g_currenttabunderline = false;
public String _g_currenttabunderlineanimation = "";
public int _g_currenttabunderlineanimationduration = 0;
public String _g_currenttabunderlinegravity = "";
public boolean _g_enableselectedtabtextcolor = false;
public int _g_selectedtabtextcolor = 0;
public int _g_tabclickcolor = 0;
public boolean _g_tabstripmode = false;
public int _g_haloduration = 0;
public float _g_badgeleftpadding = 0f;
public float _g_badgetoppadding = 0f;
public boolean _g_isinupdate = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tabbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_underline = null;
public float _borderpadding = 0f;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _addtab(b4a.example.astabmenu __ref,int _backgroundcolor,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "addtab", true))
	 {return ((String) Debug.delegate(ba, "addtab", new Object[] {_backgroundcolor,_text,_icon,_tag}));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Public Sub AddTab(BackgroundColor As Int,Text As S";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="InternAddTab(CreateTabs(Text,Icon,Tag,xpnl_tabbas";
__ref._internaddtab /*String*/ (null,__ref._createtabs /*b4a.example.astabmenu._tabs*/ (null,_text,_icon,_tag,__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews(),__c.False,__c.True,__ref._texticon_padding /*float*/ ,__ref._g_tabs /*b4a.example.astabmenu._tabs*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_backgroundcolor,__ref._g_tabs /*b4a.example.astabmenu._tabs*/ .TextColor /*int*/ ));
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return "";
}
public String  _internaddtab(b4a.example.astabmenu __ref,b4a.example.astabmenu._tabs _tabproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "internaddtab", true))
	 {return ((String) Debug.delegate(ba, "internaddtab", new Object[] {_tabproperties}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_base = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
anywheresoftware.b4a.objects.B4XViewWrapper _ximg_icon = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_badge = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_partingline = null;
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub InternAddTab(TabProperties As Tabs)";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Dim xpnl_base As B4XView = xui.CreatePanel(\"xpnl_";
_xpnl_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_base = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_base");
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="xpnl_base.Color = TabProperties.BackgroundColor";
_xpnl_base.setColor(_tabproperties.BackgroundColor /*int*/ );
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="Dim xlbl_text As B4XView = CreateLabel(\"\")";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="Dim ximg_icon As B4XView = CreateImageView(\"\")";
_ximg_icon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_ximg_icon = __ref._createimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=6225926;
 //BA.debugLineNum = 6225926;BA.debugLine="Dim xlbl_badge As B4XView = CreateLabel(\"\")";
_xlbl_badge = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_badge = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="xpnl_base.AddView(xlbl_text,0,0,0,0)";
_xpnl_base.AddView((android.view.View)(_xlbl_text.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=6225929;
 //BA.debugLineNum = 6225929;BA.debugLine="xpnl_base.AddView(ximg_icon,0,0,0,0)";
_xpnl_base.AddView((android.view.View)(_ximg_icon.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=6225930;
 //BA.debugLineNum = 6225930;BA.debugLine="xpnl_base.AddView(xlbl_badge,0,0,0,0)";
_xpnl_base.AddView((android.view.View)(_xlbl_badge.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=6225932;
 //BA.debugLineNum = 6225932;BA.debugLine="xlbl_badge.SetColorAndBorder(xlbl_badge.Color,0,0";
_xlbl_badge.SetColorAndBorder(_xlbl_badge.getColor(),(int) (0),(int) (0),(int) (__ref._badge_height /*float*/ /(double)2));
RDebugUtils.currentLine=6225933;
 //BA.debugLineNum = 6225933;BA.debugLine="xlbl_badge.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_badge.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=6225934;
 //BA.debugLineNum = 6225934;BA.debugLine="xlbl_badge.Font = TabProperties.xFont";
_xlbl_badge.setFont(_tabproperties.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=6225935;
 //BA.debugLineNum = 6225935;BA.debugLine="xlbl_badge.TextColor = TabProperties.TextColor";
_xlbl_badge.setTextColor(_tabproperties.TextColor /*int*/ );
RDebugUtils.currentLine=6225937;
 //BA.debugLineNum = 6225937;BA.debugLine="xpnl_base.Tag = CreateTabs(TabProperties.TabText,";
_xpnl_base.setTag((Object)(__ref._createtabs /*b4a.example.astabmenu._tabs*/ (null,_tabproperties.TabText /*String*/ ,_tabproperties.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ,_tabproperties.Tag /*Object*/ ,__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews(),__c.False,__c.True,__ref._texticon_padding /*float*/ ,__ref._g_tabs /*b4a.example.astabmenu._tabs*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_tabproperties.BackgroundColor /*int*/ ,__ref._g_tabs /*b4a.example.astabmenu._tabs*/ .TextColor /*int*/ )));
RDebugUtils.currentLine=6225939;
 //BA.debugLineNum = 6225939;BA.debugLine="xpnl_tabbase.AddView(xpnl_base,0,0,0,0)";
__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xpnl_base.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=6225941;
 //BA.debugLineNum = 6225941;BA.debugLine="Dim xpnl_partingline As B4XView = xui.CreatePanel";
_xpnl_partingline = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_partingline = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=6225942;
 //BA.debugLineNum = 6225942;BA.debugLine="mBase.AddView(xpnl_partingline,0,0,0,0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xpnl_partingline.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=6225944;
 //BA.debugLineNum = 6225944;BA.debugLine="Base_Resize(xpnl_tabbase.Width,xpnl_tabbase.Heigh";
__ref._base_resize /*String*/ (null,__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=6225949;
 //BA.debugLineNum = 6225949;BA.debugLine="SetUnderline2NewPos";
__ref._setunderline2newpos /*String*/ (null);
RDebugUtils.currentLine=6225950;
 //BA.debugLineNum = 6225950;BA.debugLine="End Sub";
return "";
}
public b4a.example.astabmenu._tabs  _createtabs(b4a.example.astabmenu __ref,String _tabtext,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon,Object _tag,int _index,boolean _badgevisible,boolean _visible,float _texticonpadding,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _backgroundcolor,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "createtabs", true))
	 {return ((b4a.example.astabmenu._tabs) Debug.delegate(ba, "createtabs", new Object[] {_tabtext,_icon,_tag,_index,_badgevisible,_visible,_texticonpadding,_xfont,_backgroundcolor,_textcolor}));}
b4a.example.astabmenu._tabs _t1 = null;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub CreateTabs (TabText As String, Icon As";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Dim t1 As Tabs";
_t1 = new b4a.example.astabmenu._tabs();
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="t1.TabText = TabText";
_t1.TabText /*String*/  = _tabtext;
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="t1.Icon = Icon";
_t1.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _icon;
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="t1.Tag = Tag";
_t1.Tag /*Object*/  = _tag;
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="t1.Index = Index";
_t1.Index /*int*/  = _index;
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="t1.BadgeVisible = BadgeVisible";
_t1.BadgeVisible /*boolean*/  = _badgevisible;
RDebugUtils.currentLine=6946824;
 //BA.debugLineNum = 6946824;BA.debugLine="t1.Visible = Visible";
_t1.Visible /*boolean*/  = _visible;
RDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="t1.TextIconPadding = TextIconPadding";
_t1.TextIconPadding /*float*/  = _texticonpadding;
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=6946827;
 //BA.debugLineNum = 6946827;BA.debugLine="t1.BackgroundColor = BackgroundColor";
_t1.BackgroundColor /*int*/  = _backgroundcolor;
RDebugUtils.currentLine=6946828;
 //BA.debugLineNum = 6946828;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=6946829;
 //BA.debugLineNum = 6946829;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=6946830;
 //BA.debugLineNum = 6946830;BA.debugLine="End Sub";
return null;
}
public String  _addtab2(b4a.example.astabmenu __ref,b4a.example.astabmenu._tabs _tabproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "addtab2", true))
	 {return ((String) Debug.delegate(ba, "addtab2", new Object[] {_tabproperties}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Public Sub AddTab2(TabProperties As Tabs)";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="TabProperties.Index = xpnl_tabbase.NumberOfViews";
_tabproperties.Index /*int*/  = __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews();
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="InternAddTab(TabProperties)";
__ref._internaddtab /*String*/ (null,_tabproperties);
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="End Sub";
return "";
}
public int  _badge_getcolor(b4a.example.astabmenu __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "badge_getcolor", true))
	 {return ((Integer) Debug.delegate(ba, "badge_getcolor", new Object[] {_index}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub Badge_getColor(index As Int) As Int";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Return xpnl_tabbase.GetView(index).GetView(2).Col";
if (true) return __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).GetView((int) (2)).getColor();
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return 0;
}
public float  _badge_getheight(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "badge_getheight", true))
	 {return ((Float) Debug.delegate(ba, "badge_getheight", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub Badge_getHeight As Float";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Return badge_height";
if (true) return __ref._badge_height /*float*/ ;
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return 0f;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _badge_getlabel(b4a.example.astabmenu __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "badge_getlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "badge_getlabel", new Object[] {_index}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub Badge_getLabel(index As Int) As B4XView";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Return xpnl_tabbase.GetView(index).GetView(2)";
if (true) return __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).GetView((int) (2));
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return null;
}
public boolean  _badge_getvisible(b4a.example.astabmenu __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "badge_getvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "badge_getvisible", new Object[] {_index}));}
b4a.example.astabmenu._tabs _tmp_tab = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub Badge_getVisible(index As Int) As Boole";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
_tmp_tab = (b4a.example.astabmenu._tabs)(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).getTag());
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Return tmp_tab.badgevisible";
if (true) return _tmp_tab.BadgeVisible /*boolean*/ ;
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="End Sub";
return false;
}
public String  _badge_setcolor(b4a.example.astabmenu __ref,int _index,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "badge_setcolor", true))
	 {return ((String) Debug.delegate(ba, "badge_setcolor", new Object[] {_index,_color}));}
anywheresoftware.b4a.objects.B4XViewWrapper _tmp_base = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_badge = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub Badge_setColor(index As Int,color As In";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim tmp_base As B4XView = xpnl_tabbase.GetView(in";
_tmp_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tmp_base = __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index);
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim xlbl_badge As B4XView = tmp_base.GetView(2)";
_xlbl_badge = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_badge = _tmp_base.GetView((int) (2));
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="xlbl_badge.Color = color";
_xlbl_badge.setColor(_color);
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="End Sub";
return "";
}
public String  _badge_setheight(b4a.example.astabmenu __ref,float _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "badge_setheight", true))
	 {return ((String) Debug.delegate(ba, "badge_setheight", new Object[] {_size}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub Badge_setHeight(size As Float)";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="badge_height = size";
__ref._badge_height /*float*/  = _size;
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
if ((__ref._g_commitmode /*String*/ ).equals(__ref._getcommitmode_automatic /*String*/ (null))) { 
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());};
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="End Sub";
return "";
}
public String  _getcommitmode_automatic(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getcommitmode_automatic", true))
	 {return ((String) Debug.delegate(ba, "getcommitmode_automatic", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub getCommitMode_AUTOMATIC As String";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Return \"Automatic\"";
if (true) return "Automatic";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.astabmenu __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
float _scale = 0f;
boolean _ishorizontal = false;
int _tmp_counter = 0;
boolean _tmp_texticoncenter = false;
int _i = 0;
b4a.example.astabmenu._tabs _tmp_tab = null;
int _tmp_index = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_base = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
anywheresoftware.b4a.objects.B4XViewWrapper _ximg_icon = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_partingline = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_badge = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim scale As Float = 1";
_scale = (float) (1);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="If Width > Height Then";
if (_width>_height) { 
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="SetCircleClip(mBase,Height/2)";
__ref._setcircleclip /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(int) (_height/(double)2));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="SetCircleClip(xpnl_tabbase,Height/2)";
__ref._setcircleclip /*String*/ (null,__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(int) (_height/(double)2));
 }else {
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="SetCircleClip(mBase,Width/2)";
__ref._setcircleclip /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(int) (_width/(double)2));
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="SetCircleClip(xpnl_tabbase,Width/2)";
__ref._setcircleclip /*String*/ (null,__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(int) (_width/(double)2));
 };
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="xpnl_tabbase.SetLayoutAnimated(0,0 + BorderPaddin";
__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0+__ref._borderpadding /*float*/ ),(int) (0+__ref._borderpadding /*float*/ ),(int) (_width-__ref._borderpadding /*float*/ *2),(int) (_height-__ref._borderpadding /*float*/ *2));
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="Dim isHorizontal As Boolean = False";
_ishorizontal = __c.False;
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="If GetOrientation(g_orientation) = getOrientation";
if ((__ref._getorientation /*String*/ (null,__ref._g_orientation /*String*/ )).equals(__ref._getorientation_horizontal /*String*/ (null))) { 
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="isHorizontal = True";
_ishorizontal = __c.True;
 };
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="xpnl_underline.Visible = g_CurrentTabUnderline";
__ref._xpnl_underline /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__ref._g_currenttabunderline /*boolean*/ );
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="Dim tmp_counter As Int = 0";
_tmp_counter = (int) (0);
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="Dim tmp_TextIconCenter As Boolean = False";
_tmp_texticoncenter = __c.False;
RDebugUtils.currentLine=589852;
 //BA.debugLineNum = 589852;BA.debugLine="For i = 0 To xpnl_tabbase.NumberOfViews -1";
{
final int step17 = 1;
final int limit17 = (int) (__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=589853;
 //BA.debugLineNum = 589853;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(i).Ta";
_tmp_tab = (b4a.example.astabmenu._tabs)(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i).getTag());
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="If tmp_tab.Visible = True Then";
if (_tmp_tab.Visible /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="tmp_counter = tmp_counter +1";
_tmp_counter = (int) (_tmp_counter+1);
 };
RDebugUtils.currentLine=589857;
 //BA.debugLineNum = 589857;BA.debugLine="If g_TabStyle = \"TextIcon\" And (tmp_tab.Icon.IsI";
if ((__ref._g_tabstyle /*String*/ ).equals("TextIcon") && (_tmp_tab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False || (_tmp_tab.TabText /*String*/ ).equals(""))) { 
RDebugUtils.currentLine=589858;
 //BA.debugLineNum = 589858;BA.debugLine="tmp_TextIconCenter = True";
_tmp_texticoncenter = __c.True;
 };
 }
};
RDebugUtils.currentLine=589863;
 //BA.debugLineNum = 589863;BA.debugLine="Dim tmp_index As Int = -1";
_tmp_index = (int) (-1);
RDebugUtils.currentLine=589864;
 //BA.debugLineNum = 589864;BA.debugLine="For i = 0 To xpnl_tabbase.NumberOfViews -1";
{
final int step27 = 1;
final int limit27 = (int) (__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
RDebugUtils.currentLine=589865;
 //BA.debugLineNum = 589865;BA.debugLine="Dim xpnl_base As B4XView = xpnl_tabbase.GetView(";
_xpnl_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_base = __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i);
RDebugUtils.currentLine=589867;
 //BA.debugLineNum = 589867;BA.debugLine="Dim tmp_tab As Tabs = xpnl_base.Tag";
_tmp_tab = (b4a.example.astabmenu._tabs)(_xpnl_base.getTag());
RDebugUtils.currentLine=589868;
 //BA.debugLineNum = 589868;BA.debugLine="Dim xlbl_text As B4XView = xpnl_base.GetView(0)";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _xpnl_base.GetView((int) (0));
RDebugUtils.currentLine=589869;
 //BA.debugLineNum = 589869;BA.debugLine="Dim ximg_icon As B4XView = xpnl_base.GetView(1)";
_ximg_icon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_ximg_icon = _xpnl_base.GetView((int) (1));
RDebugUtils.currentLine=589871;
 //BA.debugLineNum = 589871;BA.debugLine="xpnl_base.Color =tmp_tab.BackgroundColor";
_xpnl_base.setColor(_tmp_tab.BackgroundColor /*int*/ );
RDebugUtils.currentLine=589873;
 //BA.debugLineNum = 589873;BA.debugLine="If tmp_tab.Visible = True Then";
if (_tmp_tab.Visible /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=589874;
 //BA.debugLineNum = 589874;BA.debugLine="tmp_index = tmp_index +1";
_tmp_index = (int) (_tmp_index+1);
RDebugUtils.currentLine=589875;
 //BA.debugLineNum = 589875;BA.debugLine="If isHorizontal = True Then";
if (_ishorizontal==__c.True) { 
RDebugUtils.currentLine=589877;
 //BA.debugLineNum = 589877;BA.debugLine="xpnl_base.SetLayoutAnimated(0,(xpnl_tabbase.Wi";
_xpnl_base.SetLayoutAnimated((int) (0),(int) ((__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)_tmp_counter)*_tmp_index),(int) (0),(int) (__c.Ceil(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)_tmp_counter)),__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }else {
RDebugUtils.currentLine=589880;
 //BA.debugLineNum = 589880;BA.debugLine="xpnl_base.SetLayoutAnimated(0,0,(xpnl_tabbase.";
_xpnl_base.SetLayoutAnimated((int) (0),(int) (0),(int) ((__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)_tmp_counter)*_tmp_index),__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__c.Ceil(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)_tmp_counter)));
 };
 }else {
RDebugUtils.currentLine=589883;
 //BA.debugLineNum = 589883;BA.debugLine="xpnl_base.Width = 0";
_xpnl_base.setWidth((int) (0));
 };
RDebugUtils.currentLine=589886;
 //BA.debugLineNum = 589886;BA.debugLine="mBase.GetView(tmp_tab.index + 2).Visible = g_Par";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (_tmp_tab.Index /*int*/ +2)).setVisible(__ref._g_partinglinevisible /*boolean*/ );
RDebugUtils.currentLine=589887;
 //BA.debugLineNum = 589887;BA.debugLine="If g_PartingLineVisible = True  Then";
if (__ref._g_partinglinevisible /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=589888;
 //BA.debugLineNum = 589888;BA.debugLine="Dim xpnl_partingline As B4XView = mBase.GetView";
_xpnl_partingline = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_partingline = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (_tmp_tab.Index /*int*/ +2));
RDebugUtils.currentLine=589890;
 //BA.debugLineNum = 589890;BA.debugLine="If isHorizontal = True Then";
if (_ishorizontal==__c.True) { 
RDebugUtils.currentLine=589891;
 //BA.debugLineNum = 589891;BA.debugLine="xpnl_partingline.SetLayoutAnimated(0,xpnl_base";
_xpnl_partingline.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getLeft()+_xpnl_base.getWidth()-__ref._pl_width /*float*/ /(double)2),(int) (_xpnl_base.getHeight()/(double)2-_xpnl_base.getHeight()/(double)4),(int) (__ref._pl_width /*float*/ ),(int) (_xpnl_base.getHeight()/(double)2));
 }else {
RDebugUtils.currentLine=589893;
 //BA.debugLineNum = 589893;BA.debugLine="xpnl_partingline.SetLayoutAnimated(0,xpnl_base";
_xpnl_partingline.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-_xpnl_base.getWidth()/(double)4),(int) (_xpnl_base.getTop()+_xpnl_base.getHeight()-__ref._pl_width /*float*/ /(double)2),(int) (_xpnl_base.getWidth()/(double)2),(int) (__ref._pl_width /*float*/ ));
 };
RDebugUtils.currentLine=589896;
 //BA.debugLineNum = 589896;BA.debugLine="xpnl_partingline.SetColorAndBorder(pl_clr,0,0,x";
_xpnl_partingline.SetColorAndBorder(__ref._pl_clr /*int*/ ,(int) (0),(int) (0),(int) (_xpnl_partingline.getHeight()/(double)2));
RDebugUtils.currentLine=589897;
 //BA.debugLineNum = 589897;BA.debugLine="If tmp_tab.index = xpnl_tabbase.NumberOfViews -";
if (_tmp_tab.Index /*int*/ ==__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1) { 
RDebugUtils.currentLine=589898;
 //BA.debugLineNum = 589898;BA.debugLine="xpnl_partingline.Visible = False";
_xpnl_partingline.setVisible(__c.False);
 };
 };
RDebugUtils.currentLine=589902;
 //BA.debugLineNum = 589902;BA.debugLine="Dim xlbl_badge As B4XView = xpnl_base.GetView(2)";
_xlbl_badge = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_badge = _xpnl_base.GetView((int) (2));
RDebugUtils.currentLine=589903;
 //BA.debugLineNum = 589903;BA.debugLine="xlbl_badge.Visible = tmp_tab.badgevisible";
_xlbl_badge.setVisible(_tmp_tab.BadgeVisible /*boolean*/ );
RDebugUtils.currentLine=589905;
 //BA.debugLineNum = 589905;BA.debugLine="If g_TabStyle = \"Text\" Then 'only Text";
if ((__ref._g_tabstyle /*String*/ ).equals("Text")) { 
RDebugUtils.currentLine=589907;
 //BA.debugLineNum = 589907;BA.debugLine="xlbl_text.Visible = True";
_xlbl_text.setVisible(__c.True);
RDebugUtils.currentLine=589908;
 //BA.debugLineNum = 589908;BA.debugLine="ximg_icon.Visible = False";
_ximg_icon.setVisible(__c.False);
RDebugUtils.currentLine=589910;
 //BA.debugLineNum = 589910;BA.debugLine="xlbl_text.Text = tmp_tab.TabText";
_xlbl_text.setText(BA.ObjectToCharSequence(_tmp_tab.TabText /*String*/ ));
RDebugUtils.currentLine=589911;
 //BA.debugLineNum = 589911;BA.debugLine="xlbl_text.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_text.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=589912;
 //BA.debugLineNum = 589912;BA.debugLine="If CurrenIndex = tmp_tab.index Then";
if (__ref._currenindex /*int*/ ==_tmp_tab.Index /*int*/ ) { 
RDebugUtils.currentLine=589913;
 //BA.debugLineNum = 589913;BA.debugLine="xlbl_text.TextColor = g_SelectedTabTextColor";
_xlbl_text.setTextColor(__ref._g_selectedtabtextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=589915;
 //BA.debugLineNum = 589915;BA.debugLine="xlbl_text.TextColor = tmp_tab.TextColor";
_xlbl_text.setTextColor(_tmp_tab.TextColor /*int*/ );
 };
RDebugUtils.currentLine=589918;
 //BA.debugLineNum = 589918;BA.debugLine="xlbl_text.Font = tmp_tab.xFont";
_xlbl_text.setFont(_tmp_tab.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=589920;
 //BA.debugLineNum = 589920;BA.debugLine="xlbl_text.SetLayoutAnimated(0,0,xpnl_base.Heigh";
_xlbl_text.SetLayoutAnimated((int) (0),(int) (0),(int) (_xpnl_base.getHeight()/(double)2-__ref._txt_height /*float*/ /(double)2),_xpnl_base.getWidth(),(int) (__ref._txt_height /*float*/ ));
RDebugUtils.currentLine=589923;
 //BA.debugLineNum = 589923;BA.debugLine="If tmp_tab.badgevisible = True Then";
if (_tmp_tab.BadgeVisible /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=589924;
 //BA.debugLineNum = 589924;BA.debugLine="If g_CurrentTabUnderlineGravity = getCurrentTa";
if ((__ref._g_currenttabunderlinegravity /*String*/ ).equals(__ref._getcurrenttabunderlinegravity_topleft /*String*/ (null)) && (__ref._getorientation /*String*/ (null,__ref._g_orientation /*String*/ )).equals(__ref._getorientation_horizontal /*String*/ (null))) { 
RDebugUtils.currentLine=589925;
 //BA.debugLineNum = 589925;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xlbl_text.Widt";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xlbl_text.getWidth()/(double)2-__ref._badge_height /*float*/ /(double)2+__ref._g_badgeleftpadding /*float*/ ),(int) (_xlbl_text.getTop()+_xlbl_text.getHeight()+__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else {
RDebugUtils.currentLine=589927;
 //BA.debugLineNum = 589927;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xlbl_text.Widt";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xlbl_text.getWidth()/(double)2-__ref._badge_height /*float*/ /(double)2+__ref._g_badgeleftpadding /*float*/ ),(int) (_xlbl_text.getTop()-__ref._badge_height /*float*/ +__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 };
 };
 }else 
{RDebugUtils.currentLine=589931;
 //BA.debugLineNum = 589931;BA.debugLine="Else If g_TabStyle = \"Icon\" Then 'only Icon";
if ((__ref._g_tabstyle /*String*/ ).equals("Icon")) { 
RDebugUtils.currentLine=589933;
 //BA.debugLineNum = 589933;BA.debugLine="xlbl_text.Visible = False";
_xlbl_text.setVisible(__c.False);
RDebugUtils.currentLine=589934;
 //BA.debugLineNum = 589934;BA.debugLine="ximg_icon.Visible = True";
_ximg_icon.setVisible(__c.True);
RDebugUtils.currentLine=589936;
 //BA.debugLineNum = 589936;BA.debugLine="ximg_icon.SetLayoutAnimated(0,xpnl_base.Width/2";
_ximg_icon.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._icon_height /*float*/ /(double)2),(int) (_xpnl_base.getHeight()/(double)2-__ref._icon_height /*float*/ /(double)2),(int) (__ref._icon_height /*float*/ ),(int) (__ref._icon_height /*float*/ ));
RDebugUtils.currentLine=589939;
 //BA.debugLineNum = 589939;BA.debugLine="If CurrenIndex = tmp_tab.index Then";
if (__ref._currenindex /*int*/ ==_tmp_tab.Index /*int*/ ) { 
RDebugUtils.currentLine=589941;
 //BA.debugLineNum = 589941;BA.debugLine="If tmp_tab.Icon.IsInitialized Then ximg_icon.S";
if (_tmp_tab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()) { 
_ximg_icon.SetBitmap((android.graphics.Bitmap)(_tmp_tab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_ximg_icon.getWidth()*_scale),(int) (_ximg_icon.getHeight()*_scale),__c.True).getObject()));};
RDebugUtils.currentLine=589942;
 //BA.debugLineNum = 589942;BA.debugLine="TintBmp(ximg_icon,g_SelectedTabTextColor)";
__ref._tintbmp /*String*/ (null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_ximg_icon.getObject())),__ref._g_selectedtabtextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=589945;
 //BA.debugLineNum = 589945;BA.debugLine="If tmp_tab.Icon.IsInitialized Then ximg_icon.S";
if (_tmp_tab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()) { 
_ximg_icon.SetBitmap((android.graphics.Bitmap)(_tmp_tab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_ximg_icon.getWidth()*_scale),(int) (_ximg_icon.getHeight()*_scale),__c.True).getObject()));};
RDebugUtils.currentLine=589946;
 //BA.debugLineNum = 589946;BA.debugLine="TintBmp(ximg_icon,g_TabTextColor)";
__ref._tintbmp /*String*/ (null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_ximg_icon.getObject())),__ref._g_tabtextcolor /*int*/ );
 };
RDebugUtils.currentLine=589949;
 //BA.debugLineNum = 589949;BA.debugLine="If tmp_tab.badgevisible = True Then";
if (_tmp_tab.BadgeVisible /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=589950;
 //BA.debugLineNum = 589950;BA.debugLine="If g_badge_gravity = getBadge_MIDDLELEFT Then";
if ((__ref._g_badge_gravity /*String*/ ).equals(__ref._getbadge_middleleft /*String*/ (null))) { 
RDebugUtils.currentLine=589951;
 //BA.debugLineNum = 589951;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Widt";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._icon_height /*float*/ /(double)1.2+__ref._g_badgeleftpadding /*float*/ ),(int) (_xpnl_base.getHeight()/(double)2+__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else 
{RDebugUtils.currentLine=589952;
 //BA.debugLineNum = 589952;BA.debugLine="else If g_badge_gravity = getBadge_TOPLEFT The";
if ((__ref._g_badge_gravity /*String*/ ).equals(__ref._getbadge_topleft /*String*/ (null))) { 
RDebugUtils.currentLine=589953;
 //BA.debugLineNum = 589953;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Widt";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._icon_height /*float*/ /(double)1.2+__ref._g_badgeleftpadding /*float*/ ),(int) (_ximg_icon.getTop()-__ref._badge_height /*float*/ /(double)2+__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else 
{RDebugUtils.currentLine=589954;
 //BA.debugLineNum = 589954;BA.debugLine="else If g_badge_gravity = getBadge_TOPMIDDLE T";
if ((__ref._g_badge_gravity /*String*/ ).equals(__ref._getbadge_topmiddle /*String*/ (null))) { 
RDebugUtils.currentLine=589955;
 //BA.debugLineNum = 589955;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Widt";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._badge_height /*float*/ /(double)2+__ref._g_badgeleftpadding /*float*/ ),(int) (_ximg_icon.getTop()-__ref._badge_height /*float*/ /(double)2+__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else 
{RDebugUtils.currentLine=589956;
 //BA.debugLineNum = 589956;BA.debugLine="else If g_badge_gravity = getBadge_TOPRIGHT Th";
if ((__ref._g_badge_gravity /*String*/ ).equals(__ref._getbadge_topright /*String*/ (null))) { 
RDebugUtils.currentLine=589957;
 //BA.debugLineNum = 589957;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Widt";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2+__ref._icon_height /*float*/ /(double)1.2-__ref._badge_height /*float*/ +__ref._g_badgeleftpadding /*float*/ ),(int) (_ximg_icon.getTop()-__ref._badge_height /*float*/ /(double)2+__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else {
RDebugUtils.currentLine=589959;
 //BA.debugLineNum = 589959;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Widt";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2+__ref._icon_height /*float*/ /(double)1.2-__ref._badge_height /*float*/ +__ref._g_badgeleftpadding /*float*/ ),(int) (_xpnl_base.getHeight()/(double)2+__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }}}}
;
 };
 }else 
{RDebugUtils.currentLine=589964;
 //BA.debugLineNum = 589964;BA.debugLine="Else If g_TabStyle = \"TextIcon\" Then 'text and i";
if ((__ref._g_tabstyle /*String*/ ).equals("TextIcon")) { 
RDebugUtils.currentLine=589966;
 //BA.debugLineNum = 589966;BA.debugLine="xlbl_text.Visible = True";
_xlbl_text.setVisible(__c.True);
RDebugUtils.currentLine=589967;
 //BA.debugLineNum = 589967;BA.debugLine="ximg_icon.Visible = True";
_ximg_icon.setVisible(__c.True);
RDebugUtils.currentLine=589969;
 //BA.debugLineNum = 589969;BA.debugLine="xlbl_text.Text = tmp_tab.TabText";
_xlbl_text.setText(BA.ObjectToCharSequence(_tmp_tab.TabText /*String*/ ));
RDebugUtils.currentLine=589970;
 //BA.debugLineNum = 589970;BA.debugLine="xlbl_text.SetTextAlignment(\"TOP\",\"CENTER\")";
_xlbl_text.SetTextAlignment("TOP","CENTER");
RDebugUtils.currentLine=589971;
 //BA.debugLineNum = 589971;BA.debugLine="xlbl_text.Font = tmp_tab.xFont";
_xlbl_text.setFont(_tmp_tab.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=589973;
 //BA.debugLineNum = 589973;BA.debugLine="If tmp_TextIconCenter = False Then";
if (_tmp_texticoncenter==__c.False) { 
RDebugUtils.currentLine=589974;
 //BA.debugLineNum = 589974;BA.debugLine="If isHorizontal = True Then";
if (_ishorizontal==__c.True) { 
RDebugUtils.currentLine=589975;
 //BA.debugLineNum = 589975;BA.debugLine="xlbl_text.SetLayoutAnimated(0,0,xpnl_base.Hei";
_xlbl_text.SetLayoutAnimated((int) (0),(int) (0),(int) (_xpnl_base.getHeight()/(double)2),_xpnl_base.getWidth(),(int) (__ref._txt_height /*float*/ ));
RDebugUtils.currentLine=589976;
 //BA.debugLineNum = 589976;BA.debugLine="ximg_icon.SetLayoutAnimated(0,xpnl_base.Width";
_ximg_icon.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._icon_height /*float*/ /(double)2),(int) (_xpnl_base.getHeight()/(double)2-__ref._icon_height /*float*/ -_tmp_tab.TextIconPadding /*float*/ ),(int) (__ref._icon_height /*float*/ ),(int) (__ref._icon_height /*float*/ ));
 }else {
RDebugUtils.currentLine=589978;
 //BA.debugLineNum = 589978;BA.debugLine="xlbl_text.SetLayoutAnimated(0,0,xpnl_base.Hei";
_xlbl_text.SetLayoutAnimated((int) (0),(int) (0),(int) (_xpnl_base.getHeight()/(double)2),_xpnl_base.getWidth(),(int) (__ref._txt_height /*float*/ ));
RDebugUtils.currentLine=589979;
 //BA.debugLineNum = 589979;BA.debugLine="ximg_icon.SetLayoutAnimated(0,xpnl_base.Width";
_ximg_icon.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._icon_height /*float*/ /(double)2),(int) (_xpnl_base.getHeight()/(double)2-__ref._icon_height /*float*/ -_tmp_tab.TextIconPadding /*float*/ ),(int) (__ref._icon_height /*float*/ ),(int) (__ref._icon_height /*float*/ ));
 };
 }else {
RDebugUtils.currentLine=589982;
 //BA.debugLineNum = 589982;BA.debugLine="If isHorizontal = True Then";
if (_ishorizontal==__c.True) { 
RDebugUtils.currentLine=589983;
 //BA.debugLineNum = 589983;BA.debugLine="xlbl_text.SetLayoutAnimated(0,0,xpnl_base.Hei";
_xlbl_text.SetLayoutAnimated((int) (0),(int) (0),(int) (_xpnl_base.getHeight()/(double)2-__ref._txt_height /*float*/ /(double)2),_xpnl_base.getWidth(),(int) (__ref._txt_height /*float*/ ));
RDebugUtils.currentLine=589984;
 //BA.debugLineNum = 589984;BA.debugLine="ximg_icon.SetLayoutAnimated(0,xpnl_base.Width";
_ximg_icon.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._icon_height /*float*/ /(double)2),(int) (_xpnl_base.getHeight()/(double)2-__ref._icon_height /*float*/ /(double)2),(int) (__ref._icon_height /*float*/ ),(int) (__ref._icon_height /*float*/ ));
 }else {
RDebugUtils.currentLine=589986;
 //BA.debugLineNum = 589986;BA.debugLine="xlbl_text.SetLayoutAnimated(0,0,xpnl_base.Hei";
_xlbl_text.SetLayoutAnimated((int) (0),(int) (0),(int) (_xpnl_base.getHeight()/(double)2-__ref._txt_height /*float*/ /(double)2),_xpnl_base.getWidth(),(int) (__ref._txt_height /*float*/ ));
RDebugUtils.currentLine=589987;
 //BA.debugLineNum = 589987;BA.debugLine="ximg_icon.SetLayoutAnimated(0,xpnl_base.Width";
_ximg_icon.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._icon_height /*float*/ /(double)2),(int) (_xpnl_base.getHeight()/(double)2-__ref._icon_height /*float*/ /(double)2),(int) (__ref._icon_height /*float*/ ),(int) (__ref._icon_height /*float*/ ));
 };
 };
RDebugUtils.currentLine=589991;
 //BA.debugLineNum = 589991;BA.debugLine="If CurrenIndex = tmp_tab.index Then";
if (__ref._currenindex /*int*/ ==_tmp_tab.Index /*int*/ ) { 
RDebugUtils.currentLine=589992;
 //BA.debugLineNum = 589992;BA.debugLine="xlbl_text.TextColor = g_SelectedTabTextColor";
_xlbl_text.setTextColor(__ref._g_selectedtabtextcolor /*int*/ );
RDebugUtils.currentLine=589994;
 //BA.debugLineNum = 589994;BA.debugLine="If tmp_tab.Icon.IsInitialized Then ximg_icon.S";
if (_tmp_tab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()) { 
_ximg_icon.SetBitmap((android.graphics.Bitmap)(_tmp_tab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_ximg_icon.getWidth()*_scale),(int) (_ximg_icon.getHeight()*_scale),__c.True).getObject()));};
RDebugUtils.currentLine=589995;
 //BA.debugLineNum = 589995;BA.debugLine="TintBmp(ximg_icon,g_SelectedTabTextColor)";
__ref._tintbmp /*String*/ (null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_ximg_icon.getObject())),__ref._g_selectedtabtextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=589997;
 //BA.debugLineNum = 589997;BA.debugLine="xlbl_text.TextColor = tmp_tab.TextColor";
_xlbl_text.setTextColor(_tmp_tab.TextColor /*int*/ );
RDebugUtils.currentLine=589999;
 //BA.debugLineNum = 589999;BA.debugLine="If tmp_tab.Icon.IsInitialized Then ximg_icon.S";
if (_tmp_tab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()) { 
_ximg_icon.SetBitmap((android.graphics.Bitmap)(_tmp_tab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_ximg_icon.getWidth()*_scale),(int) (_ximg_icon.getHeight()*_scale),__c.True).getObject()));};
RDebugUtils.currentLine=590000;
 //BA.debugLineNum = 590000;BA.debugLine="TintBmp(ximg_icon,g_TabTextColor)";
__ref._tintbmp /*String*/ (null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_ximg_icon.getObject())),__ref._g_tabtextcolor /*int*/ );
 };
RDebugUtils.currentLine=590003;
 //BA.debugLineNum = 590003;BA.debugLine="If tmp_TextIconCenter = False Then 'Icons or Te";
if (_tmp_texticoncenter==__c.False) { 
RDebugUtils.currentLine=590004;
 //BA.debugLineNum = 590004;BA.debugLine="If tmp_tab.badgevisible = True Then";
if (_tmp_tab.BadgeVisible /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=590005;
 //BA.debugLineNum = 590005;BA.debugLine="If g_badge_gravity = getBadge_MIDDLELEFT Then";
if ((__ref._g_badge_gravity /*String*/ ).equals(__ref._getbadge_middleleft /*String*/ (null))) { 
RDebugUtils.currentLine=590006;
 //BA.debugLineNum = 590006;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._icon_height /*float*/ /(double)1.2+__ref._g_badgeleftpadding /*float*/ ),(int) (_xpnl_base.getHeight()/(double)2.7+__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else 
{RDebugUtils.currentLine=590007;
 //BA.debugLineNum = 590007;BA.debugLine="else If g_badge_gravity = getBadge_TOPLEFT Th";
if ((__ref._g_badge_gravity /*String*/ ).equals(__ref._getbadge_topleft /*String*/ (null))) { 
RDebugUtils.currentLine=590008;
 //BA.debugLineNum = 590008;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._icon_height /*float*/ /(double)1.2+__ref._g_badgeleftpadding /*float*/ ),(int) (_xpnl_base.getHeight()/(double)2-__ref._icon_height /*float*/ +__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else 
{RDebugUtils.currentLine=590009;
 //BA.debugLineNum = 590009;BA.debugLine="else If g_badge_gravity = getBadge_TOPMIDDLE";
if ((__ref._g_badge_gravity /*String*/ ).equals(__ref._getbadge_topmiddle /*String*/ (null))) { 
RDebugUtils.currentLine=590010;
 //BA.debugLineNum = 590010;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._badge_height /*float*/ /(double)2+__ref._g_badgeleftpadding /*float*/ ),(int) (_xpnl_base.getHeight()/(double)2-__ref._icon_height /*float*/ +__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else 
{RDebugUtils.currentLine=590011;
 //BA.debugLineNum = 590011;BA.debugLine="else If g_badge_gravity = getBadge_TOPRIGHT T";
if ((__ref._g_badge_gravity /*String*/ ).equals(__ref._getbadge_topright /*String*/ (null))) { 
RDebugUtils.currentLine=590012;
 //BA.debugLineNum = 590012;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2+__ref._icon_height /*float*/ /(double)1.2-__ref._badge_height /*float*/ +__ref._g_badgeleftpadding /*float*/ ),(int) (_xpnl_base.getHeight()/(double)2-__ref._icon_height /*float*/ +__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else {
RDebugUtils.currentLine=590014;
 //BA.debugLineNum = 590014;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2+__ref._icon_height /*float*/ /(double)1.2-__ref._badge_height /*float*/ +__ref._g_badgeleftpadding /*float*/ ),(int) (_xpnl_base.getHeight()/(double)2.7+__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }}}}
;
 };
 }else {
RDebugUtils.currentLine=590019;
 //BA.debugLineNum = 590019;BA.debugLine="If tmp_tab.Icon.IsInitialized = True Then";
if (_tmp_tab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=590020;
 //BA.debugLineNum = 590020;BA.debugLine="If g_badge_gravity = getBadge_MIDDLELEFT Then";
if ((__ref._g_badge_gravity /*String*/ ).equals(__ref._getbadge_middleleft /*String*/ (null))) { 
RDebugUtils.currentLine=590021;
 //BA.debugLineNum = 590021;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._icon_height /*float*/ /(double)1.2+__ref._g_badgeleftpadding /*float*/ ),(int) (_xpnl_base.getHeight()/(double)2.7+__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else 
{RDebugUtils.currentLine=590022;
 //BA.debugLineNum = 590022;BA.debugLine="else If g_badge_gravity = getBadge_TOPLEFT Th";
if ((__ref._g_badge_gravity /*String*/ ).equals(__ref._getbadge_topleft /*String*/ (null))) { 
RDebugUtils.currentLine=590023;
 //BA.debugLineNum = 590023;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._icon_height /*float*/ /(double)1.2+__ref._g_badgeleftpadding /*float*/ ),(int) (_xpnl_base.getHeight()/(double)2-__ref._icon_height /*float*/ +__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else 
{RDebugUtils.currentLine=590024;
 //BA.debugLineNum = 590024;BA.debugLine="else If g_badge_gravity = getBadge_TOPMIDDLE";
if ((__ref._g_badge_gravity /*String*/ ).equals(__ref._getbadge_topmiddle /*String*/ (null))) { 
RDebugUtils.currentLine=590025;
 //BA.debugLineNum = 590025;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2-__ref._badge_height /*float*/ /(double)2+__ref._g_badgeleftpadding /*float*/ ),(int) (_xpnl_base.getHeight()/(double)2-__ref._icon_height /*float*/ +__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else 
{RDebugUtils.currentLine=590026;
 //BA.debugLineNum = 590026;BA.debugLine="else If g_badge_gravity = getBadge_TOPRIGHT T";
if ((__ref._g_badge_gravity /*String*/ ).equals(__ref._getbadge_topright /*String*/ (null))) { 
RDebugUtils.currentLine=590027;
 //BA.debugLineNum = 590027;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2+__ref._icon_height /*float*/ /(double)1.2-__ref._badge_height /*float*/ +__ref._g_badgeleftpadding /*float*/ ),(int) (_xpnl_base.getHeight()/(double)2-__ref._icon_height /*float*/ +__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else {
RDebugUtils.currentLine=590029;
 //BA.debugLineNum = 590029;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_base.getWidth()/(double)2+__ref._icon_height /*float*/ /(double)1.2-__ref._badge_height /*float*/ +__ref._g_badgeleftpadding /*float*/ ),(int) (_xpnl_base.getHeight()/(double)2.7+__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }}}}
;
 }else {
RDebugUtils.currentLine=590032;
 //BA.debugLineNum = 590032;BA.debugLine="If g_CurrentTabUnderlineGravity = getCurrentT";
if ((__ref._g_currenttabunderlinegravity /*String*/ ).equals(__ref._getcurrenttabunderlinegravity_topleft /*String*/ (null)) && (__ref._getorientation /*String*/ (null,__ref._g_orientation /*String*/ )).equals(__ref._getorientation_horizontal /*String*/ (null))) { 
RDebugUtils.currentLine=590033;
 //BA.debugLineNum = 590033;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xlbl_text.Wid";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xlbl_text.getWidth()/(double)2-__ref._badge_height /*float*/ /(double)2+__ref._g_badgeleftpadding /*float*/ ),(int) (_xlbl_text.getTop()+_xlbl_text.getHeight()+__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 }else {
RDebugUtils.currentLine=590035;
 //BA.debugLineNum = 590035;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xlbl_text.Wid";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xlbl_text.getWidth()/(double)2-__ref._badge_height /*float*/ /(double)2+__ref._g_badgeleftpadding /*float*/ ),(int) (_xlbl_text.getTop()-__ref._badge_height /*float*/ +__ref._g_badgetoppadding /*float*/ ),(int) (__ref._badge_height /*float*/ ),(int) (__ref._badge_height /*float*/ ));
 };
 };
 };
 }else {
RDebugUtils.currentLine=590043;
 //BA.debugLineNum = 590043;BA.debugLine="xlbl_text.Visible = False";
_xlbl_text.setVisible(__c.False);
RDebugUtils.currentLine=590044;
 //BA.debugLineNum = 590044;BA.debugLine="ximg_icon.Visible = False";
_ximg_icon.setVisible(__c.False);
 }}}
;
 }
};
RDebugUtils.currentLine=590049;
 //BA.debugLineNum = 590049;BA.debugLine="End Sub";
return "";
}
public String  _badge_settext(b4a.example.astabmenu __ref,int _index,int _number) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "badge_settext", true))
	 {return ((String) Debug.delegate(ba, "badge_settext", new Object[] {_index,_number}));}
anywheresoftware.b4a.objects.B4XViewWrapper _tmp_base = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_badge = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub Badge_setText(index As Int,number As In";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim tmp_base As B4XView = xpnl_tabbase.GetView(in";
_tmp_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tmp_base = __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index);
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Dim xlbl_badge As B4XView = tmp_base.GetView(2)";
_xlbl_badge = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_badge = _tmp_base.GetView((int) (2));
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="If number < 0 Then";
if (_number<0) { 
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="xlbl_badge.Text = \"\"";
_xlbl_badge.setText(BA.ObjectToCharSequence(""));
 }else 
{RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Else If number > 99 Then";
if (_number>99) { 
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="xlbl_badge.Text = \"9+\"";
_xlbl_badge.setText(BA.ObjectToCharSequence("9+"));
 }else {
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="xlbl_badge.Text = number";
_xlbl_badge.setText(BA.ObjectToCharSequence(_number));
 }}
;
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="End Sub";
return "";
}
public String  _badge_settextcolor(b4a.example.astabmenu __ref,int _index,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "badge_settextcolor", true))
	 {return ((String) Debug.delegate(ba, "badge_settextcolor", new Object[] {_index,_color}));}
anywheresoftware.b4a.objects.B4XViewWrapper _tmp_base = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_badge = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub Badge_setTextColor(index As Int,color A";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim tmp_base As B4XView = xpnl_tabbase.GetView(in";
_tmp_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tmp_base = __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index);
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim xlbl_badge As B4XView = tmp_base.GetView(2)";
_xlbl_badge = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_badge = _tmp_base.GetView((int) (2));
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="xlbl_badge.TextColor = color";
_xlbl_badge.setTextColor(_color);
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="End Sub";
return "";
}
public String  _badge_setvisible(b4a.example.astabmenu __ref,int _index,boolean _visible) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "badge_setvisible", true))
	 {return ((String) Debug.delegate(ba, "badge_setvisible", new Object[] {_index,_visible}));}
b4a.example.astabmenu._tabs _tmp_tab = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub Badge_setVisible(index As Int,visible A";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
_tmp_tab = (b4a.example.astabmenu._tabs)(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).getTag());
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="tmp_tab.badgevisible = visible";
_tmp_tab.BadgeVisible /*boolean*/  = _visible;
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="xpnl_tabbase.GetView(index).Tag = tmp_tab";
__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).setTag((Object)(_tmp_tab));
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
if ((__ref._g_commitmode /*String*/ ).equals(__ref._getcommitmode_automatic /*String*/ (null))) { 
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());};
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="End Sub";
return "";
}
public String  _badge_setvisibleeasy(b4a.example.astabmenu __ref,int _index,int _number,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "badge_setvisibleeasy", true))
	 {return ((String) Debug.delegate(ba, "badge_setvisibleeasy", new Object[] {_index,_number,_color}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub Badge_setVisibleEasy(index As Int,numbe";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Badge_setColor(index,color)";
__ref._badge_setcolor /*String*/ (null,_index,_color);
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Badge_setText(index,number)";
__ref._badge_settext /*String*/ (null,_index,_number);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Badge_setVisible(index,True)";
__ref._badge_setvisible /*String*/ (null,_index,__c.True);
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="End Sub";
return "";
}
public String  _setcircleclip(b4a.example.astabmenu __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setcircleclip", true))
	 {return ((String) Debug.delegate(ba, "setcircleclip", new Object[] {_pnl,_radius}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Private Sub SetCircleClip (pnl As B4XView,radius A";
RDebugUtils.currentLine=7340046;
 //BA.debugLineNum = 7340046;BA.debugLine="Dim jo As JavaObject = pnl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnl.getObject()));
RDebugUtils.currentLine=7340047;
 //BA.debugLineNum = 7340047;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(True))";
_jo.RunMethod("setClipToOutline",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=7340049;
 //BA.debugLineNum = 7340049;BA.debugLine="End Sub";
return "";
}
public String  _getorientation(b4a.example.astabmenu __ref,String _orientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getorientation", true))
	 {return ((String) Debug.delegate(ba, "getorientation", new Object[] {_orientation}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub GetOrientation(Orientation As String)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="If Orientation = getOrientation_AUTOMATIC Then";
if ((_orientation).equals(__ref._getorientation_automatic /*String*/ (null))) { 
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="If mBase.Width >= mBase.Height Then";
if (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()>=__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Return getOrientation_HORIZONTAL";
if (true) return __ref._getorientation_horizontal /*String*/ (null);
 }else {
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Return getOrientation_VERTICAL";
if (true) return __ref._getorientation_vertical /*String*/ (null);
 };
 }else 
{RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="else if Orientation = getOrientation_HORIZONTAL T";
if ((_orientation).equals(__ref._getorientation_horizontal /*String*/ (null))) { 
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="Return getOrientation_HORIZONTAL";
if (true) return __ref._getorientation_horizontal /*String*/ (null);
 }else {
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="Return getOrientation_VERTICAL";
if (true) return __ref._getorientation_vertical /*String*/ (null);
 }}
;
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="End Sub";
return "";
}
public String  _getorientation_horizontal(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getorientation_horizontal", true))
	 {return ((String) Debug.delegate(ba, "getorientation_horizontal", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub getOrientation_HORIZONTAL As String";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Return \"Horizontal\"";
if (true) return "Horizontal";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public String  _getcurrenttabunderlinegravity_topleft(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getcurrenttabunderlinegravity_topleft", true))
	 {return ((String) Debug.delegate(ba, "getcurrenttabunderlinegravity_topleft", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub getCurrentTabUnderlineGravity_TOPLEFT A";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Return \"TopLeft\"";
if (true) return "TopLeft";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public String  _tintbmp(b4a.example.astabmenu __ref,anywheresoftware.b4a.objects.ImageViewWrapper _img,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "tintbmp", true))
	 {return ((String) Debug.delegate(ba, "tintbmp", new Object[] {_img,_color}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Private Sub TintBmp(img As ImageView, color As Int";
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Dim jo As JavaObject=img";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_img.getObject()));
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="jo.RunMethod(\"setImageBitmap\",Array(img.Bitmap))";
_jo.RunMethod("setImageBitmap",new Object[]{(Object)(_img.getBitmap())});
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="jo.RunMethod(\"setColorFilter\",Array(Colors.rgb(Ge";
_jo.RunMethod("setColorFilter",new Object[]{(Object)(__c.Colors.RGB(__ref._getargb /*int[]*/ (null,_color)[(int) (1)],__ref._getargb /*int[]*/ (null,_color)[(int) (2)],__ref._getargb /*int[]*/ (null,_color)[(int) (3)]))});
RDebugUtils.currentLine=7471119;
 //BA.debugLineNum = 7471119;BA.debugLine="End Sub";
return "";
}
public String  _getbadge_middleleft(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getbadge_middleleft", true))
	 {return ((String) Debug.delegate(ba, "getbadge_middleleft", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub getBadge_MIDDLELEFT As String";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Return \"MiddleLeft\"";
if (true) return "MiddleLeft";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public String  _getbadge_topleft(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getbadge_topleft", true))
	 {return ((String) Debug.delegate(ba, "getbadge_topleft", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub getBadge_TOPLEFT As String";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Return \"TopLeft\"";
if (true) return "TopLeft";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public String  _getbadge_topmiddle(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getbadge_topmiddle", true))
	 {return ((String) Debug.delegate(ba, "getbadge_topmiddle", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub getBadge_TOPMIDDLE As String";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Return \"TopMiddle\"";
if (true) return "TopMiddle";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public String  _getbadge_topright(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getbadge_topright", true))
	 {return ((String) Debug.delegate(ba, "getbadge_topright", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub getBadge_TOPRIGHT As String";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Return \"TopRight\"";
if (true) return "TopRight";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public String  _beginupdate(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "beginupdate", true))
	 {return ((String) Debug.delegate(ba, "beginupdate", null));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub BeginUpdate";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="g_isInUpdate = True";
__ref._g_isinupdate /*boolean*/  = __c.True;
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="Private underlinewidthbyonlyicon As Int = 20dip";
_underlinewidthbyonlyicon = __c.DipToCurrent((int) (20));
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="Private txt_height As Float = 22dip";
_txt_height = (float) (__c.DipToCurrent((int) (22)));
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="Private icon_height As Float = 25dip";
_icon_height = (float) (__c.DipToCurrent((int) (25)));
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="Private badge_height As Float = 15dip";
_badge_height = (float) (__c.DipToCurrent((int) (15)));
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="Public TextIcon_Padding As Float = 0";
_texticon_padding = (float) (0);
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="Private m_TextFont As B4XFont";
_m_textfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="Type Tabs(TabText As String,Icon As B4XBitmap,";
;
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="Private g_Tabs As Tabs";
_g_tabs = new b4a.example.astabmenu._tabs();
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="Private CurrenIndex As Int = 0";
_currenindex = (int) (0);
RDebugUtils.currentLine=327701;
 //BA.debugLineNum = 327701;BA.debugLine="Private pl_clr As Int = xui.Color_White";
_pl_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=327702;
 //BA.debugLineNum = 327702;BA.debugLine="Private pl_width As Float = 2dip";
_pl_width = (float) (__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=327705;
 //BA.debugLineNum = 327705;BA.debugLine="Private ul_clr As Int = xui.Color_White";
_ul_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=327706;
 //BA.debugLineNum = 327706;BA.debugLine="Private ul_height As Float = 2dip";
_ul_height = (float) (__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=327708;
 //BA.debugLineNum = 327708;BA.debugLine="Private g_badge_gravity As String = \"Middle_Right";
_g_badge_gravity = "Middle_Right";
RDebugUtils.currentLine=327710;
 //BA.debugLineNum = 327710;BA.debugLine="Private g_commitmode As String";
_g_commitmode = "";
RDebugUtils.currentLine=327711;
 //BA.debugLineNum = 327711;BA.debugLine="Private g_orientation As String";
_g_orientation = "";
RDebugUtils.currentLine=327713;
 //BA.debugLineNum = 327713;BA.debugLine="Private g_TabStyle As String";
_g_tabstyle = "";
RDebugUtils.currentLine=327714;
 //BA.debugLineNum = 327714;BA.debugLine="Private g_TabTextColor As Int";
_g_tabtextcolor = 0;
RDebugUtils.currentLine=327715;
 //BA.debugLineNum = 327715;BA.debugLine="Private g_PartingLineVisible As Boolean";
_g_partinglinevisible = false;
RDebugUtils.currentLine=327717;
 //BA.debugLineNum = 327717;BA.debugLine="Private g_CurrentTabUnderline As Boolean";
_g_currenttabunderline = false;
RDebugUtils.currentLine=327718;
 //BA.debugLineNum = 327718;BA.debugLine="Private g_CurrentTabUnderlineAnimation As String";
_g_currenttabunderlineanimation = "";
RDebugUtils.currentLine=327719;
 //BA.debugLineNum = 327719;BA.debugLine="Private g_CurrentTabUnderlineAnimationDuration As";
_g_currenttabunderlineanimationduration = 0;
RDebugUtils.currentLine=327720;
 //BA.debugLineNum = 327720;BA.debugLine="Private g_CurrentTabUnderlineGravity As String";
_g_currenttabunderlinegravity = "";
RDebugUtils.currentLine=327722;
 //BA.debugLineNum = 327722;BA.debugLine="Private g_EnableSelectedTabTextColor As Boolean";
_g_enableselectedtabtextcolor = false;
RDebugUtils.currentLine=327723;
 //BA.debugLineNum = 327723;BA.debugLine="Private g_SelectedTabTextColor As Int";
_g_selectedtabtextcolor = 0;
RDebugUtils.currentLine=327725;
 //BA.debugLineNum = 327725;BA.debugLine="Private g_TabClickColor As Int";
_g_tabclickcolor = 0;
RDebugUtils.currentLine=327727;
 //BA.debugLineNum = 327727;BA.debugLine="Private g_TabStripMode As Boolean = False";
_g_tabstripmode = __c.False;
RDebugUtils.currentLine=327728;
 //BA.debugLineNum = 327728;BA.debugLine="Private g_HaloDuration As Int = 1000";
_g_haloduration = (int) (1000);
RDebugUtils.currentLine=327730;
 //BA.debugLineNum = 327730;BA.debugLine="Private g_BadgeLeftPadding As Float = 0";
_g_badgeleftpadding = (float) (0);
RDebugUtils.currentLine=327731;
 //BA.debugLineNum = 327731;BA.debugLine="Private g_BadgeTopPadding As Float = 0";
_g_badgetoppadding = (float) (0);
RDebugUtils.currentLine=327733;
 //BA.debugLineNum = 327733;BA.debugLine="Private g_isInUpdate As Boolean = False";
_g_isinupdate = __c.False;
RDebugUtils.currentLine=327736;
 //BA.debugLineNum = 327736;BA.debugLine="Private xpnl_tabbase As B4XView";
_xpnl_tabbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=327737;
 //BA.debugLineNum = 327737;BA.debugLine="Private xpnl_underline As B4XView";
_xpnl_underline = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=327739;
 //BA.debugLineNum = 327739;BA.debugLine="Public BorderPadding As Float = 0";
_borderpadding = (float) (0);
RDebugUtils.currentLine=327743;
 //BA.debugLineNum = 327743;BA.debugLine="End Sub";
return "";
}
public String  _commitchanges(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "commitchanges", true))
	 {return ((String) Debug.delegate(ba, "commitchanges", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub CommitChanges";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
public String  _createhaloeffect(b4a.example.astabmenu __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent,int _x,int _y,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "createhaloeffect", true))
	 {return ((String) Debug.delegate(ba, "createhaloeffect", new Object[] {_parent,_x,_y,_clr}));}
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _radius = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Private Sub CreateHaloEffect (Parent As B4XView, x";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="Dim radius As Int = 150dip";
_radius = __c.DipToCurrent((int) (150));
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, radius * 2, radius *";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_radius*2),(int) (_radius*2));
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(_p);
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX, cvs.Target";
_cvs.DrawCircle(_cvs.getTargetRect().getCenterX(),_cvs.getTargetRect().getCenterY(),(float) (_cvs.getTargetRect().getWidth()/(double)2),_clr,__c.True,(float) (0));
RDebugUtils.currentLine=7143431;
 //BA.debugLineNum = 7143431;BA.debugLine="Dim bmp As B4XBitmap = cvs.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _cvs.CreateBitmap();
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="CreateHaloEffectHelper(Parent,bmp, x, y, radius)";
__ref._createhaloeffecthelper /*void*/ (null,_parent,_bmp,_x,_y,_radius);
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="End Sub";
return "";
}
public void  _createhaloeffecthelper(b4a.example.astabmenu __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _x,int _y,int _radius) throws Exception{
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "createhaloeffecthelper", true))
	 {Debug.delegate(ba, "createhaloeffecthelper", new Object[] {_parent,_bmp,_x,_y,_radius}); return;}
ResumableSub_CreateHaloEffectHelper rsub = new ResumableSub_CreateHaloEffectHelper(this,__ref,_parent,_bmp,_x,_y,_radius);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateHaloEffectHelper extends BA.ResumableSub {
public ResumableSub_CreateHaloEffectHelper(b4a.example.astabmenu parent,b4a.example.astabmenu __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _x,int _y,int _radius) {
this.parent = parent;
this.__ref = __ref;
this._parent = _parent;
this._bmp = _bmp;
this._x = _x;
this._y = _y;
this._radius = _radius;
this.__ref = parent;
}
b4a.example.astabmenu __ref;
b4a.example.astabmenu parent;
anywheresoftware.b4a.objects.B4XViewWrapper _parent;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp;
int _x;
int _y;
int _radius;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _duration = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="astabmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Dim p As B4XView = iv";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="p.SetBitmap(bmp)";
_p.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="Parent.AddView(p, x, y, 0, 0)";
_parent.AddView((android.view.View)(_p.getObject()),_x,_y,(int) (0),(int) (0));
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="Dim duration As Int = g_HaloDuration";
_duration = __ref._g_haloduration /*int*/ ;
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="p.SetLayoutAnimated(duration, x - radius, y - rad";
_p.SetLayoutAnimated(_duration,(int) (_x-_radius),(int) (_y-_radius),(int) (2*_radius),(int) (2*_radius));
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="p.SetVisibleAnimated(duration, False)";
_p.SetVisibleAnimated(_duration,parent.__c.False);
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "astabmenu", "createhaloeffecthelper"),_duration);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimageview(b4a.example.astabmenu __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "createimageview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createimageview", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.ImageViewWrapper _tmp_imageview = null;
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Dim tmp_imageview As ImageView";
_tmp_imageview = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="tmp_imageview.Initialize(EventName)";
_tmp_imageview.Initialize(ba,_eventname);
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="Return tmp_imageview";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tmp_imageview.getObject()));
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.example.astabmenu __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.LabelWrapper _tmp_lbl = null;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim tmp_lbl As Label";
_tmp_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="tmp_lbl.Initialize(EventName)";
_tmp_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="r.Target = tmp_lbl";
_r.Target = (Object)(_tmp_lbl.getObject());
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="r.RunMethod2(\"setSingleLine\", True, \"java.lang.bo";
_r.RunMethod2("setSingleLine",BA.ObjectToString(__c.True),"java.lang.boolean");
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="r.RunMethod2(\"setEllipsize\", \"END\", \"android.text";
_r.RunMethod2("setEllipsize","END","android.text.TextUtils$TruncateAt");
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="Return tmp_lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tmp_lbl.getObject()));
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(b4a.example.astabmenu __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="ini_props(Props)";
__ref._ini_props /*String*/ (null,_props);
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="xpnl_tabbase = xui.CreatePanel(\"\")";
__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="xpnl_underline = xui.CreatePanel(\"\")";
__ref._xpnl_underline /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="mBase.AddView(xpnl_tabbase,0,0,0,0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="mBase.AddView(xpnl_underline,0,0,0,0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_underline /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="End Sub";
return "";
}
public String  _ini_props(b4a.example.astabmenu __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "ini_props", true))
	 {return ((String) Debug.delegate(ba, "ini_props", new Object[] {_props}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub ini_props(Props As Map)";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="g_commitmode = Props.Get(\"CommitMode\")";
__ref._g_commitmode /*String*/  = BA.ObjectToString(_props.Get((Object)("CommitMode")));
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="g_orientation = Props.Get(\"Orientation\")";
__ref._g_orientation /*String*/  = BA.ObjectToString(_props.Get((Object)("Orientation")));
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="g_TabStyle = Props.Get(\"TabStyle\")";
__ref._g_tabstyle /*String*/  = BA.ObjectToString(_props.Get((Object)("TabStyle")));
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="g_TabTextColor = xui.PaintOrColorToColor(Props.Ge";
__ref._g_tabtextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TabTextColor")));
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="g_PartingLineVisible = Props.Get(\"PartingLineVisi";
__ref._g_partinglinevisible /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("PartingLineVisible")));
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="g_CurrentTabUnderline = Props.Get(\"CurrentTabUnde";
__ref._g_currenttabunderline /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("CurrentTabUnderline")));
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="g_CurrentTabUnderlineAnimation = Props.Get(\"Curre";
__ref._g_currenttabunderlineanimation /*String*/  = BA.ObjectToString(_props.Get((Object)("CurrentTabUnderlineAnimation")));
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="g_CurrentTabUnderlineAnimationDuration = Props.Ge";
__ref._g_currenttabunderlineanimationduration /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("CurrentTabUnderlineAnimationDuration"))));
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="g_CurrentTabUnderlineGravity = Props.Get(\"Current";
__ref._g_currenttabunderlinegravity /*String*/  = BA.ObjectToString(_props.Get((Object)("CurrentTabUnderlineGravity")));
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="g_EnableSelectedTabTextColor = Props.Get(\"EnableS";
__ref._g_enableselectedtabtextcolor /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("EnableSelectedTabTextColor")));
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="g_SelectedTabTextColor = xui.PaintOrColorToColor(";
__ref._g_selectedtabtextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SelectedTabTextColor")));
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="g_TabClickColor = xui.PaintOrColorToColor(Props.G";
__ref._g_tabclickcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TabClickColor")));
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="g_Tabs = CreateTabs(\"\",Null,Null,-1,False,True,Te";
__ref._g_tabs /*b4a.example.astabmenu._tabs*/  = __ref._createtabs /*b4a.example.astabmenu._tabs*/ (null,"",(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.Null)),__c.Null,(int) (-1),__c.False,__c.True,__ref._texticon_padding /*float*/ ,__ref._m_textfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black,__ref._g_tabtextcolor /*int*/ );
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="End Sub";
return "";
}
public String  _endupdate(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "endupdate", true))
	 {return ((String) Debug.delegate(ba, "endupdate", null));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Public Sub EndUpdate";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="g_isInUpdate = False";
__ref._g_isinupdate /*boolean*/  = __c.False;
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _fonttobitmap(b4a.example.astabmenu __ref,String _text,boolean _ismaterialicons,float _fontsize,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "fonttobitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "fonttobitmap", new Object[] {_text,_ismaterialicons,_fontsize,_color}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub FontToBitmap (text As String, IsMateria";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="Dim cvs1 As B4XCanvas";
_cvs1 = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="cvs1.Initialize(p)";
_cvs1.Initialize(_p);
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="Dim fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="If IsMaterialIcons Then fnt = xui.CreateMaterialI";
if (_ismaterialicons) { 
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(_fontsize);}
else {
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFontAwesome(_fontsize);};
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(text, fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
_baseline = (int) (_cvs1.getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="cvs1.DrawText(text, cvs1.TargetRect.CenterX, Base";
_cvs1.DrawText(ba,_text,_cvs1.getTargetRect().getCenterX(),(float) (_baseline),_fnt,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=6881291;
 //BA.debugLineNum = 6881291;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = _cvs1.CreateBitmap();
RDebugUtils.currentLine=6881292;
 //BA.debugLineNum = 6881292;BA.debugLine="cvs1.Release";
_cvs1.Release();
RDebugUtils.currentLine=6881293;
 //BA.debugLineNum = 6881293;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=6881294;
 //BA.debugLineNum = 6881294;BA.debugLine="End Sub";
return null;
}
public int[]  _getargb(b4a.example.astabmenu __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getargb", true))
	 {return ((int[]) Debug.delegate(ba, "getargb", new Object[] {_color}));}
int[] _res = null;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()'ignore";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Private res(4) As Int";
_res = new int[(int) (4)];
;
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
_res[(int) (3)] = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="End Sub";
return null;
}
public String  _getbadge_gravity(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getbadge_gravity", true))
	 {return ((String) Debug.delegate(ba, "getbadge_gravity", null));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub getBadge_Gravity As String";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Return g_badge_gravity";
if (true) return __ref._g_badge_gravity /*String*/ ;
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public String  _getbadge_middleright(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getbadge_middleright", true))
	 {return ((String) Debug.delegate(ba, "getbadge_middleright", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub getBadge_MIDDLERIGHT As String";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Return \"MiddleRight\"";
if (true) return "MiddleRight";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbaseview(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getbaseview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbaseview", null));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub getBaseView As B4XView";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return null;
}
public String  _getcommitmode(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getcommitmode", true))
	 {return ((String) Debug.delegate(ba, "getcommitmode", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub getCommitMode As String";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Return g_commitmode";
if (true) return __ref._g_commitmode /*String*/ ;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return "";
}
public String  _getcommitmode_manually(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getcommitmode_manually", true))
	 {return ((String) Debug.delegate(ba, "getcommitmode_manually", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub getCommitMode_MANUALLY As String";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Return \"Manually\"";
if (true) return "Manually";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
public int  _getcurrentindex(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getcurrentindex", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentindex", null));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub getCurrentIndex As Int";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Return CurrenIndex";
if (true) return __ref._currenindex /*int*/ ;
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return 0;
}
public boolean  _getcurrenttabunderline(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getcurrenttabunderline", true))
	 {return ((Boolean) Debug.delegate(ba, "getcurrenttabunderline", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub getCurrentTabUnderline As Boolean";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Return g_CurrentTabUnderline";
if (true) return __ref._g_currenttabunderline /*boolean*/ ;
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return false;
}
public String  _getcurrenttabunderlineanimation(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getcurrenttabunderlineanimation", true))
	 {return ((String) Debug.delegate(ba, "getcurrenttabunderlineanimation", null));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub getCurrentTabUnderlineAnimation As Stri";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Return g_CurrentTabUnderlineAnimation";
if (true) return __ref._g_currenttabunderlineanimation /*String*/ ;
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return "";
}
public String  _getcurrenttabunderlineanimation_normal(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getcurrenttabunderlineanimation_normal", true))
	 {return ((String) Debug.delegate(ba, "getcurrenttabunderlineanimation_normal", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub getCurrentTabUnderlineAnimation_NORMAL";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Return \"Normal\"";
if (true) return "Normal";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public int  _getcurrenttabunderlineanimationduration(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getcurrenttabunderlineanimationduration", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrenttabunderlineanimationduration", null));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub getCurrentTabUnderlineAnimationDuration";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Return g_CurrentTabUnderlineAnimationDuration";
if (true) return __ref._g_currenttabunderlineanimationduration /*int*/ ;
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return 0;
}
public String  _getcurrenttabunderlinegravity(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getcurrenttabunderlinegravity", true))
	 {return ((String) Debug.delegate(ba, "getcurrenttabunderlinegravity", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub getCurrentTabUnderlineGravity As String";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Return g_CurrentTabUnderlineGravity";
if (true) return __ref._g_currenttabunderlinegravity /*String*/ ;
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public String  _getcurrenttabunderlinegravity_bottomright(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getcurrenttabunderlinegravity_bottomright", true))
	 {return ((String) Debug.delegate(ba, "getcurrenttabunderlinegravity_bottomright", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub getCurrentTabUnderlineGravity_BOTTOMRIG";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Return \"BottomRight\"";
if (true) return "BottomRight";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public boolean  _getenableselectedtabtextcolor(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getenableselectedtabtextcolor", true))
	 {return ((Boolean) Debug.delegate(ba, "getenableselectedtabtextcolor", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub getEnableSelectedTabTextColor As Boolea";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Return g_EnableSelectedTabTextColor";
if (true) return __ref._g_enableselectedtabtextcolor /*boolean*/ ;
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return false;
}
public int  _gethaloduration(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gethaloduration", true))
	 {return ((Integer) Debug.delegate(ba, "gethaloduration", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub getHaloDuration As Int";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Return g_HaloDuration";
if (true) return __ref._g_haloduration /*int*/ ;
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return 0;
}
public String  _getorientation_automatic(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getorientation_automatic", true))
	 {return ((String) Debug.delegate(ba, "getorientation_automatic", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub getOrientation_AUTOMATIC As String";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Return \"Automatic\"";
if (true) return "Automatic";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public String  _getorientation_vertical(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getorientation_vertical", true))
	 {return ((String) Debug.delegate(ba, "getorientation_vertical", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub getOrientation_VERTICAL As String";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Return \"Vertical\"";
if (true) return "Vertical";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public int  _getpartinglinecolor(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getpartinglinecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getpartinglinecolor", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub getPartingLineColor As Int";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Return pl_clr";
if (true) return __ref._pl_clr /*int*/ ;
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return 0;
}
public boolean  _getpartinglinevisible(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getpartinglinevisible", true))
	 {return ((Boolean) Debug.delegate(ba, "getpartinglinevisible", null));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub getPartingLineVisible As Boolean";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Return g_PartingLineVisible";
if (true) return __ref._g_partinglinevisible /*boolean*/ ;
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return false;
}
public float  _getpartinglinewidth(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getpartinglinewidth", true))
	 {return ((Float) Debug.delegate(ba, "getpartinglinewidth", null));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub getPartingLineWidth As Float";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Return pl_width";
if (true) return __ref._pl_width /*float*/ ;
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return 0f;
}
public int  _getselectedtabtextcolor(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getselectedtabtextcolor", true))
	 {return ((Integer) Debug.delegate(ba, "getselectedtabtextcolor", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub getSelectedTabTextColor As Int";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Return g_SelectedTabTextColor";
if (true) return __ref._g_selectedtabtextcolor /*int*/ ;
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return 0;
}
public int  _gettabbackgroundcolor(b4a.example.astabmenu __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabbackgroundcolor", true))
	 {return ((Integer) Debug.delegate(ba, "gettabbackgroundcolor", new Object[] {_index}));}
anywheresoftware.b4a.objects.B4XViewWrapper _tmp_tab = null;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub getTabBackgroundColor(index As Int) As";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim tmp_tab As B4XView = xpnl_tabbase.GetView(ind";
_tmp_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tmp_tab = __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Return tmp_tab.Color";
if (true) return _tmp_tab.getColor();
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _gettabbase(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabbase", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "gettabbase", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub getTabBase As B4XView";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Return xpnl_tabbase";
if (true) return __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return null;
}
public int  _gettabclickcolor(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabclickcolor", true))
	 {return ((Integer) Debug.delegate(ba, "gettabclickcolor", null));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub getTabClickColor As Int";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Return g_TabClickColor";
if (true) return __ref._g_tabclickcolor /*int*/ ;
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _gettabicon(b4a.example.astabmenu __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabicon", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "gettabicon", new Object[] {_index}));}
b4a.example.astabmenu._tabs _tmp_tab = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub getTabIcon(index As Int) As B4XBitmap";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
_tmp_tab = (b4a.example.astabmenu._tabs)(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).getTag());
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Return tmp_tab.Icon";
if (true) return _tmp_tab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="End Sub";
return null;
}
public b4a.example.astabmenu._tabs  _gettabproperties(b4a.example.astabmenu __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabproperties", true))
	 {return ((b4a.example.astabmenu._tabs) Debug.delegate(ba, "gettabproperties", new Object[] {_index}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub GetTabProperties(Index As Int) As Tabs";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Return xpnl_tabbase.GetView(Index).Tag";
if (true) return (b4a.example.astabmenu._tabs)(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).getTag());
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return null;
}
public int  _gettabsize(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabsize", true))
	 {return ((Integer) Debug.delegate(ba, "gettabsize", null));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Public Sub getTabSize As Int";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Return xpnl_tabbase.NumberOfViews";
if (true) return __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="End Sub";
return 0;
}
public boolean  _gettabstripmode(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabstripmode", true))
	 {return ((Boolean) Debug.delegate(ba, "gettabstripmode", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub getTabStripMode As Boolean";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Return g_TabStripMode";
if (true) return __ref._g_tabstripmode /*boolean*/ ;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return false;
}
public String  _gettabstyle(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabstyle", true))
	 {return ((String) Debug.delegate(ba, "gettabstyle", null));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub getTabStyle As String";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Return g_TabStyle";
if (true) return __ref._g_tabstyle /*String*/ ;
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="End Sub";
return "";
}
public String  _gettabstyle_icon(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabstyle_icon", true))
	 {return ((String) Debug.delegate(ba, "gettabstyle_icon", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub getTabStyle_ICON As String";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Return \"Icon\"";
if (true) return "Icon";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
public String  _gettabstyle_text(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabstyle_text", true))
	 {return ((String) Debug.delegate(ba, "gettabstyle_text", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub getTabStyle_TEXT As String";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Return \"Text\"";
if (true) return "Text";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public String  _gettabstyle_texticon(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabstyle_texticon", true))
	 {return ((String) Debug.delegate(ba, "gettabstyle_texticon", null));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub getTabStyle_TEXTICON As String";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Return \"TextIcon\"";
if (true) return "TextIcon";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public Object  _gettabtag(b4a.example.astabmenu __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabtag", true))
	 {return ((Object) Debug.delegate(ba, "gettabtag", new Object[] {_index}));}
b4a.example.astabmenu._tabs _tmp_tab = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub getTabTag(index As Int) As Object";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
_tmp_tab = (b4a.example.astabmenu._tabs)(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).getTag());
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Return tmp_tab.Tag";
if (true) return _tmp_tab.Tag /*Object*/ ;
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="End Sub";
return null;
}
public String  _gettabtext(b4a.example.astabmenu __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabtext", true))
	 {return ((String) Debug.delegate(ba, "gettabtext", new Object[] {_index}));}
b4a.example.astabmenu._tabs _tmp_tab = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub getTabText(index As Int) As String";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
_tmp_tab = (b4a.example.astabmenu._tabs)(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).getTag());
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Return tmp_tab.TabText";
if (true) return _tmp_tab.TabText /*String*/ ;
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="End Sub";
return "";
}
public int  _gettabtextcolor(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettabtextcolor", true))
	 {return ((Integer) Debug.delegate(ba, "gettabtextcolor", null));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Public Sub getTabTextColor As Int";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Return g_TabTextColor";
if (true) return __ref._g_tabtextcolor /*int*/ ;
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _gettextfont(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "gettextfont", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) Debug.delegate(ba, "gettextfont", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub getTextFont As B4XFont";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Return m_TextFont";
if (true) return __ref._m_textfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return null;
}
public int  _getunderlinecolor(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getunderlinecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getunderlinecolor", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub getUnderLineColor As Int";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Return ul_clr";
if (true) return __ref._ul_clr /*int*/ ;
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return 0;
}
public float  _getunderlineheight(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "getunderlineheight", true))
	 {return ((Float) Debug.delegate(ba, "getunderlineheight", null));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub getUnderLineHeight As Float";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Return ul_height";
if (true) return __ref._ul_height /*float*/ ;
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(b4a.example.astabmenu __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="m_TextFont = xui.CreateDefaultFont(15)";
__ref._m_textfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (15));
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="End Sub";
return "";
}
public String  _setunderline2newpos(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setunderline2newpos", true))
	 {return ((String) Debug.delegate(ba, "setunderline2newpos", null));}
int _currenttabunderlineanimationduration = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_targettab = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
float _tmp_top = 0f;
int _textwidth = 0;
float _tmp_left = 0f;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub SetUnderline2NewPos";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim CurrentTabUnderlineAnimationDuration As Int =";
_currenttabunderlineanimationduration = (int)(BA.ObjectToNumber(((__ref._g_isinupdate /*boolean*/ ==__c.False) ? ((Object)(__ref._g_currenttabunderlineanimationduration /*int*/ )) : ((Object)(0)))));
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="If CurrenIndex >= xpnl_tabbase.NumberOfViews Then";
if (__ref._currenindex /*int*/ >=__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()) { 
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="CurrenIndex = 0";
__ref._currenindex /*int*/  = (int) (0);
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="TabClick(xpnl_tabbase.GetView(0),True,g_EnableSe";
__ref._tabclick /*String*/ (null,__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)),__c.True,__ref._g_enableselectedtabtextcolor /*boolean*/ ,__c.False);
 };
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Dim xpnl_targettab As B4XView = xpnl_tabbase.GetV";
_xpnl_targettab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_targettab = __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(__ref._currenindex /*int*/ );
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Dim xlbl_text As B4XView = xpnl_targettab.GetView";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _xpnl_targettab.GetView((int) (0));
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="If g_CurrentTabUnderlineAnimation = \"Normal\" Then";
if ((__ref._g_currenttabunderlineanimation /*String*/ ).equals("Normal")) { 
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="If GetOrientation(g_orientation) = getOrientatio";
if ((__ref._getorientation /*String*/ (null,__ref._g_orientation /*String*/ )).equals(__ref._getorientation_horizontal /*String*/ (null))) { 
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="If g_TabStripMode = False Then";
if (__ref._g_tabstripmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="Dim tmp_top As Float = xlbl_text.Top + xlbl_te";
_tmp_top = (float) (_xlbl_text.getTop()+_xlbl_text.getHeight());
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="If g_TabStyle = \"Text\" Or g_TabStyle = \"TextIc";
if ((__ref._g_tabstyle /*String*/ ).equals("Text") || (__ref._g_tabstyle /*String*/ ).equals("TextIcon")) { 
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="Dim textwidth As Int =  Max(1dip,MeasureTextW";
_textwidth = (int) (__c.Max(__c.DipToCurrent((int) (1)),__ref._measuretextwidth /*int*/ (null,_xlbl_text.getText(),_xlbl_text.getFont())));
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="If g_CurrentTabUnderlineGravity <> getCurrent";
if ((__ref._g_currenttabunderlinegravity /*String*/ ).equals(__ref._getcurrenttabunderlinegravity_bottomright /*String*/ (null)) == false) { 
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="If g_TabStyle = \"TextIcon\" Then";
if ((__ref._g_tabstyle /*String*/ ).equals("TextIcon")) { 
RDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="tmp_top = xpnl_targettab.Height/2 - icon_he";
_tmp_top = (float) (_xpnl_targettab.getHeight()/(double)2-__ref._icon_height /*float*/ /(double)2);
 }else {
RDebugUtils.currentLine=917531;
 //BA.debugLineNum = 917531;BA.debugLine="tmp_top = xpnl_targettab.Height/2 - xlbl_te";
_tmp_top = (float) (_xpnl_targettab.getHeight()/(double)2-_xlbl_text.getHeight()/(double)2);
 };
 };
RDebugUtils.currentLine=917535;
 //BA.debugLineNum = 917535;BA.debugLine="xpnl_underline.SetLayoutAnimated(CurrentTabUn";
__ref._xpnl_underline /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(_currenttabunderlineanimationduration,(int) (_xpnl_targettab.getLeft()+_xpnl_targettab.getWidth()/(double)2-_textwidth/(double)2),(int) (_tmp_top),_textwidth,(int) (__ref._ul_height /*float*/ ));
 }else 
{RDebugUtils.currentLine=917536;
 //BA.debugLineNum = 917536;BA.debugLine="Else If g_TabStyle = \"Icon\" Then 'only Icon";
if ((__ref._g_tabstyle /*String*/ ).equals("Icon")) { 
RDebugUtils.currentLine=917537;
 //BA.debugLineNum = 917537;BA.debugLine="If g_CurrentTabUnderlineGravity = getCurrentT";
if ((__ref._g_currenttabunderlinegravity /*String*/ ).equals(__ref._getcurrenttabunderlinegravity_bottomright /*String*/ (null))) { 
RDebugUtils.currentLine=917538;
 //BA.debugLineNum = 917538;BA.debugLine="tmp_top = xpnl_tabbase.Height/2 + 15dip";
_tmp_top = (float) (__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2+__c.DipToCurrent((int) (15)));
 }else {
RDebugUtils.currentLine=917540;
 //BA.debugLineNum = 917540;BA.debugLine="tmp_top = xpnl_tabbase.Height/2 - icon_heigh";
_tmp_top = (float) (__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._icon_height /*float*/ /(double)2.5);
 };
RDebugUtils.currentLine=917542;
 //BA.debugLineNum = 917542;BA.debugLine="xpnl_underline.SetLayoutAnimated(CurrentTabUn";
__ref._xpnl_underline /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(_currenttabunderlineanimationduration,(int) (_xpnl_targettab.getLeft()+_xpnl_targettab.getWidth()/(double)2-__ref._underlinewidthbyonlyicon /*int*/ /(double)2),(int) (_tmp_top),__ref._underlinewidthbyonlyicon /*int*/ ,(int) (__ref._ul_height /*float*/ ));
 }}
;
 }else {
RDebugUtils.currentLine=917547;
 //BA.debugLineNum = 917547;BA.debugLine="Dim tmp_top As Float = 0";
_tmp_top = (float) (0);
RDebugUtils.currentLine=917548;
 //BA.debugLineNum = 917548;BA.debugLine="If g_CurrentTabUnderlineGravity <> getCurrentT";
if ((__ref._g_currenttabunderlinegravity /*String*/ ).equals(__ref._getcurrenttabunderlinegravity_topleft /*String*/ (null)) == false) { 
RDebugUtils.currentLine=917549;
 //BA.debugLineNum = 917549;BA.debugLine="tmp_top = xpnl_targettab.Height - ul_height";
_tmp_top = (float) (_xpnl_targettab.getHeight()-__ref._ul_height /*float*/ );
 };
RDebugUtils.currentLine=917551;
 //BA.debugLineNum = 917551;BA.debugLine="xpnl_underline.SetLayoutAnimated(CurrentTabUnd";
__ref._xpnl_underline /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(_currenttabunderlineanimationduration,_xpnl_targettab.getLeft(),(int) (_tmp_top),_xpnl_targettab.getWidth(),(int) (__ref._ul_height /*float*/ ));
 };
 }else {
RDebugUtils.currentLine=917555;
 //BA.debugLineNum = 917555;BA.debugLine="Dim tmp_left As Float = 0";
_tmp_left = (float) (0);
RDebugUtils.currentLine=917556;
 //BA.debugLineNum = 917556;BA.debugLine="If g_CurrentTabUnderlineGravity = getCurrentTab";
if ((__ref._g_currenttabunderlinegravity /*String*/ ).equals(__ref._getcurrenttabunderlinegravity_bottomright /*String*/ (null))) { 
RDebugUtils.currentLine=917557;
 //BA.debugLineNum = 917557;BA.debugLine="tmp_left = xpnl_targettab.Width - ul_height";
_tmp_left = (float) (_xpnl_targettab.getWidth()-__ref._ul_height /*float*/ );
 };
RDebugUtils.currentLine=917559;
 //BA.debugLineNum = 917559;BA.debugLine="If g_TabStripMode = False Then";
if (__ref._g_tabstripmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=917561;
 //BA.debugLineNum = 917561;BA.debugLine="xpnl_underline.SetLayoutAnimated(CurrentTabUnd";
__ref._xpnl_underline /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(_currenttabunderlineanimationduration,(int) (_tmp_left),(int) (_xpnl_targettab.getTop()+_xpnl_targettab.getHeight()/(double)4),(int) (__ref._ul_height /*float*/ ),(int) (_xpnl_targettab.getHeight()/(double)2));
 }else {
RDebugUtils.currentLine=917563;
 //BA.debugLineNum = 917563;BA.debugLine="xpnl_underline.SetLayoutAnimated(CurrentTabUnd";
__ref._xpnl_underline /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(_currenttabunderlineanimationduration,(int) (_tmp_left),_xpnl_targettab.getTop(),(int) (__ref._ul_height /*float*/ ),_xpnl_targettab.getHeight());
 };
 };
 };
RDebugUtils.currentLine=917594;
 //BA.debugLineNum = 917594;BA.debugLine="If GetOrientation(g_orientation) = getOrientation";
if ((__ref._getorientation /*String*/ (null,__ref._g_orientation /*String*/ )).equals(__ref._getorientation_horizontal /*String*/ (null))) { 
RDebugUtils.currentLine=917595;
 //BA.debugLineNum = 917595;BA.debugLine="xpnl_underline.SetColorAndBorder(ul_clr,0,0,xpnl";
__ref._xpnl_underline /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._ul_clr /*int*/ ,(int) (0),(int) (0),(int) (__ref._xpnl_underline /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
 }else {
RDebugUtils.currentLine=917597;
 //BA.debugLineNum = 917597;BA.debugLine="xpnl_underline.SetColorAndBorder(ul_clr,0,0,xpnl";
__ref._xpnl_underline /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._ul_clr /*int*/ ,(int) (0),(int) (0),(int) (__ref._xpnl_underline /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2));
 };
RDebugUtils.currentLine=917600;
 //BA.debugLineNum = 917600;BA.debugLine="End Sub";
return "";
}
public int  _measuretextwidth(b4a.example.astabmenu __ref,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "measuretextwidth", true))
	 {return ((Integer) Debug.delegate(ba, "measuretextwidth", new Object[] {_text,_font1}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub MeasureTextWidth(Text As String, Font1";
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Private bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
_bmp.InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="Private cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="Return cvs.MeasureStringWidth(Text, Font1.ToNativ";
if (true) return (int) (_cvs.MeasureStringWidth(_text,(android.graphics.Typeface)(_font1.ToNativeFont().getObject()),_font1.getSize()));
RDebugUtils.currentLine=7274514;
 //BA.debugLineNum = 7274514;BA.debugLine="End Sub";
return 0;
}
public String  _removealltabs(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "removealltabs", true))
	 {return ((String) Debug.delegate(ba, "removealltabs", null));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub RemoveAllTabs";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="xpnl_tabbase.RemoveAllViews";
__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="End Sub";
return "";
}
public String  _removeat(b4a.example.astabmenu __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "removeat", true))
	 {return ((String) Debug.delegate(ba, "removeat", new Object[] {_index}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _tmp_base = null;
b4a.example.astabmenu._tabs _tmp_tabs = null;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub RemoveAt(index As Int)";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="xpnl_tabbase.GetView(index).RemoveViewFromParent";
__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).RemoveViewFromParent();
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="mBase.GetView(index + 2).RemoveViewFromParent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (_index+2)).RemoveViewFromParent();
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="For i = 0 To xpnl_tabbase.NumberOfViews -1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="Dim tmp_base As B4XView = xpnl_tabbase.GetView(i";
_tmp_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tmp_base = __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i);
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="Dim tmp_tabs As Tabs = tmp_base.Tag";
_tmp_tabs = (b4a.example.astabmenu._tabs)(_tmp_base.getTag());
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="tmp_tabs.index = i";
_tmp_tabs.Index /*int*/  = _i;
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="tmp_base.Tag = tmp_tabs";
_tmp_base.setTag((Object)(_tmp_tabs));
 }
};
RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="setCurrentTabUnderline(g_CurrentTabUnderline)";
__ref._setcurrenttabunderline /*String*/ (null,__ref._g_currenttabunderline /*boolean*/ );
RDebugUtils.currentLine=6357004;
 //BA.debugLineNum = 6357004;BA.debugLine="End Sub";
return "";
}
public String  _setcurrenttabunderline(b4a.example.astabmenu __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setcurrenttabunderline", true))
	 {return ((String) Debug.delegate(ba, "setcurrenttabunderline", new Object[] {_show}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub setCurrentTabUnderline(show As Boolean)";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="g_CurrentTabUnderline = show";
__ref._g_currenttabunderline /*boolean*/  = _show;
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="xpnl_underline.Visible = show";
__ref._xpnl_underline /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(_show);
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="SetUnderline2NewPos";
__ref._setunderline2newpos /*String*/ (null);
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="End Sub";
return "";
}
public String  _setbadge_gravity(b4a.example.astabmenu __ref,String _badge_gravity) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setbadge_gravity", true))
	 {return ((String) Debug.delegate(ba, "setbadge_gravity", new Object[] {_badge_gravity}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub setBadge_Gravity(badge_gravity As Strin";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="g_badge_gravity = badge_gravity";
__ref._g_badge_gravity /*String*/  = _badge_gravity;
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
if ((__ref._g_commitmode /*String*/ ).equals(__ref._getcommitmode_automatic /*String*/ (null))) { 
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());};
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="End Sub";
return "";
}
public String  _setbadge_setleftpadding(b4a.example.astabmenu __ref,float _padding) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setbadge_setleftpadding", true))
	 {return ((String) Debug.delegate(ba, "setbadge_setleftpadding", new Object[] {_padding}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub setBadge_setLeftPadding(padding As Floa";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="g_BadgeLeftPadding = padding";
__ref._g_badgeleftpadding /*float*/  = _padding;
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public String  _setbadge_settoppadding(b4a.example.astabmenu __ref,float _padding) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setbadge_settoppadding", true))
	 {return ((String) Debug.delegate(ba, "setbadge_settoppadding", new Object[] {_padding}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub setBadge_setTopPadding(padding As Float";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="g_BadgeTopPadding = padding";
__ref._g_badgetoppadding /*float*/  = _padding;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public String  _setcommitmode(b4a.example.astabmenu __ref,String _commit_mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setcommitmode", true))
	 {return ((String) Debug.delegate(ba, "setcommitmode", new Object[] {_commit_mode}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub setCommitMode(commit_mode As String)";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="g_commitmode = commit_mode";
__ref._g_commitmode /*String*/  = _commit_mode;
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return "";
}
public String  _setcurrenttabunderlineanimation(b4a.example.astabmenu __ref,String _animation) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setcurrenttabunderlineanimation", true))
	 {return ((String) Debug.delegate(ba, "setcurrenttabunderlineanimation", new Object[] {_animation}));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub setCurrentTabUnderlineAnimation(animati";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="g_CurrentTabUnderlineAnimation = animation";
__ref._g_currenttabunderlineanimation /*String*/  = _animation;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return "";
}
public String  _setcurrenttabunderlineanimationduration(b4a.example.astabmenu __ref,int _duration) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setcurrenttabunderlineanimationduration", true))
	 {return ((String) Debug.delegate(ba, "setcurrenttabunderlineanimationduration", new Object[] {_duration}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub setCurrentTabUnderlineAnimationDuration";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="g_CurrentTabUnderlineAnimationDuration = duration";
__ref._g_currenttabunderlineanimationduration /*int*/  = _duration;
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return "";
}
public String  _setcurrenttabunderlinegravity(b4a.example.astabmenu __ref,String _underline_gravity) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setcurrenttabunderlinegravity", true))
	 {return ((String) Debug.delegate(ba, "setcurrenttabunderlinegravity", new Object[] {_underline_gravity}));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub setCurrentTabUnderlineGravity(underline";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="g_CurrentTabUnderlineGravity = underline_gravity";
__ref._g_currenttabunderlinegravity /*String*/  = _underline_gravity;
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="SetUnderline2NewPos";
__ref._setunderline2newpos /*String*/ (null);
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
if ((__ref._g_commitmode /*String*/ ).equals(__ref._getcommitmode_automatic /*String*/ (null))) { 
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());};
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="End Sub";
return "";
}
public String  _setenableselectedtabtextcolor(b4a.example.astabmenu __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setenableselectedtabtextcolor", true))
	 {return ((String) Debug.delegate(ba, "setenableselectedtabtextcolor", new Object[] {_enable}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub setEnableSelectedTabTextColor(enable As";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="g_EnableSelectedTabTextColor = enable";
__ref._g_enableselectedtabtextcolor /*boolean*/  = _enable;
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return "";
}
public String  _sethaloduration(b4a.example.astabmenu __ref,int _duration) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "sethaloduration", true))
	 {return ((String) Debug.delegate(ba, "sethaloduration", new Object[] {_duration}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub setHaloDuration(duration As Int)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="g_HaloDuration = duration";
__ref._g_haloduration /*int*/  = _duration;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public String  _setpartinglinecolor(b4a.example.astabmenu __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setpartinglinecolor", true))
	 {return ((String) Debug.delegate(ba, "setpartinglinecolor", new Object[] {_clr}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub setPartingLineColor(clr As Int)";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="pl_clr = clr";
__ref._pl_clr /*int*/  = _clr;
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="End Sub";
return "";
}
public String  _setpartinglinevisible(b4a.example.astabmenu __ref,boolean _visible) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setpartinglinevisible", true))
	 {return ((String) Debug.delegate(ba, "setpartinglinevisible", new Object[] {_visible}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub setPartingLineVisible(visible As Boolea";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="g_PartingLineVisible = visible";
__ref._g_partinglinevisible /*boolean*/  = _visible;
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
if ((__ref._g_commitmode /*String*/ ).equals(__ref._getcommitmode_automatic /*String*/ (null))) { 
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());};
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="End Sub";
return "";
}
public String  _setpartinglinewidth(b4a.example.astabmenu __ref,float _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setpartinglinewidth", true))
	 {return ((String) Debug.delegate(ba, "setpartinglinewidth", new Object[] {_width}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub setPartingLineWidth(width As Float)";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="pl_width = width";
__ref._pl_width /*float*/  = _width;
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="End Sub";
return "";
}
public String  _setselectedtabtextcolor(b4a.example.astabmenu __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setselectedtabtextcolor", true))
	 {return ((String) Debug.delegate(ba, "setselectedtabtextcolor", new Object[] {_color}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub setSelectedTabTextColor(color As Int)";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="g_SelectedTabTextColor = color";
__ref._g_selectedtabtextcolor /*int*/  = _color;
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
public String  _settab(b4a.example.astabmenu __ref,int _index,boolean _withclickevent,boolean _withhalo) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "settab", true))
	 {return ((String) Debug.delegate(ba, "settab", new Object[] {_index,_withclickevent,_withhalo}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub SetTab(index As Int,withClickEvent As B";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="TabClick(xpnl_tabbase.GetView(index),withClickEve";
__ref._tabclick /*String*/ (null,__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index),_withclickevent,_withhalo,__c.False);
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return "";
}
public String  _tabclick(b4a.example.astabmenu __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_base,boolean _withevent,boolean _withhalo,boolean _longclick) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "tabclick", true))
	 {return ((String) Debug.delegate(ba, "tabclick", new Object[] {_xpnl_base,_withevent,_withhalo,_longclick}));}
float _scale = 0f;
b4a.example.astabmenu._tabs _tmp_tab = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _tmp_base = null;
b4a.example.astabmenu._tabs _tmp_tabs = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
anywheresoftware.b4a.objects.B4XViewWrapper _ximg_icon = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub TabClick(xpnl_base As B4XView,withEven";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Dim scale As Float = 1";
_scale = (float) (1);
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="Dim tmp_tab As Tabs = xpnl_base.Tag";
_tmp_tab = (b4a.example.astabmenu._tabs)(_xpnl_base.getTag());
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="CurrenIndex = tmp_tab.index";
__ref._currenindex /*int*/  = _tmp_tab.Index /*int*/ ;
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="If withHalo = True And g_isInUpdate = False Then";
if (_withhalo==__c.True && __ref._g_isinupdate /*boolean*/ ==__c.False) { 
__ref._createhaloeffect /*String*/ (null,_xpnl_base,(int) (_xpnl_base.getWidth()/(double)2),(int) (_xpnl_base.getHeight()/(double)2),__ref._g_tabclickcolor /*int*/ );};
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="For i = 0 To xpnl_tabbase.NumberOfViews -1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="Dim tmp_base As B4XView = xpnl_tabbase.GetView(i";
_tmp_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tmp_base = __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i);
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="Dim tmp_tabs As Tabs = tmp_base.Tag";
_tmp_tabs = (b4a.example.astabmenu._tabs)(_tmp_base.getTag());
RDebugUtils.currentLine=6815758;
 //BA.debugLineNum = 6815758;BA.debugLine="Dim xlbl_text As B4XView = tmp_base.GetView(0)";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _tmp_base.GetView((int) (0));
RDebugUtils.currentLine=6815759;
 //BA.debugLineNum = 6815759;BA.debugLine="Dim ximg_icon As B4XView = tmp_base.GetView(1)";
_ximg_icon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_ximg_icon = _tmp_base.GetView((int) (1));
RDebugUtils.currentLine=6815761;
 //BA.debugLineNum = 6815761;BA.debugLine="If tmp_tabs.index <> tmp_tab.index Then";
if (_tmp_tabs.Index /*int*/ !=_tmp_tab.Index /*int*/ ) { 
RDebugUtils.currentLine=6815762;
 //BA.debugLineNum = 6815762;BA.debugLine="xlbl_text.TextColor = g_TabTextColor";
_xlbl_text.setTextColor(__ref._g_tabtextcolor /*int*/ );
RDebugUtils.currentLine=6815763;
 //BA.debugLineNum = 6815763;BA.debugLine="If g_TabStyle = \"Icon\" Or g_TabStyle = \"TextIco";
if ((__ref._g_tabstyle /*String*/ ).equals("Icon") || (__ref._g_tabstyle /*String*/ ).equals("TextIcon")) { 
RDebugUtils.currentLine=6815765;
 //BA.debugLineNum = 6815765;BA.debugLine="If tmp_tabs.Icon.IsInitialized Then	ximg_icon.";
if (_tmp_tabs.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()) { 
_ximg_icon.SetBitmap((android.graphics.Bitmap)(_tmp_tabs.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_ximg_icon.getWidth()*_scale),(int) (_ximg_icon.getHeight()*_scale),__c.True).getObject()));};
RDebugUtils.currentLine=6815766;
 //BA.debugLineNum = 6815766;BA.debugLine="TintBmp(ximg_icon,g_TabTextColor)";
__ref._tintbmp /*String*/ (null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_ximg_icon.getObject())),__ref._g_tabtextcolor /*int*/ );
 };
 }else {
RDebugUtils.currentLine=6815769;
 //BA.debugLineNum = 6815769;BA.debugLine="xlbl_text.TextColor = g_SelectedTabTextColor";
_xlbl_text.setTextColor(__ref._g_selectedtabtextcolor /*int*/ );
RDebugUtils.currentLine=6815770;
 //BA.debugLineNum = 6815770;BA.debugLine="If g_TabStyle = \"Icon\" Or g_TabStyle = \"TextIco";
if ((__ref._g_tabstyle /*String*/ ).equals("Icon") || (__ref._g_tabstyle /*String*/ ).equals("TextIcon")) { 
RDebugUtils.currentLine=6815772;
 //BA.debugLineNum = 6815772;BA.debugLine="If tmp_tabs.Icon.IsInitialized Then	ximg_icon.";
if (_tmp_tabs.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()) { 
_ximg_icon.SetBitmap((android.graphics.Bitmap)(_tmp_tabs.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_ximg_icon.getWidth()*_scale),(int) (_ximg_icon.getHeight()*_scale),__c.True).getObject()));};
RDebugUtils.currentLine=6815773;
 //BA.debugLineNum = 6815773;BA.debugLine="TintBmp(ximg_icon,g_SelectedTabTextColor)";
__ref._tintbmp /*String*/ (null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_ximg_icon.getObject())),__ref._g_selectedtabtextcolor /*int*/ );
 };
 };
 }
};
RDebugUtils.currentLine=6815778;
 //BA.debugLineNum = 6815778;BA.debugLine="SetUnderline2NewPos";
__ref._setunderline2newpos /*String*/ (null);
RDebugUtils.currentLine=6815780;
 //BA.debugLineNum = 6815780;BA.debugLine="If withEvent = True And g_isInUpdate = False Then";
if (_withevent==__c.True && __ref._g_isinupdate /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=6815781;
 //BA.debugLineNum = 6815781;BA.debugLine="If LongClick = False Then";
if (_longclick==__c.False) { 
RDebugUtils.currentLine=6815782;
 //BA.debugLineNum = 6815782;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TabC";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TabClick",(int) (1))) { 
RDebugUtils.currentLine=6815783;
 //BA.debugLineNum = 6815783;BA.debugLine="CallSub2(mCallBack, mEventName & \"_TabClick\",t";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TabClick",(Object)(_tmp_tab.Index /*int*/ ));
 };
 }else {
RDebugUtils.currentLine=6815786;
 //BA.debugLineNum = 6815786;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TabL";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TabLongClick",(int) (1))) { 
RDebugUtils.currentLine=6815787;
 //BA.debugLineNum = 6815787;BA.debugLine="CallSub2(mCallBack, mEventName & \"_TabLongClic";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TabLongClick",(Object)(_tmp_tab.Index /*int*/ ));
 };
 };
 };
RDebugUtils.currentLine=6815791;
 //BA.debugLineNum = 6815791;BA.debugLine="End Sub";
return "";
}
public String  _settabbackgroundcolor(b4a.example.astabmenu __ref,int _index,int _colour) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "settabbackgroundcolor", true))
	 {return ((String) Debug.delegate(ba, "settabbackgroundcolor", new Object[] {_index,_colour}));}
anywheresoftware.b4a.objects.B4XViewWrapper _tmp_tab = null;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub setTabBackgroundColor (index As Int, co";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim tmp_tab As B4XView = xpnl_tabbase.GetView(ind";
_tmp_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tmp_tab = __ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="tmp_tab.Color = colour";
_tmp_tab.setColor(_colour);
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="End Sub";
return "";
}
public String  _settabclickcolor(b4a.example.astabmenu __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "settabclickcolor", true))
	 {return ((String) Debug.delegate(ba, "settabclickcolor", new Object[] {_color}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub setTabClickColor(color As Int)";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="g_TabClickColor = color";
__ref._g_tabclickcolor /*int*/  = _color;
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return "";
}
public String  _settabicon(b4a.example.astabmenu __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _icon) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "settabicon", true))
	 {return ((String) Debug.delegate(ba, "settabicon", new Object[] {_index,_icon}));}
b4a.example.astabmenu._tabs _tmp_tab = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub setTabIcon(index As Int,icon As B4XBitm";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
_tmp_tab = (b4a.example.astabmenu._tabs)(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).getTag());
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="tmp_tab.Icon = icon";
_tmp_tab.Icon /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _icon;
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="xpnl_tabbase.GetView(index).Tag = tmp_tab";
__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).setTag((Object)(_tmp_tab));
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
if ((__ref._g_commitmode /*String*/ ).equals(__ref._getcommitmode_automatic /*String*/ (null))) { 
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());};
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="End Sub";
return "";
}
public String  _settabstripmode(b4a.example.astabmenu __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "settabstripmode", true))
	 {return ((String) Debug.delegate(ba, "settabstripmode", new Object[] {_enable}));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub setTabStripMode(enable As Boolean)";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="g_TabStripMode = enable";
__ref._g_tabstripmode /*boolean*/  = _enable;
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="SetUnderline2NewPos";
__ref._setunderline2newpos /*String*/ (null);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="End Sub";
return "";
}
public String  _settabstyle(b4a.example.astabmenu __ref,String _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "settabstyle", true))
	 {return ((String) Debug.delegate(ba, "settabstyle", new Object[] {_style}));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub setTabStyle(style As String)";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="g_TabStyle = style";
__ref._g_tabstyle /*String*/  = _style;
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Base_Resize(xpnl_tabbase.Width,xpnl_tabbase.Heigh";
__ref._base_resize /*String*/ (null,__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="SetUnderline2NewPos";
__ref._setunderline2newpos /*String*/ (null);
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="End Sub";
return "";
}
public String  _settabtag(b4a.example.astabmenu __ref,int _index,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "settabtag", true))
	 {return ((String) Debug.delegate(ba, "settabtag", new Object[] {_index,_tag}));}
b4a.example.astabmenu._tabs _tmp_tab = null;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub setTabTag(index As Int,tag As Object)";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
_tmp_tab = (b4a.example.astabmenu._tabs)(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).getTag());
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="tmp_tab.Tag = tag";
_tmp_tab.Tag /*Object*/  = _tag;
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="xpnl_tabbase.GetView(index).Tag = tmp_tab";
__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).setTag((Object)(_tmp_tab));
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="End Sub";
return "";
}
public String  _settabtext(b4a.example.astabmenu __ref,int _index,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "settabtext", true))
	 {return ((String) Debug.delegate(ba, "settabtext", new Object[] {_index,_text}));}
b4a.example.astabmenu._tabs _tmp_tab = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub setTabText(index As Int,text As String)";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
_tmp_tab = (b4a.example.astabmenu._tabs)(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).getTag());
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="tmp_tab.TabText = text";
_tmp_tab.TabText /*String*/  = _text;
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="xpnl_tabbase.GetView(index).Tag = tmp_tab";
__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).setTag((Object)(_tmp_tab));
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
if ((__ref._g_commitmode /*String*/ ).equals(__ref._getcommitmode_automatic /*String*/ (null))) { 
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());};
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="End Sub";
return "";
}
public String  _settabtextcolor(b4a.example.astabmenu __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "settabtextcolor", true))
	 {return ((String) Debug.delegate(ba, "settabtextcolor", new Object[] {_color}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Public Sub setTabTextColor(color As Int)";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="g_TabTextColor = color";
__ref._g_tabtextcolor /*int*/  = _color;
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
if ((__ref._g_commitmode /*String*/ ).equals(__ref._getcommitmode_automatic /*String*/ (null))) { 
__ref._base_resize /*String*/ (null,__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());};
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="SetUnderline2NewPos";
__ref._setunderline2newpos /*String*/ (null);
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="End Sub";
return "";
}
public String  _settextfont(b4a.example.astabmenu __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "settextfont", true))
	 {return ((String) Debug.delegate(ba, "settextfont", new Object[] {_xfont}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub setTextFont(xFont As B4XFont)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="m_TextFont = xFont";
__ref._m_textfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="g_Tabs.xFont = xFont";
__ref._g_tabs /*b4a.example.astabmenu._tabs*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="End Sub";
return "";
}
public String  _setunderlinecolor(b4a.example.astabmenu __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setunderlinecolor", true))
	 {return ((String) Debug.delegate(ba, "setunderlinecolor", new Object[] {_clr}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub setUnderLineColor(clr As Int)";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="ul_clr = clr";
__ref._ul_clr /*int*/  = _clr;
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="End Sub";
return "";
}
public String  _setunderlineheight(b4a.example.astabmenu __ref,float _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "setunderlineheight", true))
	 {return ((String) Debug.delegate(ba, "setunderlineheight", new Object[] {_height}));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub setUnderLineHeight(height As Float)";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="ul_height = height";
__ref._ul_height /*float*/  = _height;
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="SetUnderline2NewPos";
__ref._setunderline2newpos /*String*/ (null);
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="End Sub";
return "";
}
public String  _viewenable(b4a.example.astabmenu __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "viewenable", true))
	 {return ((String) Debug.delegate(ba, "viewenable", new Object[] {_enable}));}
int _i = 0;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub ViewEnable(enable As Boolean)";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="For i = 0 To xpnl_tabbase.NumberOfViews -1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="xpnl_tabbase.GetView(i).Enabled = enable";
__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i).setEnabled(_enable);
 }
};
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="End Sub";
return "";
}
public String  _visibleat(b4a.example.astabmenu __ref,int _index,boolean _visible) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "visibleat", true))
	 {return ((String) Debug.delegate(ba, "visibleat", new Object[] {_index,_visible}));}
b4a.example.astabmenu._tabs _tmp_tab = null;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub VisibleAt(index As Int,visible As Boole";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
_tmp_tab = (b4a.example.astabmenu._tabs)(__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).getTag());
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="tmp_tab.Visible = visible";
_tmp_tab.Visible /*boolean*/  = _visible;
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="xpnl_tabbase.GetView(index).Tag = tmp_tab";
__ref._xpnl_tabbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_index).setTag((Object)(_tmp_tab));
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="setCurrentTabUnderline(g_CurrentTabUnderline)";
__ref._setcurrenttabunderline /*String*/ (null,__ref._g_currenttabunderline /*boolean*/ );
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_base_click(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "xpnl_base_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_base_click", null));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub xpnl_base_Click";
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="TabClick(Sender,True,g_EnableSelectedTabTextColor";
__ref._tabclick /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.True,__ref._g_enableselectedtabtextcolor /*boolean*/ ,__c.False);
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_base_longclick(b4a.example.astabmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="astabmenu";
if (Debug.shouldDelegate(ba, "xpnl_base_longclick", true))
	 {return ((String) Debug.delegate(ba, "xpnl_base_longclick", null));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Private Sub xpnl_base_LongClick";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="TabClick(Sender,True,g_EnableSelectedTabTextColor";
__ref._tabclick /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.True,__ref._g_enableselectedtabtextcolor /*boolean*/ ,__c.True);
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return "";
}
}