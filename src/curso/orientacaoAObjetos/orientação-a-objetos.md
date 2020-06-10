# Orientação a objetos

## Composição:
Uma aplicaçao é composta por classes que se relacionam e dependem entre si, para o funcionamento do produto final. A relação deve ser bem pensada para não termos um serviço muito ligado e difícil de fazer mudançãs e refatoração.

*   toSrting() - retorna o objeto em java em uma string.

## Encapsulamento: 
Analizar o que faz sentido uma classe conhecer da outra, o que precisa estar público (visível para todo mundo) e do que precisa ser privado. Por exemplo, no carro temos acesso à marcha, ao volante (publicos), mas não ao motor nem ao funcionamento interno do carro (privado). Se tudo estiver sempre visível, a comunicação entre classes e métodos fica mais complexa. Com o encapsulamento a ideia é que o uso fique da forma mais simplificada possível.

### Níveis de encapsulamento:
- public: nível menos restrito
- protected: visível no próprio pacote, na própria classe, e transmitido por herança para um outro pacote.
- package: default, visível dentro do mesmo pacote
- private: nível mais restrito
