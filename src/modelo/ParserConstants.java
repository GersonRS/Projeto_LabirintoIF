package modelo;

public interface ParserConstants
{
    int FIRST_SEMANTIC_ACTION = 19;

    int SHIFT  = 0;
    int REDUCE = 1;
    int ACTION = 2;
    int ACCEPT = 3;
    int GO_TO  = 4;
    int ERROR  = 5;

    int[][][] PARSER_TABLE =
    {
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  4}, {SHIFT ,  5}, {SHIFT ,  6}, {SHIFT ,  7}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO ,  1}, {GO_TO ,  3}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO ,  2}, {ERROR ,  0} },
        { {ACCEPT,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  8}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  2}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  3}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  4}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  5}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 10}, {SHIFT , 11}, {SHIFT , 12}, {ERROR ,  0}, {REDUCE,  9}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO ,  9}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 13}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  6}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  7}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  8}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 14}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE, 11}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  4}, {SHIFT ,  5}, {SHIFT ,  6}, {SHIFT ,  7}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO ,  3}, {GO_TO , 15}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 16}, {ERROR ,  0} },
        { {REDUCE,  1}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE, 10}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }
    };

    int[][] PRODUCTIONS =
    {
        { 13, 1 },
        { 18, 6 },
        { 14, 1 },
        { 14, 1 },
        { 14, 1 },
        { 14, 1 },
        { 17, 1 },
        { 17, 1 },
        { 17, 1 },
        { 17, 0 },
        { 15, 1 },
        { 15, 0 }
    };

    String[] PARSER_ERROR =
    {
        "Erro estado 0",
        "Erro estado 1",
        "Erro estado 2",
        "Erro estado 3",
        "Erro estado 4",
        "Erro estado 5",
        "Erro estado 6",
        "Erro estado 7",
        "Erro estado 8",
        "Erro estado 9",
        "Erro estado 10",
        "Erro estado 11",
        "Erro estado 12",
        "Erro estado 13",
        "Erro estado 14",
        "Erro estado 15",
        "Erro estado 16"
    };
}
