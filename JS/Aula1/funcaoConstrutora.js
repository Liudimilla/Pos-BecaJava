var DadosPessoais = function (nome, idade) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = "masculino";
};

DadosPessoais.prototype.religiao = "cristao";

var fabio = new DadosPessoais("Fabio",20);
console.log(fabio);

var milla = {};
DadosPessoais.call(milla,"Liudimilla",39);

var osmar = {};
osmar._proto_ = DadosPessoais.prototype;
DadosPessoais.apply(osmar,["Osmar", 52]);
console.log(milla);
console.log(osmar);

