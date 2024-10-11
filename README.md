# Conversor de Moneda en Java

Este proyecto es una aplicación de consola en Java que permite convertir diferentes monedas utilizando la API de ExchangeRate-API para obtener las tasas de cambio actuales. Las conversiones soportadas incluyen:

- Dólar a Peso Argentino
- Peso Argentino a Dólar
- Dólar a Real Brasileño
- Real Brasileño a Dólar
- Dólar a Peso Colombiano
- Peso Colombiano a Dólar

El programa sigue solicitando al usuario hasta que selecciona la opción de salir.

## Estructura del Proyecto

El proyecto está compuesto por tres clases principales:

1. **`Main`**: Controla la interacción con el usuario mediante un menú en consola.
2. **`ConversorMoneda`**: Se encarga de las conversiones de moneda.
3. **`APIService`**: Hace las solicitudes a la API para obtener las tasas de cambio.

## Dependencias

Este proyecto utiliza la biblioteca **Gson** para analizar los datos JSON obtenidos desde la API de ExchangeRate-API.

