import java.io.*;
import org.graalvm.polyglot.*;

class HelloSdl {
    public static void main(String[] args) throws IOException {
        Context polyglot = Context.newBuilder().
        		               allowAllAccess(true).build();
        File file = new File("hello-sdl");
        Source source = Source.newBuilder("llvm", file).build();
        Value cpart = polyglot.eval(source);
        cpart.execute();
    }
}
