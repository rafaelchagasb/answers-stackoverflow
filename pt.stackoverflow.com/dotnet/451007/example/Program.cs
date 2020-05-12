 
using System;
using System.Xml.Linq;
using System.Collections.Generic;
using System.Linq;

class Product{
		public int Id;
		public string Name;
		public int Quantity;
		public decimal Price;
		public string Comment;
		
	}

public class Program
{
	public static void Main()
	{
		var xml = @"<?xml version=""1.0"" encoding=""utf-8"" ?>
<products>
<product>
    <id>100</id>
    <name>Ball</name>
    <price>15</price>
    <quantity>2</quantity>
<description>
    <comment>aaa</comment>
</description>
</product>
</products>";
		
		var produtos = ProcessImport(xml);
		
		foreach(var item in produtos){
			Console.WriteLine(item.Comment);
		}
	}
	
	private static List<Product> ProcessImport(string xml)
    {
        XDocument xDocument = XDocument.Parse(xml);
		
        List<Product> products = xDocument.Descendants("product").Select
            (p => new Product()
            {
               Id = Convert.ToInt32(p.Element("id").Value),
               Name=p.Element("name").Value,
               Quantity = Convert.ToInt32(p.Element("quantity").Value),
               Price = Convert.ToDecimal(p.Element("price").Value),
			   Comment = p.Element("description").Element("comment").Value
            }).ToList();
        
        return products;
    }
}