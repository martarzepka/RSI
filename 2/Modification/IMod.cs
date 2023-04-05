using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Security;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Threading;

namespace Modification
{
    [ServiceContract(ProtectionLevel = ProtectionLevel.None)]
    public interface IMod
    {
        [OperationContract]
        void Add(string name, int age, bool isStudent);

        [OperationContract]
        String GetList();

    }


    [DataContract]
    public class Record
    {
        string name = "Marta";
        int age = 21;
        bool isStudent = true;

        [DataMember]
        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        [DataMember]
        public int Age
        {
            get { return age; }
            set { age = value; }
        }

        [DataMember]
        public bool IsStudent
        {
            get { return isStudent; }
            set { isStudent = value; }
        }
    }
}
