
# ADNEOM List Fraction by Portion Java program


List Fraction by Portion Java program est un mini programme java qui permet tous simplement de prendre un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.

Exemples d'entrées et sorties :

  - partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
  - partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
  - partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]

# Tech

  - JAVA
  - MAVEN

# Envirement de developpement 

  - Apache Maven 4.0.0.
  - Java 11

### Lancer l'application

Exécutez à partir du répertoire racine du projet. Cela générera un fichier jar dans le répertoire 'api-server/target' et exécute les test unitaires. 


```sh
$ mvn clean install 
```

Pour exécuter l'application jar généré exécutez la commande suivante à partir du répertoire api-server.

```sh
$ java -jar target/partitionProgram.jar
```

Une fois l'application lancée, nous devrions pouvoir voir un résultat sur la console affichant : 

```sh
Final result is : [[1, 2, 3], [4, 5]] 
```


License
----

MIT


**Merci !**
