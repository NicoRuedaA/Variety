table 50101 Equipo
{
    fields
    {
        field(1; "Cod. Equipo"; Code[3])
        {
        }
        field(2; "Pais"; Code[10])
        {
            TableRelation = "Country/Region".Code;
        }
        field(3; "Puntos"; Integer)
        {
        }
        field(4; "Victorias"; Integer)
        {
        }
        field(5; "Empates"; Integer)
        {
        }
        field(6; "Derrotas"; Integer)
        {
        }
        field(7; "Partidos jugados"; Integer)
        {
        }
        field(8; "Numero Jugadores"; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = count(Jugador where("Codigo Equipo" = field("Cod. Equipo")));
        }
        field(9; "Nombre"; Code[20])
        {
        }
        field(10; "Informacion Adicional"; Code[100])
        {
        }
    }



    keys
    {
        key(Key1; "Cod. Equipo")
        {
            Clustered = true;
        }
    }

}