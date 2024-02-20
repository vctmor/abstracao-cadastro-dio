enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val titulo: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
       
    fun matricular(usuario: Usuario, nivel: Nivel) {
        
        inscritos.add(usuario)
        
        println("Usuário ${usuario.nome} matriculado na formação $titulo, no nível: $nivel")
    }
}

fun main() {
    
    // criando usuários
    val user1 = Usuario("Juca")
    // acessando o nível
    val nivel1 = Nivel.BASICO
    
    val user2 = Usuario("Maria Flor")
    // acessando o nível
    val nivel2 = Nivel.AVANCADO
    
    // Criando conteudos educacionais
    val conteudo1 = ConteudoEducacional("Introdução à Programação")
    val conteudo2 = ConteudoEducacional("Algoritmos Avançados")
    
    // Criando uma formação
    val formacao = Formacao("Desenvolvimento de Software", listOf(conteudo1, conteudo2))
    
  
    // Matriculando usuarios
    formacao.matricular(user1, nivel1)
    formacao.matricular(user2, nivel2)
}