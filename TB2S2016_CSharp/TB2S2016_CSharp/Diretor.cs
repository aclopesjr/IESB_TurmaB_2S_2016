using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TB2S2016_CSharp
{
    public class Diretor : Gerente
    {
        public Diretor(string cpf, string nome)
            :base (cpf, nome)
        {

        }

        public Diretor(string cpf, string nome, int nroSubordinados)
            : base(cpf, nome, nroSubordinados)
        {

        }
    }
}
