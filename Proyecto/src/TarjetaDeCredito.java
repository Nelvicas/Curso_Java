package src;

import src.Compra.Compra;

import java.util.ArrayList;
import java.util.List;


    public class TarjetaDeCredito {

        /// /   variables privadas
        private double limite;
        private double saldo;
        private List<Compra> listaDeCompras;



        ///   Constructor
        public TarjetaDeCredito(double limite) {
            this.limite = limite;
            this.saldo = limite;
            this.listaDeCompras = new ArrayList<>();
        }


        ///  Metodo

        public boolean lanzarCompra(Compra compra){
            if(this.saldo >= compra.getValor()){
                this.saldo -= compra.getValor();
                this.listaDeCompras.add(compra);
                return true;
            }
            return false;
        }



        /// Getters

        public double getLimite() {
            return limite;
        }

        public double getSaldo() {
            return saldo;
        }

        public List<Compra> getListaDeCompras() {
            return (List<Compra>) listaDeCompras;
        }
    }

