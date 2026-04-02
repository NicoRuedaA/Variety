table 50102 Partido
{
    fields
    {
        field(1; ID; Integer)

        {
            AutoIncrement = true;
        }
        field(2; "Equipo Local"; Code[3])
        {

            NotBlank = true;
            TableRelation = Equipo."Cod. Equipo";
        }
        field(3; "Equipo Visitante"; Code[3])
        {
            NotBlank = true;
            TableRelation = Equipo."Cod. Equipo";
        }
        field(4; "Goles Local"; Integer)
        {

        }
        field(5; "Goles Visitante"; Integer)
        {

        }
        field(6; "Fecha Partido"; Date)
        {

        }
        field(7; "Partido Jugado"; Boolean)
        {

        }




    }

    keys
    {
        key(Key1; ID)
        {
            Clustered = true;
        }
    }


    trigger OnInsert()
    begin
        "Fecha Partido" := Today;
        if (Rec."Equipo Local" = Rec."Equipo Visitante") then
            Error('Dos equipos no se pueden llamara igual');
    end;

    trigger OnModify()
    begin
        if (Rec."Equipo Local" = Rec."Equipo Visitante") then
            Error('Dos equipos no se pueden llamara igual')
    end;

}