var log = ""

fun foo() {
    for (
        (
                q,
                w
                )
        in listOf(Pair("1", "2"))
    ) {
        log += q
        log += w
    }

    bar {
        (
                q,
                w
        ) ->
        log += q
        log += w
    }
}

fun bar(f: (Pair<String, String>) -> Unit) {
    f(Pair("w", "e"))
}


// LINES(JS):    15 22 16 16 17 18 20 20 21 21 22 22 3 23 9 9 9 9 4 9 9 9 5 5 6 7 11 11 12 12 15 15 25 27 26 26 * 1 * 1
// LINES(JS_IR): 1 1 1 1 1 1 * 3 9 9 9 9 9 6 6 9 7 7 9 11 11 12 12 15 15 25 26 26 15 17 17 16 18 18 16 20 20 21 21 * 1
