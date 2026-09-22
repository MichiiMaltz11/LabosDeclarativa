:- [hechos].

lleva_arma_de_fuego(Persona) :-
    esta_armado_con(Persona, pistola).

lugar_es_peligroso(Lugar) :-
    (dificultad(Lugar, alta) ; dificultad(Lugar, muy_alta)),
    enemigo_aparece_en(Enemigo, Lugar),
    infectados_por(Enemigo, las_plagas).

pueden_encontrarse(Persona1, Persona2) :-
    esta_en(Persona1, Lugar),
    esta_en(Persona2, Lugar),
    Persona1 \= Persona2.

experto_en_combate_cercano(Persona) :-
    edad(Persona, Edad),
    Edad > 25,
    esta_armado_con(Persona, cuchillo). 