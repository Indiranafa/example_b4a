package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xbitset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xbitset");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xbitset.class).invoke(this, new Object[] {null});
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
public int[] _data = null;
public int _msize = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(b4a.example.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="Private data() As Int";
_data = new int[(int) (0)];
;
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="Private mSize As Int";
_msize = 0;
RDebugUtils.currentLine=9502727;
 //BA.debugLineNum = 9502727;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="Dim data(Bit.ShiftRight(mSize, 5) + 1) As Int";
_data = new int[(int) (__c.Bit.ShiftRight(__ref._msize /*int*/ ,(int) (5))+1)];
;
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="End Sub";
return "";
}
public boolean  _get(b4a.example.b4xbitset __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Boolean) Debug.delegate(ba, "get", new Object[] {_index}));}
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub Get(Index As Int) As Boolean";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = __c.Bit.ShiftRight(_index,(int) (5));
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = __c.Bit.And(((int)0x0000001f),_index);
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="Dim BlockValue As Int = data(dindex)";
_blockvalue = __ref._data /*int[]*/ [_dindex];
RDebugUtils.currentLine=9699336;
 //BA.debugLineNum = 9699336;BA.debugLine="Return Bit.And(BlockValue, Bit.ShiftLeft(1, offse";
if (true) return __c.Bit.And(_blockvalue,__c.Bit.ShiftLeft((int) (1),_offset))!=0;
RDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="End Sub";
return false;
}
public int  _getsize(b4a.example.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Return mSize";
if (true) return __ref._msize /*int*/ ;
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.b4xbitset __ref,anywheresoftware.b4a.BA _ba,int _size) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_size}));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub Initialize (Size As Int)";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="mSize = Size";
__ref._msize /*int*/  = _size;
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="Clear";
__ref._clear /*String*/ (null);
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="End Sub";
return "";
}
public String  _set(b4a.example.b4xbitset __ref,int _index,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_index,_value}));}
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
int _newblockvalue = 0;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub Set(Index As Int, Value As Boolean)";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = __c.Bit.ShiftRight(_index,(int) (5));
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = __c.Bit.And(((int)0x0000001f),_index);
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="Dim BlockValue As Int = data(dindex)";
_blockvalue = __ref._data /*int[]*/ [_dindex];
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="Dim NewBlockValue As Int";
_newblockvalue = 0;
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="If Value Then";
if (_value) { 
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="NewBlockValue = Bit.Or(BlockValue, Bit.ShiftLeft";
_newblockvalue = __c.Bit.Or(_blockvalue,__c.Bit.ShiftLeft((int) (1),_offset));
 }else {
RDebugUtils.currentLine=9633804;
 //BA.debugLineNum = 9633804;BA.debugLine="NewBlockValue = Bit.And(BlockValue, Bit.Not(Bit.";
_newblockvalue = __c.Bit.And(_blockvalue,__c.Bit.Not(__c.Bit.ShiftLeft((int) (1),_offset)));
 };
RDebugUtils.currentLine=9633809;
 //BA.debugLineNum = 9633809;BA.debugLine="data(dindex) = NewBlockValue";
__ref._data /*int[]*/ [_dindex] = _newblockvalue;
RDebugUtils.currentLine=9633811;
 //BA.debugLineNum = 9633811;BA.debugLine="End Sub";
return "";
}
}