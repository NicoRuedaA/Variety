page 50101 EquipoCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Equipo;

    Caption = 'Equipo Card';

    layout
    {
        area(Content)
        {
            group(GroupName)
            {

                field("Codigo Equipo"; Rec."Cod. Equipo")
                {
                    ApplicationArea = All;
                }
                field(Pais; Rec.Pais)
                {
                    ApplicationArea = All;
                }
                field(Nombre; Rec.Nombre)
                {
                    ApplicationArea = All;
                }
                field("Numero Jugadores"; Rec."Numero Jugadores")
                {
                    ApplicationArea = All;
                }
                field("Informacion Adicional"; Rec."Informacion Adicional")
                {

                    ApplicationArea = All;
                }
            }
        }

    }
}