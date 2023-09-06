#!/bin/bash
rm -rf api
docker run --rm \
  -v ${PWD}:/local openapitools/openapi-generator-cli:v5.1.1 generate \
  -i https://raw.githubusercontent.com/gr4vy/gr4vy-openapi/sdks/openapi.v1.json \
  -g java \
  --git-user-id gr4vy \
  --git-repo-id gr4vy-java \
  --enable-post-process-file \
  -o /local/ \
  -c /local/.openapi-generator-config.json

rm -rf src/test/java/com/gr4vy/api
rm -rf api
mkdir src/main/model
cp -R src/main/java/com/gr4vy/api/model/* src/main/model/
rm -rf src/main/java/com/gr4vy/api/*
mkdir src/main/java/com/gr4vy/api/model
cp -R src/main/model/* src/main/java/com/gr4vy/api/model/
rm -rf src/main/model

var1='OffsetDateTime'
rep1='String'
sed -i '' "s/$var1/$rep1/g" src/main/java/com/gr4vy/api/model/*.java

var1='import org.threeten.bp.String;'
rep1=''
sed -i '' "s/$var1/$rep1/g" src/main/java/com/gr4vy/api/model/*.java

var1='private String previousSchemeTransactionId = "null";'
rep1='private String previousSchemeTransactionId = null;'
sed -i '' "s/$var1/$rep1/g" src/main/java/com/gr4vy/api/model/*.java

