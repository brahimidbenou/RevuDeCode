# AwesomePasswordChecker

`AwesomePasswordChecker` est une bibliothèque Java permettant de vérifier la robustesse des mots de passe en utilisant des algorithmes basés sur des centres de clusters pour analyser la complexité et la proximité des mots de passe avec des modèles prédéfinis.

## Fonctionnalités

- Chargement des centres de clusters à partir de fichiers externes ou intégrés.
- Analyse des mots de passe pour produire des masques de caractéristiques.
- Calcul de la distance euclidienne minimale entre un mot de passe et les centres de clusters.
- Génération de hachages MD5 pour des chaînes de texte.

## Structure du code

### Principales méthodes

- **`getInstance(File file)`** : Charge les centres de clusters depuis un fichier spécifique.
- **`getInstance()`** : Charge les centres de clusters depuis un fichier intégré.
- **`maskAff(String password)`** : Génère un masque de caractéristiques pour un mot de passe.
- **`getDistance(String password)`** : Calcule la distance minimale entre un mot de passe et les centres de clusters.
- **`euclideanDistance(int[] a, double[] b)`** : Calcule la distance euclidienne entre deux vecteurs.
- **`ComputeMD5(String input)`** : Produit le hachage MD5 d'une chaîne donnée.

## Utilisation

### Exemple d'initialisation

```java
import TP.myapp.AwesomePasswordChecker;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            // Chargement à partir d'un fichier
            AwesomePasswordChecker checker = AwesomePasswordChecker.getInstance(new File("path/to/cluster_centers.csv"));

            // Analyse d'un mot de passe
            String password = "MonSuperMotDePasse123!";
            double distance = checker.getDistance(password);
            System.out.println("Distance minimale : " + distance);

            // Génération d'un hachage MD5
            String hash = AwesomePasswordChecker.ComputeMD5(password);
            System.out.println("MD5 : " + hash);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### Formats des fichiers de clusters
Les fichiers doivent être au format CSV, chaque ligne représentant un centre de cluster sous forme de valeurs numériques séparées par des virgules, par exemple :

```
0.1,0.5,0.3,0.9
0.2,0.6,0.4,1.0
```

## Dépendances

Aucune dépendance externe n'est requise. La bibliothèque utilise uniquement les classes standard de Java.

## Compilation et exécution

1. Compilez le code :
   ```sh
   javac -d bin src/TP/myapp/AwesomePasswordChecker.java
   ```
2. Exécutez votre programme principal :
   ```sh
   java -cp bin TP.myapp.Main
   ```

## Tests

Assurez-vous de tester avec des fichiers de clusters valides et des mots de passe variés pour évaluer les résultats produits par l'algorithme.

## Contributions

Les contributions sont les bienvenues ! Veuillez ouvrir une *issue* ou soumettre une *pull request* sur le dépôt GitHub associé.

## Licence

Ce projet est sous licence MIT. Veuillez consulter le fichier `LICENSE` pour plus d'informations.
