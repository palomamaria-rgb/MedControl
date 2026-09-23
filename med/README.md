🏥 MedControl - Sistema de Controle de Medicamentos

O MedControl é um aplicativo desenvolvido em Java para auxiliar cuidadores na organização, agendamento e registro da administração de medicamentos de seus pacientes. O sistema visa trazer mais segurança e controle para a rotina de cuidados médicos.

## 🔒 Proteção e Segurança (Login)

Para garantir a privacidade dos dados médicos dos pacientes, o sistema conta com uma camada de proteção por login. O acesso só é liberado mediante credenciais válidas, permitindo até **3 tentativas** antes de bloquear o sistema.

* **Usuário:** admin
* **Senha padrão:** 1234

Se as tentativas se esgotarem, o programa exibe uma mensagem de acesso bloqueado e é encerrado automaticamente.

## ⚙️ Funcionalidades

* **Autenticação Segura:** Sistema de login com limite de esforço.
* **Cadastro de Pacientes e Cuidadores:** Vincula o responsável ao paciente atual.
* **Gerenciamento de Medicamentos:** Registro do nome do remédio, dosagem e horário planejado.
* **Confirmação de Administração:** Permite marcar se o medicamento foi tomado com sucesso ou não, atualizando o status em tempo real.
* **Loop de Cadastros:** Permite realizar múltiplas consultas em sequência sem precisar reiniciar o programa.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Paradigma:** Orientação a Objetos (Classes `Main`, `Pessoa`, `Cuidador` e `Medicamento`)
* **Entrada de Dados:** `java.util.Scanner`


