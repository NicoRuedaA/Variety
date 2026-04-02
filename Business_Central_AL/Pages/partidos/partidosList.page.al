page 50104 PartidosList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Lists;
    SourceTable = Partido;

    Caption = 'Partidos List';
    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(ID; Rec.ID)
                {
                    ToolTip = 'Specifies the value';
                }
                field("Equipo Local"; Rec."Equipo Local")
                {
                    ToolTip = 'Specifies the value';
                }
                field("Equipo Visitante"; Rec."Equipo Visitante")
                {
                    ToolTip = 'Specifies the value';
                }
                field("Goles Local"; Rec."Goles Local")
                {
                    ToolTip = 'Specifies the value';
                }
                field("Goles Visitante"; Rec."Goles Visitante")
                {
                    ToolTip = 'Specifies the value';
                }
                field("Fecha Partido"; Rec."Fecha Partido")
                {
                    ToolTip = 'Specifies the value';
                }
                field("Partido Jugado"; Rec."Partido Jugado")
                {
                    ToolTip = 'Specifies the value';
                }

            }
        }
        area(Factboxes)
        {

        }


    }

    actions
    {
        area(Processing)
        {
            action("Jugar Partido")
            {

                trigger OnAction()
                begin
                    if (Rec."Partido Jugado") then begin
                        Error('El partido ya se ha jugado');
                    end else begin
                        calcularGoles();
                        actualizarPuntos();
                    end;

                end;
            }
        }

    }

    procedure calcularGoles()

    begin
        Rec."Goles Local" := Random(10);
        Rec."Goles Visitante" := Random(10);
        Rec."Partido Jugado" := true;
        Rec.Modify();
    end;

    procedure actualizarPuntos()

    var
        EquipoLocal: Record Equipo;
        EquipoVisitante: Record Equipo;
    begin

        EquipoLocal.Get(Rec."Equipo Local");
        EquipoVisitante.Get(Rec."Equipo Visitante");

        case true of
            Rec."Goles Local" < Rec."Goles Visitante":
                begin
                    EquipoLocal.Puntos += 3;
                    EquipoLocal.Victorias += 1;
                    EquipoVisitante.Derrotas += 1;

                end;

            rec."Goles Local" < rec."Goles Visitante":
                begin
                    EquipoVisitante.Puntos += 3;
                    EquipoLocal.Derrotas += 1;
                    EquipoVisitante.Victorias += 1;
                end
            else begin
                EquipoLocal.Puntos += 1;
                EquipoLocal.Empates += 1;
                EquipoVisitante.Puntos += 1;
                EquipoVisitante.Empates += 1;



            end;




        end;
        EquipoVisitante."Partidos jugados" += 1;
        EquipoLocal."Partidos jugados" += 1;
        EquipoLocal.Modify();
        EquipoVisitante.Modify()

    end;

}
