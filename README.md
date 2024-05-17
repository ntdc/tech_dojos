# NTATC tech dojos

>A code kata is an exercise in programming which helps programmers hone their skills through practice and repetition

Some of the advantages of practicing code katas:
* Practice TDD
* Learn and use new IDE tips and tricks
* Refactor mercilessly skills
* Give you a chance to mess around with new tech and languages
* Brain muscle flexing
* Selfish sense of accomplishment :)

To be effective, try to limit the number of people in a group :arrow_right: on a 10+ people group, not everybody will be able to participate, sad ! :lying_face:

## Mission to mars non SOLID

Support PPT pour la partie théorique : https://ts.accenture.com/:p:/s/NTATCIESCustom-TechDojo/EQ9w1yXRm0FHrsyAQXi3aWQBFQ4CdG09tzNNXpS8OR2BPA?e=J54x13

Language Java - Package com.ntatc.katas.mars

Mission vers mars 2021 ave rover et hélicoptère

2 modules sont posés sur Mars :
* par rapport à une position 3D (origine en bas, à gauche) ;
* possédant une direction (nord, sud, est, ouest).

Ils peuvent avancer et reculer d'une case, suivant la position qu'il possède :
* le rover est un module qui roule ;
* l'hélicoptère est un module qui vole, et peut donc également monter et descendre d'une case, peu importe sa direction ;

Une sonde, tournant autour de Mars, peut demander à chaque module de se mettre en position de récupération :
* dans le cas de l'hélicoptère, celui-ci se pose alors au sol ;
* activation d'un booléen "pretPourRecuperation" pour les deux modules.

Ce programme a été écrit en TDD et possède donc une couverture à 100%. Cependant, 4 principes SOLID ne sont pas respectés.

L'exercice est :
* de détecter les 4 violations
* de rendre le programme SOLID ;
* d'ajouter la direction "nord ouest", et faire avancer/reculer les deux modules suivant cette direction.

Solutions :
* step 1 indiquant les violations + explications : https://github.com/ntdc/tech_dojos/tree/solution/mars/step1
* step 2 - Résolution du Open/Close avec une stratégie basée sur une interface + ENUM : https://github.com/ntdc/tech_dojos/tree/solution/mars/step2
* step 2 best : Résolution du Open/Close avec une interface fonctionnelle + ENUM (plus simple) : https://github.com/ntdc/tech_dojos/tree/solution/mars/step2Best

## Tire pressure monitoring

Language Java - Package com.ntatc.katas.tire

Grâce à la mission vers Mars non SOLID, les principes SOLI ont pu être abordés. Il manque le D pour Dependency Inversion. Ce kata l'illustre avec en prime une touche de TDD.

Le programme : 
* La classe Alarm permet de surveiller la pression d'un pneu et déclenche une alerte si la pression sort d'un interval min/max.
* La classe Sensor simule le comportement d'un vrai capteur de pneu, fournissant des valeurs aléatoires mais réalistes.

L'exercice est : 
* activer et lancer le TU plusieurs fois
* détecter l'origine du problème
* pointer la violation de Dependency Inversion
* corriger la et exploiter la nouvelle architecture pour compléter la couverture de code en TDD

Solutions : 
* step 1 avec la résolution de la violations Dependency Inversion : https://github.com/ntdc/tech_dojos/tree/solution/tire/step1
* step 2 avec l'ajout du stub exploitant la nouvelle interface : https://github.com/ntdc/tech_dojos/tree/solution/tire/step2

## Lift controller

Language Java - Package com.ntatc.katas.lift

Ce kata permet d'appliquer l'approche TDD sur un sujet ludique : un ascenseur avec une représentation graphique programmée en SWING.

Le programme :
* affiche une représentation d'un ascenseur, des boutons d'appels (intérieurs et extérieurs)
* les commandes de boutons ne provoquent rien pour l'instant

L'exercice est :
* de faire bouger cet ascenseur avec une approche petits pas en TDD

Solutions : 
* suite à un dojo LevelUp, il manque l'affichage de la direction en haut : https://github.com/ntdc/tech_dojos/compare/solution/lift/step1

