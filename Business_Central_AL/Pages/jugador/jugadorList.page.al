page 50110 jugadorList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Lists;
    SourceTable = Jugador;
    Editable = false;

    CardPageId = jugadorCard;

    Caption = 'Jugador List';

    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(Nombre; Rec.Nombre)
                {
                    ToolTip = 'Specifies the value';
                }
                field(CodigoEquipo; Rec."Codigo Equipo")
                {
                    ToolTip = 'Specifies the value';
                }
                field("Pais"; Rec.Pais)
                {
                    ToolTip = 'Specifies the value';
                }
                field(Descripcion; Rec.Descripcion)
                {
                    ToolTip = 'Specifies the value';
                }
                field("Posicion de campo"; Rec."Posicion de campo")
                {
                    ToolTip = 'Specifies the value';
                }
                field(Peso; Rec.Peso)
                {
                    ToolTip = 'Specifies the value';
                }
                field(Altura; Rec.Altura)
                {
                    ToolTip = 'Specifies the value';
                }
                field(Lesionado; Rec.Lesionado)
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