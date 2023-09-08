package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xinputtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xinputtemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xinputtemplate.class).invoke(this, new Object[] {null});
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
public String _text = "";
public b4a.example.b4xdialog _xdialog = null;
public String _regexpattern = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _textfield1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public boolean _mallowdecimals = false;
public int _bordercolor = 0;
public int _bordercolorinvalid = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.b4xinputtemplate __ref,b4a.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=30015489;
 //BA.debugLineNum = 30015489;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=30015490;
 //BA.debugLineNum = 30015490;BA.debugLine="End Sub";
return null;
}
public void  _show(b4a.example.b4xinputtemplate __ref,b4a.example.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.b4xinputtemplate parent,b4a.example.b4xinputtemplate __ref,b4a.example.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4a.example.b4xinputtemplate __ref;
b4a.example.b4xinputtemplate parent;
b4a.example.b4xdialog _dialog;
anywheresoftware.b4a.objects.EditTextWrapper _tf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xinputtemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4a.example.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=30081026;
 //BA.debugLineNum = 30081026;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._xdialog /*b4a.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=30081027;
 //BA.debugLineNum = 30081027;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xinputtemplate", "show"),(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=30081028;
 //BA.debugLineNum = 30081028;BA.debugLine="TextField1.Text = Text";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._text /*String*/ ));
RDebugUtils.currentLine=30081029;
 //BA.debugLineNum = 30081029;BA.debugLine="Validate(Text)";
__ref._validate /*String*/ (null,__ref._text /*String*/ );
RDebugUtils.currentLine=30081030;
 //BA.debugLineNum = 30081030;BA.debugLine="TextField1.RequestFocus";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=30081032;
 //BA.debugLineNum = 30081032;BA.debugLine="Dim tf As EditText = TextField1";
_tf = new anywheresoftware.b4a.objects.EditTextWrapper();
_tf = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=30081033;
 //BA.debugLineNum = 30081033;BA.debugLine="tf.SelectAll";
_tf.SelectAll();
RDebugUtils.currentLine=30081034;
 //BA.debugLineNum = 30081034;BA.debugLine="IME.ShowKeyboard(TextField1)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=30081039;
 //BA.debugLineNum = 30081039;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(b4a.example.b4xinputtemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=30146560;
 //BA.debugLineNum = 30146560;BA.debugLine="Private Sub DialogClosed(Result As Int)";
RDebugUtils.currentLine=30146561;
 //BA.debugLineNum = 30146561;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
RDebugUtils.currentLine=30146562;
 //BA.debugLineNum = 30146562;BA.debugLine="Text = TextField1.Text";
__ref._text /*String*/  = __ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
 };
RDebugUtils.currentLine=30146564;
 //BA.debugLineNum = 30146564;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xinputtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=29360129;
 //BA.debugLineNum = 29360129;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=29360131;
 //BA.debugLineNum = 29360131;BA.debugLine="Public Text As String";
_text = "";
RDebugUtils.currentLine=29360132;
 //BA.debugLineNum = 29360132;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4a.example.b4xdialog();
RDebugUtils.currentLine=29360133;
 //BA.debugLineNum = 29360133;BA.debugLine="Public RegexPattern As String";
_regexpattern = "";
RDebugUtils.currentLine=29360134;
 //BA.debugLineNum = 29360134;BA.debugLine="Public TextField1 As B4XView";
_textfield1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=29360135;
 //BA.debugLineNum = 29360135;BA.debugLine="Public lblTitle As B4XView";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=29360137;
 //BA.debugLineNum = 29360137;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=29360139;
 //BA.debugLineNum = 29360139;BA.debugLine="Private mAllowDecimals As Boolean";
_mallowdecimals = false;
RDebugUtils.currentLine=29360140;
 //BA.debugLineNum = 29360140;BA.debugLine="Private BorderColor = xui.Color_White, BorderColo";
_bordercolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
_bordercolorinvalid = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red;
RDebugUtils.currentLine=29360141;
 //BA.debugLineNum = 29360141;BA.debugLine="End Sub";
return "";
}
public String  _configurefornumbers(b4a.example.b4xinputtemplate __ref,boolean _allowdecimals,boolean _allownegative) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "configurefornumbers", true))
	 {return ((String) Debug.delegate(ba, "configurefornumbers", new Object[] {_allowdecimals,_allownegative}));}
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
RDebugUtils.currentLine=29556736;
 //BA.debugLineNum = 29556736;BA.debugLine="Public Sub ConfigureForNumbers (AllowDecimals As B";
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="Dim et As EditText = TextField1";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=29556739;
 //BA.debugLineNum = 29556739;BA.debugLine="If AllowDecimals Or AllowNegative Then";
if (_allowdecimals || _allownegative) { 
RDebugUtils.currentLine=29556740;
 //BA.debugLineNum = 29556740;BA.debugLine="et.InputType = et.INPUT_TYPE_DECIMAL_NUMBERS";
_et.setInputType(_et.INPUT_TYPE_DECIMAL_NUMBERS);
 }else {
RDebugUtils.currentLine=29556742;
 //BA.debugLineNum = 29556742;BA.debugLine="et.InputType = et.INPUT_TYPE_NUMBERS";
_et.setInputType(_et.INPUT_TYPE_NUMBERS);
 };
RDebugUtils.currentLine=29556755;
 //BA.debugLineNum = 29556755;BA.debugLine="If AllowDecimals And AllowNegative Then";
if (_allowdecimals && _allownegative) { 
RDebugUtils.currentLine=29556756;
 //BA.debugLineNum = 29556756;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
__ref._regexpattern /*String*/  = "^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else 
{RDebugUtils.currentLine=29556757;
 //BA.debugLineNum = 29556757;BA.debugLine="Else If AllowDecimals And AllowNegative = False T";
if (_allowdecimals && _allownegative==__c.False) { 
RDebugUtils.currentLine=29556758;
 //BA.debugLineNum = 29556758;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$\"";
__ref._regexpattern /*String*/  = "^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else 
{RDebugUtils.currentLine=29556759;
 //BA.debugLineNum = 29556759;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
if (_allowdecimals==__c.False && _allownegative==__c.True) { 
RDebugUtils.currentLine=29556760;
 //BA.debugLineNum = 29556760;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)$\"";
__ref._regexpattern /*String*/  = "^-?(0|[1-9]\\d*)$";
 }else 
{RDebugUtils.currentLine=29556761;
 //BA.debugLineNum = 29556761;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
if (_allowdecimals==__c.False && _allownegative==__c.False) { 
RDebugUtils.currentLine=29556762;
 //BA.debugLineNum = 29556762;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)$\"";
__ref._regexpattern /*String*/  = "^(0|[1-9]\\d*)$";
 }}}}
;
RDebugUtils.currentLine=29556764;
 //BA.debugLineNum = 29556764;BA.debugLine="mAllowDecimals = AllowDecimals";
__ref._mallowdecimals /*boolean*/  = _allowdecimals;
RDebugUtils.currentLine=29556765;
 //BA.debugLineNum = 29556765;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xinputtemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=29425664;
 //BA.debugLineNum = 29425664;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=29425665;
 //BA.debugLineNum = 29425665;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=29425666;
 //BA.debugLineNum = 29425666;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 80dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=29425667;
 //BA.debugLineNum = 29425667;BA.debugLine="mBase.LoadLayout(\"B4XInputTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("B4XInputTemplate",ba);
RDebugUtils.currentLine=29425668;
 //BA.debugLineNum = 29425668;BA.debugLine="TextField1.TextColor = xui.Color_White";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=29425670;
 //BA.debugLineNum = 29425670;BA.debugLine="IME.Initialize(\"\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("");
RDebugUtils.currentLine=29425671;
 //BA.debugLineNum = 29425671;BA.debugLine="Dim jo As JavaObject = TextField1";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=29425672;
 //BA.debugLineNum = 29425672;BA.debugLine="jo.RunMethod(\"setImeOptions\", Array(Bit.Or(335544";
_jo.RunMethod("setImeOptions",new Object[]{(Object)(__c.Bit.Or((int) (33554432),(int) (6)))});
RDebugUtils.currentLine=29425674;
 //BA.debugLineNum = 29425674;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=29425675;
 //BA.debugLineNum = 29425675;BA.debugLine="jo.RunMethod(\"RemoveWarning\", Null)";
_jo.RunMethod("RemoveWarning",(Object[])(__c.Null));
RDebugUtils.currentLine=29425678;
 //BA.debugLineNum = 29425678;BA.debugLine="SetBorder(BorderColor)";
__ref._setborder /*String*/ (null,__ref._bordercolor /*int*/ );
RDebugUtils.currentLine=29425679;
 //BA.debugLineNum = 29425679;BA.debugLine="End Sub";
return "";
}
public String  _setborder(b4a.example.b4xinputtemplate __ref,int _bc) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_bc}));}
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Private Sub SetBorder(bc As Int)";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="TextField1.SetColorAndBorder(xui.Color_Transparen";
__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_bc,__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=29753346;
 //BA.debugLineNum = 29753346;BA.debugLine="End Sub";
return "";
}
public boolean  _isvalid(b4a.example.b4xinputtemplate __ref,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "isvalid", true))
	 {return ((Boolean) Debug.delegate(ba, "isvalid", new Object[] {_new}));}
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Private Sub IsValid(New As String) As Boolean";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="Return RegexPattern = \"\" Or Regex.IsMatch(RegexPa";
if (true) return (__ref._regexpattern /*String*/ ).equals("") || __c.Regex.IsMatch(__ref._regexpattern /*String*/ ,_new);
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="End Sub";
return false;
}
public String  _setbordercolor(b4a.example.b4xinputtemplate __ref,int _valid,int _invalid) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "setbordercolor", true))
	 {return ((String) Debug.delegate(ba, "setbordercolor", new Object[] {_valid,_invalid}));}
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Public Sub SetBorderColor(Valid As Int, Invalid As";
RDebugUtils.currentLine=29491201;
 //BA.debugLineNum = 29491201;BA.debugLine="BorderColor = Valid";
__ref._bordercolor /*int*/  = _valid;
RDebugUtils.currentLine=29491202;
 //BA.debugLineNum = 29491202;BA.debugLine="BorderColorInvalid = Invalid";
__ref._bordercolorinvalid /*int*/  = _invalid;
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="SetBorder(BorderColor)";
__ref._setborder /*String*/ (null,__ref._bordercolor /*int*/ );
RDebugUtils.currentLine=29491204;
 //BA.debugLineNum = 29491204;BA.debugLine="End Sub";
return "";
}
public String  _validate(b4a.example.b4xinputtemplate __ref,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "validate", true))
	 {return ((String) Debug.delegate(ba, "validate", new Object[] {_new}));}
int _bc = 0;
boolean _enabled = false;
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Private Sub Validate (New As String)";
RDebugUtils.currentLine=29687809;
 //BA.debugLineNum = 29687809;BA.debugLine="Dim bc As Int = BorderColor";
_bc = __ref._bordercolor /*int*/ ;
RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="Dim enabled As Boolean = True";
_enabled = __c.True;
RDebugUtils.currentLine=29687811;
 //BA.debugLineNum = 29687811;BA.debugLine="If IsValid(New) = False Then";
if (__ref._isvalid /*boolean*/ (null,_new)==__c.False) { 
RDebugUtils.currentLine=29687812;
 //BA.debugLineNum = 29687812;BA.debugLine="If New.Length > 0 Then";
if (_new.length()>0) { 
RDebugUtils.currentLine=29687813;
 //BA.debugLineNum = 29687813;BA.debugLine="bc = BorderColorInvalid";
_bc = __ref._bordercolorinvalid /*int*/ ;
 };
RDebugUtils.currentLine=29687815;
 //BA.debugLineNum = 29687815;BA.debugLine="enabled = False";
_enabled = __c.False;
 };
RDebugUtils.currentLine=29687817;
 //BA.debugLineNum = 29687817;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
__ref._xdialog /*b4a.example.b4xdialog*/ ._setbuttonstate /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive,_enabled);
RDebugUtils.currentLine=29687818;
 //BA.debugLineNum = 29687818;BA.debugLine="SetBorder(bc)";
__ref._setborder /*String*/ (null,_bc);
RDebugUtils.currentLine=29687819;
 //BA.debugLineNum = 29687819;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_action(b4a.example.b4xinputtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "textfield1_action", true))
	 {return ((String) Debug.delegate(ba, "textfield1_action", null));}
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Private Sub TextField1_Action";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="TextField1_EnterPressed";
__ref._textfield1_enterpressed /*String*/ (null);
RDebugUtils.currentLine=29884418;
 //BA.debugLineNum = 29884418;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_enterpressed(b4a.example.b4xinputtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "textfield1_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "textfield1_enterpressed", null));}
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Private Sub TextField1_EnterPressed";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="If IsValid(TextField1.Text) Then xDialog.Close(xu";
if (__ref._isvalid /*boolean*/ (null,__ref._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText())) { 
__ref._xdialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);};
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_textchanged(b4a.example.b4xinputtemplate __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xinputtemplate";
if (Debug.shouldDelegate(ba, "textfield1_textchanged", true))
	 {return ((String) Debug.delegate(ba, "textfield1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Private Sub TextField1_TextChanged (Old As String,";
RDebugUtils.currentLine=29622284;
 //BA.debugLineNum = 29622284;BA.debugLine="Validate (New)";
__ref._validate /*String*/ (null,_new);
RDebugUtils.currentLine=29622285;
 //BA.debugLineNum = 29622285;BA.debugLine="End Sub";
return "";
}
public void RemoveWarning() throws Exception{
	anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
	java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
	f.setAccessible(true);
	java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
	if (h == null) {
		h = new java.util.HashSet<String>();
		f.set(s, h);
	}
	h.add("textfield1_textchanged");
}
}