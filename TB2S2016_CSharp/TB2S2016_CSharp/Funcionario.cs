using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TB2S2016_CSharp
{
    public class Funcionario : Pessoa, IAutenticavel
    {
        public string SenhaInterna { get; set; }

        public string SenhaExterna { get; set; }

        public override void setNome(string nome, string sobrenome)
        {
            this.nome = nome + " " + sobrenome;
        }

        public double Salario { get; set; }
        public virtual double Bonificacao
        {
            get { return this.Salario * 1.2; }
        }

        public Funcionario(string cpf, string nome)
        {
            this.Cpf  = nome;
            this.Nome = nome;
        }

        bool IAutenticavel.Autentica(string senha)
        {
            return this.SenhaInterna.Equals(senha);
        }
    }
}
