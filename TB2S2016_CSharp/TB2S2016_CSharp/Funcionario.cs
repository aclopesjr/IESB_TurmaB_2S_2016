using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TB2S2016_CSharp
{
    public class Funcionario
    {
        private string nome;
        public string Nome
        {
            get { return this.nome; }
            set { this.nome = value; }
        }

        public string Cpf { get; set; }
        public double Salario { get; set; }

        public Funcionario(string cpf, string nome)
        {
            this.Cpf  = nome;
            this.Nome = nome;
        }
    }
}
