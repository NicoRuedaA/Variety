page 50100 jugadorCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Jugador;

    Caption = 'Jugador Card';

    layout
    {
        area(Content)
        {
            group(GroupName)
            {
                field(Nombre; Rec.Nombre)
                {
                    ApplicationArea = All;
                }
                field(CodigoEquipo; Rec."Codigo Equipo")
                {
                    ApplicationArea = All;
                }
                field("Pais"; Rec.Pais)
                {
                    ApplicationArea = All;
                }
                field(Descripcion; Rec.Descripcion)
                {
                    ApplicationArea = All;
                }
                field("Posicion de campo"; Rec."Posicion de campo")
                {
                    ApplicationArea = All;
                }
                field(Peso; Rec.Peso)
                {
                    ApplicationArea = All;
                }
                field(Altura; Rec.Altura)
                {
                    ApplicationArea = All;
                }
                field(Lesionado; Rec.Lesionado)
                {
                    ApplicationArea = All;
                }
            }
        }
    }


}