package de.webshop.lagerverwaltung.domain;

import de.webshop.artikelverwaltung.domain.Artikel;
import de.webshop.lagerverwaltung.domain.Lager.Farbe;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Lager.class)
public abstract class Lager_ {

	public static volatile SingularAttribute<Lager, String> groesse;
	public static volatile SingularAttribute<Lager, Farbe> farbe;
	public static volatile SingularAttribute<Lager, Integer> bestandMin;
	public static volatile SingularAttribute<Lager, Long> idlager;
	public static volatile SingularAttribute<Lager, Integer> bestandIst;
	public static volatile SingularAttribute<Lager, Artikel> artikel;

}

