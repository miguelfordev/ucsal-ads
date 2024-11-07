/*Q1.Escreva um programa que exiba a mensagem “Olá, Mundo!” no console do navegador.*/
function questao1() {
    console.log("Olá, Mundo!");
    document.getElementById('resultado1').innerText = "Mensagem exibida no console: Olá, Mundo!";
}
/*Q2.Crie um programa que declare duas variáveis, nome e idade. Atribua valores a essas variáveis e,
em seguida, exiba uma frase no console usando essas variáveis. Exemplo de saída:
Meu nome é João e eu tenho 25 anos. */
function questao2() {
let nome = prompt("Seu nome: ");
let idade = prompt("Sua idade: ");
let frase = `Meu nome é ${nome} e eu tenho ${idade} anos.`;
console.log(frase);
document.getElementById('resultado2').innerText = frase;
}
/*Q3.Crie um programa que some, subtraia, mulƟplique e divida dois números. Exiba o resultado de
cada operação no console. */
function questao3() {
let n1 = parseInt(prompt("1º Número: "));
let n2 = parseInt(prompt("2º Número: "));
let soma = n1 + n2;
let sub = n1 - n2;
let mult = n1 * n2;
let div = n1 / n2;
let r = `Soma: ${soma}, Subtração: ${sub}, Multiplicação: ${mult}, Divisão: ${div}`;
console.log(r);
document.getElementById('resultado3').innerText = r;
}
/*Q4.Peça ao usuário para inserir três notas (usando prompt), calcule a média e exiba se o aluno foi
aprovado ou reprovado (a média para aprovação é 7).*/
function questao4() {
let n1 = parseFloat(prompt("Insira a primeira nota:"));
let n2 = parseFloat(prompt("Insira a segunda nota:"));
let n3 = parseFloat(prompt("Insira a terceira nota:"));
let media = (n1 + n2 + n3) / 3;
let estado = media >= 7 ? "aprovado" : "reprovado";
let r = `Sua média é ${media.toFixed(1)}. Você foi ${estado}.`;
console.log(r);
document.getElementById('resultado4').innerText = r;
}
/*Q5.Escreva um programa que peça ao usuário para inserir um número e verifique se ele é par ou
ímpar. Exiba o resultado no console.*/
function questao5() {
let n = parseInt(prompt("Insira um número:"));
let r = n % 2 === 0 ? "O número é par." : "O número é ímpar.";
console.log(r);
document.getElementById('resultado5').innerText = r;
}
/*Q6.Crie um programa que peça ao usuário para inserir a idade e, dependendo da idade, exiba no
console se ele é maior ou menor de idade.*/
function questao6() {
let idade = parseInt(prompt("Insira sua idade:"));
let r = idade >= 18 ? "Você é maior de idade." : "Você é menor de idade.";
console.log(r);
document.getElementById('resultado6').innerText = r;
}
/*Q7.Crie uma função chamada calculadora que receba dois números e uma operação (soma,
subtração, multiplicação ou divisão) e retorne o resultado da operação. Exiba o resultado no
console.*/
function questao7() {
let num1 = parseFloat(prompt("Insira o primeiro número:"));
let num2 = parseFloat(prompt("Insira o segundo número:"));
let operacao = parseInt(prompt("Digite a operação (1- Soma, 2-subtração, 3-multiplicação, 4-divisão):"));
function calculadora(n1, n2, op) {
    switch(op) {
        case 1: return n1 + n2;
        case 2: return n1 - n2;
        case 3: return n1 * n2;
        case 4: return n1 / n2;
        default: return "Operação inválida";
    }
}
let r = calculadora(num1, num2, operacao);
console.log(r);
document.getElementById('resultado7').innerText = `Resultado: ${r}`;
}
/*Q8.Crie um programa que solicite o nome do usuário e depois exiba no console o nome em letras
maiúsculas, em letras minúsculas e a quantidade de caracteres no nome. */
function questao8() {
let nome = prompt("Digite seu nome:");
let r = `Maiúsculas: ${nome.toUpperCase()}, Minúsculas: ${nome.toLowerCase()}, Quantidade de caracteres: ${nome.length}`;
console.log(r);
document.getElementById('resultado8').innerText = r;
}
/*Q9.Escreva um programa que faça uma contagem regressiva de 10 até 1 usando um loop for e exiba
cada número no console. */
function questao9() {
let r = "";
for (let i = 10; i >= 1; i--) {
    r += i + " ";
}
console.log(r.trim());
document.getElementById('resultado9').innerText = r;
}
/*Q10.Peça ao usuário para inserir um número e exiba a tabuada desse número (do 1 ao 10) usando
um loop for. */
function questao10() {
let numero = parseInt(prompt("Digite um número para mostrar sua tabuada:"));
let r = "";
for (let i = 1; i <= 10; i++) {
    r += `${numero} x ${i} = ${numero * i}\n`;
}
console.log(r);
document.getElementById('resultado10').innerText = r;
}
/*Q11.Crie um array com 5 nomes. Exiba cada nome no console utilizando um loop for ou forEach. */
function questao11() {
let nomes = new Array(5);
for(let i=0;i<nomes.length;i++){
    let nome = prompt(`Digite o ${i+1}º nome:`);
    nomes[i]=nome;
}
let r = nomes.join(", ");
console.log(r);
document.getElementById('resultado11').innerText = r;
}
/*Q12.Crie uma função que converta graus Celsius em Fahrenheit. A fórmula de conversão é: F = C *
9/5 + 32. Teste a função e exiba o resultado no console. */
function questao12() {
let celsius = parseFloat(prompt("Digite a temperatura em Celsius:"));
let fahrenheit = (celsius * 9/5) + 32;
let r = `${celsius}°C em Fahrenheit é ${fahrenheit}°F.`;
console.log(r);
document.getElementById('resultado12').innerText = r;
}
/*Q13.Crie um objeto chamado carro com as propriedades marca, modelo e ano. Exiba cada uma das
propriedades no console.*/
function questao13() {
let carro = new Object();
carro["marca"]=prompt("Digite a marca do carro:");
carro["modelo"]=prompt("Digite o modelo do carro:");
carro["ano"]=parseInt(prompt("Digite o ano do carro:"));
let r = `Marca: ${carro.marca}, Modelo: ${carro.modelo}, Ano: ${carro.ano}`;
console.log(r);
document.getElementById('resultado13').innerText = r;
}
/*Q14.Escreva uma função chamada maiorNumero que recebe dois números e retorna o maior deles.
Exiba o resultado no console. */
function questao14() {
let n1 = parseFloat(prompt("Digite o primeiro número:"));
let n2 = parseFloat(prompt("Digite o segundo número:"));
let maior = n1 > n2 ? n1 : n2;
let r = `O maior número é: ${maior}`;
console.log(r);
document.getElementById('resultado14').innerText = r;
}
/*Q15.Escreva um programa que conte de 1 até 10 usando um loop while e exiba cada número no
console. */
function questao15() {
let r = "";
let i = 1;
while (i <= 10) {
    r += i + " ";
    i++;
}
console.log(r.trim());
document.getElementById('resultado15').innerText = r;
}
/*Q16.Crie um programa que gere um número aleatório entre 1 e 100 e peça ao usuário para adivinhar
o número. O programa deve continuar até que o usuário acerte, dando dicas se o número
inserido é maior ou menor que o número sorteado.*/
function questao16() {
let numeroAleatorio = Math.floor(Math.random() * 100) + 1;
let chute;
let tentativas = 0;
do {
    chute = parseInt(prompt("Adivinhe o número entre 1 e 100:"));
    tentativas++;
    if (chute < numeroAleatorio) {
        alert("Tente um número maior.");
    } else if (chute > numeroAleatorio) {
        alert("Tente um número menor.");
    }
} while (chute !== numeroAleatorio);
let r = `Parabéns! Você acertou em ${tentativas} tentativas.`;
console.log(r);
document.getElementById('resultado16').innerText = r;
}
/*Q17.Crie uma função que receba uma string como parâmetro e retorne essa string ao contrário. Por
exemplo, ao receber "javascript", deve retornar "tpircsavaj". */
function questao17() {
let texto = prompt("Digite uma palavra ou frase para poder inventer:");
let invertido = texto.split("").reverse().join("");
let r = `Palavra/frase invertida: ${invertido}`;
console.log(r);
document.getElementById('resultado17').innerText = r;
}