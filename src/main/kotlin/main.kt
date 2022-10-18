import kotlin.system.exitProcess

fun main(){
    while (true){
    println("Привет, выбери подходящую стоимость сборки:")
    println("1. Дешевая.\n2. Средняя.\n3. Дорогая.\n\n0.Завершение программы.")
    val choice= readln()!!.toInt()
    val motherBoard= MotherBoard()
    val processor = Processor()
    val videoAdapter = VideoAdapter()


    if (choice==1){
        println("Ваша сборка готова:")
        motherBoard.cheap()
        processor.cheap()
        videoAdapter.cheap()
    }
    else if (choice==2) {
        println("Ваша сборка готова:")
        motherBoard.medium()
        processor.medium()
        videoAdapter.medium()
    }
    else if (choice==3){
        println("Ваша сборка готова:")
        motherBoard.expensive()
        processor.expensive()
        videoAdapter.expensive()
    }
    else if (choice==0) {
        println("Завершение программы...")
        exitProcess(0)
    }
    else println( "Неправильный ввод.Повторите снова (Введите цифру)")
        println()
    }


}


