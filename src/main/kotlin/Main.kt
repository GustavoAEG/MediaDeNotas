fun main(args: Array<String>) {



    var x=0
    var media=0.0
    var repetir=0
    var soma = 0

    for (repetir in 1 ..4) {

        println("Informe a nota $repetir")
        x = readLine()!!.toInt()



         soma = soma+x

    }
    media= (soma/4).toDouble()

    println("A MÉDIA das notas é de $media")
}