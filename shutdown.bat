call docker-compose --env-file ./config/env.dev down
@RD /S /Q "./at.electro.shop.bff/target"
@RD /S /Q "./at.electro.shop.service/target"