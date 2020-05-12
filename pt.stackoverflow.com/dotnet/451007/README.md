Não sei se é isso que você está querendo mas achei bem simples, basta você navegar no elemento "description". 


    List<Product> products = xDocument.Descendants("product").Select
                (p => new Product()
                {
                   Id = Convert.ToInt32(p.Element("id").Value),
                   Name=p.Element("name").Value,
                   Quantity = Convert.ToInt32(p.Element("quantity").Value),
                   Price = Convert.ToDecimal(p.Element("price").Value),
    			   Comment = p.Element("description").Element("comment").Value
                }).ToList();

Coloquei um exemplo no [Dotnetfiddle][1] e republiquei aqui também [Github][2]


  [1]: https://dotnetfiddle.net/DX2jpB
  [2]: https://github.com/rafaelchagasb/answers-stackoverflow/tree/master/pt.stackoverflow.com/dotnet/451007