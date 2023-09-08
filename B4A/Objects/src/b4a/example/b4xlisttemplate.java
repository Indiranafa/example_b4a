package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xlisttemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xlisttemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xlisttemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4a.example3.customlistview _customlistview1 = null;
public anywheresoftware.b4a.objects.collections.List _options = null;
public String _selecteditem = "";
public b4a.example.b4xdialog _xdialog = null;
public boolean _allowmultiselection = false;
public int _selectioncolor = 0;
public anywheresoftware.b4a.objects.collections.List _selecteditems = null;
public int _multiselectionminimum = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.b4xlisttemplate __ref,b4a.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=30408705;
 //BA.debugLineNum = 30408705;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=30408706;
 //BA.debugLineNum = 30408706;BA.debugLine="End Sub";
return null;
}
public void  _show(b4a.example.b4xlisttemplate __ref,b4a.example.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.b4xlisttemplate parent,b4a.example.b4xlisttemplate __ref,b4a.example.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4a.example.b4xlisttemplate __ref;
b4a.example.b4xlisttemplate parent;
b4a.example.b4xdialog _dialog;
Object _opt = null;
int _i = 0;
b4a.example3.customlistview._clvitem _item = null;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;
int step8;
int limit8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xlisttemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=30474241;
 //BA.debugLineNum = 30474241;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4a.example.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=30474242;
 //BA.debugLineNum = 30474242;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=30474243;
 //BA.debugLineNum = 30474243;BA.debugLine="For Each opt As Object In Options";
if (true) break;

case 1:
//for
this.state = 4;
group3 = __ref._options /*anywheresoftware.b4a.objects.collections.List*/ ;
index3 = 0;
groupLen3 = group3.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 4;
if (index3 < groupLen3) {
this.state = 3;
_opt = group3.Get(index3);}
if (true) break;

case 13:
//C
this.state = 12;
index3++;
if (true) break;

case 3:
//C
this.state = 13;
RDebugUtils.currentLine=30474244;
 //BA.debugLineNum = 30474244;BA.debugLine="CustomListView1.AddTextItem(opt, opt)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._addtextitem(_opt,_opt);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=30474246;
 //BA.debugLineNum = 30474246;BA.debugLine="If AllowMultiSelection Then";

case 4:
//if
this.state = 11;
if (__ref._allowmultiselection /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=30474247;
 //BA.debugLineNum = 30474247;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xlisttemplate", "show"),(int) (20));
this.state = 14;
return;
case 14:
//C
this.state = 7;
;
RDebugUtils.currentLine=30474248;
 //BA.debugLineNum = 30474248;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
if (true) break;

case 7:
//for
this.state = 10;
step8 = 1;
limit8 = (int) (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 10;
if ((step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8)) this.state = 9;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step8)) ;
if (true) break;

case 9:
//C
this.state = 16;
RDebugUtils.currentLine=30474249;
 //BA.debugLineNum = 30474249;BA.debugLine="Dim item As CLVItem = CustomListView1.GetRawLis";
_item = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=30474250;
 //BA.debugLineNum = 30474250;BA.debugLine="SelectItem (item, False)";
__ref._selectitem /*String*/ (null,_item,parent.__c.False);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=30474253;
 //BA.debugLineNum = 30474253;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
parent._xuiviewsutils._addstubtoclvifneeded /*String*/ (ba,__ref._customlistview1 /*b4a.example3.customlistview*/ ,__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor);
RDebugUtils.currentLine=30474254;
 //BA.debugLineNum = 30474254;BA.debugLine="SelectedItem = \"\"";
__ref._selecteditem /*String*/  = "";
RDebugUtils.currentLine=30474256;
 //BA.debugLineNum = 30474256;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(b4a.example.b4xlisttemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xlisttemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
RDebugUtils.currentLine=30212096;
 //BA.debugLineNum = 30212096;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=30212097;
 //BA.debugLineNum = 30212097;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=30212098;
 //BA.debugLineNum = 30212098;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=30212099;
 //BA.debugLineNum = 30212099;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4a.example3.customlistview();
RDebugUtils.currentLine=30212100;
 //BA.debugLineNum = 30212100;BA.debugLine="Public Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30212101;
 //BA.debugLineNum = 30212101;BA.debugLine="Public SelectedItem As String";
_selecteditem = "";
RDebugUtils.currentLine=30212102;
 //BA.debugLineNum = 30212102;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4a.example.b4xdialog();
RDebugUtils.currentLine=30212103;
 //BA.debugLineNum = 30212103;BA.debugLine="Public AllowMultiSelection As Boolean";
_allowmultiselection = false;
RDebugUtils.currentLine=30212104;
 //BA.debugLineNum = 30212104;BA.debugLine="Public SelectionColor As Int = 0xAA0086FF";
_selectioncolor = ((int)0xaa0086ff);
RDebugUtils.currentLine=30212105;
 //BA.debugLineNum = 30212105;BA.debugLine="Public SelectedItems As List";
_selecteditems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30212106;
 //BA.debugLineNum = 30212106;BA.debugLine="Public MultiSelectionMinimum As Int = 0";
_multiselectionminimum = (int) (0);
RDebugUtils.currentLine=30212107;
 //BA.debugLineNum = 30212107;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(b4a.example.b4xlisttemplate __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "customlistview1_itemclick", true))
	 {return ((String) Debug.delegate(ba, "customlistview1_itemclick", new Object[] {_index,_value}));}
b4a.example3.customlistview._clvitem _item = null;
RDebugUtils.currentLine=30605312;
 //BA.debugLineNum = 30605312;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
RDebugUtils.currentLine=30605313;
 //BA.debugLineNum = 30605313;BA.debugLine="If Value = \"\" Then Return";
if ((_value).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=30605314;
 //BA.debugLineNum = 30605314;BA.debugLine="If AllowMultiSelection Then";
if (__ref._allowmultiselection /*boolean*/ ) { 
RDebugUtils.currentLine=30605315;
 //BA.debugLineNum = 30605315;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getrawlistitem(_index);
RDebugUtils.currentLine=30605316;
 //BA.debugLineNum = 30605316;BA.debugLine="SelectItem (Item, True)";
__ref._selectitem /*String*/ (null,_item,__c.True);
 }else {
RDebugUtils.currentLine=30605318;
 //BA.debugLineNum = 30605318;BA.debugLine="SelectedItem = Value";
__ref._selecteditem /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=30605319;
 //BA.debugLineNum = 30605319;BA.debugLine="SelectedItems.Clear";
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=30605320;
 //BA.debugLineNum = 30605320;BA.debugLine="SelectedItems.Add(Value)";
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Add(_value);
RDebugUtils.currentLine=30605321;
 //BA.debugLineNum = 30605321;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
 };
RDebugUtils.currentLine=30605323;
 //BA.debugLineNum = 30605323;BA.debugLine="End Sub";
return "";
}
public String  _selectitem(b4a.example.b4xlisttemplate __ref,b4a.example3.customlistview._clvitem _item,boolean _toggle) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "selectitem", true))
	 {return ((String) Debug.delegate(ba, "selectitem", new Object[] {_item,_toggle}));}
int _index = 0;
boolean _selected = false;
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Private Sub SelectItem (Item As CLVItem, Toggle As";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="Dim index As Int = SelectedItems.IndexOf(Item.Val";
_index = __ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_item.Value);
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="Dim Selected As Boolean = index > -1";
_selected = _index>-1;
RDebugUtils.currentLine=30539779;
 //BA.debugLineNum = 30539779;BA.debugLine="If Toggle Then Selected = Not(Selected)";
if (_toggle) { 
_selected = __c.Not(_selected);};
RDebugUtils.currentLine=30539780;
 //BA.debugLineNum = 30539780;BA.debugLine="If Selected Then";
if (_selected) { 
RDebugUtils.currentLine=30539781;
 //BA.debugLineNum = 30539781;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = Selection";
if (__c.Not(_toggle)) { 
_item.Panel.setColor(__ref._selectioncolor /*int*/ );};
RDebugUtils.currentLine=30539782;
 //BA.debugLineNum = 30539782;BA.debugLine="Item.Color = CustomListView1.DefaultTextBackgrou";
_item.Color = __ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor;
RDebugUtils.currentLine=30539783;
 //BA.debugLineNum = 30539783;BA.debugLine="If index = -1 Then SelectedItems.Add(Item.Value)";
if (_index==-1) { 
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Add(_item.Value);};
 }else {
RDebugUtils.currentLine=30539785;
 //BA.debugLineNum = 30539785;BA.debugLine="Item.Color = SelectionColor";
_item.Color = __ref._selectioncolor /*int*/ ;
RDebugUtils.currentLine=30539786;
 //BA.debugLineNum = 30539786;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = CustomLis";
if (__c.Not(_toggle)) { 
_item.Panel.setColor(__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor);};
RDebugUtils.currentLine=30539787;
 //BA.debugLineNum = 30539787;BA.debugLine="If index > -1 Then SelectedItems.RemoveAt(index)";
if (_index>-1) { 
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);};
 };
RDebugUtils.currentLine=30539789;
 //BA.debugLineNum = 30539789;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
__ref._xdialog /*b4a.example.b4xdialog*/ ._setbuttonstate /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive,__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>=__ref._multiselectionminimum /*int*/ );
RDebugUtils.currentLine=30539790;
 //BA.debugLineNum = 30539790;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xlisttemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=30277632;
 //BA.debugLineNum = 30277632;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=30277633;
 //BA.debugLineNum = 30277633;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=30277634;
 //BA.debugLineNum = 30277634;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=30277635;
 //BA.debugLineNum = 30277635;BA.debugLine="mBase.LoadLayout(\"ListTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListTemplate",ba);
RDebugUtils.currentLine=30277636;
 //BA.debugLineNum = 30277636;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=30277637;
 //BA.debugLineNum = 30277637;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=30277638;
 //BA.debugLineNum = 30277638;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff555555);
RDebugUtils.currentLine=30277639;
 //BA.debugLineNum = 30277639;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=30277644;
 //BA.debugLineNum = 30277644;BA.debugLine="Options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=30277645;
 //BA.debugLineNum = 30277645;BA.debugLine="SelectedItems.Initialize";
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=30277646;
 //BA.debugLineNum = 30277646;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4a.example.b4xlisttemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=30343169;
 //BA.debugLineNum = 30343169;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=30343170;
 //BA.debugLineNum = 30343170;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._base_resize(_width,_height);
RDebugUtils.currentLine=30343171;
 //BA.debugLineNum = 30343171;BA.debugLine="End Sub";
return "";
}
}