page 50103 EquipoList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Lists;
    SourceTable = Equipo;

    CardPageId = EquipoCard;
    Caption = 'EquipoList';

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
                field(Pais; Rec.Pais)
                {
                    ToolTip = 'Specifies the value';
                }
                field(Nombre; Rec.Nombre)
                {
                    ToolTip = 'Specifies the value';
                }
                field("Numero Jugadores"; Rec."Numero Jugadores")
                {
                    ToolTip = 'Specifies the value';
                    Editable = false;
                }
                field("Informacion Adicional"; Rec."Informacion Adicional")
                {
                    ToolTip = 'Specifies the value';

                }

            }

        }


    }
}