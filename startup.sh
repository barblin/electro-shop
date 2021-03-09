#!/bin/bash
# Startup script

read -p "Enter JAVA_HOME [/usr/lib/jvm/java-11-openjdk-amd64]: " java_input
java=${java_input:-/usr/lib/jvm/java-11-openjdk-amd64}
echo $java

export JAVA_HOME=$java
export PATH=$JAVA_HOME/bin:$PATH

printf "\n"
echo "Install electro shop services..."
cd ./at.electro.shop.service
./mvnw -f pom.xml clean install -U

printf "\n"
echo "Install electro shop bff..."
cd ..
cd ./at.electro.shop.bff
./mvnw -f pom.xml clean install -U

printf "\n"
echo "Install electro shop UI..."
cd ..
cd ./electro-shop-ui
yarn install

printf "\n"
echo "Creating environment with docker..."
echo "Using development configuration ./config/env.dev"
cd ..

docker-compose --env-file ./config/env.dev up --build --force-recreate