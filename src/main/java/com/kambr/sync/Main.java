package com.kambr.sync;

import com.kambr.sync.MySyncBaseVisitor;
import com.kambr.sync.dataClasses.GeniusFlight;
import com.kambr.sync.generated.SyncLexer;
import com.kambr.sync.generated.SyncParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class Main {

    static String FILE_PATH = "";

    public static List<GeniusFlight> parse(String filePath) {
        Logger logger = getLogger("Sync parser com.kambr.sync.Main class");
        CharStream charStream = null;
        try {
            charStream = CharStreams.fromFileName(filePath);
        } catch (IOException e) {
            logger.log(Level.SEVERE, e.getLocalizedMessage());
        }

        SyncLexer lexer = new SyncLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SyncParser parser = new SyncParser(tokenStream);
        SyncParser.FlightRecordsContext flightRecordsContext = parser.flightRecords();
        MySyncBaseVisitor visitor = new MySyncBaseVisitor();

        return (List<GeniusFlight>) visitor.visit(flightRecordsContext);
    }

    public static void main(String[] args) {

        List<GeniusFlight> geniusFlights = parse(FILE_PATH);

        System.out.println("Done");
    }
}