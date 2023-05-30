// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }
 
class Usuario(val nome: String)


data class ConteudoEducacional(val nome: String, val nivel: Nivel, var duracao: Int = 60){

}

data class Formacao(var nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val usuario = Usuario("José Ramos Damasceno Filho")

    val conteudos: MutableList<ConteudoEducacional> = mutableListOf()   
    val conteudo1 = ConteudoEducacional("Curso de Java", Nivel.INTERMEDIARIO)
    conteudo1.duracao = 80
    conteudos.add(conteudo1)
    val conteudo2 = ConteudoEducacional("Curso de Kotlin",Nivel.AVANCADO)
    conteudos.add(conteudo2)
    
    val formacao = Formacao("Desenvolvedor Backend com Java e Kotlin",conteudos)
    formacao.matricular(usuario)
       //
    println(formacao.inscritos.get(0).nome)
}
