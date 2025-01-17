object O {
    init {
        println()
    }
}

open class A(x: Int)

class B :
        A(
                23
        )

class C : A {
    constructor(x: Int) :
        super(
                x
        ) {
        println()
    }

    constructor() :
            this (
                    42
            )
}

// LINES(JS):    1 1 3 * 1 1 1 1 1 1 7 * 9 10 11 * 15 15 16 17 14    19 15 15 22 22 23 24 22 22
// LINES(JS_IR): 1 * 3 *             7   9 10 11         16 17    15 19 *           23 24       23
