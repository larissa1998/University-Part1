/******************************************************
 * A multi-line Javadoc-like comment about my grammar *
 ******************************************************/
grammar grammarC;

@header {
package parser;
}

// Monoline comment ab  out a parser rule
prog            : stmt+
                ;

ifstmt          : IF '(' cond ')' block b1=block                                #ifStmt
                | IF '(' cond ')' b1=block ELSE b2=block                        #ifStmtElse
                ;
                  

cond    :expr            #condExpr
        |expr relop=('>'|'<'|'=='|'>='|'<=') expr #condRelop
        ;

//exemplo do livro de compiladores
expr            : term '+' expr                                                 #exprPlus
                | term '-' expr                                                 #exprMin
                | term                                                          #exprTerm
                ;

term            : fact '*' expr                                                 #termMult
                | fact '/' expr                                                 #termDiv
                | fact                                                          #termFact
                ;

fact: '(' expr ')' #expr2par
        | NUM #exprNum
        | ID #exprId
        | STRING # exprStr
        | CHARC #exprChar
        | booleanb #exprBool
;

booleanb  : TRUE   #exprTrue
          | FALSE  #exprFalse
          ;  

block   : stmt?  #blockSingle
        | '{' stmt* '}'  #blockCompose
        ;

stmt            : printfin EOL #stmtPrintf
                | ifstmt #stmtIf //OK
                | attr EOL #stmtAttr //OK
                | expr EOL #stmtExpr
                | scan EOL #stmtScan
                | dec EOL #stmrDec //OK
                | whilee  #stmtWhile //OK
                | foor  #stmtFor //OK
                ;


whilee : WHILE '(' cond ')' block #whilex
       ;

foor : FOR '(' forzin EOL cond EOL attr ')' block  #foorx
        ;


forzin  : attr
        | dec  
        ;

scan    : SCANF '(' PORC types ',' ID')' #attrScan
        ;

types: DOUBLE
    | CHAR
    | INT
    ;
printfin : 'printf' B_EXPR expr E_EXPR #print
        ;
attr:  ID '=' expr #attrExpr
    |  ID '-' '-' #attrMinuMinus
    | ID '+' '+' #attrPlusPlus
    ;



dec   :  type ID                                                      #declSimple
      | type '*' ID                                                   #declPointer
      | type ID '[' expr ']'                                          #declArray
      | type ID '=' expr                                              #declVSimple
      | type '*' ID '=' expr                                          #declValuePointer
      | CHAR ID '[' expr? ']' '=' STRING                              #declArrayS
;

type: INT
    |CHAR
    | DOUBLE
    |STRING
    ;



I       : 'i';
INT     : 'int';
DOUBLE  : 'double';
CHAR    : 'char';
SUM     : '+';
DIV     : '/';
MULT    : '*';
MINUS   : '-';
PORC    : '%';
TRUE    : 'true';
FALSE   : 'false';
EQUALS  : '=';
B_EXPR  : '(';
E_EXPR  : ')';
SWITCH  : 'switch';
CASE    : 'case';
M_IGUAL : '<=';
Ma_IGUAL : '>=';
MAIOR    :'>';
MENOR    :'<';
EEQUALS  : '==';
DIF     : '!=';
WHILE   : 'while';
IF      : 'if';
DO      : 'do';
FOR     : 'for';
BREAK   : 'break';
DEFAULT : 'default';
CHARC   : '\''.'\'';
NUM     : [0-9]+ ;
ID      : [_a-zA-Z][_a-zA-Z0-9]*;
STRING  : '"'(~["\\\r\n])*'"';
ELSE    : 'else';
PRINTF   : 'printfa';
SCANF    : 'scanf';
B_BLOCK : '{';
E_BLOCK : '}';
EOL     : ';';
D       : 'd';
S       : 's';
WS      : [ \t\n] -> skip;