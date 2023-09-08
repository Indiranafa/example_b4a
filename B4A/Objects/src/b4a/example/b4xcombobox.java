package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcombobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xcombobox");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xcombobox.class).invoke(this, new Object[] {null});
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
public int _lastselectedindex = 0;
public anywheresoftware.b4a.objects.SpinnerWrapper _cmbbox = null;
public int _delaybeforechangeevent = 0;
public int _delayindex = 0;
public Object _tag = null;
public String _b4icancelbutton = "";
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.b4xcombobox __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23265284;
 //BA.debugLineNum = 23265284;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23265285;
 //BA.debugLineNum = 23265285;BA.debugLine="Private LastSelectedIndex As Int";
_lastselectedindex = 0;
RDebugUtils.currentLine=23265289;
 //BA.debugLineNum = 23265289;BA.debugLine="Public cmbBox As Spinner";
_cmbbox = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=23265295;
 //BA.debugLineNum = 23265295;BA.debugLine="Public DelayBeforeChangeEvent As Int";
_delaybeforechangeevent = 0;
RDebugUtils.currentLine=23265297;
 //BA.debugLineNum = 23265297;BA.debugLine="Private DelayIndex As Int";
_delayindex = 0;
RDebugUtils.currentLine=23265298;
 //BA.debugLineNum = 23265298;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=23265299;
 //BA.debugLineNum = 23265299;BA.debugLine="Public B4iCancelButton As String = \"Cancel\"";
_b4icancelbutton = "Cancel";
RDebugUtils.currentLine=23265300;
 //BA.debugLineNum = 23265300;BA.debugLine="End Sub";
return "";
}
public String  _cmbbox_itemclick(b4a.example.b4xcombobox __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "cmbbox_itemclick", true))
	 {return ((String) Debug.delegate(ba, "cmbbox_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Private Sub CmbBox_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="RaiseEvent";
__ref._raiseevent /*void*/ (null);
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="End Sub";
return "";
}
public void  _raiseevent(b4a.example.b4xcombobox __ref) throws Exception{
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "raiseevent", true))
	 {Debug.delegate(ba, "raiseevent", null); return;}
ResumableSub_RaiseEvent rsub = new ResumableSub_RaiseEvent(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_RaiseEvent extends BA.ResumableSub {
public ResumableSub_RaiseEvent(b4a.example.b4xcombobox parent,b4a.example.b4xcombobox __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xcombobox __ref;
b4a.example.b4xcombobox parent;
int _index = 0;
int _myindex = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xcombobox";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="Dim index As Int = getSelectedIndex";
_index = __ref._getselectedindex /*int*/ (null);
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="If LastSelectedIndex = index Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._lastselectedindex /*int*/ ==_index) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=23986179;
 //BA.debugLineNum = 23986179;BA.debugLine="If DelayBeforeChangeEvent > 0 Then";
if (true) break;

case 7:
//if
this.state = 16;
if (__ref._delaybeforechangeevent /*int*/ >0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=23986180;
 //BA.debugLineNum = 23986180;BA.debugLine="DelayIndex = DelayIndex + 1";
__ref._delayindex /*int*/  = (int) (__ref._delayindex /*int*/ +1);
RDebugUtils.currentLine=23986181;
 //BA.debugLineNum = 23986181;BA.debugLine="Dim MyIndex As Int = DelayIndex";
_myindex = __ref._delayindex /*int*/ ;
RDebugUtils.currentLine=23986182;
 //BA.debugLineNum = 23986182;BA.debugLine="Sleep(DelayBeforeChangeEvent)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xcombobox", "raiseevent"),__ref._delaybeforechangeevent /*int*/ );
this.state = 21;
return;
case 21:
//C
this.state = 10;
;
RDebugUtils.currentLine=23986183;
 //BA.debugLineNum = 23986183;BA.debugLine="If MyIndex <> DelayIndex Then Return";
if (true) break;

case 10:
//if
this.state = 15;
if (_myindex!=__ref._delayindex /*int*/ ) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=23986185;
 //BA.debugLineNum = 23986185;BA.debugLine="LastSelectedIndex = index";
__ref._lastselectedindex /*int*/  = _index;
RDebugUtils.currentLine=23986186;
 //BA.debugLineNum = 23986186;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (true) break;

case 17:
//if
this.state = 20;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedIndexChanged",(int) (1))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=23986187;
 //BA.debugLineNum = 23986187;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedIndex";
parent.__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedIndexChanged",(Object)(_index));
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=23986189;
 //BA.debugLineNum = 23986189;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _designercreateview(b4a.example.b4xcombobox __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=23396362;
 //BA.debugLineNum = 23396362;BA.debugLine="cmbBox.Initialize(\"cmbBox\")";
__ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Initialize(ba,"cmbBox");
RDebugUtils.currentLine=23396363;
 //BA.debugLineNum = 23396363;BA.debugLine="cmbBox.TextSize = xlbl.TextSize";
__ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setTextSize(_xlbl.getTextSize());
RDebugUtils.currentLine=23396364;
 //BA.debugLineNum = 23396364;BA.debugLine="mBase.AddView(cmbBox, 0, 0, mBase.Width, mBase.He";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=23396373;
 //BA.debugLineNum = 23396373;BA.debugLine="End Sub";
return "";
}
public String  _getitem(b4a.example.b4xcombobox __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "getitem", true))
	 {return ((String) Debug.delegate(ba, "getitem", new Object[] {_index}));}
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Public Sub GetItem(Index As Int) As String";
RDebugUtils.currentLine=23920644;
 //BA.debugLineNum = 23920644;BA.debugLine="Return cmbBox.GetItem(Index)";
if (true) return __ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(_index);
RDebugUtils.currentLine=23920648;
 //BA.debugLineNum = 23920648;BA.debugLine="End Sub";
return "";
}
public int  _getselectedindex(b4a.example.b4xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "getselectedindex", true))
	 {return ((Integer) Debug.delegate(ba, "getselectedindex", null));}
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Public Sub getSelectedIndex As Int";
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="Return cmbBox.SelectedIndex";
if (true) return __ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex();
RDebugUtils.currentLine=23724038;
 //BA.debugLineNum = 23724038;BA.debugLine="End Sub";
return 0;
}
public String  _getselecteditem(b4a.example.b4xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "getselecteditem", true))
	 {return ((String) Debug.delegate(ba, "getselecteditem", null));}
int _i = 0;
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Public Sub getSelectedItem As String";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="Dim i As Int = getSelectedIndex";
_i = __ref._getselectedindex /*int*/ (null);
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="If i = -1 Then Return \"\"";
if (_i==-1) { 
if (true) return "";};
RDebugUtils.currentLine=23855107;
 //BA.debugLineNum = 23855107;BA.debugLine="Return GetItem(i)";
if (true) return __ref._getitem /*String*/ (null,_i);
RDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="End Sub";
return "";
}
public int  _getsize(b4a.example.b4xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="Return cmbBox.Size";
if (true) return __ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSize();
RDebugUtils.currentLine=23592968;
 //BA.debugLineNum = 23592968;BA.debugLine="End Sub";
return 0;
}
public int  _indexof(b4a.example.b4xcombobox __ref,String _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "indexof", true))
	 {return ((Integer) Debug.delegate(ba, "indexof", new Object[] {_item}));}
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Public Sub IndexOf(Item As String) As Int";
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="Return cmbBox.IndexOf(Item)";
if (true) return __ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .IndexOf(_item);
RDebugUtils.currentLine=23658504;
 //BA.debugLineNum = 23658504;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.b4xcombobox __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="LastSelectedIndex = -1";
__ref._lastselectedindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="If xui.IsB4J Then DelayBeforeChangeEvent = 500";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
__ref._delaybeforechangeevent /*int*/  = (int) (500);};
RDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="End Sub";
return "";
}
public String  _setitems(b4a.example.b4xcombobox __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "setitems", true))
	 {return ((String) Debug.delegate(ba, "setitems", new Object[] {_items}));}
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Public Sub SetItems(Items As List)";
RDebugUtils.currentLine=23527429;
 //BA.debugLineNum = 23527429;BA.debugLine="cmbBox.Clear";
__ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Clear();
RDebugUtils.currentLine=23527430;
 //BA.debugLineNum = 23527430;BA.debugLine="cmbBox.AddAll(Items)";
__ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .AddAll(_items);
RDebugUtils.currentLine=23527437;
 //BA.debugLineNum = 23527437;BA.debugLine="If Items.Size > 0 Then setSelectedIndex(0)";
if (_items.getSize()>0) { 
__ref._setselectedindex /*String*/ (null,(int) (0));};
RDebugUtils.currentLine=23527438;
 //BA.debugLineNum = 23527438;BA.debugLine="End Sub";
return "";
}
public String  _setselectedindex(b4a.example.b4xcombobox __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "setselectedindex", true))
	 {return ((String) Debug.delegate(ba, "setselectedindex", new Object[] {_i}));}
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Public Sub setSelectedIndex(i As Int)";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="LastSelectedIndex = i";
__ref._lastselectedindex /*int*/  = _i;
RDebugUtils.currentLine=23789571;
 //BA.debugLineNum = 23789571;BA.debugLine="cmbBox.SelectedIndex = i";
__ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_i);
RDebugUtils.currentLine=23789580;
 //BA.debugLineNum = 23789580;BA.debugLine="End Sub";
return "";
}
}