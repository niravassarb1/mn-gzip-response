package mn.gzip.response;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
public class HomeController {

    @Get(value = "/foo")
    public String getFoo() throws URISyntaxException, IOException {
        return new String (Files.readAllBytes(Paths.get(getClass().getResource("/largeFile.json").toURI())));
    }
}
