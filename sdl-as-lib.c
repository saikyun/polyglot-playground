#include <unistd.h>
#include <SDL2/SDL.h>

int  _SHADOWING_SDL_Init(Uint32  flags) {
  return SDL_Init(flags);
}

int GET_SDL_INIT_VIDEO() { return SDL_INIT_VIDEO; }


