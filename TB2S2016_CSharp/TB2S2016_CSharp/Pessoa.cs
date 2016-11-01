using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TB2S2016_CSharp
{
    public abstract class Pessoa
    {
        public string Cpf { get; set; }
        protected string nome;

        public string Nome
        {
            get { return nome; }
            set { nome = value; }
        }

        public abstract void setNome(string nome, string sobrenome);



    }
}
