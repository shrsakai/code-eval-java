package mdrt.m02_detecting_cycles

import util.CodeEvalRunner

class MainGroovy {
    static main(argv) {
        CodeEvalRunner.runAndPerf(["2 0 6 3 1 6 3 1 6 3 1",
                                   "3 4 8 0 11 9 7 2 5 6 10 1 49 49 49 49",
                                   "1 2 3 1 2 3 1 2 3"
        ], Main, true)
    }
}
