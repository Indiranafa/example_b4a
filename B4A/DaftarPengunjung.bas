﻿B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.5
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("Registrasi")
	'load the layout to Root
	
End Sub

Sub animasi
	Root.Left = 100%x
	Root.SetLayoutAnimated(300,0,0,Root.Width,Root.Height)
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.