From ply import lex, yacc

// Prueba para saber si se importo correctamente el modulo de lex y yacc
tokens = (
    'NUMBER',
)
t_NUMBER = r'\d+'
lexer = lex.lex()
parser = yacc.yacc()
result = parser.parse('42')
print(result)

