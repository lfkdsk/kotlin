fun foo(x: Int) {
    var y = x
    y++
    println(y)
    ++y
    println(y)
    y += 2
    println(y)
}

// LINES(JS):    1 9 2 2 3 3       4 4 5 5 6 6 7 7 8 8
// LINES(JS_IR): 1   2 2 3 3 3 3   4 4 5 5 6 6 7 7 8 8
