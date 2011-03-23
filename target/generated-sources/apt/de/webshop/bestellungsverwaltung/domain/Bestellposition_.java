package de.webshop.bestellungsverwaltung.domain;

import de.webshop.lagerverwaltung.domain.Lager;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Bestellposition.class)
public abstract class Bestellposition_ {

	public static volatile SingularAttribute<Bestellposition, Lager> lagerArtikel;
	public static volatile SingularAttribute<Bestellposition, Date> erstellungsdatum;
	public static volatile SingularAttribute<Bestellposition, Integer> menge;
	public static volatile SingularAttribute<Bestellposition, Long> idbestellposition;
	public static volatile SingularAttribute<Bestellposition, Date> aenderungsdatum;

}

