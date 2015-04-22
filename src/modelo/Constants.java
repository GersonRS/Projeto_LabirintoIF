package modelo;

public interface Constants extends ScannerConstants, ParserConstants
{
    int EPSILON  = 0;
    int DOLLAR   = 1;

    int t_palavras = 2;
    int t_fim = 3;
    int t_cmd_frente = 4;
    int t_cmd_esquerda = 5;
    int t_cmd_direita = 6;
    int t_cmd_pisca = 7;
    int t_cond_azul = 8;
    int t_cond_amarelo = 9;
    int t_cond_verde = 10;
    int t_abreparentes = 11;
    int t_fechaparentes = 12;

}
