#include <stdlib.h>
#include "rect.h"

void main (void) {
    Rect* r1 = rect_new();
    rect_print(r1);

    Rect* r2 = rect_new();
    rect_drag(r2, 25,50);
    rect_print(r2);

    free(r1);
    free(r2);
}
