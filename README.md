04:52

Esta atividade foi desenvolvida por Fabricio de Araujo Krull, do segundo ano do curso de Desenvolvimento de Sistemas - Articulação Medio-Superior, da Escola Técnica Bento Quirino,
em Campinas, como método avaliativo para o segundo bimestre letivo, na disciplina de Desenvolvimento de Sistemas, instruído pelo orientador e principal professor da matéria, Rafael Anderson Cruz.

A atividade tem o foco de avaliar o uso correto e criativo das ferramentas proporciadas pela biblioteca Swing, em Java.

1° Tópico, função de limpar: Apliquei uma lógica simples, que itera todos os JTextField da página principal (panel), e define o texto de cada um como um espaço vazio.
2° Tópico, função de confirmar cadastro: Agora, as coisas ficam ligeiramente mais complicadas. Quando todos os campos estiverem preenchidos, o usuário é capaz de utilizar tal função, que então,
exige que ele insira uma senha, que por sinal, é "Bagheera" (nome do meu cachorro), que caso esteja certa, então envia uma pequena janela confirmando o nome do usuário, que então, substitui o
anteriormente inserido (visto que ambos deveriam ser o mesmo, mas o segundo teria prioridade, pois foi o que realizou a autenticação), e também o nome da janela principal ("Formulário de <nome>").
3° Tópico, função de excluir: Tal operação só pode ser realizada caso e somente se o usuário estiver autenticado no momento, mesmo se o seu nome for inválido, como um espaço vazio, o usuário pode
estar autenticado (por exemplo, o usuário foi autenticado, e mais tarde apagou o nome do cadastro, e, sem salvar nenhuma alteração, excluiu-o).
Um detalhe é que, caso o usuário mude o nome via input (o campo de texto denominado 'Nome:'), e pressione Enter/Return (tecnicamente falando, o actionListener padrão), o nome da janela principal
é alterado para ("Formulário de <nome>"), assim como na autenticação, porém isso não o autentica.

Essa é a documentação do projeto até o momento.
