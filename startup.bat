echo.
echo.
echo "Install electro shop services..."
cd ./at.electro.shop.service
call mvnw -f pom.xml clean install -U

echo.
echo.
echo "Install electro shop bff..."
cd ..
cd ./at.electro.shop.bff
call mvnw -f pom.xml clean install -U

echo.
echo.
echo "Install electro shop UI..."
cd ..
cd ./electro-shop-ui
call npm install --global yarn
call yarn install

echo.
echo.
echo "Creating environment with docker..."
echo "Using development configuration ./config/env.dev"
cd ..

echo.
echo.
docker-compose --env-file ./config/env.dev up --build --force-recreate