# sampleBase
A sample base service


## How to start

Execute below commands to package application

```shell
git clone ...
cd sampleBase
mvn clean install -Ddb.username=postgres -Ddb.password=q1
```
Run postgres db
```shell
docker run -d \
--name sampleDb \
-e 'POSTGRES_PASSWORD=q1' \
-e 'PGDATA=/var/lib/postgresql/data/pgdata' \
--mount source=sampleDB,target=/var/lib/postgresql/data \
-p 5432:5432 \
"library/postgres:10.4-alpine"
```

Execute the below command to run the application

```shell
java -Ddb.username=postgres -Ddb.password=q1 -jar target/sample-base-*.jar
```
