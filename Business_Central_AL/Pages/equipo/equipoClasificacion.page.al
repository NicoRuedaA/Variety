page 50102 EquipoClasificacion
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Lists;
    SourceTable = Equipo;
    Editable = false;
    SourceTableView = sorting(Puntos) order(descending);

    Caption = 'Equipo Clasificacion';


    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {

                field("Codigo Equipo"; Rec."Cod. Equipo")
                {
                    ToolTip = 'Specifies the value';
                }


                field(Nombre; Rec.Nombre)
                {
                    ToolTip = 'Specifies the value';
                }
                field(Puntos; Rec.Puntos)
                {
                    ToolTip = 'Specifies the value';
                }
                field(Victorias; Rec.Victorias)
                {
                    ToolTip = 'Specifies the value';
                }
                field(Empates; Rec.Empates)
                {
                    ToolTip = 'Specifies the value';
                }
                field(Derrotas; Rec.Derrotas)
                {
                    ToolTip = 'Specifies the value';
                }
                field("Partidos jugados"; Rec."Partidos jugados")
                {
                    ToolTip = 'Specifies the value';
                }


            }
        }
        area(Factboxes)
        {

        }
    }


}