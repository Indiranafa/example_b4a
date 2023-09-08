package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xorderedmap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xorderedmap");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xorderedmap.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _map = null;
public anywheresoftware.b4a.objects.collections.List _list = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public boolean  _containskey(b4a.example.b4xorderedmap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "containskey", true))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Public Sub ContainsKey (Key As Object) As Boolean";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Return map.ContainsKey(Key)";
if (true) return __ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_key);
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="End Sub";
return false;
}
public Object  _get(b4a.example.b4xorderedmap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_key}));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub Get (Key As Object) As Object";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Return map.Get(Key)";
if (true) return __ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_key);
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.b4xorderedmap __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="map.Initialize";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="list.Initialize";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getkeys(b4a.example.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getkeys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getkeys", null));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Public Sub getKeys As List";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Return list";
if (true) return __ref._list /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="End Sub";
return null;
}
public String  _put(b4a.example.b4xorderedmap __ref,Object _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "put", true))
	 {return ((String) Debug.delegate(ba, "put", new Object[] {_key,_value}));}
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Public Sub Put (Key As Object, Value As Object)";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="If map.ContainsKey(Key) = False Then";
if (__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_key)==__c.False) { 
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="list.Add(Key)";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .Add(_key);
 };
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="map.Put(Key, Value)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_key,_value);
RDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="End Sub";
return "";
}
public String  _remove(b4a.example.b4xorderedmap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Public Sub Remove (Key As Object)";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="If map.ContainsKey(Key) = False Then Return";
if (__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_key)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="list.RemoveAt(list.IndexOf(Key))";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_key));
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="map.Remove(Key)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Remove(_key);
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getvalues(b4a.example.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getvalues", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getvalues", null));}
anywheresoftware.b4a.objects.collections.List _res = null;
Object _key = null;
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Public Sub getValues As List";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="For Each key As Object In list";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._list /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = group3.Get(index3);
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="res.Add(map.Get(key))";
_res.Add(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_key));
 }
};
RDebugUtils.currentLine=13434886;
 //BA.debugLineNum = 13434886;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="End Sub";
return null;
}
public int  _getsize(b4a.example.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Return map.Size";
if (true) return __ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .getSize();
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.example.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Private map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="Private list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="list.Clear";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="map.Clear";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="End Sub";
return "";
}
public Object  _getdataforserializator(b4a.example.b4xorderedmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getdataforserializator", true))
	 {return ((Object) Debug.delegate(ba, "getdataforserializator", null));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Public Sub GetDataForSerializator As Object";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Return Array(map, list)";
if (true) return (Object)(new Object[]{(Object)(__ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._list /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return null;
}
public Object  _getdefault(b4a.example.b4xorderedmap __ref,Object _key,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "getdefault", true))
	 {return ((Object) Debug.delegate(ba, "getdefault", new Object[] {_key,_defaultvalue}));}
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Public Sub GetDefault (Key As Object, DefaultValue";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Return map.GetDefault(Key, DefaultValue)";
if (true) return __ref._map /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault(_key,_defaultvalue);
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="End Sub";
return null;
}
public String  _setdatafromserializator(b4a.example.b4xorderedmap __ref,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xorderedmap";
if (Debug.shouldDelegate(ba, "setdatafromserializator", true))
	 {return ((String) Debug.delegate(ba, "setdatafromserializator", new Object[] {_data}));}
Object[] _o = null;
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Public Sub SetDataFromSerializator (Data As Object";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="Dim o() As Object = Data";
_o = (Object[])(_data);
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="map = o(0)";
__ref._map /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_o[(int) (0)]));
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="list = o(1)";
__ref._list /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_o[(int) (1)]));
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="End Sub";
return "";
}
}