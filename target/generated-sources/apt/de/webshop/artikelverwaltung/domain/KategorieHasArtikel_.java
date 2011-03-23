package de.webshop.artikelverwaltung.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(KategorieHasArtikel.class)
public abstract class KategorieHasArtikel_ {

	public static volatile SingularAttribute<KategorieHasArtikel, Long> idkategoriehasartikel;
	public static volatile SingularAttribute<KategorieHasArtikel, Kategorie> kategorie;
	public static volatile SingularAttribute<KategorieHasArtikel, Artikel> artikel;

}

