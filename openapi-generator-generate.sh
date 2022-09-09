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