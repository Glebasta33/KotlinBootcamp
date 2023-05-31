fun main(){
    val isDownloaded = false

    while (isDownloaded == false){
        println("File is downloaded...")
    }
}



fun main() {
    val a = arrayOf("1", "2", "3",
            "4", "5", "6", "7")
    for (str in a)
        for (let in str)
            if (let == 'r') {
                println(str)
                break
            }
}