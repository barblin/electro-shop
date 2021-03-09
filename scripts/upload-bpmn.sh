#!/bin/bash
# Upload initial file

curl --location --request POST 'http://localhost:8080/api/uploads/processes' \
--header 'Content-Type: application/json' \
--data-raw '{
    "path": "./ressources",
    "name": "payment.bpmn"
}'