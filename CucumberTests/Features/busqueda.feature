Feature: Buscar cucumber en google

Scenario: El usuario escribe la palabra cucumber en el buscador

	Given que me encuetro en la pagina "https://www.google.com/"
	When ingrso la palabra "cucumber" en el buscador 
	And le doy enter 
	Then se efectua la busqueda