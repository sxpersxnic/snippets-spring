# snippets-spring

Java Spring API for Snippets project

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
