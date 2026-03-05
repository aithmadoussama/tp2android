#  Android Lab 2 – Calculateur d’Impôt Immobilier

## Description
Cette application Android est un projet de travaux pratiques qui permet de **calculer un impôt immobilier** en fonction de plusieurs critères saisis par l’utilisateur.

L’utilisateur peut entrer :
- La **surface du logement**
- Le **nombre de pièces**
- Indiquer si le logement possède **une piscine**

L’application calcule ensuite le **montant total de l’impôt** et l’affiche à l’écran.

---

##  Technologies utilisées
- Java
- Android Studio
- Android SDK
- LinearLayout
- Widgets Android (EditText, CheckBox, Button, TextView)

---

## Fonctionnalités

### Saisie des informations
L’utilisateur doit saisir :
- La **surface du logement (en m²)**
- Le **nombre de pièces**
- Cocher la case si le logement possède **une piscine**

###  Calcul de l’impôt
Lorsque l’utilisateur appuie sur le bouton **Calculer**, l’application effectue le calcul suivant :

```
Impôt de base = surface × 2
Supplément = (nombre de pièces × 50) + 100 si piscine
Impôt total = Impôt de base + Supplément
```

###  Affichage du résultat
Le montant total de l’impôt est affiché dans un **TextView**.

Exemple :

```
Impôt total : 850 DH
```

---

##  Structure du projet

```
lab2/
│
├── MainActivity.java
├── activity_main.xml
└── README.md
```

### MainActivity.java
Ce fichier contient :
- La récupération des données saisies par l’utilisateur
- La logique de calcul de l’impôt
- L’affichage du résultat

### activity_main.xml
Ce fichier définit l’interface utilisateur avec **LinearLayout** :
- Deux champs **EditText** pour la surface et le nombre de pièces
- Une **CheckBox** pour la piscine
- Un **Button** pour lancer le calcul
- Un **TextView** pour afficher le résultat

---

##  Comment exécuter le projet

1. Cloner le dépôt

```bash
git clone https://github.com/votre-utilisateur/lab2-android.git
```

2. Ouvrir le projet dans **Android Studio**

3. Connecter un **appareil Android** ou lancer un **émulateur**

4. Cliquer sur **Run ▶**

---

##  Objectifs pédagogiques
Ce TP permet d’apprendre :
- La gestion des **entrées utilisateur (EditText)**
- L’utilisation de **CheckBox**
- La récupération et la conversion de données (`String → int / double`)
- L’exécution d’un **calcul dans une application Android**
- L’affichage dynamique d’un résultat avec **TextView**

---

## 👨‍💻 Auteur
Ait Hmad Oussama

## Captures d'ecran 

### <img width="574" height="1280" alt="image" src="https://github.com/user-attachments/assets/283de73d-6535-4446-a4f9-11b0b942a43f" />

### <img width="574" height="1280" alt="image" src="https://github.com/user-attachments/assets/5a6e9af5-2f26-46a1-b8a7-faadaa3ed213" />
