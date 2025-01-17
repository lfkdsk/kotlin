fun box(x: Int, y: Int) {
    println(
            try { foo(x) } finally { println(x) } > 10 &&
            try { foo(y) } finally { println(y) } > 20)
}

fun foo(x: Int) = x

// LINES(JS):    1   5 3 3 4 3 3 3 3 * 3 3 4 4 4 4 * 4 4 4 4 2 3 7 7 7
// LINES(JS_IR): 1 *         3   3 3 * 3   * 4 4 4 * 4   4   2   7 7 7
