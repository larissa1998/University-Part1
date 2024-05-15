unit UnitAtbah;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls;

type
  TFormAtbah = class(TForm)
    Edit1: TEdit;
    Edit2: TEdit;
    Button1: TButton;
    Button2: TButton;
    Button3: TButton;
    Button4: TButton;
    Label1: TLabel;
    procedure Button1Click(Sender: TObject);
    procedure Button3Click(Sender: TObject);
    procedure Button2Click(Sender: TObject);
    procedure Button4Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  FormAtbah: TFormAtbah;

implementation

{$R *.dfm}

procedure TFormAtbah.Button1Click(Sender: TObject);
var i:integer;         resultado:array[1..10] of string;
begin
edit2.Text:='';
//SetLength(resultado, 100);
for i := 1 to 10 do
begin
  if((edit1.text[i])='a') then
    begin
    resultado[i]:='i';
    end
    else if((edit1.text[i])='i') then
    begin
    resultado[i]:='a';
    end
    else if((edit1.text[i])='b') then
    begin
    resultado[i]:='h';
    end
    else if((edit1.text[i])='h') then
    begin
    resultado[i]:='b';
    end
    else if((edit1.text[i])='c') then
    begin
    resultado[i]:='g';
    end
    else if((edit1.text[i])='g') then
    begin
    resultado[i]:='c';
    end
    else if((edit1.text[i])='d') then
    begin
    resultado[i]:='f';
    end
    else if((edit1.text[i])='f') then
    begin
    resultado[i]:='d';
    end
    else if((edit1.text[i])='j') then
    begin
    resultado[i]:='r';
    end
    else if((edit1.text[i])='r') then
    begin
    resultado[i]:='j';
    end
    else if((edit1.text[i])='k') then
    begin
    resultado[i]:='q';
    end
    else if((edit1.text[i])='q') then
    begin
    resultado[i]:='k';
    end
    else if((edit1.text[i])='l') then
    begin
    resultado[i]:='p';
    end
    else if((edit1.text[i])='p') then
    begin
    resultado[i]:='l';
    end
    else if((edit1.text[i])='m') then
    begin
    resultado[i]:='o';
    end
    else if((edit1.text[i])='o') then
    begin
    resultado[i]:='m';
    end
    else if((edit1.text[i])='e') then
    begin
    resultado[i]:='n';
    end
    else if((edit1.text[i])='n') then
    begin
    resultado[i]:='e';
    end
    else if((edit1.text[i])='s') then
    begin
    resultado[i]:='z';
    end
    else if((edit1.text[i])='z') then
    begin
    resultado[i]:='s';
    end
    else if((edit1.text[i])='t') then
    begin
    resultado[i]:='y';
    end
    else if((edit1.text[i])='y') then
    begin
    resultado[i]:='t';
    end
    else if((edit1.text[i])='u') then
    begin
    resultado[i]:='x';
    end
    else if((edit1.text[i])='x') then
    begin
    resultado[i]:='u';
    end
    else if((edit1.text[i])='v') then
    begin
    resultado[i]:='w';
    end
    else if((edit1.text[i])='w') then
    begin
    resultado[i]:='v';
    end;
    edit2.Text:=resultado[1]+resultado[2]+resultado[3]+resultado[4]+resultado[5]+resultado[6]+resultado[7]+resultado[8]+resultado[9]+resultado[10];


end;
 end;
procedure TFormAtbah.Button2Click(Sender: TObject);
begin
Edit1.Text:='';
end;

procedure TFormAtbah.Button3Click(Sender: TObject);
var i:integer;         resultado:array[1..10] of string;
begin
edit1.Text:='';
//SetLength(resultado, 100);
for i := 1 to 10 do
begin
  if((edit2.text[i])='a') then
    begin
    resultado[i]:='i';
    end
    else if((edit2.text[i])='i') then
    begin
    resultado[i]:='a';
    end
    else if((edit2.text[i])='b') then
    begin
    resultado[i]:='h';
    end
    else if((edit2.text[i])='h') then
    begin
    resultado[i]:='b';
    end
    else if((edit2.text[i])='c') then
    begin
    resultado[i]:='g';
    end
    else if((edit2.text[i])='g') then
    begin
    resultado[i]:='c';
    end
    else if((edit2.text[i])='d') then
    begin
    resultado[i]:='f';
    end
    else if((edit2.text[i])='f') then
    begin
    resultado[i]:='d';
    end
    else if((edit2.text[i])='j') then
    begin
    resultado[i]:='r';
    end
    else if((edit2.text[i])='r') then
    begin
    resultado[i]:='j';
    end
    else if((edit2.text[i])='k') then
    begin
    resultado[i]:='q';
    end
    else if((edit2.text[i])='q') then
    begin
    resultado[i]:='k';
    end
    else if((edit2.text[i])='l') then
    begin
    resultado[i]:='p';
    end
    else if((edit2.text[i])='p') then
    begin
    resultado[i]:='l';
    end
    else if((edit2.text[i])='m') then
    begin
    resultado[i]:='o';
    end
    else if((edit2.text[i])='o') then
    begin
    resultado[i]:='m';
    end
    else if((edit2.text[i])='e') then
    begin
    resultado[i]:='n';
    end
    else if((edit2.text[i])='n') then
    begin
    resultado[i]:='e';
    end
    else if((edit2.text[i])='s') then
    begin
    resultado[i]:='z';
    end
    else if((edit2.text[i])='z') then
    begin
    resultado[i]:='s';
    end
    else if((edit2.text[i])='t') then
    begin
    resultado[i]:='y';
    end
    else if((edit2.text[i])='y') then
    begin
    resultado[i]:='t';
    end
    else if((edit2.text[i])='u') then
    begin
    resultado[i]:='x';
    end
    else if((edit2.text[i])='x') then
    begin
    resultado[i]:='u';
    end
    else if((edit2.text[i])='v') then
    begin
    resultado[i]:='w';
    end
    else if((edit2.text[i])='w') then
    begin
    resultado[i]:='v';
    end;
    edit1.Text:=resultado[1]+resultado[2]+resultado[3]+resultado[4]+resultado[5]+resultado[6]+resultado[7]+resultado[8]+resultado[9]+resultado[10];


end;


end;

procedure TFormAtbah.Button4Click(Sender: TObject);
begin
Edit2.Text:='';
end;

end.
