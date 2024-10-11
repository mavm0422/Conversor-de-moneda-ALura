    public class ConversorMoneda {
        private APIService apiService;

        public ConversorMoneda(APIService apiService) {
            this.apiService = apiService;
        }

        public double convertirDolarAPesoArgentino(double cantidad) {
            double tasa = apiService.obtenerTasaCambio("USD", "ARS");
            return cantidad * tasa;
        }

        public double convertirPesoArgentinoADolar(double cantidad) {
            double tasa = apiService.obtenerTasaCambio("ARS", "USD");
            return cantidad * tasa;
        }

        public double convertirDolarAReal(double cantidad) {
            double tasa = apiService.obtenerTasaCambio("USD", "BRL");
            return cantidad * tasa;
        }

        public double convertirRealADolar(double cantidad) {
            double tasa = apiService.obtenerTasaCambio("BRL", "USD");
            return cantidad * tasa;
        }

        public double convertirDolarAPesoColombiano(double cantidad) {
            double tasa = apiService.obtenerTasaCambio("USD", "COP");
            return cantidad * tasa;
        }

        public double convertirPesoColombianoADolar(double cantidad) {
            double tasa = apiService.obtenerTasaCambio("COP", "USD");
            return cantidad * tasa;
        }
    }


