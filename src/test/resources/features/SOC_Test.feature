#language: pt
#encoding: UTF-8

Funcionalidade: Realizar busca e FAP no blog da SOC
Como um usuário 
Eu quero realizar uma busca e simular a FAP no blog da SOC
Para que eu possa encontrar o desejado e ter a estimativa FAP da empresa

@teste
Cenário: Deve realizar uma busca no blog da SOC
	Dado que o usuário acesse o blog da SOC
	E clica no botão Aceitar Cookies
	E preenche o campo Buscar
	Quando clica no botão Pesquisar
	Então o resultado da pesquisa deverá ser apresentado com sucesso

@teste
Cenário: Deve realizar cálculo do FAP
	Dado que o usuário acesse o blog da SOC
	E clica no botão Aceitar Cookies
	E clica no botão Soluções e Recursos
	Quando clica no botão FAP
	Então visualiza a página da FAP
	E preenche os dados do calculo do FAP
	Quando clica no botão Estimar FAP
	Então O calculo do FAP deverá ser apresentado com sucesso
	

	