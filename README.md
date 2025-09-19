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

- Afficher la liste de tous les employés via CURL ou navigateur si CURL n'est pas disponible.
- Afficher la liste de tous les employés d'une compagnie sur "/company/{companyId}"
