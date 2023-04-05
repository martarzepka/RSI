using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel.Description;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;
using WcfServiceLibrary;
using CallbackService;
using Modification;

namespace WcfServiceHost
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Krok 1 URI dla bazowego adresu serwisu
            Uri baseAddress = new Uri("http://localhost:10032/Calculator");
            // Krok 2 Instancja serwisu
            ServiceHost myHost = new ServiceHost(typeof(MyCalculator), baseAddress);
            // Krok 3 Endpoint serwisu
            BasicHttpBinding myBinding = new BasicHttpBinding();
            ServiceEndpoint endpoint1 = myHost.AddServiceEndpoint(typeof(ICalculator), myBinding, "endpoint1");
            WSHttpBinding binding2 = new WSHttpBinding();
            binding2.Security.Mode = SecurityMode.None;
            ServiceEndpoint endpoint2 = myHost.AddServiceEndpoint(typeof(ICalculator), binding2, "endpoint2");

            Console.WriteLine("\n---> Endpoints:");
            Console.WriteLine("\nService endpoint {0}:", endpoint1.Name);
            Console.WriteLine("Binding: {0}", endpoint1.Binding.ToString());
            Console.WriteLine("ListenUri: {0}", endpoint1.ListenUri.ToString());
            Console.WriteLine("\nService endpoint {0}:", endpoint2.Name);
            Console.WriteLine("Binding: {0}", endpoint2.Binding.ToString());
            Console.WriteLine("ListenUri: {0}", endpoint2.ListenUri.ToString());

            // Krok 4 Ustawienie metadanych 
            ServiceMetadataBehavior smb = new ServiceMetadataBehavior();
            smb.HttpGetEnabled = true;
            myHost.Description.Behaviors.Add(smb);

            Uri baseAddress3 = new Uri("http://localhost:10032/SuperCalc");
            ServiceHost myHost3 = new ServiceHost(typeof(MySuperCalc), baseAddress3);
            WSDualHttpBinding myBinding3 = new WSDualHttpBinding();
            ServiceEndpoint endpoint3 = myHost3.AddServiceEndpoint(typeof(ISuperCalc), myBinding3, "endpoint3");
            myHost3.Description.Behaviors.Add(smb);

            Uri baseAddress4 = new Uri("http://localhost:10032/Modification");
            // Krok 2 Instancja serwisu
            ServiceHost myHost4 = new ServiceHost(typeof(Mod), baseAddress4);
            // Krok 3 Endpoint serwisu
            WSDualHttpBinding myBinding4 = new WSDualHttpBinding();
            ServiceEndpoint endpoint4 = myHost4.AddServiceEndpoint(typeof(IMod), myBinding4, "endpoint4");
            myHost4.Description.Behaviors.Add(smb);

            try
            {
                // Krok 5 Uruchomienie serwisu.
                myHost.Open();
                Console.WriteLine("Service is started and running.");

                myHost3.Open();
                Console.WriteLine("--> Service SuperCalc is running.");

                myHost4.Open();
                Console.WriteLine("--> Service Modification is running.");

                Console.WriteLine("Press <ENTER> to STOP service...");
                Console.WriteLine();

                Console.ReadLine(); // aby nie kończyć natychmiast: 
                myHost.Close();
                myHost3.Close();
                myHost4.Close();
            }
            catch (CommunicationException ce)
            {
                Console.WriteLine("Exception occured: {0}", ce.Message);
                myHost.Abort();
                myHost3.Abort();
                myHost4.Abort();
            }
        }
    }
}
