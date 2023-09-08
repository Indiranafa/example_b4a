package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class astabmenu_subs_0 {


public static RemoteObject  _addtab(RemoteObject __ref,RemoteObject _backgroundcolor,RemoteObject _text,RemoteObject _icon,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("AddTab (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1024);
if (RapidSub.canDelegate("addtab")) { return __ref.runUserSub(false, "astabmenu","addtab", __ref, _backgroundcolor, _text, _icon, _tag);}
Debug.locals.put("BackgroundColor", _backgroundcolor);
Debug.locals.put("Text", _text);
Debug.locals.put("Icon", _icon);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 1024;BA.debugLine="Public Sub AddTab(BackgroundColor As Int,Text As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1025;BA.debugLine="InternAddTab(CreateTabs(Text,Icon,Tag,xpnl_tabbas";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_internaddtab" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4a.example.astabmenu.class, "_createtabs" /*RemoteObject*/ ,(Object)(_text),(Object)(_icon),(Object)(_tag),(Object)(__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews")),(Object)(astabmenu.__c.getField(true,"False")),(Object)(astabmenu.__c.getField(true,"True")),(Object)(__ref.getField(true,"_texticon_padding" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_g_tabs" /*RemoteObject*/ ).getField(false,"xFont" /*RemoteObject*/ )),(Object)(_backgroundcolor),(Object)(__ref.getField(false,"_g_tabs" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ )))));
 BA.debugLineNum = 1026;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtab2(RemoteObject __ref,RemoteObject _tabproperties) throws Exception{
try {
		Debug.PushSubsStack("AddTab2 (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1028);
if (RapidSub.canDelegate("addtab2")) { return __ref.runUserSub(false, "astabmenu","addtab2", __ref, _tabproperties);}
Debug.locals.put("TabProperties", _tabproperties);
 BA.debugLineNum = 1028;BA.debugLine="Public Sub AddTab2(TabProperties As Tabs)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1029;BA.debugLine="TabProperties.Index = xpnl_tabbase.NumberOfViews";
Debug.JustUpdateDeviceLine();
_tabproperties.setField ("Index" /*RemoteObject*/ ,__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"));
 BA.debugLineNum = 1030;BA.debugLine="InternAddTab(TabProperties)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_internaddtab" /*RemoteObject*/ ,(Object)(_tabproperties));
 BA.debugLineNum = 1031;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _badge_getcolor(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("Badge_getColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,747);
if (RapidSub.canDelegate("badge_getcolor")) { return __ref.runUserSub(false, "astabmenu","badge_getcolor", __ref, _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 747;BA.debugLine="Public Sub Badge_getColor(index As Int) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 748;BA.debugLine="Return xpnl_tabbase.GetView(index).GetView(2).Col";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"getColor");
 BA.debugLineNum = 749;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _badge_getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Badge_getHeight (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,780);
if (RapidSub.canDelegate("badge_getheight")) { return __ref.runUserSub(false, "astabmenu","badge_getheight", __ref);}
 BA.debugLineNum = 780;BA.debugLine="Public Sub Badge_getHeight As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 781;BA.debugLine="Return badge_height";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_badge_height" /*RemoteObject*/ );
 BA.debugLineNum = 782;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _badge_getlabel(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("Badge_getLabel (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,752);
if (RapidSub.canDelegate("badge_getlabel")) { return __ref.runUserSub(false, "astabmenu","badge_getlabel", __ref, _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 752;BA.debugLine="Public Sub Badge_getLabel(index As Int) As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 753;BA.debugLine="Return xpnl_tabbase.GetView(index).GetView(2)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 754;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _badge_getvisible(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("Badge_getVisible (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,792);
if (RapidSub.canDelegate("badge_getvisible")) { return __ref.runUserSub(false, "astabmenu","badge_getvisible", __ref, _index);}
RemoteObject _tmp_tab = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
Debug.locals.put("index", _index);
 BA.debugLineNum = 792;BA.debugLine="Public Sub Badge_getVisible(index As Int) As Boole";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 793;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
Debug.JustUpdateDeviceLine();
_tmp_tab = (__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"getTag"));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 794;BA.debugLine="Return tmp_tab.badgevisible";
Debug.JustUpdateDeviceLine();
if (true) return _tmp_tab.getField(true,"BadgeVisible" /*RemoteObject*/ );
 BA.debugLineNum = 795;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _badge_setcolor(RemoteObject __ref,RemoteObject _index,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("Badge_setColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,735);
if (RapidSub.canDelegate("badge_setcolor")) { return __ref.runUserSub(false, "astabmenu","badge_setcolor", __ref, _index, _color);}
RemoteObject _tmp_base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_badge = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("index", _index);
Debug.locals.put("color", _color);
 BA.debugLineNum = 735;BA.debugLine="Public Sub Badge_setColor(index As Int,color As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 736;BA.debugLine="Dim tmp_base As B4XView = xpnl_tabbase.GetView(in";
Debug.JustUpdateDeviceLine();
_tmp_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tmp_base = __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index));Debug.locals.put("tmp_base", _tmp_base);Debug.locals.put("tmp_base", _tmp_base);
 BA.debugLineNum = 737;BA.debugLine="Dim xlbl_badge As B4XView = tmp_base.GetView(2)";
Debug.JustUpdateDeviceLine();
_xlbl_badge = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_badge = _tmp_base.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("xlbl_badge", _xlbl_badge);Debug.locals.put("xlbl_badge", _xlbl_badge);
 BA.debugLineNum = 738;BA.debugLine="xlbl_badge.Color = color";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runMethod(true,"setColor",_color);
 BA.debugLineNum = 739;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _badge_setheight(RemoteObject __ref,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("Badge_setHeight (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,775);
if (RapidSub.canDelegate("badge_setheight")) { return __ref.runUserSub(false, "astabmenu","badge_setheight", __ref, _size);}
Debug.locals.put("size", _size);
 BA.debugLineNum = 775;BA.debugLine="Public Sub Badge_setHeight(size As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 776;BA.debugLine="badge_height = size";
Debug.JustUpdateDeviceLine();
__ref.setField ("_badge_height" /*RemoteObject*/ ,_size);
 BA.debugLineNum = 777;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_commitmode" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcommitmode_automatic" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));};
 BA.debugLineNum = 778;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _badge_settext(RemoteObject __ref,RemoteObject _index,RemoteObject _number) throws Exception{
try {
		Debug.PushSubsStack("Badge_setText (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,762);
if (RapidSub.canDelegate("badge_settext")) { return __ref.runUserSub(false, "astabmenu","badge_settext", __ref, _index, _number);}
RemoteObject _tmp_base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_badge = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("index", _index);
Debug.locals.put("number", _number);
 BA.debugLineNum = 762;BA.debugLine="Public Sub Badge_setText(index As Int,number As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 763;BA.debugLine="Dim tmp_base As B4XView = xpnl_tabbase.GetView(in";
Debug.JustUpdateDeviceLine();
_tmp_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tmp_base = __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index));Debug.locals.put("tmp_base", _tmp_base);Debug.locals.put("tmp_base", _tmp_base);
 BA.debugLineNum = 764;BA.debugLine="Dim xlbl_badge As B4XView = tmp_base.GetView(2)";
Debug.JustUpdateDeviceLine();
_xlbl_badge = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_badge = _tmp_base.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("xlbl_badge", _xlbl_badge);Debug.locals.put("xlbl_badge", _xlbl_badge);
 BA.debugLineNum = 765;BA.debugLine="If number < 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_number,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 766;BA.debugLine="xlbl_badge.Text = \"\"";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 }else 
{ BA.debugLineNum = 767;BA.debugLine="Else If number > 99 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_number,BA.numberCast(double.class, 99))) { 
 BA.debugLineNum = 768;BA.debugLine="xlbl_badge.Text = \"9+\"";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runMethod(true,"setText",BA.ObjectToCharSequence("9+"));
 }else {
 BA.debugLineNum = 770;BA.debugLine="xlbl_badge.Text = number";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runMethod(true,"setText",BA.ObjectToCharSequence(_number));
 }}
;
 BA.debugLineNum = 772;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _badge_settextcolor(RemoteObject __ref,RemoteObject _index,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("Badge_setTextColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,741);
if (RapidSub.canDelegate("badge_settextcolor")) { return __ref.runUserSub(false, "astabmenu","badge_settextcolor", __ref, _index, _color);}
RemoteObject _tmp_base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_badge = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("index", _index);
Debug.locals.put("color", _color);
 BA.debugLineNum = 741;BA.debugLine="Public Sub Badge_setTextColor(index As Int,color A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 742;BA.debugLine="Dim tmp_base As B4XView = xpnl_tabbase.GetView(in";
Debug.JustUpdateDeviceLine();
_tmp_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tmp_base = __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index));Debug.locals.put("tmp_base", _tmp_base);Debug.locals.put("tmp_base", _tmp_base);
 BA.debugLineNum = 743;BA.debugLine="Dim xlbl_badge As B4XView = tmp_base.GetView(2)";
Debug.JustUpdateDeviceLine();
_xlbl_badge = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_badge = _tmp_base.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("xlbl_badge", _xlbl_badge);Debug.locals.put("xlbl_badge", _xlbl_badge);
 BA.debugLineNum = 744;BA.debugLine="xlbl_badge.TextColor = color";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runMethod(true,"setTextColor",_color);
 BA.debugLineNum = 745;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _badge_setvisible(RemoteObject __ref,RemoteObject _index,RemoteObject _visible) throws Exception{
try {
		Debug.PushSubsStack("Badge_setVisible (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,785);
if (RapidSub.canDelegate("badge_setvisible")) { return __ref.runUserSub(false, "astabmenu","badge_setvisible", __ref, _index, _visible);}
RemoteObject _tmp_tab = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
Debug.locals.put("index", _index);
Debug.locals.put("visible", _visible);
 BA.debugLineNum = 785;BA.debugLine="Public Sub Badge_setVisible(index As Int,visible A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 786;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
Debug.JustUpdateDeviceLine();
_tmp_tab = (__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"getTag"));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 787;BA.debugLine="tmp_tab.badgevisible = visible";
Debug.JustUpdateDeviceLine();
_tmp_tab.setField ("BadgeVisible" /*RemoteObject*/ ,_visible);
 BA.debugLineNum = 788;BA.debugLine="xpnl_tabbase.GetView(index).Tag = tmp_tab";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"setTag",(_tmp_tab));
 BA.debugLineNum = 789;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_commitmode" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcommitmode_automatic" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));};
 BA.debugLineNum = 790;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _badge_setvisibleeasy(RemoteObject __ref,RemoteObject _index,RemoteObject _number,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("Badge_setVisibleEasy (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,728);
if (RapidSub.canDelegate("badge_setvisibleeasy")) { return __ref.runUserSub(false, "astabmenu","badge_setvisibleeasy", __ref, _index, _number, _color);}
Debug.locals.put("index", _index);
Debug.locals.put("number", _number);
Debug.locals.put("color", _color);
 BA.debugLineNum = 728;BA.debugLine="Public Sub Badge_setVisibleEasy(index As Int,numbe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 729;BA.debugLine="Badge_setColor(index,color)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_badge_setcolor" /*RemoteObject*/ ,(Object)(_index),(Object)(_color));
 BA.debugLineNum = 730;BA.debugLine="Badge_setText(index,number)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_badge_settext" /*RemoteObject*/ ,(Object)(_index),(Object)(_number));
 BA.debugLineNum = 731;BA.debugLine="Badge_setVisible(index,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_badge_setvisible" /*RemoteObject*/ ,(Object)(_index),(Object)(astabmenu.__c.getField(true,"True")));
 BA.debugLineNum = 732;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "astabmenu","base_resize", __ref, _width, _height);}
RemoteObject _scale = RemoteObject.createImmutable(0f);
RemoteObject _ishorizontal = RemoteObject.createImmutable(false);
RemoteObject _tmp_counter = RemoteObject.createImmutable(0);
RemoteObject _tmp_texticoncenter = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _tmp_tab = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
RemoteObject _tmp_index = RemoteObject.createImmutable(0);
RemoteObject _xpnl_base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_text = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _ximg_icon = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xpnl_partingline = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_badge = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 266;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 267;BA.debugLine="Dim scale As Float = 1";
Debug.JustUpdateDeviceLine();
_scale = BA.numberCast(float.class, 1);Debug.locals.put("scale", _scale);Debug.locals.put("scale", _scale);
 BA.debugLineNum = 271;BA.debugLine="If Width > Height Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_width,_height)) { 
 BA.debugLineNum = 273;BA.debugLine="SetCircleClip(mBase,Height/2)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setcircleclip" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 274;BA.debugLine="SetCircleClip(xpnl_tabbase,Height/2)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setcircleclip" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))));
 }else {
 BA.debugLineNum = 278;BA.debugLine="SetCircleClip(mBase,Width/2)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setcircleclip" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 279;BA.debugLine="SetCircleClip(xpnl_tabbase,Width/2)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setcircleclip" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0))));
 };
 BA.debugLineNum = 282;BA.debugLine="xpnl_tabbase.SetLayoutAnimated(0,0 + BorderPaddin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),__ref.getField(true,"_borderpadding" /*RemoteObject*/ )}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),__ref.getField(true,"_borderpadding" /*RemoteObject*/ )}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,__ref.getField(true,"_borderpadding" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_borderpadding" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 0))));
 BA.debugLineNum = 284;BA.debugLine="Dim isHorizontal As Boolean = False";
Debug.JustUpdateDeviceLine();
_ishorizontal = astabmenu.__c.getField(true,"False");Debug.locals.put("isHorizontal", _ishorizontal);Debug.locals.put("isHorizontal", _ishorizontal);
 BA.debugLineNum = 285;BA.debugLine="If GetOrientation(g_orientation) = getOrientation";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_g_orientation" /*RemoteObject*/ ))),__ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation_horizontal" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 286;BA.debugLine="isHorizontal = True";
Debug.JustUpdateDeviceLine();
_ishorizontal = astabmenu.__c.getField(true,"True");Debug.locals.put("isHorizontal", _ishorizontal);
 };
 BA.debugLineNum = 289;BA.debugLine="xpnl_underline.Visible = g_CurrentTabUnderline";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_underline" /*RemoteObject*/ ).runMethod(true,"setVisible",__ref.getField(true,"_g_currenttabunderline" /*RemoteObject*/ ));
 BA.debugLineNum = 292;BA.debugLine="Dim tmp_counter As Int = 0";
Debug.JustUpdateDeviceLine();
_tmp_counter = BA.numberCast(int.class, 0);Debug.locals.put("tmp_counter", _tmp_counter);Debug.locals.put("tmp_counter", _tmp_counter);
 BA.debugLineNum = 293;BA.debugLine="Dim tmp_TextIconCenter As Boolean = False";
Debug.JustUpdateDeviceLine();
_tmp_texticoncenter = astabmenu.__c.getField(true,"False");Debug.locals.put("tmp_TextIconCenter", _tmp_texticoncenter);Debug.locals.put("tmp_TextIconCenter", _tmp_texticoncenter);
 BA.debugLineNum = 294;BA.debugLine="For i = 0 To xpnl_tabbase.NumberOfViews -1";
Debug.JustUpdateDeviceLine();
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17) ;_i = ((int)(0 + _i + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 295;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(i).Ta";
Debug.JustUpdateDeviceLine();
_tmp_tab = (__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).runMethod(false,"getTag"));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 296;BA.debugLine="If tmp_tab.Visible = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tmp_tab.getField(true,"Visible" /*RemoteObject*/ ),astabmenu.__c.getField(true,"True"))) { 
 BA.debugLineNum = 297;BA.debugLine="tmp_counter = tmp_counter +1";
Debug.JustUpdateDeviceLine();
_tmp_counter = RemoteObject.solve(new RemoteObject[] {_tmp_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("tmp_counter", _tmp_counter);
 };
 BA.debugLineNum = 299;BA.debugLine="If g_TabStyle = \"TextIcon\" And (tmp_tab.Icon.IsI";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstyle" /*RemoteObject*/ ),BA.ObjectToString("TextIcon")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_tmp_tab.getField(false,"Icon" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),astabmenu.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_tmp_tab.getField(true,"TabText" /*RemoteObject*/ ),RemoteObject.createImmutable("")))))) { 
 BA.debugLineNum = 300;BA.debugLine="tmp_TextIconCenter = True";
Debug.JustUpdateDeviceLine();
_tmp_texticoncenter = astabmenu.__c.getField(true,"True");Debug.locals.put("tmp_TextIconCenter", _tmp_texticoncenter);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 305;BA.debugLine="Dim tmp_index As Int = -1";
Debug.JustUpdateDeviceLine();
_tmp_index = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("tmp_index", _tmp_index);Debug.locals.put("tmp_index", _tmp_index);
 BA.debugLineNum = 306;BA.debugLine="For i = 0 To xpnl_tabbase.NumberOfViews -1";
Debug.JustUpdateDeviceLine();
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 307;BA.debugLine="Dim xpnl_base As B4XView = xpnl_tabbase.GetView(";
Debug.JustUpdateDeviceLine();
_xpnl_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_base = __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("xpnl_base", _xpnl_base);Debug.locals.put("xpnl_base", _xpnl_base);
 BA.debugLineNum = 309;BA.debugLine="Dim tmp_tab As Tabs = xpnl_base.Tag";
Debug.JustUpdateDeviceLine();
_tmp_tab = (_xpnl_base.runMethod(false,"getTag"));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 310;BA.debugLine="Dim xlbl_text As B4XView = xpnl_base.GetView(0)";
Debug.JustUpdateDeviceLine();
_xlbl_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_text = _xpnl_base.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xlbl_text", _xlbl_text);Debug.locals.put("xlbl_text", _xlbl_text);
 BA.debugLineNum = 311;BA.debugLine="Dim ximg_icon As B4XView = xpnl_base.GetView(1)";
Debug.JustUpdateDeviceLine();
_ximg_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_ximg_icon = _xpnl_base.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("ximg_icon", _ximg_icon);Debug.locals.put("ximg_icon", _ximg_icon);
 BA.debugLineNum = 313;BA.debugLine="xpnl_base.Color =tmp_tab.BackgroundColor";
Debug.JustUpdateDeviceLine();
_xpnl_base.runMethod(true,"setColor",_tmp_tab.getField(true,"BackgroundColor" /*RemoteObject*/ ));
 BA.debugLineNum = 315;BA.debugLine="If tmp_tab.Visible = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tmp_tab.getField(true,"Visible" /*RemoteObject*/ ),astabmenu.__c.getField(true,"True"))) { 
 BA.debugLineNum = 316;BA.debugLine="tmp_index = tmp_index +1";
Debug.JustUpdateDeviceLine();
_tmp_index = RemoteObject.solve(new RemoteObject[] {_tmp_index,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("tmp_index", _tmp_index);
 BA.debugLineNum = 317;BA.debugLine="If isHorizontal = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ishorizontal,astabmenu.__c.getField(true,"True"))) { 
 BA.debugLineNum = 319;BA.debugLine="xpnl_base.SetLayoutAnimated(0,(xpnl_tabbase.Wi";
Debug.JustUpdateDeviceLine();
_xpnl_base.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),_tmp_counter}, "/",0, 0)),_tmp_index}, "*",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, astabmenu.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),_tmp_counter}, "/",0, 0))))),(Object)(__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 }else {
 BA.debugLineNum = 322;BA.debugLine="xpnl_base.SetLayoutAnimated(0,0,(xpnl_tabbase.";
Debug.JustUpdateDeviceLine();
_xpnl_base.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),_tmp_counter}, "/",0, 0)),_tmp_index}, "*",0, 0))),(Object)(__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, astabmenu.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),_tmp_counter}, "/",0, 0))))));
 };
 }else {
 BA.debugLineNum = 325;BA.debugLine="xpnl_base.Width = 0";
Debug.JustUpdateDeviceLine();
_xpnl_base.runMethod(true,"setWidth",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 328;BA.debugLine="mBase.GetView(tmp_tab.index + 2).Visible = g_Par";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_tmp_tab.getField(true,"Index" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "+",1, 1))).runMethod(true,"setVisible",__ref.getField(true,"_g_partinglinevisible" /*RemoteObject*/ ));
 BA.debugLineNum = 329;BA.debugLine="If g_PartingLineVisible = True  Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_partinglinevisible" /*RemoteObject*/ ),astabmenu.__c.getField(true,"True"))) { 
 BA.debugLineNum = 330;BA.debugLine="Dim xpnl_partingline As B4XView = mBase.GetView";
Debug.JustUpdateDeviceLine();
_xpnl_partingline = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_partingline = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_tmp_tab.getField(true,"Index" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "+",1, 1)));Debug.locals.put("xpnl_partingline", _xpnl_partingline);Debug.locals.put("xpnl_partingline", _xpnl_partingline);
 BA.debugLineNum = 332;BA.debugLine="If isHorizontal = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ishorizontal,astabmenu.__c.getField(true,"True"))) { 
 BA.debugLineNum = 333;BA.debugLine="xpnl_partingline.SetLayoutAnimated(0,xpnl_base";
Debug.JustUpdateDeviceLine();
_xpnl_partingline.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getLeft"),_xpnl_base.runMethod(true,"getWidth"),__ref.getField(true,"_pl_width" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "+-/",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(4)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_pl_width" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 }else {
 BA.debugLineNum = 335;BA.debugLine="xpnl_partingline.SetLayoutAnimated(0,xpnl_base";
Debug.JustUpdateDeviceLine();
_xpnl_partingline.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(4)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getTop"),_xpnl_base.runMethod(true,"getHeight"),__ref.getField(true,"_pl_width" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "+-/",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_pl_width" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 338;BA.debugLine="xpnl_partingline.SetColorAndBorder(pl_clr,0,0,x";
Debug.JustUpdateDeviceLine();
_xpnl_partingline.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_pl_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_partingline.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 339;BA.debugLine="If tmp_tab.index = xpnl_tabbase.NumberOfViews -";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tmp_tab.getField(true,"Index" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 340;BA.debugLine="xpnl_partingline.Visible = False";
Debug.JustUpdateDeviceLine();
_xpnl_partingline.runMethod(true,"setVisible",astabmenu.__c.getField(true,"False"));
 };
 };
 BA.debugLineNum = 344;BA.debugLine="Dim xlbl_badge As B4XView = xpnl_base.GetView(2)";
Debug.JustUpdateDeviceLine();
_xlbl_badge = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_badge = _xpnl_base.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("xlbl_badge", _xlbl_badge);Debug.locals.put("xlbl_badge", _xlbl_badge);
 BA.debugLineNum = 345;BA.debugLine="xlbl_badge.Visible = tmp_tab.badgevisible";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runMethod(true,"setVisible",_tmp_tab.getField(true,"BadgeVisible" /*RemoteObject*/ ));
 BA.debugLineNum = 347;BA.debugLine="If g_TabStyle = \"Text\" Then 'only Text";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstyle" /*RemoteObject*/ ),BA.ObjectToString("Text"))) { 
 BA.debugLineNum = 349;BA.debugLine="xlbl_text.Visible = True";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setVisible",astabmenu.__c.getField(true,"True"));
 BA.debugLineNum = 350;BA.debugLine="ximg_icon.Visible = False";
Debug.JustUpdateDeviceLine();
_ximg_icon.runMethod(true,"setVisible",astabmenu.__c.getField(true,"False"));
 BA.debugLineNum = 352;BA.debugLine="xlbl_text.Text = tmp_tab.TabText";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setText",BA.ObjectToCharSequence(_tmp_tab.getField(true,"TabText" /*RemoteObject*/ )));
 BA.debugLineNum = 353;BA.debugLine="xlbl_text.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 354;BA.debugLine="If CurrenIndex = tmp_tab.index Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_currenindex" /*RemoteObject*/ ),BA.numberCast(double.class, _tmp_tab.getField(true,"Index" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 355;BA.debugLine="xlbl_text.TextColor = g_SelectedTabTextColor";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setTextColor",__ref.getField(true,"_g_selectedtabtextcolor" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 357;BA.debugLine="xlbl_text.TextColor = tmp_tab.TextColor";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setTextColor",_tmp_tab.getField(true,"TextColor" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 360;BA.debugLine="xlbl_text.Font = tmp_tab.xFont";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(false,"setFont",_tmp_tab.getField(false,"xFont" /*RemoteObject*/ ));
 BA.debugLineNum = 362;BA.debugLine="xlbl_text.SetLayoutAnimated(0,0,xpnl_base.Heigh";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_txt_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(_xpnl_base.runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_txt_height" /*RemoteObject*/ ))));
 BA.debugLineNum = 365;BA.debugLine="If tmp_tab.badgevisible = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tmp_tab.getField(true,"BadgeVisible" /*RemoteObject*/ ),astabmenu.__c.getField(true,"True"))) { 
 BA.debugLineNum = 366;BA.debugLine="If g_CurrentTabUnderlineGravity = getCurrentTa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_currenttabunderlinegravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcurrenttabunderlinegravity_topleft" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_g_orientation" /*RemoteObject*/ ))),__ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation_horizontal" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 367;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xlbl_text.Widt";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xlbl_text.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xlbl_text.runMethod(true,"getTop"),_xlbl_text.runMethod(true,"getHeight"),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "++",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 369;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xlbl_text.Widt";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xlbl_text.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xlbl_text.runMethod(true,"getTop"),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "-+",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 };
 };
 }else 
{ BA.debugLineNum = 373;BA.debugLine="Else If g_TabStyle = \"Icon\" Then 'only Icon";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstyle" /*RemoteObject*/ ),BA.ObjectToString("Icon"))) { 
 BA.debugLineNum = 375;BA.debugLine="xlbl_text.Visible = False";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setVisible",astabmenu.__c.getField(true,"False"));
 BA.debugLineNum = 376;BA.debugLine="ximg_icon.Visible = True";
Debug.JustUpdateDeviceLine();
_ximg_icon.runMethod(true,"setVisible",astabmenu.__c.getField(true,"True"));
 BA.debugLineNum = 378;BA.debugLine="ximg_icon.SetLayoutAnimated(0,xpnl_base.Width/2";
Debug.JustUpdateDeviceLine();
_ximg_icon.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_icon_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_icon_height" /*RemoteObject*/ ))));
 BA.debugLineNum = 381;BA.debugLine="If CurrenIndex = tmp_tab.index Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_currenindex" /*RemoteObject*/ ),BA.numberCast(double.class, _tmp_tab.getField(true,"Index" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 383;BA.debugLine="If tmp_tab.Icon.IsInitialized Then ximg_icon.S";
Debug.JustUpdateDeviceLine();
if (_tmp_tab.getField(false,"Icon" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_ximg_icon.runVoidMethod ("SetBitmap",(Object)((_tmp_tab.getField(false,"Icon" /*RemoteObject*/ ).runMethod(false,"Resize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getWidth"),_scale}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getHeight"),_scale}, "*",0, 0))),(Object)(astabmenu.__c.getField(true,"True"))).getObject())));};
 BA.debugLineNum = 384;BA.debugLine="TintBmp(ximg_icon,g_SelectedTabTextColor)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_tintbmp" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _ximg_icon.getObject()),(Object)(__ref.getField(true,"_g_selectedtabtextcolor" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 387;BA.debugLine="If tmp_tab.Icon.IsInitialized Then ximg_icon.S";
Debug.JustUpdateDeviceLine();
if (_tmp_tab.getField(false,"Icon" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_ximg_icon.runVoidMethod ("SetBitmap",(Object)((_tmp_tab.getField(false,"Icon" /*RemoteObject*/ ).runMethod(false,"Resize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getWidth"),_scale}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getHeight"),_scale}, "*",0, 0))),(Object)(astabmenu.__c.getField(true,"True"))).getObject())));};
 BA.debugLineNum = 388;BA.debugLine="TintBmp(ximg_icon,g_TabTextColor)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_tintbmp" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _ximg_icon.getObject()),(Object)(__ref.getField(true,"_g_tabtextcolor" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 391;BA.debugLine="If tmp_tab.badgevisible = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tmp_tab.getField(true,"BadgeVisible" /*RemoteObject*/ ),astabmenu.__c.getField(true,"True"))) { 
 BA.debugLineNum = 392;BA.debugLine="If g_badge_gravity = getBadge_MIDDLELEFT Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_badge_gravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getbadge_middleleft" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 393;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Widt";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(1.2),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "/+",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else 
{ BA.debugLineNum = 394;BA.debugLine="else If g_badge_gravity = getBadge_TOPLEFT The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_badge_gravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getbadge_topleft" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 395;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Widt";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(1.2),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getTop"),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "-/+",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else 
{ BA.debugLineNum = 396;BA.debugLine="else If g_badge_gravity = getBadge_TOPMIDDLE T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_badge_gravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getbadge_topmiddle" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 397;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Widt";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getTop"),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "-/+",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else 
{ BA.debugLineNum = 398;BA.debugLine="else If g_badge_gravity = getBadge_TOPRIGHT Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_badge_gravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getbadge_topright" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 399;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Widt";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(1.2),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/+/-+",3, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getTop"),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "-/+",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 401;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Widt";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(1.2),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/+/-+",3, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "/+",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }}}}
;
 };
 }else 
{ BA.debugLineNum = 406;BA.debugLine="Else If g_TabStyle = \"TextIcon\" Then 'text and i";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstyle" /*RemoteObject*/ ),BA.ObjectToString("TextIcon"))) { 
 BA.debugLineNum = 408;BA.debugLine="xlbl_text.Visible = True";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setVisible",astabmenu.__c.getField(true,"True"));
 BA.debugLineNum = 409;BA.debugLine="ximg_icon.Visible = True";
Debug.JustUpdateDeviceLine();
_ximg_icon.runMethod(true,"setVisible",astabmenu.__c.getField(true,"True"));
 BA.debugLineNum = 411;BA.debugLine="xlbl_text.Text = tmp_tab.TabText";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setText",BA.ObjectToCharSequence(_tmp_tab.getField(true,"TabText" /*RemoteObject*/ )));
 BA.debugLineNum = 412;BA.debugLine="xlbl_text.SetTextAlignment(\"TOP\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("TOP")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 413;BA.debugLine="xlbl_text.Font = tmp_tab.xFont";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(false,"setFont",_tmp_tab.getField(false,"xFont" /*RemoteObject*/ ));
 BA.debugLineNum = 415;BA.debugLine="If tmp_TextIconCenter = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tmp_texticoncenter,astabmenu.__c.getField(true,"False"))) { 
 BA.debugLineNum = 416;BA.debugLine="If isHorizontal = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ishorizontal,astabmenu.__c.getField(true,"True"))) { 
 BA.debugLineNum = 417;BA.debugLine="xlbl_text.SetLayoutAnimated(0,0,xpnl_base.Hei";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(_xpnl_base.runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_txt_height" /*RemoteObject*/ ))));
 BA.debugLineNum = 418;BA.debugLine="ximg_icon.SetLayoutAnimated(0,xpnl_base.Width";
Debug.JustUpdateDeviceLine();
_ximg_icon.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),_tmp_tab.getField(true,"TextIconPadding" /*RemoteObject*/ )}, "/--",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_icon_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_icon_height" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 420;BA.debugLine="xlbl_text.SetLayoutAnimated(0,0,xpnl_base.Hei";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(_xpnl_base.runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_txt_height" /*RemoteObject*/ ))));
 BA.debugLineNum = 421;BA.debugLine="ximg_icon.SetLayoutAnimated(0,xpnl_base.Width";
Debug.JustUpdateDeviceLine();
_ximg_icon.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),_tmp_tab.getField(true,"TextIconPadding" /*RemoteObject*/ )}, "/--",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_icon_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_icon_height" /*RemoteObject*/ ))));
 };
 }else {
 BA.debugLineNum = 424;BA.debugLine="If isHorizontal = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ishorizontal,astabmenu.__c.getField(true,"True"))) { 
 BA.debugLineNum = 425;BA.debugLine="xlbl_text.SetLayoutAnimated(0,0,xpnl_base.Hei";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_txt_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(_xpnl_base.runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_txt_height" /*RemoteObject*/ ))));
 BA.debugLineNum = 426;BA.debugLine="ximg_icon.SetLayoutAnimated(0,xpnl_base.Width";
Debug.JustUpdateDeviceLine();
_ximg_icon.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_icon_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_icon_height" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 428;BA.debugLine="xlbl_text.SetLayoutAnimated(0,0,xpnl_base.Hei";
Debug.JustUpdateDeviceLine();
_xlbl_text.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_txt_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(_xpnl_base.runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_txt_height" /*RemoteObject*/ ))));
 BA.debugLineNum = 429;BA.debugLine="ximg_icon.SetLayoutAnimated(0,xpnl_base.Width";
Debug.JustUpdateDeviceLine();
_ximg_icon.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_icon_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_icon_height" /*RemoteObject*/ ))));
 };
 };
 BA.debugLineNum = 433;BA.debugLine="If CurrenIndex = tmp_tab.index Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_currenindex" /*RemoteObject*/ ),BA.numberCast(double.class, _tmp_tab.getField(true,"Index" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 434;BA.debugLine="xlbl_text.TextColor = g_SelectedTabTextColor";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setTextColor",__ref.getField(true,"_g_selectedtabtextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 436;BA.debugLine="If tmp_tab.Icon.IsInitialized Then ximg_icon.S";
Debug.JustUpdateDeviceLine();
if (_tmp_tab.getField(false,"Icon" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_ximg_icon.runVoidMethod ("SetBitmap",(Object)((_tmp_tab.getField(false,"Icon" /*RemoteObject*/ ).runMethod(false,"Resize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getWidth"),_scale}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getHeight"),_scale}, "*",0, 0))),(Object)(astabmenu.__c.getField(true,"True"))).getObject())));};
 BA.debugLineNum = 437;BA.debugLine="TintBmp(ximg_icon,g_SelectedTabTextColor)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_tintbmp" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _ximg_icon.getObject()),(Object)(__ref.getField(true,"_g_selectedtabtextcolor" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 439;BA.debugLine="xlbl_text.TextColor = tmp_tab.TextColor";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setTextColor",_tmp_tab.getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 441;BA.debugLine="If tmp_tab.Icon.IsInitialized Then ximg_icon.S";
Debug.JustUpdateDeviceLine();
if (_tmp_tab.getField(false,"Icon" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_ximg_icon.runVoidMethod ("SetBitmap",(Object)((_tmp_tab.getField(false,"Icon" /*RemoteObject*/ ).runMethod(false,"Resize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getWidth"),_scale}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getHeight"),_scale}, "*",0, 0))),(Object)(astabmenu.__c.getField(true,"True"))).getObject())));};
 BA.debugLineNum = 442;BA.debugLine="TintBmp(ximg_icon,g_TabTextColor)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_tintbmp" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _ximg_icon.getObject()),(Object)(__ref.getField(true,"_g_tabtextcolor" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 445;BA.debugLine="If tmp_TextIconCenter = False Then 'Icons or Te";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tmp_texticoncenter,astabmenu.__c.getField(true,"False"))) { 
 BA.debugLineNum = 446;BA.debugLine="If tmp_tab.badgevisible = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tmp_tab.getField(true,"BadgeVisible" /*RemoteObject*/ ),astabmenu.__c.getField(true,"True"))) { 
 BA.debugLineNum = 447;BA.debugLine="If g_badge_gravity = getBadge_MIDDLELEFT Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_badge_gravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getbadge_middleleft" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 448;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(1.2),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2.7),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "/+",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else 
{ BA.debugLineNum = 449;BA.debugLine="else If g_badge_gravity = getBadge_TOPLEFT Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_badge_gravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getbadge_topleft" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 450;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(1.2),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "/-+",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else 
{ BA.debugLineNum = 451;BA.debugLine="else If g_badge_gravity = getBadge_TOPMIDDLE";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_badge_gravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getbadge_topmiddle" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 452;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "/-+",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else 
{ BA.debugLineNum = 453;BA.debugLine="else If g_badge_gravity = getBadge_TOPRIGHT T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_badge_gravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getbadge_topright" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 454;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(1.2),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/+/-+",3, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "/-+",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 456;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(1.2),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/+/-+",3, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2.7),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "/+",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }}}}
;
 };
 }else {
 BA.debugLineNum = 461;BA.debugLine="If tmp_tab.Icon.IsInitialized = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tmp_tab.getField(false,"Icon" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),astabmenu.__c.getField(true,"True"))) { 
 BA.debugLineNum = 462;BA.debugLine="If g_badge_gravity = getBadge_MIDDLELEFT Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_badge_gravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getbadge_middleleft" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 463;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(1.2),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2.7),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "/+",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else 
{ BA.debugLineNum = 464;BA.debugLine="else If g_badge_gravity = getBadge_TOPLEFT Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_badge_gravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getbadge_topleft" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 465;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(1.2),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "/-+",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else 
{ BA.debugLineNum = 466;BA.debugLine="else If g_badge_gravity = getBadge_TOPMIDDLE";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_badge_gravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getbadge_topmiddle" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 467;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "/-+",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else 
{ BA.debugLineNum = 468;BA.debugLine="else If g_badge_gravity = getBadge_TOPRIGHT T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_badge_gravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getbadge_topright" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 469;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(1.2),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/+/-+",3, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "/-+",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 471;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xpnl_base.Wid";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(1.2),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/+/-+",3, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2.7),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "/+",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }}}}
;
 }else {
 BA.debugLineNum = 474;BA.debugLine="If g_CurrentTabUnderlineGravity = getCurrentT";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_currenttabunderlinegravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcurrenttabunderlinegravity_topleft" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_g_orientation" /*RemoteObject*/ ))),__ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation_horizontal" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 475;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xlbl_text.Wid";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xlbl_text.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xlbl_text.runMethod(true,"getTop"),_xlbl_text.runMethod(true,"getHeight"),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "++",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 477;BA.debugLine="xlbl_badge.SetLayoutAnimated(0,xlbl_text.Wid";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xlbl_text.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2),__ref.getField(true,"_g_badgeleftpadding" /*RemoteObject*/ )}, "/-/+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xlbl_text.runMethod(true,"getTop"),__ref.getField(true,"_badge_height" /*RemoteObject*/ ),__ref.getField(true,"_g_badgetoppadding" /*RemoteObject*/ )}, "-+",2, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_badge_height" /*RemoteObject*/ ))));
 };
 };
 };
 }else {
 BA.debugLineNum = 485;BA.debugLine="xlbl_text.Visible = False";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setVisible",astabmenu.__c.getField(true,"False"));
 BA.debugLineNum = 486;BA.debugLine="ximg_icon.Visible = False";
Debug.JustUpdateDeviceLine();
_ximg_icon.runMethod(true,"setVisible",astabmenu.__c.getField(true,"False"));
 }}}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 491;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _beginupdate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BeginUpdate (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1097);
if (RapidSub.canDelegate("beginupdate")) { return __ref.runUserSub(false, "astabmenu","beginupdate", __ref);}
 BA.debugLineNum = 1097;BA.debugLine="Public Sub BeginUpdate";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1098;BA.debugLine="g_isInUpdate = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_isinupdate" /*RemoteObject*/ ,astabmenu.__c.getField(true,"True"));
 BA.debugLineNum = 1099;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 152;BA.debugLine="Private mEventName As String 'ignore";
astabmenu._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",astabmenu._meventname);
 //BA.debugLineNum = 153;BA.debugLine="Private mCallBack As Object 'ignore";
astabmenu._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",astabmenu._mcallback);
 //BA.debugLineNum = 154;BA.debugLine="Private mBase As B4XView 'ignore";
astabmenu._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",astabmenu._mbase);
 //BA.debugLineNum = 155;BA.debugLine="Private xui As XUI 'ignore";
astabmenu._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",astabmenu._xui);
 //BA.debugLineNum = 157;BA.debugLine="Private underlinewidthbyonlyicon As Int = 20dip";
astabmenu._underlinewidthbyonlyicon = astabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)));__ref.setField("_underlinewidthbyonlyicon",astabmenu._underlinewidthbyonlyicon);
 //BA.debugLineNum = 158;BA.debugLine="Private txt_height As Float = 22dip";
astabmenu._txt_height = BA.numberCast(float.class, astabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 22))));__ref.setField("_txt_height",astabmenu._txt_height);
 //BA.debugLineNum = 159;BA.debugLine="Private icon_height As Float = 25dip";
astabmenu._icon_height = BA.numberCast(float.class, astabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))));__ref.setField("_icon_height",astabmenu._icon_height);
 //BA.debugLineNum = 160;BA.debugLine="Private badge_height As Float = 15dip";
astabmenu._badge_height = BA.numberCast(float.class, astabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15))));__ref.setField("_badge_height",astabmenu._badge_height);
 //BA.debugLineNum = 161;BA.debugLine="Public TextIcon_Padding As Float = 0";
astabmenu._texticon_padding = BA.numberCast(float.class, 0);__ref.setField("_texticon_padding",astabmenu._texticon_padding);
 //BA.debugLineNum = 162;BA.debugLine="Private m_TextFont As B4XFont";
astabmenu._m_textfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_m_textfont",astabmenu._m_textfont);
 //BA.debugLineNum = 164;BA.debugLine="Type Tabs(TabText As String,Icon As B4XBitmap,";
;
 //BA.debugLineNum = 166;BA.debugLine="Private g_Tabs As Tabs";
astabmenu._g_tabs = RemoteObject.createNew ("b4a.example.astabmenu._tabs");__ref.setField("_g_tabs",astabmenu._g_tabs);
 //BA.debugLineNum = 169;BA.debugLine="Private CurrenIndex As Int = 0";
astabmenu._currenindex = BA.numberCast(int.class, 0);__ref.setField("_currenindex",astabmenu._currenindex);
 //BA.debugLineNum = 172;BA.debugLine="Private pl_clr As Int = xui.Color_White";
astabmenu._pl_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");__ref.setField("_pl_clr",astabmenu._pl_clr);
 //BA.debugLineNum = 173;BA.debugLine="Private pl_width As Float = 2dip";
astabmenu._pl_width = BA.numberCast(float.class, astabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))));__ref.setField("_pl_width",astabmenu._pl_width);
 //BA.debugLineNum = 176;BA.debugLine="Private ul_clr As Int = xui.Color_White";
astabmenu._ul_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");__ref.setField("_ul_clr",astabmenu._ul_clr);
 //BA.debugLineNum = 177;BA.debugLine="Private ul_height As Float = 2dip";
astabmenu._ul_height = BA.numberCast(float.class, astabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))));__ref.setField("_ul_height",astabmenu._ul_height);
 //BA.debugLineNum = 179;BA.debugLine="Private g_badge_gravity As String = \"Middle_Right";
astabmenu._g_badge_gravity = BA.ObjectToString("Middle_Right");__ref.setField("_g_badge_gravity",astabmenu._g_badge_gravity);
 //BA.debugLineNum = 181;BA.debugLine="Private g_commitmode As String";
astabmenu._g_commitmode = RemoteObject.createImmutable("");__ref.setField("_g_commitmode",astabmenu._g_commitmode);
 //BA.debugLineNum = 182;BA.debugLine="Private g_orientation As String";
astabmenu._g_orientation = RemoteObject.createImmutable("");__ref.setField("_g_orientation",astabmenu._g_orientation);
 //BA.debugLineNum = 184;BA.debugLine="Private g_TabStyle As String";
astabmenu._g_tabstyle = RemoteObject.createImmutable("");__ref.setField("_g_tabstyle",astabmenu._g_tabstyle);
 //BA.debugLineNum = 185;BA.debugLine="Private g_TabTextColor As Int";
astabmenu._g_tabtextcolor = RemoteObject.createImmutable(0);__ref.setField("_g_tabtextcolor",astabmenu._g_tabtextcolor);
 //BA.debugLineNum = 186;BA.debugLine="Private g_PartingLineVisible As Boolean";
astabmenu._g_partinglinevisible = RemoteObject.createImmutable(false);__ref.setField("_g_partinglinevisible",astabmenu._g_partinglinevisible);
 //BA.debugLineNum = 188;BA.debugLine="Private g_CurrentTabUnderline As Boolean";
astabmenu._g_currenttabunderline = RemoteObject.createImmutable(false);__ref.setField("_g_currenttabunderline",astabmenu._g_currenttabunderline);
 //BA.debugLineNum = 189;BA.debugLine="Private g_CurrentTabUnderlineAnimation As String";
astabmenu._g_currenttabunderlineanimation = RemoteObject.createImmutable("");__ref.setField("_g_currenttabunderlineanimation",astabmenu._g_currenttabunderlineanimation);
 //BA.debugLineNum = 190;BA.debugLine="Private g_CurrentTabUnderlineAnimationDuration As";
astabmenu._g_currenttabunderlineanimationduration = RemoteObject.createImmutable(0);__ref.setField("_g_currenttabunderlineanimationduration",astabmenu._g_currenttabunderlineanimationduration);
 //BA.debugLineNum = 191;BA.debugLine="Private g_CurrentTabUnderlineGravity As String";
astabmenu._g_currenttabunderlinegravity = RemoteObject.createImmutable("");__ref.setField("_g_currenttabunderlinegravity",astabmenu._g_currenttabunderlinegravity);
 //BA.debugLineNum = 193;BA.debugLine="Private g_EnableSelectedTabTextColor As Boolean";
astabmenu._g_enableselectedtabtextcolor = RemoteObject.createImmutable(false);__ref.setField("_g_enableselectedtabtextcolor",astabmenu._g_enableselectedtabtextcolor);
 //BA.debugLineNum = 194;BA.debugLine="Private g_SelectedTabTextColor As Int";
astabmenu._g_selectedtabtextcolor = RemoteObject.createImmutable(0);__ref.setField("_g_selectedtabtextcolor",astabmenu._g_selectedtabtextcolor);
 //BA.debugLineNum = 196;BA.debugLine="Private g_TabClickColor As Int";
astabmenu._g_tabclickcolor = RemoteObject.createImmutable(0);__ref.setField("_g_tabclickcolor",astabmenu._g_tabclickcolor);
 //BA.debugLineNum = 198;BA.debugLine="Private g_TabStripMode As Boolean = False";
astabmenu._g_tabstripmode = astabmenu.__c.getField(true,"False");__ref.setField("_g_tabstripmode",astabmenu._g_tabstripmode);
 //BA.debugLineNum = 199;BA.debugLine="Private g_HaloDuration As Int = 1000";
astabmenu._g_haloduration = BA.numberCast(int.class, 1000);__ref.setField("_g_haloduration",astabmenu._g_haloduration);
 //BA.debugLineNum = 201;BA.debugLine="Private g_BadgeLeftPadding As Float = 0";
astabmenu._g_badgeleftpadding = BA.numberCast(float.class, 0);__ref.setField("_g_badgeleftpadding",astabmenu._g_badgeleftpadding);
 //BA.debugLineNum = 202;BA.debugLine="Private g_BadgeTopPadding As Float = 0";
astabmenu._g_badgetoppadding = BA.numberCast(float.class, 0);__ref.setField("_g_badgetoppadding",astabmenu._g_badgetoppadding);
 //BA.debugLineNum = 204;BA.debugLine="Private g_isInUpdate As Boolean = False";
astabmenu._g_isinupdate = astabmenu.__c.getField(true,"False");__ref.setField("_g_isinupdate",astabmenu._g_isinupdate);
 //BA.debugLineNum = 207;BA.debugLine="Private xpnl_tabbase As B4XView";
astabmenu._xpnl_tabbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_tabbase",astabmenu._xpnl_tabbase);
 //BA.debugLineNum = 208;BA.debugLine="Private xpnl_underline As B4XView";
astabmenu._xpnl_underline = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_underline",astabmenu._xpnl_underline);
 //BA.debugLineNum = 210;BA.debugLine="Public BorderPadding As Float = 0";
astabmenu._borderpadding = BA.numberCast(float.class, 0);__ref.setField("_borderpadding",astabmenu._borderpadding);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _commitchanges(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CommitChanges (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,516);
if (RapidSub.canDelegate("commitchanges")) { return __ref.runUserSub(false, "astabmenu","commitchanges", __ref);}
 BA.debugLineNum = 516;BA.debugLine="Public Sub CommitChanges";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 517;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 518;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createhaloeffect(RemoteObject __ref,RemoteObject _parent,RemoteObject _x,RemoteObject _y,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("CreateHaloEffect (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1238);
if (RapidSub.canDelegate("createhaloeffect")) { return __ref.runUserSub(false, "astabmenu","createhaloeffect", __ref, _parent, _x, _y, _clr);}
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _radius = RemoteObject.createImmutable(0);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 1238;BA.debugLine="Private Sub CreateHaloEffect (Parent As B4XView, x";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1239;BA.debugLine="Dim cvs As B4XCanvas";
Debug.JustUpdateDeviceLine();
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 1240;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1241;BA.debugLine="Dim radius As Int = 150dip";
Debug.JustUpdateDeviceLine();
_radius = astabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)));Debug.locals.put("radius", _radius);Debug.locals.put("radius", _radius);
 BA.debugLineNum = 1242;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, radius * 2, radius *";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_radius,RemoteObject.createImmutable(2)}, "*",0, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_radius,RemoteObject.createImmutable(2)}, "*",0, 1)));
 BA.debugLineNum = 1243;BA.debugLine="cvs.Initialize(p)";
Debug.JustUpdateDeviceLine();
_cvs.runVoidMethod ("Initialize",(Object)(_p));
 BA.debugLineNum = 1244;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX, cvs.Target";
Debug.JustUpdateDeviceLine();
_cvs.runVoidMethod ("DrawCircle",(Object)(_cvs.runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(_cvs.runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(_clr),(Object)(astabmenu.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 1245;BA.debugLine="Dim bmp As B4XBitmap = cvs.CreateBitmap";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = _cvs.runMethod(false,"CreateBitmap");Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 1246;BA.debugLine="CreateHaloEffectHelper(Parent,bmp, x, y, radius)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_createhaloeffecthelper" /*void*/ ,(Object)(_parent),(Object)(_bmp),(Object)(_x),(Object)(_y),(Object)(_radius));
 BA.debugLineNum = 1247;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _createhaloeffecthelper(RemoteObject __ref,RemoteObject _parent,RemoteObject _bmp,RemoteObject _x,RemoteObject _y,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("CreateHaloEffectHelper (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1249);
if (RapidSub.canDelegate("createhaloeffecthelper")) { __ref.runUserSub(false, "astabmenu","createhaloeffecthelper", __ref, _parent, _bmp, _x, _y, _radius); return;}
ResumableSub_CreateHaloEffectHelper rsub = new ResumableSub_CreateHaloEffectHelper(null,__ref,_parent,_bmp,_x,_y,_radius);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreateHaloEffectHelper extends BA.ResumableSub {
public ResumableSub_CreateHaloEffectHelper(b4a.example.astabmenu parent,RemoteObject __ref,RemoteObject _parent,RemoteObject _bmp,RemoteObject _x,RemoteObject _y,RemoteObject _radius) {
this.parent = parent;
this.__ref = __ref;
this._parent = _parent;
this._bmp = _bmp;
this._x = _x;
this._y = _y;
this._radius = _radius;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.astabmenu parent;
RemoteObject _parent;
RemoteObject _bmp;
RemoteObject _x;
RemoteObject _y;
RemoteObject _radius;
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _duration = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateHaloEffectHelper (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1249);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Parent", _parent);
Debug.locals.put("bmp", _bmp);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 1250;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 1251;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1252;BA.debugLine="Dim p As B4XView = iv";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _iv.getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1253;BA.debugLine="p.SetBitmap(bmp)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetBitmap",(Object)((_bmp.getObject())));
 BA.debugLineNum = 1254;BA.debugLine="Parent.AddView(p, x, y, 0, 0)";
Debug.JustUpdateDeviceLine();
_parent.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(_x),(Object)(_y),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1255;BA.debugLine="Dim duration As Int = g_HaloDuration";
Debug.JustUpdateDeviceLine();
_duration = __ref.getField(true,"_g_haloduration" /*RemoteObject*/ );Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 1256;BA.debugLine="p.SetLayoutAnimated(duration, x - radius, y - rad";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(_duration),(Object)(RemoteObject.solve(new RemoteObject[] {_x,_radius}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_y,_radius}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_radius}, "*",0, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_radius}, "*",0, 1)));
 BA.debugLineNum = 1257;BA.debugLine="p.SetVisibleAnimated(duration, False)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetVisibleAnimated",(Object)(_duration),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 1258;BA.debugLine="Sleep(duration)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "astabmenu", "createhaloeffecthelper"),_duration);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 1259;BA.debugLine="p.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 1260;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _createimageview(RemoteObject __ref,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CreateImageView (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1231);
if (RapidSub.canDelegate("createimageview")) { return __ref.runUserSub(false, "astabmenu","createimageview", __ref, _eventname);}
RemoteObject _tmp_imageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 1231;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1232;BA.debugLine="Dim tmp_imageview As ImageView";
Debug.JustUpdateDeviceLine();
_tmp_imageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("tmp_imageview", _tmp_imageview);
 BA.debugLineNum = 1233;BA.debugLine="tmp_imageview.Initialize(EventName)";
Debug.JustUpdateDeviceLine();
_tmp_imageview.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 1234;BA.debugLine="Return tmp_imageview";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tmp_imageview.getObject());
 BA.debugLineNum = 1235;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1219);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "astabmenu","createlabel", __ref, _eventname);}
RemoteObject _tmp_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 1219;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1220;BA.debugLine="Dim tmp_lbl As Label";
Debug.JustUpdateDeviceLine();
_tmp_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("tmp_lbl", _tmp_lbl);
 BA.debugLineNum = 1221;BA.debugLine="tmp_lbl.Initialize(EventName)";
Debug.JustUpdateDeviceLine();
_tmp_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 1223;BA.debugLine="Dim r As Reflector";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 1224;BA.debugLine="r.Target = tmp_lbl";
Debug.JustUpdateDeviceLine();
_r.setField ("Target",(_tmp_lbl.getObject()));
 BA.debugLineNum = 1225;BA.debugLine="r.RunMethod2(\"setSingleLine\", True, \"java.lang.bo";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setSingleLine")),(Object)(BA.ObjectToString(astabmenu.__c.getField(true,"True"))),(Object)(RemoteObject.createImmutable("java.lang.boolean")));
 BA.debugLineNum = 1226;BA.debugLine="r.RunMethod2(\"setEllipsize\", \"END\", \"android.text";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setEllipsize")),(Object)(BA.ObjectToString("END")),(Object)(RemoteObject.createImmutable("android.text.TextUtils$TruncateAt")));
 BA.debugLineNum = 1228;BA.debugLine="Return tmp_lbl";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tmp_lbl.getObject());
 BA.debugLineNum = 1229;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtabs(RemoteObject __ref,RemoteObject _tabtext,RemoteObject _icon,RemoteObject _tag,RemoteObject _index,RemoteObject _badgevisible,RemoteObject _visible,RemoteObject _texticonpadding,RemoteObject _xfont,RemoteObject _backgroundcolor,RemoteObject _textcolor) throws Exception{
try {
		Debug.PushSubsStack("CreateTabs (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1203);
if (RapidSub.canDelegate("createtabs")) { return __ref.runUserSub(false, "astabmenu","createtabs", __ref, _tabtext, _icon, _tag, _index, _badgevisible, _visible, _texticonpadding, _xfont, _backgroundcolor, _textcolor);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
Debug.locals.put("TabText", _tabtext);
Debug.locals.put("Icon", _icon);
Debug.locals.put("Tag", _tag);
Debug.locals.put("Index", _index);
Debug.locals.put("BadgeVisible", _badgevisible);
Debug.locals.put("Visible", _visible);
Debug.locals.put("TextIconPadding", _texticonpadding);
Debug.locals.put("xFont", _xfont);
Debug.locals.put("BackgroundColor", _backgroundcolor);
Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 1203;BA.debugLine="Public Sub CreateTabs (TabText As String, Icon As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1204;BA.debugLine="Dim t1 As Tabs";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.astabmenu._tabs");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 1205;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 1206;BA.debugLine="t1.TabText = TabText";
Debug.JustUpdateDeviceLine();
_t1.setField ("TabText" /*RemoteObject*/ ,_tabtext);
 BA.debugLineNum = 1207;BA.debugLine="t1.Icon = Icon";
Debug.JustUpdateDeviceLine();
_t1.setField ("Icon" /*RemoteObject*/ ,_icon);
 BA.debugLineNum = 1208;BA.debugLine="t1.Tag = Tag";
Debug.JustUpdateDeviceLine();
_t1.setField ("Tag" /*RemoteObject*/ ,_tag);
 BA.debugLineNum = 1209;BA.debugLine="t1.Index = Index";
Debug.JustUpdateDeviceLine();
_t1.setField ("Index" /*RemoteObject*/ ,_index);
 BA.debugLineNum = 1210;BA.debugLine="t1.BadgeVisible = BadgeVisible";
Debug.JustUpdateDeviceLine();
_t1.setField ("BadgeVisible" /*RemoteObject*/ ,_badgevisible);
 BA.debugLineNum = 1211;BA.debugLine="t1.Visible = Visible";
Debug.JustUpdateDeviceLine();
_t1.setField ("Visible" /*RemoteObject*/ ,_visible);
 BA.debugLineNum = 1212;BA.debugLine="t1.TextIconPadding = TextIconPadding";
Debug.JustUpdateDeviceLine();
_t1.setField ("TextIconPadding" /*RemoteObject*/ ,_texticonpadding);
 BA.debugLineNum = 1213;BA.debugLine="t1.xFont = xFont";
Debug.JustUpdateDeviceLine();
_t1.setField ("xFont" /*RemoteObject*/ ,_xfont);
 BA.debugLineNum = 1214;BA.debugLine="t1.BackgroundColor = BackgroundColor";
Debug.JustUpdateDeviceLine();
_t1.setField ("BackgroundColor" /*RemoteObject*/ ,_backgroundcolor);
 BA.debugLineNum = 1215;BA.debugLine="t1.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_t1.setField ("TextColor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 1216;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 1217;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,225);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "astabmenu","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 225;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 226;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 227;BA.debugLine="ini_props(Props)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_ini_props" /*RemoteObject*/ ,(Object)(_props));
 BA.debugLineNum = 229;BA.debugLine="xpnl_tabbase = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_tabbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 230;BA.debugLine="xpnl_underline = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_underline" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 233;BA.debugLine="mBase.AddView(xpnl_tabbase,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 234;BA.debugLine="mBase.AddView(xpnl_underline,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_underline" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 237;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _endupdate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EndUpdate (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1101);
if (RapidSub.canDelegate("endupdate")) { return __ref.runUserSub(false, "astabmenu","endupdate", __ref);}
 BA.debugLineNum = 1101;BA.debugLine="Public Sub EndUpdate";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1102;BA.debugLine="g_isInUpdate = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_isinupdate" /*RemoteObject*/ ,astabmenu.__c.getField(true,"False"));
 BA.debugLineNum = 1103;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fonttobitmap(RemoteObject __ref,RemoteObject _text,RemoteObject _ismaterialicons,RemoteObject _fontsize,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("FontToBitmap (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1186);
if (RapidSub.canDelegate("fonttobitmap")) { return __ref.runUserSub(false, "astabmenu","fonttobitmap", __ref, _text, _ismaterialicons, _fontsize, _color);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cvs1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("text", _text);
Debug.locals.put("IsMaterialIcons", _ismaterialicons);
Debug.locals.put("FontSize", _fontsize);
Debug.locals.put("color", _color);
 BA.debugLineNum = 1186;BA.debugLine="Public Sub FontToBitmap (text As String, IsMateria";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1187;BA.debugLine="Dim xui As XUI";
Debug.JustUpdateDeviceLine();
astabmenu._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",astabmenu._xui);
 BA.debugLineNum = 1188;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1189;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(astabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))),(Object)(astabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));
 BA.debugLineNum = 1190;BA.debugLine="Dim cvs1 As B4XCanvas";
Debug.JustUpdateDeviceLine();
_cvs1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs1", _cvs1);
 BA.debugLineNum = 1191;BA.debugLine="cvs1.Initialize(p)";
Debug.JustUpdateDeviceLine();
_cvs1.runVoidMethod ("Initialize",(Object)(_p));
 BA.debugLineNum = 1192;BA.debugLine="Dim fnt As B4XFont";
Debug.JustUpdateDeviceLine();
_fnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 1193;BA.debugLine="If IsMaterialIcons Then fnt = xui.CreateMaterialI";
Debug.JustUpdateDeviceLine();
if (_ismaterialicons.<Boolean>get().booleanValue()) { 
_fnt = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons",(Object)(_fontsize));Debug.locals.put("fnt", _fnt);}
else {
_fnt = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFontAwesome",(Object)(_fontsize));Debug.locals.put("fnt", _fnt);};
 BA.debugLineNum = 1194;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(text, fnt)";
Debug.JustUpdateDeviceLine();
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 1195;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
Debug.JustUpdateDeviceLine();
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_cvs1.runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "-/-",2, 0));Debug.locals.put("BaseLine", _baseline);Debug.locals.put("BaseLine", _baseline);
 BA.debugLineNum = 1196;BA.debugLine="cvs1.DrawText(text, cvs1.TargetRect.CenterX, Base";
Debug.JustUpdateDeviceLine();
_cvs1.runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(_text),(Object)(_cvs1.runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_color),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 1197;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b = _cvs1.runMethod(false,"CreateBitmap");Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 1198;BA.debugLine="cvs1.Release";
Debug.JustUpdateDeviceLine();
_cvs1.runVoidMethod ("Release");
 BA.debugLineNum = 1199;BA.debugLine="Return b";
Debug.JustUpdateDeviceLine();
if (true) return _b;
 BA.debugLineNum = 1200;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getargb(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("GetARGB (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1303);
if (RapidSub.canDelegate("getargb")) { return __ref.runUserSub(false, "astabmenu","getargb", __ref, _color);}
RemoteObject _res = null;
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1303;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1304;BA.debugLine="Private res(4) As Int";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNewArray ("int", new int[] {4}, new Object[]{});Debug.locals.put("res", _res);
 BA.debugLineNum = 1305;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (astabmenu.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(astabmenu.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff000000))))),(Object)(BA.numberCast(int.class, 24))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1306;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (astabmenu.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(astabmenu.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff0000))))),(Object)(BA.numberCast(int.class, 16))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 1307;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (astabmenu.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(astabmenu.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff00))))),(Object)(BA.numberCast(int.class, 8))),BA.numberCast(int.class, 2));
 BA.debugLineNum = 1308;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (astabmenu.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff)))),BA.numberCast(int.class, 3));
 BA.debugLineNum = 1309;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 1310;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbadge_gravity(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBadge_Gravity (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,723);
if (RapidSub.canDelegate("getbadge_gravity")) { return __ref.runUserSub(false, "astabmenu","getbadge_gravity", __ref);}
 BA.debugLineNum = 723;BA.debugLine="Public Sub getBadge_Gravity As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 724;BA.debugLine="Return g_badge_gravity";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_badge_gravity" /*RemoteObject*/ );
 BA.debugLineNum = 725;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbadge_middleleft(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBadge_MIDDLELEFT (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,632);
if (RapidSub.canDelegate("getbadge_middleleft")) { return __ref.runUserSub(false, "astabmenu","getbadge_middleleft", __ref);}
 BA.debugLineNum = 632;BA.debugLine="Public Sub getBadge_MIDDLELEFT As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 633;BA.debugLine="Return \"MiddleLeft\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("MiddleLeft");
 BA.debugLineNum = 634;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbadge_middleright(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBadge_MIDDLERIGHT (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,628);
if (RapidSub.canDelegate("getbadge_middleright")) { return __ref.runUserSub(false, "astabmenu","getbadge_middleright", __ref);}
 BA.debugLineNum = 628;BA.debugLine="Public Sub getBadge_MIDDLERIGHT As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 629;BA.debugLine="Return \"MiddleRight\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("MiddleRight");
 BA.debugLineNum = 630;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbadge_topleft(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBadge_TOPLEFT (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,644);
if (RapidSub.canDelegate("getbadge_topleft")) { return __ref.runUserSub(false, "astabmenu","getbadge_topleft", __ref);}
 BA.debugLineNum = 644;BA.debugLine="Public Sub getBadge_TOPLEFT As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 645;BA.debugLine="Return \"TopLeft\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("TopLeft");
 BA.debugLineNum = 646;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbadge_topmiddle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBadge_TOPMIDDLE (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,640);
if (RapidSub.canDelegate("getbadge_topmiddle")) { return __ref.runUserSub(false, "astabmenu","getbadge_topmiddle", __ref);}
 BA.debugLineNum = 640;BA.debugLine="Public Sub getBadge_TOPMIDDLE As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 641;BA.debugLine="Return \"TopMiddle\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("TopMiddle");
 BA.debugLineNum = 642;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbadge_topright(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBadge_TOPRIGHT (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,636);
if (RapidSub.canDelegate("getbadge_topright")) { return __ref.runUserSub(false, "astabmenu","getbadge_topright", __ref);}
 BA.debugLineNum = 636;BA.debugLine="Public Sub getBadge_TOPRIGHT As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 637;BA.debugLine="Return \"TopRight\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("TopRight");
 BA.debugLineNum = 638;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbaseview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBaseView (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,918);
if (RapidSub.canDelegate("getbaseview")) { return __ref.runUserSub(false, "astabmenu","getbaseview", __ref);}
 BA.debugLineNum = 918;BA.debugLine="Public Sub getBaseView As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 919;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 920;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcommitmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCommitMode (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,712);
if (RapidSub.canDelegate("getcommitmode")) { return __ref.runUserSub(false, "astabmenu","getcommitmode", __ref);}
 BA.debugLineNum = 712;BA.debugLine="Public Sub getCommitMode As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 713;BA.debugLine="Return g_commitmode";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_commitmode" /*RemoteObject*/ );
 BA.debugLineNum = 714;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcommitmode_automatic(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCommitMode_AUTOMATIC (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,624);
if (RapidSub.canDelegate("getcommitmode_automatic")) { return __ref.runUserSub(false, "astabmenu","getcommitmode_automatic", __ref);}
 BA.debugLineNum = 624;BA.debugLine="Public Sub getCommitMode_AUTOMATIC As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 625;BA.debugLine="Return \"Automatic\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Automatic");
 BA.debugLineNum = 626;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcommitmode_manually(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCommitMode_MANUALLY (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,620);
if (RapidSub.canDelegate("getcommitmode_manually")) { return __ref.runUserSub(false, "astabmenu","getcommitmode_manually", __ref);}
 BA.debugLineNum = 620;BA.debugLine="Public Sub getCommitMode_MANUALLY As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 621;BA.debugLine="Return \"Manually\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Manually");
 BA.debugLineNum = 622;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentIndex (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,809);
if (RapidSub.canDelegate("getcurrentindex")) { return __ref.runUserSub(false, "astabmenu","getcurrentindex", __ref);}
 BA.debugLineNum = 809;BA.debugLine="Public Sub getCurrentIndex As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 810;BA.debugLine="Return CurrenIndex";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_currenindex" /*RemoteObject*/ );
 BA.debugLineNum = 811;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrenttabunderline(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentTabUnderline (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,968);
if (RapidSub.canDelegate("getcurrenttabunderline")) { return __ref.runUserSub(false, "astabmenu","getcurrenttabunderline", __ref);}
 BA.debugLineNum = 968;BA.debugLine="Public Sub getCurrentTabUnderline As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 969;BA.debugLine="Return g_CurrentTabUnderline";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_currenttabunderline" /*RemoteObject*/ );
 BA.debugLineNum = 970;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrenttabunderlineanimation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentTabUnderlineAnimation (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,959);
if (RapidSub.canDelegate("getcurrenttabunderlineanimation")) { return __ref.runUserSub(false, "astabmenu","getcurrenttabunderlineanimation", __ref);}
 BA.debugLineNum = 959;BA.debugLine="Public Sub getCurrentTabUnderlineAnimation As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 960;BA.debugLine="Return g_CurrentTabUnderlineAnimation";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_currenttabunderlineanimation" /*RemoteObject*/ );
 BA.debugLineNum = 961;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrenttabunderlineanimation_normal(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentTabUnderlineAnimation_NORMAL (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,673);
if (RapidSub.canDelegate("getcurrenttabunderlineanimation_normal")) { return __ref.runUserSub(false, "astabmenu","getcurrenttabunderlineanimation_normal", __ref);}
 BA.debugLineNum = 673;BA.debugLine="Public Sub getCurrentTabUnderlineAnimation_NORMAL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 674;BA.debugLine="Return \"Normal\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Normal");
 BA.debugLineNum = 675;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrenttabunderlineanimationduration(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentTabUnderlineAnimationDuration (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,950);
if (RapidSub.canDelegate("getcurrenttabunderlineanimationduration")) { return __ref.runUserSub(false, "astabmenu","getcurrenttabunderlineanimationduration", __ref);}
 BA.debugLineNum = 950;BA.debugLine="Public Sub getCurrentTabUnderlineAnimationDuration";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 951;BA.debugLine="Return g_CurrentTabUnderlineAnimationDuration";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_currenttabunderlineanimationduration" /*RemoteObject*/ );
 BA.debugLineNum = 952;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrenttabunderlinegravity(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentTabUnderlineGravity (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,814);
if (RapidSub.canDelegate("getcurrenttabunderlinegravity")) { return __ref.runUserSub(false, "astabmenu","getcurrenttabunderlinegravity", __ref);}
 BA.debugLineNum = 814;BA.debugLine="Public Sub getCurrentTabUnderlineGravity As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 815;BA.debugLine="Return g_CurrentTabUnderlineGravity";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_currenttabunderlinegravity" /*RemoteObject*/ );
 BA.debugLineNum = 816;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrenttabunderlinegravity_bottomright(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentTabUnderlineGravity_BOTTOMRIGHT (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,651);
if (RapidSub.canDelegate("getcurrenttabunderlinegravity_bottomright")) { return __ref.runUserSub(false, "astabmenu","getcurrenttabunderlinegravity_bottomright", __ref);}
 BA.debugLineNum = 651;BA.debugLine="Public Sub getCurrentTabUnderlineGravity_BOTTOMRIG";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 652;BA.debugLine="Return \"BottomRight\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("BottomRight");
 BA.debugLineNum = 653;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrenttabunderlinegravity_topleft(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentTabUnderlineGravity_TOPLEFT (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,648);
if (RapidSub.canDelegate("getcurrenttabunderlinegravity_topleft")) { return __ref.runUserSub(false, "astabmenu","getcurrenttabunderlinegravity_topleft", __ref);}
 BA.debugLineNum = 648;BA.debugLine="Public Sub getCurrentTabUnderlineGravity_TOPLEFT A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 649;BA.debugLine="Return \"TopLeft\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("TopLeft");
 BA.debugLineNum = 650;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getenableselectedtabtextcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getEnableSelectedTabTextColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,941);
if (RapidSub.canDelegate("getenableselectedtabtextcolor")) { return __ref.runUserSub(false, "astabmenu","getenableselectedtabtextcolor", __ref);}
 BA.debugLineNum = 941;BA.debugLine="Public Sub getEnableSelectedTabTextColor As Boolea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 942;BA.debugLine="Return g_EnableSelectedTabTextColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_enableselectedtabtextcolor" /*RemoteObject*/ );
 BA.debugLineNum = 943;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gethaloduration(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHaloDuration (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,692);
if (RapidSub.canDelegate("gethaloduration")) { return __ref.runUserSub(false, "astabmenu","gethaloduration", __ref);}
 BA.debugLineNum = 692;BA.debugLine="Public Sub getHaloDuration As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 693;BA.debugLine="Return g_HaloDuration";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_haloduration" /*RemoteObject*/ );
 BA.debugLineNum = 694;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getorientation(RemoteObject __ref,RemoteObject _orientation) throws Exception{
try {
		Debug.PushSubsStack("GetOrientation (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,501);
if (RapidSub.canDelegate("getorientation")) { return __ref.runUserSub(false, "astabmenu","getorientation", __ref, _orientation);}
Debug.locals.put("Orientation", _orientation);
 BA.debugLineNum = 501;BA.debugLine="Private Sub GetOrientation(Orientation As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 502;BA.debugLine="If Orientation = getOrientation_AUTOMATIC Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_orientation,__ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation_automatic" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 503;BA.debugLine="If mBase.Width >= mBase.Height Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 504;BA.debugLine="Return getOrientation_HORIZONTAL";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation_horizontal" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 506;BA.debugLine="Return getOrientation_VERTICAL";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation_vertical" /*RemoteObject*/ );
 };
 }else 
{ BA.debugLineNum = 508;BA.debugLine="else if Orientation = getOrientation_HORIZONTAL T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_orientation,__ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation_horizontal" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 509;BA.debugLine="Return getOrientation_HORIZONTAL";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation_horizontal" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 511;BA.debugLine="Return getOrientation_VERTICAL";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation_vertical" /*RemoteObject*/ );
 }}
;
 BA.debugLineNum = 513;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getorientation_automatic(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getOrientation_AUTOMATIC (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,654);
if (RapidSub.canDelegate("getorientation_automatic")) { return __ref.runUserSub(false, "astabmenu","getorientation_automatic", __ref);}
 BA.debugLineNum = 654;BA.debugLine="Public Sub getOrientation_AUTOMATIC As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 655;BA.debugLine="Return \"Automatic\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Automatic");
 BA.debugLineNum = 656;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getorientation_horizontal(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getOrientation_HORIZONTAL (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,657);
if (RapidSub.canDelegate("getorientation_horizontal")) { return __ref.runUserSub(false, "astabmenu","getorientation_horizontal", __ref);}
 BA.debugLineNum = 657;BA.debugLine="Public Sub getOrientation_HORIZONTAL As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 658;BA.debugLine="Return \"Horizontal\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Horizontal");
 BA.debugLineNum = 659;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getorientation_vertical(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getOrientation_VERTICAL (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,660);
if (RapidSub.canDelegate("getorientation_vertical")) { return __ref.runUserSub(false, "astabmenu","getorientation_vertical", __ref);}
 BA.debugLineNum = 660;BA.debugLine="Public Sub getOrientation_VERTICAL As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 661;BA.debugLine="Return \"Vertical\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Vertical");
 BA.debugLineNum = 662;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpartinglinecolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPartingLineColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,888);
if (RapidSub.canDelegate("getpartinglinecolor")) { return __ref.runUserSub(false, "astabmenu","getpartinglinecolor", __ref);}
 BA.debugLineNum = 888;BA.debugLine="Public Sub getPartingLineColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 889;BA.debugLine="Return pl_clr";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_pl_clr" /*RemoteObject*/ );
 BA.debugLineNum = 890;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpartinglinevisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPartingLineVisible (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,908);
if (RapidSub.canDelegate("getpartinglinevisible")) { return __ref.runUserSub(false, "astabmenu","getpartinglinevisible", __ref);}
 BA.debugLineNum = 908;BA.debugLine="Public Sub getPartingLineVisible As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 909;BA.debugLine="Return g_PartingLineVisible";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_partinglinevisible" /*RemoteObject*/ );
 BA.debugLineNum = 910;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpartinglinewidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPartingLineWidth (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,898);
if (RapidSub.canDelegate("getpartinglinewidth")) { return __ref.runUserSub(false, "astabmenu","getpartinglinewidth", __ref);}
 BA.debugLineNum = 898;BA.debugLine="Public Sub getPartingLineWidth As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 899;BA.debugLine="Return pl_width";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_pl_width" /*RemoteObject*/ );
 BA.debugLineNum = 900;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedtabtextcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedTabTextColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,932);
if (RapidSub.canDelegate("getselectedtabtextcolor")) { return __ref.runUserSub(false, "astabmenu","getselectedtabtextcolor", __ref);}
 BA.debugLineNum = 932;BA.debugLine="Public Sub getSelectedTabTextColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 933;BA.debugLine="Return g_SelectedTabTextColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_selectedtabtextcolor" /*RemoteObject*/ );
 BA.debugLineNum = 934;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabbackgroundcolor(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("getTabBackgroundColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,803);
if (RapidSub.canDelegate("gettabbackgroundcolor")) { return __ref.runUserSub(false, "astabmenu","gettabbackgroundcolor", __ref, _index);}
RemoteObject _tmp_tab = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("index", _index);
 BA.debugLineNum = 803;BA.debugLine="Public Sub getTabBackgroundColor(index As Int) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 804;BA.debugLine="Dim tmp_tab As B4XView = xpnl_tabbase.GetView(ind";
Debug.JustUpdateDeviceLine();
_tmp_tab = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tmp_tab = __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 805;BA.debugLine="Return tmp_tab.Color";
Debug.JustUpdateDeviceLine();
if (true) return _tmp_tab.runMethod(true,"getColor");
 BA.debugLineNum = 806;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTabBase (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,757);
if (RapidSub.canDelegate("gettabbase")) { return __ref.runUserSub(false, "astabmenu","gettabbase", __ref);}
 BA.debugLineNum = 757;BA.debugLine="Public Sub getTabBase As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 758;BA.debugLine="Return xpnl_tabbase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ );
 BA.debugLineNum = 759;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabclickcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTabClickColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,923);
if (RapidSub.canDelegate("gettabclickcolor")) { return __ref.runUserSub(false, "astabmenu","gettabclickcolor", __ref);}
 BA.debugLineNum = 923;BA.debugLine="Public Sub getTabClickColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 924;BA.debugLine="Return g_TabClickColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_tabclickcolor" /*RemoteObject*/ );
 BA.debugLineNum = 925;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabicon(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("getTabIcon (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,854);
if (RapidSub.canDelegate("gettabicon")) { return __ref.runUserSub(false, "astabmenu","gettabicon", __ref, _index);}
RemoteObject _tmp_tab = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
Debug.locals.put("index", _index);
 BA.debugLineNum = 854;BA.debugLine="Public Sub getTabIcon(index As Int) As B4XBitmap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 855;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
Debug.JustUpdateDeviceLine();
_tmp_tab = (__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"getTag"));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 856;BA.debugLine="Return tmp_tab.Icon";
Debug.JustUpdateDeviceLine();
if (true) return _tmp_tab.getField(false,"Icon" /*RemoteObject*/ );
 BA.debugLineNum = 857;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabproperties(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetTabProperties (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,824);
if (RapidSub.canDelegate("gettabproperties")) { return __ref.runUserSub(false, "astabmenu","gettabproperties", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 824;BA.debugLine="Public Sub GetTabProperties(Index As Int) As Tabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 825;BA.debugLine="Return xpnl_tabbase.GetView(Index).Tag";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"getTag"));
 BA.debugLineNum = 826;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTabSize (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1001);
if (RapidSub.canDelegate("gettabsize")) { return __ref.runUserSub(false, "astabmenu","gettabsize", __ref);}
 BA.debugLineNum = 1001;BA.debugLine="Public Sub getTabSize As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1002;BA.debugLine="Return xpnl_tabbase.NumberOfViews";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews");
 BA.debugLineNum = 1003;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabstripmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTabStripMode (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,699);
if (RapidSub.canDelegate("gettabstripmode")) { return __ref.runUserSub(false, "astabmenu","gettabstripmode", __ref);}
 BA.debugLineNum = 699;BA.debugLine="Public Sub getTabStripMode As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 700;BA.debugLine="Return g_TabStripMode";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_tabstripmode" /*RemoteObject*/ );
 BA.debugLineNum = 701;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabstyle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTabStyle (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,979);
if (RapidSub.canDelegate("gettabstyle")) { return __ref.runUserSub(false, "astabmenu","gettabstyle", __ref);}
 BA.debugLineNum = 979;BA.debugLine="Public Sub getTabStyle As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 980;BA.debugLine="Return g_TabStyle";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_tabstyle" /*RemoteObject*/ );
 BA.debugLineNum = 981;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabstyle_icon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTabStyle_ICON (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,667);
if (RapidSub.canDelegate("gettabstyle_icon")) { return __ref.runUserSub(false, "astabmenu","gettabstyle_icon", __ref);}
 BA.debugLineNum = 667;BA.debugLine="Public Sub getTabStyle_ICON As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 668;BA.debugLine="Return \"Icon\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Icon");
 BA.debugLineNum = 669;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabstyle_text(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTabStyle_TEXT (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,664);
if (RapidSub.canDelegate("gettabstyle_text")) { return __ref.runUserSub(false, "astabmenu","gettabstyle_text", __ref);}
 BA.debugLineNum = 664;BA.debugLine="Public Sub getTabStyle_TEXT As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 665;BA.debugLine="Return \"Text\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Text");
 BA.debugLineNum = 666;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabstyle_texticon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTabStyle_TEXTICON (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,670);
if (RapidSub.canDelegate("gettabstyle_texticon")) { return __ref.runUserSub(false, "astabmenu","gettabstyle_texticon", __ref);}
 BA.debugLineNum = 670;BA.debugLine="Public Sub getTabStyle_TEXTICON As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 671;BA.debugLine="Return \"TextIcon\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("TextIcon");
 BA.debugLineNum = 672;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabtag(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("getTabTag (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,829);
if (RapidSub.canDelegate("gettabtag")) { return __ref.runUserSub(false, "astabmenu","gettabtag", __ref, _index);}
RemoteObject _tmp_tab = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
Debug.locals.put("index", _index);
 BA.debugLineNum = 829;BA.debugLine="Public Sub getTabTag(index As Int) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 830;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
Debug.JustUpdateDeviceLine();
_tmp_tab = (__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"getTag"));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 831;BA.debugLine="Return tmp_tab.Tag";
Debug.JustUpdateDeviceLine();
if (true) return _tmp_tab.getField(false,"Tag" /*RemoteObject*/ );
 BA.debugLineNum = 832;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabtext(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("getTabText (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,841);
if (RapidSub.canDelegate("gettabtext")) { return __ref.runUserSub(false, "astabmenu","gettabtext", __ref, _index);}
RemoteObject _tmp_tab = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
Debug.locals.put("index", _index);
 BA.debugLineNum = 841;BA.debugLine="Public Sub getTabText(index As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 842;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
Debug.JustUpdateDeviceLine();
_tmp_tab = (__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"getTag"));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 843;BA.debugLine="Return tmp_tab.TabText";
Debug.JustUpdateDeviceLine();
if (true) return _tmp_tab.getField(true,"TabText" /*RemoteObject*/ );
 BA.debugLineNum = 844;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettabtextcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTabTextColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,996);
if (RapidSub.canDelegate("gettabtextcolor")) { return __ref.runUserSub(false, "astabmenu","gettabtextcolor", __ref);}
 BA.debugLineNum = 996;BA.debugLine="Public Sub getTabTextColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 997;BA.debugLine="Return g_TabTextColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_g_tabtextcolor" /*RemoteObject*/ );
 BA.debugLineNum = 998;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextfont(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextFont (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,683);
if (RapidSub.canDelegate("gettextfont")) { return __ref.runUserSub(false, "astabmenu","gettextfont", __ref);}
 BA.debugLineNum = 683;BA.debugLine="Public Sub getTextFont As B4XFont";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 684;BA.debugLine="Return m_TextFont";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_m_textfont" /*RemoteObject*/ );
 BA.debugLineNum = 685;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getunderlinecolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getUnderLineColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,867);
if (RapidSub.canDelegate("getunderlinecolor")) { return __ref.runUserSub(false, "astabmenu","getunderlinecolor", __ref);}
 BA.debugLineNum = 867;BA.debugLine="Public Sub getUnderLineColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 868;BA.debugLine="Return ul_clr";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_ul_clr" /*RemoteObject*/ );
 BA.debugLineNum = 869;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getunderlineheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getUnderLineHeight (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,877);
if (RapidSub.canDelegate("getunderlineheight")) { return __ref.runUserSub(false, "astabmenu","getunderlineheight", __ref);}
 BA.debugLineNum = 877;BA.debugLine="Public Sub getUnderLineHeight As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 878;BA.debugLine="Return ul_height";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_ul_height" /*RemoteObject*/ );
 BA.debugLineNum = 879;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ini_props(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("ini_props (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("ini_props")) { return __ref.runUserSub(false, "astabmenu","ini_props", __ref, _props);}
Debug.locals.put("Props", _props);
 BA.debugLineNum = 242;BA.debugLine="Private Sub ini_props(Props As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 243;BA.debugLine="g_commitmode = Props.Get(\"CommitMode\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_commitmode" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CommitMode"))))));
 BA.debugLineNum = 244;BA.debugLine="g_orientation = Props.Get(\"Orientation\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_orientation" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Orientation"))))));
 BA.debugLineNum = 246;BA.debugLine="g_TabStyle = Props.Get(\"TabStyle\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_tabstyle" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TabStyle"))))));
 BA.debugLineNum = 247;BA.debugLine="g_TabTextColor = xui.PaintOrColorToColor(Props.Ge";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_tabtextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TabTextColor")))))));
 BA.debugLineNum = 248;BA.debugLine="g_PartingLineVisible = Props.Get(\"PartingLineVisi";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_partinglinevisible" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PartingLineVisible"))))));
 BA.debugLineNum = 250;BA.debugLine="g_CurrentTabUnderline = Props.Get(\"CurrentTabUnde";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_currenttabunderline" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CurrentTabUnderline"))))));
 BA.debugLineNum = 251;BA.debugLine="g_CurrentTabUnderlineAnimation = Props.Get(\"Curre";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_currenttabunderlineanimation" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CurrentTabUnderlineAnimation"))))));
 BA.debugLineNum = 252;BA.debugLine="g_CurrentTabUnderlineAnimationDuration = Props.Ge";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_currenttabunderlineanimationduration" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CurrentTabUnderlineAnimationDuration"))))));
 BA.debugLineNum = 253;BA.debugLine="g_CurrentTabUnderlineGravity = Props.Get(\"Current";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_currenttabunderlinegravity" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CurrentTabUnderlineGravity"))))));
 BA.debugLineNum = 255;BA.debugLine="g_EnableSelectedTabTextColor = Props.Get(\"EnableS";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_enableselectedtabtextcolor" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EnableSelectedTabTextColor"))))));
 BA.debugLineNum = 256;BA.debugLine="g_SelectedTabTextColor = xui.PaintOrColorToColor(";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_selectedtabtextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SelectedTabTextColor")))))));
 BA.debugLineNum = 258;BA.debugLine="g_TabClickColor = xui.PaintOrColorToColor(Props.G";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_tabclickcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TabClickColor")))))));
 BA.debugLineNum = 260;BA.debugLine="g_Tabs = CreateTabs(\"\",Null,Null,-1,False,True,Te";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_tabs" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.astabmenu.class, "_createtabs" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), astabmenu.__c.getField(false,"Null")),(Object)(astabmenu.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(astabmenu.__c.getField(true,"False")),(Object)(astabmenu.__c.getField(true,"True")),(Object)(__ref.getField(true,"_texticon_padding" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_m_textfont" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black")),(Object)(__ref.getField(true,"_g_tabtextcolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,218);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "astabmenu","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 218;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 219;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 220;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 221;BA.debugLine="m_TextFont = xui.CreateDefaultFont(15)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_textfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _internaddtab(RemoteObject __ref,RemoteObject _tabproperties) throws Exception{
try {
		Debug.PushSubsStack("InternAddTab (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1033);
if (RapidSub.canDelegate("internaddtab")) { return __ref.runUserSub(false, "astabmenu","internaddtab", __ref, _tabproperties);}
RemoteObject _xpnl_base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_text = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _ximg_icon = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_badge = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xpnl_partingline = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("TabProperties", _tabproperties);
 BA.debugLineNum = 1033;BA.debugLine="Private Sub InternAddTab(TabProperties As Tabs)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1034;BA.debugLine="Dim xpnl_base As B4XView = xui.CreatePanel(\"xpnl_";
Debug.JustUpdateDeviceLine();
_xpnl_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_base = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_base")));Debug.locals.put("xpnl_base", _xpnl_base);Debug.locals.put("xpnl_base", _xpnl_base);
 BA.debugLineNum = 1035;BA.debugLine="xpnl_base.Color = TabProperties.BackgroundColor";
Debug.JustUpdateDeviceLine();
_xpnl_base.runMethod(true,"setColor",_tabproperties.getField(true,"BackgroundColor" /*RemoteObject*/ ));
 BA.debugLineNum = 1037;BA.debugLine="Dim xlbl_text As B4XView = CreateLabel(\"\")";
Debug.JustUpdateDeviceLine();
_xlbl_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_text = __ref.runClassMethod (b4a.example.astabmenu.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xlbl_text", _xlbl_text);Debug.locals.put("xlbl_text", _xlbl_text);
 BA.debugLineNum = 1038;BA.debugLine="Dim ximg_icon As B4XView = CreateImageView(\"\")";
Debug.JustUpdateDeviceLine();
_ximg_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_ximg_icon = __ref.runClassMethod (b4a.example.astabmenu.class, "_createimageview" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("ximg_icon", _ximg_icon);Debug.locals.put("ximg_icon", _ximg_icon);
 BA.debugLineNum = 1039;BA.debugLine="Dim xlbl_badge As B4XView = CreateLabel(\"\")";
Debug.JustUpdateDeviceLine();
_xlbl_badge = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_badge = __ref.runClassMethod (b4a.example.astabmenu.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xlbl_badge", _xlbl_badge);Debug.locals.put("xlbl_badge", _xlbl_badge);
 BA.debugLineNum = 1041;BA.debugLine="xpnl_base.AddView(xlbl_text,0,0,0,0)";
Debug.JustUpdateDeviceLine();
_xpnl_base.runVoidMethod ("AddView",(Object)((_xlbl_text.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1042;BA.debugLine="xpnl_base.AddView(ximg_icon,0,0,0,0)";
Debug.JustUpdateDeviceLine();
_xpnl_base.runVoidMethod ("AddView",(Object)((_ximg_icon.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1043;BA.debugLine="xpnl_base.AddView(xlbl_badge,0,0,0,0)";
Debug.JustUpdateDeviceLine();
_xpnl_base.runVoidMethod ("AddView",(Object)((_xlbl_badge.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1045;BA.debugLine="xlbl_badge.SetColorAndBorder(xlbl_badge.Color,0,0";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetColorAndBorder",(Object)(_xlbl_badge.runMethod(true,"getColor")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_badge_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 1046;BA.debugLine="xlbl_badge.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 1047;BA.debugLine="xlbl_badge.Font = TabProperties.xFont";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runMethod(false,"setFont",_tabproperties.getField(false,"xFont" /*RemoteObject*/ ));
 BA.debugLineNum = 1048;BA.debugLine="xlbl_badge.TextColor = TabProperties.TextColor";
Debug.JustUpdateDeviceLine();
_xlbl_badge.runMethod(true,"setTextColor",_tabproperties.getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 1050;BA.debugLine="xpnl_base.Tag = CreateTabs(TabProperties.TabText,";
Debug.JustUpdateDeviceLine();
_xpnl_base.runMethod(false,"setTag",(__ref.runClassMethod (b4a.example.astabmenu.class, "_createtabs" /*RemoteObject*/ ,(Object)(_tabproperties.getField(true,"TabText" /*RemoteObject*/ )),(Object)(_tabproperties.getField(false,"Icon" /*RemoteObject*/ )),(Object)(_tabproperties.getField(false,"Tag" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews")),(Object)(astabmenu.__c.getField(true,"False")),(Object)(astabmenu.__c.getField(true,"True")),(Object)(__ref.getField(true,"_texticon_padding" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_g_tabs" /*RemoteObject*/ ).getField(false,"xFont" /*RemoteObject*/ )),(Object)(_tabproperties.getField(true,"BackgroundColor" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_g_tabs" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ )))));
 BA.debugLineNum = 1052;BA.debugLine="xpnl_tabbase.AddView(xpnl_base,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_xpnl_base.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1054;BA.debugLine="Dim xpnl_partingline As B4XView = xui.CreatePanel";
Debug.JustUpdateDeviceLine();
_xpnl_partingline = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_partingline = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_partingline", _xpnl_partingline);Debug.locals.put("xpnl_partingline", _xpnl_partingline);
 BA.debugLineNum = 1055;BA.debugLine="mBase.AddView(xpnl_partingline,0,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_xpnl_partingline.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1057;BA.debugLine="Base_Resize(xpnl_tabbase.Width,xpnl_tabbase.Heigh";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 1062;BA.debugLine="SetUnderline2NewPos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setunderline2newpos" /*RemoteObject*/ );
 BA.debugLineNum = 1063;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _measuretextwidth(RemoteObject __ref,RemoteObject _text,RemoteObject _font1) throws Exception{
try {
		Debug.PushSubsStack("MeasureTextWidth (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1263);
if (RapidSub.canDelegate("measuretextwidth")) { return __ref.runUserSub(false, "astabmenu","measuretextwidth", __ref, _text, _font1);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
Debug.locals.put("Text", _text);
Debug.locals.put("Font1", _font1);
 BA.debugLineNum = 1263;BA.debugLine="Private Sub MeasureTextWidth(Text As String, Font1";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1265;BA.debugLine="Private bmp As Bitmap";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 1266;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
Debug.JustUpdateDeviceLine();
_bmp.runVoidMethod ("InitializeMutable",(Object)(astabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(astabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 1267;BA.debugLine="Private cvs As Canvas";
Debug.JustUpdateDeviceLine();
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 1268;BA.debugLine="cvs.Initialize2(bmp)";
Debug.JustUpdateDeviceLine();
_cvs.runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 1269;BA.debugLine="Return cvs.MeasureStringWidth(Text, Font1.ToNativ";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, _cvs.runMethod(true,"MeasureStringWidth",(Object)(_text),(Object)((_font1.runMethod(false,"ToNativeFont").getObject())),(Object)(_font1.runMethod(true,"getSize"))));
 BA.debugLineNum = 1281;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removealltabs(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveAllTabs (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1085);
if (RapidSub.canDelegate("removealltabs")) { return __ref.runUserSub(false, "astabmenu","removealltabs", __ref);}
 BA.debugLineNum = 1085;BA.debugLine="Public Sub RemoveAllTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1086;BA.debugLine="xpnl_tabbase.RemoveAllViews";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 1087;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeat(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("RemoveAt (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1071);
if (RapidSub.canDelegate("removeat")) { return __ref.runUserSub(false, "astabmenu","removeat", __ref, _index);}
int _i = 0;
RemoteObject _tmp_base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tmp_tabs = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
Debug.locals.put("index", _index);
 BA.debugLineNum = 1071;BA.debugLine="Public Sub RemoveAt(index As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1072;BA.debugLine="xpnl_tabbase.GetView(index).RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 1073;BA.debugLine="mBase.GetView(index + 2).RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(2)}, "+",1, 1))).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 1074;BA.debugLine="For i = 0 To xpnl_tabbase.NumberOfViews -1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1076;BA.debugLine="Dim tmp_base As B4XView = xpnl_tabbase.GetView(i";
Debug.JustUpdateDeviceLine();
_tmp_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tmp_base = __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("tmp_base", _tmp_base);Debug.locals.put("tmp_base", _tmp_base);
 BA.debugLineNum = 1077;BA.debugLine="Dim tmp_tabs As Tabs = tmp_base.Tag";
Debug.JustUpdateDeviceLine();
_tmp_tabs = (_tmp_base.runMethod(false,"getTag"));Debug.locals.put("tmp_tabs", _tmp_tabs);Debug.locals.put("tmp_tabs", _tmp_tabs);
 BA.debugLineNum = 1078;BA.debugLine="tmp_tabs.index = i";
Debug.JustUpdateDeviceLine();
_tmp_tabs.setField ("Index" /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 BA.debugLineNum = 1079;BA.debugLine="tmp_base.Tag = tmp_tabs";
Debug.JustUpdateDeviceLine();
_tmp_base.runMethod(false,"setTag",(_tmp_tabs));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1081;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 1082;BA.debugLine="setCurrentTabUnderline(g_CurrentTabUnderline)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setcurrenttabunderline" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_g_currenttabunderline" /*RemoteObject*/ )));
 BA.debugLineNum = 1083;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbadge_gravity(RemoteObject __ref,RemoteObject _badge_gravity) throws Exception{
try {
		Debug.PushSubsStack("setBadge_Gravity (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,718);
if (RapidSub.canDelegate("setbadge_gravity")) { return __ref.runUserSub(false, "astabmenu","setbadge_gravity", __ref, _badge_gravity);}
Debug.locals.put("badge_gravity", _badge_gravity);
 BA.debugLineNum = 718;BA.debugLine="Public Sub setBadge_Gravity(badge_gravity As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 719;BA.debugLine="g_badge_gravity = badge_gravity";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_badge_gravity" /*RemoteObject*/ ,_badge_gravity);
 BA.debugLineNum = 720;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_commitmode" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcommitmode_automatic" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));};
 BA.debugLineNum = 721;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbadge_setleftpadding(RemoteObject __ref,RemoteObject _padding) throws Exception{
try {
		Debug.PushSubsStack("setBadge_setLeftPadding (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,493);
if (RapidSub.canDelegate("setbadge_setleftpadding")) { return __ref.runUserSub(false, "astabmenu","setbadge_setleftpadding", __ref, _padding);}
Debug.locals.put("padding", _padding);
 BA.debugLineNum = 493;BA.debugLine="Public Sub setBadge_setLeftPadding(padding As Floa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 494;BA.debugLine="g_BadgeLeftPadding = padding";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_badgeleftpadding" /*RemoteObject*/ ,_padding);
 BA.debugLineNum = 495;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbadge_settoppadding(RemoteObject __ref,RemoteObject _padding) throws Exception{
try {
		Debug.PushSubsStack("setBadge_setTopPadding (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,497);
if (RapidSub.canDelegate("setbadge_settoppadding")) { return __ref.runUserSub(false, "astabmenu","setbadge_settoppadding", __ref, _padding);}
Debug.locals.put("padding", _padding);
 BA.debugLineNum = 497;BA.debugLine="Public Sub setBadge_setTopPadding(padding As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 498;BA.debugLine="g_BadgeTopPadding = padding";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_badgetoppadding" /*RemoteObject*/ ,_padding);
 BA.debugLineNum = 499;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcircleclip(RemoteObject __ref,RemoteObject _pnl,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("SetCircleClip (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1283);
if (RapidSub.canDelegate("setcircleclip")) { return __ref.runUserSub(false, "astabmenu","setcircleclip", __ref, _pnl, _radius);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("pnl", _pnl);
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 1283;BA.debugLine="Private Sub SetCircleClip (pnl As B4XView,radius A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1297;BA.debugLine="Dim jo As JavaObject = pnl";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnl.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1298;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(True))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setClipToOutline")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(astabmenu.__c.getField(true,"True"))})));
 BA.debugLineNum = 1300;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcommitmode(RemoteObject __ref,RemoteObject _commit_mode) throws Exception{
try {
		Debug.PushSubsStack("setCommitMode (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,708);
if (RapidSub.canDelegate("setcommitmode")) { return __ref.runUserSub(false, "astabmenu","setcommitmode", __ref, _commit_mode);}
Debug.locals.put("commit_mode", _commit_mode);
 BA.debugLineNum = 708;BA.debugLine="Public Sub setCommitMode(commit_mode As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 709;BA.debugLine="g_commitmode = commit_mode";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_commitmode" /*RemoteObject*/ ,_commit_mode);
 BA.debugLineNum = 710;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcurrenttabunderline(RemoteObject __ref,RemoteObject _show) throws Exception{
try {
		Debug.PushSubsStack("setCurrentTabUnderline (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,972);
if (RapidSub.canDelegate("setcurrenttabunderline")) { return __ref.runUserSub(false, "astabmenu","setcurrenttabunderline", __ref, _show);}
Debug.locals.put("show", _show);
 BA.debugLineNum = 972;BA.debugLine="Public Sub setCurrentTabUnderline(show As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 973;BA.debugLine="g_CurrentTabUnderline = show";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_currenttabunderline" /*RemoteObject*/ ,_show);
 BA.debugLineNum = 974;BA.debugLine="xpnl_underline.Visible = show";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_underline" /*RemoteObject*/ ).runMethod(true,"setVisible",_show);
 BA.debugLineNum = 975;BA.debugLine="SetUnderline2NewPos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setunderline2newpos" /*RemoteObject*/ );
 BA.debugLineNum = 976;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcurrenttabunderlineanimation(RemoteObject __ref,RemoteObject _animation) throws Exception{
try {
		Debug.PushSubsStack("setCurrentTabUnderlineAnimation (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,963);
if (RapidSub.canDelegate("setcurrenttabunderlineanimation")) { return __ref.runUserSub(false, "astabmenu","setcurrenttabunderlineanimation", __ref, _animation);}
Debug.locals.put("animation", _animation);
 BA.debugLineNum = 963;BA.debugLine="Public Sub setCurrentTabUnderlineAnimation(animati";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 964;BA.debugLine="g_CurrentTabUnderlineAnimation = animation";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_currenttabunderlineanimation" /*RemoteObject*/ ,_animation);
 BA.debugLineNum = 965;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcurrenttabunderlineanimationduration(RemoteObject __ref,RemoteObject _duration) throws Exception{
try {
		Debug.PushSubsStack("setCurrentTabUnderlineAnimationDuration (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,954);
if (RapidSub.canDelegate("setcurrenttabunderlineanimationduration")) { return __ref.runUserSub(false, "astabmenu","setcurrenttabunderlineanimationduration", __ref, _duration);}
Debug.locals.put("duration", _duration);
 BA.debugLineNum = 954;BA.debugLine="Public Sub setCurrentTabUnderlineAnimationDuration";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 955;BA.debugLine="g_CurrentTabUnderlineAnimationDuration = duration";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_currenttabunderlineanimationduration" /*RemoteObject*/ ,_duration);
 BA.debugLineNum = 956;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcurrenttabunderlinegravity(RemoteObject __ref,RemoteObject _underline_gravity) throws Exception{
try {
		Debug.PushSubsStack("setCurrentTabUnderlineGravity (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,818);
if (RapidSub.canDelegate("setcurrenttabunderlinegravity")) { return __ref.runUserSub(false, "astabmenu","setcurrenttabunderlinegravity", __ref, _underline_gravity);}
Debug.locals.put("underline_gravity", _underline_gravity);
 BA.debugLineNum = 818;BA.debugLine="Public Sub setCurrentTabUnderlineGravity(underline";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 819;BA.debugLine="g_CurrentTabUnderlineGravity = underline_gravity";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_currenttabunderlinegravity" /*RemoteObject*/ ,_underline_gravity);
 BA.debugLineNum = 820;BA.debugLine="SetUnderline2NewPos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setunderline2newpos" /*RemoteObject*/ );
 BA.debugLineNum = 821;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_commitmode" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcommitmode_automatic" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));};
 BA.debugLineNum = 822;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setenableselectedtabtextcolor(RemoteObject __ref,RemoteObject _enable) throws Exception{
try {
		Debug.PushSubsStack("setEnableSelectedTabTextColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,945);
if (RapidSub.canDelegate("setenableselectedtabtextcolor")) { return __ref.runUserSub(false, "astabmenu","setenableselectedtabtextcolor", __ref, _enable);}
Debug.locals.put("enable", _enable);
 BA.debugLineNum = 945;BA.debugLine="Public Sub setEnableSelectedTabTextColor(enable As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 946;BA.debugLine="g_EnableSelectedTabTextColor = enable";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_enableselectedtabtextcolor" /*RemoteObject*/ ,_enable);
 BA.debugLineNum = 947;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethaloduration(RemoteObject __ref,RemoteObject _duration) throws Exception{
try {
		Debug.PushSubsStack("setHaloDuration (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,695);
if (RapidSub.canDelegate("sethaloduration")) { return __ref.runUserSub(false, "astabmenu","sethaloduration", __ref, _duration);}
Debug.locals.put("duration", _duration);
 BA.debugLineNum = 695;BA.debugLine="Public Sub setHaloDuration(duration As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 696;BA.debugLine="g_HaloDuration = duration";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_haloduration" /*RemoteObject*/ ,_duration);
 BA.debugLineNum = 697;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpartinglinecolor(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("setPartingLineColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,892);
if (RapidSub.canDelegate("setpartinglinecolor")) { return __ref.runUserSub(false, "astabmenu","setpartinglinecolor", __ref, _clr);}
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 892;BA.debugLine="Public Sub setPartingLineColor(clr As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 893;BA.debugLine="pl_clr = clr";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pl_clr" /*RemoteObject*/ ,_clr);
 BA.debugLineNum = 894;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 895;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpartinglinevisible(RemoteObject __ref,RemoteObject _visible) throws Exception{
try {
		Debug.PushSubsStack("setPartingLineVisible (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,912);
if (RapidSub.canDelegate("setpartinglinevisible")) { return __ref.runUserSub(false, "astabmenu","setpartinglinevisible", __ref, _visible);}
Debug.locals.put("visible", _visible);
 BA.debugLineNum = 912;BA.debugLine="Public Sub setPartingLineVisible(visible As Boolea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 913;BA.debugLine="g_PartingLineVisible = visible";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_partinglinevisible" /*RemoteObject*/ ,_visible);
 BA.debugLineNum = 914;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_commitmode" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcommitmode_automatic" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));};
 BA.debugLineNum = 915;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpartinglinewidth(RemoteObject __ref,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setPartingLineWidth (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,902);
if (RapidSub.canDelegate("setpartinglinewidth")) { return __ref.runUserSub(false, "astabmenu","setpartinglinewidth", __ref, _width);}
Debug.locals.put("width", _width);
 BA.debugLineNum = 902;BA.debugLine="Public Sub setPartingLineWidth(width As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 903;BA.debugLine="pl_width = width";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pl_width" /*RemoteObject*/ ,_width);
 BA.debugLineNum = 904;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 905;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedtabtextcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setSelectedTabTextColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,936);
if (RapidSub.canDelegate("setselectedtabtextcolor")) { return __ref.runUserSub(false, "astabmenu","setselectedtabtextcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 936;BA.debugLine="Public Sub setSelectedTabTextColor(color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 937;BA.debugLine="g_SelectedTabTextColor = color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_selectedtabtextcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 938;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settab(RemoteObject __ref,RemoteObject _index,RemoteObject _withclickevent,RemoteObject _withhalo) throws Exception{
try {
		Debug.PushSubsStack("SetTab (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1066);
if (RapidSub.canDelegate("settab")) { return __ref.runUserSub(false, "astabmenu","settab", __ref, _index, _withclickevent, _withhalo);}
Debug.locals.put("index", _index);
Debug.locals.put("withClickEvent", _withclickevent);
Debug.locals.put("withHalo", _withhalo);
 BA.debugLineNum = 1066;BA.debugLine="Public Sub SetTab(index As Int,withClickEvent As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1067;BA.debugLine="TabClick(xpnl_tabbase.GetView(index),withClickEve";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_tabclick" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index))),(Object)(_withclickevent),(Object)(_withhalo),(Object)(astabmenu.__c.getField(true,"False")));
 BA.debugLineNum = 1068;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabbackgroundcolor(RemoteObject __ref,RemoteObject _index,RemoteObject _colour) throws Exception{
try {
		Debug.PushSubsStack("setTabBackgroundColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,798);
if (RapidSub.canDelegate("settabbackgroundcolor")) { return __ref.runUserSub(false, "astabmenu","settabbackgroundcolor", __ref, _index, _colour);}
RemoteObject _tmp_tab = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("index", _index);
Debug.locals.put("colour", _colour);
 BA.debugLineNum = 798;BA.debugLine="Public Sub setTabBackgroundColor (index As Int, co";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 799;BA.debugLine="Dim tmp_tab As B4XView = xpnl_tabbase.GetView(ind";
Debug.JustUpdateDeviceLine();
_tmp_tab = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tmp_tab = __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 800;BA.debugLine="tmp_tab.Color = colour";
Debug.JustUpdateDeviceLine();
_tmp_tab.runMethod(true,"setColor",_colour);
 BA.debugLineNum = 801;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabclickcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setTabClickColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,927);
if (RapidSub.canDelegate("settabclickcolor")) { return __ref.runUserSub(false, "astabmenu","settabclickcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 927;BA.debugLine="Public Sub setTabClickColor(color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 928;BA.debugLine="g_TabClickColor = color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_tabclickcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 929;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabicon(RemoteObject __ref,RemoteObject _index,RemoteObject _icon) throws Exception{
try {
		Debug.PushSubsStack("setTabIcon (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,859);
if (RapidSub.canDelegate("settabicon")) { return __ref.runUserSub(false, "astabmenu","settabicon", __ref, _index, _icon);}
RemoteObject _tmp_tab = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
Debug.locals.put("index", _index);
Debug.locals.put("icon", _icon);
 BA.debugLineNum = 859;BA.debugLine="Public Sub setTabIcon(index As Int,icon As B4XBitm";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 860;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
Debug.JustUpdateDeviceLine();
_tmp_tab = (__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"getTag"));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 861;BA.debugLine="tmp_tab.Icon = icon";
Debug.JustUpdateDeviceLine();
_tmp_tab.setField ("Icon" /*RemoteObject*/ ,_icon);
 BA.debugLineNum = 862;BA.debugLine="xpnl_tabbase.GetView(index).Tag = tmp_tab";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"setTag",(_tmp_tab));
 BA.debugLineNum = 863;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_commitmode" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcommitmode_automatic" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));};
 BA.debugLineNum = 864;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabstripmode(RemoteObject __ref,RemoteObject _enable) throws Exception{
try {
		Debug.PushSubsStack("setTabStripMode (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,703);
if (RapidSub.canDelegate("settabstripmode")) { return __ref.runUserSub(false, "astabmenu","settabstripmode", __ref, _enable);}
Debug.locals.put("enable", _enable);
 BA.debugLineNum = 703;BA.debugLine="Public Sub setTabStripMode(enable As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 704;BA.debugLine="g_TabStripMode = enable";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_tabstripmode" /*RemoteObject*/ ,_enable);
 BA.debugLineNum = 705;BA.debugLine="SetUnderline2NewPos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setunderline2newpos" /*RemoteObject*/ );
 BA.debugLineNum = 706;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabstyle(RemoteObject __ref,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("setTabStyle (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,983);
if (RapidSub.canDelegate("settabstyle")) { return __ref.runUserSub(false, "astabmenu","settabstyle", __ref, _style);}
Debug.locals.put("style", _style);
 BA.debugLineNum = 983;BA.debugLine="Public Sub setTabStyle(style As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 984;BA.debugLine="g_TabStyle = style";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_tabstyle" /*RemoteObject*/ ,_style);
 BA.debugLineNum = 985;BA.debugLine="Base_Resize(xpnl_tabbase.Width,xpnl_tabbase.Heigh";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 986;BA.debugLine="SetUnderline2NewPos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setunderline2newpos" /*RemoteObject*/ );
 BA.debugLineNum = 987;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabtag(RemoteObject __ref,RemoteObject _index,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("setTabTag (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,834);
if (RapidSub.canDelegate("settabtag")) { return __ref.runUserSub(false, "astabmenu","settabtag", __ref, _index, _tag);}
RemoteObject _tmp_tab = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
Debug.locals.put("index", _index);
Debug.locals.put("tag", _tag);
 BA.debugLineNum = 834;BA.debugLine="Public Sub setTabTag(index As Int,tag As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 835;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
Debug.JustUpdateDeviceLine();
_tmp_tab = (__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"getTag"));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 836;BA.debugLine="tmp_tab.Tag = tag";
Debug.JustUpdateDeviceLine();
_tmp_tab.setField ("Tag" /*RemoteObject*/ ,_tag);
 BA.debugLineNum = 837;BA.debugLine="xpnl_tabbase.GetView(index).Tag = tmp_tab";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"setTag",(_tmp_tab));
 BA.debugLineNum = 838;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabtext(RemoteObject __ref,RemoteObject _index,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("setTabText (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,846);
if (RapidSub.canDelegate("settabtext")) { return __ref.runUserSub(false, "astabmenu","settabtext", __ref, _index, _text);}
RemoteObject _tmp_tab = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
Debug.locals.put("index", _index);
Debug.locals.put("text", _text);
 BA.debugLineNum = 846;BA.debugLine="Public Sub setTabText(index As Int,text As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 847;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
Debug.JustUpdateDeviceLine();
_tmp_tab = (__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"getTag"));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 848;BA.debugLine="tmp_tab.TabText = text";
Debug.JustUpdateDeviceLine();
_tmp_tab.setField ("TabText" /*RemoteObject*/ ,_text);
 BA.debugLineNum = 849;BA.debugLine="xpnl_tabbase.GetView(index).Tag = tmp_tab";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"setTag",(_tmp_tab));
 BA.debugLineNum = 850;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_commitmode" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcommitmode_automatic" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));};
 BA.debugLineNum = 851;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabtextcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setTabTextColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,990);
if (RapidSub.canDelegate("settabtextcolor")) { return __ref.runUserSub(false, "astabmenu","settabtextcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 990;BA.debugLine="Public Sub setTabTextColor(color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 991;BA.debugLine="g_TabTextColor = color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_tabtextcolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 992;BA.debugLine="If g_commitmode = getCommitMode_AUTOMATIC Then Ba";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_commitmode" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcommitmode_automatic" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));};
 BA.debugLineNum = 993;BA.debugLine="SetUnderline2NewPos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setunderline2newpos" /*RemoteObject*/ );
 BA.debugLineNum = 994;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextfont(RemoteObject __ref,RemoteObject _xfont) throws Exception{
try {
		Debug.PushSubsStack("setTextFont (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,687);
if (RapidSub.canDelegate("settextfont")) { return __ref.runUserSub(false, "astabmenu","settextfont", __ref, _xfont);}
Debug.locals.put("xFont", _xfont);
 BA.debugLineNum = 687;BA.debugLine="Public Sub setTextFont(xFont As B4XFont)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 688;BA.debugLine="m_TextFont = xFont";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_textfont" /*RemoteObject*/ ,_xfont);
 BA.debugLineNum = 689;BA.debugLine="g_Tabs.xFont = xFont";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_g_tabs" /*RemoteObject*/ ).setField ("xFont" /*RemoteObject*/ ,_xfont);
 BA.debugLineNum = 690;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setunderline2newpos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetUnderline2NewPos (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,520);
if (RapidSub.canDelegate("setunderline2newpos")) { return __ref.runUserSub(false, "astabmenu","setunderline2newpos", __ref);}
RemoteObject _currenttabunderlineanimationduration = RemoteObject.createImmutable(0);
RemoteObject _xpnl_targettab = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_text = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tmp_top = RemoteObject.createImmutable(0f);
RemoteObject _textwidth = RemoteObject.createImmutable(0);
RemoteObject _tmp_left = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 520;BA.debugLine="Private Sub SetUnderline2NewPos";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 521;BA.debugLine="Dim CurrentTabUnderlineAnimationDuration As Int =";
Debug.JustUpdateDeviceLine();
_currenttabunderlineanimationduration = BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",__ref.getField(true,"_g_isinupdate" /*RemoteObject*/ ),astabmenu.__c.getField(true,"False"))) ? ((__ref.getField(true,"_g_currenttabunderlineanimationduration" /*RemoteObject*/ ))) : (RemoteObject.createImmutable((0)))));Debug.locals.put("CurrentTabUnderlineAnimationDuration", _currenttabunderlineanimationduration);Debug.locals.put("CurrentTabUnderlineAnimationDuration", _currenttabunderlineanimationduration);
 BA.debugLineNum = 523;BA.debugLine="If CurrenIndex >= xpnl_tabbase.NumberOfViews Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_currenindex" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews")))) { 
 BA.debugLineNum = 524;BA.debugLine="CurrenIndex = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currenindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 525;BA.debugLine="TabClick(xpnl_tabbase.GetView(0),True,g_EnableSe";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_tabclick" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)))),(Object)(astabmenu.__c.getField(true,"True")),(Object)(__ref.getField(true,"_g_enableselectedtabtextcolor" /*RemoteObject*/ )),(Object)(astabmenu.__c.getField(true,"False")));
 };
 BA.debugLineNum = 527;BA.debugLine="Dim xpnl_targettab As B4XView = xpnl_tabbase.GetV";
Debug.JustUpdateDeviceLine();
_xpnl_targettab = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_targettab = __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(__ref.getField(true,"_currenindex" /*RemoteObject*/ )));Debug.locals.put("xpnl_targettab", _xpnl_targettab);Debug.locals.put("xpnl_targettab", _xpnl_targettab);
 BA.debugLineNum = 530;BA.debugLine="Dim xlbl_text As B4XView = xpnl_targettab.GetView";
Debug.JustUpdateDeviceLine();
_xlbl_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_text = _xpnl_targettab.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xlbl_text", _xlbl_text);Debug.locals.put("xlbl_text", _xlbl_text);
 BA.debugLineNum = 533;BA.debugLine="If g_CurrentTabUnderlineAnimation = \"Normal\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_currenttabunderlineanimation" /*RemoteObject*/ ),BA.ObjectToString("Normal"))) { 
 BA.debugLineNum = 535;BA.debugLine="If GetOrientation(g_orientation) = getOrientatio";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_g_orientation" /*RemoteObject*/ ))),__ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation_horizontal" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 537;BA.debugLine="If g_TabStripMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstripmode" /*RemoteObject*/ ),astabmenu.__c.getField(true,"False"))) { 
 BA.debugLineNum = 539;BA.debugLine="Dim tmp_top As Float = xlbl_text.Top + xlbl_te";
Debug.JustUpdateDeviceLine();
_tmp_top = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_xlbl_text.runMethod(true,"getTop"),_xlbl_text.runMethod(true,"getHeight")}, "+",1, 1));Debug.locals.put("tmp_top", _tmp_top);Debug.locals.put("tmp_top", _tmp_top);
 BA.debugLineNum = 540;BA.debugLine="If g_TabStyle = \"Text\" Or g_TabStyle = \"TextIc";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstyle" /*RemoteObject*/ ),BA.ObjectToString("Text")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstyle" /*RemoteObject*/ ),BA.ObjectToString("TextIcon"))) { 
 BA.debugLineNum = 541;BA.debugLine="Dim textwidth As Int =  Max(1dip,MeasureTextW";
Debug.JustUpdateDeviceLine();
_textwidth = BA.numberCast(int.class, astabmenu.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, astabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, __ref.runClassMethod (b4a.example.astabmenu.class, "_measuretextwidth" /*RemoteObject*/ ,(Object)(_xlbl_text.runMethod(true,"getText")),(Object)(_xlbl_text.runMethod(false,"getFont")))))));Debug.locals.put("textwidth", _textwidth);Debug.locals.put("textwidth", _textwidth);
 BA.debugLineNum = 543;BA.debugLine="If g_CurrentTabUnderlineGravity <> getCurrent";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_g_currenttabunderlinegravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcurrenttabunderlinegravity_bottomright" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 544;BA.debugLine="If g_TabStyle = \"TextIcon\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstyle" /*RemoteObject*/ ),BA.ObjectToString("TextIcon"))) { 
 BA.debugLineNum = 545;BA.debugLine="tmp_top = xpnl_targettab.Height/2 - icon_he";
Debug.JustUpdateDeviceLine();
_tmp_top = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_xpnl_targettab.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0));Debug.locals.put("tmp_top", _tmp_top);
 }else {
 BA.debugLineNum = 547;BA.debugLine="tmp_top = xpnl_targettab.Height/2 - xlbl_te";
Debug.JustUpdateDeviceLine();
_tmp_top = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_xpnl_targettab.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_xlbl_text.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/-/",1, 0));Debug.locals.put("tmp_top", _tmp_top);
 };
 };
 BA.debugLineNum = 551;BA.debugLine="xpnl_underline.SetLayoutAnimated(CurrentTabUn";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_underline" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(_currenttabunderlineanimationduration),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_targettab.runMethod(true,"getLeft"),_xpnl_targettab.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),_textwidth,RemoteObject.createImmutable(2)}, "+/-/",2, 0))),(Object)(BA.numberCast(int.class, _tmp_top)),(Object)(_textwidth),(Object)(BA.numberCast(int.class, __ref.getField(true,"_ul_height" /*RemoteObject*/ ))));
 }else 
{ BA.debugLineNum = 552;BA.debugLine="Else If g_TabStyle = \"Icon\" Then 'only Icon";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstyle" /*RemoteObject*/ ),BA.ObjectToString("Icon"))) { 
 BA.debugLineNum = 553;BA.debugLine="If g_CurrentTabUnderlineGravity = getCurrentT";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_currenttabunderlinegravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcurrenttabunderlinegravity_bottomright" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 554;BA.debugLine="tmp_top = xpnl_tabbase.Height/2 + 15dip";
Debug.JustUpdateDeviceLine();
_tmp_top = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),astabmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))}, "/+",1, 0));Debug.locals.put("tmp_top", _tmp_top);
 }else {
 BA.debugLineNum = 556;BA.debugLine="tmp_top = xpnl_tabbase.Height/2 - icon_heigh";
Debug.JustUpdateDeviceLine();
_tmp_top = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(true,"_icon_height" /*RemoteObject*/ ),RemoteObject.createImmutable(2.5)}, "/-/",1, 0));Debug.locals.put("tmp_top", _tmp_top);
 };
 BA.debugLineNum = 558;BA.debugLine="xpnl_underline.SetLayoutAnimated(CurrentTabUn";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_underline" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(_currenttabunderlineanimationduration),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_targettab.runMethod(true,"getLeft"),_xpnl_targettab.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_underlinewidthbyonlyicon" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "+/-/",2, 0))),(Object)(BA.numberCast(int.class, _tmp_top)),(Object)(__ref.getField(true,"_underlinewidthbyonlyicon" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, __ref.getField(true,"_ul_height" /*RemoteObject*/ ))));
 }}
;
 }else {
 BA.debugLineNum = 563;BA.debugLine="Dim tmp_top As Float = 0";
Debug.JustUpdateDeviceLine();
_tmp_top = BA.numberCast(float.class, 0);Debug.locals.put("tmp_top", _tmp_top);Debug.locals.put("tmp_top", _tmp_top);
 BA.debugLineNum = 564;BA.debugLine="If g_CurrentTabUnderlineGravity <> getCurrentT";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_g_currenttabunderlinegravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcurrenttabunderlinegravity_topleft" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 565;BA.debugLine="tmp_top = xpnl_targettab.Height - ul_height";
Debug.JustUpdateDeviceLine();
_tmp_top = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_xpnl_targettab.runMethod(true,"getHeight"),__ref.getField(true,"_ul_height" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("tmp_top", _tmp_top);
 };
 BA.debugLineNum = 567;BA.debugLine="xpnl_underline.SetLayoutAnimated(CurrentTabUnd";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_underline" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(_currenttabunderlineanimationduration),(Object)(_xpnl_targettab.runMethod(true,"getLeft")),(Object)(BA.numberCast(int.class, _tmp_top)),(Object)(_xpnl_targettab.runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_ul_height" /*RemoteObject*/ ))));
 };
 }else {
 BA.debugLineNum = 571;BA.debugLine="Dim tmp_left As Float = 0";
Debug.JustUpdateDeviceLine();
_tmp_left = BA.numberCast(float.class, 0);Debug.locals.put("tmp_left", _tmp_left);Debug.locals.put("tmp_left", _tmp_left);
 BA.debugLineNum = 572;BA.debugLine="If g_CurrentTabUnderlineGravity = getCurrentTab";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_currenttabunderlinegravity" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.astabmenu.class, "_getcurrenttabunderlinegravity_bottomright" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 573;BA.debugLine="tmp_left = xpnl_targettab.Width - ul_height";
Debug.JustUpdateDeviceLine();
_tmp_left = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_xpnl_targettab.runMethod(true,"getWidth"),__ref.getField(true,"_ul_height" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("tmp_left", _tmp_left);
 };
 BA.debugLineNum = 575;BA.debugLine="If g_TabStripMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstripmode" /*RemoteObject*/ ),astabmenu.__c.getField(true,"False"))) { 
 BA.debugLineNum = 577;BA.debugLine="xpnl_underline.SetLayoutAnimated(CurrentTabUnd";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_underline" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(_currenttabunderlineanimationduration),(Object)(BA.numberCast(int.class, _tmp_left)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_targettab.runMethod(true,"getTop"),_xpnl_targettab.runMethod(true,"getHeight"),RemoteObject.createImmutable(4)}, "+/",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_ul_height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_targettab.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 }else {
 BA.debugLineNum = 579;BA.debugLine="xpnl_underline.SetLayoutAnimated(CurrentTabUnd";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_underline" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(_currenttabunderlineanimationduration),(Object)(BA.numberCast(int.class, _tmp_left)),(Object)(_xpnl_targettab.runMethod(true,"getTop")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_ul_height" /*RemoteObject*/ ))),(Object)(_xpnl_targettab.runMethod(true,"getHeight")));
 };
 };
 };
 BA.debugLineNum = 610;BA.debugLine="If GetOrientation(g_orientation) = getOrientation";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_g_orientation" /*RemoteObject*/ ))),__ref.runClassMethod (b4a.example.astabmenu.class, "_getorientation_horizontal" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 611;BA.debugLine="xpnl_underline.SetColorAndBorder(ul_clr,0,0,xpnl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_underline" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_ul_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_underline" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 }else {
 BA.debugLineNum = 613;BA.debugLine="xpnl_underline.SetColorAndBorder(ul_clr,0,0,xpnl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_underline" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_ul_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_underline" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 };
 BA.debugLineNum = 616;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setunderlinecolor(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("setUnderLineColor (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,871);
if (RapidSub.canDelegate("setunderlinecolor")) { return __ref.runUserSub(false, "astabmenu","setunderlinecolor", __ref, _clr);}
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 871;BA.debugLine="Public Sub setUnderLineColor(clr As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 872;BA.debugLine="ul_clr = clr";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ul_clr" /*RemoteObject*/ ,_clr);
 BA.debugLineNum = 873;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 874;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setunderlineheight(RemoteObject __ref,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("setUnderLineHeight (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,881);
if (RapidSub.canDelegate("setunderlineheight")) { return __ref.runUserSub(false, "astabmenu","setunderlineheight", __ref, _height);}
Debug.locals.put("height", _height);
 BA.debugLineNum = 881;BA.debugLine="Public Sub setUnderLineHeight(height As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 882;BA.debugLine="ul_height = height";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ul_height" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 883;BA.debugLine="SetUnderline2NewPos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setunderline2newpos" /*RemoteObject*/ );
 BA.debugLineNum = 884;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 885;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tabclick(RemoteObject __ref,RemoteObject _xpnl_base,RemoteObject _withevent,RemoteObject _withhalo,RemoteObject _longclick) throws Exception{
try {
		Debug.PushSubsStack("TabClick (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1133);
if (RapidSub.canDelegate("tabclick")) { return __ref.runUserSub(false, "astabmenu","tabclick", __ref, _xpnl_base, _withevent, _withhalo, _longclick);}
RemoteObject _scale = RemoteObject.createImmutable(0f);
RemoteObject _tmp_tab = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
int _i = 0;
RemoteObject _tmp_base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tmp_tabs = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
RemoteObject _xlbl_text = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _ximg_icon = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("xpnl_base", _xpnl_base);
Debug.locals.put("withEvent", _withevent);
Debug.locals.put("withHalo", _withhalo);
Debug.locals.put("LongClick", _longclick);
 BA.debugLineNum = 1133;BA.debugLine="Private Sub TabClick(xpnl_base As B4XView,withEven";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1134;BA.debugLine="Dim scale As Float = 1";
Debug.JustUpdateDeviceLine();
_scale = BA.numberCast(float.class, 1);Debug.locals.put("scale", _scale);Debug.locals.put("scale", _scale);
 BA.debugLineNum = 1139;BA.debugLine="Dim tmp_tab As Tabs = xpnl_base.Tag";
Debug.JustUpdateDeviceLine();
_tmp_tab = (_xpnl_base.runMethod(false,"getTag"));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 1140;BA.debugLine="CurrenIndex = tmp_tab.index";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currenindex" /*RemoteObject*/ ,_tmp_tab.getField(true,"Index" /*RemoteObject*/ ));
 BA.debugLineNum = 1141;BA.debugLine="If withHalo = True And g_isInUpdate = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_withhalo,astabmenu.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_g_isinupdate" /*RemoteObject*/ ),astabmenu.__c.getField(true,"False"))) { 
__ref.runClassMethod (b4a.example.astabmenu.class, "_createhaloeffect" /*RemoteObject*/ ,(Object)(_xpnl_base),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_base.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(true,"_g_tabclickcolor" /*RemoteObject*/ )));};
 BA.debugLineNum = 1143;BA.debugLine="For i = 0 To xpnl_tabbase.NumberOfViews -1";
Debug.JustUpdateDeviceLine();
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1144;BA.debugLine="Dim tmp_base As B4XView = xpnl_tabbase.GetView(i";
Debug.JustUpdateDeviceLine();
_tmp_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tmp_base = __ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("tmp_base", _tmp_base);Debug.locals.put("tmp_base", _tmp_base);
 BA.debugLineNum = 1145;BA.debugLine="Dim tmp_tabs As Tabs = tmp_base.Tag";
Debug.JustUpdateDeviceLine();
_tmp_tabs = (_tmp_base.runMethod(false,"getTag"));Debug.locals.put("tmp_tabs", _tmp_tabs);Debug.locals.put("tmp_tabs", _tmp_tabs);
 BA.debugLineNum = 1147;BA.debugLine="Dim xlbl_text As B4XView = tmp_base.GetView(0)";
Debug.JustUpdateDeviceLine();
_xlbl_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_text = _tmp_base.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xlbl_text", _xlbl_text);Debug.locals.put("xlbl_text", _xlbl_text);
 BA.debugLineNum = 1148;BA.debugLine="Dim ximg_icon As B4XView = tmp_base.GetView(1)";
Debug.JustUpdateDeviceLine();
_ximg_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_ximg_icon = _tmp_base.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("ximg_icon", _ximg_icon);Debug.locals.put("ximg_icon", _ximg_icon);
 BA.debugLineNum = 1150;BA.debugLine="If tmp_tabs.index <> tmp_tab.index Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_tmp_tabs.getField(true,"Index" /*RemoteObject*/ ),BA.numberCast(double.class, _tmp_tab.getField(true,"Index" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1151;BA.debugLine="xlbl_text.TextColor = g_TabTextColor";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setTextColor",__ref.getField(true,"_g_tabtextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 1152;BA.debugLine="If g_TabStyle = \"Icon\" Or g_TabStyle = \"TextIco";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstyle" /*RemoteObject*/ ),BA.ObjectToString("Icon")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstyle" /*RemoteObject*/ ),BA.ObjectToString("TextIcon"))) { 
 BA.debugLineNum = 1154;BA.debugLine="If tmp_tabs.Icon.IsInitialized Then	ximg_icon.";
Debug.JustUpdateDeviceLine();
if (_tmp_tabs.getField(false,"Icon" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_ximg_icon.runVoidMethod ("SetBitmap",(Object)((_tmp_tabs.getField(false,"Icon" /*RemoteObject*/ ).runMethod(false,"Resize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getWidth"),_scale}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getHeight"),_scale}, "*",0, 0))),(Object)(astabmenu.__c.getField(true,"True"))).getObject())));};
 BA.debugLineNum = 1155;BA.debugLine="TintBmp(ximg_icon,g_TabTextColor)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_tintbmp" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _ximg_icon.getObject()),(Object)(__ref.getField(true,"_g_tabtextcolor" /*RemoteObject*/ )));
 };
 }else {
 BA.debugLineNum = 1158;BA.debugLine="xlbl_text.TextColor = g_SelectedTabTextColor";
Debug.JustUpdateDeviceLine();
_xlbl_text.runMethod(true,"setTextColor",__ref.getField(true,"_g_selectedtabtextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 1159;BA.debugLine="If g_TabStyle = \"Icon\" Or g_TabStyle = \"TextIco";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstyle" /*RemoteObject*/ ),BA.ObjectToString("Icon")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_g_tabstyle" /*RemoteObject*/ ),BA.ObjectToString("TextIcon"))) { 
 BA.debugLineNum = 1161;BA.debugLine="If tmp_tabs.Icon.IsInitialized Then	ximg_icon.";
Debug.JustUpdateDeviceLine();
if (_tmp_tabs.getField(false,"Icon" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_ximg_icon.runVoidMethod ("SetBitmap",(Object)((_tmp_tabs.getField(false,"Icon" /*RemoteObject*/ ).runMethod(false,"Resize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getWidth"),_scale}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_ximg_icon.runMethod(true,"getHeight"),_scale}, "*",0, 0))),(Object)(astabmenu.__c.getField(true,"True"))).getObject())));};
 BA.debugLineNum = 1162;BA.debugLine="TintBmp(ximg_icon,g_SelectedTabTextColor)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_tintbmp" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _ximg_icon.getObject()),(Object)(__ref.getField(true,"_g_selectedtabtextcolor" /*RemoteObject*/ )));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1167;BA.debugLine="SetUnderline2NewPos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setunderline2newpos" /*RemoteObject*/ );
 BA.debugLineNum = 1169;BA.debugLine="If withEvent = True And g_isInUpdate = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_withevent,astabmenu.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_g_isinupdate" /*RemoteObject*/ ),astabmenu.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1170;BA.debugLine="If LongClick = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_longclick,astabmenu.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1171;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TabC";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TabClick"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1172;BA.debugLine="CallSub2(mCallBack, mEventName & \"_TabClick\",t";
Debug.JustUpdateDeviceLine();
astabmenu.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TabClick"))),(Object)((_tmp_tab.getField(true,"Index" /*RemoteObject*/ ))));
 };
 }else {
 BA.debugLineNum = 1175;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TabL";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TabLongClick"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1176;BA.debugLine="CallSub2(mCallBack, mEventName & \"_TabLongClic";
Debug.JustUpdateDeviceLine();
astabmenu.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TabLongClick"))),(Object)((_tmp_tab.getField(true,"Index" /*RemoteObject*/ ))));
 };
 };
 };
 BA.debugLineNum = 1180;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tintbmp(RemoteObject __ref,RemoteObject _img,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("TintBmp (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1312);
if (RapidSub.canDelegate("tintbmp")) { return __ref.runUserSub(false, "astabmenu","tintbmp", __ref, _img, _color);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("img", _img);
Debug.locals.put("color", _color);
 BA.debugLineNum = 1312;BA.debugLine="Private Sub TintBmp(img As ImageView, color As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1319;BA.debugLine="Dim jo As JavaObject=img";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _img.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1320;BA.debugLine="jo.RunMethod(\"setImageBitmap\",Array(img.Bitmap))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setImageBitmap")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_img.runMethod(false,"getBitmap"))})));
 BA.debugLineNum = 1322;BA.debugLine="jo.RunMethod(\"setColorFilter\",Array(Colors.rgb(Ge";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setColorFilter")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(astabmenu.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(__ref.runClassMethod (b4a.example.astabmenu.class, "_getargb" /*RemoteObject*/ ,(Object)(_color)).getArrayElement(true,BA.numberCast(int.class, 1))),(Object)(__ref.runClassMethod (b4a.example.astabmenu.class, "_getargb" /*RemoteObject*/ ,(Object)(_color)).getArrayElement(true,BA.numberCast(int.class, 2))),(Object)(__ref.runClassMethod (b4a.example.astabmenu.class, "_getargb" /*RemoteObject*/ ,(Object)(_color)).getArrayElement(true,BA.numberCast(int.class, 3)))))})));
 BA.debugLineNum = 1327;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _viewenable(RemoteObject __ref,RemoteObject _enable) throws Exception{
try {
		Debug.PushSubsStack("ViewEnable (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1005);
if (RapidSub.canDelegate("viewenable")) { return __ref.runUserSub(false, "astabmenu","viewenable", __ref, _enable);}
int _i = 0;
Debug.locals.put("enable", _enable);
 BA.debugLineNum = 1005;BA.debugLine="Public Sub ViewEnable(enable As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1006;BA.debugLine="For i = 0 To xpnl_tabbase.NumberOfViews -1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1011;BA.debugLine="xpnl_tabbase.GetView(i).Enabled = enable";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"setEnabled",_enable);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1014;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _visibleat(RemoteObject __ref,RemoteObject _index,RemoteObject _visible) throws Exception{
try {
		Debug.PushSubsStack("VisibleAt (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1089);
if (RapidSub.canDelegate("visibleat")) { return __ref.runUserSub(false, "astabmenu","visibleat", __ref, _index, _visible);}
RemoteObject _tmp_tab = RemoteObject.declareNull("b4a.example.astabmenu._tabs");
Debug.locals.put("index", _index);
Debug.locals.put("visible", _visible);
 BA.debugLineNum = 1089;BA.debugLine="Public Sub VisibleAt(index As Int,visible As Boole";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1090;BA.debugLine="Dim tmp_tab As Tabs = xpnl_tabbase.GetView(index)";
Debug.JustUpdateDeviceLine();
_tmp_tab = (__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"getTag"));Debug.locals.put("tmp_tab", _tmp_tab);Debug.locals.put("tmp_tab", _tmp_tab);
 BA.debugLineNum = 1091;BA.debugLine="tmp_tab.Visible = visible";
Debug.JustUpdateDeviceLine();
_tmp_tab.setField ("Visible" /*RemoteObject*/ ,_visible);
 BA.debugLineNum = 1092;BA.debugLine="xpnl_tabbase.GetView(index).Tag = tmp_tab";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_tabbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_index)).runMethod(false,"setTag",(_tmp_tab));
 BA.debugLineNum = 1093;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 1094;BA.debugLine="setCurrentTabUnderline(g_CurrentTabUnderline)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_setcurrenttabunderline" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_g_currenttabunderline" /*RemoteObject*/ )));
 BA.debugLineNum = 1095;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xpnl_base_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xpnl_base_Click (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1112);
if (RapidSub.canDelegate("xpnl_base_click")) { return __ref.runUserSub(false, "astabmenu","xpnl_base_click", __ref);}
 BA.debugLineNum = 1112;BA.debugLine="Private Sub xpnl_base_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1114;BA.debugLine="TabClick(Sender,True,g_EnableSelectedTabTextColor";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_tabclick" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), astabmenu.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))),(Object)(astabmenu.__c.getField(true,"True")),(Object)(__ref.getField(true,"_g_enableselectedtabtextcolor" /*RemoteObject*/ )),(Object)(astabmenu.__c.getField(true,"False")));
 BA.debugLineNum = 1115;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xpnl_base_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xpnl_base_LongClick (astabmenu) ","astabmenu",7,__ref.getField(false, "ba"),__ref,1128);
if (RapidSub.canDelegate("xpnl_base_longclick")) { return __ref.runUserSub(false, "astabmenu","xpnl_base_longclick", __ref);}
 BA.debugLineNum = 1128;BA.debugLine="Private Sub xpnl_base_LongClick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1129;BA.debugLine="TabClick(Sender,True,g_EnableSelectedTabTextColor";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.astabmenu.class, "_tabclick" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), astabmenu.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))),(Object)(astabmenu.__c.getField(true,"True")),(Object)(__ref.getField(true,"_g_enableselectedtabtextcolor" /*RemoteObject*/ )),(Object)(astabmenu.__c.getField(true,"True")));
 BA.debugLineNum = 1130;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}