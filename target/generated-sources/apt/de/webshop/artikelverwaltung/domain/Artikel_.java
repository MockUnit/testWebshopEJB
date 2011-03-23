package de.webshop.artikelverwaltung.domain;

import de.webshop.lagerverwaltung.domain.Lager;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Artikel.class)
public abstract class Artikel_ {

	public static volatile SingularAttribute<Artikel, String> bezeichnung;
	public static volatile ListAttribute<Artikel, Lager> artikelVarianten;
	public static volatile ListAttribute<Artikel, Produktbewertung> produktBewertungen;
	public static volatile SingularAttribute<Artikel, Date> erstellungsdatum;
	public static volatile SingularAttribute<Artikel, Double> preis;
	public static volatile ListAttribute<Artikel, KategorieHasArtikel> kategorien;
	public static volatile SingularAttribute<Artikel, Boolean> imsortiment;
	public static volatile SingularAttribute<Artikel, Long> idArtikel;
	public static volatile SingularAttribute<Artikel, Date> aenderungsdatum;

}

