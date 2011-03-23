package de.webshop.artikelverwaltung.domain;

import de.webshop.benutzerverwaltung.domain.AbstractBenutzer;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Produktbewertung.class)
public abstract class Produktbewertung_ {

	public static volatile SingularAttribute<Produktbewertung, Integer> bewertung;
	public static volatile SingularAttribute<Produktbewertung, Date> erstellungsdatum;
	public static volatile SingularAttribute<Produktbewertung, Long> idProduktbewertung;
	public static volatile SingularAttribute<Produktbewertung, AbstractBenutzer> benutzer;
	public static volatile SingularAttribute<Produktbewertung, String> kommentar;
	public static volatile SingularAttribute<Produktbewertung, Artikel> artikel;

}

