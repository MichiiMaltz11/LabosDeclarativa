persona(leon).
persona(ashley).
persona(ada).
persona(luis).

agente(leon).
estudiante(ashley).
espia(ada).
investigador(luis).

edad(leon, 27).
edad(ashley, 20).
edad(ada, 26).
edad(luis, 32).

esta_armado_con(leon,pistola).
esta_armado_con(leon,cuchillo).
esta_armado_con(ada,pistola).
esta_armado_con(luis,cuchillo).

lugares(pueblo).
lugares(isla).  
lugares(castillo).

dificultad(pueblo,alta).
dificultad(isla,muy_alta).
dificultad(castillo,alta).

infectados_por(los_ganados,las_plagas).
infectados_por(los_regeneradores,las_plagas).

enemigo_aparece_en(los_ganados,pueblo).
enemigo_aparece_en(los_ganados,castillo).
enemigo_aparece_en(los_regeneradores,isla).

esta_en(leon,pueblo).
esta_en(luis,pueblo).
esta_en(ada,pueblo).
esta_en(ada,castillo).