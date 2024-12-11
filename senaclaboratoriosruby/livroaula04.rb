class Livro
  attr_accessor :title, :gener, :number_of_pages, :publisher, :autor, :quantity

  def initialize title, gener, number_of_pages, publisher, quantity
    @title = title
    @gener = gener
    @number_of_pages = number_of_pages
    @publisher = publisher
    @quantity = quantity
    @autor = nil
  end

  def information 
    puts "Título: #{@title}\nGênero: #{@gener}\nNúmero de páginas: #{@number_of_pages}\nEditora: #{@publisher}\nQuantidade: #{@quantity}"
  end

  def is_long_common_or_short?
    if @number_of_pages > 350
      puts "O livro #{@title} é um livro longo com mais de #{@number_of_pages} páginas."
    elsif @number_of_pages <= 350 and @number_of_pages >= 125
      puts "O livro #{@title} é um livro comum com um total de #{@number_of_pages} páginas."
    else 
      puts "O livro #{@title} é um livro curto com apenas #{@number_of_pages} páginas."
    end
  end

  def are_disponibility? 
    if @quantity > 0
      puts "Sim, o livro está disponível e há um total de #{@quantity} livros."
    else
      puts "Não, o livro não está disponível."
    end
  end

  def add_book quantity
    @quantity += quantity
    puts "Livro(s) adicionados com sucesso!"
  end

  def remove_book quantity
    if @quantity >= quantity
      @quantity -= quantity
      puts "Livros resgatados com sucesso!"
    else 
      puts "Não há livros suficientes para a requisição solicitada."
    end
  end

  def book_autor 
    autor.name
  end 
end

class Autor
  attr_accessor :name, :age, :nationality,:books

  def initialize name, age, nationality
    @name = name
    @age = age
    @nationality = nationality
    @books = []
  end

  def write_new_book book
    @books << book
    book.autor = self
    puts "Livro escrito com sucesso."
  end

  def quantity_of_published_books
    puts "Quantidade de livros publicados pelo autor #{@name}: #{@books.size}"
  end
end

livro1 = Livro.new("Harry Potter e a Pedra Filosofal", "Fantasia", 208, "Rocco", 200)
livro2 = Livro.new("Hobbit", "Fantasia", 336, "Happer Collins", 156)
livro3 = Livro.new("Jogos Vorazes", "Ficção Ciêntífica", 400, "Rocco", 43)
livro4 = Livro.new("Harry Potter e o Prisioneiro de Askaban", "Fantasia", 330, "Rocco", 234)

autor1 = Autor.new("J. K. Rowling", 59, "Britânica")
autor2 = Autor.new("Suzanne Collins", 62, "Americana")
autor3 = Autor.new("J. R. R. Tolkien", nil, "Britânico")

autor1.write_new_book livro1
autor2.write_new_book livro3
autor3.write_new_book livro2
autor1.write_new_book livro4

autor1.quantity_of_published_books
autor3.quantity_of_published_books

livro1.is_long_common_or_short?
livro3.is_long_common_or_short?

livro4.are_disponibility?

livro2.add_book 32
puts livro2.quantity

livro3.remove_book 42
puts livro3.quantity

puts livro1.book_autor
