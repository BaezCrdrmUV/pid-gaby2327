using System;
using System.Diagnostics;

namespace Optener_Pid
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            Process currentProcess = Process.GetCurrentProcess();
            Console.WriteLine(currentProcess.Id);

        }
    }
}