using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TB2S2016_CSharp
{
    public class ContaException : Exception
    {
        public ContaException()
            : base () {  }

        public ContaException(string mensagem)
            : base(mensagem)
        { }
    }
}
