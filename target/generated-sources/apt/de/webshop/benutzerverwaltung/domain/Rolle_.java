package de.webshop.benutzerverwaltung.domain;

import de.webshop.benutzerverwaltung.domain.Rolle.RolleTyp;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Rolle.class)
public abstract class Rolle_ {

	public static volatile SingularAttribute<Rolle, Long> idrolle;
	public static volatile SingularAttribute<Rolle, RolleTyp> rolleTyp;

}

