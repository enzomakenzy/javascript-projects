class Discipline
  attr_accessor :name, :workload, :teacher

  def course=(course)
    @course = course
    course.disciplines << self
  end

  def course 
    @course
  end

  def initialize name, workload
    @name = name
    @workload = workload
    @teacher = nil
    @course = nil
  end

  def information 
    puts "Nome da disciplina: #{@name}"
    puts "Carga horária: #{@workload}"
    puts "Curso: #{@course.name || 'nenhum curso associado'}"
    if @teacher.nil?
      puts "Nenhum professor associado"
    else 
      puts "Professor: #{@teacher.name}"
    end
  end

end