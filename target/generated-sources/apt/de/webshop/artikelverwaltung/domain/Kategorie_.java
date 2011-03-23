package de.webshop.artikelverwaltung.domain;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Kategorie.class)
public abstract class Kategorie_ {

	public static volatile SingularAttribute<Kategorie, String> bezeichnung;
	public static volatile ListAttribute<Kategorie, Kategorie> subKategorien;
	public static volatile SingularAttribute<Kategorie, Kategorie> mainKategorie;
	public static volatile SingularAttribute<Kategorie, Long> idKategorie;

}

