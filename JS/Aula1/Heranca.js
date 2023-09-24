var homem = {
 sexo : "masculino"
};
var mulher = {
    sexo : "feminino"
   };
   var mae = {
    sexo : "feminino"
   };

   var adolescente = {
    sexo : "feminino"
   };

var joao = {
    nome: "Joao",
    altura: 1.90,
    idade: 20,
    _proto_: homem
};

var pedro = {
    nome: "Pedro",
    altura: 1.40,
    idade: 18,
    _proto_: homem
};

var milla = {
    nome: "Milla",
    altura: 1.67,
    idade: 32,
    _proto_: mulher
};



var manuela = {
    nome: "Manuela",
    altura: 1.10,
    idade:12,
}
Object.setPrototypeOf(manuela,adolescente);

var flavia = Object.create(mae);
flavia.nome = "Flavia",
flavia.idade = 40;


console.log(joao);
console.log(pedro);
console.log(milla);
console.log(manuela);
console.log(flavia);

