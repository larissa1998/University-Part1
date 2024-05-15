unit UnitPrincipal;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls, Vcl.Menus;

type
  TForm1 = class(TForm)
    Button1: TButton;
    Button2: TButton;
    Button3: TButton;
    Label1: TLabel;
    Label2: TLabel;
    procedure Button1Click(Sender: TObject);
    procedure Button2Click(Sender: TObject);
    procedure Button3Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

uses UnitAtbash, UnitAlbam, UnitAtbah;

procedure TForm1.Button1Click(Sender: TObject);
begin
FormAtbash:=TFormAtbash.Create(self);
FormAtbash.ShowModal;
end;

procedure TForm1.Button2Click(Sender: TObject);
begin
FormAlbam:=TFormAlbam.Create(self);
FormAlbam.ShowModal;
end;

procedure TForm1.Button3Click(Sender: TObject);
begin
FormAtbah:=TFormAtbah.Create(self);
FormAtbah.ShowModal;
end;

end.
