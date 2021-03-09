#!/bin/bash
# A simple script

docker-compose --env-file ./config/env.dev down
rm -r ./at.electro.shop.bff/target
rm -r ./at.electro.shop.service/target