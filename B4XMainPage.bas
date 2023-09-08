B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private txtUserName As EditText
	Private txtPassword As EditText
	Private lblForgot As Label
	Private btnLogin As Button
	Private lblDaftar As Label
	Dim pageHome As Home
	Dim pageDaftar As Daftar
	Dim pageDaftarAdmin As DaftarAdmin
	Dim pageDaftarPengunjung As DaftarPengunjung
	Dim requestjob As HttpJob
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("Login")
	
	txtUserName.Text = ""
	txtPassword.Text = ""
	txtUserName.Color = Colors.Transparent
	txtPassword.Color = Colors.Transparent
	
	pageHome.Initialize
	B4XPages.AddPage("pageHome1", pageHome)
	
	pageDaftar.Initialize
	B4XPages.AddPage("pageDaftar1", pageDaftar)

	pageDaftarAdmin.Initialize
	B4XPages.AddPage("pageDaftarAdmin1", pageDaftarAdmin)
	
	pageDaftarPengunjung.Initialize
	B4XPages.AddPage("pageDaftarPengunjung1", pageDaftarPengunjung)
	
End Sub

Sub animasi
	Root.Left = 100%x
	Root.SetLayoutAnimated(300,0,0,Root.Width,Root.Height)
End Sub

Sub proseslogin
	requestjob.Initialize("requestjob",Me)
	requestjob.PostString(Main.IPServer & "tr_data.php","tipe=login" & _
	"&txtUserName=" & txtUserName.Text & _
	"&txtPassword=" & txtPassword.Text)
	ProgressDialogShow("Proses Login...")
End Sub

Sub JobDone (Job As HttpJob)
	If Job.Success = True Then
		Log(Job.GetString)
		
		Select Job.JobName
			Case "requestjob"
				If Job.GetString = "Not Found" Then
					txtUserName.Text = ""
					txtPassword.Text = ""
					ToastMessageShow(Job.GetString,True)
					ProgressDialogHide
				Else
					Dim parser As JSONParser
					parser.Initialize(Job.GetString)
					Dim jRoot As List = parser.NextArray
					For Each coljRoot As Map In jRoot
					Dim id As String = coljRoot.Get("id")
					Dim level As String = coljRoot.Get("level")
					Dim username As String = coljRoot.Get("username")
					Main.id_user = id
					Main.level_user = level
					B4XPages.ShowPage("pageHome1")
					pageHome.animasi
					
					Next
				End If
		End Select
		
		Else
			Log("Error: " & Job.ErrorMessage)
			ToastMessageShow("Error: " & Job.ErrorMessage, True)
	End If
	Job.Release
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub lblForgot_Click
	
End Sub

Sub daftar
	B4XPages.ShowPage("pageDaftar1")
	pageDaftar.animasi
End Sub

Private Sub btnLogin_Click
	
End Sub

Private Sub lblDaftar_Click
	daftar
End Sub

Sub DaftarAdmin1
	B4XPages.ShowPage("pageDaftarAdmin1")
	pageDaftarAdmin.animasi
End Sub

Sub DaftarPengunjung1
	B4XPages.ShowPage("pageDaftarPengunjung1")
	pageDaftarPengunjung.animasi
End Sub