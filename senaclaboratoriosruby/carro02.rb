class Carro 
  def initialize marca, modelo, ano
    @marca = marca
    @modelo = modelo
    @ano = ano
  end

  def information 
    puts "Informaçoes do carro:"
    puts "---------------------"
    puts "Marca: #{@marca}"
    puts "Modelo: #{@modelo}"
    puts "Ano: #{@ano}"
  end
end

carro1 = Carro.new("Hyundai", "HB20", 2012)
carro1.information