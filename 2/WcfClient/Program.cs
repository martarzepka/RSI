using System;
using System.Collections.Generic;
using System.Linq;
using System.Resources;
using System.Security.Cryptography;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;
using WcfClient.ServiceReference1;
using WcfClient.ServiceReference2;
using WcfClient.ServiceReference3;

namespace WcfClient
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("... The client is started");
            // Step 1: Create client proxy based on communication channel. 
            // base address: 
            Uri baseAddress;
            // binding, address, endpoint address: 
            BasicHttpBinding myBinding = new BasicHttpBinding();
            baseAddress = new Uri("http://localhost:10032/Calculator/endpoint1");
            EndpointAddress eAddress = new EndpointAddress(baseAddress);
            // channel factory: 
            ChannelFactory<ICalculator> myCF = new ChannelFactory<ICalculator>(myBinding, eAddress);
            // client proxy (here myClient) based on channel 
            ICalculator myClient = myCF.CreateChannel();

            // Step 2: service operations call. 
            Console.Write("...calling Add (for entpoint1) ");
            double result = myClient.Add(-3.7, 9.5);
            Console.WriteLine("Result = " + result);

            CalculatorClient myClient2 = new CalculatorClient("WSHttpBinding_ICalculator");
            Console.Write("...calling Multiply (for endpoint2) - ");
            result = myClient2.Multiply(-3.7, 9.5);
            Console.WriteLine("Result = " + result);

            Console.WriteLine("2...calling HMultiply ASYNCHRONOUSLY !!!");
            Task<double> asyResult = callHMultiplyAsy(myClient2, 1.1, -3.3);

            SuperCalcCallback myCbHandler = new SuperCalcCallback();
            InstanceContext instanceContext = new InstanceContext(myCbHandler);
            SuperCalcClient myClient3 = new SuperCalcClient(instanceContext);
            double value1 = 10;
            Console.WriteLine("...calling Factorial({0})...", value1);
            myClient3.Factorial(value1);

            ModClient myClient4 = new ModClient("WSHttpBinding_IMod");
            Console.Write("...calling Add to list (for endpoint4) - ");
            myClient4.Add("Marta", 21, true);
            myClient4.Add("Ernest", 35, false);

            Console.WriteLine("4...calling GetList ASYNCHRONOUSLY !!!");
            Task<String> asyResult2 = callGetListAsy(myClient4);

            Console.Write("...calling Add (for entpoint1) ");
            result = myClient.Add(2.7, 9.5);
            Console.WriteLine("Result = " + result);

            result = asyResult.Result;
            Console.WriteLine("2...HMultiplyAsync Result = " + result);

            String result2 = asyResult2.Result;
            Console.WriteLine("4...GetListAsync Result = " + result2);

            Console.WriteLine();
            Console.ReadLine(); // to not finish app immediately: 
                                // Step 3: Closing the client - closes connection and clears resources.
            ((IClientChannel)myClient).Close();
            Console.WriteLine("...Client closed - FINISHED");

            myClient3.Close();
            Console.WriteLine("CLIENT3 - STOP");
        }

        static async Task<double> callHMultiplyAsy(CalculatorClient myClient, double n1, double n2)
        {
            Console.WriteLine("2......called callHMultiplyAsync");
            double reply = await myClient.HMultiplyAsync(n1, n2);
            Console.WriteLine("2......finished HMultipleAsync");
            return reply;
        }

        static async Task<String> callGetListAsy(ModClient myClient)
        {
            Console.WriteLine("2......called callHMultiplyAsync");
            String reply = await myClient.GetListAsync();
            Console.WriteLine("2......finished HMultipleAsync");
            return reply;
        }
    }
}
