# Formes Géométriques

Le code dans ce dépôt représente des différentes formes géométriques : la cercle, le rectangle et le carré.

Une méthode, `sommeAires()` prend un tableau de formes, et retourne la somme des aires de toutes les formes passées en paramètre dans le tableau.

Ce code est très mal conçu. Il est difficilement extensible si, par exemple, on souhaite ajouter une nouvelle forme comme triangle.

De plus, le code est susceptible à générer une erreur de type `IllegalArgumentException` si on envoie un objet qui n'est pas une forme géométrique dans le tableau.  

L'objectif est donc d'améliorer le code pour tirer bénéfice de l'orienté objet.

Le code cible doit satisfaire les conditions suivantes :
* Il ne contient pas de `instanceof`.
* L'ajout d'une nouvelle forme ne coûte que l'ajout d'une seule classe.
* On ne peut pas passer un objet qui n'est pas une forme géométrique dans le tableau passé en paramètre à la méthode `sommeAires()`.
