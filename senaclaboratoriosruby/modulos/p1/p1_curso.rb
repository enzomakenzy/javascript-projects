class Curso
  attr_accessor :name, :description, :duration_in_months, :disciplines

  def initialize name, description, duration_in_months
    @name = name
    @description = description
    @duration_in_months = duration_in_months
    @disciplines = []
  end

  def show_details
    puts "Nome: #{@name}"
    puts "Descrição: #{@description}"
    puts "Duração: #{@duration_in_months} meses"
    puts "Disciplinas: "
    @disciplines.each do |discipline|
      puts "- #{discipline.name}"
    end
  end

  def list_disciplines_of_course
    puts "Lista de disciplinas: "
    @disciplines.each do |discipline|
      puts "- #{discipline.name}"
    end
  end

  def add_discipline discipline
    if !@disciplines.include?(discipline)
      @disciplines << discipline
      puts "Disciplina adicionada ao curso com sucesso!"
    else 
      puts "A disciplina já foi adicionada ao curso."
    end
  end

  def remove_discipline discipline
    if @disciplines.include?(discipline)
      @disciplines.delete(discipline)
      puts "Disciplina excluída do curso"
    else 
      puts "A disciplina ainda não tinha sido adicionada ao curso"
    end
  end
end