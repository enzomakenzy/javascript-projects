class Teacher 
  attr_accessor :name, :specialty, :disciplines

  def initialize name, specialty
    @name = name 
    @specialty = specialty
    @disciplines = []
  end

  def show_teacher 
    puts "Nome do professor: #{@name}"
    puts "Epecialidade do professor: #{@specialty}"
    puts "Disciplinas: "
      @disciplines.each {|discipline| puts " - #{discipline.name}"} 
  end

  def add_discipline_to_teacher discipline
    unless @disciplines.include?(discipline)
      @disciplines << discipline
      discipline.teacher = self
      puts "Disciplina registrada no perfil do professor."
    else 
      puts "A disciplina já está registrada no perfil do professor."
    end
  end

  def remove_discipline_from_teacher discipline
    if @disciplines.include?(discipline)
      @disciplines.delete(discipline)
      discipline.teacher = nil
      puts "Disciplina removida do perfil do professor"
    else
      puts "A disciplina #{discipline} não está presente no perfil do professor para ser removida"
    end
  end

end

