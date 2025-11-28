# TP1: Principes de la Programmation Orientée Objet (POO)

## Description du Projet

**TP1: Principes de la Programmation Orientée Objet (POO)** est un projet de Travaux Pratiques (TP) conçu pour illustrer et mettre en œuvre les concepts fondamentaux de la **Programmation Orientée Objet** en **Java**.

L'objectif principal est de modéliser un système de gestion de comptes bancaires simples, en se concentrant sur :

- **L'Héritage** (classes ```CompteSimple``` et ```CompteEpargne``` héritant de ```Compte```).
- **L'Encapsulation** (utilisation de champs privés et de méthodes ```getters```/```setters```).
- **Le Polymorphisme** (méthodes potentiellement surchargées ou redéfinies).

## Concepts et Fonctionnalités Clés

- **Classe Abstraite/Base (```Compte```):** Représente le compte bancaire générique.
- **Héritage:** Dérivation de classes spécifiques (```CompteSimple```, ```CompteEpargne```).
- **Gestion des Comptes:** Création, consultation et manipulation des soldes de différents types de comptes.
- **Programme de Test (```Programme.java```):** Contient la logique pour instancier et tester les différentes classes de comptes.

## Technologies Utilisées

- **Langage:** Java.
- **Paradigme:** Programmation Orientée Objet (POO).
- **Environnement:** Projet Java standard (sans framework spécifique, probablement exécuté via un IDE comme IntelliJ ou Eclipse).

## Structure du Projet

```bash
tp1_POO/
├── src/
│   ├── Compte.java         # Classe de base pour un compte
│   ├── CompteEpargne.java  # Classe héritant de Compte (Compte Épargne)
│   ├── CompteSimple.java   # Classe héritant de Compte (Compte Simple)
│   └── Programme.java      # Point d'entrée pour tester les classes
└── ... (fichiers de configuration IDE)
```

## Installation et Exécution

### Prérequis

- JDK (Java Development Kit) installé.
- Un environnement de développement Java (IDE) comme IntelliJ IDEA, Eclipse ou VS Code.

### Étapes

1. **Cloner le Dépôt :**
   ```bash
   git clone https://github.com/morning-dark/tp1-POO.git
   cd tp1-POO
   ```
2. **Ouvrir le Projet :** Ouvrez le dossier ```tp1_POO``` dans votre IDE Java.
3. **Exécuter :** Exécutez la classe principale ```Programme.java```.
