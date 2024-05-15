

var resposta = confirm("O site de receita FOODIT deseja acessar sua localização");

console.log(resposta);


function random (){
    document.getElementById("Conteudo").innerHTML = "<b>Bolo de Caneca<b>";
    document.getElementById("Ingredientes").innerHTML = "<p><b>Ingredientes</b></p><p>2 Banana nanica</p><p>1 Ovo</p><p>1 Colher de sopa de farelo de trigo</p><p>1 Colher de sopa de farelo de aveia</p><p>Canela em pó a gosto</p>";
    document.getElementById("Modo_preparo").innerHTML = "<p><b>Modo de Preparo:</b></p><p><ol><li>Amasse a banana com um garfo</li><li>Coloque a banana, o ovo e os farelos em uma caneca</li><li>Misture bem com um garfo até virar um creme lisinho</li><li>Leve ao microondas em potência alta por 3 minutos</li><li>Retire do microondas, polvilhe canela e sirva em seguida</li></ol></p>";
    document.getElementById("Curiosidades").innerHTML ="<h2>Você sabia?</h2><h3>O bolo é considerado um dos doces mais consumidos pelo Homem !</h3>";
    document.getElementById("Video").innerHTML = "<object width='425' height='340' data='https://www.youtube.com/v/_YHgJ_6xCIU'></object>";
}