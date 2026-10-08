% Caso base: un numero menor a 10 es un solo digito
almacenar(N, [N]) :-
    N < 10, !.

% Caso recursivo: el ultimo numero va primero, luego se sigue con los que faltan
almacenar(N, [D|T]) :-
    D is N mod 10,
    N1 is N // 10,
    almacenar(N1, T).