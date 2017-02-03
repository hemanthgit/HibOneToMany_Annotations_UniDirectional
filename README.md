# HibOneToMany_Annotations_UniDirectional

Reference : https://howtoprogramwithjava.com/hibernate-manytoone-unidirectional-tutorial/

UniDirectional OneToMany mapping possible only with @ManyToOne mapping on Child/many side.

In an Cart and Item relation, Cart is Parent and Item is child. as Items can't exist with out Cart. So Cart is parent of Item.

With a One-to-Many relationship, the child table is the one that houses the foreign key. So in our example, the foreign key will be placed into the Item table. This is just the way it works with a One-to-Many relationship, the foreign key is always in the “Many” side of the relationship.

We are able to tell Hibernate which object is the parent object by assigning the @OneToMany annotation to the appropriate field/getter method… and we are able to tell Hibernate which object is the child object by assigning the @ManyToOne annotation to the appropriate field/getter method.

To properly map a unidirectional One-to-Many relationship, you only need to use the <b>@ManyToOne</b> annotation. This may seem a bit counter-intuitive, but that’s how Hibernate works. You need to map the child/many side of the relationship and <b>only</b> the child/many.
