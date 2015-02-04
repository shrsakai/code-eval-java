package mdrt.m36_simple_calculator

import util.CodeEvalRunner

class MainGroovy {
    static main(argv) {
        def inputs = [
                ["250*14.3", "3575"],
                ["3^6 / 117", "6.23077"],
                ["(2.16 - 48.34)^-1", "−0.02165"],
                ["(59 - 15 + 3*6)/21", "2.95238"]
        ]
        CodeEvalRunner.run(inputs, Main)
    }
}
