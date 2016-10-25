using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TB2S2016_CSharp
{
    internal class Conta
    {
        private string agencia;
        private String numero;
        private string nome;
        private DateTime dataAbertura;
        private double saldo;
        private Double limite;

        public String Numero
        {
            get { return this.numero; }
            set { this.numero = value.Replace("X", "0"); }
        }


        public string Nome
        {
            get { return nome; }
            set { nome = value; }
        }

        public double Saldo
        {
            get
            {
                return saldo;
            }

            set
            {
                saldo = value;
            }
        }

        public DateTime DataAbertura
        {
            get
            {
                return dataAbertura;
            }

            set
            {
                dataAbertura = value;
            }
        }

        public double Limite
        {
            get
            {
                return limite;
            }

            set
            {
                limite = value;
            }
        }

        public string Agencia
        {
            get
            {
                return agencia;
            }

            set
            {
                agencia = value;
            }
        }

        public Conta()
        {
            this.limite = 100;
        }

        public Conta(string agencia, string numero)
            : this()
        {
            this.Agencia = agencia;
            this.Numero = numero;
        }

        public Conta(string agencia, string numero, string nome)
            : this(agencia, numero)
        {
            this.Nome = nome;
        }

        public Boolean Deposita(double valor)
        {
            if (valor <= 0.0)
                return false;

            this.Saldo += valor;
            return true;
        }

        public bool Saca(double valor)
        {
            if (this.Saldo < valor)
                return false;

            this.Saldo -= valor;
            return true;
        }

        public bool Transfere(double valor, Conta conta)
        {
            if (this.Saca(valor))
            {
                return conta.Deposita(valor);
            }
            return false;
        }
    }
}
