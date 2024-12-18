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

## Tests

Assurez-vous de tester avec des fichiers de clusters valides et des mots de passe variés pour évaluer les résultats produits par l'algorithme.

## Contributions

Les contributions sont les bienvenues ! Veuillez ouvrir une *issue* ou soumettre une *pull request* sur le dépôt GitHub associé.

## Licence

Ce projet est sous licence MIT. Veuillez consulter le fichier `LICENSE` pour plus d'informations.
