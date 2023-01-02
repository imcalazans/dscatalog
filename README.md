<h1>API Catalogação de produtos</h1>

<h2>
💻 API para catalogar produtos: </br>
</h2>
<p>
Cadastramento de produtos, com descrição, preço, URL de imagem e categoria.</br>
Cadastramento de Categoria de produtos.</br>
Cadastramento de Usuário com perfis de acesso diferentes através da geração do token Jwt.</br>
</p>


<h2>
⚙️ Tecnologias Utilizadas</br>
</h2>
<p>
O projeto foi criado com Spring Boot na linguagem de programação Java com BD H2 para teste,</br>
utilizando Spring Data JPA e o gerenciador de dependência Maven, validação com o javax </br>
validation e geração de token para controle de acesso com o JWT.</br>
</p>
<h2>
Arquitetura</br>
</h2>
<h3>
O projeto está divido nas seguintes camadas:</br>
</h3>
<ul>
<ol>main:</ol>
<ol>Entidade</ol>
<ol>Repositório</ol>
<ol>Serviço</ol>
<ol>Controle</ol>
<ol>DTO</ol>
<ol>Configurações</ol>
<ol>Exceção</ol>
<ol>Validação</ol>
<ol>Componentes</ol>
</ul>
<h2>
🚀 Como executarClonar o projeto</br>
</h2>
<h3>
🎲 Rodando o servidor</br>
</h3>
<h2>
Clone este repositório</br>
</h2>
<p>
$ git clone https://github.com/imcalazans/APIProduct-Store.git</br>
Configurar no aplication.properties a conexão do BD</br>
Executar no terminal o comando: mvn spring-boot:run</br>
Chamar os endpoint.</br>
</p>
<h2>
Como testar
</h2>
<p>
O sistema possui os endpoint abaixo:</br>

GET/products -> Devolve a lista de todos os produtos cadastrados no banco de dados.</br>
GET/products /{id} -> Devolve o produto cadastrado no banco de dados referente ao “id” escrito na requisição.</br>
GET/categories -> Devolve a lista de todas as categorias cadastradas no banco de dados.</br>
GET/categories /{id} -> Devolve a categoria cadastrada no banco de dados referente ao “id” escrito na requisição.</br>
GET/users -> Devolve a lista de todos os usuários cadastrados no banco de dados.</br>
GET/users /{id} -> Devolve o usuário cadastrado no banco de dados referente ao “id” escrito na requisição.</br>
POST/ users  -> Cadastra um novo usuário no banco de dados. Exemplo de corpo da requisição:</br>
{ "name": "Maria Brown", "email": "maria@gmail.com","phone": "988888888","password": "123456"}</br>
PUT/ users /{id} -> Atualiza os dados do usuário no banco de dados referente ao “id” escrito na requisição. {"name": "Alex Green", "email": "alex@gmail.com", "phone": "977777777",        "password": "123456"}</br>
DELETE/ users /{id} ->Deleta o dados do usuário no banco de dados referente ao “id” escrito na requisição. Não possui corpo na requisição </br>
POST/oauth/token -> Login de usuário que deve conter Username e Password para geração de token de acesso exemplo: Username: alex@gmail.com e Password: 123456.
</p>
