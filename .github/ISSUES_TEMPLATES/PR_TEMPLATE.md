# Modèle de Pull Request

## Description

- [] Le fichier `AwesomePasswordChecker` est un projet Java qui évalue la sécurité des mots de passe en comparant leurs caractéristiques à des clusters de référence via des calculs de distance euclidienne. Si cette approche innovante permet d'analyser efficacement la robustesse des mots de passe à l'aide de données stockées dans des fichiers CSV, le code présente actuellement quelques limitations techniques, comme des erreurs dans les calculs de distance et le traitement des fichiers. Bien qu'il inclue également une fonction de hachage MD5 pour l'anonymisation, le programme nécessite des améliorations, notamment au niveau des tests unitaires, pour atteindre son plein potentiel en tant qu'outil d'analyse de sécurité.


## Type de changement

- [ ] Correction de bug (par exemple, résolution du problème de NaN dans le calcul de distance ou des séparateurs de fichier)
- [ ] Mise à jour de la documentation
- [ ] Refactorisation ou optimisation de code

## Changements effectués

- [ ] Mise à jour de la logique de calcul de distance pour éviter les résultats NaN.
- [ ] Correction du problème de parsing des fichiers en utilisant `","` comme séparateur pour les fichiers .csv.

## Liste de contrôle

- [ ] Mon code respecte les normes de codage et les bonnes pratiques de ce projet.
- [ ] J'ai exécuté tous les tests pertinents et vérifié qu'ils passent.
- [ ] J'ai vérifié que toutes les nouvelles fonctionnalités fonctionnent comme prévu.
- [ ] J'ai pris en compte les problèmes listés dans `bug_report.md` (le cas échéant).

## Instructions de test

1. Chargez un fichier `.csv` exemple contenant des centres de clusters valides.
2. Exécutez la méthode d'analyse de mot de passe et confirmez que les résultats sont corrects.
3. Vérifiez qu'aucune valeur NaN n'est renvoyée lors du calcul de distance.
