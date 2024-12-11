class Pessoa 
  attr_accessor :nome
  attr_reader :idade, :email

  def definir_idade idade
    if idade >= 0 
      puts "Idade adicionada com sucesso!"
      @idade = idade
    else
      puts "Número negativos nao podem ser adicionados."
    end
  end

  def definir_email email
    if email.end_with? "@gmail.com" || "@outlook.com" || "@rn.senac.com.br"
      puts "email adicionado com sucesso!"
      @email = email
    else 
      puts "Email não corresponde ao formato solicitado."
    end
  end
end

pessoa1 = Pessoa.new()

pessoa1.nome= "Enzo"
pessoa1.definir_idade 21
pessoa1.definir_email "enzo@gmail.com"

puts pessoa1.nome, pessoa1.idade, pessoa1.email