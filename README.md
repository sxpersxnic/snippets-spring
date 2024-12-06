# Snippets Spring API

Java Spring API for Snippets project

## Logical flows

## Usage

When trying to use the API in your application, use this map of requests and responses, the API offers:

### Authentication

Before you can access any other ressources, you will need to authenticate, this way we make sure to protect your ressources.

#### Sign Up

##### Endpoint:
- URI: /auth/signup
- Http-Method: POST

##### Request

##### Response

#### Sign In **POST**

##### Endpoint:
- URI: /auth/signin
- Http-Method: POST

##### Request

##### Response

### User

#### Find all

### Profile

### Snippet

### Tag

## Database

This API uses a PostgreSQL Database, hosted by [Supabase](https://supabase.com).

### ERD

![Database relation schema diagramm](/public/ERD.svg)

### Deployement

When CI/CD is implemented add this to .github/workflows/<config-file>.yml:

```yml

jobs:
  - name: Deploy
    env:
      DATABASE_URL: ${{ secrets.DATABASE_URL }}
      DATABASE_USER: ${{ secrets.DATABASE_USER }}
      DATABASE_PWD: ${{ secrets.DATABASE_PWD }}

```

## License

This repository is licensed with the [MIT](LICENSE) license.
