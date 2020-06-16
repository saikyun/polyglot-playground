#include <unistd.h>
#include <ncurses.h>

int main() {
    initscr();
    printw("Hello, Curses!");
    refresh();
    sleep(1);
    endwin();
    return 0;
}

