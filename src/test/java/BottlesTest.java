import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BottlesTest {
    @Test
    public void testSong() throws IOException {
        final ByteArrayOutputStream stream = new ByteArrayOutputStream();
        Verse.writeLyrics(
                new PrintStream(
                        stream));

        final String actual = new String(stream.toByteArray());
        final String expected = new String(Files.readAllBytes(Paths.get("src/main/resources/test.txt")));

        Assert.assertEquals(expected,actual);
    }
}