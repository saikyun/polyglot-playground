import java.io.*;
import org.graalvm.polyglot.*;

class SdlAsLib {
  public static void main(String[] args) throws IOException {
    Context polyglot = Context.newBuilder().
      allowAllAccess(true).build();
    File file = new File("sdl-as-lib.so");
    Source source = Source.newBuilder("llvm", file).build();
    Value lib = polyglot.eval(source);
    
    Value get_flag = lib.getMember("GET_SDL_INIT_VIDEO");
    
    
    Value sdl_init = lib.getMember("_SHADOWING_SDL_Init");
    sdl_init.execute(get_flag.execute().asInt());
  }
}
