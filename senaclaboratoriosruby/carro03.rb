class Carro 
  attr_accessor :modelo, :ano

  def initialize modelo, ano
    @modelo = modelo
    @ano = ano
  end

  def information 
    puts "Modelo: #{@modelo}"
    puts "Ano: #{@ano}"
  end
end

carro1 = Carro.new("HB20", 2014)

puts carro1.modelo
puts carro1.ano

carro1.modelo= "Civic"

puts carro1.modelo