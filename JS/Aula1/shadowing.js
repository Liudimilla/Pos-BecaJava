var family = {
pai: "francisco",
mae: "iris",
irma: "flavia",
irmao: "leandro",
};

delete family.irmao;

console.log(Object.keys(family));

for(var property in family) {
    console.log(property);
}