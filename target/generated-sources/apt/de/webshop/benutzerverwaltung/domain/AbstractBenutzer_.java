package de.webshop.benutzerverwaltung.domain;

import de.webshop.artikelverwaltung.domain.Produktbewertung;
import de.webshop.bestellungsverwaltung.domain.Bestellung;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AbstractBenutzer.class)
public abstract class AbstractBenutzer_ {

	public static volatile SingularAttribute<AbstractBenutzer, String> nachname;
	public static volatile SingularAttribute<AbstractBenutzer, Long> idBenutzer;
	public static volatile SingularAttribute<AbstractBenutzer, String> vorname;
	public static volatile SingularAttribute<AbstractBenutzer, Date> erstellungsdatum;
	public static volatile SingularAttribute<AbstractBenutzer, Boolean> newsletter;
	public static volatile SingularAttribute<AbstractBenutzer, String> kontonummer;
	public static volatile ListAttribute<AbstractBenutzer, Produktbewertung> produktbewertungen;
	public static volatile SingularAttribute<AbstractBenutzer, Date> aenderungsdatum;
	public static volatile SingularAttribute<AbstractBenutzer, Lieferadresse> lieferadresse;
	public static volatile SingularAttribute<AbstractBenutzer, Rechnungsadresse> rechnungsadresse;
	public static volatile ListAttribute<AbstractBenutzer, Bestellung> bestellungen;
	public static volatile SingularAttribute<AbstractBenutzer, String> bankleitzahl;
	public static volatile SingularAttribute<AbstractBenutzer, String> email;
	public static volatile SetAttribute<AbstractBenutzer, RolleHasBenutzer> rollehasbenutzer;
	public static volatile SingularAttribute<AbstractBenutzer, String> passwort;

}

