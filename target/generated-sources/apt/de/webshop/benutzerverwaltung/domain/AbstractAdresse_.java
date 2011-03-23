package de.webshop.benutzerverwaltung.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AbstractAdresse.class)
public abstract class AbstractAdresse_ {

	public static volatile SingularAttribute<AbstractAdresse, String> strasse;
	public static volatile SingularAttribute<AbstractAdresse, String> ort;
	public static volatile SingularAttribute<AbstractAdresse, String> plz;
	public static volatile SingularAttribute<AbstractAdresse, AbstractBenutzer> benutzer;
	public static volatile SingularAttribute<AbstractAdresse, String> hausnummer;
	public static volatile SingularAttribute<AbstractAdresse, Long> idadresse;

}

