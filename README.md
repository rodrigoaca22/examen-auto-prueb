# examen-auto-prueb

Repositorio creado para el examen final de la asignatura **Automatización de Pruebas**.  
Incluye:

- Proyecto **Maven** de ejemplo (`examen-auto-prueb`) con pruebas automatizadas.
- Estrategia de ramas tipo **GitFlow simplificado**.
- Pipelines de **Integración Continua (CI)** y **Deployment (CD)** con **GitHub Actions**.
- Ejemplo de **deployment pipeline** con *acceptance tests* y mecanismo **Blue-Green / rollback** simulado.

---

## 1. Estructura del repositorio

```text
examen-auto-prueb/          ← raíz del repo
 ├─ .github/
 │   └─ workflows/
 │        ├─ ci.yml         ← pipeline de CI (build + tests)
 │        └─ deploy.yml     ← pipeline de deployment (staging + blue-green)
 ├─ examen-auto-prueb/      ← módulo Maven
 │   ├─ pom.xml
 │   └─ src/
 │        ├─ main/java/cl/examen/auto/...
 │        └─ test/java/cl/examen/auto/...
 └─ README.md
```

## Cómo ejecutar las pruebas y los pipelines

### Pruebas locales (Maven)

Desde la raíz del proyecto Maven:

```bash
cd examen-auto-prueb/examen-auto-prueb

# Build mas todas las pruebas
mvn clean verify

# Build
mvn clean package -DskipTests

# Pruebas unitarias
mvn test

# Pruebas de integración
mvn -Dtest=*IT test
```

### Pipelines en GitHub 

- Pipeline CI ci.yml - Build y Pruebas  
  Se ejecuta automaticamente al hacer push o pull request sobre las ramas.  
  Se visualiza en Actions Workflow  

- Pipeline de Deployment deploy.yml - Ambiente de Pruebas  
  Se ejecuta al hacer push a main o manualmente desde ACtions.  
  Realiza build, acceptances tests y despliegue simulado con estrategia Blue-Green/rollback