## Rout'in tests

### Installation de l'application

```bash
git clone https://github.com/ulrich/routin-test
```

### Commandes Docker Compose

#### Démarrer les conteneurs en arrière-plan

```bash
docker compose up -d
```

#### Supprimer les conteneurs, réseaux et volumes

```bash
docker compose down -v
```

### Lancer l'application

```bash
./mvnw spring-boot:run
```

### Accéder à l'application

Ouvrez votre navigateur et allez à l'adresse suivante : `http://localhost:8080`

### Accéder à la base de données

Ouvrez votre navigateur et allez à l'adresse suivante : `http://localhost:9091/`

### Travail à faire

1. Afficher la liste de tous les employés via CURL ou navigateur si CURL n'est pas disponible.
   2. Virer le controller EmployeeController et le service EmployeeService.
2. Afficher la liste de tous les employés d'une compagnie.
   1. Créer un controller CompanyController.
   2. Créer un service CompanyService.
3. Sauvegarder un employé
   1. Créer un controller CompanyController.
   2. Créer un service CompanyService.
   3. Créer un repository CompanyRepository.
4. Ne pas retourner d'objet du domaine dans la réponse, mais plutôt un DTO (sans l'id).
   3. Voir validation des champs.
3. Retourner la liste de compagnies.
4. Avoir un use-case qui retourne la liste des employés d'une compagnie.

