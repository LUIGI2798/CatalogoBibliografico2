package it.epicode.Catalogo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Rivista extends ElementoCatalogo {
    public enum Periodicita { SETTIMANALE, MENSILE, SEMESTRALE }
    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;
}