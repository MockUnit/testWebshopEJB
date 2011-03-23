package de.webshop.benutzerverwaltung.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(RolleHasBenutzer.class)
public abstract class RolleHasBenutzer_ {

	public static volatile SingularAttribute<RolleHasBenutzer, Rolle> rolle;
	public static volatile SingularAttribute<RolleHasBenutzer, Long> idRolleHasBenutzer;

}

