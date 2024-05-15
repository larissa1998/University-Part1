package run;

import java.io.IOException;

import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.*;
import semantic.Visitor;
import parser.grammarCLexer;

public class Run {

    public static void main(String[] args) throws IOException {
        //  showParseTreeFrame(prog, parser);

        String filename = "test.c";
        
        
        CharStream charInput = new ANTLRFileStream(filename);
        grammarCLexer lexer = new grammarCLexer(charInput);
        
        
        if (args.length >= 1) {
            filename = args[0];
        }
        CharStream stream = null;
        if (filename != null) {
            stream = new ANTLRFileStream(filename);
        } else {
            stream = new ANTLRInputStream(System.in);
        }
        //grammarCLexer lexer = new grammarCLexer(stream);            //Lexer
        TokenStream tokens = new CommonTokenStream(lexer);  //nextToken 
        grammarCParser parser = new grammarCParser(tokens);         //Parser
        grammarCParser.ProgContext prog
                = parser.prog();        //Exec Parser prog
        showParseTreeFrame(prog, parser);
        Visitor pv = new Visitor();
        pv.visit(prog);

    }

    private static void showParseTreeFrame(ParseTree tree, grammarCParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewr.setScale(1);
        panel.add(viewr);
        frame.add(panel);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_HORIZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
