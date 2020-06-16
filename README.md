Prereqs
Need to setup LLVM toolchain according to https://www.graalvm.org/docs/reference-manual/languages/llvm/

Compiling

```
$LLVM_TOOLCHAIN/clang hello-curses.c -lncurses -o hello-curses
$LLVM_TOOLCHAIN/clang hello-sdl.c -lsdl2 -o hello-sdl

javac hello_curses.java
javac hello_sdl.java

java HelloCurses
java HelloSdl
```
