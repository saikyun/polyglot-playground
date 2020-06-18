## Prereqs
Need to setup LLVM toolchain according to https://www.graalvm.org/docs/reference-manual/languages/llvm/

## Compiling

### Curses example

```
$LLVM_TOOLCHAIN/clang hello-curses.c -lncurses -o hello-curses

javac hello_curses.java

java HelloCurses
```

### SDL example

```
$LLVM_TOOLCHAIN/clang hello-sdl.c -lSDL2 -o hello-sdl

javac hello_sdl.java

java HelloSdl
# on macos
java -XstartOnFirstThread HelloSdl
```

### SDL as lib example

```
$LLVM_TOOLCHAIN/clang sdl-as-lib.c -lSDL2 -fPIC -shared -o sdl-as-lib.so
javac sdl_as_lib.java
java SdlAsLib
# macos
java -XstartOnFirstThread SdlAsLib
```

### Convenience
```
# macos
$LLVM_TOOLCHAIN/clang hello-sdl.c -lSDL2 -o hello-sdl && javac hello_sdl.java && java -XstartOnFirstThread HelloSdl




```

