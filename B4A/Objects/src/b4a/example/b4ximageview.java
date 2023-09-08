package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4ximageview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4ximageview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4ximageview.class).invoke(this, new Object[] {null});
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
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public String _mresizemode = "";
public boolean _mround = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _mbitmap = null;
public int _mbackgroundcolor = 0;
public int _mcornersradius = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.b4ximageview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=28508160;
 //BA.debugLineNum = 28508160;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=28508161;
 //BA.debugLineNum = 28508161;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
float _imageviewwidth = 0f;
float _imageviewheight = 0f;
float _bmpratio = 0f;
float _r = 0f;
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="If mBitmap.IsInitialized = False Then Return";
if (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="Dim ImageViewWidth, ImageViewHeight As Float";
_imageviewwidth = 0f;
_imageviewheight = 0f;
RDebugUtils.currentLine=28966916;
 //BA.debugLineNum = 28966916;BA.debugLine="Dim bmpRatio As Float = mBitmap.Width / mBitmap.H";
_bmpratio = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
RDebugUtils.currentLine=28966917;
 //BA.debugLineNum = 28966917;BA.debugLine="Select mResizeMode";
switch (BA.switchObjectToInt(__ref._mresizemode /*String*/ ,"FILL","FIT","FILL_WIDTH","FILL_HEIGHT","FILL_NO_DISTORTIONS","NONE")) {
case 0: {
RDebugUtils.currentLine=28966919;
 //BA.debugLineNum = 28966919;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=28966920;
 //BA.debugLineNum = 28966920;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=28966922;
 //BA.debugLineNum = 28966922;BA.debugLine="Dim r As Float = Min(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=28966923;
 //BA.debugLineNum = 28966923;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=28966924;
 //BA.debugLineNum = 28966924;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 2: {
RDebugUtils.currentLine=28966926;
 //BA.debugLineNum = 28966926;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=28966927;
 //BA.debugLineNum = 28966927;BA.debugLine="ImageViewHeight = ImageViewWidth / bmpRatio";
_imageviewheight = (float) (_imageviewwidth/(double)_bmpratio);
 break; }
case 3: {
RDebugUtils.currentLine=28966929;
 //BA.debugLineNum = 28966929;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=28966930;
 //BA.debugLineNum = 28966930;BA.debugLine="ImageViewWidth = ImageViewHeight * bmpRatio";
_imageviewwidth = (float) (_imageviewheight*_bmpratio);
 break; }
case 4: {
RDebugUtils.currentLine=28966932;
 //BA.debugLineNum = 28966932;BA.debugLine="Dim r As Float = Max(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=28966933;
 //BA.debugLineNum = 28966933;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=28966934;
 //BA.debugLineNum = 28966934;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 5: {
RDebugUtils.currentLine=28966936;
 //BA.debugLineNum = 28966936;BA.debugLine="ImageViewWidth = mBitmap.Width";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth());
RDebugUtils.currentLine=28966937;
 //BA.debugLineNum = 28966937;BA.debugLine="ImageViewHeight = mBitmap.Height";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
 break; }
default: {
RDebugUtils.currentLine=28966939;
 //BA.debugLineNum = 28966939;BA.debugLine="Log(\"Invalid resize mode: \"  & mResizeMode)";
__c.LogImpl("928966939","Invalid resize mode: "+__ref._mresizemode /*String*/ ,0);
 break; }
}
;
RDebugUtils.currentLine=28966941;
 //BA.debugLineNum = 28966941;BA.debugLine="iv.SetLayoutAnimated(0, Round(mBase.Width / 2 - I";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-_imageviewwidth/(double)2)),(int) (__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_imageviewheight/(double)2)),(int) (__c.Round(_imageviewwidth)),(int) (__c.Round(_imageviewheight)));
RDebugUtils.currentLine=28966942;
 //BA.debugLineNum = 28966942;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=28311554;
 //BA.debugLineNum = 28311554;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=28311555;
 //BA.debugLineNum = 28311555;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=28311556;
 //BA.debugLineNum = 28311556;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=28311557;
 //BA.debugLineNum = 28311557;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=28311558;
 //BA.debugLineNum = 28311558;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=28311559;
 //BA.debugLineNum = 28311559;BA.debugLine="Private mResizeMode As String";
_mresizemode = "";
RDebugUtils.currentLine=28311560;
 //BA.debugLineNum = 28311560;BA.debugLine="Private mRound As Boolean";
_mround = false;
RDebugUtils.currentLine=28311561;
 //BA.debugLineNum = 28311561;BA.debugLine="Private mBitmap As B4XBitmap";
_mbitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=28311562;
 //BA.debugLineNum = 28311562;BA.debugLine="Public mBackgroundColor As Int";
_mbackgroundcolor = 0;
RDebugUtils.currentLine=28311563;
 //BA.debugLineNum = 28311563;BA.debugLine="Private mCornersRadius As Int";
_mcornersradius = 0;
RDebugUtils.currentLine=28311564;
 //BA.debugLineNum = 28311564;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="mBitmap = Null";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="iv.SetBitmap(Null)";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=29097987;
 //BA.debugLineNum = 29097987;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.b4ximageview __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=28442624;
 //BA.debugLineNum = 28442624;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=28442625;
 //BA.debugLineNum = 28442625;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=28442626;
 //BA.debugLineNum = 28442626;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=28442627;
 //BA.debugLineNum = 28442627;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=28442628;
 //BA.debugLineNum = 28442628;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=28442629;
 //BA.debugLineNum = 28442629;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
RDebugUtils.currentLine=28442630;
 //BA.debugLineNum = 28442630;BA.debugLine="iv = iiv";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
RDebugUtils.currentLine=28442631;
 //BA.debugLineNum = 28442631;BA.debugLine="mRound =Props.Get(\"Round\")";
__ref._mround /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Round")));
RDebugUtils.currentLine=28442632;
 //BA.debugLineNum = 28442632;BA.debugLine="mResizeMode = Props.Get(\"ResizeMode\")";
__ref._mresizemode /*String*/  = BA.ObjectToString(_props.Get((Object)("ResizeMode")));
RDebugUtils.currentLine=28442633;
 //BA.debugLineNum = 28442633;BA.debugLine="mBackgroundColor = xui.PaintOrColorToColor(Props.";
__ref._mbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=28442634;
 //BA.debugLineNum = 28442634;BA.debugLine="mCornersRadius = DipToCurrent(Props.GetDefault(\"C";
__ref._mcornersradius /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(0)))));
RDebugUtils.currentLine=28442635;
 //BA.debugLineNum = 28442635;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=28442636;
 //BA.debugLineNum = 28442636;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=28442637;
 //BA.debugLineNum = 28442637;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getbitmap(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Public Sub getBitmap As B4XBitmap";
RDebugUtils.currentLine=29229057;
 //BA.debugLineNum = 29229057;BA.debugLine="Return mBitmap";
if (true) return __ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="End Sub";
return null;
}
public int  _getcornersradius(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getcornersradius", true))
	 {return ((Integer) Debug.delegate(ba, "getcornersradius", null));}
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Public Sub getCornersRadius As Int";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="Return mCornersRadius";
if (true) return __ref._mcornersradius /*int*/ ;
RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="End Sub";
return 0;
}
public String  _getresizemode(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getresizemode", true))
	 {return ((String) Debug.delegate(ba, "getresizemode", null));}
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Public Sub getResizeMode As String";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="Return mResizeMode";
if (true) return __ref._mresizemode /*String*/ ;
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="End Sub";
return "";
}
public boolean  _getroundedimage(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getroundedimage", true))
	 {return ((Boolean) Debug.delegate(ba, "getroundedimage", null));}
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Public Sub getRoundedImage As Boolean";
RDebugUtils.currentLine=28573697;
 //BA.debugLineNum = 28573697;BA.debugLine="Return mRound";
if (true) return __ref._mround /*boolean*/ ;
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.example.b4ximageview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=28377091;
 //BA.debugLineNum = 28377091;BA.debugLine="End Sub";
return "";
}
public String  _load(b4a.example.b4ximageview __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "load", true))
	 {return ((String) Debug.delegate(ba, "load", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Public Sub Load (Dir As String, FileName As String";
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="setBitmap(LoadBitmapSample(Dir, FileName, mBase.W";
__ref._setbitmap /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapSample(_dir,_filename,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()).getObject())));
RDebugUtils.currentLine=29032454;
 //BA.debugLineNum = 29032454;BA.debugLine="End Sub";
return "";
}
public String  _setbitmap(b4a.example.b4ximageview __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setbitmap", true))
	 {return ((String) Debug.delegate(ba, "setbitmap", new Object[] {_bmp}));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Public Sub setBitmap(Bmp As B4XBitmap)";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="mBitmap = Bmp";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bmp;
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="XUIViewsUtils.SetBitmapAndFill(iv, Bmp)";
_xuiviewsutils._setbitmapandfill /*String*/ (ba,__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_bmp);
RDebugUtils.currentLine=29163523;
 //BA.debugLineNum = 29163523;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=29163524;
 //BA.debugLineNum = 29163524;BA.debugLine="End Sub";
return "";
}
public String  _setcornersradius(b4a.example.b4ximageview __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setcornersradius", true))
	 {return ((String) Debug.delegate(ba, "setcornersradius", new Object[] {_i}));}
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Public Sub setCornersRadius (i As Int)";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="mCornersRadius = i";
__ref._mcornersradius /*int*/  = _i;
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=28770307;
 //BA.debugLineNum = 28770307;BA.debugLine="End Sub";
return "";
}
public String  _updateclip(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "updateclip", true))
	 {return ((String) Debug.delegate(ba, "updateclip", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Private Sub UpdateClip";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="If mRound Then";
if (__ref._mround /*boolean*/ ) { 
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,(int) (0),(int) (0),(int) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2)));
 }else {
RDebugUtils.currentLine=29294596;
 //BA.debugLineNum = 29294596;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,(int) (0),(int) (0),__ref._mcornersradius /*int*/ );
 };
RDebugUtils.currentLine=29294618;
 //BA.debugLineNum = 29294618;BA.debugLine="Dim jo As JavaObject = mBase";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=29294619;
 //BA.debugLineNum = 29294619;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(mRound Or";
_jo.RunMethod("setClipToOutline",new Object[]{(Object)(__ref._mround /*boolean*/  || __ref._mcornersradius /*int*/ >0)});
RDebugUtils.currentLine=29294621;
 //BA.debugLineNum = 29294621;BA.debugLine="End Sub";
return "";
}
public String  _setresizemode(b4a.example.b4ximageview __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setresizemode", true))
	 {return ((String) Debug.delegate(ba, "setresizemode", new Object[] {_s}));}
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Public Sub setResizeMode(s As String)";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="If s = mResizeMode Then Return";
if ((_s).equals(__ref._mresizemode /*String*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="mResizeMode = s";
__ref._mresizemode /*String*/  = _s;
RDebugUtils.currentLine=28901379;
 //BA.debugLineNum = 28901379;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=28901380;
 //BA.debugLineNum = 28901380;BA.debugLine="End Sub";
return "";
}
public String  _setroundedimage(b4a.example.b4ximageview __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setroundedimage", true))
	 {return ((String) Debug.delegate(ba, "setroundedimage", new Object[] {_b}));}
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Public Sub setRoundedImage (b As Boolean)";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="If b = mRound Then Return";
if (_b==__ref._mround /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="mRound = b";
__ref._mround /*boolean*/  = _b;
RDebugUtils.currentLine=28639235;
 //BA.debugLineNum = 28639235;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=28639236;
 //BA.debugLineNum = 28639236;BA.debugLine="End Sub";
return "";
}
}