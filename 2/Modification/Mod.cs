using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Threading;
using System.Xml.Linq;

namespace Modification
{
    [ServiceBehavior(InstanceContextMode = InstanceContextMode.Single, ConcurrencyMode = ConcurrencyMode.Multiple)]
    public class Mod : IMod
    {
        public List<Person> peopleList;
        public void Add(string name, int age, bool isStudent)
        {
            Console.WriteLine("Add to list: " + name + ", " + age + ", " + isStudent);
            peopleList.Add(new Person(name, age, isStudent));
        }

        public String GetList()
        {
            String result = "";
            for(int i = 0; i < peopleList.Count; i++)
            {
                Thread.Sleep(2000);
                result += peopleList[i].ToString() + '\n';
            }
            return result;
        }
    }

    public class Person
    {
        public Person(string name, int age, bool isStudent)
        {
            this.Name = name;
            this.Age = age;
            this.IsStudent = isStudent;
        }
        public string Name { get; set; }   
        public int Age { get; set; }
        public bool IsStudent { get; set; }
        override
        public String ToString()
        {
            return String.Format("Person: Name -> {0} Age: {1} IsStudent: {2}", Name, Age, IsStudent);
        }
    }
}
