class Car
  attr_accessor :mak, :model, :year, :color, :tank_capacity, :amount_of_fuel, :engine

  def initialize mak, model, year, color, tank_capacity, amount_of_fuel, engine
    @mak = mak
    @model = model
    @year = year
    @color = color
    @tank_capacity = tank_capacity
    @amount_of_fuel = amount_of_fuel
    @engine = engine
    @acceleration = false
    @brake = false
    @stop = true
  end

  def information
    puts "Marca: #{@mak}\nModelo: #{@model}\nAno: #{@year}\nCor: #{@color}\nCapacidade do tanque: #{@tank_capacity}\nQuantidade de Combustível: #{@amount_of_fuel}"
  end

  def accelerate 
    if @motor.status and !@stop
      puts "Acelerando..."
      @acceleration = true
      @stop = false
    else
      puts "Não é possível acelerar pois o carro não está ligado ou parado"
    end
  end

  def brake
    if @acceleration 
      puts "Freiando..."
      @brake = true
      @acceleration = false
    else 
      puts "Não é possível freiar, pois o carro nem se quer está acelerando"
    end
  end

  def stop 
    if @brake
      puts "Parando"
    else 
      puts "O carro precisa freiar para que pare"
    end
  end

  def fueling fuel
    if (fuel + @amount_of_fuel) >= @tank_capacity
      @amount_of_fuel += fuel
      puts "Abastecendo..."
    else
      puts "A quantidade informada passa da quantidade máxima do tanque de combustível do carro."
    end     
  end
end

class Motor
  attr_accessor :type, :potency, :consumption_for_kilometer, :cylinder_capacity, :status

  def initialize type, potency, consumption_for_kilometer, cylinder_capacity, status
    @type = type
    @potency = potency
    @consumption_for_kilometer = consumption_for_kilometer
    @cylinder_capacity = cylinder_capacity
    @status = nil
  end

  def information
    puts "Tipo: #{@type}\nPotência: #{@potency}\nConsumo por Kilômetro:#{@consumption_for_kilometer}\nCilindradas: #{@cylinder_capacity}\n#{@status}"
  end

  def turn_on 
    @status = true
    puts "Ligando o motor..."
  end

  def turn_of 
    @status = false
  end

  def consume_fuel distance
    fuel_consume_in_distance = @consumption_for_kilometer * distance
    puts "O total de combustível consumido na distância de #{distance} km foi de: #{fuel_consume_in_distance}"
  end

  def verify_status
    if (@status) 
      puts "No momento o motor está ligado"
    else 
      puts "NO momento o motor está desligado"
    end
  end
end