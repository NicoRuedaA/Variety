table 50100 Jugador
{

    LookupPageId = JugadorList;
    DrillDownPageId = jugadorCard;

    fields
    {
        field(1; Nombre; Text[20])
        {
            Caption = 'Nombre';
        }
        field(2; "Codigo Equipo"; Code[3])
        {
            Caption = 'Codigo Equipo';
            TableRelation = Equipo."Cod. Equipo";

        }
        field(3; Pais; Code[10])
        {
            Caption = 'País';
            TableRelation = "Country/Region".Code;
        }
        field(4; Descripcion; Code[10])
        {
            Caption = 'Descripcion';
        }
        field(5; "Posicion de campo"; Enum Posiciones)
        {
            Caption = 'Posición del campo';
        }
        field(6; "Peso"; Decimal)
        {
            Caption = 'Peso';
        }
        field(7; "Altura"; Decimal)
        {
            Caption = 'Altura';
        }
        field(8; "Lesionado"; Boolean)
        {
            Caption = 'Esta lesionado';
        }


    }

    keys
    {
        key(Key1; Nombre)
        {
            Clustered = true;
        }
    }
}