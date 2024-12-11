require_relative 'p1_curso'
require_relative 'p1_discipline'
require_relative 'p1_professor'

ads = Curso.new("Técnico em Desenvolvimento de Sistemas", "Aprenderá a analisar, projetar, desenvolver, testar, manter e gerenciar sistemas tecnológicos de informação", 15)

puts ads.name

discipline1 = Discipline.new("Programação Orientada a Objetos", 48)
discipline1.course=ads
discipline2 = Discipline.new("Lógica de Programação", 120)
discipline2.course=ads
discipline3 = Discipline.new("Estrutura de Dados", 100)
discipline3.course=ads

teacher1 = Teacher.new("Ramiro", "Tecnologia da Informação")
teacher1.add_discipline_to_teacher(discipline1)
teacher1.add_discipline_to_teacher(discipline3)

teacher2 = Teacher.new("Maria Paula", "Tecnologia da Informação")
teacher2.add_discipline_to_teacher(discipline2)

ads.show_details
ads.remove_discipline(discipline1)
ads.list_disciplines_of_course

puts 

discipline1.information
discipline2.information
discipline3.information

puts 

teacher1.remove_discipline_from_teacher(discipline1)
teacher1.show_teacher