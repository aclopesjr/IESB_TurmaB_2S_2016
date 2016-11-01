using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TB2S2016_CSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            ////Conta conta = new Conta();
            ////Conta conta = new Conta("1234-0", "0001-0");
            //Conta conta = new Conta("1234-0", "0001-0", "Fulano de Tal");
            //conta.Deposita(100.00);

            //Conta conta2 = new Conta("1234-0", "0001-0", "Outra pessoa");
            //conta2.Deposita(100.00);

            //conta.Transfere(50.00, conta2);

            ////bool sacou01 = conta.Saca(200);
            ////bool sacou02 = conta.Saca(50.5);

            //Console.WriteLine($"{conta.Nome} tem saldo igual {conta.Saldo}");
            //Console.WriteLine($"{conta2.Nome} tem saldo igual {conta2.Saldo}");
            //Console.ReadLine();

            ////BibliotecaA.ClasseA classeA = new BibliotecaA.ClasseA();
            ////BibliotecaA.ClasseB classeB = new BibliotecaA.ClasseB();

            Funcionario func1 = new Funcionario("222222", "Ciclano");
            func1.Salario = 2600.5;

            Console.WriteLine($"{func1.Nome} tem saldo igual {func1.Bonificacao}");

            Gerente ger1 = new Gerente("222222", "Beltrano", 10);
            ger1.Salario = 2600.5;

            Console.WriteLine($"{ger1.Nome} tem saldo igual {ger1.Bonificacao}");

            Diretor dir1 = new Diretor("222222", "Zeltrano", 4);
            dir1.Salario = 2600.5;

            Console.WriteLine($"{dir1.Nome} tem saldo igual {dir1.Bonificacao}");

            Console.ReadLine();
        }
    }
}
