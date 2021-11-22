db.jogos.insertOne({
    nome: "Green Hell",
    genero: "Sobrevivência",
    plataforma: "PC",
    preço: "R$ 33,50"
})

db.jogos.insertMany([{
    nome: "Worms W.M.D",
    genero: "Estratégia",
    plataforma: "PC e Console",
    preço: "R$ 79,90"
},
{
    nome: "Worms Revolution",
    genero: "Estratégia",
    plataforma: "PC e Console",
    preço: "R$ 27,99"
},
{
    nome: "Worms Armageddon",
    genero: "Estratégia",
    plataforma: "PC e Console",
    preço: "R$ 27,99"
}])

db.jogos.insertOne({
    nome: "Sea of Thieves",
    genero: "Aventura",
    plataforma: "PC e Console",
    preço: "R$ 89,90"
})