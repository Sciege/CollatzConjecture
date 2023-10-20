fun main(args: Array<String>) {
    var input = readln().toInt()
    // if number is not equal to 1 continue
    println("Input: $input")
    print("Output:")
    while (input != 1) {
        // odd
        print(" ")
        if (input % 2 == 1) {
            input = (input * 3) + 1
            print(input)
            continue
        } else {
            // even
            input/=2
            print(input)
        }
    }
}