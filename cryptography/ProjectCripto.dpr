program ProjectCripto;

uses
  Vcl.Forms,
  UnitPrincipal in 'UnitPrincipal.pas' {Form1},
  UnitAtbash in 'UnitAtbash.pas' {FormAtbash},
  UnitAlbam in 'UnitAlbam.pas' {FormAlbam},
  UnitAtbah in 'UnitAtbah.pas' {FormAtbah},
  Vcl.Themes,
  Vcl.Styles;

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  TStyleManager.TrySetStyle('Ruby Graphite');
  Application.CreateForm(TForm1, Form1);
  Application.CreateForm(TFormAtbash, FormAtbash);
  Application.CreateForm(TFormAlbam, FormAlbam);
  Application.CreateForm(TFormAtbah, FormAtbah);
  Application.Run;
end.
