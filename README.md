# Topping
Uma aplicação simples que exibe valores obtidos de um Json

Json: https://sampletestingproject-4a8fc.web.app/teste.json

Utilizei LiveData para observar os dados e Retrofit para obter os dados da web

Classe MainRepository
Esta classe tem uma interfasse que é utilizada para obter os retornos da api.
Criei um modelos de mensagem e de erro ambos com um id para caso seja necessario apresentar uma mensagem ou realizar uma ação especifica
mas acabei por não implementar nenhuma ação, para tal.

Classe MainActivity
Normalmente eu uso essa classe como parent de todas as atividades dos meus projetos
ela contém algumas funções que são usadas por todo o app, como a bindViewModel e unBindViewModel

Retrofit
Eu já usei bastante Volley em meus projetos, mas por conta da forma que retrofit trabalha com suas interfases eu acredito que seja mais rapido para testes e desenvolvimento

Models
Criei duas classes que puxam valores do json, uma simples que contem os dados mais comuns do json, "id" e "type" e outra que uso para fazer o parse correto do json com o Gson do proprio retrofit, mesmo não usando todos os dados que foram parceados eu achei melhor mantelos, não ocupam muito na memoria do device, então tudo bem.

RecyclerView
Escolhi o recycler view por uma preferencia pessoal, mas sabendo que ele pode ajudar na questão de performance, mesmo sabendo que neste caso uma simples adapter e uma ListView resolveria bem. Como disse foi por uma questão de preferencia pessoal principalmente.

MergeToppingList
Uma classe que faz o trabalho principal dessa aplicação, ela junta todas as listas que vieram separadas em uma só. É bem simples, um for que verifica se tem uma lista de toppings e caso tenha adiciona em uma lista local e depois retorna.
