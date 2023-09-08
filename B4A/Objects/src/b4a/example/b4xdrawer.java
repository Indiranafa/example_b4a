package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xdrawer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xdrawer");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xdrawer.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _msidewidth = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mleftpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mdarkpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbasepanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mcenterpanel = null;
public int _extrawidth = 0;
public float _touchxstart = 0f;
public float _touchystart = 0f;
public boolean _isopen = false;
public boolean _handlingswipe = false;
public boolean _startatscrim = false;
public boolean _menabled = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public boolean  _base_onintercepttouchevent(b4a.example.b4xdrawer __ref,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "base_onintercepttouchevent", true))
	 {return ((Boolean) Debug.delegate(ba, "base_onintercepttouchevent", new Object[] {_action,_x,_y,_motionevent}));}
float _dx = 0f;
float _dy = 0f;
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub Base_OnInterceptTouchEvent (Action As";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="If mEnabled = False Then Return False";
if (__ref._menabled /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="If IsOpen = False And x > mLeftPanel.Left + mLeft";
if (__ref._isopen /*boolean*/ ==__c.False && _x>__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__ref._extrawidth /*int*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="If IsOpen And x > mLeftPanel.Left + mLeftPanel.Wi";
if (__ref._isopen /*boolean*/  && _x>__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()) { 
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="If HandlingSwipe Then Return True";
if (__ref._handlingswipe /*boolean*/ ) { 
if (true) return __c.True;};
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE)) {
case 0: {
RDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="TouchXStart = X";
__ref._touchxstart /*float*/  = _x;
RDebugUtils.currentLine=7798795;
 //BA.debugLineNum = 7798795;BA.debugLine="TouchYStart = Y";
__ref._touchystart /*float*/  = _y;
RDebugUtils.currentLine=7798796;
 //BA.debugLineNum = 7798796;BA.debugLine="HandlingSwipe = False";
__ref._handlingswipe /*boolean*/  = __c.False;
 break; }
case 1: {
RDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="Dim dx As Float = Abs(x - TouchXStart)";
_dx = (float) (__c.Abs(_x-__ref._touchxstart /*float*/ ));
RDebugUtils.currentLine=7798799;
 //BA.debugLineNum = 7798799;BA.debugLine="Dim dy As Float = Abs(y - TouchYStart)";
_dy = (float) (__c.Abs(_y-__ref._touchystart /*float*/ ));
RDebugUtils.currentLine=7798800;
 //BA.debugLineNum = 7798800;BA.debugLine="If dy < 20dip And dx > 10dip Then";
if (_dy<__c.DipToCurrent((int) (20)) && _dx>__c.DipToCurrent((int) (10))) { 
RDebugUtils.currentLine=7798801;
 //BA.debugLineNum = 7798801;BA.debugLine="HandlingSwipe = True";
__ref._handlingswipe /*boolean*/  = __c.True;
 };
 break; }
}
;
RDebugUtils.currentLine=7798804;
 //BA.debugLineNum = 7798804;BA.debugLine="Return HandlingSwipe";
if (true) return __ref._handlingswipe /*boolean*/ ;
RDebugUtils.currentLine=7798805;
 //BA.debugLineNum = 7798805;BA.debugLine="End Sub";
return false;
}
public boolean  _base_ontouchevent(b4a.example.b4xdrawer __ref,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "base_ontouchevent", true))
	 {return ((Boolean) Debug.delegate(ba, "base_ontouchevent", new Object[] {_action,_x,_y,_motionevent}));}
int _leftpanelrightside = 0;
float _dx = 0f;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Private Sub Base_OnTouchEvent (Action As Int, X As";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="If mEnabled = False Then Return False";
if (__ref._menabled /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="Dim LeftPanelRightSide As Int = mLeftPanel.Left +";
_leftpanelrightside = (int) (__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="If HandlingSwipe = False And x > LeftPanelRightSi";
if (__ref._handlingswipe /*boolean*/ ==__c.False && _x>_leftpanelrightside) { 
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="If IsOpen Then";
if (__ref._isopen /*boolean*/ ) { 
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="TouchXStart = X";
__ref._touchxstart /*float*/  = _x;
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="If Action = mBasePanel.TOUCH_ACTION_UP Then set";
if (_action==__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
__ref._setleftopen /*String*/ (null,__c.False);};
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="If IsOpen = False And x > LeftPanelRightSide + E";
if (__ref._isopen /*boolean*/ ==__c.False && _x>_leftpanelrightside+__ref._extrawidth /*int*/ ) { 
RDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP)) {
case 0: {
RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="Dim dx As Float = x - TouchXStart";
_dx = (float) (_x-__ref._touchxstart /*float*/ );
RDebugUtils.currentLine=7733264;
 //BA.debugLineNum = 7733264;BA.debugLine="TouchXStart = X";
__ref._touchxstart /*float*/  = _x;
RDebugUtils.currentLine=7733265;
 //BA.debugLineNum = 7733265;BA.debugLine="If HandlingSwipe Or Abs(dx) > 3dip Then";
if (__ref._handlingswipe /*boolean*/  || __c.Abs(_dx)>__c.DipToCurrent((int) (3))) { 
RDebugUtils.currentLine=7733266;
 //BA.debugLineNum = 7733266;BA.debugLine="HandlingSwipe = True";
__ref._handlingswipe /*boolean*/  = __c.True;
RDebugUtils.currentLine=7733267;
 //BA.debugLineNum = 7733267;BA.debugLine="ChangeOffset(mLeftPanel.Left + dx, True, False";
__ref._changeoffset /*String*/ (null,(float) (__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+_dx),__c.True,__c.False);
 };
 break; }
case 1: {
RDebugUtils.currentLine=7733270;
 //BA.debugLineNum = 7733270;BA.debugLine="If HandlingSwipe Then";
if (__ref._handlingswipe /*boolean*/ ) { 
RDebugUtils.currentLine=7733271;
 //BA.debugLineNum = 7733271;BA.debugLine="ChangeOffset(mLeftPanel.Left, False, False)";
__ref._changeoffset /*String*/ (null,(float) (__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()),__c.False,__c.False);
 };
RDebugUtils.currentLine=7733273;
 //BA.debugLineNum = 7733273;BA.debugLine="HandlingSwipe = False";
__ref._handlingswipe /*boolean*/  = __c.False;
 break; }
}
;
RDebugUtils.currentLine=7733275;
 //BA.debugLineNum = 7733275;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=7733276;
 //BA.debugLineNum = 7733276;BA.debugLine="End Sub";
return false;
}
public String  _setleftopen(b4a.example.b4xdrawer __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "setleftopen", true))
	 {return ((String) Debug.delegate(ba, "setleftopen", new Object[] {_b}));}
float _x = 0f;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub setLeftOpen (b As Boolean)";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="If b = IsOpen Then Return";
if (_b==__ref._isopen /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="Dim x As Float";
_x = 0f;
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="If b Then x = 0 Else x = -mSideWidth";
if (_b) { 
_x = (float) (0);}
else {
_x = (float) (-__ref._msidewidth /*int*/ );};
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="ChangeOffset(x, False, False)";
__ref._changeoffset /*String*/ (null,_x,__c.False,__c.False);
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="End Sub";
return "";
}
public String  _changeoffset(b4a.example.b4xdrawer __ref,float _x,boolean _currentlytouching,boolean _noanimation) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "changeoffset", true))
	 {return ((String) Debug.delegate(ba, "changeoffset", new Object[] {_x,_currentlytouching,_noanimation}));}
int _visibleoffset = 0;
int _dx = 0;
int _duration = 0;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Private Sub ChangeOffset (x As Float, CurrentlyTou";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="x = Max(-mSideWidth, Min(0, x))";
_x = (float) (__c.Max(-__ref._msidewidth /*int*/ ,__c.Min(0,_x)));
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Dim VisibleOffset As Int = mSideWidth + x";
_visibleoffset = (int) (__ref._msidewidth /*int*/ +_x);
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="If CurrentlyTouching = False Then";
if (_currentlytouching==__c.False) { 
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="If (IsOpen And VisibleOffset < 0.8 * mSideWidth)";
if ((__ref._isopen /*boolean*/  && _visibleoffset<0.8*__ref._msidewidth /*int*/ ) || (__ref._isopen /*boolean*/ ==__c.False && _visibleoffset<0.2*__ref._msidewidth /*int*/ )) { 
RDebugUtils.currentLine=7864333;
 //BA.debugLineNum = 7864333;BA.debugLine="x = -mSideWidth";
_x = (float) (-__ref._msidewidth /*int*/ );
RDebugUtils.currentLine=7864334;
 //BA.debugLineNum = 7864334;BA.debugLine="SetIsOpen(False)";
__ref._setisopen /*String*/ (null,__c.False);
 }else {
RDebugUtils.currentLine=7864336;
 //BA.debugLineNum = 7864336;BA.debugLine="x = 0";
_x = (float) (0);
RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="SetIsOpen(True)";
__ref._setisopen /*String*/ (null,__c.True);
 };
RDebugUtils.currentLine=7864339;
 //BA.debugLineNum = 7864339;BA.debugLine="Dim dx As Int = Abs(mLeftPanel.Left - x)";
_dx = (int) (__c.Abs(__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()-_x));
RDebugUtils.currentLine=7864340;
 //BA.debugLineNum = 7864340;BA.debugLine="Dim duration As Int = Max(0, 200 * dx / mSideWid";
_duration = (int) (__c.Max(0,200*_dx/(double)__ref._msidewidth /*int*/ ));
RDebugUtils.currentLine=7864341;
 //BA.debugLineNum = 7864341;BA.debugLine="If NoAnimation Then duration = 0";
if (_noanimation) { 
_duration = (int) (0);};
RDebugUtils.currentLine=7864342;
 //BA.debugLineNum = 7864342;BA.debugLine="mLeftPanel.SetLayoutAnimated(duration, x, 0, mLe";
__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(_duration,(int) (_x),(int) (0),__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=7864343;
 //BA.debugLineNum = 7864343;BA.debugLine="mDarkPanel.SetColorAnimated(duration, mDarkPanel";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAnimated(_duration,__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor(),__ref._offsettocolor /*int*/ (null,(int) (_x)));
 }else {
RDebugUtils.currentLine=7864353;
 //BA.debugLineNum = 7864353;BA.debugLine="mDarkPanel.Color = OffsetToColor(x)";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._offsettocolor /*int*/ (null,(int) (_x)));
RDebugUtils.currentLine=7864354;
 //BA.debugLineNum = 7864354;BA.debugLine="mLeftPanel.Left = x";
__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (_x));
 };
RDebugUtils.currentLine=7864356;
 //BA.debugLineNum = 7864356;BA.debugLine="End Sub";
return "";
}
public String  _setisopen(b4a.example.b4xdrawer __ref,boolean _newstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "setisopen", true))
	 {return ((String) Debug.delegate(ba, "setisopen", new Object[] {_newstate}));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Private Sub SetIsOpen (NewState As Boolean)";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="If IsOpen = NewState Then Return";
if (__ref._isopen /*boolean*/ ==_newstate) { 
if (true) return "";};
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="IsOpen = NewState";
__ref._isopen /*boolean*/  = _newstate;
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_StateC";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_StateChanged",(int) (1))) { 
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="CallSubDelayed2(mCallBack,  mEventName & \"_State";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_StateChanged",(Object)(__ref._isopen /*boolean*/ ));
 };
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="End Sub";
return "";
}
public int  _offsettocolor(b4a.example.b4xdrawer __ref,int _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "offsettocolor", true))
	 {return ((Integer) Debug.delegate(ba, "offsettocolor", new Object[] {_x}));}
float _visible = 0f;
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Private Sub OffsetToColor (x As Int) As Int";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Dim Visible As Float = (mSideWidth + x) / mSideWi";
_visible = (float) ((__ref._msidewidth /*int*/ +_x)/(double)__ref._msidewidth /*int*/ );
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Return xui.Color_ARGB(100 * Visible, 0, 0, 0)";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (100*_visible),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.example.b4xdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="Private mSideWidth As Int";
_msidewidth = 0;
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="Private mLeftPanel As B4XView";
_mleftpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="Private mDarkPanel As B4XView";
_mdarkpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="Private mBasePanel As B4XView";
_mbasepanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="Private mCenterPanel As B4XView";
_mcenterpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="Public ExtraWidth As Int = 50dip";
_extrawidth = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=7536650;
 //BA.debugLineNum = 7536650;BA.debugLine="Private TouchXStart, TouchYStart As Float 'ignore";
_touchxstart = 0f;
_touchystart = 0f;
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="Private IsOpen As Boolean";
_isopen = false;
RDebugUtils.currentLine=7536652;
 //BA.debugLineNum = 7536652;BA.debugLine="Private HandlingSwipe As Boolean";
_handlingswipe = false;
RDebugUtils.currentLine=7536653;
 //BA.debugLineNum = 7536653;BA.debugLine="Private StartAtScrim As Boolean 'ignore";
_startatscrim = false;
RDebugUtils.currentLine=7536654;
 //BA.debugLineNum = 7536654;BA.debugLine="Private mEnabled As Boolean = True";
_menabled = __c.True;
RDebugUtils.currentLine=7536655;
 //BA.debugLineNum = 7536655;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getcenterpanel(b4a.example.b4xdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "getcenterpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getcenterpanel", null));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub getCenterPanel As B4XView";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Return mCenterPanel";
if (true) return __ref._mcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="End Sub";
return null;
}
public boolean  _getgestureenabled(b4a.example.b4xdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "getgestureenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getgestureenabled", null));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub getGestureEnabled As Boolean";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Return mEnabled";
if (true) return __ref._menabled /*boolean*/ ;
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="End Sub";
return false;
}
public boolean  _getleftopen(b4a.example.b4xdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "getleftopen", true))
	 {return ((Boolean) Debug.delegate(ba, "getleftopen", null));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub getLeftOpen As Boolean";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Return IsOpen";
if (true) return __ref._isopen /*boolean*/ ;
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getleftpanel(b4a.example.b4xdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "getleftpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getleftpanel", null));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub getLeftPanel As B4XView";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Return mLeftPanel";
if (true) return __ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.b4xdrawer __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,anywheresoftware.b4a.objects.B4XViewWrapper _parent,int _sidewidth) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname,_parent,_sidewidth}));}
anywheresoftware.b4a.objects.TouchPanelCreator _creator = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="mSideWidth = SideWidth";
__ref._msidewidth /*int*/  = _sidewidth;
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="Dim creator As TouchPanelCreator";
_creator = new anywheresoftware.b4a.objects.TouchPanelCreator();
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="mBasePanel = creator.CreateTouchPanel(\"base\")";
__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_creator.CreateTouchPanel(ba,"base").getObject()));
RDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="Parent.AddView(mBasePanel, 0, 0, Parent.Width, Pa";
_parent.AddView((android.view.View)(__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=7602192;
 //BA.debugLineNum = 7602192;BA.debugLine="mCenterPanel = xui.CreatePanel(\"\")";
__ref._mcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="mBasePanel.AddView(mCenterPanel, 0, 0, mBasePanel";
__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=7602194;
 //BA.debugLineNum = 7602194;BA.debugLine="mDarkPanel = xui.CreatePanel(\"dark\")";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"dark");
RDebugUtils.currentLine=7602195;
 //BA.debugLineNum = 7602195;BA.debugLine="mBasePanel.AddView(mDarkPanel, 0, 0, mBasePanel.W";
__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=7602196;
 //BA.debugLineNum = 7602196;BA.debugLine="mLeftPanel = xui.CreatePanel(\"LeftPanel\")";
__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"LeftPanel");
RDebugUtils.currentLine=7602197;
 //BA.debugLineNum = 7602197;BA.debugLine="mBasePanel.AddView(mLeftPanel, -SideWidth, 0, Sid";
__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (-_sidewidth),(int) (0),_sidewidth,__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=7602198;
 //BA.debugLineNum = 7602198;BA.debugLine="mLeftPanel.Color = xui.Color_Red";
__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=7602200;
 //BA.debugLineNum = 7602200;BA.debugLine="Dim p As Panel = mLeftPanel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=7602201;
 //BA.debugLineNum = 7602201;BA.debugLine="p.Elevation = 4dip";
_p.setElevation((float) (__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=7602215;
 //BA.debugLineNum = 7602215;BA.debugLine="End Sub";
return "";
}
public String  _leftpanel_click(b4a.example.b4xdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "leftpanel_click", true))
	 {return ((String) Debug.delegate(ba, "leftpanel_click", null));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Private Sub LeftPanel_Click";
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4a.example.b4xdrawer __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="If IsOpen Then ChangeOffset(-mSideWidth, False, T";
if (__ref._isopen /*boolean*/ ) { 
__ref._changeoffset /*String*/ (null,(float) (-__ref._msidewidth /*int*/ ),__c.False,__c.True);};
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="mBasePanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="mLeftPanel.SetLayoutAnimated(0, mLeftPanel.Left,";
__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),(int) (0),__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="mDarkPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="mCenterPanel.SetLayoutAnimated(0, 0, 0, Width, He";
__ref._mcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="End Sub";
return "";
}
public String  _setgestureenabled(b4a.example.b4xdrawer __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "setgestureenabled", true))
	 {return ((String) Debug.delegate(ba, "setgestureenabled", new Object[] {_b}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub setGestureEnabled (b As Boolean)";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="mEnabled = b";
__ref._menabled /*boolean*/  = _b;
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return "";
}
}