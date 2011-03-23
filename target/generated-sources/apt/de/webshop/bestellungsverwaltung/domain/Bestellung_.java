package de.webshop.bestellungsverwaltung.domain;

import de.webshop.benutzerverwaltung.domain.AbstractBenutzer;
import de.webshop.bestellungsverwaltung.domain.Bestellung.Bestellstatus;
import de.webshop.bestellungsverwaltung.domain.Bestellung.Zahlungsart;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Bestellung.class)
public abstract class Bestellung_ {

	public static volatile SingularAttribute<Bestellung, Bestellstatus> bestellstatus;
	public static volatile SingularAttribute<Bestellung, Date> erstellungsdatum;
	public static volatile SingularAttribute<Bestellung, Zahlungsart> zahlungsart;
	public static volatile SingularAttribute<Bestellung, Long> idbestellung;
	public static volatile SingularAttribute<Bestellung, Double> gesamtpreis;
	public static volatile ListAttribute<Bestellung, Bestellposition> bestellpositionen;
	public static volatile SingularAttribute<Bestellung, AbstractBenutzer> benutzer;
	public static volatile SingularAttribute<Bestellung, Date> aenderungsdatum;

}

