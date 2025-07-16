package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

@Command(name = "gendiff",
        version = "gendiff pre-alfa 0.0.0.1",
        mixinStandardHelpOptions = true,
        description = "Сравнивает два конфигурационных файла и показывает разницу.")

public class App implements Callable<Integer>  {


    @Parameters(paramLabel = "filepath1",
            description = "путь до первого файла")
    private String filePath1;

    @Parameters(paramLabel = "filepath2",
            description = "путь до второго файла")
    private String filePath2;


    @Option (names = {"-f", "--format"},
            description = "выходной формат [по умолчанию: stylish]",
            defaultValue = "stylish")
    private String format;

    @Override
    public Integer call() throws Exception { // your business logic goes here...
        System.out.println("Hello World!");
        return 0;
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
        System.out.println("Hello World!");
    }


}
