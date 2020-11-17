package com.kambr.sync;

import com.kambr.sync.dataClasses.GeniusFlight;
import com.kambr.sync.generated.SyncLexer;
import com.kambr.sync.generated.SyncParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import com.kambr.kambrlogger.Logger;
import java.io.IOException;
import java.util.List;

public class GeniusSyncParser {

    static String FILE_PATH = "";
    static public Logger logger = new Logger(GeniusSyncParser.class);

    public static List<GeniusFlight> parse(CharStream charStream) {

        SyncLexer lexer = new SyncLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SyncParser parser = new SyncParser(tokenStream);
        SyncParser.FlightRecordsContext flightRecordsContext = parser.flightRecords();
        MySyncBaseVisitor visitor = new MySyncBaseVisitor();

        return (List<GeniusFlight>) visitor.visit(flightRecordsContext);
    }

    public static void main(String[] args) {

        CharStream charStream = null;

        try {
            charStream = CharStreams.fromFileName(FILE_PATH);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage());
        }

        List<GeniusFlight> geniusFlights = parse(charStream);

    }
}