/**
 *
 * @author Kevin Fernando Rocha
 * Codigo: 20161020086
 * Ciencias de la computacion 3
 */
package Analizador;

import java_cup.runtime.Symbol;

public class Sintaxis extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintaxis() {super();}

  /** Constructor which sets the default scanner. */
  public Sintaxis(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintaxis(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\062\000\002\002\004\000\002\017\012\000\002\017" +
    "\012\000\002\002\011\000\002\002\010\000\002\003\004" +
    "\000\002\003\003\000\002\003\004\000\002\003\003\000" +
    "\002\003\004\000\002\003\003\000\002\003\004\000\002" +
    "\003\003\000\002\003\004\000\002\003\003\000\002\003" +
    "\004\000\002\003\003\000\002\003\004\000\002\003\003" +
    "\000\002\003\004\000\002\003\003\000\002\003\003\000" +
    "\002\004\005\000\002\004\007\000\002\004\007\000\002" +
    "\004\006\000\002\004\006\000\002\004\010\000\002\004" +
    "\010\000\002\004\011\000\002\004\011\000\002\006\011" +
    "\000\002\013\003\000\002\013\005\000\002\013\005\000" +
    "\002\013\005\000\002\013\006\000\002\013\007\000\002" +
    "\007\015\000\002\010\011\000\002\011\013\000\002\012" +
    "\011\000\002\014\012\000\002\014\011\000\002\005\005" +
    "\000\002\005\004\000\002\005\004\000\002\015\031\000" +
    "\002\016\007\000\002\016\011" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\021\000\004\050\005\001\002\000\004\002\023\001" +
    "\002\000\004\014\006\001\002\000\006\006\007\044\010" +
    "\001\002\000\004\063\016\001\002\000\004\063\011\001" +
    "\002\000\004\062\012\001\002\000\004\063\013\001\002" +
    "\000\004\044\014\001\002\000\004\060\015\001\002\000" +
    "\004\002\000\001\002\000\004\062\017\001\002\000\004" +
    "\063\020\001\002\000\004\006\021\001\002\000\004\060" +
    "\022\001\002\000\004\002\uffff\001\002\000\004\002\001" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\021\000\004\017\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintaxis$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintaxis$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintaxis$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintaxis$actions {
  private final Sintaxis parser;

  /** Constructor */
  CUP$Sintaxis$actions(Sintaxis parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintaxis$do_action(
    int                        CUP$Sintaxis$act_num,
    java_cup.runtime.lr_parser CUP$Sintaxis$parser,
    java.util.Stack            CUP$Sintaxis$stack,
    int                        CUP$Sintaxis$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintaxis$result;

      /* select the action based on the action number */
      switch (CUP$Sintaxis$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // PRINT ::= Print Parentesis_a Comillas Identificador Parentesis_c Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("PRINT",12, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // PRINT ::= Print Parentesis_a Identificador Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("PRINT",12, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-4)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // SWITCH ::= Switch Parentesis_a Identificador Parentesis_c Llave_a Case Identificador Dos_P SENTENCIA Break P_coma Case Identificador Dos_P SENTENCIA Break P_coma Default Dos_P SENTENCIA Break P_coma Llave_c 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SWITCH",11, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-22)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // DECLARACION_FOR ::= Op_incremento Identificador 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // DECLARACION_FOR ::= Identificador Op_incremento 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // DECLARACION_FOR ::= Identificador Op_atribucion Numero 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // SENTENCIA_FOR ::= Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // SENTENCIA_FOR ::= T_datoN Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-7)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // FOR ::= For Parentesis_a SENTENCIA_FOR Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("FOR",8, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // DO_WHILE ::= Do Llave_a SENTENCIA Llave_c While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DO_WHILE",7, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-8)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // WHILE ::= While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("WHILE",6, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // IF_ELSE ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c Else Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("IF_ELSE",5, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-10)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-4)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Comillas 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-3)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Identificador 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Numero 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // SENTENCIA_BOOLEANA ::= Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // IF ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("IF",4, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // DECLARACION ::= Cadena Identificador Igual Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // DECLARACION ::= Cadena Identificador Igual Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-5)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-5)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // DECLARACION ::= T_datoN Op_incremento Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-3)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // DECLARACION ::= T_datoN Identificador Op_incremento P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-3)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // DECLARACION ::= T_datoN Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-4)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // DECLARACION ::= T_datoN Identificador Op_atribucion Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-4)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DECLARACION ::= T_datoN Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // SENTENCIA ::= INCLUDE 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // SENTENCIA ::= PRINT 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // SENTENCIA ::= SENTENCIA PRINT 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // SENTENCIA ::= SWITCH 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // SENTENCIA ::= SENTENCIA SWITCH 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // SENTENCIA ::= FOR 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // SENTENCIA ::= SENTENCIA FOR 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SENTENCIA ::= DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCIA ::= SENTENCIA DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA ::= WHILE 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= SENTENCIA WHILE 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= SENTENCIA IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= IF 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= SENTENCIA IF 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= SENTENCIA DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INICIO ::= Main Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-5)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= Int Main Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INCLUDE ::= Numeral Include Comillas Identificador Punto Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INCLUDE",13, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-7)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INCLUDE ::= Numeral Include Op_relacional Identificador Punto Identificador Op_relacional P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INCLUDE",13, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-7)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INCLUDE EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)).value;
		RESULT = start_val;
              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintaxis$parser.done_parsing();
          return CUP$Sintaxis$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

