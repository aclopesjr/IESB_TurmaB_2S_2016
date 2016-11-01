using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TB2S2016_CSharp
{
    public class Gerente : Funcionario
    {
        public int NroSubordinados { get; set; }

        public override double Bonificacao
        {
            get
            {
                return base.Bonificacao * 1.5;
            }
        }

        public Gerente(string cpf, string nome)
            :base(cpf, nome)
        {

        }

        public Gerente(string cpf, string nome, int nroSubordinados)
            : this(cpf, nome)
        {
            this.NroSubordinados = nroSubordinados;
        }
    }
}
