package de.webshop.benutzerverwaltung.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Lieferadresse.class)
public abstract class Lieferadresse_ extends de.webshop.benutzerverwaltung.domain.AbstractAdresse_ {

	public static volatile SingularAttribute<Lieferadresse, String> vorname;
	public static volatile SingularAttribute<Lieferadresse, String> name;

}

