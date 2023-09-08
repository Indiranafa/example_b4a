package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xbreadcrumb extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xbreadcrumb");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xbreadcrumb.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.collections.List _mitems = null;
public anywheresoftware.b4a.objects.collections.List _rightpositions = null;
public int _textcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
public int _offset = 0;
public b4a.example.bitmapcreator _bc = null;
public int _crumbcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public int _presseditem = 0;
public Object _tag = null;
public boolean _mhaptic = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.b4xbreadcrumb __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4a.example.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
b4a.example.bitmapcreator._argbcolor _bcolor = null;
int _strokecolor = 0;
int[] _clrs = null;
int _left = 0;
int _i = 0;
int _sc = 0;
int _width = 0;
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Private Sub Draw";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
__ref._bc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._crumbcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="bcolor.r = Min(255, bcolor.r * 2)";
_bcolor.r = (int) (__c.Min(255,_bcolor.r*2));
RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="bcolor.g = Min(255, bcolor.g * 2)";
_bcolor.g = (int) (__c.Min(255,_bcolor.g*2));
RDebugUtils.currentLine=21299206;
 //BA.debugLineNum = 21299206;BA.debugLine="bcolor.b = Min(255, bcolor.b * 2)";
_bcolor.b = (int) (__c.Min(255,_bcolor.b*2));
RDebugUtils.currentLine=21299207;
 //BA.debugLineNum = 21299207;BA.debugLine="Dim strokeColor As Int = bc.ARGBToColor(bcolor)";
_strokecolor = __ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor);
RDebugUtils.currentLine=21299209;
 //BA.debugLineNum = 21299209;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
__ref._bc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._crumbcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=21299210;
 //BA.debugLineNum = 21299210;BA.debugLine="bcolor.r = bcolor.r * 0.8";
_bcolor.r = (int) (_bcolor.r*0.8);
RDebugUtils.currentLine=21299211;
 //BA.debugLineNum = 21299211;BA.debugLine="bcolor.g = bcolor.g * 0.8";
_bcolor.g = (int) (_bcolor.g*0.8);
RDebugUtils.currentLine=21299212;
 //BA.debugLineNum = 21299212;BA.debugLine="bcolor.b = bcolor.b * 0.8";
_bcolor.b = (int) (_bcolor.b*0.8);
RDebugUtils.currentLine=21299213;
 //BA.debugLineNum = 21299213;BA.debugLine="Dim Clrs() As Int = Array As Int(CrumbColor, bc.A";
_clrs = new int[]{__ref._crumbcolor /*int*/ ,__ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor)};
RDebugUtils.currentLine=21299215;
 //BA.debugLineNum = 21299215;BA.debugLine="RightPositions.Clear";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=21299216;
 //BA.debugLineNum = 21299216;BA.debugLine="If mItems.Size = 0 Then Return";
if (__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=21299217;
 //BA.debugLineNum = 21299217;BA.debugLine="Dim Left As Int = 0";
_left = (int) (0);
RDebugUtils.currentLine=21299218;
 //BA.debugLineNum = 21299218;BA.debugLine="For i = 0 To mItems.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=21299219;
 //BA.debugLineNum = 21299219;BA.debugLine="Dim sc As Int";
_sc = 0;
RDebugUtils.currentLine=21299220;
 //BA.debugLineNum = 21299220;BA.debugLine="If PressedItem = i Then sc = strokeColor Else sc";
if (__ref._presseditem /*int*/ ==_i) { 
_sc = _strokecolor;}
else {
_sc = (int) (0);};
RDebugUtils.currentLine=21299221;
 //BA.debugLineNum = 21299221;BA.debugLine="Dim width As Int = DrawItem(Left, mItems.Get(i),";
_width = __ref._drawitem /*int*/ (null,_left,BA.ObjectToString(__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),_i==0,_i==__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,_clrs[(int) (_i%_clrs.length)],_sc);
RDebugUtils.currentLine=21299222;
 //BA.debugLineNum = 21299222;BA.debugLine="Left = Left + width + offset + 2dip";
_left = (int) (_left+_width+__ref._offset /*int*/ +__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=21299223;
 //BA.debugLineNum = 21299223;BA.debugLine="RightPositions.Add(Left)";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_left));
 }
};
RDebugUtils.currentLine=21299225;
 //BA.debugLineNum = 21299225;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=21299226;
 //BA.debugLineNum = 21299226;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=21037059;
 //BA.debugLineNum = 21037059;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21037061;
 //BA.debugLineNum = 21037061;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=21037062;
 //BA.debugLineNum = 21037062;BA.debugLine="Private mItems As List";
_mitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21037063;
 //BA.debugLineNum = 21037063;BA.debugLine="Private RightPositions As List";
_rightpositions = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21037064;
 //BA.debugLineNum = 21037064;BA.debugLine="Public TextColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=21037065;
 //BA.debugLineNum = 21037065;BA.debugLine="Public fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=21037066;
 //BA.debugLineNum = 21037066;BA.debugLine="Private offset As Int = 10dip";
_offset = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=21037067;
 //BA.debugLineNum = 21037067;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=21037068;
 //BA.debugLineNum = 21037068;BA.debugLine="Public CrumbColor As Int";
_crumbcolor = 0;
RDebugUtils.currentLine=21037069;
 //BA.debugLineNum = 21037069;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21037070;
 //BA.debugLineNum = 21037070;BA.debugLine="Private PressedItem As Int = -1";
_presseditem = (int) (-1);
RDebugUtils.currentLine=21037071;
 //BA.debugLineNum = 21037071;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=21037072;
 //BA.debugLineNum = 21037072;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=21037073;
 //BA.debugLineNum = 21037073;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.b4xbreadcrumb __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
String _items = "";
String _s = "";
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=21168131;
 //BA.debugLineNum = 21168131;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=21168132;
 //BA.debugLineNum = 21168132;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=21168133;
 //BA.debugLineNum = 21168133;BA.debugLine="fnt = xlbl.Font";
__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=21168134;
 //BA.debugLineNum = 21168134;BA.debugLine="TextColor = xlbl.TextColor";
__ref._textcolor /*int*/  = _xlbl.getTextColor();
RDebugUtils.currentLine=21168135;
 //BA.debugLineNum = 21168135;BA.debugLine="CrumbColor = xui.PaintOrColorToColor(Props.Get(\"C";
__ref._crumbcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CrumbColor")));
RDebugUtils.currentLine=21168136;
 //BA.debugLineNum = 21168136;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=21168137;
 //BA.debugLineNum = 21168137;BA.debugLine="TouchPanel = xui.CreatePanel(\"Touch\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"Touch");
RDebugUtils.currentLine=21168138;
 //BA.debugLineNum = 21168138;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=21168139;
 //BA.debugLineNum = 21168139;BA.debugLine="Dim items As String = Props.Get(\"Items\")";
_items = BA.ObjectToString(_props.Get((Object)("Items")));
RDebugUtils.currentLine=21168140;
 //BA.debugLineNum = 21168140;BA.debugLine="For Each s As String In Regex.Split(\"\\|\", items)";
{
final String[] group13 = __c.Regex.Split("\\|",_items);
final int groupLen13 = group13.length
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_s = group13[index13];
RDebugUtils.currentLine=21168141;
 //BA.debugLineNum = 21168141;BA.debugLine="mItems.Add(s)";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=21168143;
 //BA.debugLineNum = 21168143;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=21168144;
 //BA.debugLineNum = 21168144;BA.debugLine="End Sub";
return "";
}
public int  _drawitem(b4a.example.b4xbreadcrumb __ref,int _left,String _text,boolean _first,boolean _last,int _clr,int _strokecolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "drawitem", true))
	 {return ((Integer) Debug.delegate(ba, "drawitem", new Object[] {_left,_text,_first,_last,_clr,_strokecolor}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _itemwidth = 0;
int _itemheight = 0;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Private Sub DrawItem(Left As Int, Text As String,";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(Text, fnt)";
_r = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(_text,__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="Dim ItemWidth As Int = r.Width + 30dip";
_itemwidth = (int) (_r.getWidth()+__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="Dim ItemHeight As Int = cvs.TargetRect.Height";
_itemheight = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight());
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="Dim BaseLine As Int = cvs.TargetRect.CenterY - r.";
_baseline = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=21364741;
 //BA.debugLineNum = 21364741;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=21364742;
 //BA.debugLineNum = 21364742;BA.debugLine="p.Initialize(Left, 0)";
_p.Initialize((float) (_left),(float) (0));
RDebugUtils.currentLine=21364743;
 //BA.debugLineNum = 21364743;BA.debugLine="p.LineTo(Left + ItemWidth, 0)";
_p.LineTo((float) (_left+_itemwidth),(float) (0));
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="If Last = False Then";
if (_last==__c.False) { 
RDebugUtils.currentLine=21364745;
 //BA.debugLineNum = 21364745;BA.debugLine="p.LineTo(Left + ItemWidth + offset, ItemHeight /";
_p.LineTo((float) (_left+_itemwidth+__ref._offset /*int*/ ),(float) (_itemheight/(double)2));
 };
RDebugUtils.currentLine=21364747;
 //BA.debugLineNum = 21364747;BA.debugLine="p.LineTo(Left + ItemWidth, ItemHeight)";
_p.LineTo((float) (_left+_itemwidth),(float) (_itemheight));
RDebugUtils.currentLine=21364748;
 //BA.debugLineNum = 21364748;BA.debugLine="If First = False Then";
if (_first==__c.False) { 
RDebugUtils.currentLine=21364749;
 //BA.debugLineNum = 21364749;BA.debugLine="p.LineTo(Left - offset, ItemHeight)";
_p.LineTo((float) (_left-__ref._offset /*int*/ ),(float) (_itemheight));
RDebugUtils.currentLine=21364750;
 //BA.debugLineNum = 21364750;BA.debugLine="p.LineTo(Left, ItemHeight / 2)";
_p.LineTo((float) (_left),(float) (_itemheight/(double)2));
RDebugUtils.currentLine=21364751;
 //BA.debugLineNum = 21364751;BA.debugLine="p.LineTo(Left - offset, 0)";
_p.LineTo((float) (_left-__ref._offset /*int*/ ),(float) (0));
 }else {
RDebugUtils.currentLine=21364753;
 //BA.debugLineNum = 21364753;BA.debugLine="p.LineTo(Left, ItemHeight)";
_p.LineTo((float) (_left),(float) (_itemheight));
 };
RDebugUtils.currentLine=21364755;
 //BA.debugLineNum = 21364755;BA.debugLine="p.LineTo(Left, 0)";
_p.LineTo((float) (_left),(float) (0));
RDebugUtils.currentLine=21364756;
 //BA.debugLineNum = 21364756;BA.debugLine="cvs.DrawPath(p, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_clr,__c.True,(float) (0));
RDebugUtils.currentLine=21364757;
 //BA.debugLineNum = 21364757;BA.debugLine="If strokeColor <> 0 Then";
if (_strokecolor!=0) { 
RDebugUtils.currentLine=21364758;
 //BA.debugLineNum = 21364758;BA.debugLine="cvs.DrawPath(p, strokeColor, False, 3dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_strokecolor,__c.False,(float) (__c.DipToCurrent((int) (3))));
 };
RDebugUtils.currentLine=21364761;
 //BA.debugLineNum = 21364761;BA.debugLine="cvs.DrawText(Text, Left + ItemWidth / 2, BaseLine";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,_text,(float) (_left+_itemwidth/(double)2),(float) (_baseline),__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._textcolor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=21364762;
 //BA.debugLineNum = 21364762;BA.debugLine="Return ItemWidth";
if (true) return _itemwidth;
RDebugUtils.currentLine=21364763;
 //BA.debugLineNum = 21364763;BA.debugLine="End Sub";
return 0;
}
public int  _finditem(b4a.example.b4xbreadcrumb __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "finditem", true))
	 {return ((Integer) Debug.delegate(ba, "finditem", new Object[] {_x,_y}));}
int _r = 0;
int _i = 0;
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Private Sub FindItem (x As Int, y As Int) As Int";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="If RightPositions.Size = 0 Then Return -1";
if (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="If y < 0 Or y > cvs.TargetRect.Height Then Return";
if (_y<0 || _y>__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="Dim r As Int = RightPositions.Get(RightPositions.";
_r = (int)(BA.ObjectToNumber(__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="If x > r Then Return -1";
if (_x>_r) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="For i = RightPositions.Size - 2 To 0 Step -1";
{
final int step5 = -1;
final int limit5 = (int) (0);
_i = (int) (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-2) ;
for (;_i >= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=21495814;
 //BA.debugLineNum = 21495814;BA.debugLine="Dim r As Int = RightPositions.Get(i)";
_r = (int)(BA.ObjectToNumber(__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=21495815;
 //BA.debugLineNum = 21495815;BA.debugLine="If x > r Then Return i + 1";
if (_x>_r) { 
if (true) return (int) (_i+1);};
 }
};
RDebugUtils.currentLine=21495817;
 //BA.debugLineNum = 21495817;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=21495818;
 //BA.debugLineNum = 21495818;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getitems(b4a.example.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "getitems", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getitems", null));}
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Public Sub getItems As List";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Return mItems";
if (true) return __ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.b4xbreadcrumb __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=21102595;
 //BA.debugLineNum = 21102595;BA.debugLine="mItems.Initialize";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="RightPositions.Initialize";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=21102597;
 //BA.debugLineNum = 21102597;BA.debugLine="bc.Initialize(1, 1)";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (1),(int) (1));
RDebugUtils.currentLine=21102598;
 //BA.debugLineNum = 21102598;BA.debugLine="End Sub";
return "";
}
public String  _setitems(b4a.example.b4xbreadcrumb __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "setitems", true))
	 {return ((String) Debug.delegate(ba, "setitems", new Object[] {_i}));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Public Sub setItems (i As List)";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="mItems = i";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/  = _i;
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="End Sub";
return "";
}
public String  _touch_touch(b4a.example.b4xbreadcrumb __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "touch_touch", true))
	 {return ((String) Debug.delegate(ba, "touch_touch", new Object[] {_action,_x,_y}));}
int _prev = 0;
int _index = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
int _i = 0;
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Private Sub Touch_Touch (Action As Int, X As Float";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP)) {
case 0: 
case 1: {
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="Dim prev As Int = PressedItem";
_prev = __ref._presseditem /*int*/ ;
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="PressedItem = FindItem(X, Y)";
__ref._presseditem /*int*/  = __ref._finditem /*int*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="If prev <> PressedItem Then Draw";
if (_prev!=__ref._presseditem /*int*/ ) { 
__ref._draw /*String*/ (null);};
 break; }
case 2: {
RDebugUtils.currentLine=21430279;
 //BA.debugLineNum = 21430279;BA.debugLine="Dim index As Int = FindItem(X, Y)";
_index = __ref._finditem /*int*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=21430280;
 //BA.debugLineNum = 21430280;BA.debugLine="If index = PressedItem And index > -1 Then";
if (_index==__ref._presseditem /*int*/  && _index>-1) { 
RDebugUtils.currentLine=21430281;
 //BA.debugLineNum = 21430281;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21430282;
 //BA.debugLineNum = 21430282;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=21430283;
 //BA.debugLineNum = 21430283;BA.debugLine="For i = 0 To index";
{
final int step11 = 1;
final int limit11 = _index;
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=21430284;
 //BA.debugLineNum = 21430284;BA.debugLine="Items.Add(mItems.Get(i))";
_items.Add(__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 }
};
RDebugUtils.currentLine=21430286;
 //BA.debugLineNum = 21430286;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFee";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=21430287;
 //BA.debugLineNum = 21430287;BA.debugLine="CallSub2(mCallBack, mEventName & \"_CrumbClick\"";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CrumbClick",(Object)(_items));
 };
RDebugUtils.currentLine=21430289;
 //BA.debugLineNum = 21430289;BA.debugLine="PressedItem = -1";
__ref._presseditem /*int*/  = (int) (-1);
RDebugUtils.currentLine=21430290;
 //BA.debugLineNum = 21430290;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 break; }
}
;
RDebugUtils.currentLine=21430292;
 //BA.debugLineNum = 21430292;BA.debugLine="End Sub";
return "";
}
}