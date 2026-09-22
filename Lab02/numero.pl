%caso base
suma(1, 1).

%regla recursiva
suma(N, R) :-
    N > 1,
    Y is N - 1,
    suma(Y, X),
    R is X + N.