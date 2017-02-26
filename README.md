###DOCUMENTATION
####Synopsis

UrlProject est une application Web assurant un acces à plusieurs URLs raccourcis.

####Instructions d’installation 

Pour exécuter l'application il faut ajouter dans la structure du project un nouvel artifact de type .jar et d'établir comme propriété du document le fichier MANIFIEST.MF situé dans C:\...\jee-hei-2017-urlProject.git\urlProject-core\src\main\java\META-INF

####Instructions d’utilisation

L'application propose trois sections: START, SHORTEN et LIST. 

Pour raccourcir un URL, il faut se rendre dans la section SHORTEN et y saisir un URL valide. Ensuite, il faut tout simplement appuyer sur le bouton "Shorten URL".

Si l'on souhaite choisir un url personnalisé, il est posible taper l'URL souhaité et d'appuyer sur le bouton "Choose a personalized shortened URL".

Enfin, la dernière section présente la liste de tous les URLs qui ont déjà été raccourcis.
Pour accéder à un URL il faut tout simplement cliquer sur l'un d'entre eux.

####Justification des choix d’architecture

Le MVC, dont les trois éléments sont indépendants les uns des autres, est un motif d'architecture logicielle destiné aux interfaces graphiques et permet de mettre en oeuvre des interfaces utilisateur. La clarté de l'architecture qu'il impose en est un avantage. 
 
Pour plus d'informations:
 
 https://github.com/ThibaultG1/jee-hei-2017-urlProject
 
HEI 2017 - Thibault Gillotin & Juan Pablo Beloso
